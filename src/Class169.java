/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class169 {
	int anInt1728;
	Class_xa_Sub1 aClass_xa_Sub1_1729;
	int anInt1730;
	int anInt1731;
	int anInt1732;
	Class_ra_Sub3 aClass_ra_Sub3_1733;
	byte[] aByteArray1734;
	int anInt1735;
	Class164[][] aClass164ArrayArray1736;

	void method1799() {
		((Class169) this).aClass164ArrayArray1736 = (new Class164[((Class169) this).anInt1732][((Class169) this).anInt1731]);
		for (int i = 0; i < ((Class169) this).anInt1731; i++) {
			for (int i_0_ = 0; i_0_ < ((Class169) this).anInt1732; i_0_++) {
				((Class169) this).aClass164ArrayArray1736[i_0_][i] = new Class164(((Class169) this).aClass_ra_Sub3_1733, this, ((Class169) this).aClass_xa_Sub1_1729, i_0_, i, ((Class169) this).anInt1735, i_0_ * 128 + 1, i * 128 + 1);
				if (((Class164) (((Class169) this).aClass164ArrayArray1736[i_0_][i])).anInt1694 == 0)
					((Class169) this).aClass164ArrayArray1736[i_0_][i] = null;
			}
		}
	}

	void method1800(Class137 class137, int i, int i_1_, int i_2_, boolean[][] bools, boolean bool) {
		float f = 1.0F / (float) (((Class_ra_Sub3) ((Class169) this).aClass_ra_Sub3_1733).anInt8297 * 128);
		if (bool) {
			for (int i_3_ = 0; i_3_ < ((Class169) this).anInt1731; i_3_++) {
				int i_4_ = i_3_ << ((Class169) this).anInt1735;
				int i_5_ = i_3_ + 1 << ((Class169) this).anInt1735;
				for (int i_6_ = 0; i_6_ < ((Class169) this).anInt1732; i_6_++) {
					if (((Class169) this).aClass164ArrayArray1736[i_6_][i_3_] != null) {
						int i_7_ = i_6_ << ((Class169) this).anInt1735;
						int i_8_ = i_6_ + 1 << ((Class169) this).anInt1735;
						while_64_: for (int i_9_ = i_7_; i_9_ < i_8_; i_9_++) {
							if (i_9_ - i >= -i_2_ && i_9_ - i <= i_2_) {
								for (int i_10_ = i_4_; i_10_ < i_5_; i_10_++) {
									if (i_10_ - i_1_ >= -i_2_ && i_10_ - i_1_ <= i_2_ && (bools[i_9_ - i + i_2_][i_10_ - i_1_ + i_2_])) {
										class137.aClass233_1519.method2147(f, f, 1.0F, 1.0F);
										class137.aClass233_1519.aFloatArray2594[12] = (float) -i_6_;
										class137.aClass233_1519.aFloatArray2594[13] = (float) -i_3_;
										((Class169) this).aClass164ArrayArray1736[i_6_][i_3_].method1778(class137);
										break while_64_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[(((Class169) this).anInt1731 * ((Class169) this).anInt1732)];
			ByteBuffer bytebuffer = ((Class169) this).aClass_ra_Sub3_1733.aByteBuffer8216;
			bytebuffer.clear();
			int i_11_ = 0;
			for (int i_12_ = 0; i_12_ < ((Class169) this).anInt1731; i_12_++) {
				int i_13_ = i_12_ << ((Class169) this).anInt1735;
				int i_14_ = i_12_ + 1 << ((Class169) this).anInt1735;
				for (int i_15_ = 0; i_15_ < ((Class169) this).anInt1732; i_15_++) {
					Class164 class164 = (((Class169) this).aClass164ArrayArray1736[i_15_][i_12_]);
					int i_16_ = 0;
					if (class164 != null) {
						int i_17_ = i_15_ << ((Class169) this).anInt1735;
						int i_18_ = i_15_ + 1 << ((Class169) this).anInt1735;
						for (int i_19_ = i_13_; i_19_ < i_14_; i_19_++) {
							if (i_19_ - i_1_ >= -i_2_ && i_19_ - i_1_ <= i_2_) {
								int i_20_ = i_19_ * ((((Class169) this).aClass_xa_Sub1_1729.anInt6287) * -506105871) + i_17_;
								for (int i_21_ = i_17_; i_21_ < i_18_; i_21_++) {
									if (i_21_ - i >= -i_2_ && i_21_ - i <= i_2_ && (bools[i_21_ - i + i_2_][i_19_ - i_1_ + i_2_])) {
										short[] is_22_ = (((Class_xa_Sub1) (((Class169) this).aClass_xa_Sub1_1729)).aShortArrayArray8456[i_20_]);
										if (is_22_ != null) {
											for (int i_23_ = 0; i_23_ < is_22_.length; i_23_++) {
												bytebuffer.putShort(is_22_[i_23_]);
												i_16_++;
											}
										}
									}
									i_20_++;
								}
							}
						}
					}
					is[i_11_] = i_16_;
					i_11_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_24_ = bytebuffer.position();
				Interface7_Impl2 interface7_impl2 = ((Class169) this).aClass_ra_Sub3_1733.method5312(i_24_ / 2);
				interface7_impl2.method63(0, i_24_, (((Class169) this).aClass_ra_Sub3_1733.aLong8217));
				int i_25_ = 0;
				i_11_ = 0;
				for (int i_26_ = 0; i_26_ < ((Class169) this).anInt1731; i_26_++) {
					for (int i_27_ = 0; i_27_ < ((Class169) this).anInt1732; i_27_++) {
						if (is[i_11_] != 0) {
							class137.aClass233_1519.method2147(f, f, 1.0F, 1.0F);
							class137.aClass233_1519.aFloatArray2594[12] = (float) -i_27_;
							class137.aClass233_1519.aFloatArray2594[13] = (float) -i_26_;
							((Class169) this).aClass164ArrayArray1736[i_27_][i_26_].method1779(class137, interface7_impl2, i_25_, is[i_11_] / 3);
							i_25_ += is[i_11_];
						}
						i_11_++;
					}
				}
			}
		}
	}

	void method1801(Class_na class_na, int i, int i_28_) {
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		i += ((Class_na_Sub2) class_na_sub2).anInt10018 + 1;
		i_28_ += ((Class_na_Sub2) class_na_sub2).anInt10022 + 1;
		int i_29_ = i + i_28_ * ((Class169) this).anInt1730;
		int i_30_ = 0;
		int i_31_ = ((Class_na_Sub2) class_na_sub2).anInt10021;
		int i_32_ = ((Class_na_Sub2) class_na_sub2).anInt10019;
		int i_33_ = ((Class169) this).anInt1730 - i_32_;
		int i_34_ = 0;
		if (i_28_ <= 0) {
			int i_35_ = 1 - i_28_;
			i_31_ -= i_35_;
			i_30_ += i_35_ * i_32_;
			i_29_ += i_35_ * ((Class169) this).anInt1730;
			i_28_ = 1;
		}
		if (i_28_ + i_31_ >= ((Class169) this).anInt1728) {
			int i_36_ = i_28_ + i_31_ + 1 - ((Class169) this).anInt1728;
			i_31_ -= i_36_;
		}
		if (i <= 0) {
			int i_37_ = 1 - i;
			i_32_ -= i_37_;
			i_30_ += i_37_;
			i_29_ += i_37_;
			i_34_ += i_37_;
			i_33_ += i_37_;
			i = 1;
		}
		if (i + i_32_ >= ((Class169) this).anInt1730) {
			int i_38_ = i + i_32_ + 1 - ((Class169) this).anInt1730;
			i_32_ -= i_38_;
			i_34_ += i_38_;
			i_33_ += i_38_;
		}
		if (i_32_ > 0 && i_31_ > 0) {
			method1803(((Class169) this).aByteArray1734, ((Class_na_Sub2) class_na_sub2).aByteArray10020, i_30_, i_29_, i_32_, i_31_, i_33_, i_34_);
			method1802(i, i_28_, i_32_, i_31_);
		}
	}

	void method1802(int i, int i_39_, int i_40_, int i_41_) {
		if (((Class169) this).aClass164ArrayArray1736 != null) {
			int i_42_ = i - 1 >> 7;
			int i_43_ = i - 1 + i_40_ - 1 >> 7;
			int i_44_ = i_39_ - 1 >> 7;
			int i_45_ = i_39_ - 1 + i_41_ - 1 >> 7;
			for (int i_46_ = i_42_; i_46_ <= i_43_; i_46_++) {
				Class164[] class164s = ((Class169) this).aClass164ArrayArray1736[i_46_];
				for (int i_47_ = i_44_; i_47_ <= i_45_; i_47_++) {
					if (class164s[i_47_] != null)
						((Class164) class164s[i_47_]).aBoolean1692 = true;
				}
			}
		}
	}

	static final void method1803(byte[] is, byte[] is_48_, int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_) {
		int i_54_ = -(i_50_ >> 2);
		i_50_ = -(i_50_ & 0x3);
		for (int i_55_ = -i_51_; i_55_ < 0; i_55_++) {
			for (int i_56_ = i_54_; i_56_ < 0; i_56_++) {
				is[i_49_++] -= is_48_[i++];
				is[i_49_++] -= is_48_[i++];
				is[i_49_++] -= is_48_[i++];
				is[i_49_++] -= is_48_[i++];
			}
			for (int i_57_ = i_50_; i_57_ < 0; i_57_++)
				is[i_49_++] -= is_48_[i++];
			i_49_ += i_52_;
			i += i_53_;
		}
	}

	static final boolean method1804(byte[] is, int i, int i_58_, int i_59_, int i_60_, int i_61_) {
		int i_62_ = i_58_ % i_61_;
		int i_63_;
		if (i_62_ != 0)
			i_63_ = i_61_ - i_62_;
		else
			i_63_ = 0;
		int i_64_ = -((i_59_ + i_61_ - 1) / i_61_);
		int i_65_ = -((i_58_ + i_61_ - 1) / i_61_);
		for (int i_66_ = i_64_; i_66_ < 0; i_66_++) {
			for (int i_67_ = i_65_; i_67_ < 0; i_67_++) {
				if (is[i] == 0)
					return true;
				i += i_61_;
			}
			i -= i_63_;
			if (is[i - 1] == 0)
				return true;
			i += i_60_;
		}
		return false;
	}

	void method1805(Class_na class_na, int i, int i_68_) {
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		i += ((Class_na_Sub2) class_na_sub2).anInt10018 + 1;
		i_68_ += ((Class_na_Sub2) class_na_sub2).anInt10022 + 1;
		int i_69_ = i + i_68_ * ((Class169) this).anInt1730;
		int i_70_ = 0;
		int i_71_ = ((Class_na_Sub2) class_na_sub2).anInt10021;
		int i_72_ = ((Class_na_Sub2) class_na_sub2).anInt10019;
		int i_73_ = ((Class169) this).anInt1730 - i_72_;
		int i_74_ = 0;
		if (i_68_ <= 0) {
			int i_75_ = 1 - i_68_;
			i_71_ -= i_75_;
			i_70_ += i_75_ * i_72_;
			i_69_ += i_75_ * ((Class169) this).anInt1730;
			i_68_ = 1;
		}
		if (i_68_ + i_71_ >= ((Class169) this).anInt1728) {
			int i_76_ = i_68_ + i_71_ + 1 - ((Class169) this).anInt1728;
			i_71_ -= i_76_;
		}
		if (i <= 0) {
			int i_77_ = 1 - i;
			i_72_ -= i_77_;
			i_70_ += i_77_;
			i_69_ += i_77_;
			i_74_ += i_77_;
			i_73_ += i_77_;
			i = 1;
		}
		if (i + i_72_ >= ((Class169) this).anInt1730) {
			int i_78_ = i + i_72_ + 1 - ((Class169) this).anInt1730;
			i_72_ -= i_78_;
			i_74_ += i_78_;
			i_73_ += i_78_;
		}
		if (i_72_ > 0 && i_71_ > 0) {
			method1806(((Class169) this).aByteArray1734, ((Class_na_Sub2) class_na_sub2).aByteArray10020, i_70_, i_69_, i_72_, i_71_, i_73_, i_74_);
			method1802(i, i_68_, i_72_, i_71_);
		}
	}

	static final void method1806(byte[] is, byte[] is_79_, int i, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
		int i_85_ = -(i_81_ >> 2);
		i_81_ = -(i_81_ & 0x3);
		for (int i_86_ = -i_82_; i_86_ < 0; i_86_++) {
			for (int i_87_ = i_85_; i_87_ < 0; i_87_++) {
				is[i_80_++] += is_79_[i++];
				is[i_80_++] += is_79_[i++];
				is[i_80_++] += is_79_[i++];
				is[i_80_++] += is_79_[i++];
			}
			for (int i_88_ = i_81_; i_88_ < 0; i_88_++)
				is[i_80_++] += is_79_[i++];
			i_80_ += i_83_;
			i += i_84_;
		}
	}

	Class169(Class_ra_Sub3 class_ra_sub3, Class_xa_Sub1 class_xa_sub1) {
		((Class169) this).aClass_ra_Sub3_1733 = class_ra_sub3;
		((Class169) this).aClass_xa_Sub1_1729 = class_xa_sub1;
		((Class169) this).anInt1730 = 2 + ((((Class169) this).aClass_xa_Sub1_1729.anInt6287 * -506105871 * (((Class169) this).aClass_xa_Sub1_1729.anInt6288 * -1212653763)) >> (((Class_ra_Sub3) ((Class169) this).aClass_ra_Sub3_1733).anInt8313));
		((Class169) this).anInt1728 = 2 + ((((Class169) this).aClass_xa_Sub1_1729.anInt6286 * -1148794921 * (((Class169) this).aClass_xa_Sub1_1729.anInt6288 * -1212653763)) >> (((Class_ra_Sub3) ((Class169) this).aClass_ra_Sub3_1733).anInt8313));
		((Class169) this).aByteArray1734 = (new byte[((Class169) this).anInt1730 * ((Class169) this).anInt1728]);
		((Class169) this).anInt1735 = (7 + (((Class_ra_Sub3) ((Class169) this).aClass_ra_Sub3_1733).anInt8313) - (((Class169) this).aClass_xa_Sub1_1729.anInt6289 * -2137349879));
		((Class169) this).anInt1732 = (((Class169) this).aClass_xa_Sub1_1729.anInt6287 * -506105871 >> ((Class169) this).anInt1735);
		((Class169) this).anInt1731 = (((Class169) this).aClass_xa_Sub1_1729.anInt6286 * -1148794921 >> ((Class169) this).anInt1735);
	}

	boolean method1807(Class_na class_na, int i, int i_89_) {
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		i += ((Class_na_Sub2) class_na_sub2).anInt10018 + 1;
		i_89_ += ((Class_na_Sub2) class_na_sub2).anInt10022 + 1;
		int i_90_ = i + i_89_ * ((Class169) this).anInt1730;
		int i_91_ = ((Class_na_Sub2) class_na_sub2).anInt10021;
		int i_92_ = ((Class_na_Sub2) class_na_sub2).anInt10019;
		int i_93_ = ((Class169) this).anInt1730 - i_92_;
		if (i_89_ <= 0) {
			int i_94_ = 1 - i_89_;
			i_91_ -= i_94_;
			i_90_ += i_94_ * ((Class169) this).anInt1730;
			i_89_ = 1;
		}
		if (i_89_ + i_91_ >= ((Class169) this).anInt1728) {
			int i_95_ = i_89_ + i_91_ + 1 - ((Class169) this).anInt1728;
			i_91_ -= i_95_;
		}
		if (i <= 0) {
			int i_96_ = 1 - i;
			i_92_ -= i_96_;
			i_90_ += i_96_;
			i_93_ += i_96_;
			i = 1;
		}
		if (i + i_92_ >= ((Class169) this).anInt1730) {
			int i_97_ = i + i_92_ + 1 - ((Class169) this).anInt1730;
			i_92_ -= i_97_;
			i_93_ += i_97_;
		}
		if (i_92_ <= 0 || i_91_ <= 0)
			return false;
		int i_98_ = 8;
		i_93_ += (i_98_ - 1) * ((Class169) this).anInt1730;
		return method1804(((Class169) this).aByteArray1734, i_90_, i_92_, i_91_, i_93_, i_98_);
	}
}
