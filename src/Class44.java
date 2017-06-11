/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class44 {
	int anInt467;
	int anInt468;
	int anInt469;
	Class_xa_Sub3 aClass_xa_Sub3_470;
	byte[] aByteArray471;
	Class_ra_Sub2 aClass_ra_Sub2_472;
	int anInt473;
	int anInt474;
	Class31[][] aClass31ArrayArray475;

	void method489() {
		((Class44) this).aClass31ArrayArray475 = (new Class31[((Class44) this).anInt468][((Class44) this).anInt473]);
		for (int i = 0; i < ((Class44) this).anInt473; i++) {
			for (int i_0_ = 0; i_0_ < ((Class44) this).anInt468; i_0_++)
				((Class44) this).aClass31ArrayArray475[i_0_][i] = new Class31(((Class44) this).aClass_ra_Sub2_472, this, ((Class44) this).aClass_xa_Sub3_470, i_0_, i, ((Class44) this).anInt474, i_0_ * 128 + 1, i * 128 + 1);
		}
	}

	void method490(int i, int i_1_, int i_2_, boolean[][] bools, boolean bool) {
		((Class44) this).aClass_ra_Sub2_472.method5262(false);
		((Class44) this).aClass_ra_Sub2_472.method5281(false);
		((Class44) this).aClass_ra_Sub2_472.method5275(-2);
		((Class44) this).aClass_ra_Sub2_472.method5243(1);
		((Class44) this).aClass_ra_Sub2_472.method5266(1);
		float f = 1.0F / (float) (((Class_ra_Sub2) ((Class44) this).aClass_ra_Sub2_472).anInt8063 * 128);
		if (bool) {
			for (int i_3_ = 0; i_3_ < ((Class44) this).anInt473; i_3_++) {
				int i_4_ = i_3_ << ((Class44) this).anInt474;
				int i_5_ = i_3_ + 1 << ((Class44) this).anInt474;
				for (int i_6_ = 0; i_6_ < ((Class44) this).anInt468; i_6_++) {
					int i_7_ = i_6_ << ((Class44) this).anInt474;
					int i_8_ = i_6_ + 1 << ((Class44) this).anInt474;
					while_60_: for (int i_9_ = i_7_; i_9_ < i_8_; i_9_++) {
						if (i_9_ - i >= -i_2_ && i_9_ - i <= i_2_) {
							for (int i_10_ = i_4_; i_10_ < i_5_; i_10_++) {
								if (i_10_ - i_1_ >= -i_2_ && i_10_ - i_1_ <= i_2_ && (bools[i_9_ - i + i_2_][i_10_ - i_1_ + i_2_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_6_ / f, (float) -i_3_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									((Class44) this).aClass31ArrayArray475[i_6_][i_3_].method432();
									break while_60_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_11_ = 0; i_11_ < ((Class44) this).anInt473; i_11_++) {
				int i_12_ = i_11_ << ((Class44) this).anInt474;
				int i_13_ = i_11_ + 1 << ((Class44) this).anInt474;
				for (int i_14_ = 0; i_14_ < ((Class44) this).anInt468; i_14_++) {
					int i_15_ = 0;
					int i_16_ = i_14_ << ((Class44) this).anInt474;
					int i_17_ = i_14_ + 1 << ((Class44) this).anInt474;
					RsFloatBuffer class298_sub53_sub1 = (((Class_ra_Sub2) ((Class44) this).aClass_ra_Sub2_472).aClass298_Sub53_Sub1_8197);
					class298_sub53_sub1.index = 0;
					for (int i_18_ = i_12_; i_18_ < i_13_; i_18_++) {
						if (i_18_ - i_1_ >= -i_2_ && i_18_ - i_1_ <= i_2_) {
							int i_19_ = (i_18_ * ((((Class44) this).aClass_xa_Sub3_470.anInt6287) * -506105871) + i_16_);
							for (int i_20_ = i_16_; i_20_ < i_17_; i_20_++) {
								if (i_20_ - i >= -i_2_ && i_20_ - i <= i_2_ && (bools[i_20_ - i + i_2_][i_18_ - i_1_ + i_2_])) {
									short[] is = (((Class_xa_Sub3) (((Class44) this).aClass_xa_Sub3_470)).aShortArrayArray8550[i_19_]);
									if (is != null) {
										if (((Class_ra_Sub2) (((Class44) this).aClass_ra_Sub2_472)).aBoolean8143) {
											for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
												class298_sub53_sub1.writeShort(is[i_21_] & 0xffff, 16711935);
												i_15_++;
											}
										} else {
											for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
												class298_sub53_sub1.method3587(is[i_22_] & 0xffff, 1368367793);
												i_15_++;
											}
										}
									}
								}
								i_19_++;
							}
						}
					}
					if (i_15_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_14_ / f, (float) -i_11_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						((Class44) this).aClass31ArrayArray475[i_14_][i_11_].method435(class298_sub53_sub1.buffer, i_15_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method491(Class_na class_na, int i, int i_23_) {
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		i += ((Class_na_Sub1) class_na_sub1).anInt10012 + 1;
		i_23_ += ((Class_na_Sub1) class_na_sub1).anInt10016 + 1;
		int i_24_ = i + i_23_ * ((Class44) this).anInt469;
		int i_25_ = 0;
		int i_26_ = ((Class_na_Sub1) class_na_sub1).anInt10014;
		int i_27_ = ((Class_na_Sub1) class_na_sub1).anInt10013;
		int i_28_ = ((Class44) this).anInt469 - i_27_;
		int i_29_ = 0;
		if (i_23_ <= 0) {
			int i_30_ = 1 - i_23_;
			i_26_ -= i_30_;
			i_25_ += i_30_ * i_27_;
			i_24_ += i_30_ * ((Class44) this).anInt469;
			i_23_ = 1;
		}
		if (i_23_ + i_26_ >= ((Class44) this).anInt467) {
			int i_31_ = i_23_ + i_26_ + 1 - ((Class44) this).anInt467;
			i_26_ -= i_31_;
		}
		if (i <= 0) {
			int i_32_ = 1 - i;
			i_27_ -= i_32_;
			i_25_ += i_32_;
			i_24_ += i_32_;
			i_29_ += i_32_;
			i_28_ += i_32_;
			i = 1;
		}
		if (i + i_27_ >= ((Class44) this).anInt469) {
			int i_33_ = i + i_27_ + 1 - ((Class44) this).anInt469;
			i_27_ -= i_33_;
			i_29_ += i_33_;
			i_28_ += i_33_;
		}
		if (i_27_ > 0 && i_26_ > 0) {
			method494(((Class44) this).aByteArray471, ((Class_na_Sub1) class_na_sub1).aByteArray10017, i_25_, i_24_, i_27_, i_26_, i_28_, i_29_);
			method497(i, i_23_, i_27_, i_26_);
		}
	}

	boolean method492(Class_na class_na, int i, int i_34_) {
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		i += ((Class_na_Sub1) class_na_sub1).anInt10012 + 1;
		i_34_ += ((Class_na_Sub1) class_na_sub1).anInt10016 + 1;
		int i_35_ = i + i_34_ * ((Class44) this).anInt469;
		int i_36_ = ((Class_na_Sub1) class_na_sub1).anInt10014;
		int i_37_ = ((Class_na_Sub1) class_na_sub1).anInt10013;
		int i_38_ = ((Class44) this).anInt469 - i_37_;
		if (i_34_ <= 0) {
			int i_39_ = 1 - i_34_;
			i_36_ -= i_39_;
			i_35_ += i_39_ * ((Class44) this).anInt469;
			i_34_ = 1;
		}
		if (i_34_ + i_36_ >= ((Class44) this).anInt467) {
			int i_40_ = i_34_ + i_36_ + 1 - ((Class44) this).anInt467;
			i_36_ -= i_40_;
		}
		if (i <= 0) {
			int i_41_ = 1 - i;
			i_37_ -= i_41_;
			i_35_ += i_41_;
			i_38_ += i_41_;
			i = 1;
		}
		if (i + i_37_ >= ((Class44) this).anInt469) {
			int i_42_ = i + i_37_ + 1 - ((Class44) this).anInt469;
			i_37_ -= i_42_;
			i_38_ += i_42_;
		}
		if (i_37_ <= 0 || i_36_ <= 0)
			return false;
		int i_43_ = 8;
		i_38_ += (i_43_ - 1) * ((Class44) this).anInt469;
		return method495(((Class44) this).aByteArray471, i_35_, i_37_, i_36_, i_38_, i_43_);
	}

	Class44(Class_ra_Sub2 class_ra_sub2, Class_xa_Sub3 class_xa_sub3) {
		((Class44) this).aClass_ra_Sub2_472 = class_ra_sub2;
		((Class44) this).aClass_xa_Sub3_470 = class_xa_sub3;
		((Class44) this).anInt469 = 2 + ((((Class44) this).aClass_xa_Sub3_470.anInt6287 * -506105871 * (((Class44) this).aClass_xa_Sub3_470.anInt6288 * -1212653763)) >> (((Class_ra_Sub2) ((Class44) this).aClass_ra_Sub2_472).anInt8064));
		((Class44) this).anInt467 = 2 + ((((Class44) this).aClass_xa_Sub3_470.anInt6286 * -1148794921 * (((Class44) this).aClass_xa_Sub3_470.anInt6288 * -1212653763)) >> (((Class_ra_Sub2) ((Class44) this).aClass_ra_Sub2_472).anInt8064));
		((Class44) this).aByteArray471 = new byte[((Class44) this).anInt469 * ((Class44) this).anInt467];
		((Class44) this).anInt474 = (7 + (((Class_ra_Sub2) ((Class44) this).aClass_ra_Sub2_472).anInt8064) - ((Class44) this).aClass_xa_Sub3_470.anInt6289 * -2137349879);
		((Class44) this).anInt468 = (((Class44) this).aClass_xa_Sub3_470.anInt6287 * -506105871 >> ((Class44) this).anInt474);
		((Class44) this).anInt473 = (((Class44) this).aClass_xa_Sub3_470.anInt6286 * -1148794921 >> ((Class44) this).anInt474);
	}

	static final void method493(byte[] is, byte[] is_44_, int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		int i_50_ = -(i_46_ >> 2);
		i_46_ = -(i_46_ & 0x3);
		for (int i_51_ = -i_47_; i_51_ < 0; i_51_++) {
			for (int i_52_ = i_50_; i_52_ < 0; i_52_++) {
				is[i_45_++] += is_44_[i++];
				is[i_45_++] += is_44_[i++];
				is[i_45_++] += is_44_[i++];
				is[i_45_++] += is_44_[i++];
			}
			for (int i_53_ = i_46_; i_53_ < 0; i_53_++)
				is[i_45_++] += is_44_[i++];
			i_45_ += i_48_;
			i += i_49_;
		}
	}

	static final void method494(byte[] is, byte[] is_54_, int i, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_) {
		int i_60_ = -(i_56_ >> 2);
		i_56_ = -(i_56_ & 0x3);
		for (int i_61_ = -i_57_; i_61_ < 0; i_61_++) {
			for (int i_62_ = i_60_; i_62_ < 0; i_62_++) {
				is[i_55_++] -= is_54_[i++];
				is[i_55_++] -= is_54_[i++];
				is[i_55_++] -= is_54_[i++];
				is[i_55_++] -= is_54_[i++];
			}
			for (int i_63_ = i_56_; i_63_ < 0; i_63_++)
				is[i_55_++] -= is_54_[i++];
			i_55_ += i_58_;
			i += i_59_;
		}
	}

	static final boolean method495(byte[] is, int i, int i_64_, int i_65_, int i_66_, int i_67_) {
		int i_68_ = i_64_ % i_67_;
		int i_69_;
		if (i_68_ != 0)
			i_69_ = i_67_ - i_68_;
		else
			i_69_ = 0;
		int i_70_ = -((i_65_ + i_67_ - 1) / i_67_);
		int i_71_ = -((i_64_ + i_67_ - 1) / i_67_);
		for (int i_72_ = i_70_; i_72_ < 0; i_72_++) {
			for (int i_73_ = i_71_; i_73_ < 0; i_73_++) {
				if (is[i] == 0)
					return true;
				i += i_67_;
			}
			i -= i_69_;
			if (is[i - 1] == 0)
				return true;
			i += i_66_;
		}
		return false;
	}

	void method496(Class_na class_na, int i, int i_74_) {
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		i += ((Class_na_Sub1) class_na_sub1).anInt10012 + 1;
		i_74_ += ((Class_na_Sub1) class_na_sub1).anInt10016 + 1;
		int i_75_ = i + i_74_ * ((Class44) this).anInt469;
		int i_76_ = 0;
		int i_77_ = ((Class_na_Sub1) class_na_sub1).anInt10014;
		int i_78_ = ((Class_na_Sub1) class_na_sub1).anInt10013;
		int i_79_ = ((Class44) this).anInt469 - i_78_;
		int i_80_ = 0;
		if (i_74_ <= 0) {
			int i_81_ = 1 - i_74_;
			i_77_ -= i_81_;
			i_76_ += i_81_ * i_78_;
			i_75_ += i_81_ * ((Class44) this).anInt469;
			i_74_ = 1;
		}
		if (i_74_ + i_77_ >= ((Class44) this).anInt467) {
			int i_82_ = i_74_ + i_77_ + 1 - ((Class44) this).anInt467;
			i_77_ -= i_82_;
		}
		if (i <= 0) {
			int i_83_ = 1 - i;
			i_78_ -= i_83_;
			i_76_ += i_83_;
			i_75_ += i_83_;
			i_80_ += i_83_;
			i_79_ += i_83_;
			i = 1;
		}
		if (i + i_78_ >= ((Class44) this).anInt469) {
			int i_84_ = i + i_78_ + 1 - ((Class44) this).anInt469;
			i_78_ -= i_84_;
			i_80_ += i_84_;
			i_79_ += i_84_;
		}
		if (i_78_ > 0 && i_77_ > 0) {
			method493(((Class44) this).aByteArray471, ((Class_na_Sub1) class_na_sub1).aByteArray10017, i_76_, i_75_, i_78_, i_77_, i_79_, i_80_);
			method497(i, i_74_, i_78_, i_77_);
		}
	}

	void method497(int i, int i_85_, int i_86_, int i_87_) {
		if (((Class44) this).aClass31ArrayArray475 != null) {
			int i_88_ = i - 1 >> 7;
			int i_89_ = i - 1 + i_86_ - 1 >> 7;
			int i_90_ = i_85_ - 1 >> 7;
			int i_91_ = i_85_ - 1 + i_87_ - 1 >> 7;
			for (int i_92_ = i_88_; i_92_ <= i_89_; i_92_++) {
				Class31[] class31s = ((Class44) this).aClass31ArrayArray475[i_92_];
				for (int i_93_ = i_90_; i_93_ <= i_91_; i_93_++)
					((Class31) class31s[i_93_]).aBoolean389 = true;
			}
		}
	}
}
