/* Class_xa_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_xa_Sub2 extends Class_xa {
	Class_ra_Sub1 aClass_ra_Sub1_8484;
	float aFloat8485;
	float aFloat8486;
	static boolean aBoolean8487 = false;
	static int anInt8488 = 4;
	static int anInt8489 = 1;
	static boolean aBoolean8490 = true;
	Class20[][] aClass20ArrayArray8491;
	int anInt8492;
	Class6[][] aClass6ArrayArray8493;
	Class13[][] aClass13ArrayArray8494;
	Class9[][] aClass9ArrayArray8495;
	static int anInt8496 = -1694498816;
	float aFloat8497;
	float aFloat8498;
	float aFloat8499;
	float aFloat8500;
	float aFloat8501;
	float aFloat8502;
	static int anInt8503 = 64;
	float aFloat8504;
	float aFloat8505;
	float aFloat8506;
	float aFloat8507;
	float aFloat8508;
	float aFloat8509;
	float aFloat8510;
	float aFloat8511;
	byte[][] aByteArrayArray8512;
	byte[][] aByteArrayArray8513;
	static boolean aBoolean8514 = true;
	Class17[][] aClass17ArrayArray8515;
	static int anInt8516 = 2;

	public void ad(Class_na class_na, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		/* empty */
	}

	public void LA(int i, int i_3_, int i_4_) {
		if (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_3_] < i_4_)
			((Class_xa_Sub2) this).aByteArrayArray8513[i][i_3_] = (byte) i_4_;
	}

	public void method6336(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, Class78 class78, boolean bool) {
		if (((Class_xa_Sub2) this).aClass20ArrayArray8491 == null) {
			((Class_xa_Sub2) this).aClass20ArrayArray8491 = new Class20[anInt6287 * -506105871][anInt6286 * -1148794921];
			((Class_xa_Sub2) this).aClass9ArrayArray8495 = new Class9[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			throw new IllegalStateException();
		boolean bool_16_ = false;
		if (is_12_.length == 2 && is_9_.length == 2 && (is_12_[0] == is_12_[1] || is_14_[0] != -1 && is_14_[0] == is_14_[1])) {
			bool_16_ = true;
			for (int i_17_ = 1; i_17_ < 2; i_17_++) {
				int i_18_ = is[is_9_[i_17_]];
				int i_19_ = is_7_[is_9_[i_17_]];
				if (i_18_ != 0 && i_18_ != anInt6288 * -1212653763 || i_19_ != 0 && i_19_ != anInt6288 * -1212653763) {
					bool_16_ = false;
					break;
				}
			}
		}
		if (!bool_16_) {
			Class9 class9 = new Class9();
			short i_20_ = (short) is.length;
			int i_21_ = (short) is_12_.length;
			((Class9) class9).aShort115 = i_20_;
			((Class9) class9).aShortArray121 = new short[i_20_];
			((Class9) class9).aShortArray118 = new short[i_20_];
			((Class9) class9).aShortArray119 = new short[i_20_];
			((Class9) class9).aShortArray120 = new short[i_20_];
			for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
				int i_23_ = is[i_22_];
				int i_24_ = is_7_[i_22_];
				if (i_23_ == 0 && i_24_ == 0)
					((Class9) class9).aShortArray121[i_22_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_5_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_5_]));
				else if (i_23_ == 0 && i_24_ == anInt6288 * -1212653763)
					((Class9) class9).aShortArray121[i_22_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_5_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_5_ + 1]));
				else if (i_23_ == anInt6288 * -1212653763 && i_24_ == anInt6288 * -1212653763)
					((Class9) class9).aShortArray121[i_22_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_5_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_5_ + 1]));
				else if (i_23_ == anInt6288 * -1212653763 && i_24_ == 0)
					((Class9) class9).aShortArray121[i_22_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_5_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_5_]));
				else {
					int i_25_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_5_] - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_5_])) * (anInt6288 * -1212653763 - i_23_) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_5_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_5_])) * i_23_);
					int i_26_ = (((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_5_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_5_ + 1])) * (anInt6288 * -1212653763 - i_23_) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_5_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_5_ + 1])) * i_23_);
					((Class9) class9).aShortArray121[i_22_] = (short) ((i_25_ * (anInt6288 * -1212653763 - i_24_) + i_26_ * i_24_) >> anInt6289 * 20267538);
				}
				int i_27_ = (i << anInt6289 * -2137349879) + i_23_;
				int i_28_ = (i_5_ << anInt6289 * -2137349879) + i_24_;
				((Class9) class9).aShortArray118[i_22_] = (short) i_23_;
				((Class9) class9).aShortArray120[i_22_] = (short) i_24_;
				((Class9) class9).aShortArray119[i_22_] = (short) (method6340(i_27_, i_28_, -1429601116) + (is_6_ != null ? is_6_[i_22_] : 0));
				if (((Class9) class9).aShortArray121[i_22_] < 2)
					((Class9) class9).aShortArray121[i_22_] = (short) 2;
			}
			boolean bool_29_ = false;
			int i_30_ = 0;
			for (int i_31_ = 0; i_31_ < i_21_; i_31_++) {
				if (is_12_[i_31_] >= 0 || is_13_ != null && is_13_[i_31_] >= 0)
					i_30_++;
				int i_32_ = is_14_[i_31_];
				if (i_32_ != -1) {
					Class53 class53 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_32_, 416661720);
					if (!class53.aBoolean524) {
						bool_29_ = true;
						if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
							((Class9) class9).aByte126 |= 0x4;
					}
				}
			}
			((Class9) class9).anIntArray127 = new int[i_30_];
			if (is_13_ != null)
				((Class9) class9).anIntArray128 = new int[i_30_];
			((Class9) class9).aShortArray122 = new short[i_30_];
			((Class9) class9).aShortArray117 = new short[i_30_];
			((Class9) class9).aShortArray124 = new short[i_30_];
			if (bool_29_) {
				((Class9) class9).aShortArray125 = new short[i_30_];
				((Class9) class9).aShortArray116 = new short[i_30_];
			}
			for (int i_33_ = 0; i_33_ < i_21_; i_33_++) {
				if (is_12_[i_33_] >= 0 || is_13_ != null && is_13_[i_33_] >= 0) {
					if (is_12_[i_33_] >= 0)
						((Class9) class9).anIntArray127[(((Class9) class9).aShort123)] = Class173.method1823(is_12_[i_33_], (byte) 0);
					else
						((Class9) class9).anIntArray127[(((Class9) class9).aShort123)] = -1;
					if (is_13_ != null) {
						if (is_13_[i_33_] != -1)
							((Class9) class9).anIntArray128[(((Class9) class9).aShort123)] = Class173.method1823(is_13_[i_33_], (byte) 0);
						else
							((Class9) class9).anIntArray128[(((Class9) class9).aShort123)] = -1;
					}
					((Class9) class9).aShortArray122[(((Class9) class9).aShort123)] = (short) is_9_[i_33_];
					((Class9) class9).aShortArray117[(((Class9) class9).aShort123)] = (short) is_10_[i_33_];
					((Class9) class9).aShortArray124[(((Class9) class9).aShort123)] = (short) is_11_[i_33_];
					if (bool_29_) {
						if (is_14_[i_33_] != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_14_[i_33_], 849589384).aBoolean524)) {
							((Class9) class9).aShortArray125[(((Class9) class9).aShort123)] = (short) is_14_[i_33_];
							((Class9) class9).aShortArray116[(((Class9) class9).aShort123)] = (short) is_15_[i_33_];
						} else
							((Class9) class9).aShortArray125[(((Class9) class9).aShort123)] = (short) -1;
					}
					((Class9) class9).aShort123++;
				}
			}
			((Class_xa_Sub2) this).aClass9ArrayArray8495[i][i_5_] = class9;
		} else if (is_12_[0] >= 0 || is_13_ != null && is_13_[0] >= 0) {
			Class20 class20 = new Class20();
			int i_34_ = is_12_[0];
			int i_35_ = is_14_[0];
			if (is_13_ != null) {
				((Class20) class20).anInt271 = Class195.method1873(Class173.method1823(is_13_[0], (byte) 0), ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_5_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_5_])), -952106382);
				if (i_34_ == -1)
					((Class20) class20).aByte268 |= 0x2;
			}
			if ((anIntArrayArray6290[i][i_5_] == anIntArrayArray6290[i + 1][i_5_]) && (anIntArrayArray6290[i][i_5_] == anIntArrayArray6290[i + 1][i_5_ + 1]) && (anIntArrayArray6290[i][i_5_] == anIntArrayArray6290[i][i_5_ + 1]))
				((Class20) class20).aByte268 |= 0x1;
			Class53 class53 = null;
			if (i_35_ != -1)
				class53 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_35_, 2110054256);
			if (class53 != null && (((Class20) class20).aByte268 & 0x2) == 0 && !class53.aBoolean524) {
				((Class20) class20).aShort272 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_5_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_5_]));
				((Class20) class20).aShort269 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_5_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_5_]));
				((Class20) class20).aShort270 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_5_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_5_ + 1]));
				((Class20) class20).aShort267 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_5_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_5_ + 1]));
				((Class20) class20).aShort273 = (short) i_35_;
				if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class20) class20).aByte268 |= 0x4;
			} else {
				short i_36_ = Class173.method1823(i_34_, (byte) 0);
				((Class20) class20).aShort272 = (short) Class195.method1873(i_36_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_5_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_5_])), -952106382);
				((Class20) class20).aShort269 = (short) Class195.method1873(i_36_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_5_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_5_])), -952106382);
				((Class20) class20).aShort270 = (short) Class195.method1873(i_36_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_5_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_5_ + 1])), -952106382);
				((Class20) class20).aShort267 = (short) Class195.method1873(i_36_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_5_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_5_ + 1])), -952106382);
				((Class20) class20).aShort273 = (short) -1;
			}
			((Class_xa_Sub2) this).aClass20ArrayArray8491[i][i_5_] = class20;
		}
	}

	boolean method6366(int i) {
		if ((((Class_xa_Sub2) this).anInt8492 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	static int method6367(int i, int i_37_) {
		int i_38_ = (i & 0xff0000) * i_37_ >> 23;
		if (i_38_ < 2)
			i_38_ = 2;
		else if (i_38_ > 253)
			i_38_ = 253;
		int i_39_ = (i & 0xff00) * i_37_ >> 15;
		if (i_39_ < 2)
			i_39_ = 2;
		else if (i_39_ > 253)
			i_39_ = 253;
		int i_40_ = (i & 0xff) * i_37_ >> 7;
		if (i_40_ < 2)
			i_40_ = 2;
		else if (i_40_ > 253)
			i_40_ = 253;
		return i_38_ << 16 | i_39_ << 8 | i_40_;
	}

	public void SA() {
		((Class_xa_Sub2) this).aByteArrayArray8512 = null;
		((Class_xa_Sub2) this).aByteArrayArray8513 = null;
	}

	public void method6335(int i, int i_41_, int[] is, int[] is_42_, int[] is_43_, int[] is_44_, int[] is_45_, int[] is_46_, int[] is_47_, int[] is_48_, Class78 class78, boolean bool) {
		boolean bool_49_ = (((Class_xa_Sub2) this).anInt8492 & 0x20) == 0;
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 == null && !bool_49_) {
			((Class_xa_Sub2) this).aClass6ArrayArray8493 = new Class6[anInt6287 * -506105871][anInt6286 * -1148794921];
			((Class_xa_Sub2) this).aClass13ArrayArray8494 = new Class13[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (((Class_xa_Sub2) this).aClass17ArrayArray8515 == null && bool_49_)
			((Class_xa_Sub2) this).aClass17ArrayArray8515 = new Class17[anInt6287 * -506105871][anInt6286 * -1148794921];
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_50_ = 0; i_50_ < is_45_.length; i_50_++) {
				if (is_45_[i_50_] == -1)
					is_45_[i_50_] = 0;
				else
					is_45_[i_50_] = (Class379.anIntArray4096[(Class173.method1823(is_45_[i_50_], (byte) 0) & 0xffff)]) << 8 | 0xff;
			}
			if (is_46_ != null) {
				for (int i_51_ = 0; i_51_ < is_46_.length; i_51_++) {
					if (is_46_[i_51_] == -1)
						is_46_[i_51_] = 0;
					else
						is_46_[i_51_] = (Class379.anIntArray4096[(Class173.method1823(is_46_[i_51_], (byte) 0) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_49_) {
				Class17 class17 = new Class17();
				((Class17) class17).aShort234 = (short) is.length;
				((Class17) class17).aShort236 = (short) (is.length / 3);
				((Class17) class17).aShortArray235 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray241 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray243 = new short[((Class17) class17).aShort234];
				((Class17) class17).anIntArray237 = new int[((Class17) class17).aShort234];
				((Class17) class17).aShortArray239 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray240 = new short[((Class17) class17).aShort234];
				((Class17) class17).aByteArray242 = new byte[((Class17) class17).aShort234];
				if (is_44_ != null)
					((Class17) class17).aShortArray238 = new short[((Class17) class17).aShort234];
				for (int i_52_ = 0; i_52_ < ((Class17) class17).aShort234; i_52_++) {
					int i_53_ = is[i_52_];
					int i_54_ = is_43_[i_52_];
					boolean bool_55_ = false;
					int i_56_;
					if (i_53_ == 0 && i_54_ == 0)
						i_56_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_]));
					else if (i_53_ == 0 && i_54_ == anInt6288 * -1212653763)
						i_56_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_ + 1]));
					else if (i_53_ == anInt6288 * -1212653763 && i_54_ == anInt6288 * -1212653763)
						i_56_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_ + 1]));
					else if (i_53_ == anInt6288 * -1212653763 && i_54_ == 0)
						i_56_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_]));
					else {
						int i_57_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_])) * (anInt6288 * -1212653763 - i_53_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_])) * i_53_);
						int i_58_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_ + 1])) * (anInt6288 * -1212653763 - i_53_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_ + 1])) * i_53_);
						i_56_ = (i_57_ * (anInt6288 * -1212653763 - i_54_) + i_58_ * i_54_) >> anInt6289 * 20267538;
					}
					int i_59_ = (i << anInt6289 * -2137349879) + i_53_;
					int i_60_ = (i_41_ << anInt6289 * -2137349879) + i_54_;
					((Class17) class17).aShortArray235[i_52_] = (short) i_53_;
					((Class17) class17).aShortArray243[i_52_] = (short) i_54_;
					((Class17) class17).aShortArray241[i_52_] = (short) (method6340(i_59_, i_60_, -1931764542) + (is_42_ != null ? is_42_[i_52_] : 0));
					if (i_56_ < 0)
						i_56_ = 0;
					if (is_45_[i_52_] == 0) {
						((Class17) class17).anIntArray237[i_52_] = 0;
						if (is_46_ != null)
							((Class17) class17).aByteArray242[i_52_] = (byte) i_56_;
					} else {
						int i_61_ = 0;
						if (is_44_ != null) {
							int i_62_ = (((Class17) class17).aShortArray238[i_52_] = (short) is_44_[i_52_]);
							if (class78.anInt725 * 1996750669 != 0) {
								i_61_ = 255 * i_62_ / (class78.anInt725 * 1996750669);
								if (i_61_ < 0)
									i_61_ = 0;
								else if (i_61_ > 255)
									i_61_ = 255;
							}
						}
						int i_63_ = -16777216;
						if (is_47_[i_52_] != -1 && method6366(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_47_[i_52_], 287759489).aByte529))
							i_63_ = -1694498816;
						((Class17) class17).anIntArray237[i_52_] = i_63_ | (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_52_] >> 8, i_56_), class78.anInt726 * -1212608691, i_61_, 1420703605));
						if (is_46_ != null)
							((Class17) class17).aByteArray242[i_52_] = (byte) i_56_;
					}
					((Class17) class17).aShortArray239[i_52_] = (short) is_47_[i_52_];
					((Class17) class17).aShortArray240[i_52_] = (short) is_48_[i_52_];
				}
				if (is_46_ != null)
					((Class17) class17).anIntArray233 = new int[((Class17) class17).aShort236];
				for (int i_64_ = 0; i_64_ < ((Class17) class17).aShort236; i_64_++) {
					int i_65_ = i_64_ * 3;
					if (is_46_ != null && is_46_[i_65_] != 0)
						((Class17) class17).anIntArray233[i_64_] = ~0xffffff | is_46_[i_65_] >> 8;
				}
				((Class_xa_Sub2) this).aClass17ArrayArray8515[i][i_41_] = class17;
			} else {
				boolean bool_66_ = true;
				int i_67_ = -1;
				int i_68_ = -1;
				int i_69_ = -1;
				int i_70_ = -1;
				if (is.length == 6) {
					for (int i_71_ = 0; i_71_ < 6; i_71_++) {
						if (is[i_71_] == 0 && is_43_[i_71_] == 0) {
							if (i_67_ != -1 && is_45_[i_67_] != is_45_[i_71_]) {
								bool_66_ = false;
								break;
							}
							i_67_ = i_71_;
						} else if (is[i_71_] == anInt6288 * -1212653763 && is_43_[i_71_] == 0) {
							if (i_68_ != -1 && is_45_[i_68_] != is_45_[i_71_]) {
								bool_66_ = false;
								break;
							}
							i_68_ = i_71_;
						} else if (is[i_71_] == anInt6288 * -1212653763 && (is_43_[i_71_] == anInt6288 * -1212653763)) {
							if (i_69_ != -1 && is_45_[i_69_] != is_45_[i_71_]) {
								bool_66_ = false;
								break;
							}
							i_69_ = i_71_;
						} else if (is[i_71_] == 0 && (is_43_[i_71_] == anInt6288 * -1212653763)) {
							if (i_70_ != -1 && is_45_[i_70_] != is_45_[i_71_]) {
								bool_66_ = false;
								break;
							}
							i_70_ = i_71_;
						}
					}
					if (i_67_ == -1 || i_68_ == -1 || i_69_ == -1 || i_70_ == -1)
						bool_66_ = false;
					if (bool_66_) {
						if (is_42_ != null) {
							for (int i_72_ = 0; i_72_ < 4; i_72_++) {
								if (is_42_[i_72_] != 0) {
									bool_66_ = false;
									break;
								}
							}
						}
						if (bool_66_) {
							for (int i_73_ = 1; i_73_ < 4; i_73_++) {
								if (is[i_73_] != is[0] && (is[i_73_] != is[0] + anInt6288 * -1212653763) && (is[i_73_] != is[0] - anInt6288 * -1212653763)) {
									bool_66_ = false;
									break;
								}
								if (is_43_[i_73_] != is_43_[0] && (is_43_[i_73_] != is_43_[0] + anInt6288 * -1212653763) && (is_43_[i_73_] != (is_43_[0] - anInt6288 * -1212653763))) {
									bool_66_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_66_ = false;
				if (bool_66_) {
					Class6 class6 = new Class6();
					int i_74_ = is_45_[0];
					int i_75_ = is_47_[0];
					if (is_46_ != null) {
						((Class6) class6).anInt90 = is_46_[0] >> 8;
						if (i_74_ == 0)
							((Class6) class6).aByte85 |= 0x2;
					} else if (i_74_ == 0)
						return;
					if ((anIntArrayArray6290[i][i_41_] == anIntArrayArray6290[i + 1][i_41_]) && (anIntArrayArray6290[i][i_41_] == anIntArrayArray6290[i + 1][i_41_ + 1]) && (anIntArrayArray6290[i][i_41_] == anIntArrayArray6290[i][i_41_ + 1]))
						((Class6) class6).aByte85 |= 0x1;
					if (i_75_ != -1 && (((Class6) class6).aByte85 & 0x2) == 0 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_75_, 285040637).aBoolean524)) {
						int i_76_;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_76_ = 255 * is_44_[i_67_] / (class78.anInt725 * 1996750669);
							if (i_76_ < 0)
								i_76_ = 0;
							else if (i_76_ > 255)
								i_76_ = 255;
						} else
							i_76_ = 0;
						((Class6) class6).anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_67_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_]))), class78.anInt726 * -1212608691, i_76_, 1805401631));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt82 |= (255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_])) << 25);
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_76_ = 255 * is_44_[i_68_] / (class78.anInt725 * 1996750669);
							if (i_76_ < 0)
								i_76_ = 0;
							else if (i_76_ > 255)
								i_76_ = 255;
						} else
							i_76_ = 0;
						((Class6) class6).anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_68_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_]))), class78.anInt726 * -1212608691, i_76_, 1836463174));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt83 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_])) << 25;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_76_ = 255 * is_44_[i_69_] / (class78.anInt725 * 1996750669);
							if (i_76_ < 0)
								i_76_ = 0;
							else if (i_76_ > 255)
								i_76_ = 255;
						} else
							i_76_ = 0;
						((Class6) class6).anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_69_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_ + 1]))), class78.anInt726 * -1212608691, i_76_, 1746783911));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt81 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_ + 1])) << 25;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_76_ = 255 * is_44_[i_70_] / (class78.anInt725 * 1996750669);
							if (i_76_ < 0)
								i_76_ = 0;
							else if (i_76_ > 255)
								i_76_ = 255;
						} else
							i_76_ = 0;
						((Class6) class6).anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_70_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_ + 1]))), class78.anInt726 * -1212608691, i_76_, 1813550716));
						((Class6) class6).aShort91 = (short) i_75_;
					} else {
						int i_77_;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_77_ = 255 * is_44_[i_67_] / (class78.anInt725 * 1996750669);
							if (i_77_ < 0)
								i_77_ = 0;
							else if (i_77_ > 255)
								i_77_ = 255;
						} else
							i_77_ = 0;
						((Class6) class6).anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_67_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_]))), class78.anInt726 * -1212608691, i_77_, 2101653274));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt82 |= (255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_])) << 25);
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_77_ = 255 * is_44_[i_68_] / (class78.anInt725 * 1996750669);
							if (i_77_ < 0)
								i_77_ = 0;
							else if (i_77_ > 255)
								i_77_ = 255;
						} else
							i_77_ = 0;
						((Class6) class6).anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_68_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_]))), class78.anInt726 * -1212608691, i_77_, 2112012401));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt83 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_])) << 25;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_77_ = 255 * is_44_[i_69_] / (class78.anInt725 * 1996750669);
							if (i_77_ < 0)
								i_77_ = 0;
							else if (i_77_ > 255)
								i_77_ = 255;
						} else
							i_77_ = 0;
						((Class6) class6).anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_69_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_ + 1]))), class78.anInt726 * -1212608691, i_77_, 1949068625));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt81 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_ + 1])) << 25;
						if (is_44_ != null && class78.anInt725 * 1996750669 != 0) {
							i_77_ = 255 * is_44_[i_70_] / (class78.anInt725 * 1996750669);
							if (i_77_ < 0)
								i_77_ = 0;
							else if (i_77_ > 255)
								i_77_ = 255;
						} else
							i_77_ = 0;
						((Class6) class6).anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_70_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_ + 1]))), class78.anInt726 * -1212608691, i_77_, 1419239335));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt89 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_ + 1])) << 25;
						((Class6) class6).aShort91 = (short) -1;
					}
					if (is_44_ != null) {
						((Class6) class6).aShort88 = (short) is_44_[i_69_];
						((Class6) class6).aShort86 = (short) is_44_[i_70_];
						((Class6) class6).aShort87 = (short) is_44_[i_68_];
						((Class6) class6).aShort84 = (short) is_44_[i_67_];
					}
					((Class_xa_Sub2) this).aClass6ArrayArray8493[i][i_41_] = class6;
				} else {
					Class13 class13 = new Class13();
					((Class13) class13).aShort158 = (short) is.length;
					((Class13) class13).aShort167 = (short) (is.length / 3);
					((Class13) class13).aShortArray157 = new short[((Class13) class13).aShort158];
					((Class13) class13).aShortArray161 = new short[((Class13) class13).aShort158];
					((Class13) class13).aShortArray162 = new short[((Class13) class13).aShort158];
					((Class13) class13).anIntArray164 = new int[((Class13) class13).aShort158];
					if (is_44_ != null)
						((Class13) class13).aShortArray165 = new short[((Class13) class13).aShort158];
					for (int i_78_ = 0; i_78_ < ((Class13) class13).aShort158; i_78_++) {
						int i_79_ = is[i_78_];
						int i_80_ = is_43_[i_78_];
						boolean bool_81_ = false;
						int i_82_;
						if (i_79_ == 0 && i_80_ == 0)
							i_82_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_]));
						else if (i_79_ == 0 && i_80_ == anInt6288 * -1212653763)
							i_82_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_ + 1]));
						else if (i_79_ == anInt6288 * -1212653763 && i_80_ == anInt6288 * -1212653763)
							i_82_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_ + 1]));
						else if (i_79_ == anInt6288 * -1212653763 && i_80_ == 0)
							i_82_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_]));
						else {
							int i_83_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_])) * (anInt6288 * -1212653763 - i_79_)) + (((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_])) * i_79_));
							int i_84_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_41_ + 1])) * (anInt6288 * -1212653763 - i_79_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_41_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_41_ + 1])) * i_79_);
							i_82_ = (i_83_ * (anInt6288 * -1212653763 - i_80_) + i_84_ * i_80_) >> anInt6289 * 20267538;
						}
						int i_85_ = (i << anInt6289 * -2137349879) + i_79_;
						int i_86_ = (i_41_ << anInt6289 * -2137349879) + i_80_;
						((Class13) class13).aShortArray157[i_78_] = (short) i_79_;
						((Class13) class13).aShortArray162[i_78_] = (short) i_80_;
						((Class13) class13).aShortArray161[i_78_] = (short) (method6340(i_85_, i_86_, -1382494062) + (is_42_ != null ? is_42_[i_78_] : 0));
						if (i_82_ < 0)
							i_82_ = 0;
						if (is_45_[i_78_] == 0) {
							if (is_46_ != null)
								((Class13) class13).anIntArray164[i_78_] = i_82_ << 25;
							else
								((Class13) class13).anIntArray164[i_78_] = 0;
						} else {
							int i_87_ = 0;
							if (is_44_ != null) {
								int i_88_ = (((Class13) class13).aShortArray165[i_78_] = (short) is_44_[i_78_]);
								if (class78.anInt725 * 1996750669 != 0) {
									i_87_ = 255 * i_88_ / (class78.anInt725 * 1996750669);
									if (i_87_ < 0)
										i_87_ = 0;
									else if (i_87_ > 255)
										i_87_ = 255;
								}
							}
							((Class13) class13).anIntArray164[i_78_] = (Class298_Sub32_Sub38.method3387(method6367(is_45_[i_78_] >> 8, i_82_), class78.anInt726 * -1212608691, i_87_, 1325895467));
							if (is_46_ != null)
								((Class13) class13).anIntArray164[i_78_] |= i_82_ << 25;
						}
					}
					boolean bool_89_ = false;
					for (int i_90_ = 0; i_90_ < ((Class13) class13).aShort167; i_90_++) {
						if (is_47_[i_90_ * 3] != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_47_[i_90_ * 3], 2143447780).aBoolean524))
							bool_89_ = true;
					}
					if (is_46_ != null)
						((Class13) class13).anIntArray163 = new int[((Class13) class13).aShort167];
					if (bool_89_) {
						((Class13) class13).aShortArray166 = new short[((Class13) class13).aShort167];
						((Class13) class13).aShortArray160 = new short[((Class13) class13).aShort167];
					}
					for (int i_91_ = 0; i_91_ < ((Class13) class13).aShort167; i_91_++) {
						int i_92_ = i_91_ * 3;
						if (is_46_ != null && is_46_[i_92_] != 0)
							((Class13) class13).anIntArray163[i_91_] = is_46_[i_92_] >> 8;
						if (bool_89_) {
							int i_93_ = i_92_ + 1;
							int i_94_ = i_93_ + 1;
							boolean bool_95_ = false;
							boolean bool_96_ = true;
							int i_97_ = is_47_[i_92_];
							if (i_97_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_97_, 983325299).aBoolean524))
								bool_96_ = false;
							else
								bool_95_ = true;
							i_97_ = is_47_[i_93_];
							if (i_97_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_97_, 474134304).aBoolean524))
								bool_96_ = false;
							else
								bool_95_ = true;
							i_97_ = is_47_[i_94_];
							if (i_97_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_97_, 1093441537).aBoolean524))
								bool_96_ = false;
							else
								bool_95_ = true;
							if (bool_96_) {
								((Class13) class13).aShortArray166[i_91_] = (short) i_97_;
								((Class13) class13).aShortArray160[i_91_] = (short) is_48_[i_92_];
							} else {
								if (bool_95_) {
									i_97_ = is_47_[i_92_];
									if (i_97_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_97_, 534720229).aBoolean524))
										((Class13) class13).anIntArray164[i_92_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_97_, 2084283479).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
									i_97_ = is_47_[i_93_];
									if (i_97_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_97_, 2025975294).aBoolean524))
										((Class13) class13).anIntArray164[i_93_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_97_, 537097363).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
									i_97_ = is_47_[i_94_];
									if (i_97_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_97_, 644933930).aBoolean524))
										((Class13) class13).anIntArray164[i_94_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_97_, 2115246212).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
								}
								((Class13) class13).aShortArray166[i_91_] = (short) -1;
							}
						}
					}
					((Class_xa_Sub2) this).aClass13ArrayArray8494[i][i_41_] = class13;
				}
			}
		}
	}

	void method6368(int i, int i_98_, int i_99_) {
		Class15 class15 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5202(Thread.currentThread());
		((Class2) ((Class15) class15).aClass2_192).anInt19 = 0;
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null)
			method6369(i, i_98_, ((Class15) class15).aBoolean186, class15, ((Class15) class15).aClass2_192, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181, ((Class15) class15).aFloatArray223, ((Class15) class15).aFloatArray221, ((Class15) class15).aFloatArray222, i_99_);
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			method6372(i, i_98_, ((Class15) class15).aClass2_192, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181, ((Class15) class15).aFloatArray223, ((Class15) class15).aFloatArray221, ((Class15) class15).aFloatArray222, i_99_);
		else if (((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			method6370(i, i_98_, ((Class15) class15).aBoolean186, class15, ((Class15) class15).aClass2_192, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181, ((Class15) class15).aFloatArray223, ((Class15) class15).aFloatArray221, ((Class15) class15).aFloatArray222, i_99_);
	}

	public void method6356(int i, int i_100_, int[] is, int[] is_101_, int[] is_102_, int[] is_103_, int[] is_104_, int[] is_105_, int[] is_106_, int[] is_107_, int[] is_108_, int[] is_109_, int[] is_110_, Class78 class78, boolean bool) {
		if (((Class_xa_Sub2) this).aClass20ArrayArray8491 == null) {
			((Class_xa_Sub2) this).aClass20ArrayArray8491 = new Class20[anInt6287 * -506105871][anInt6286 * -1148794921];
			((Class_xa_Sub2) this).aClass9ArrayArray8495 = new Class9[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			throw new IllegalStateException();
		boolean bool_111_ = false;
		if (is_107_.length == 2 && is_104_.length == 2 && (is_107_[0] == is_107_[1] || is_109_[0] != -1 && is_109_[0] == is_109_[1])) {
			bool_111_ = true;
			for (int i_112_ = 1; i_112_ < 2; i_112_++) {
				int i_113_ = is[is_104_[i_112_]];
				int i_114_ = is_102_[is_104_[i_112_]];
				if (i_113_ != 0 && i_113_ != anInt6288 * -1212653763 || i_114_ != 0 && i_114_ != anInt6288 * -1212653763) {
					bool_111_ = false;
					break;
				}
			}
		}
		if (!bool_111_) {
			Class9 class9 = new Class9();
			short i_115_ = (short) is.length;
			int i_116_ = (short) is_107_.length;
			((Class9) class9).aShort115 = i_115_;
			((Class9) class9).aShortArray121 = new short[i_115_];
			((Class9) class9).aShortArray118 = new short[i_115_];
			((Class9) class9).aShortArray119 = new short[i_115_];
			((Class9) class9).aShortArray120 = new short[i_115_];
			for (int i_117_ = 0; i_117_ < i_115_; i_117_++) {
				int i_118_ = is[i_117_];
				int i_119_ = is_102_[i_117_];
				if (i_118_ == 0 && i_119_ == 0)
					((Class9) class9).aShortArray121[i_117_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_100_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_100_]));
				else if (i_118_ == 0 && i_119_ == anInt6288 * -1212653763)
					((Class9) class9).aShortArray121[i_117_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_100_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_100_ + 1]));
				else if (i_118_ == anInt6288 * -1212653763 && i_119_ == anInt6288 * -1212653763)
					((Class9) class9).aShortArray121[i_117_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_100_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_100_ + 1]));
				else if (i_118_ == anInt6288 * -1212653763 && i_119_ == 0)
					((Class9) class9).aShortArray121[i_117_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_100_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_100_]));
				else {
					int i_120_ = (((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_100_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_100_])) * (anInt6288 * -1212653763 - i_118_) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_100_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_100_])) * i_118_);
					int i_121_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_100_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_100_ + 1])) * (anInt6288 * -1212653763 - i_118_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_100_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_100_ + 1])) * i_118_);
					((Class9) class9).aShortArray121[i_117_] = (short) ((i_120_ * (anInt6288 * -1212653763 - i_119_) + i_121_ * i_119_) >> anInt6289 * 20267538);
				}
				int i_122_ = (i << anInt6289 * -2137349879) + i_118_;
				int i_123_ = (i_100_ << anInt6289 * -2137349879) + i_119_;
				((Class9) class9).aShortArray118[i_117_] = (short) i_118_;
				((Class9) class9).aShortArray120[i_117_] = (short) i_119_;
				((Class9) class9).aShortArray119[i_117_] = (short) (method6340(i_122_, i_123_, -1605816038) + (is_101_ != null ? is_101_[i_117_] : 0));
				if (((Class9) class9).aShortArray121[i_117_] < 2)
					((Class9) class9).aShortArray121[i_117_] = (short) 2;
			}
			boolean bool_124_ = false;
			int i_125_ = 0;
			for (int i_126_ = 0; i_126_ < i_116_; i_126_++) {
				if (is_107_[i_126_] >= 0 || is_108_ != null && is_108_[i_126_] >= 0)
					i_125_++;
				int i_127_ = is_109_[i_126_];
				if (i_127_ != -1) {
					Class53 class53 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_127_, 115927744);
					if (!class53.aBoolean524) {
						bool_124_ = true;
						if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
							((Class9) class9).aByte126 |= 0x4;
					}
				}
			}
			((Class9) class9).anIntArray127 = new int[i_125_];
			if (is_108_ != null)
				((Class9) class9).anIntArray128 = new int[i_125_];
			((Class9) class9).aShortArray122 = new short[i_125_];
			((Class9) class9).aShortArray117 = new short[i_125_];
			((Class9) class9).aShortArray124 = new short[i_125_];
			if (bool_124_) {
				((Class9) class9).aShortArray125 = new short[i_125_];
				((Class9) class9).aShortArray116 = new short[i_125_];
			}
			for (int i_128_ = 0; i_128_ < i_116_; i_128_++) {
				if (is_107_[i_128_] >= 0 || is_108_ != null && is_108_[i_128_] >= 0) {
					if (is_107_[i_128_] >= 0)
						((Class9) class9).anIntArray127[(((Class9) class9).aShort123)] = Class173.method1823(is_107_[i_128_], (byte) 0);
					else
						((Class9) class9).anIntArray127[(((Class9) class9).aShort123)] = -1;
					if (is_108_ != null) {
						if (is_108_[i_128_] != -1)
							((Class9) class9).anIntArray128[(((Class9) class9).aShort123)] = Class173.method1823(is_108_[i_128_], (byte) 0);
						else
							((Class9) class9).anIntArray128[(((Class9) class9).aShort123)] = -1;
					}
					((Class9) class9).aShortArray122[(((Class9) class9).aShort123)] = (short) is_104_[i_128_];
					((Class9) class9).aShortArray117[(((Class9) class9).aShort123)] = (short) is_105_[i_128_];
					((Class9) class9).aShortArray124[(((Class9) class9).aShort123)] = (short) is_106_[i_128_];
					if (bool_124_) {
						if (is_109_[i_128_] != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_109_[i_128_], 965315960).aBoolean524)) {
							((Class9) class9).aShortArray125[(((Class9) class9).aShort123)] = (short) is_109_[i_128_];
							((Class9) class9).aShortArray116[(((Class9) class9).aShort123)] = (short) is_110_[i_128_];
						} else
							((Class9) class9).aShortArray125[(((Class9) class9).aShort123)] = (short) -1;
					}
					((Class9) class9).aShort123++;
				}
			}
			((Class_xa_Sub2) this).aClass9ArrayArray8495[i][i_100_] = class9;
		} else if (is_107_[0] >= 0 || is_108_ != null && is_108_[0] >= 0) {
			Class20 class20 = new Class20();
			int i_129_ = is_107_[0];
			int i_130_ = is_109_[0];
			if (is_108_ != null) {
				((Class20) class20).anInt271 = Class195.method1873(Class173.method1823(is_108_[0], (byte) 0), ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_100_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_100_])), -952106382);
				if (i_129_ == -1)
					((Class20) class20).aByte268 |= 0x2;
			}
			if ((anIntArrayArray6290[i][i_100_] == anIntArrayArray6290[i + 1][i_100_]) && (anIntArrayArray6290[i][i_100_] == anIntArrayArray6290[i + 1][i_100_ + 1]) && (anIntArrayArray6290[i][i_100_] == anIntArrayArray6290[i][i_100_ + 1]))
				((Class20) class20).aByte268 |= 0x1;
			Class53 class53 = null;
			if (i_130_ != -1)
				class53 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_130_, 723351718);
			if (class53 != null && (((Class20) class20).aByte268 & 0x2) == 0 && !class53.aBoolean524) {
				((Class20) class20).aShort272 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_100_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_100_]));
				((Class20) class20).aShort269 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_100_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_100_]));
				((Class20) class20).aShort270 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_100_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_100_ + 1]));
				((Class20) class20).aShort267 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_100_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_100_ + 1]));
				((Class20) class20).aShort273 = (short) i_130_;
				if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class20) class20).aByte268 |= 0x4;
			} else {
				short i_131_ = Class173.method1823(i_129_, (byte) 0);
				((Class20) class20).aShort272 = (short) Class195.method1873(i_131_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_100_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_100_])), -952106382);
				((Class20) class20).aShort269 = (short) Class195.method1873(i_131_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_100_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_100_])), -952106382);
				((Class20) class20).aShort270 = (short) Class195.method1873(i_131_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_100_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_100_ + 1])), -952106382);
				((Class20) class20).aShort267 = (short) Class195.method1873(i_131_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_100_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_100_ + 1])), -952106382);
				((Class20) class20).aShort273 = (short) -1;
			}
			((Class_xa_Sub2) this).aClass20ArrayArray8491[i][i_100_] = class20;
		}
	}

	void method6369(int i, int i_132_, boolean bool, Class15 class15, Class2 class2, float[] fs, float[] fs_133_, float[] fs_134_, float[] fs_135_, float[] fs_136_, int i_137_) {
		Class6 class6 = ((Class_xa_Sub2) this).aClass6ArrayArray8493[i][i_132_];
		if (class6 != null) {
			if ((((Class6) class6).aByte85 & 0x2) == 0) {
				if (i_137_ != 0) {
					if ((((Class6) class6).aByte85 & 0x4) != 0) {
						if ((i_137_ & 0x1) != 0)
							return;
					} else if ((i_137_ & 0x2) != 0)
						return;
				}
				int i_138_ = i * (anInt6288 * -1212653763);
				int i_139_ = i_138_ + anInt6288 * -1212653763;
				int i_140_ = i_132_ * (anInt6288 * -1212653763);
				int i_141_ = i_140_ + anInt6288 * -1212653763;
				float f = 0.0F;
				float f_142_ = 0.0F;
				float f_143_ = 0.0F;
				float f_144_ = 0.0F;
				float f_145_;
				float f_146_;
				float f_147_;
				float f_148_;
				float f_149_;
				float f_150_;
				float f_151_;
				float f_152_;
				float f_153_;
				float f_154_;
				float f_155_;
				float f_156_;
				float f_157_;
				float f_158_;
				float f_159_;
				float f_160_;
				if ((((Class6) class6).aByte85 & 0x1) != 0 && !bool) {
					int i_161_ = anIntArrayArray6290[i][i_132_];
					float f_162_ = ((Class_xa_Sub2) this).aFloat8502 * (float) i_161_;
					float f_163_ = ((Class_xa_Sub2) this).aFloat8486 * (float) i_161_;
					float f_164_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_138_) + f_162_ + (((Class_xa_Sub2) this).aFloat8506 * (float) i_140_)));
					f_145_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_138_) + f_163_ + (((Class_xa_Sub2) this).aFloat8507 * (float) i_140_)));
					if (f_164_ < -f_145_)
						return;
					float f_165_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_139_) + f_162_ + (((Class_xa_Sub2) this).aFloat8506 * (float) i_140_)));
					f_146_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_139_) + f_163_ + (((Class_xa_Sub2) this).aFloat8507 * (float) i_140_)));
					if (f_165_ < -f_146_)
						return;
					float f_166_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_139_) + f_162_ + (((Class_xa_Sub2) this).aFloat8506 * (float) i_141_)));
					f_147_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_139_) + f_163_ + (((Class_xa_Sub2) this).aFloat8507 * (float) i_141_)));
					if (f_166_ < -f_147_)
						return;
					float f_167_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_138_) + f_162_ + (((Class_xa_Sub2) this).aFloat8506 * (float) i_141_)));
					f_148_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_138_) + f_163_ + (((Class_xa_Sub2) this).aFloat8507 * (float) i_141_)));
					if (f_167_ < -f_148_)
						return;
					f_149_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_164_ / f_145_);
					f_150_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_165_ / f_146_);
					f_151_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_166_ / f_147_);
					f_152_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_167_ / f_148_);
					if (((Class15) class15).aBoolean216) {
						float f_168_ = f_164_ - ((Class15) class15).aFloat205;
						if (f_168_ > 0.0F) {
							f = f_168_ / ((Class15) class15).aFloat183;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_168_ = f_165_ - ((Class15) class15).aFloat205;
						if (f_168_ > 0.0F) {
							f_142_ = f_168_ / ((Class15) class15).aFloat183;
							if (f_142_ > 1.0F)
								f_142_ = 1.0F;
						}
						f_168_ = f_166_ - ((Class15) class15).aFloat205;
						if (f_168_ > 0.0F) {
							f_143_ = f_168_ / ((Class15) class15).aFloat183;
							if (f_143_ > 1.0F)
								f_143_ = 1.0F;
						}
						f_168_ = f_167_ - ((Class15) class15).aFloat205;
						if (f_168_ > 0.0F) {
							f_144_ = f_168_ / ((Class15) class15).aFloat183;
							if (f_144_ > 1.0F)
								f_144_ = 1.0F;
						}
					}
					float f_169_ = ((Class_xa_Sub2) this).aFloat8500 * (float) i_161_;
					float f_170_ = ((Class_xa_Sub2) this).aFloat8501 * (float) i_161_;
					float f_171_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_138_) + f_169_ + (((Class_xa_Sub2) this).aFloat8504 * (float) i_140_)));
					f_153_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_171_ / f_145_);
					float f_172_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_138_) + f_170_ + (((Class_xa_Sub2) this).aFloat8505 * (float) i_140_)));
					f_154_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_172_ / f_145_);
					float f_173_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_139_) + f_169_ + (((Class_xa_Sub2) this).aFloat8504 * (float) i_140_)));
					f_155_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_173_ / f_146_);
					float f_174_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_139_) + f_170_ + (((Class_xa_Sub2) this).aFloat8505 * (float) i_140_)));
					f_156_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_174_ / f_146_);
					float f_175_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_139_) + f_169_ + (((Class_xa_Sub2) this).aFloat8504 * (float) i_141_)));
					f_157_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_175_ / f_147_);
					float f_176_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_139_) + f_170_ + (((Class_xa_Sub2) this).aFloat8505 * (float) i_141_)));
					f_158_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_176_ / f_147_);
					float f_177_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_138_) + f_169_ + (((Class_xa_Sub2) this).aFloat8504 * (float) i_141_)));
					f_159_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_177_ / f_148_);
					float f_178_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_138_) + f_170_ + (((Class_xa_Sub2) this).aFloat8505 * (float) i_141_)));
					f_160_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_178_ / f_148_);
				} else {
					int i_179_ = anIntArrayArray6290[i][i_132_];
					int i_180_ = anIntArrayArray6290[i + 1][i_132_];
					int i_181_ = anIntArrayArray6290[i + 1][i_132_ + 1];
					int i_182_ = anIntArrayArray6290[i][i_132_ + 1];
					float f_183_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_138_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_179_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_140_)));
					f_145_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_138_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_179_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_140_)));
					if (f_183_ < -f_145_)
						return;
					float f_184_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_139_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_180_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_140_)));
					f_146_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_139_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_180_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_140_)));
					if (f_184_ < -f_146_)
						return;
					float f_185_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_139_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_181_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_141_)));
					f_147_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_139_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_181_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_141_)));
					if (f_185_ < -f_147_)
						return;
					float f_186_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_138_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_182_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_141_)));
					f_148_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_138_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_182_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_141_)));
					if (f_186_ < -f_148_)
						return;
					f_149_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_183_ / f_145_);
					f_150_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_184_ / f_146_);
					f_151_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_185_ / f_147_);
					f_152_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_186_ / f_148_);
					if (bool) {
						float f_187_ = f_183_ - ((Class15) class15).aFloat205;
						if (f_187_ > 0.0F) {
							f_187_ /= ((Class15) class15).aFloat183;
							if (f_187_ > 1.0F)
								f_187_ = 1.0F;
							f = f_187_;
							int i_188_ = (int) ((float) ((Class6) class6).aShort84 * f_187_);
							if (i_188_ > 0)
								i_179_ -= i_188_;
						}
						f_187_ = f_184_ - ((Class15) class15).aFloat205;
						if (f_187_ > 0.0F) {
							f_187_ /= ((Class15) class15).aFloat183;
							if (f_187_ > 1.0F)
								f_187_ = 1.0F;
							f_142_ = f_187_;
							int i_189_ = (int) ((float) ((Class6) class6).aShort87 * f_187_);
							if (i_189_ > 0)
								i_180_ -= i_189_;
						}
						f_187_ = f_185_ - ((Class15) class15).aFloat205;
						if (f_187_ > 0.0F) {
							f_187_ /= ((Class15) class15).aFloat183;
							if (f_187_ > 1.0F)
								f_187_ = 1.0F;
							f_143_ = f_187_;
							int i_190_ = (int) ((float) ((Class6) class6).aShort88 * f_187_);
							if (i_190_ > 0)
								i_181_ -= i_190_;
						}
						f_187_ = f_186_ - ((Class15) class15).aFloat205;
						if (f_187_ > 0.0F) {
							f_187_ /= ((Class15) class15).aFloat183;
							if (f_187_ > 1.0F)
								f_187_ = 1.0F;
							f_144_ = f_187_;
							int i_191_ = (int) ((float) ((Class6) class6).aShort86 * f_187_);
							if (i_191_ > 0)
								i_182_ -= i_191_;
						}
					} else if (((Class15) class15).aBoolean216) {
						float f_192_ = f_183_ - ((Class15) class15).aFloat205;
						if (f_192_ > 0.0F) {
							f = f_192_ / ((Class15) class15).aFloat183;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_192_ = f_184_ - ((Class15) class15).aFloat205;
						if (f_192_ > 0.0F) {
							f_142_ = f_192_ / ((Class15) class15).aFloat183;
							if (f_142_ > 1.0F)
								f_142_ = 1.0F;
						}
						f_192_ = f_185_ - ((Class15) class15).aFloat205;
						if (f_192_ > 0.0F) {
							f_143_ = f_192_ / ((Class15) class15).aFloat183;
							if (f_143_ > 1.0F)
								f_143_ = 1.0F;
						}
						f_192_ = f_186_ - ((Class15) class15).aFloat205;
						if (f_192_ > 0.0F) {
							f_144_ = f_192_ / ((Class15) class15).aFloat183;
							if (f_144_ > 1.0F)
								f_144_ = 1.0F;
						}
					}
					float f_193_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_138_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_179_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_140_)));
					f_153_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_193_ / f_145_);
					float f_194_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_138_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_179_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_140_)));
					f_154_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_194_ / f_145_);
					float f_195_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_139_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_180_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_140_)));
					f_155_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_195_ / f_146_);
					float f_196_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_139_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_180_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_140_)));
					f_156_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_196_ / f_146_);
					float f_197_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_139_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_181_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_141_)));
					f_157_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_197_ / f_147_);
					float f_198_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_139_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_181_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_141_)));
					f_158_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_198_ / f_147_);
					float f_199_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_138_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_182_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_141_)));
					f_159_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_199_ / f_148_);
					float f_200_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_138_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_182_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_141_)));
					f_160_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_200_ / f_148_);
				}
				boolean bool_201_ = (((Class6) class6).aShort91 != -1 && method6366(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(((Class6) class6).aShort91, 2063434356).aByte529));
				float f_202_ = f_142_ + f_143_ + f_144_;
				if (((f_157_ - f_159_) * (f_156_ - f_160_) - (f_158_ - f_160_) * (f_155_ - f_159_)) > 0.0F) {
					((Class2) class2).aBoolean20 = (f_157_ < 0.0F || f_159_ < 0.0F || f_155_ < 0.0F || f_157_ > (float) ((Class2) class2).anInt22 || f_159_ > (float) ((Class2) class2).anInt22 || f_155_ > (float) ((Class2) class2).anInt22);
					if (f_202_ < 3.0F) {
						if (f_202_ > 0.0F) {
							if (((Class6) class6).aShort91 >= 0) {
								int i_203_ = -16777216;
								if (bool_201_)
									i_203_ = -1694498816;
								class2.method290(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, f_147_, f_148_, f_146_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, (i_203_ | ((Class6) class6).anInt81 & 0xffffff), (i_203_ | ((Class6) class6).anInt89 & 0xffffff), (i_203_ | ((Class6) class6).anInt83 & 0xffffff), ((Class15) class15).anInt184 * 688695183, f_143_ * 255.0F, f_144_ * 255.0F, f_142_ * 255.0F, ((Class6) class6).aShort91);
							} else {
								if (bool_201_)
									((Class2) class2).anInt19 = 100;
								class2.method292(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, Class58.method692((((Class6) class6).anInt81), ((int) (f_143_ * 255.0F) << 24 | ((((Class15) class15).anInt184) * 688695183)), 1183249329), Class58.method692((((Class6) class6).anInt89), ((int) (f_144_ * 255.0F) << 24 | ((((Class15) class15).anInt184) * 688695183)), 1625753097),
										Class58.method692((((Class6) class6).anInt83), ((int) (f_142_ * 255.0F) << 24 | ((((Class15) class15).anInt184) * 688695183)), 1260334891));
								((Class2) class2).anInt19 = 0;
							}
						} else if (((Class6) class6).aShort91 >= 0) {
							int i_204_ = -16777216;
							if (bool_201_)
								i_204_ = -1694498816;
							class2.method290(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, f_147_, f_148_, f_146_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_204_ | ((Class6) class6).anInt81 & 0xffffff, i_204_ | ((Class6) class6).anInt89 & 0xffffff, i_204_ | ((Class6) class6).anInt83 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, ((Class6) class6).aShort91);
						} else {
							if (bool_201_)
								((Class2) class2).anInt19 = 100;
							class2.method292(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, ((Class6) class6).anInt81, ((Class6) class6).anInt89, ((Class6) class6).anInt83);
							((Class2) class2).anInt19 = 0;
						}
					} else
						class2.method293(true, true, false, f_158_, f_160_, f_156_, f_157_, f_159_, f_155_, f_151_, f_152_, f_150_, (((Class15) class15).anInt184 * 688695183));
				}
				f_202_ = f + f_142_ + f_144_;
				if (((f_153_ - f_155_) * (f_160_ - f_156_) - (f_154_ - f_156_) * (f_159_ - f_155_)) > 0.0F) {
					((Class2) class2).aBoolean20 = (f_153_ < 0.0F || f_155_ < 0.0F || f_159_ < 0.0F || f_153_ > (float) ((Class2) class2).anInt22 || f_155_ > (float) ((Class2) class2).anInt22 || f_159_ > (float) ((Class2) class2).anInt22);
					if (f_202_ < 3.0F) {
						if (bool_201_)
							((Class2) class2).anInt19 = -1694498816;
						if (f_202_ > 0.0F) {
							if (((Class6) class6).aShort91 >= 0) {
								int i_205_ = -16777216;
								if (bool_201_)
									i_205_ = -1694498816;
								class2.method290(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, f_145_, f_146_, f_148_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, (i_205_ | ((Class6) class6).anInt82 & 0xffffff), (i_205_ | ((Class6) class6).anInt83 & 0xffffff), (i_205_ | ((Class6) class6).anInt89 & 0xffffff), ((Class15) class15).anInt184 * 688695183, f * 255.0F, f_142_ * 255.0F, f_144_ * 255.0F, ((Class6) class6).aShort91);
							} else {
								if (bool_201_)
									((Class2) class2).anInt19 = 100;
								class2.method292(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, Class58.method692((((Class6) class6).anInt82), (((int) (f * 255.0F) << 24) | ((((Class15) class15).anInt184) * 688695183)), -865428811), Class58.method692((((Class6) class6).anInt83), ((int) (f_142_ * 255.0F) << 24 | ((((Class15) class15).anInt184) * 688695183)), 555680362),
										Class58.method692((((Class6) class6).anInt89), ((int) (f_144_ * 255.0F) << 24 | ((((Class15) class15).anInt184) * 688695183)), -466486142));
								((Class2) class2).anInt19 = 0;
							}
						} else if (((Class6) class6).aShort91 >= 0) {
							int i_206_ = -16777216;
							if (bool_201_)
								i_206_ = -1694498816;
							class2.method290(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, f_145_, f_146_, f_148_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_206_ | ((Class6) class6).anInt82 & 0xffffff, i_206_ | ((Class6) class6).anInt83 & 0xffffff, i_206_ | ((Class6) class6).anInt89 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, ((Class6) class6).aShort91);
						} else {
							if (bool_201_)
								((Class2) class2).anInt19 = 100;
							class2.method292(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, ((Class6) class6).anInt82, ((Class6) class6).anInt83, ((Class6) class6).anInt89);
							((Class2) class2).anInt19 = 0;
						}
					} else
						class2.method293(true, true, false, f_154_, f_156_, f_160_, f_153_, f_155_, f_159_, f_149_, f_150_, f_152_, (((Class15) class15).anInt184 * 688695183));
				}
			}
		} else {
			Class13 class13 = ((Class_xa_Sub2) this).aClass13ArrayArray8494[i][i_132_];
			if (class13 != null) {
				if (i_137_ != 0) {
					if ((((Class13) class13).aByte159 & 0x4) != 0) {
						if ((i_137_ & 0x1) != 0)
							return;
					} else if ((i_137_ & 0x2) != 0)
						return;
				}
				for (int i_207_ = 0; i_207_ < ((Class13) class13).aShort158; i_207_++) {
					int i_208_ = (((Class13) class13).aShortArray157[i_207_] + (i << anInt6289 * -2137349879));
					int i_209_ = ((Class13) class13).aShortArray161[i_207_];
					int i_210_ = (((Class13) class13).aShortArray162[i_207_] + (i_132_ << anInt6289 * -2137349879));
					float f = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_208_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_209_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_210_)));
					float f_211_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_208_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_209_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_210_)));
					if (f < -f_211_)
						return;
					float f_212_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f / f_211_);
					fs_136_[i_207_] = 0.0F;
					if (bool) {
						float f_213_ = f - ((Class15) class15).aFloat205;
						if (f_213_ > 0.0F) {
							f_213_ /= ((Class15) class15).aFloat183;
							if (f_213_ > 1.0F)
								f_213_ = 1.0F;
							fs_136_[i_207_] = f_213_;
							int i_214_ = (int) ((float) (((Class13) class13).aShortArray165[i_207_]) * f_213_);
							if (i_214_ > 0)
								i_209_ -= i_214_;
						}
					} else if (((Class15) class15).aBoolean216) {
						float f_215_ = f - ((Class15) class15).aFloat205;
						if (f_215_ > 0.0F) {
							fs_136_[i_207_] = f_215_ / ((Class15) class15).aFloat183;
							if (fs_136_[i_207_] > 1.0F)
								fs_136_[i_207_] = 1.0F;
						}
					}
					float f_216_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_208_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_209_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_210_)));
					float f_217_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_208_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_209_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_210_)));
					fs[i_207_] = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_216_ / f_211_);
					fs_133_[i_207_] = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_217_ / f_211_);
					fs_134_[i_207_] = f_212_;
					fs_135_[i_207_] = f_211_;
				}
				if (((Class13) class13).aShortArray166 != null) {
					for (int i_218_ = 0; i_218_ < ((Class13) class13).aShort167; i_218_++) {
						int i_219_ = i_218_ * 3;
						int i_220_ = i_219_ + 1;
						int i_221_ = i_220_ + 1;
						float f = fs[i_219_];
						float f_222_ = fs[i_220_];
						float f_223_ = fs[i_221_];
						float f_224_ = fs_133_[i_219_];
						float f_225_ = fs_133_[i_220_];
						float f_226_ = fs_133_[i_221_];
						float f_227_ = (fs_136_[i_219_] + fs_136_[i_220_] + fs_136_[i_221_]);
						if (((f - f_222_) * (f_226_ - f_225_) - (f_224_ - f_225_) * (f_223_ - f_222_)) > 0.0F) {
							((Class2) class2).aBoolean20 = (f < 0.0F || f_222_ < 0.0F || f_223_ < 0.0F || f > (float) ((Class2) class2).anInt22 || (f_222_ > (float) ((Class2) class2).anInt22) || (f_223_ > (float) ((Class2) class2).anInt22));
							short i_228_ = ((Class13) class13).aShortArray166[i_218_];
							if (f_227_ < 3.0F) {
								if (f_227_ > 0.0F) {
									if (i_228_ != -1) {
										int i_229_ = -16777216;
										if (i_228_ != -1 && (method6366(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_228_, 1198381224).aByte529)))
											i_229_ = -1694498816;
										class2.method290(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], fs_135_[i_219_], fs_135_[i_220_], fs_135_[i_221_], ((float) (((Class13) class13).aShortArray157[i_219_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class13) class13).aShortArray157[i_220_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class13) class13).aShortArray157[i_221_]) / (float) (anInt6288 * -1212653763)),
												((float) (((Class13) class13).aShortArray162[i_219_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class13) class13).aShortArray162[i_220_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class13) class13).aShortArray162[i_221_]) / (float) (anInt6288 * -1212653763)), i_229_ | ((((Class13) class13).anIntArray164[i_219_]) & 0xffffff), i_229_ | ((((Class13) class13).anIntArray164[i_220_]) & 0xffffff), i_229_
														| ((((Class13) class13).anIntArray164[i_221_]) & 0xffffff), (((Class15) class15).anInt184 * 688695183), fs_136_[i_219_] * 255.0F, fs_136_[i_220_] * 255.0F, fs_136_[i_221_] * 255.0F, i_228_);
									} else if (((((Class13) class13).anIntArray164[i_219_]) & 0xffffff) != 0) {
										if (i_228_ != -1 && (method6366(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_228_, 1822320471).aByte529)))
											((Class2) class2).anInt19 = -1694498816;
										class2.method292(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], (Class58.method692((((Class13) class13).anIntArray164[i_219_]), ((int) (fs_136_[i_219_] * 255.0F) << 24 | (((Class15) class15).anInt184 * 688695183)), 849679881)), (Class58.method692((((Class13) class13).anIntArray164[i_220_]), ((int) (fs_136_[i_220_] * 255.0F) << 24 | (((Class15) class15).anInt184 * 688695183)), 705980790)),
												(Class58.method692((((Class13) class13).anIntArray164[i_221_]), ((int) (fs_136_[i_221_] * 255.0F) << 24 | (((Class15) class15).anInt184 * 688695183)), 1153707665)));
										((Class2) class2).anInt19 = 0;
									}
								} else if (i_228_ != -1) {
									int i_230_ = -16777216;
									if (i_228_ != -1 && method6366(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_228_, 1935078014).aByte529))
										i_230_ = -1694498816;
									class2.method290(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], fs_135_[i_219_], fs_135_[i_220_], fs_135_[i_221_], ((float) (((Class13) class13).aShortArray157[i_219_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class13) class13).aShortArray157[i_220_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class13) class13).aShortArray157[i_221_]) / (float) (anInt6288 * -1212653763)),
											((float) (((Class13) class13).aShortArray162[i_219_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class13) class13).aShortArray162[i_220_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class13) class13).aShortArray162[i_221_]) / (float) (anInt6288 * -1212653763)), i_230_ | ((((Class13) class13).anIntArray164[i_219_]) & 0xffffff), i_230_ | ((((Class13) class13).anIntArray164[i_220_]) & 0xffffff), i_230_
													| ((((Class13) class13).anIntArray164[i_221_]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, i_228_);
								} else if (((((Class13) class13).anIntArray164[i_219_]) & 0xffffff) != 0) {
									if (i_228_ != -1 && method6366(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_228_, 2120381680).aByte529))
										((Class2) class2).anInt19 = -1694498816;
									class2.method292(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], (((Class13) class13).anIntArray164[i_219_]), (((Class13) class13).anIntArray164[i_220_]), (((Class13) class13).anIntArray164[i_221_]));
									((Class2) class2).anInt19 = 0;
								}
							} else
								class2.method293(true, true, false, f_224_, f_225_, f_226_, f, f_222_, f_223_, fs_134_[i_219_], fs_134_[i_220_], fs_134_[i_221_], (((Class15) class15).anInt184 * 688695183));
						}
					}
				} else {
					for (int i_231_ = 0; i_231_ < ((Class13) class13).aShort167; i_231_++) {
						int i_232_ = i_231_ * 3;
						int i_233_ = i_232_ + 1;
						int i_234_ = i_233_ + 1;
						float f = fs[i_232_];
						float f_235_ = fs[i_233_];
						float f_236_ = fs[i_234_];
						float f_237_ = fs_133_[i_232_];
						float f_238_ = fs_133_[i_233_];
						float f_239_ = fs_133_[i_234_];
						float f_240_ = (fs_136_[i_232_] + fs_136_[i_233_] + fs_136_[i_234_]);
						if (((f - f_235_) * (f_239_ - f_238_) - (f_237_ - f_238_) * (f_236_ - f_235_)) > 0.0F) {
							((Class2) class2).aBoolean20 = (f < 0.0F || f_235_ < 0.0F || f_236_ < 0.0F || f > (float) ((Class2) class2).anInt22 || (f_235_ > (float) ((Class2) class2).anInt22) || (f_236_ > (float) ((Class2) class2).anInt22));
							if (f_240_ < 3.0F) {
								if (f_240_ > 0.0F) {
									if (((((Class13) class13).anIntArray164[i_232_]) & 0xffffff) != 0)
										class2.method292(true, true, false, f_237_, f_238_, f_239_, f, f_235_, f_236_, fs_134_[i_232_], fs_134_[i_233_], fs_134_[i_234_], (Class350.method4215((((Class13) class13).anIntArray164[i_232_]), (((Class15) class15).anInt184 * 688695183), fs_136_[i_232_] * 255.0F, -833068669)), (Class350.method4215((((Class13) class13).anIntArray164[i_233_]), (((Class15) class15).anInt184 * 688695183), fs_136_[i_233_] * 255.0F, -6644641)),
												(Class350.method4215((((Class13) class13).anIntArray164[i_234_]), (((Class15) class15).anInt184 * 688695183), fs_136_[i_234_] * 255.0F, 1179362294)));
								} else if (((((Class13) class13).anIntArray164[i_232_]) & 0xffffff) != 0)
									class2.method292(true, true, false, f_237_, f_238_, f_239_, f, f_235_, f_236_, fs_134_[i_232_], fs_134_[i_233_], fs_134_[i_234_], (((Class13) class13).anIntArray164[i_232_]), (((Class13) class13).anIntArray164[i_233_]), (((Class13) class13).anIntArray164[i_234_]));
							} else
								class2.method293(true, true, false, f_237_, f_238_, f_239_, f, f_235_, f_236_, fs_134_[i_232_], fs_134_[i_233_], fs_134_[i_234_], (((Class15) class15).anInt184 * 688695183));
						}
					}
				}
			}
		}
	}

	void method6370(int i, int i_241_, boolean bool, Class15 class15, Class2 class2, float[] fs, float[] fs_242_, float[] fs_243_, float[] fs_244_, float[] fs_245_, int i_246_) {
		Class17 class17 = ((Class_xa_Sub2) this).aClass17ArrayArray8515[i][i_241_];
		if (i_246_ == 0 || (i_246_ & 0x2) == 0) {
			if (class17 != null) {
				for (int i_247_ = 0; i_247_ < ((Class17) class17).aShort234; i_247_++) {
					int i_248_ = (((Class17) class17).aShortArray235[i_247_] + (i << anInt6289 * -2137349879));
					int i_249_ = ((Class17) class17).aShortArray241[i_247_];
					int i_250_ = (((Class17) class17).aShortArray243[i_247_] + (i_241_ << anInt6289 * -2137349879));
					float f = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_248_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_249_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_250_)));
					float f_251_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_248_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_249_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_250_)));
					if (f < -f_251_)
						return;
					fs_245_[i_247_] = 0.0F;
					if (bool) {
						float f_252_ = f - ((Class15) class15).aFloat205;
						if (f_252_ > 0.0F) {
							f_252_ /= ((Class15) class15).aFloat183;
							if (f_252_ > 1.0F)
								f_252_ = 1.0F;
							fs_245_[i_247_] = f_252_;
							int i_253_ = (int) ((float) (((Class17) class17).aShortArray238[i_247_]) * f_252_);
							if (i_253_ > 0)
								i_249_ -= i_253_;
						}
					} else if (((Class15) class15).aBoolean216) {
						float f_254_ = f - ((Class15) class15).aFloat205;
						if (f_254_ > 0.0F) {
							fs_245_[i_247_] = f_254_ / ((Class15) class15).aFloat183;
							if (fs_245_[i_247_] > 1.0F)
								fs_245_[i_247_] = 1.0F;
						}
					}
					float f_255_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_248_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_249_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_250_)));
					float f_256_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_248_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_249_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_250_)));
					fs[i_247_] = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_255_ / f_251_);
					fs_242_[i_247_] = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_256_ / f_251_);
					fs_243_[i_247_] = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f / f_251_);
					fs_244_[i_247_] = f_251_;
				}
				float f = (float) (anInt6288 * -1212653763);
				for (int i_257_ = 0; i_257_ < ((Class17) class17).aShort236; i_257_++) {
					int i_258_ = i_257_ * 3;
					int i_259_ = i_258_ + 1;
					int i_260_ = i_259_ + 1;
					float f_261_ = fs[i_258_];
					float f_262_ = fs[i_259_];
					float f_263_ = fs[i_260_];
					float f_264_ = fs_242_[i_258_];
					float f_265_ = fs_242_[i_259_];
					float f_266_ = fs_242_[i_260_];
					if (((f_261_ - f_262_) * (f_266_ - f_265_) - (f_264_ - f_265_) * (f_263_ - f_262_)) > 0.0F) {
						((Class2) class2).aBoolean20 = (f_261_ < 0.0F || f_262_ < 0.0F || f_263_ < 0.0F || f_261_ > (float) ((Class2) class2).anInt22 || f_262_ > (float) ((Class2) class2).anInt22 || f_263_ > (float) ((Class2) class2).anInt22);
						if (fs_245_[i_258_] + fs_245_[i_259_] + fs_245_[i_260_] < 3.0F) {
							int i_267_ = i << anInt6289 * -2137349879;
							int i_268_ = i_241_ << anInt6289 * -2137349879;
							if ((((Class17) class17).anIntArray237[i_258_] & 0xffffff) != 0) {
								if ((((Class17) class17).aShortArray239[i_258_] == (((Class17) class17).aShortArray239[i_259_])) && ((((Class17) class17).aShortArray239[i_258_]) == (((Class17) class17).aShortArray239[i_260_])) && ((((Class17) class17).aShortArray240[i_258_]) == (((Class17) class17).aShortArray240[i_259_])) && ((((Class17) class17).aShortArray240[i_258_]) == (((Class17) class17).aShortArray240[i_260_])))
									class2.method290(true, true, false, f_264_, f_265_, f_266_, f_261_, f_262_, f_263_, fs_243_[i_258_], fs_243_[i_259_], fs_243_[i_260_], fs_244_[i_258_], fs_244_[i_259_], fs_244_[i_260_], ((float) (i_267_ + (((Class17) class17).aShortArray235[i_258_])) / (float) (((Class17) class17).aShortArray240[i_258_])), ((float) (i_267_ + (((Class17) class17).aShortArray235[i_259_])) / (float) (((Class17) class17).aShortArray240[i_259_])),
											((float) (i_267_ + (((Class17) class17).aShortArray235[i_260_])) / (float) (((Class17) class17).aShortArray240[i_260_])), ((float) (i_268_ + (((Class17) class17).aShortArray243[i_258_])) / (float) (((Class17) class17).aShortArray240[i_258_])), ((float) (i_268_ + (((Class17) class17).aShortArray243[i_259_])) / (float) (((Class17) class17).aShortArray240[i_259_])),
											((float) (i_268_ + (((Class17) class17).aShortArray243[i_260_])) / (float) (((Class17) class17).aShortArray240[i_260_])), (((Class17) class17).anIntArray237[i_258_]), (((Class17) class17).anIntArray237[i_259_]), (((Class17) class17).anIntArray237[i_260_]), (((Class15) class15).anInt184 * 688695183), fs_245_[i_258_] * 255.0F, fs_245_[i_259_] * 255.0F, fs_245_[i_260_] * 255.0F, (((Class17) class17).aShortArray239[i_258_]));
								else
									class2.method296(true, true, false, f_264_, f_265_, f_266_, f_261_, f_262_, f_263_, fs_243_[i_258_], fs_243_[i_259_], fs_243_[i_260_], fs_244_[i_258_], fs_244_[i_259_], fs_244_[i_260_], (float) (i_267_ + (((Class17) class17).aShortArray235[i_258_])) / f, (float) (i_267_ + (((Class17) class17).aShortArray235[i_259_])) / f, (float) (i_267_ + (((Class17) class17).aShortArray235[i_260_])) / f, (float) (i_268_ + (((Class17) class17).aShortArray243[i_258_])) / f,
											(float) (i_268_ + (((Class17) class17).aShortArray243[i_259_])) / f, (float) (i_268_ + (((Class17) class17).aShortArray243[i_260_])) / f, (((Class17) class17).anIntArray237[i_258_]), (((Class17) class17).anIntArray237[i_259_]), (((Class17) class17).anIntArray237[i_260_]), (((Class15) class15).anInt184 * 688695183), fs_245_[i_258_] * 255.0F, fs_245_[i_259_] * 255.0F, fs_245_[i_260_] * 255.0F, (((Class17) class17).aShortArray239[i_258_]), f
													/ (float) (((Class17) class17).aShortArray240[i_258_]), (((Class17) class17).aShortArray239[i_259_]), f / (float) (((Class17) class17).aShortArray240[i_259_]), (((Class17) class17).aShortArray239[i_260_]), f / (float) (((Class17) class17).aShortArray240[i_260_]));
							}
						} else
							class2.method293(true, true, false, f_264_, f_265_, f_266_, f_261_, f_262_, f_263_, fs_243_[i_258_], fs_243_[i_259_], fs_243_[i_260_], (((Class15) class15).anInt184 * 688695183));
					}
				}
			}
		}
	}

	public boolean method6354(Class_na class_na, int i, int i_269_, int i_270_, int i_271_, boolean bool) {
		return false;
	}

	public void at(int i, int i_272_, int i_273_) {
		if (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_272_] < i_273_)
			((Class_xa_Sub2) this).aByteArrayArray8513[i][i_272_] = (byte) i_273_;
	}

	void method6371(int i, int i_274_, int i_275_, int i_276_, int i_277_, int i_278_, int i_279_, boolean[][] bools, Class15 class15, Class2 class2, float[] fs, float[] fs_280_) {
		int i_281_ = (i_279_ - i_277_) * i_275_ / 256;
		int i_282_ = i_275_ >> 8;
		boolean bool = ((Class15) class15).aBoolean207;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.RA(false);
		((Class2) class2).aBoolean16 = false;
		((Class2) class2).aBoolean48 = false;
		int i_283_ = i;
		int i_284_ = i_274_ + i_281_;
		for (int i_285_ = i_276_; i_285_ < i_278_; i_285_++) {
			for (int i_286_ = i_277_; i_286_ < i_279_; i_286_++) {
				if (bools[i_285_ - i_276_][i_286_ - i_277_]) {
					if ((((Class_xa_Sub2) this).aClass20ArrayArray8491[i_285_][i_286_]) != null) {
						Class20 class20 = (((Class_xa_Sub2) this).aClass20ArrayArray8491[i_285_][i_286_]);
						if (((Class20) class20).aShort273 != -1 && (((Class20) class20).aByte268 & 0x2) == 0 && ((Class20) class20).anInt271 == -1) {
							int i_287_ = (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5206(((Class20) class20).aShort273));
							class2.method299(true, true, false, (float) (i_284_ - i_282_), (float) (i_284_ - i_282_), (float) i_284_, (float) (i_283_ + i_282_), (float) i_283_, (float) (i_283_ + i_282_), 100.0F, 100.0F, 100.0F, (float) Class195.method1873(i_287_, ((((Class20) class20).aShort270) & 0xffff), -952106382), (float) Class195.method1873(i_287_, ((((Class20) class20).aShort267) & 0xffff), -952106382),
									(float) Class195.method1873(i_287_, ((((Class20) class20).aShort269) & 0xffff), -952106382));
							class2.method299(true, true, false, (float) i_284_, (float) i_284_, (float) (i_284_ - i_282_), (float) i_283_, (float) (i_283_ + i_282_), (float) i_283_, 100.0F, 100.0F, 100.0F, (float) Class195.method1873(i_287_, ((((Class20) class20).aShort272) & 0xffff), -952106382), (float) Class195.method1873(i_287_, ((((Class20) class20).aShort269) & 0xffff), -952106382), (float) Class195.method1873(i_287_, ((((Class20) class20).aShort267) & 0xffff), -952106382));
						} else if (((Class20) class20).anInt271 == -1) {
							class2.method299(true, true, false, (float) (i_284_ - i_282_), (float) (i_284_ - i_282_), (float) i_284_, (float) (i_283_ + i_282_), (float) i_283_, (float) (i_283_ + i_282_), 100.0F, 100.0F, 100.0F, (float) (((Class20) class20).aShort270 & 0xffff), (float) (((Class20) class20).aShort267 & 0xffff), (float) (((Class20) class20).aShort269 & 0xffff));
							class2.method299(true, true, false, (float) i_284_, (float) i_284_, (float) (i_284_ - i_282_), (float) i_283_, (float) (i_283_ + i_282_), (float) i_283_, 100.0F, 100.0F, 100.0F, (float) (((Class20) class20).aShort272 & 0xffff), (float) (((Class20) class20).aShort269 & 0xffff), (float) (((Class20) class20).aShort267 & 0xffff));
						} else {
							int i_288_ = ((Class20) class20).anInt271;
							class2.method299(true, true, false, (float) (i_284_ - i_282_), (float) (i_284_ - i_282_), (float) i_284_, (float) (i_283_ + i_282_), (float) i_283_, (float) (i_283_ + i_282_), 100.0F, 100.0F, 100.0F, (float) i_288_, (float) i_288_, (float) i_288_);
							class2.method299(true, true, false, (float) i_284_, (float) i_284_, (float) (i_284_ - i_282_), (float) i_283_, (float) (i_283_ + i_282_), (float) i_283_, 100.0F, 100.0F, 100.0F, (float) i_288_, (float) i_288_, (float) i_288_);
						}
					} else if ((((Class_xa_Sub2) this).aClass9ArrayArray8495[i_285_][i_286_]) != null) {
						Class9 class9 = (((Class_xa_Sub2) this).aClass9ArrayArray8495[i_285_][i_286_]);
						for (int i_289_ = 0; i_289_ < ((Class9) class9).aShort115; i_289_++) {
							fs[i_289_] = (float) (i_283_ + ((((Class9) class9).aShortArray118[i_289_]) * i_282_ / (anInt6288 * -1212653763)));
							fs_280_[i_289_] = (float) (i_284_ - ((((Class9) class9).aShortArray120[i_289_]) * i_282_ / (anInt6288 * -1212653763)));
						}
						for (int i_290_ = 0; i_290_ < ((Class9) class9).aShort123; i_290_++) {
							short i_291_ = ((Class9) class9).aShortArray122[i_290_];
							short i_292_ = ((Class9) class9).aShortArray117[i_290_];
							short i_293_ = ((Class9) class9).aShortArray124[i_290_];
							float f = fs[i_291_];
							float f_294_ = fs[i_292_];
							float f_295_ = fs[i_293_];
							float f_296_ = fs_280_[i_291_];
							float f_297_ = fs_280_[i_292_];
							float f_298_ = fs_280_[i_293_];
							if (((Class9) class9).anIntArray128 != null && (((Class9) class9).anIntArray128[i_290_] != -1)) {
								int i_299_ = ((Class9) class9).anIntArray128[i_290_];
								class2.method299(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, 100.0F, 100.0F, 100.0F, (float) (Class195.method1873(i_299_, (((Class9) class9).aShortArray121[i_291_]), -952106382)), (float) (Class195.method1873(i_299_, (((Class9) class9).aShortArray121[i_292_]), -952106382)), (float) (Class195.method1873(i_299_, (((Class9) class9).aShortArray121[i_293_]), -952106382)));
							} else if (((Class9) class9).aShortArray125 != null && (((Class9) class9).aShortArray125[i_290_]) != -1) {
								int i_300_ = (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5206(((Class9) class9).aShortArray125[i_290_]));
								class2.method299(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, 100.0F, 100.0F, 100.0F, (float) (Class195.method1873(i_300_, (((Class9) class9).aShortArray121[i_291_]), -952106382)), (float) (Class195.method1873(i_300_, (((Class9) class9).aShortArray121[i_292_]), -952106382)), (float) (Class195.method1873(i_300_, (((Class9) class9).aShortArray121[i_293_]), -952106382)));
							} else {
								int i_301_ = ((Class9) class9).anIntArray127[i_290_];
								class2.method299(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, 100.0F, 100.0F, 100.0F, (float) (Class195.method1873(i_301_, (((Class9) class9).aShortArray121[i_291_]), -952106382)), (float) (Class195.method1873(i_301_, (((Class9) class9).aShortArray121[i_292_]), -952106382)), (float) (Class195.method1873(i_301_, (((Class9) class9).aShortArray121[i_293_]), -952106382)));
							}
						}
					}
				}
				i_284_ -= i_282_;
			}
			i_284_ = i_274_ + i_281_;
			i_283_ += i_282_;
		}
		((Class2) class2).aBoolean16 = true;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.RA(bool);
	}

	public void method6347(int i, int i_302_, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_, boolean[][] bools) {
		Class15 class15 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5202(Thread.currentThread());
		Class2 class2 = ((Class15) class15).aClass2_192;
		((Class2) class2).anInt19 = 0;
		((Class2) class2).aBoolean20 = true;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5198();
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			method6373(i, i_302_, i_303_, i_304_, i_305_, i_306_, i_307_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			method6371(i, i_302_, i_303_, i_304_, i_305_, i_306_, i_307_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
	}

	public Class_na w(int i, int i_308_, Class_na class_na) {
		return null;
	}

	public void UA(Class_na class_na, int i, int i_309_, int i_310_, int i_311_, boolean bool) {
		/* empty */
	}

	public void NA(Class_na class_na, int i, int i_312_, int i_313_, int i_314_, boolean bool) {
		/* empty */
	}

	public void method6342(Class298_Sub10 class298_sub10, int[] is) {
		/* empty */
	}

	public void method6337(int i, int i_315_, int[] is, int[] is_316_, int[] is_317_, int[] is_318_, int[] is_319_, int[] is_320_, int[] is_321_, int[] is_322_, int[] is_323_, int[] is_324_, int[] is_325_, Class78 class78, boolean bool) {
		if (((Class_xa_Sub2) this).aClass20ArrayArray8491 == null) {
			((Class_xa_Sub2) this).aClass20ArrayArray8491 = new Class20[anInt6287 * -506105871][anInt6286 * -1148794921];
			((Class_xa_Sub2) this).aClass9ArrayArray8495 = new Class9[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			throw new IllegalStateException();
		boolean bool_326_ = false;
		if (is_322_.length == 2 && is_319_.length == 2 && (is_322_[0] == is_322_[1] || is_324_[0] != -1 && is_324_[0] == is_324_[1])) {
			bool_326_ = true;
			for (int i_327_ = 1; i_327_ < 2; i_327_++) {
				int i_328_ = is[is_319_[i_327_]];
				int i_329_ = is_317_[is_319_[i_327_]];
				if (i_328_ != 0 && i_328_ != anInt6288 * -1212653763 || i_329_ != 0 && i_329_ != anInt6288 * -1212653763) {
					bool_326_ = false;
					break;
				}
			}
		}
		if (!bool_326_) {
			Class9 class9 = new Class9();
			short i_330_ = (short) is.length;
			int i_331_ = (short) is_322_.length;
			((Class9) class9).aShort115 = i_330_;
			((Class9) class9).aShortArray121 = new short[i_330_];
			((Class9) class9).aShortArray118 = new short[i_330_];
			((Class9) class9).aShortArray119 = new short[i_330_];
			((Class9) class9).aShortArray120 = new short[i_330_];
			for (int i_332_ = 0; i_332_ < i_330_; i_332_++) {
				int i_333_ = is[i_332_];
				int i_334_ = is_317_[i_332_];
				if (i_333_ == 0 && i_334_ == 0)
					((Class9) class9).aShortArray121[i_332_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_315_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_315_]));
				else if (i_333_ == 0 && i_334_ == anInt6288 * -1212653763)
					((Class9) class9).aShortArray121[i_332_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_315_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_315_ + 1]));
				else if (i_333_ == anInt6288 * -1212653763 && i_334_ == anInt6288 * -1212653763)
					((Class9) class9).aShortArray121[i_332_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_315_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_315_ + 1]));
				else if (i_333_ == anInt6288 * -1212653763 && i_334_ == 0)
					((Class9) class9).aShortArray121[i_332_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_315_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_315_]));
				else {
					int i_335_ = (((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_315_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_315_])) * (anInt6288 * -1212653763 - i_333_) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_315_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_315_])) * i_333_);
					int i_336_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_315_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_315_ + 1])) * (anInt6288 * -1212653763 - i_333_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_315_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_315_ + 1])) * i_333_);
					((Class9) class9).aShortArray121[i_332_] = (short) ((i_335_ * (anInt6288 * -1212653763 - i_334_) + i_336_ * i_334_) >> anInt6289 * 20267538);
				}
				int i_337_ = (i << anInt6289 * -2137349879) + i_333_;
				int i_338_ = (i_315_ << anInt6289 * -2137349879) + i_334_;
				((Class9) class9).aShortArray118[i_332_] = (short) i_333_;
				((Class9) class9).aShortArray120[i_332_] = (short) i_334_;
				((Class9) class9).aShortArray119[i_332_] = (short) (method6340(i_337_, i_338_, -1457437132) + (is_316_ != null ? is_316_[i_332_] : 0));
				if (((Class9) class9).aShortArray121[i_332_] < 2)
					((Class9) class9).aShortArray121[i_332_] = (short) 2;
			}
			boolean bool_339_ = false;
			int i_340_ = 0;
			for (int i_341_ = 0; i_341_ < i_331_; i_341_++) {
				if (is_322_[i_341_] >= 0 || is_323_ != null && is_323_[i_341_] >= 0)
					i_340_++;
				int i_342_ = is_324_[i_341_];
				if (i_342_ != -1) {
					Class53 class53 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_342_, 685935265);
					if (!class53.aBoolean524) {
						bool_339_ = true;
						if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
							((Class9) class9).aByte126 |= 0x4;
					}
				}
			}
			((Class9) class9).anIntArray127 = new int[i_340_];
			if (is_323_ != null)
				((Class9) class9).anIntArray128 = new int[i_340_];
			((Class9) class9).aShortArray122 = new short[i_340_];
			((Class9) class9).aShortArray117 = new short[i_340_];
			((Class9) class9).aShortArray124 = new short[i_340_];
			if (bool_339_) {
				((Class9) class9).aShortArray125 = new short[i_340_];
				((Class9) class9).aShortArray116 = new short[i_340_];
			}
			for (int i_343_ = 0; i_343_ < i_331_; i_343_++) {
				if (is_322_[i_343_] >= 0 || is_323_ != null && is_323_[i_343_] >= 0) {
					if (is_322_[i_343_] >= 0)
						((Class9) class9).anIntArray127[(((Class9) class9).aShort123)] = Class173.method1823(is_322_[i_343_], (byte) 0);
					else
						((Class9) class9).anIntArray127[(((Class9) class9).aShort123)] = -1;
					if (is_323_ != null) {
						if (is_323_[i_343_] != -1)
							((Class9) class9).anIntArray128[(((Class9) class9).aShort123)] = Class173.method1823(is_323_[i_343_], (byte) 0);
						else
							((Class9) class9).anIntArray128[(((Class9) class9).aShort123)] = -1;
					}
					((Class9) class9).aShortArray122[(((Class9) class9).aShort123)] = (short) is_319_[i_343_];
					((Class9) class9).aShortArray117[(((Class9) class9).aShort123)] = (short) is_320_[i_343_];
					((Class9) class9).aShortArray124[(((Class9) class9).aShort123)] = (short) is_321_[i_343_];
					if (bool_339_) {
						if (is_324_[i_343_] != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_324_[i_343_], 1558897776).aBoolean524)) {
							((Class9) class9).aShortArray125[(((Class9) class9).aShort123)] = (short) is_324_[i_343_];
							((Class9) class9).aShortArray116[(((Class9) class9).aShort123)] = (short) is_325_[i_343_];
						} else
							((Class9) class9).aShortArray125[(((Class9) class9).aShort123)] = (short) -1;
					}
					((Class9) class9).aShort123++;
				}
			}
			((Class_xa_Sub2) this).aClass9ArrayArray8495[i][i_315_] = class9;
		} else if (is_322_[0] >= 0 || is_323_ != null && is_323_[0] >= 0) {
			Class20 class20 = new Class20();
			int i_344_ = is_322_[0];
			int i_345_ = is_324_[0];
			if (is_323_ != null) {
				((Class20) class20).anInt271 = Class195.method1873(Class173.method1823(is_323_[0], (byte) 0), ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_315_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_315_])), -952106382);
				if (i_344_ == -1)
					((Class20) class20).aByte268 |= 0x2;
			}
			if ((anIntArrayArray6290[i][i_315_] == anIntArrayArray6290[i + 1][i_315_]) && (anIntArrayArray6290[i][i_315_] == anIntArrayArray6290[i + 1][i_315_ + 1]) && (anIntArrayArray6290[i][i_315_] == anIntArrayArray6290[i][i_315_ + 1]))
				((Class20) class20).aByte268 |= 0x1;
			Class53 class53 = null;
			if (i_345_ != -1)
				class53 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_345_, 864442826);
			if (class53 != null && (((Class20) class20).aByte268 & 0x2) == 0 && !class53.aBoolean524) {
				((Class20) class20).aShort272 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_315_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_315_]));
				((Class20) class20).aShort269 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_315_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_315_]));
				((Class20) class20).aShort270 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_315_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_315_ + 1]));
				((Class20) class20).aShort267 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_315_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_315_ + 1]));
				((Class20) class20).aShort273 = (short) i_345_;
				if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class20) class20).aByte268 |= 0x4;
			} else {
				short i_346_ = Class173.method1823(i_344_, (byte) 0);
				((Class20) class20).aShort272 = (short) Class195.method1873(i_346_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_315_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_315_])), -952106382);
				((Class20) class20).aShort269 = (short) Class195.method1873(i_346_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_315_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_315_])), -952106382);
				((Class20) class20).aShort270 = (short) Class195.method1873(i_346_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_315_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_315_ + 1])), -952106382);
				((Class20) class20).aShort267 = (short) Class195.method1873(i_346_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_315_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_315_ + 1])), -952106382);
				((Class20) class20).aShort273 = (short) -1;
			}
			((Class_xa_Sub2) this).aClass20ArrayArray8491[i][i_315_] = class20;
		}
	}

	public void method6343(int i, int i_347_, int[] is, int[] is_348_, int[] is_349_, int[] is_350_, int[] is_351_, int[] is_352_, int[] is_353_, int[] is_354_, int[] is_355_, int[] is_356_, int[] is_357_, Class78 class78, boolean bool) {
		if (((Class_xa_Sub2) this).aClass20ArrayArray8491 == null) {
			((Class_xa_Sub2) this).aClass20ArrayArray8491 = new Class20[anInt6287 * -506105871][anInt6286 * -1148794921];
			((Class_xa_Sub2) this).aClass9ArrayArray8495 = new Class9[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			throw new IllegalStateException();
		boolean bool_358_ = false;
		if (is_354_.length == 2 && is_351_.length == 2 && (is_354_[0] == is_354_[1] || is_356_[0] != -1 && is_356_[0] == is_356_[1])) {
			bool_358_ = true;
			for (int i_359_ = 1; i_359_ < 2; i_359_++) {
				int i_360_ = is[is_351_[i_359_]];
				int i_361_ = is_349_[is_351_[i_359_]];
				if (i_360_ != 0 && i_360_ != anInt6288 * -1212653763 || i_361_ != 0 && i_361_ != anInt6288 * -1212653763) {
					bool_358_ = false;
					break;
				}
			}
		}
		if (!bool_358_) {
			Class9 class9 = new Class9();
			short i_362_ = (short) is.length;
			int i_363_ = (short) is_354_.length;
			((Class9) class9).aShort115 = i_362_;
			((Class9) class9).aShortArray121 = new short[i_362_];
			((Class9) class9).aShortArray118 = new short[i_362_];
			((Class9) class9).aShortArray119 = new short[i_362_];
			((Class9) class9).aShortArray120 = new short[i_362_];
			for (int i_364_ = 0; i_364_ < i_362_; i_364_++) {
				int i_365_ = is[i_364_];
				int i_366_ = is_349_[i_364_];
				if (i_365_ == 0 && i_366_ == 0)
					((Class9) class9).aShortArray121[i_364_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_347_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_347_]));
				else if (i_365_ == 0 && i_366_ == anInt6288 * -1212653763)
					((Class9) class9).aShortArray121[i_364_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_347_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_347_ + 1]));
				else if (i_365_ == anInt6288 * -1212653763 && i_366_ == anInt6288 * -1212653763)
					((Class9) class9).aShortArray121[i_364_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_347_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_347_ + 1]));
				else if (i_365_ == anInt6288 * -1212653763 && i_366_ == 0)
					((Class9) class9).aShortArray121[i_364_] = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_347_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_347_]));
				else {
					int i_367_ = (((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_347_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_347_])) * (anInt6288 * -1212653763 - i_365_) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_347_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_347_])) * i_365_);
					int i_368_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_347_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_347_ + 1])) * (anInt6288 * -1212653763 - i_365_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_347_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_347_ + 1])) * i_365_);
					((Class9) class9).aShortArray121[i_364_] = (short) ((i_367_ * (anInt6288 * -1212653763 - i_366_) + i_368_ * i_366_) >> anInt6289 * 20267538);
				}
				int i_369_ = (i << anInt6289 * -2137349879) + i_365_;
				int i_370_ = (i_347_ << anInt6289 * -2137349879) + i_366_;
				((Class9) class9).aShortArray118[i_364_] = (short) i_365_;
				((Class9) class9).aShortArray120[i_364_] = (short) i_366_;
				((Class9) class9).aShortArray119[i_364_] = (short) (method6340(i_369_, i_370_, -2032546575) + (is_348_ != null ? is_348_[i_364_] : 0));
				if (((Class9) class9).aShortArray121[i_364_] < 2)
					((Class9) class9).aShortArray121[i_364_] = (short) 2;
			}
			boolean bool_371_ = false;
			int i_372_ = 0;
			for (int i_373_ = 0; i_373_ < i_363_; i_373_++) {
				if (is_354_[i_373_] >= 0 || is_355_ != null && is_355_[i_373_] >= 0)
					i_372_++;
				int i_374_ = is_356_[i_373_];
				if (i_374_ != -1) {
					Class53 class53 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_374_, 254420286);
					if (!class53.aBoolean524) {
						bool_371_ = true;
						if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
							((Class9) class9).aByte126 |= 0x4;
					}
				}
			}
			((Class9) class9).anIntArray127 = new int[i_372_];
			if (is_355_ != null)
				((Class9) class9).anIntArray128 = new int[i_372_];
			((Class9) class9).aShortArray122 = new short[i_372_];
			((Class9) class9).aShortArray117 = new short[i_372_];
			((Class9) class9).aShortArray124 = new short[i_372_];
			if (bool_371_) {
				((Class9) class9).aShortArray125 = new short[i_372_];
				((Class9) class9).aShortArray116 = new short[i_372_];
			}
			for (int i_375_ = 0; i_375_ < i_363_; i_375_++) {
				if (is_354_[i_375_] >= 0 || is_355_ != null && is_355_[i_375_] >= 0) {
					if (is_354_[i_375_] >= 0)
						((Class9) class9).anIntArray127[(((Class9) class9).aShort123)] = Class173.method1823(is_354_[i_375_], (byte) 0);
					else
						((Class9) class9).anIntArray127[(((Class9) class9).aShort123)] = -1;
					if (is_355_ != null) {
						if (is_355_[i_375_] != -1)
							((Class9) class9).anIntArray128[(((Class9) class9).aShort123)] = Class173.method1823(is_355_[i_375_], (byte) 0);
						else
							((Class9) class9).anIntArray128[(((Class9) class9).aShort123)] = -1;
					}
					((Class9) class9).aShortArray122[(((Class9) class9).aShort123)] = (short) is_351_[i_375_];
					((Class9) class9).aShortArray117[(((Class9) class9).aShort123)] = (short) is_352_[i_375_];
					((Class9) class9).aShortArray124[(((Class9) class9).aShort123)] = (short) is_353_[i_375_];
					if (bool_371_) {
						if (is_356_[i_375_] != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_356_[i_375_], 1342986540).aBoolean524)) {
							((Class9) class9).aShortArray125[(((Class9) class9).aShort123)] = (short) is_356_[i_375_];
							((Class9) class9).aShortArray116[(((Class9) class9).aShort123)] = (short) is_357_[i_375_];
						} else
							((Class9) class9).aShortArray125[(((Class9) class9).aShort123)] = (short) -1;
					}
					((Class9) class9).aShort123++;
				}
			}
			((Class_xa_Sub2) this).aClass9ArrayArray8495[i][i_347_] = class9;
		} else if (is_354_[0] >= 0 || is_355_ != null && is_355_[0] >= 0) {
			Class20 class20 = new Class20();
			int i_376_ = is_354_[0];
			int i_377_ = is_356_[0];
			if (is_355_ != null) {
				((Class20) class20).anInt271 = Class195.method1873(Class173.method1823(is_355_[0], (byte) 0), ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_347_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_347_])), -952106382);
				if (i_376_ == -1)
					((Class20) class20).aByte268 |= 0x2;
			}
			if ((anIntArrayArray6290[i][i_347_] == anIntArrayArray6290[i + 1][i_347_]) && (anIntArrayArray6290[i][i_347_] == anIntArrayArray6290[i + 1][i_347_ + 1]) && (anIntArrayArray6290[i][i_347_] == anIntArrayArray6290[i][i_347_ + 1]))
				((Class20) class20).aByte268 |= 0x1;
			Class53 class53 = null;
			if (i_377_ != -1)
				class53 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_377_, 1689468609);
			if (class53 != null && (((Class20) class20).aByte268 & 0x2) == 0 && !class53.aBoolean524) {
				((Class20) class20).aShort272 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_347_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_347_]));
				((Class20) class20).aShort269 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_347_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_347_]));
				((Class20) class20).aShort270 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_347_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_347_ + 1]));
				((Class20) class20).aShort267 = (short) ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_347_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_347_ + 1]));
				((Class20) class20).aShort273 = (short) i_377_;
				if (method6366(class53.aByte529) || class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class20) class20).aByte268 |= 0x4;
			} else {
				short i_378_ = Class173.method1823(i_376_, (byte) 0);
				((Class20) class20).aShort272 = (short) Class195.method1873(i_378_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_347_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_347_])), -952106382);
				((Class20) class20).aShort269 = (short) Class195.method1873(i_378_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_347_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_347_])), -952106382);
				((Class20) class20).aShort270 = (short) Class195.method1873(i_378_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_347_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_347_ + 1])), -952106382);
				((Class20) class20).aShort267 = (short) Class195.method1873(i_378_, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_347_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_347_ + 1])), -952106382);
				((Class20) class20).aShort273 = (short) -1;
			}
			((Class_xa_Sub2) this).aClass20ArrayArray8491[i][i_347_] = class20;
		}
	}

	public void method6359(int i, int i_379_, int[] is, int[] is_380_, int[] is_381_, int[] is_382_, int[] is_383_, int[] is_384_, int[] is_385_, int[] is_386_, Class78 class78, boolean bool) {
		boolean bool_387_ = (((Class_xa_Sub2) this).anInt8492 & 0x20) == 0;
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 == null && !bool_387_) {
			((Class_xa_Sub2) this).aClass6ArrayArray8493 = new Class6[anInt6287 * -506105871][anInt6286 * -1148794921];
			((Class_xa_Sub2) this).aClass13ArrayArray8494 = new Class13[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (((Class_xa_Sub2) this).aClass17ArrayArray8515 == null && bool_387_)
			((Class_xa_Sub2) this).aClass17ArrayArray8515 = new Class17[anInt6287 * -506105871][anInt6286 * -1148794921];
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_388_ = 0; i_388_ < is_383_.length; i_388_++) {
				if (is_383_[i_388_] == -1)
					is_383_[i_388_] = 0;
				else
					is_383_[i_388_] = (Class379.anIntArray4096[(Class173.method1823(is_383_[i_388_], (byte) 0) & 0xffff)]) << 8 | 0xff;
			}
			if (is_384_ != null) {
				for (int i_389_ = 0; i_389_ < is_384_.length; i_389_++) {
					if (is_384_[i_389_] == -1)
						is_384_[i_389_] = 0;
					else
						is_384_[i_389_] = (Class379.anIntArray4096[(Class173.method1823(is_384_[i_389_], (byte) 0) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_387_) {
				Class17 class17 = new Class17();
				((Class17) class17).aShort234 = (short) is.length;
				((Class17) class17).aShort236 = (short) (is.length / 3);
				((Class17) class17).aShortArray235 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray241 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray243 = new short[((Class17) class17).aShort234];
				((Class17) class17).anIntArray237 = new int[((Class17) class17).aShort234];
				((Class17) class17).aShortArray239 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray240 = new short[((Class17) class17).aShort234];
				((Class17) class17).aByteArray242 = new byte[((Class17) class17).aShort234];
				if (is_382_ != null)
					((Class17) class17).aShortArray238 = new short[((Class17) class17).aShort234];
				for (int i_390_ = 0; i_390_ < ((Class17) class17).aShort234; i_390_++) {
					int i_391_ = is[i_390_];
					int i_392_ = is_381_[i_390_];
					boolean bool_393_ = false;
					int i_394_;
					if (i_391_ == 0 && i_392_ == 0)
						i_394_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_]));
					else if (i_391_ == 0 && i_392_ == anInt6288 * -1212653763)
						i_394_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_ + 1]));
					else if (i_391_ == anInt6288 * -1212653763 && i_392_ == anInt6288 * -1212653763)
						i_394_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_ + 1]));
					else if (i_391_ == anInt6288 * -1212653763 && i_392_ == 0)
						i_394_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_]));
					else {
						int i_395_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_])) * (anInt6288 * -1212653763 - i_391_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_])) * i_391_);
						int i_396_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_ + 1])) * (anInt6288 * -1212653763 - i_391_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_ + 1])) * i_391_);
						i_394_ = (i_395_ * (anInt6288 * -1212653763 - i_392_) + i_396_ * i_392_) >> anInt6289 * 20267538;
					}
					int i_397_ = (i << anInt6289 * -2137349879) + i_391_;
					int i_398_ = (i_379_ << anInt6289 * -2137349879) + i_392_;
					((Class17) class17).aShortArray235[i_390_] = (short) i_391_;
					((Class17) class17).aShortArray243[i_390_] = (short) i_392_;
					((Class17) class17).aShortArray241[i_390_] = (short) (method6340(i_397_, i_398_, -2009080291) + (is_380_ != null ? is_380_[i_390_] : 0));
					if (i_394_ < 0)
						i_394_ = 0;
					if (is_383_[i_390_] == 0) {
						((Class17) class17).anIntArray237[i_390_] = 0;
						if (is_384_ != null)
							((Class17) class17).aByteArray242[i_390_] = (byte) i_394_;
					} else {
						int i_399_ = 0;
						if (is_382_ != null) {
							int i_400_ = (((Class17) class17).aShortArray238[i_390_] = (short) is_382_[i_390_]);
							if (class78.anInt725 * 1996750669 != 0) {
								i_399_ = 255 * i_400_ / (class78.anInt725 * 1996750669);
								if (i_399_ < 0)
									i_399_ = 0;
								else if (i_399_ > 255)
									i_399_ = 255;
							}
						}
						int i_401_ = -16777216;
						if (is_385_[i_390_] != -1 && method6366(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_385_[i_390_], 655564725).aByte529))
							i_401_ = -1694498816;
						((Class17) class17).anIntArray237[i_390_] = i_401_ | (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_390_] >> 8, i_394_), class78.anInt726 * -1212608691, i_399_, 1960218609));
						if (is_384_ != null)
							((Class17) class17).aByteArray242[i_390_] = (byte) i_394_;
					}
					((Class17) class17).aShortArray239[i_390_] = (short) is_385_[i_390_];
					((Class17) class17).aShortArray240[i_390_] = (short) is_386_[i_390_];
				}
				if (is_384_ != null)
					((Class17) class17).anIntArray233 = new int[((Class17) class17).aShort236];
				for (int i_402_ = 0; i_402_ < ((Class17) class17).aShort236; i_402_++) {
					int i_403_ = i_402_ * 3;
					if (is_384_ != null && is_384_[i_403_] != 0)
						((Class17) class17).anIntArray233[i_402_] = ~0xffffff | is_384_[i_403_] >> 8;
				}
				((Class_xa_Sub2) this).aClass17ArrayArray8515[i][i_379_] = class17;
			} else {
				boolean bool_404_ = true;
				int i_405_ = -1;
				int i_406_ = -1;
				int i_407_ = -1;
				int i_408_ = -1;
				if (is.length == 6) {
					for (int i_409_ = 0; i_409_ < 6; i_409_++) {
						if (is[i_409_] == 0 && is_381_[i_409_] == 0) {
							if (i_405_ != -1 && is_383_[i_405_] != is_383_[i_409_]) {
								bool_404_ = false;
								break;
							}
							i_405_ = i_409_;
						} else if (is[i_409_] == anInt6288 * -1212653763 && is_381_[i_409_] == 0) {
							if (i_406_ != -1 && is_383_[i_406_] != is_383_[i_409_]) {
								bool_404_ = false;
								break;
							}
							i_406_ = i_409_;
						} else if (is[i_409_] == anInt6288 * -1212653763 && (is_381_[i_409_] == anInt6288 * -1212653763)) {
							if (i_407_ != -1 && is_383_[i_407_] != is_383_[i_409_]) {
								bool_404_ = false;
								break;
							}
							i_407_ = i_409_;
						} else if (is[i_409_] == 0 && (is_381_[i_409_] == anInt6288 * -1212653763)) {
							if (i_408_ != -1 && is_383_[i_408_] != is_383_[i_409_]) {
								bool_404_ = false;
								break;
							}
							i_408_ = i_409_;
						}
					}
					if (i_405_ == -1 || i_406_ == -1 || i_407_ == -1 || i_408_ == -1)
						bool_404_ = false;
					if (bool_404_) {
						if (is_380_ != null) {
							for (int i_410_ = 0; i_410_ < 4; i_410_++) {
								if (is_380_[i_410_] != 0) {
									bool_404_ = false;
									break;
								}
							}
						}
						if (bool_404_) {
							for (int i_411_ = 1; i_411_ < 4; i_411_++) {
								if (is[i_411_] != is[0] && (is[i_411_] != is[0] + anInt6288 * -1212653763) && (is[i_411_] != is[0] - anInt6288 * -1212653763)) {
									bool_404_ = false;
									break;
								}
								if (is_381_[i_411_] != is_381_[0] && (is_381_[i_411_] != (is_381_[0] + anInt6288 * -1212653763)) && (is_381_[i_411_] != (is_381_[0] - anInt6288 * -1212653763))) {
									bool_404_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_404_ = false;
				if (bool_404_) {
					Class6 class6 = new Class6();
					int i_412_ = is_383_[0];
					int i_413_ = is_385_[0];
					if (is_384_ != null) {
						((Class6) class6).anInt90 = is_384_[0] >> 8;
						if (i_412_ == 0)
							((Class6) class6).aByte85 |= 0x2;
					} else if (i_412_ == 0)
						return;
					if ((anIntArrayArray6290[i][i_379_] == anIntArrayArray6290[i + 1][i_379_]) && (anIntArrayArray6290[i][i_379_] == anIntArrayArray6290[i + 1][i_379_ + 1]) && (anIntArrayArray6290[i][i_379_] == anIntArrayArray6290[i][i_379_ + 1]))
						((Class6) class6).aByte85 |= 0x1;
					if (i_413_ != -1 && (((Class6) class6).aByte85 & 0x2) == 0 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_413_, 1091806927).aBoolean524)) {
						int i_414_;
						if (is_382_ != null && class78.anInt725 * 1996750669 != 0) {
							i_414_ = 255 * is_382_[i_405_] / (class78.anInt725 * 1996750669);
							if (i_414_ < 0)
								i_414_ = 0;
							else if (i_414_ > 255)
								i_414_ = 255;
						} else
							i_414_ = 0;
						((Class6) class6).anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_405_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_]))), class78.anInt726 * -1212608691, i_414_, 1531970140));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt82 |= (255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_])) << 25);
						if (is_382_ != null && class78.anInt725 * 1996750669 != 0) {
							i_414_ = 255 * is_382_[i_406_] / (class78.anInt725 * 1996750669);
							if (i_414_ < 0)
								i_414_ = 0;
							else if (i_414_ > 255)
								i_414_ = 255;
						} else
							i_414_ = 0;
						((Class6) class6).anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_406_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_]))), class78.anInt726 * -1212608691, i_414_, 1359167181));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt83 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_])) << 25;
						if (is_382_ != null && class78.anInt725 * 1996750669 != 0) {
							i_414_ = 255 * is_382_[i_407_] / (class78.anInt725 * 1996750669);
							if (i_414_ < 0)
								i_414_ = 0;
							else if (i_414_ > 255)
								i_414_ = 255;
						} else
							i_414_ = 0;
						((Class6) class6).anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_407_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_ + 1]))), class78.anInt726 * -1212608691, i_414_, 1398076984));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt81 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_ + 1])) << 25;
						if (is_382_ != null && class78.anInt725 * 1996750669 != 0) {
							i_414_ = 255 * is_382_[i_408_] / (class78.anInt725 * 1996750669);
							if (i_414_ < 0)
								i_414_ = 0;
							else if (i_414_ > 255)
								i_414_ = 255;
						} else
							i_414_ = 0;
						((Class6) class6).anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_408_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_ + 1]))), class78.anInt726 * -1212608691, i_414_, 1767017217));
						((Class6) class6).aShort91 = (short) i_413_;
					} else {
						int i_415_;
						if (is_382_ != null && class78.anInt725 * 1996750669 != 0) {
							i_415_ = 255 * is_382_[i_405_] / (class78.anInt725 * 1996750669);
							if (i_415_ < 0)
								i_415_ = 0;
							else if (i_415_ > 255)
								i_415_ = 255;
						} else
							i_415_ = 0;
						((Class6) class6).anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_405_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_]))), class78.anInt726 * -1212608691, i_415_, 1749633676));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt82 |= (255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_])) << 25);
						if (is_382_ != null && class78.anInt725 * 1996750669 != 0) {
							i_415_ = 255 * is_382_[i_406_] / (class78.anInt725 * 1996750669);
							if (i_415_ < 0)
								i_415_ = 0;
							else if (i_415_ > 255)
								i_415_ = 255;
						} else
							i_415_ = 0;
						((Class6) class6).anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_406_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_]))), class78.anInt726 * -1212608691, i_415_, 1537855018));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt83 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_])) << 25;
						if (is_382_ != null && class78.anInt725 * 1996750669 != 0) {
							i_415_ = 255 * is_382_[i_407_] / (class78.anInt725 * 1996750669);
							if (i_415_ < 0)
								i_415_ = 0;
							else if (i_415_ > 255)
								i_415_ = 255;
						} else
							i_415_ = 0;
						((Class6) class6).anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_407_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_ + 1]))), class78.anInt726 * -1212608691, i_415_, 1849957541));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt81 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_ + 1])) << 25;
						if (is_382_ != null && class78.anInt725 * 1996750669 != 0) {
							i_415_ = 255 * is_382_[i_408_] / (class78.anInt725 * 1996750669);
							if (i_415_ < 0)
								i_415_ = 0;
							else if (i_415_ > 255)
								i_415_ = 255;
						} else
							i_415_ = 0;
						((Class6) class6).anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_408_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_ + 1]))), class78.anInt726 * -1212608691, i_415_, 1734535343));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt89 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_ + 1])) << 25;
						((Class6) class6).aShort91 = (short) -1;
					}
					if (is_382_ != null) {
						((Class6) class6).aShort88 = (short) is_382_[i_407_];
						((Class6) class6).aShort86 = (short) is_382_[i_408_];
						((Class6) class6).aShort87 = (short) is_382_[i_406_];
						((Class6) class6).aShort84 = (short) is_382_[i_405_];
					}
					((Class_xa_Sub2) this).aClass6ArrayArray8493[i][i_379_] = class6;
				} else {
					Class13 class13 = new Class13();
					((Class13) class13).aShort158 = (short) is.length;
					((Class13) class13).aShort167 = (short) (is.length / 3);
					((Class13) class13).aShortArray157 = new short[((Class13) class13).aShort158];
					((Class13) class13).aShortArray161 = new short[((Class13) class13).aShort158];
					((Class13) class13).aShortArray162 = new short[((Class13) class13).aShort158];
					((Class13) class13).anIntArray164 = new int[((Class13) class13).aShort158];
					if (is_382_ != null)
						((Class13) class13).aShortArray165 = new short[((Class13) class13).aShort158];
					for (int i_416_ = 0; i_416_ < ((Class13) class13).aShort158; i_416_++) {
						int i_417_ = is[i_416_];
						int i_418_ = is_381_[i_416_];
						boolean bool_419_ = false;
						int i_420_;
						if (i_417_ == 0 && i_418_ == 0)
							i_420_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_]));
						else if (i_417_ == 0 && i_418_ == anInt6288 * -1212653763)
							i_420_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_ + 1]));
						else if (i_417_ == anInt6288 * -1212653763 && i_418_ == anInt6288 * -1212653763)
							i_420_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_ + 1]));
						else if (i_417_ == anInt6288 * -1212653763 && i_418_ == 0)
							i_420_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_]));
						else {
							int i_421_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_])) * (anInt6288 * -1212653763 - i_417_)) + (((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_])) * i_417_));
							int i_422_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_379_ + 1])) * (anInt6288 * -1212653763 - i_417_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_379_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_379_ + 1])) * i_417_);
							i_420_ = (i_421_ * (anInt6288 * -1212653763 - i_418_) + i_422_ * i_418_) >> anInt6289 * 20267538;
						}
						int i_423_ = (i << anInt6289 * -2137349879) + i_417_;
						int i_424_ = (i_379_ << anInt6289 * -2137349879) + i_418_;
						((Class13) class13).aShortArray157[i_416_] = (short) i_417_;
						((Class13) class13).aShortArray162[i_416_] = (short) i_418_;
						((Class13) class13).aShortArray161[i_416_] = (short) (method6340(i_423_, i_424_, -1593082213) + (is_380_ != null ? is_380_[i_416_] : 0));
						if (i_420_ < 0)
							i_420_ = 0;
						if (is_383_[i_416_] == 0) {
							if (is_384_ != null)
								((Class13) class13).anIntArray164[i_416_] = i_420_ << 25;
							else
								((Class13) class13).anIntArray164[i_416_] = 0;
						} else {
							int i_425_ = 0;
							if (is_382_ != null) {
								int i_426_ = (((Class13) class13).aShortArray165[i_416_] = (short) is_382_[i_416_]);
								if (class78.anInt725 * 1996750669 != 0) {
									i_425_ = 255 * i_426_ / (class78.anInt725 * 1996750669);
									if (i_425_ < 0)
										i_425_ = 0;
									else if (i_425_ > 255)
										i_425_ = 255;
								}
							}
							((Class13) class13).anIntArray164[i_416_] = (Class298_Sub32_Sub38.method3387(method6367(is_383_[i_416_] >> 8, i_420_), class78.anInt726 * -1212608691, i_425_, 2119536139));
							if (is_384_ != null)
								((Class13) class13).anIntArray164[i_416_] |= i_420_ << 25;
						}
					}
					boolean bool_427_ = false;
					for (int i_428_ = 0; i_428_ < ((Class13) class13).aShort167; i_428_++) {
						if (is_385_[i_428_ * 3] != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_385_[i_428_ * 3], 437593944).aBoolean524))
							bool_427_ = true;
					}
					if (is_384_ != null)
						((Class13) class13).anIntArray163 = new int[((Class13) class13).aShort167];
					if (bool_427_) {
						((Class13) class13).aShortArray166 = new short[((Class13) class13).aShort167];
						((Class13) class13).aShortArray160 = new short[((Class13) class13).aShort167];
					}
					for (int i_429_ = 0; i_429_ < ((Class13) class13).aShort167; i_429_++) {
						int i_430_ = i_429_ * 3;
						if (is_384_ != null && is_384_[i_430_] != 0)
							((Class13) class13).anIntArray163[i_429_] = is_384_[i_430_] >> 8;
						if (bool_427_) {
							int i_431_ = i_430_ + 1;
							int i_432_ = i_431_ + 1;
							boolean bool_433_ = false;
							boolean bool_434_ = true;
							int i_435_ = is_385_[i_430_];
							if (i_435_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_435_, 1926498774).aBoolean524))
								bool_434_ = false;
							else
								bool_433_ = true;
							i_435_ = is_385_[i_431_];
							if (i_435_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_435_, 1409820429).aBoolean524))
								bool_434_ = false;
							else
								bool_433_ = true;
							i_435_ = is_385_[i_432_];
							if (i_435_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_435_, 194423041).aBoolean524))
								bool_434_ = false;
							else
								bool_433_ = true;
							if (bool_434_) {
								((Class13) class13).aShortArray166[i_429_] = (short) i_435_;
								((Class13) class13).aShortArray160[i_429_] = (short) is_386_[i_430_];
							} else {
								if (bool_433_) {
									i_435_ = is_385_[i_430_];
									if (i_435_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_435_, 1212763495).aBoolean524))
										((Class13) class13).anIntArray164[i_430_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_435_, 126116111).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
									i_435_ = is_385_[i_431_];
									if (i_435_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_435_, 1723986111).aBoolean524))
										((Class13) class13).anIntArray164[i_431_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_435_, 733883645).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
									i_435_ = is_385_[i_432_];
									if (i_435_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_435_, 288250128).aBoolean524))
										((Class13) class13).anIntArray164[i_432_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_435_, 235996796).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
								}
								((Class13) class13).aShortArray166[i_429_] = (short) -1;
							}
						}
					}
					((Class_xa_Sub2) this).aClass13ArrayArray8494[i][i_379_] = class13;
				}
			}
		}
	}

	public void method6346(int i, int i_436_, int[] is, int[] is_437_, int[] is_438_, int[] is_439_, int[] is_440_, int[] is_441_, int[] is_442_, int[] is_443_, Class78 class78, boolean bool) {
		boolean bool_444_ = (((Class_xa_Sub2) this).anInt8492 & 0x20) == 0;
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 == null && !bool_444_) {
			((Class_xa_Sub2) this).aClass6ArrayArray8493 = new Class6[anInt6287 * -506105871][anInt6286 * -1148794921];
			((Class_xa_Sub2) this).aClass13ArrayArray8494 = new Class13[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (((Class_xa_Sub2) this).aClass17ArrayArray8515 == null && bool_444_)
			((Class_xa_Sub2) this).aClass17ArrayArray8515 = new Class17[anInt6287 * -506105871][anInt6286 * -1148794921];
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_445_ = 0; i_445_ < is_440_.length; i_445_++) {
				if (is_440_[i_445_] == -1)
					is_440_[i_445_] = 0;
				else
					is_440_[i_445_] = (Class379.anIntArray4096[(Class173.method1823(is_440_[i_445_], (byte) 0) & 0xffff)]) << 8 | 0xff;
			}
			if (is_441_ != null) {
				for (int i_446_ = 0; i_446_ < is_441_.length; i_446_++) {
					if (is_441_[i_446_] == -1)
						is_441_[i_446_] = 0;
					else
						is_441_[i_446_] = (Class379.anIntArray4096[(Class173.method1823(is_441_[i_446_], (byte) 0) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_444_) {
				Class17 class17 = new Class17();
				((Class17) class17).aShort234 = (short) is.length;
				((Class17) class17).aShort236 = (short) (is.length / 3);
				((Class17) class17).aShortArray235 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray241 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray243 = new short[((Class17) class17).aShort234];
				((Class17) class17).anIntArray237 = new int[((Class17) class17).aShort234];
				((Class17) class17).aShortArray239 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray240 = new short[((Class17) class17).aShort234];
				((Class17) class17).aByteArray242 = new byte[((Class17) class17).aShort234];
				if (is_439_ != null)
					((Class17) class17).aShortArray238 = new short[((Class17) class17).aShort234];
				for (int i_447_ = 0; i_447_ < ((Class17) class17).aShort234; i_447_++) {
					int i_448_ = is[i_447_];
					int i_449_ = is_438_[i_447_];
					boolean bool_450_ = false;
					int i_451_;
					if (i_448_ == 0 && i_449_ == 0)
						i_451_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_]));
					else if (i_448_ == 0 && i_449_ == anInt6288 * -1212653763)
						i_451_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_ + 1]));
					else if (i_448_ == anInt6288 * -1212653763 && i_449_ == anInt6288 * -1212653763)
						i_451_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_ + 1]));
					else if (i_448_ == anInt6288 * -1212653763 && i_449_ == 0)
						i_451_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_]));
					else {
						int i_452_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_])) * (anInt6288 * -1212653763 - i_448_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_])) * i_448_);
						int i_453_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_ + 1])) * (anInt6288 * -1212653763 - i_448_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_ + 1])) * i_448_);
						i_451_ = (i_452_ * (anInt6288 * -1212653763 - i_449_) + i_453_ * i_449_) >> anInt6289 * 20267538;
					}
					int i_454_ = (i << anInt6289 * -2137349879) + i_448_;
					int i_455_ = (i_436_ << anInt6289 * -2137349879) + i_449_;
					((Class17) class17).aShortArray235[i_447_] = (short) i_448_;
					((Class17) class17).aShortArray243[i_447_] = (short) i_449_;
					((Class17) class17).aShortArray241[i_447_] = (short) (method6340(i_454_, i_455_, -2056223292) + (is_437_ != null ? is_437_[i_447_] : 0));
					if (i_451_ < 0)
						i_451_ = 0;
					if (is_440_[i_447_] == 0) {
						((Class17) class17).anIntArray237[i_447_] = 0;
						if (is_441_ != null)
							((Class17) class17).aByteArray242[i_447_] = (byte) i_451_;
					} else {
						int i_456_ = 0;
						if (is_439_ != null) {
							int i_457_ = (((Class17) class17).aShortArray238[i_447_] = (short) is_439_[i_447_]);
							if (class78.anInt725 * 1996750669 != 0) {
								i_456_ = 255 * i_457_ / (class78.anInt725 * 1996750669);
								if (i_456_ < 0)
									i_456_ = 0;
								else if (i_456_ > 255)
									i_456_ = 255;
							}
						}
						int i_458_ = -16777216;
						if (is_442_[i_447_] != -1 && method6366(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_442_[i_447_], 1064315801).aByte529))
							i_458_ = -1694498816;
						((Class17) class17).anIntArray237[i_447_] = i_458_ | (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_447_] >> 8, i_451_), class78.anInt726 * -1212608691, i_456_, 1457043822));
						if (is_441_ != null)
							((Class17) class17).aByteArray242[i_447_] = (byte) i_451_;
					}
					((Class17) class17).aShortArray239[i_447_] = (short) is_442_[i_447_];
					((Class17) class17).aShortArray240[i_447_] = (short) is_443_[i_447_];
				}
				if (is_441_ != null)
					((Class17) class17).anIntArray233 = new int[((Class17) class17).aShort236];
				for (int i_459_ = 0; i_459_ < ((Class17) class17).aShort236; i_459_++) {
					int i_460_ = i_459_ * 3;
					if (is_441_ != null && is_441_[i_460_] != 0)
						((Class17) class17).anIntArray233[i_459_] = ~0xffffff | is_441_[i_460_] >> 8;
				}
				((Class_xa_Sub2) this).aClass17ArrayArray8515[i][i_436_] = class17;
			} else {
				boolean bool_461_ = true;
				int i_462_ = -1;
				int i_463_ = -1;
				int i_464_ = -1;
				int i_465_ = -1;
				if (is.length == 6) {
					for (int i_466_ = 0; i_466_ < 6; i_466_++) {
						if (is[i_466_] == 0 && is_438_[i_466_] == 0) {
							if (i_462_ != -1 && is_440_[i_462_] != is_440_[i_466_]) {
								bool_461_ = false;
								break;
							}
							i_462_ = i_466_;
						} else if (is[i_466_] == anInt6288 * -1212653763 && is_438_[i_466_] == 0) {
							if (i_463_ != -1 && is_440_[i_463_] != is_440_[i_466_]) {
								bool_461_ = false;
								break;
							}
							i_463_ = i_466_;
						} else if (is[i_466_] == anInt6288 * -1212653763 && (is_438_[i_466_] == anInt6288 * -1212653763)) {
							if (i_464_ != -1 && is_440_[i_464_] != is_440_[i_466_]) {
								bool_461_ = false;
								break;
							}
							i_464_ = i_466_;
						} else if (is[i_466_] == 0 && (is_438_[i_466_] == anInt6288 * -1212653763)) {
							if (i_465_ != -1 && is_440_[i_465_] != is_440_[i_466_]) {
								bool_461_ = false;
								break;
							}
							i_465_ = i_466_;
						}
					}
					if (i_462_ == -1 || i_463_ == -1 || i_464_ == -1 || i_465_ == -1)
						bool_461_ = false;
					if (bool_461_) {
						if (is_437_ != null) {
							for (int i_467_ = 0; i_467_ < 4; i_467_++) {
								if (is_437_[i_467_] != 0) {
									bool_461_ = false;
									break;
								}
							}
						}
						if (bool_461_) {
							for (int i_468_ = 1; i_468_ < 4; i_468_++) {
								if (is[i_468_] != is[0] && (is[i_468_] != is[0] + anInt6288 * -1212653763) && (is[i_468_] != is[0] - anInt6288 * -1212653763)) {
									bool_461_ = false;
									break;
								}
								if (is_438_[i_468_] != is_438_[0] && (is_438_[i_468_] != (is_438_[0] + anInt6288 * -1212653763)) && (is_438_[i_468_] != (is_438_[0] - anInt6288 * -1212653763))) {
									bool_461_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_461_ = false;
				if (bool_461_) {
					Class6 class6 = new Class6();
					int i_469_ = is_440_[0];
					int i_470_ = is_442_[0];
					if (is_441_ != null) {
						((Class6) class6).anInt90 = is_441_[0] >> 8;
						if (i_469_ == 0)
							((Class6) class6).aByte85 |= 0x2;
					} else if (i_469_ == 0)
						return;
					if ((anIntArrayArray6290[i][i_436_] == anIntArrayArray6290[i + 1][i_436_]) && (anIntArrayArray6290[i][i_436_] == anIntArrayArray6290[i + 1][i_436_ + 1]) && (anIntArrayArray6290[i][i_436_] == anIntArrayArray6290[i][i_436_ + 1]))
						((Class6) class6).aByte85 |= 0x1;
					if (i_470_ != -1 && (((Class6) class6).aByte85 & 0x2) == 0 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_470_, 877964845).aBoolean524)) {
						int i_471_;
						if (is_439_ != null && class78.anInt725 * 1996750669 != 0) {
							i_471_ = 255 * is_439_[i_462_] / (class78.anInt725 * 1996750669);
							if (i_471_ < 0)
								i_471_ = 0;
							else if (i_471_ > 255)
								i_471_ = 255;
						} else
							i_471_ = 0;
						((Class6) class6).anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_462_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_]))), class78.anInt726 * -1212608691, i_471_, 2014166016));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt82 |= (255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_])) << 25);
						if (is_439_ != null && class78.anInt725 * 1996750669 != 0) {
							i_471_ = 255 * is_439_[i_463_] / (class78.anInt725 * 1996750669);
							if (i_471_ < 0)
								i_471_ = 0;
							else if (i_471_ > 255)
								i_471_ = 255;
						} else
							i_471_ = 0;
						((Class6) class6).anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_463_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_]))), class78.anInt726 * -1212608691, i_471_, 1449289394));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt83 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_])) << 25;
						if (is_439_ != null && class78.anInt725 * 1996750669 != 0) {
							i_471_ = 255 * is_439_[i_464_] / (class78.anInt725 * 1996750669);
							if (i_471_ < 0)
								i_471_ = 0;
							else if (i_471_ > 255)
								i_471_ = 255;
						} else
							i_471_ = 0;
						((Class6) class6).anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_464_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_ + 1]))), class78.anInt726 * -1212608691, i_471_, 2027722285));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt81 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_ + 1])) << 25;
						if (is_439_ != null && class78.anInt725 * 1996750669 != 0) {
							i_471_ = 255 * is_439_[i_465_] / (class78.anInt725 * 1996750669);
							if (i_471_ < 0)
								i_471_ = 0;
							else if (i_471_ > 255)
								i_471_ = 255;
						} else
							i_471_ = 0;
						((Class6) class6).anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_465_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_ + 1]))), class78.anInt726 * -1212608691, i_471_, 1736085661));
						((Class6) class6).aShort91 = (short) i_470_;
					} else {
						int i_472_;
						if (is_439_ != null && class78.anInt725 * 1996750669 != 0) {
							i_472_ = 255 * is_439_[i_462_] / (class78.anInt725 * 1996750669);
							if (i_472_ < 0)
								i_472_ = 0;
							else if (i_472_ > 255)
								i_472_ = 255;
						} else
							i_472_ = 0;
						((Class6) class6).anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_462_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_]))), class78.anInt726 * -1212608691, i_472_, 1646809251));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt82 |= (255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_])) << 25);
						if (is_439_ != null && class78.anInt725 * 1996750669 != 0) {
							i_472_ = 255 * is_439_[i_463_] / (class78.anInt725 * 1996750669);
							if (i_472_ < 0)
								i_472_ = 0;
							else if (i_472_ > 255)
								i_472_ = 255;
						} else
							i_472_ = 0;
						((Class6) class6).anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_463_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_]))), class78.anInt726 * -1212608691, i_472_, 1494836787));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt83 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_])) << 25;
						if (is_439_ != null && class78.anInt725 * 1996750669 != 0) {
							i_472_ = 255 * is_439_[i_464_] / (class78.anInt725 * 1996750669);
							if (i_472_ < 0)
								i_472_ = 0;
							else if (i_472_ > 255)
								i_472_ = 255;
						} else
							i_472_ = 0;
						((Class6) class6).anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_464_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_ + 1]))), class78.anInt726 * -1212608691, i_472_, 1688257678));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt81 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_ + 1])) << 25;
						if (is_439_ != null && class78.anInt725 * 1996750669 != 0) {
							i_472_ = 255 * is_439_[i_465_] / (class78.anInt725 * 1996750669);
							if (i_472_ < 0)
								i_472_ = 0;
							else if (i_472_ > 255)
								i_472_ = 255;
						} else
							i_472_ = 0;
						((Class6) class6).anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_465_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_ + 1]))), class78.anInt726 * -1212608691, i_472_, 1726070019));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt89 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_ + 1])) << 25;
						((Class6) class6).aShort91 = (short) -1;
					}
					if (is_439_ != null) {
						((Class6) class6).aShort88 = (short) is_439_[i_464_];
						((Class6) class6).aShort86 = (short) is_439_[i_465_];
						((Class6) class6).aShort87 = (short) is_439_[i_463_];
						((Class6) class6).aShort84 = (short) is_439_[i_462_];
					}
					((Class_xa_Sub2) this).aClass6ArrayArray8493[i][i_436_] = class6;
				} else {
					Class13 class13 = new Class13();
					((Class13) class13).aShort158 = (short) is.length;
					((Class13) class13).aShort167 = (short) (is.length / 3);
					((Class13) class13).aShortArray157 = new short[((Class13) class13).aShort158];
					((Class13) class13).aShortArray161 = new short[((Class13) class13).aShort158];
					((Class13) class13).aShortArray162 = new short[((Class13) class13).aShort158];
					((Class13) class13).anIntArray164 = new int[((Class13) class13).aShort158];
					if (is_439_ != null)
						((Class13) class13).aShortArray165 = new short[((Class13) class13).aShort158];
					for (int i_473_ = 0; i_473_ < ((Class13) class13).aShort158; i_473_++) {
						int i_474_ = is[i_473_];
						int i_475_ = is_438_[i_473_];
						boolean bool_476_ = false;
						int i_477_;
						if (i_474_ == 0 && i_475_ == 0)
							i_477_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_]));
						else if (i_474_ == 0 && i_475_ == anInt6288 * -1212653763)
							i_477_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_ + 1]));
						else if (i_474_ == anInt6288 * -1212653763 && i_475_ == anInt6288 * -1212653763)
							i_477_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_ + 1]));
						else if (i_474_ == anInt6288 * -1212653763 && i_475_ == 0)
							i_477_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_]));
						else {
							int i_478_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_])) * (anInt6288 * -1212653763 - i_474_)) + (((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_])) * i_474_));
							int i_479_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_436_ + 1])) * (anInt6288 * -1212653763 - i_474_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_436_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_436_ + 1])) * i_474_);
							i_477_ = (i_478_ * (anInt6288 * -1212653763 - i_475_) + i_479_ * i_475_) >> anInt6289 * 20267538;
						}
						int i_480_ = (i << anInt6289 * -2137349879) + i_474_;
						int i_481_ = (i_436_ << anInt6289 * -2137349879) + i_475_;
						((Class13) class13).aShortArray157[i_473_] = (short) i_474_;
						((Class13) class13).aShortArray162[i_473_] = (short) i_475_;
						((Class13) class13).aShortArray161[i_473_] = (short) (method6340(i_480_, i_481_, -1384967448) + (is_437_ != null ? is_437_[i_473_] : 0));
						if (i_477_ < 0)
							i_477_ = 0;
						if (is_440_[i_473_] == 0) {
							if (is_441_ != null)
								((Class13) class13).anIntArray164[i_473_] = i_477_ << 25;
							else
								((Class13) class13).anIntArray164[i_473_] = 0;
						} else {
							int i_482_ = 0;
							if (is_439_ != null) {
								int i_483_ = (((Class13) class13).aShortArray165[i_473_] = (short) is_439_[i_473_]);
								if (class78.anInt725 * 1996750669 != 0) {
									i_482_ = 255 * i_483_ / (class78.anInt725 * 1996750669);
									if (i_482_ < 0)
										i_482_ = 0;
									else if (i_482_ > 255)
										i_482_ = 255;
								}
							}
							((Class13) class13).anIntArray164[i_473_] = (Class298_Sub32_Sub38.method3387(method6367(is_440_[i_473_] >> 8, i_477_), class78.anInt726 * -1212608691, i_482_, 1828406784));
							if (is_441_ != null)
								((Class13) class13).anIntArray164[i_473_] |= i_477_ << 25;
						}
					}
					boolean bool_484_ = false;
					for (int i_485_ = 0; i_485_ < ((Class13) class13).aShort167; i_485_++) {
						if (is_442_[i_485_ * 3] != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_442_[i_485_ * 3], 1735356467).aBoolean524))
							bool_484_ = true;
					}
					if (is_441_ != null)
						((Class13) class13).anIntArray163 = new int[((Class13) class13).aShort167];
					if (bool_484_) {
						((Class13) class13).aShortArray166 = new short[((Class13) class13).aShort167];
						((Class13) class13).aShortArray160 = new short[((Class13) class13).aShort167];
					}
					for (int i_486_ = 0; i_486_ < ((Class13) class13).aShort167; i_486_++) {
						int i_487_ = i_486_ * 3;
						if (is_441_ != null && is_441_[i_487_] != 0)
							((Class13) class13).anIntArray163[i_486_] = is_441_[i_487_] >> 8;
						if (bool_484_) {
							int i_488_ = i_487_ + 1;
							int i_489_ = i_488_ + 1;
							boolean bool_490_ = false;
							boolean bool_491_ = true;
							int i_492_ = is_442_[i_487_];
							if (i_492_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_492_, 1509673183).aBoolean524))
								bool_491_ = false;
							else
								bool_490_ = true;
							i_492_ = is_442_[i_488_];
							if (i_492_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_492_, 1797633713).aBoolean524))
								bool_491_ = false;
							else
								bool_490_ = true;
							i_492_ = is_442_[i_489_];
							if (i_492_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_492_, 858725008).aBoolean524))
								bool_491_ = false;
							else
								bool_490_ = true;
							if (bool_491_) {
								((Class13) class13).aShortArray166[i_486_] = (short) i_492_;
								((Class13) class13).aShortArray160[i_486_] = (short) is_443_[i_487_];
							} else {
								if (bool_490_) {
									i_492_ = is_442_[i_487_];
									if (i_492_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_492_, 1600359220).aBoolean524))
										((Class13) class13).anIntArray164[i_487_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_492_, 221958675).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
									i_492_ = is_442_[i_488_];
									if (i_492_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_492_, 1243444825).aBoolean524))
										((Class13) class13).anIntArray164[i_488_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_492_, 402575610).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
									i_492_ = is_442_[i_489_];
									if (i_492_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_492_, 956050141).aBoolean524))
										((Class13) class13).anIntArray164[i_489_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_492_, 130835557).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
								}
								((Class13) class13).aShortArray166[i_486_] = (short) -1;
							}
						}
					}
					((Class_xa_Sub2) this).aClass13ArrayArray8494[i][i_436_] = class13;
				}
			}
		}
	}

	public void method6345(int i, int i_493_, int[] is, int[] is_494_, int[] is_495_, int[] is_496_, int[] is_497_, int[] is_498_, int[] is_499_, int[] is_500_, Class78 class78, boolean bool) {
		boolean bool_501_ = (((Class_xa_Sub2) this).anInt8492 & 0x20) == 0;
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 == null && !bool_501_) {
			((Class_xa_Sub2) this).aClass6ArrayArray8493 = new Class6[anInt6287 * -506105871][anInt6286 * -1148794921];
			((Class_xa_Sub2) this).aClass13ArrayArray8494 = new Class13[anInt6287 * -506105871][anInt6286 * -1148794921];
		} else if (((Class_xa_Sub2) this).aClass17ArrayArray8515 == null && bool_501_)
			((Class_xa_Sub2) this).aClass17ArrayArray8515 = new Class17[anInt6287 * -506105871][anInt6286 * -1148794921];
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_502_ = 0; i_502_ < is_497_.length; i_502_++) {
				if (is_497_[i_502_] == -1)
					is_497_[i_502_] = 0;
				else
					is_497_[i_502_] = (Class379.anIntArray4096[(Class173.method1823(is_497_[i_502_], (byte) 0) & 0xffff)]) << 8 | 0xff;
			}
			if (is_498_ != null) {
				for (int i_503_ = 0; i_503_ < is_498_.length; i_503_++) {
					if (is_498_[i_503_] == -1)
						is_498_[i_503_] = 0;
					else
						is_498_[i_503_] = (Class379.anIntArray4096[(Class173.method1823(is_498_[i_503_], (byte) 0) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_501_) {
				Class17 class17 = new Class17();
				((Class17) class17).aShort234 = (short) is.length;
				((Class17) class17).aShort236 = (short) (is.length / 3);
				((Class17) class17).aShortArray235 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray241 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray243 = new short[((Class17) class17).aShort234];
				((Class17) class17).anIntArray237 = new int[((Class17) class17).aShort234];
				((Class17) class17).aShortArray239 = new short[((Class17) class17).aShort234];
				((Class17) class17).aShortArray240 = new short[((Class17) class17).aShort234];
				((Class17) class17).aByteArray242 = new byte[((Class17) class17).aShort234];
				if (is_496_ != null)
					((Class17) class17).aShortArray238 = new short[((Class17) class17).aShort234];
				for (int i_504_ = 0; i_504_ < ((Class17) class17).aShort234; i_504_++) {
					int i_505_ = is[i_504_];
					int i_506_ = is_495_[i_504_];
					boolean bool_507_ = false;
					int i_508_;
					if (i_505_ == 0 && i_506_ == 0)
						i_508_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_]));
					else if (i_505_ == 0 && i_506_ == anInt6288 * -1212653763)
						i_508_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_ + 1]));
					else if (i_505_ == anInt6288 * -1212653763 && i_506_ == anInt6288 * -1212653763)
						i_508_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_ + 1]));
					else if (i_505_ == anInt6288 * -1212653763 && i_506_ == 0)
						i_508_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_]));
					else {
						int i_509_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_])) * (anInt6288 * -1212653763 - i_505_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_])) * i_505_);
						int i_510_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_ + 1])) * (anInt6288 * -1212653763 - i_505_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_ + 1])) * i_505_);
						i_508_ = (i_509_ * (anInt6288 * -1212653763 - i_506_) + i_510_ * i_506_) >> anInt6289 * 20267538;
					}
					int i_511_ = (i << anInt6289 * -2137349879) + i_505_;
					int i_512_ = (i_493_ << anInt6289 * -2137349879) + i_506_;
					((Class17) class17).aShortArray235[i_504_] = (short) i_505_;
					((Class17) class17).aShortArray243[i_504_] = (short) i_506_;
					((Class17) class17).aShortArray241[i_504_] = (short) (method6340(i_511_, i_512_, -1431096124) + (is_494_ != null ? is_494_[i_504_] : 0));
					if (i_508_ < 0)
						i_508_ = 0;
					if (is_497_[i_504_] == 0) {
						((Class17) class17).anIntArray237[i_504_] = 0;
						if (is_498_ != null)
							((Class17) class17).aByteArray242[i_504_] = (byte) i_508_;
					} else {
						int i_513_ = 0;
						if (is_496_ != null) {
							int i_514_ = (((Class17) class17).aShortArray238[i_504_] = (short) is_496_[i_504_]);
							if (class78.anInt725 * 1996750669 != 0) {
								i_513_ = 255 * i_514_ / (class78.anInt725 * 1996750669);
								if (i_513_ < 0)
									i_513_ = 0;
								else if (i_513_ > 255)
									i_513_ = 255;
							}
						}
						int i_515_ = -16777216;
						if (is_499_[i_504_] != -1 && method6366(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_499_[i_504_], 1642098791).aByte529))
							i_515_ = -1694498816;
						((Class17) class17).anIntArray237[i_504_] = i_515_ | (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_504_] >> 8, i_508_), class78.anInt726 * -1212608691, i_513_, 1894029973));
						if (is_498_ != null)
							((Class17) class17).aByteArray242[i_504_] = (byte) i_508_;
					}
					((Class17) class17).aShortArray239[i_504_] = (short) is_499_[i_504_];
					((Class17) class17).aShortArray240[i_504_] = (short) is_500_[i_504_];
				}
				if (is_498_ != null)
					((Class17) class17).anIntArray233 = new int[((Class17) class17).aShort236];
				for (int i_516_ = 0; i_516_ < ((Class17) class17).aShort236; i_516_++) {
					int i_517_ = i_516_ * 3;
					if (is_498_ != null && is_498_[i_517_] != 0)
						((Class17) class17).anIntArray233[i_516_] = ~0xffffff | is_498_[i_517_] >> 8;
				}
				((Class_xa_Sub2) this).aClass17ArrayArray8515[i][i_493_] = class17;
			} else {
				boolean bool_518_ = true;
				int i_519_ = -1;
				int i_520_ = -1;
				int i_521_ = -1;
				int i_522_ = -1;
				if (is.length == 6) {
					for (int i_523_ = 0; i_523_ < 6; i_523_++) {
						if (is[i_523_] == 0 && is_495_[i_523_] == 0) {
							if (i_519_ != -1 && is_497_[i_519_] != is_497_[i_523_]) {
								bool_518_ = false;
								break;
							}
							i_519_ = i_523_;
						} else if (is[i_523_] == anInt6288 * -1212653763 && is_495_[i_523_] == 0) {
							if (i_520_ != -1 && is_497_[i_520_] != is_497_[i_523_]) {
								bool_518_ = false;
								break;
							}
							i_520_ = i_523_;
						} else if (is[i_523_] == anInt6288 * -1212653763 && (is_495_[i_523_] == anInt6288 * -1212653763)) {
							if (i_521_ != -1 && is_497_[i_521_] != is_497_[i_523_]) {
								bool_518_ = false;
								break;
							}
							i_521_ = i_523_;
						} else if (is[i_523_] == 0 && (is_495_[i_523_] == anInt6288 * -1212653763)) {
							if (i_522_ != -1 && is_497_[i_522_] != is_497_[i_523_]) {
								bool_518_ = false;
								break;
							}
							i_522_ = i_523_;
						}
					}
					if (i_519_ == -1 || i_520_ == -1 || i_521_ == -1 || i_522_ == -1)
						bool_518_ = false;
					if (bool_518_) {
						if (is_494_ != null) {
							for (int i_524_ = 0; i_524_ < 4; i_524_++) {
								if (is_494_[i_524_] != 0) {
									bool_518_ = false;
									break;
								}
							}
						}
						if (bool_518_) {
							for (int i_525_ = 1; i_525_ < 4; i_525_++) {
								if (is[i_525_] != is[0] && (is[i_525_] != is[0] + anInt6288 * -1212653763) && (is[i_525_] != is[0] - anInt6288 * -1212653763)) {
									bool_518_ = false;
									break;
								}
								if (is_495_[i_525_] != is_495_[0] && (is_495_[i_525_] != (is_495_[0] + anInt6288 * -1212653763)) && (is_495_[i_525_] != (is_495_[0] - anInt6288 * -1212653763))) {
									bool_518_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_518_ = false;
				if (bool_518_) {
					Class6 class6 = new Class6();
					int i_526_ = is_497_[0];
					int i_527_ = is_499_[0];
					if (is_498_ != null) {
						((Class6) class6).anInt90 = is_498_[0] >> 8;
						if (i_526_ == 0)
							((Class6) class6).aByte85 |= 0x2;
					} else if (i_526_ == 0)
						return;
					if ((anIntArrayArray6290[i][i_493_] == anIntArrayArray6290[i + 1][i_493_]) && (anIntArrayArray6290[i][i_493_] == anIntArrayArray6290[i + 1][i_493_ + 1]) && (anIntArrayArray6290[i][i_493_] == anIntArrayArray6290[i][i_493_ + 1]))
						((Class6) class6).aByte85 |= 0x1;
					if (i_527_ != -1 && (((Class6) class6).aByte85 & 0x2) == 0 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_527_, 1879191473).aBoolean524)) {
						int i_528_;
						if (is_496_ != null && class78.anInt725 * 1996750669 != 0) {
							i_528_ = 255 * is_496_[i_519_] / (class78.anInt725 * 1996750669);
							if (i_528_ < 0)
								i_528_ = 0;
							else if (i_528_ > 255)
								i_528_ = 255;
						} else
							i_528_ = 0;
						((Class6) class6).anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_519_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_]))), class78.anInt726 * -1212608691, i_528_, 1823240106));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt82 |= (255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_])) << 25);
						if (is_496_ != null && class78.anInt725 * 1996750669 != 0) {
							i_528_ = 255 * is_496_[i_520_] / (class78.anInt725 * 1996750669);
							if (i_528_ < 0)
								i_528_ = 0;
							else if (i_528_ > 255)
								i_528_ = 255;
						} else
							i_528_ = 0;
						((Class6) class6).anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_520_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_]))), class78.anInt726 * -1212608691, i_528_, 1716238340));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt83 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_])) << 25;
						if (is_496_ != null && class78.anInt725 * 1996750669 != 0) {
							i_528_ = 255 * is_496_[i_521_] / (class78.anInt725 * 1996750669);
							if (i_528_ < 0)
								i_528_ = 0;
							else if (i_528_ > 255)
								i_528_ = 255;
						} else
							i_528_ = 0;
						((Class6) class6).anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_521_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_ + 1]))), class78.anInt726 * -1212608691, i_528_, 1430345602));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt81 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_ + 1])) << 25;
						if (is_496_ != null && class78.anInt725 * 1996750669 != 0) {
							i_528_ = 255 * is_496_[i_522_] / (class78.anInt725 * 1996750669);
							if (i_528_ < 0)
								i_528_ = 0;
							else if (i_528_ > 255)
								i_528_ = 255;
						} else
							i_528_ = 0;
						((Class6) class6).anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_522_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_ + 1]))), class78.anInt726 * -1212608691, i_528_, 1660945313));
						((Class6) class6).aShort91 = (short) i_527_;
					} else {
						int i_529_;
						if (is_496_ != null && class78.anInt725 * 1996750669 != 0) {
							i_529_ = 255 * is_496_[i_519_] / (class78.anInt725 * 1996750669);
							if (i_529_ < 0)
								i_529_ = 0;
							else if (i_529_ > 255)
								i_529_ = 255;
						} else
							i_529_ = 0;
						((Class6) class6).anInt82 = (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_519_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_]))), class78.anInt726 * -1212608691, i_529_, 1728630425));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt82 |= (255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_])) << 25);
						if (is_496_ != null && class78.anInt725 * 1996750669 != 0) {
							i_529_ = 255 * is_496_[i_520_] / (class78.anInt725 * 1996750669);
							if (i_529_ < 0)
								i_529_ = 0;
							else if (i_529_ > 255)
								i_529_ = 255;
						} else
							i_529_ = 0;
						((Class6) class6).anInt83 = (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_520_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_]))), class78.anInt726 * -1212608691, i_529_, 1920320730));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt83 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_])) << 25;
						if (is_496_ != null && class78.anInt725 * 1996750669 != 0) {
							i_529_ = 255 * is_496_[i_521_] / (class78.anInt725 * 1996750669);
							if (i_529_ < 0)
								i_529_ = 0;
							else if (i_529_ > 255)
								i_529_ = 255;
						} else
							i_529_ = 0;
						((Class6) class6).anInt81 = (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_521_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_ + 1]))), class78.anInt726 * -1212608691, i_529_, 1751085912));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt81 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_ + 1])) << 25;
						if (is_496_ != null && class78.anInt725 * 1996750669 != 0) {
							i_529_ = 255 * is_496_[i_522_] / (class78.anInt725 * 1996750669);
							if (i_529_ < 0)
								i_529_ = 0;
							else if (i_529_ > 255)
								i_529_ = 255;
						} else
							i_529_ = 0;
						((Class6) class6).anInt89 = (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_522_] >> 8, ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_ + 1]))), class78.anInt726 * -1212608691, i_529_, 1650127448));
						if (((Class6) class6).anInt90 != 0)
							((Class6) class6).anInt89 |= 255 - ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_ + 1])) << 25;
						((Class6) class6).aShort91 = (short) -1;
					}
					if (is_496_ != null) {
						((Class6) class6).aShort88 = (short) is_496_[i_521_];
						((Class6) class6).aShort86 = (short) is_496_[i_522_];
						((Class6) class6).aShort87 = (short) is_496_[i_520_];
						((Class6) class6).aShort84 = (short) is_496_[i_519_];
					}
					((Class_xa_Sub2) this).aClass6ArrayArray8493[i][i_493_] = class6;
				} else {
					Class13 class13 = new Class13();
					((Class13) class13).aShort158 = (short) is.length;
					((Class13) class13).aShort167 = (short) (is.length / 3);
					((Class13) class13).aShortArray157 = new short[((Class13) class13).aShort158];
					((Class13) class13).aShortArray161 = new short[((Class13) class13).aShort158];
					((Class13) class13).aShortArray162 = new short[((Class13) class13).aShort158];
					((Class13) class13).anIntArray164 = new int[((Class13) class13).aShort158];
					if (is_496_ != null)
						((Class13) class13).aShortArray165 = new short[((Class13) class13).aShort158];
					for (int i_530_ = 0; i_530_ < ((Class13) class13).aShort158; i_530_++) {
						int i_531_ = is[i_530_];
						int i_532_ = is_495_[i_530_];
						boolean bool_533_ = false;
						int i_534_;
						if (i_531_ == 0 && i_532_ == 0)
							i_534_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_]));
						else if (i_531_ == 0 && i_532_ == anInt6288 * -1212653763)
							i_534_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_ + 1]));
						else if (i_531_ == anInt6288 * -1212653763 && i_532_ == anInt6288 * -1212653763)
							i_534_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_ + 1]));
						else if (i_531_ == anInt6288 * -1212653763 && i_532_ == 0)
							i_534_ = ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_]));
						else {
							int i_535_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_])) * (anInt6288 * -1212653763 - i_531_)) + (((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_])) * i_531_));
							int i_536_ = ((((((Class_xa_Sub2) this).aByteArrayArray8512[i][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i][i_493_ + 1])) * (anInt6288 * -1212653763 - i_531_)) + ((((Class_xa_Sub2) this).aByteArrayArray8512[i + 1][i_493_ + 1]) - (((Class_xa_Sub2) this).aByteArrayArray8513[i + 1][i_493_ + 1])) * i_531_);
							i_534_ = (i_535_ * (anInt6288 * -1212653763 - i_532_) + i_536_ * i_532_) >> anInt6289 * 20267538;
						}
						int i_537_ = (i << anInt6289 * -2137349879) + i_531_;
						int i_538_ = (i_493_ << anInt6289 * -2137349879) + i_532_;
						((Class13) class13).aShortArray157[i_530_] = (short) i_531_;
						((Class13) class13).aShortArray162[i_530_] = (short) i_532_;
						((Class13) class13).aShortArray161[i_530_] = (short) (method6340(i_537_, i_538_, -1932766126) + (is_494_ != null ? is_494_[i_530_] : 0));
						if (i_534_ < 0)
							i_534_ = 0;
						if (is_497_[i_530_] == 0) {
							if (is_498_ != null)
								((Class13) class13).anIntArray164[i_530_] = i_534_ << 25;
							else
								((Class13) class13).anIntArray164[i_530_] = 0;
						} else {
							int i_539_ = 0;
							if (is_496_ != null) {
								int i_540_ = (((Class13) class13).aShortArray165[i_530_] = (short) is_496_[i_530_]);
								if (class78.anInt725 * 1996750669 != 0) {
									i_539_ = 255 * i_540_ / (class78.anInt725 * 1996750669);
									if (i_539_ < 0)
										i_539_ = 0;
									else if (i_539_ > 255)
										i_539_ = 255;
								}
							}
							((Class13) class13).anIntArray164[i_530_] = (Class298_Sub32_Sub38.method3387(method6367(is_497_[i_530_] >> 8, i_534_), class78.anInt726 * -1212608691, i_539_, 1730023012));
							if (is_498_ != null)
								((Class13) class13).anIntArray164[i_530_] |= i_534_ << 25;
						}
					}
					boolean bool_541_ = false;
					for (int i_542_ = 0; i_542_ < ((Class13) class13).aShort167; i_542_++) {
						if (is_499_[i_542_ * 3] != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(is_499_[i_542_ * 3], 446327197).aBoolean524))
							bool_541_ = true;
					}
					if (is_498_ != null)
						((Class13) class13).anIntArray163 = new int[((Class13) class13).aShort167];
					if (bool_541_) {
						((Class13) class13).aShortArray166 = new short[((Class13) class13).aShort167];
						((Class13) class13).aShortArray160 = new short[((Class13) class13).aShort167];
					}
					for (int i_543_ = 0; i_543_ < ((Class13) class13).aShort167; i_543_++) {
						int i_544_ = i_543_ * 3;
						if (is_498_ != null && is_498_[i_544_] != 0)
							((Class13) class13).anIntArray163[i_543_] = is_498_[i_544_] >> 8;
						if (bool_541_) {
							int i_545_ = i_544_ + 1;
							int i_546_ = i_545_ + 1;
							boolean bool_547_ = false;
							boolean bool_548_ = true;
							int i_549_ = is_499_[i_544_];
							if (i_549_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_549_, 128967240).aBoolean524))
								bool_548_ = false;
							else
								bool_547_ = true;
							i_549_ = is_499_[i_545_];
							if (i_549_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_549_, 1235125716).aBoolean524))
								bool_548_ = false;
							else
								bool_547_ = true;
							i_549_ = is_499_[i_546_];
							if (i_549_ == -1 || (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_549_, 1067305886).aBoolean524))
								bool_548_ = false;
							else
								bool_547_ = true;
							if (bool_548_) {
								((Class13) class13).aShortArray166[i_543_] = (short) i_549_;
								((Class13) class13).aShortArray160[i_543_] = (short) is_500_[i_544_];
							} else {
								if (bool_547_) {
									i_549_ = is_499_[i_544_];
									if (i_549_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_549_, 1218075250).aBoolean524))
										((Class13) class13).anIntArray164[i_544_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_549_, 898008414).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
									i_549_ = is_499_[i_545_];
									if (i_549_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_549_, 1191420617).aBoolean524))
										((Class13) class13).anIntArray164[i_545_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_549_, 1207038980).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
									i_549_ = is_499_[i_546_];
									if (i_549_ != -1 && !(((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_549_, 2140358678).aBoolean524))
										((Class13) class13).anIntArray164[i_546_] = (Class379.anIntArray4096[(Class173.method1823((((Class_xa_Sub2) this).aClass_ra_Sub1_8484.anInterface_ma5299.method174(i_549_, 1452984161).aShort532) & 0xffff, (byte) 0)) & 0xffff]);
								}
								((Class13) class13).aShortArray166[i_543_] = (short) -1;
							}
						}
					}
					((Class_xa_Sub2) this).aClass13ArrayArray8494[i][i_493_] = class13;
				}
			}
		}
	}

	public void h() {
		((Class_xa_Sub2) this).aByteArrayArray8512 = null;
		((Class_xa_Sub2) this).aByteArrayArray8513 = null;
	}

	public void method6339(int i, int i_550_, int i_551_, int i_552_, int i_553_, int i_554_, int i_555_, boolean[][] bools) {
		Class15 class15 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5202(Thread.currentThread());
		Class2 class2 = ((Class15) class15).aClass2_192;
		((Class2) class2).anInt19 = 0;
		((Class2) class2).aBoolean20 = true;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5198();
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			method6373(i, i_550_, i_551_, i_552_, i_553_, i_554_, i_555_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			method6371(i, i_550_, i_551_, i_552_, i_553_, i_554_, i_555_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
	}

	public void method6348(int i, int i_556_, int i_557_, boolean[][] bools, boolean bool, int i_558_) {
		if ((((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).anIntArray7967) == null || (((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).aFloatArray7973) == null)
			throw new IllegalStateException("");
		Matrix4f class233 = (((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).aClass233_7987);
		((Class_xa_Sub2) this).aFloat8499 = class233.aFloatArray2594[0];
		((Class_xa_Sub2) this).aFloat8497 = class233.aFloatArray2594[1];
		((Class_xa_Sub2) this).aFloat8498 = class233.aFloatArray2594[2];
		((Class_xa_Sub2) this).aFloat8485 = class233.aFloatArray2594[3];
		((Class_xa_Sub2) this).aFloat8500 = class233.aFloatArray2594[4];
		((Class_xa_Sub2) this).aFloat8501 = class233.aFloatArray2594[5];
		((Class_xa_Sub2) this).aFloat8502 = class233.aFloatArray2594[6];
		((Class_xa_Sub2) this).aFloat8486 = class233.aFloatArray2594[7];
		((Class_xa_Sub2) this).aFloat8504 = class233.aFloatArray2594[8];
		((Class_xa_Sub2) this).aFloat8505 = class233.aFloatArray2594[9];
		((Class_xa_Sub2) this).aFloat8506 = class233.aFloatArray2594[10];
		((Class_xa_Sub2) this).aFloat8507 = class233.aFloatArray2594[11];
		((Class_xa_Sub2) this).aFloat8508 = class233.aFloatArray2594[12];
		((Class_xa_Sub2) this).aFloat8509 = class233.aFloatArray2594[13];
		((Class_xa_Sub2) this).aFloat8510 = class233.aFloatArray2594[14];
		((Class_xa_Sub2) this).aFloat8511 = class233.aFloatArray2594[15];
		for (int i_559_ = 0; i_559_ < i_557_ + i_557_; i_559_++) {
			for (int i_560_ = 0; i_560_ < i_557_ + i_557_; i_560_++) {
				if (bools[i_559_][i_560_]) {
					int i_561_ = i - i_557_ + i_559_;
					int i_562_ = i_556_ - i_557_ + i_560_;
					if (i_561_ >= 0 && i_561_ < anInt6287 * -506105871 && i_562_ >= 0 && i_562_ < anInt6286 * -1148794921)
						method6368(i_561_, i_562_, i_558_);
				}
			}
		}
	}

	public void av(Class_na class_na, int i, int i_563_, int i_564_, int i_565_, boolean bool) {
		/* empty */
	}

	Class_xa_Sub2(Class_ra_Sub1 class_ra_sub1, int i, int i_566_, int i_567_, int i_568_, int[][] is, int[][] is_569_, int i_570_) {
		super(i_567_, i_568_, i_570_, is);
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484 = class_ra_sub1;
		((Class_xa_Sub2) this).anInt8492 = i_566_;
		((Class_xa_Sub2) this).aByteArrayArray8512 = new byte[i_567_ + 1][i_568_ + 1];
		int i_571_ = ((((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).anInt7983) * -697249431 >> 9);
		for (int i_572_ = 1; i_572_ < i_568_; i_572_++) {
			for (int i_573_ = 1; i_573_ < i_567_; i_573_++) {
				int i_574_ = i_571_;
				int i_575_ = (is_569_[i_573_ + 1][i_572_] - is_569_[i_573_ - 1][i_572_]);
				int i_576_ = (is_569_[i_573_][i_572_ + 1] - is_569_[i_573_][i_572_ - 1]);
				int i_577_ = (int) Math.sqrt((double) (i_575_ * i_575_ + 512 * i_570_ + i_576_ * i_576_));
				int i_578_ = (i_575_ << 8) / i_577_;
				int i_579_ = -512 * i_570_ / i_577_;
				int i_580_ = (i_576_ << 8) / i_577_;
				i_574_ += ((((Class_ra_Sub1) (((Class_xa_Sub2) this).aClass_ra_Sub1_8484)).anInt7978 * 760881147 * i_578_) + (((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).anInt7979) * -181413563 * i_579_ + (((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).anInt7981) * -1601750017 * i_580_) >> 17;
				i_574_ >>= 1;
				if (i_574_ < 2)
					i_574_ = 2;
				else if (i_574_ > 126)
					i_574_ = 126;
				((Class_xa_Sub2) this).aByteArrayArray8512[i_573_][i_572_] = (byte) i_574_;
			}
		}
		((Class_xa_Sub2) this).aByteArrayArray8513 = new byte[i_567_ + 1][i_568_ + 1];
	}

	public void method6338(int i, int i_581_, int i_582_, boolean[][] bools, boolean bool, int i_583_) {
		if ((((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).anIntArray7967) == null || (((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).aFloatArray7973) == null)
			throw new IllegalStateException("");
		Matrix4f class233 = (((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).aClass233_7987);
		((Class_xa_Sub2) this).aFloat8499 = class233.aFloatArray2594[0];
		((Class_xa_Sub2) this).aFloat8497 = class233.aFloatArray2594[1];
		((Class_xa_Sub2) this).aFloat8498 = class233.aFloatArray2594[2];
		((Class_xa_Sub2) this).aFloat8485 = class233.aFloatArray2594[3];
		((Class_xa_Sub2) this).aFloat8500 = class233.aFloatArray2594[4];
		((Class_xa_Sub2) this).aFloat8501 = class233.aFloatArray2594[5];
		((Class_xa_Sub2) this).aFloat8502 = class233.aFloatArray2594[6];
		((Class_xa_Sub2) this).aFloat8486 = class233.aFloatArray2594[7];
		((Class_xa_Sub2) this).aFloat8504 = class233.aFloatArray2594[8];
		((Class_xa_Sub2) this).aFloat8505 = class233.aFloatArray2594[9];
		((Class_xa_Sub2) this).aFloat8506 = class233.aFloatArray2594[10];
		((Class_xa_Sub2) this).aFloat8507 = class233.aFloatArray2594[11];
		((Class_xa_Sub2) this).aFloat8508 = class233.aFloatArray2594[12];
		((Class_xa_Sub2) this).aFloat8509 = class233.aFloatArray2594[13];
		((Class_xa_Sub2) this).aFloat8510 = class233.aFloatArray2594[14];
		((Class_xa_Sub2) this).aFloat8511 = class233.aFloatArray2594[15];
		for (int i_584_ = 0; i_584_ < i_582_ + i_582_; i_584_++) {
			for (int i_585_ = 0; i_585_ < i_582_ + i_582_; i_585_++) {
				if (bools[i_584_][i_585_]) {
					int i_586_ = i - i_582_ + i_584_;
					int i_587_ = i_581_ - i_582_ + i_585_;
					if (i_586_ >= 0 && i_586_ < anInt6287 * -506105871 && i_587_ >= 0 && i_587_ < anInt6286 * -1148794921)
						method6368(i_586_, i_587_, i_583_);
				}
			}
		}
	}

	void method6372(int i, int i_588_, Class2 class2, float[] fs, float[] fs_589_, float[] fs_590_, float[] fs_591_, float[] fs_592_, int i_593_) {
		Class20 class20 = ((Class_xa_Sub2) this).aClass20ArrayArray8491[i][i_588_];
		if (class20 != null) {
			if ((((Class20) class20).aByte268 & 0x2) == 0) {
				if (i_593_ != 0) {
					if ((((Class20) class20).aByte268 & 0x4) != 0) {
						if ((i_593_ & 0x1) != 0)
							return;
					} else if ((i_593_ & 0x2) != 0)
						return;
				}
				int i_594_ = i * (anInt6288 * -1212653763);
				int i_595_ = i_594_ + anInt6288 * -1212653763;
				int i_596_ = i_588_ * (anInt6288 * -1212653763);
				int i_597_ = i_596_ + anInt6288 * -1212653763;
				float f;
				float f_598_;
				float f_599_;
				float f_600_;
				float f_601_;
				float f_602_;
				float f_603_;
				float f_604_;
				float f_605_;
				float f_606_;
				float f_607_;
				float f_608_;
				float f_609_;
				float f_610_;
				float f_611_;
				float f_612_;
				if ((((Class20) class20).aByte268 & 0x1) != 0) {
					int i_613_ = anIntArrayArray6290[i][i_588_];
					float f_614_ = ((Class_xa_Sub2) this).aFloat8502 * (float) i_613_;
					float f_615_ = ((Class_xa_Sub2) this).aFloat8486 * (float) i_613_;
					float f_616_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_594_) + f_614_ + (((Class_xa_Sub2) this).aFloat8506 * (float) i_596_)));
					f = (((Class_xa_Sub2) this).aFloat8511 + (((Class_xa_Sub2) this).aFloat8485 * (float) i_594_ + f_615_ + (((Class_xa_Sub2) this).aFloat8507 * (float) i_596_)));
					if (f_616_ < -f)
						return;
					float f_617_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_595_) + f_614_ + (((Class_xa_Sub2) this).aFloat8506 * (float) i_596_)));
					f_598_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_595_) + f_615_ + (((Class_xa_Sub2) this).aFloat8507 * (float) i_596_)));
					if (f_617_ < -f_598_)
						return;
					float f_618_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_595_) + f_614_ + (((Class_xa_Sub2) this).aFloat8506 * (float) i_597_)));
					f_599_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_595_) + f_615_ + (((Class_xa_Sub2) this).aFloat8507 * (float) i_597_)));
					if (f_618_ < -f_599_)
						return;
					float f_619_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_594_) + f_614_ + (((Class_xa_Sub2) this).aFloat8506 * (float) i_597_)));
					f_600_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_594_) + f_615_ + (((Class_xa_Sub2) this).aFloat8507 * (float) i_597_)));
					if (f_619_ < -f_600_)
						return;
					float f_620_ = ((Class_xa_Sub2) this).aFloat8500 * (float) i_613_;
					float f_621_ = ((Class_xa_Sub2) this).aFloat8501 * (float) i_613_;
					float f_622_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_594_) + f_620_ + (((Class_xa_Sub2) this).aFloat8504 * (float) i_596_)));
					f_601_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_622_ / f);
					float f_623_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_594_) + f_621_ + (((Class_xa_Sub2) this).aFloat8505 * (float) i_596_)));
					f_602_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_623_ / f);
					f_603_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_616_ / f);
					float f_624_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_595_) + f_620_ + (((Class_xa_Sub2) this).aFloat8504 * (float) i_596_)));
					f_604_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_624_ / f_598_);
					float f_625_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_595_) + f_621_ + (((Class_xa_Sub2) this).aFloat8505 * (float) i_596_)));
					f_605_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_625_ / f_598_);
					f_606_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_617_ / f_598_);
					float f_626_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_595_) + f_620_ + (((Class_xa_Sub2) this).aFloat8504 * (float) i_597_)));
					f_607_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_626_ / f_599_);
					float f_627_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_595_) + f_621_ + (((Class_xa_Sub2) this).aFloat8505 * (float) i_597_)));
					f_608_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_627_ / f_599_);
					f_609_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_618_ / f_599_);
					float f_628_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_594_) + f_620_ + (((Class_xa_Sub2) this).aFloat8504 * (float) i_597_)));
					f_610_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_628_ / f_600_);
					float f_629_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_594_) + f_621_ + (((Class_xa_Sub2) this).aFloat8505 * (float) i_597_)));
					f_611_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_629_ / f_600_);
					f_612_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_619_ / f_600_);
				} else {
					int i_630_ = anIntArrayArray6290[i][i_588_];
					int i_631_ = anIntArrayArray6290[i + 1][i_588_];
					int i_632_ = anIntArrayArray6290[i + 1][i_588_ + 1];
					int i_633_ = anIntArrayArray6290[i][i_588_ + 1];
					float f_634_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_594_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_630_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_596_)));
					f = (((Class_xa_Sub2) this).aFloat8511 + (((Class_xa_Sub2) this).aFloat8485 * (float) i_594_ + (((Class_xa_Sub2) this).aFloat8486 * (float) i_630_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_596_)));
					if (f_634_ < -f)
						return;
					float f_635_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_595_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_631_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_596_)));
					f_598_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_595_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_631_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_596_)));
					if (f_635_ < -f_598_)
						return;
					float f_636_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_595_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_632_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_597_)));
					f_599_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_595_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_632_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_597_)));
					if (f_636_ < -f_599_)
						return;
					float f_637_ = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_594_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_633_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_597_)));
					f_600_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_594_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_633_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_597_)));
					if (f_637_ < -f_600_)
						return;
					float f_638_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_594_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_630_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_596_)));
					f_601_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_638_ / f);
					float f_639_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_594_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_630_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_596_)));
					f_602_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_639_ / f);
					f_603_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_634_ / f);
					float f_640_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_595_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_631_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_596_)));
					f_604_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_640_ / f_598_);
					float f_641_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_595_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_631_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_596_)));
					f_605_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_641_ / f_598_);
					f_606_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_635_ / f_598_);
					float f_642_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_595_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_632_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_597_)));
					f_607_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_642_ / f_599_);
					float f_643_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_595_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_632_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_597_)));
					f_608_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_643_ / f_599_);
					f_609_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_636_ / f_599_);
					float f_644_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_594_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_633_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_597_)));
					f_610_ = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_644_ / f_600_);
					float f_645_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_594_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_633_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_597_)));
					f_611_ = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_645_ / f_600_);
					f_612_ = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f_637_ / f_600_);
				}
				if (((f_607_ - f_610_) * (f_605_ - f_611_) - (f_608_ - f_611_) * (f_604_ - f_610_)) > 0.0F) {
					((Class2) class2).aBoolean20 = (f_607_ < 0.0F || f_610_ < 0.0F || f_604_ < 0.0F || f_607_ > (float) ((Class2) class2).anInt22 || f_610_ > (float) ((Class2) class2).anInt22 || f_604_ > (float) ((Class2) class2).anInt22);
					if (((Class20) class20).aShort273 >= 0)
						class2.method290(true, true, false, f_608_, f_611_, f_605_, f_607_, f_610_, f_604_, f_609_, f_612_, f_606_, f_599_, f_600_, f_598_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | (Class379.anIntArray4096[(((Class20) class20).aShort270 & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[(((Class20) class20).aShort267 & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[(((Class20) class20).aShort269 & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F,
								((Class20) class20).aShort273);
					else
						class2.method299(true, true, false, f_608_, f_611_, f_605_, f_607_, f_610_, f_604_, f_609_, f_612_, f_606_, (float) (((Class20) class20).aShort270 & 0xffff), (float) (((Class20) class20).aShort267 & 0xffff), (float) (((Class20) class20).aShort269 & 0xffff));
				}
				if (((f_601_ - f_604_) * (f_611_ - f_605_) - (f_602_ - f_605_) * (f_610_ - f_604_)) > 0.0F) {
					((Class2) class2).aBoolean20 = (f_601_ < 0.0F || f_604_ < 0.0F || f_610_ < 0.0F || f_601_ > (float) ((Class2) class2).anInt22 || f_604_ > (float) ((Class2) class2).anInt22 || f_610_ > (float) ((Class2) class2).anInt22);
					if (((Class20) class20).aShort273 >= 0)
						class2.method290(true, true, false, f_602_, f_605_, f_611_, f_601_, f_604_, f_610_, f_603_, f_606_, f_612_, f, f_598_, f_600_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | (Class379.anIntArray4096[(((Class20) class20).aShort272 & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[(((Class20) class20).aShort269 & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[(((Class20) class20).aShort267 & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F,
								((Class20) class20).aShort273);
					else
						class2.method299(true, true, false, f_602_, f_605_, f_611_, f_601_, f_604_, f_610_, f_603_, f_606_, f_612_, (float) (((Class20) class20).aShort272 & 0xffff), (float) (((Class20) class20).aShort269 & 0xffff), (float) (((Class20) class20).aShort267 & 0xffff));
				}
			}
		} else {
			Class9 class9 = ((Class_xa_Sub2) this).aClass9ArrayArray8495[i][i_588_];
			if (class9 != null) {
				if (i_593_ != 0) {
					if ((((Class9) class9).aByte126 & 0x4) != 0) {
						if ((i_593_ & 0x1) != 0)
							return;
					} else if ((i_593_ & 0x2) != 0)
						return;
				}
				for (int i_646_ = 0; i_646_ < ((Class9) class9).aShort115; i_646_++) {
					int i_647_ = (((Class9) class9).aShortArray118[i_646_] + (i << anInt6289 * -2137349879));
					short i_648_ = ((Class9) class9).aShortArray119[i_646_];
					int i_649_ = (((Class9) class9).aShortArray120[i_646_] + (i_588_ << anInt6289 * -2137349879));
					float f = (((Class_xa_Sub2) this).aFloat8510 + ((((Class_xa_Sub2) this).aFloat8498 * (float) i_647_) + (((Class_xa_Sub2) this).aFloat8502 * (float) i_648_) + (((Class_xa_Sub2) this).aFloat8506 * (float) i_649_)));
					float f_650_ = (((Class_xa_Sub2) this).aFloat8511 + ((((Class_xa_Sub2) this).aFloat8485 * (float) i_647_) + (((Class_xa_Sub2) this).aFloat8486 * (float) i_648_) + (((Class_xa_Sub2) this).aFloat8507 * (float) i_649_)));
					if (f < -f_650_)
						return;
					float f_651_ = (((Class_xa_Sub2) this).aFloat8508 + ((((Class_xa_Sub2) this).aFloat8499 * (float) i_647_) + (((Class_xa_Sub2) this).aFloat8500 * (float) i_648_) + (((Class_xa_Sub2) this).aFloat8504 * (float) i_649_)));
					float f_652_ = (((Class_xa_Sub2) this).aFloat8509 + ((((Class_xa_Sub2) this).aFloat8497 * (float) i_647_) + (((Class_xa_Sub2) this).aFloat8501 * (float) i_648_) + (((Class_xa_Sub2) this).aFloat8505 * (float) i_649_)));
					fs[i_646_] = (((Class2) class2).aFloat23 + ((Class2) class2).aFloat17 * f_651_ / f_650_);
					fs_589_[i_646_] = (((Class2) class2).aFloat25 + ((Class2) class2).aFloat26 * f_652_ / f_650_);
					fs_590_[i_646_] = (((Class2) class2).aFloat27 + ((Class2) class2).aFloat46 * f / f_650_);
					fs_591_[i_646_] = f_650_;
				}
				if (((Class9) class9).aShortArray125 != null) {
					for (int i_653_ = 0; i_653_ < ((Class9) class9).aShort123; i_653_++) {
						short i_654_ = ((Class9) class9).aShortArray122[i_653_];
						short i_655_ = ((Class9) class9).aShortArray117[i_653_];
						short i_656_ = ((Class9) class9).aShortArray124[i_653_];
						float f = fs[i_654_];
						float f_657_ = fs[i_655_];
						float f_658_ = fs[i_656_];
						float f_659_ = fs_589_[i_654_];
						float f_660_ = fs_589_[i_655_];
						float f_661_ = fs_589_[i_656_];
						if (((f - f_657_) * (f_661_ - f_660_) - (f_659_ - f_660_) * (f_658_ - f_657_)) > 0.0F) {
							((Class2) class2).aBoolean20 = (f < 0.0F || f_657_ < 0.0F || f_658_ < 0.0F || f > (float) ((Class2) class2).anInt22 || (f_657_ > (float) ((Class2) class2).anInt22) || (f_658_ > (float) ((Class2) class2).anInt22));
							short i_662_ = ((Class9) class9).aShortArray125[i_653_];
							if (i_662_ != -1)
								class2.method290(true, true, false, f_659_, f_660_, f_661_, f, f_657_, f_658_, fs_590_[i_654_], fs_590_[i_655_], fs_590_[i_656_], fs_591_[i_654_], fs_591_[i_655_], fs_591_[i_656_], ((float) (((Class9) class9).aShortArray118[i_654_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class9) class9).aShortArray118[i_655_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class9) class9).aShortArray118[i_656_]) / (float) (anInt6288 * -1212653763)),
										((float) (((Class9) class9).aShortArray120[i_654_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class9) class9).aShortArray120[i_655_]) / (float) (anInt6288 * -1212653763)), ((float) (((Class9) class9).aShortArray120[i_656_]) / (float) (anInt6288 * -1212653763)), ~0xffffff | (Class379.anIntArray4096[((((Class9) class9).aShortArray121[i_654_]) & 0xffff)]) & 0xffffff, ~0xffffff
												| (Class379.anIntArray4096[((((Class9) class9).aShortArray121[i_655_]) & 0xffff)]) & 0xffffff, ~0xffffff | (Class379.anIntArray4096[((((Class9) class9).aShortArray121[i_656_]) & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, i_662_);
							else {
								int i_663_ = ((Class9) class9).anIntArray127[i_653_];
								if (i_663_ != -1)
									class2.method299(true, true, false, f_659_, f_660_, f_661_, f, f_657_, f_658_, fs_590_[i_654_], fs_590_[i_655_], fs_590_[i_656_], (float) (Class195.method1873(i_663_, (((Class9) class9).aShortArray121[i_654_]), -952106382)), (float) (Class195.method1873(i_663_, (((Class9) class9).aShortArray121[i_655_]), -952106382)), (float) (Class195.method1873(i_663_, (((Class9) class9).aShortArray121[i_656_]), -952106382)));
							}
						}
					}
				} else {
					for (int i_664_ = 0; i_664_ < ((Class9) class9).aShort123; i_664_++) {
						short i_665_ = ((Class9) class9).aShortArray122[i_664_];
						short i_666_ = ((Class9) class9).aShortArray117[i_664_];
						short i_667_ = ((Class9) class9).aShortArray124[i_664_];
						float f = fs[i_665_];
						float f_668_ = fs[i_666_];
						float f_669_ = fs[i_667_];
						float f_670_ = fs_589_[i_665_];
						float f_671_ = fs_589_[i_666_];
						float f_672_ = fs_589_[i_667_];
						if (((f - f_668_) * (f_672_ - f_671_) - (f_670_ - f_671_) * (f_669_ - f_668_)) > 0.0F) {
							int i_673_ = ((Class9) class9).anIntArray127[i_664_];
							if (i_673_ != -1) {
								((Class2) class2).aBoolean20 = (f < 0.0F || f_668_ < 0.0F || f_669_ < 0.0F || f > (float) ((Class2) class2).anInt22 || (f_668_ > (float) ((Class2) class2).anInt22) || f_669_ > (float) (((Class2) class2).anInt22));
								class2.method299(true, true, false, f_670_, f_671_, f_672_, f, f_668_, f_669_, fs_590_[i_665_], fs_590_[i_666_], fs_590_[i_667_], (float) (Class195.method1873(i_673_, (((Class9) class9).aShortArray121[i_665_]), -952106382)), (float) (Class195.method1873(i_673_, (((Class9) class9).aShortArray121[i_666_]), -952106382)), (float) (Class195.method1873(i_673_, (((Class9) class9).aShortArray121[i_667_]), -952106382)));
							}
						}
					}
				}
			}
		}
	}

	public boolean method6353(Class_na class_na, int i, int i_674_, int i_675_, int i_676_, boolean bool) {
		return false;
	}

	public void method6349(int i, int i_677_, int i_678_, int i_679_, int i_680_, int i_681_, int i_682_, boolean[][] bools) {
		Class15 class15 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5202(Thread.currentThread());
		Class2 class2 = ((Class15) class15).aClass2_192;
		((Class2) class2).anInt19 = 0;
		((Class2) class2).aBoolean20 = true;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5198();
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			method6373(i, i_677_, i_678_, i_679_, i_680_, i_681_, i_682_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			method6371(i, i_677_, i_678_, i_679_, i_680_, i_681_, i_682_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
	}

	public void method6350(int i, int i_683_, int i_684_, int i_685_, int i_686_, int i_687_, int i_688_, boolean[][] bools) {
		Class15 class15 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5202(Thread.currentThread());
		Class2 class2 = ((Class15) class15).aClass2_192;
		((Class2) class2).anInt19 = 0;
		((Class2) class2).aBoolean20 = true;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5198();
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			method6373(i, i_683_, i_684_, i_685_, i_686_, i_687_, i_688_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			method6371(i, i_683_, i_684_, i_685_, i_686_, i_687_, i_688_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
	}

	public void method6351(int i, int i_689_, int i_690_, int i_691_, int i_692_, int i_693_, int i_694_, boolean[][] bools) {
		Class15 class15 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5202(Thread.currentThread());
		Class2 class2 = ((Class15) class15).aClass2_192;
		((Class2) class2).anInt19 = 0;
		((Class2) class2).aBoolean20 = true;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5198();
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			method6373(i, i_689_, i_690_, i_691_, i_692_, i_693_, i_694_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			method6371(i, i_689_, i_690_, i_691_, i_692_, i_693_, i_694_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
	}

	public void method6352(int i, int i_695_, int i_696_, int i_697_, int i_698_, int i_699_, int i_700_, boolean[][] bools) {
		Class15 class15 = ((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5202(Thread.currentThread());
		Class2 class2 = ((Class15) class15).aClass2_192;
		((Class2) class2).anInt19 = 0;
		((Class2) class2).aBoolean20 = true;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5198();
		if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null || ((Class_xa_Sub2) this).aClass17ArrayArray8515 != null)
			method6373(i, i_695_, i_696_, i_697_, i_698_, i_699_, i_700_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
		else if (((Class_xa_Sub2) this).aClass20ArrayArray8491 != null)
			method6371(i, i_695_, i_696_, i_697_, i_698_, i_699_, i_700_, bools, class15, class2, ((Class15) class15).aFloatArray218, ((Class15) class15).aFloatArray181);
	}

	public Class_na l(int i, int i_701_, Class_na class_na) {
		return null;
	}

	public Class_na ax(int i, int i_702_, Class_na class_na) {
		return null;
	}

	public void ak(Class_na class_na, int i, int i_703_, int i_704_, int i_705_, boolean bool) {
		/* empty */
	}

	void method6373(int i, int i_706_, int i_707_, int i_708_, int i_709_, int i_710_, int i_711_, boolean[][] bools, Class15 class15, Class2 class2, float[] fs, float[] fs_712_) {
		int i_713_ = (i_711_ - i_709_) * i_707_ / 256;
		int i_714_ = i_707_ >> 8;
		boolean bool = ((Class15) class15).aBoolean207;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.RA(false);
		((Class2) class2).aBoolean16 = false;
		((Class2) class2).aBoolean48 = false;
		int i_715_ = i;
		int i_716_ = i_706_ + i_713_;
		for (int i_717_ = i_708_; i_717_ < i_710_; i_717_++) {
			for (int i_718_ = i_709_; i_718_ < i_711_; i_718_++) {
				if (bools[i_717_ - i_708_][i_718_ - i_709_]) {
					if (((Class_xa_Sub2) this).aClass6ArrayArray8493 != null) {
						if ((((Class_xa_Sub2) this).aClass6ArrayArray8493[i_717_][i_718_]) != null) {
							Class6 class6 = (((Class_xa_Sub2) this).aClass6ArrayArray8493[i_717_][i_718_]);
							if (((Class6) class6).aShort91 != -1 && (((Class6) class6).aByte85 & 0x2) == 0 && ((Class6) class6).anInt90 == 0) {
								int i_719_ = (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5206(((Class6) class6).aShort91));
								class2.method299(true, true, false, (float) (i_716_ - i_714_), (float) (i_716_ - i_714_), (float) i_716_, (float) (i_715_ + i_714_), (float) i_715_, (float) (i_715_ + i_714_), 100.0F, 100.0F, 100.0F, (float) Class195.method1873(i_719_, (((Class6) class6).anInt81), -952106382), (float) Class195.method1873(i_719_, (((Class6) class6).anInt89), -952106382), (float) Class195.method1873(i_719_, (((Class6) class6).anInt83), -952106382));
								class2.method299(true, true, false, (float) i_716_, (float) i_716_, (float) (i_716_ - i_714_), (float) i_715_, (float) (i_715_ + i_714_), (float) i_715_, 100.0F, 100.0F, 100.0F, (float) Class195.method1873(i_719_, (((Class6) class6).anInt82), -952106382), (float) Class195.method1873(i_719_, (((Class6) class6).anInt83), -952106382), (float) Class195.method1873(i_719_, (((Class6) class6).anInt89), -952106382));
							} else if (((Class6) class6).anInt90 == 0) {
								class2.method292(true, true, false, (float) (i_716_ - i_714_), (float) (i_716_ - i_714_), (float) i_716_, (float) (i_715_ + i_714_), (float) i_715_, (float) (i_715_ + i_714_), 100.0F, 100.0F, 100.0F, ((Class6) class6).anInt81, ((Class6) class6).anInt89, ((Class6) class6).anInt83);
								class2.method292(true, true, false, (float) i_716_, (float) i_716_, (float) (i_716_ - i_714_), (float) i_715_, (float) (i_715_ + i_714_), (float) i_715_, 100.0F, 100.0F, 100.0F, ((Class6) class6).anInt82, ((Class6) class6).anInt83, ((Class6) class6).anInt89);
							} else {
								int i_720_ = ((Class6) class6).anInt90;
								class2.method292(true, true, false, (float) (i_716_ - i_714_), (float) (i_716_ - i_714_), (float) i_716_, (float) (i_715_ + i_714_), (float) i_715_, (float) (i_715_ + i_714_), 100.0F, 100.0F, 100.0F, Class58.method692(i_720_, (((Class6) class6).anInt81) & ~0xffffff, 335533519), Class58.method692(i_720_, (((Class6) class6).anInt89) & ~0xffffff, -1260528057), Class58.method692(i_720_, (((Class6) class6).anInt83) & ~0xffffff, -1356989871));
								class2.method292(true, true, false, (float) i_716_, (float) i_716_, (float) (i_716_ - i_714_), (float) i_715_, (float) (i_715_ + i_714_), (float) i_715_, 100.0F, 100.0F, 100.0F, Class58.method692(i_720_, (((Class6) class6).anInt82) & ~0xffffff, 1935967232), Class58.method692(i_720_, (((Class6) class6).anInt83) & ~0xffffff, -614860911), Class58.method692(i_720_, (((Class6) class6).anInt89) & ~0xffffff, 604792555));
							}
						} else if ((((Class_xa_Sub2) this).aClass13ArrayArray8494[i_717_][i_718_]) != null) {
							Class13 class13 = (((Class_xa_Sub2) this).aClass13ArrayArray8494[i_717_][i_718_]);
							for (int i_721_ = 0; i_721_ < ((Class13) class13).aShort158; i_721_++) {
								fs[i_721_] = (float) (i_715_ + ((((Class13) class13).aShortArray157[i_721_]) * i_714_ / (anInt6288 * -1212653763)));
								fs_712_[i_721_] = (float) (i_716_ - ((((Class13) class13).aShortArray162[i_721_]) * i_714_ / (anInt6288 * -1212653763)));
							}
							for (int i_722_ = 0; i_722_ < ((Class13) class13).aShort167; i_722_++) {
								int i_723_ = i_722_ * 3;
								int i_724_ = i_723_ + 1;
								int i_725_ = i_724_ + 1;
								float f = fs[i_723_];
								float f_726_ = fs[i_724_];
								float f_727_ = fs[i_725_];
								float f_728_ = fs_712_[i_723_];
								float f_729_ = fs_712_[i_724_];
								float f_730_ = fs_712_[i_725_];
								if (((Class13) class13).anIntArray163 != null && (((Class13) class13).anIntArray163[i_722_]) != 0 && ((((Class13) class13).aShortArray166 == null) || ((((Class13) class13).aShortArray166 != null) && ((((Class13) class13).aShortArray166[i_722_]) == -1)))) {
									int i_731_ = (((Class13) class13).anIntArray163[i_722_]);
									class2.method292(true, true, false, f_728_, f_729_, f_730_, f, f_726_, f_727_, 100.0F, 100.0F, 100.0F, Class58.method692(i_731_, (-16777216 - ((((Class13) class13).anIntArray164[i_723_]) & ~0xffffff)), 412802637), Class58.method692(i_731_, (-16777216 - ((((Class13) class13).anIntArray164[i_724_]) & ~0xffffff)), -232734877), Class58.method692(i_731_, (-16777216 - ((((Class13) class13).anIntArray164[i_725_]) & ~0xffffff)), 2113694902));
								} else if ((((Class13) class13).aShortArray166 != null) && ((((Class13) class13).aShortArray166[i_722_]) != -1)) {
									int i_732_ = (((Class_xa_Sub2) this).aClass_ra_Sub1_8484.method5206(((Class13) class13).aShortArray166[i_722_]));
									class2.method299(true, true, false, f_728_, f_729_, f_730_, f, f_726_, f_727_, 100.0F, 100.0F, 100.0F, (float) i_732_, (float) i_732_, (float) i_732_);
								} else
									class2.method292(true, true, false, f_728_, f_729_, f_730_, f, f_726_, f_727_, 100.0F, 100.0F, 100.0F, (((Class13) class13).anIntArray164[i_723_]), (((Class13) class13).anIntArray164[i_724_]), (((Class13) class13).anIntArray164[i_725_]));
							}
						}
					} else if ((((Class_xa_Sub2) this).aClass17ArrayArray8515[i_717_][i_718_]) != null) {
						Class17 class17 = (((Class_xa_Sub2) this).aClass17ArrayArray8515[i_717_][i_718_]);
						for (int i_733_ = 0; i_733_ < ((Class17) class17).aShort234; i_733_++) {
							fs[i_733_] = (float) (i_715_ + ((((Class17) class17).aShortArray235[i_733_]) * i_714_ / (anInt6288 * -1212653763)));
							fs_712_[i_733_] = (float) (i_716_ - ((((Class17) class17).aShortArray243[i_733_]) * i_714_ / (anInt6288 * -1212653763)));
						}
						for (int i_734_ = 0; i_734_ < ((Class17) class17).aShort236; i_734_++) {
							int i_735_ = i_734_ * 3;
							int i_736_ = i_735_ + 1;
							int i_737_ = i_736_ + 1;
							float f = fs[i_735_];
							float f_738_ = fs[i_736_];
							float f_739_ = fs[i_737_];
							float f_740_ = fs_712_[i_735_];
							float f_741_ = fs_712_[i_736_];
							float f_742_ = fs_712_[i_737_];
							if (((Class17) class17).anIntArray233 != null && (((Class17) class17).anIntArray233[i_734_] != 0)) {
								int i_743_ = (((Class17) class17).anIntArray233[i_734_]);
								class2.method292(true, true, false, f_740_, f_741_, f_742_, f, f_738_, f_739_, 100.0F, 100.0F, 100.0F, i_743_, i_743_, i_743_);
							} else
								class2.method292(true, true, false, f_740_, f_741_, f_742_, f, f_738_, f_739_, 100.0F, 100.0F, 100.0F, ((Class17) class17).anIntArray237[i_735_], ((Class17) class17).anIntArray237[i_736_], (((Class17) class17).anIntArray237[i_737_]));
						}
					}
				}
				i_716_ -= i_714_;
			}
			i_716_ = i_706_ + i_713_;
			i_715_ += i_714_;
		}
		((Class2) class2).aBoolean16 = true;
		((Class_xa_Sub2) this).aClass_ra_Sub1_8484.RA(bool);
	}

	public boolean method6355(Class_na class_na, int i, int i_744_, int i_745_, int i_746_, boolean bool) {
		return false;
	}

	public Class_na aa(int i, int i_747_, Class_na class_na) {
		return null;
	}

	public void method6357(int i, int i_748_, int i_749_, boolean[][] bools, boolean bool, int i_750_) {
		if ((((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).anIntArray7967) == null || (((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).aFloatArray7973) == null)
			throw new IllegalStateException("");
		Matrix4f class233 = (((Class_ra_Sub1) ((Class_xa_Sub2) this).aClass_ra_Sub1_8484).aClass233_7987);
		((Class_xa_Sub2) this).aFloat8499 = class233.aFloatArray2594[0];
		((Class_xa_Sub2) this).aFloat8497 = class233.aFloatArray2594[1];
		((Class_xa_Sub2) this).aFloat8498 = class233.aFloatArray2594[2];
		((Class_xa_Sub2) this).aFloat8485 = class233.aFloatArray2594[3];
		((Class_xa_Sub2) this).aFloat8500 = class233.aFloatArray2594[4];
		((Class_xa_Sub2) this).aFloat8501 = class233.aFloatArray2594[5];
		((Class_xa_Sub2) this).aFloat8502 = class233.aFloatArray2594[6];
		((Class_xa_Sub2) this).aFloat8486 = class233.aFloatArray2594[7];
		((Class_xa_Sub2) this).aFloat8504 = class233.aFloatArray2594[8];
		((Class_xa_Sub2) this).aFloat8505 = class233.aFloatArray2594[9];
		((Class_xa_Sub2) this).aFloat8506 = class233.aFloatArray2594[10];
		((Class_xa_Sub2) this).aFloat8507 = class233.aFloatArray2594[11];
		((Class_xa_Sub2) this).aFloat8508 = class233.aFloatArray2594[12];
		((Class_xa_Sub2) this).aFloat8509 = class233.aFloatArray2594[13];
		((Class_xa_Sub2) this).aFloat8510 = class233.aFloatArray2594[14];
		((Class_xa_Sub2) this).aFloat8511 = class233.aFloatArray2594[15];
		for (int i_751_ = 0; i_751_ < i_749_ + i_749_; i_751_++) {
			for (int i_752_ = 0; i_752_ < i_749_ + i_749_; i_752_++) {
				if (bools[i_751_][i_752_]) {
					int i_753_ = i - i_749_ + i_751_;
					int i_754_ = i_748_ - i_749_ + i_752_;
					if (i_753_ >= 0 && i_753_ < anInt6287 * -506105871 && i_754_ >= 0 && i_754_ < anInt6286 * -1148794921)
						method6368(i_753_, i_754_, i_750_);
				}
			}
		}
	}

	public void method6344(Class298_Sub10 class298_sub10, int[] is) {
		/* empty */
	}

	public void method6358(Class298_Sub10 class298_sub10, int[] is) {
		/* empty */
	}
}
