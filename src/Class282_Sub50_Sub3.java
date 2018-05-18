
/* Class282_Sub50_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.FileOutputStream;

public class Class282_Sub50_Sub3 extends Class282_Sub50 {
	int[] anIntArray9473;
	static int[] anIntArray9474;
	int[] anIntArray9475;
	Class282_Sub20 aClass282_Sub20_9476;
	Class282_Sub20 aClass282_Sub20_9477;
	Class282_Sub20[] aClass282_Sub20Array9478;
	static double aDouble9479 = -1.0;
	Class282_Sub20 aClass282_Sub20_9480;
	static FileOutputStream aFileOutputStream9481;

	boolean method14716(Index class317, Interface22 interface22) {
		if (-890139849 * Class282_Sub20_Sub29.anInt9913 >= 0) {
			for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i++) {
				if (!class317.method5688((Class282_Sub20_Sub29.anInt9913 * -890139849), (((Class282_Sub50_Sub3) this).anIntArray9475[i]), 16711935))
					return false;
			}
		} else {
			for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i++) {
				if (!class317.method5661((((Class282_Sub50_Sub3) this).anIntArray9475[i]), -848169790))
					return false;
			}
		}
		for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9473.length; i++) {
			if (!interface22.method139((((Class282_Sub50_Sub3) this).anIntArray9473[i]), -1263897573))
				return false;
		}
		return true;
	}

	boolean method14717(Index class317, Interface22 interface22, int i) {
		if (-890139849 * Class282_Sub20_Sub29.anInt9913 >= 0) {
			for (int i_0_ = 0; i_0_ < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i_0_++) {
				if (!class317.method5688((Class282_Sub20_Sub29.anInt9913 * -890139849), (((Class282_Sub50_Sub3) this).anIntArray9475[i_0_]), 16711935))
					return false;
			}
		} else {
			for (int i_1_ = 0; i_1_ < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i_1_++) {
				if (!class317.method5661((((Class282_Sub50_Sub3) this).anIntArray9475[i_1_]), 1546931007))
					return false;
			}
		}
		for (int i_2_ = 0; i_2_ < ((Class282_Sub50_Sub3) this).anIntArray9473.length; i_2_++) {
			if (!interface22.method139((((Class282_Sub50_Sub3) this).anIntArray9473[i_2_]), -324994004))
				return false;
		}
		return true;
	}

	int[] method14718(Index class317, Interface22 interface22, double d, int i, int i_3_, boolean bool, boolean bool_4_, int i_5_) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_6_ = 0; (i_6_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_6_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_6_].method12315(i, i_3_, (byte) 60);
		Class229.method3895(d);
		Class316.method5593(i, i_3_, 1422267205);
		int[] is = new int[i_3_ * i];
		int i_7_;
		int i_8_;
		int i_9_;
		if (bool) {
			i_7_ = i - 1;
			i_8_ = -1;
			i_9_ = -1;
		} else {
			i_7_ = 0;
			i_8_ = i;
			i_9_ = 1;
		}
		int i_10_ = 0;
		for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
			int[] is_12_;
			int[] is_13_;
			int[] is_14_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_15_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12319(i_11_, 752457538);
				is_12_ = is_15_;
				is_13_ = is_15_;
				is_14_ = is_15_;
			} else {
				int[][] is_16_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12320(i_11_, 1981543466);
				is_12_ = is_16_[0];
				is_13_ = is_16_[1];
				is_14_ = is_16_[2];
			}
			if (bool_4_)
				i_10_ = i_11_;
			for (int i_17_ = i_7_; i_17_ != i_8_; i_17_ += i_9_) {
				int i_18_ = is_12_[i_17_] >> 4;
				if (i_18_ > 255)
					i_18_ = 255;
				if (i_18_ < 0)
					i_18_ = 0;
				int i_19_ = is_13_[i_17_] >> 4;
				if (i_19_ > 255)
					i_19_ = 255;
				if (i_19_ < 0)
					i_19_ = 0;
				int i_20_ = is_14_[i_17_] >> 4;
				if (i_20_ > 255)
					i_20_ = 255;
				if (i_20_ < 0)
					i_20_ = 0;
				i_18_ = anIntArray9474[i_18_];
				i_19_ = anIntArray9474[i_19_];
				i_20_ = anIntArray9474[i_20_];
				int i_21_ = (i_18_ << 16) + (i_19_ << 8) + i_20_;
				if (i_21_ != 0)
					i_21_ |= ~0xffffff;
				is[i_10_++] = i_21_;
				if (bool_4_)
					i_10_ += i - 1;
			}
		}
		for (int i_22_ = 0; (i_22_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_22_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_22_].method12326(984017845);
		return is;
	}

	int[] method14719(Index class317, Interface22 interface22, double d, int i, int i_23_, boolean bool, byte i_24_) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_25_ = 0; (i_25_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_25_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_25_].method12315(i, i_23_, (byte) 116);
		Class229.method3895(d);
		Class316.method5593(i, i_23_, 1384434405);
		int[] is = new int[i * i_23_];
		int i_26_ = 0;
		for (int i_27_ = 0; i_27_ < i_23_; i_27_++) {
			int[] is_28_;
			int[] is_29_;
			int[] is_30_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_31_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12319(i_27_, 752457538);
				is_28_ = is_31_;
				is_29_ = is_31_;
				is_30_ = is_31_;
			} else {
				int[][] is_32_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12320(i_27_, -1291616356);
				is_28_ = is_32_[0];
				is_29_ = is_32_[1];
				is_30_ = is_32_[2];
			}
			int[] is_33_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.aBool7669)
				is_33_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12319(i_27_, 752457538);
			else
				is_33_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12320(i_27_, 1766478944)[0];
			if (bool)
				i_26_ = i_27_;
			for (int i_34_ = i - 1; i_34_ >= 0; i_34_--) {
				int i_35_ = is_28_[i_34_] >> 4;
				if (i_35_ > 255)
					i_35_ = 255;
				if (i_35_ < 0)
					i_35_ = 0;
				int i_36_ = is_29_[i_34_] >> 4;
				if (i_36_ > 255)
					i_36_ = 255;
				if (i_36_ < 0)
					i_36_ = 0;
				int i_37_ = is_30_[i_34_] >> 4;
				if (i_37_ > 255)
					i_37_ = 255;
				if (i_37_ < 0)
					i_37_ = 0;
				i_35_ = anIntArray9474[i_35_];
				i_36_ = anIntArray9474[i_36_];
				i_37_ = anIntArray9474[i_37_];
				int i_38_;
				if (i_35_ != 0 || 0 != i_36_ || i_37_ != 0) {
					i_38_ = is_33_[i_34_] >> 4;
					if (i_38_ > 255)
						i_38_ = 255;
					if (i_38_ < 0)
						i_38_ = 0;
				} else
					i_38_ = 0;
				is[i_26_++] = (i_36_ << 8) + ((i_35_ << 16) + (i_38_ << 24)) + i_37_;
				if (bool)
					i_26_ += i - 1;
			}
		}
		for (int i_39_ = 0; (i_39_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_39_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_39_].method12326(984017845);
		return is;
	}

	boolean method14720(Index class317, Interface22 interface22) {
		if (-890139849 * Class282_Sub20_Sub29.anInt9913 >= 0) {
			for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i++) {
				if (!class317.method5688((Class282_Sub20_Sub29.anInt9913 * -890139849), (((Class282_Sub50_Sub3) this).anIntArray9475[i]), 16711935))
					return false;
			}
		} else {
			for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i++) {
				if (!class317.method5661((((Class282_Sub50_Sub3) this).anIntArray9475[i]), -62751217))
					return false;
			}
		}
		for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9473.length; i++) {
			if (!interface22.method139((((Class282_Sub50_Sub3) this).anIntArray9473[i]), -1092654201))
				return false;
		}
		return true;
	}

	static {
		anIntArray9474 = new int[256];
	}

	Class282_Sub50_Sub3(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedByte();
		int i_40_ = 0;
		int i_41_ = 0;
		int[][] is = new int[i][];
		((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478 = new Class282_Sub20[i];
		for (int i_42_ = 0; i_42_ < i; i_42_++) {
			Class282_Sub20 class282_sub20 = Class278.method4963(class282_sub35, (byte) -7);
			if (class282_sub20.method12323(1338991452) >= 0)
				i_40_++;
			if (class282_sub20.method12324((byte) 44) >= 0)
				i_41_++;
			int i_43_ = (((Class282_Sub20) class282_sub20).aClass282_Sub20Array7671).length;
			is[i_42_] = new int[i_43_];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
				is[i_42_][i_44_] = class282_sub35.readUnsignedByte();
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_42_] = class282_sub20;
		}
		((Class282_Sub50_Sub3) this).anIntArray9475 = new int[i_40_];
		i_40_ = 0;
		((Class282_Sub50_Sub3) this).anIntArray9473 = new int[i_41_];
		i_41_ = 0;
		for (int i_45_ = 0; i_45_ < i; i_45_++) {
			Class282_Sub20 class282_sub20 = ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_45_];
			int i_46_ = (((Class282_Sub20) class282_sub20).aClass282_Sub20Array7671).length;
			for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
				((Class282_Sub20) class282_sub20).aClass282_Sub20Array7671[i_47_] = (((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[is[i_45_][i_47_]]);
			int i_48_ = class282_sub20.method12323(1338991452);
			int i_49_ = class282_sub20.method12324((byte) 117);
			if (i_48_ > 0)
				((Class282_Sub50_Sub3) this).anIntArray9475[i_40_++] = i_48_;
			if (i_49_ > 0)
				((Class282_Sub50_Sub3) this).anIntArray9473[i_41_++] = i_49_;
			is[i_45_] = null;
		}
		((Class282_Sub50_Sub3) this).aClass282_Sub20_9476 = (((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[class282_sub35.readUnsignedByte()]);
		((Class282_Sub50_Sub3) this).aClass282_Sub20_9477 = (((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[class282_sub35.readUnsignedByte()]);
		((Class282_Sub50_Sub3) this).aClass282_Sub20_9480 = (((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[class282_sub35.readUnsignedByte()]);
		is = null;
	}

	boolean method14721(Index class317, Interface22 interface22) {
		if (-890139849 * Class282_Sub20_Sub29.anInt9913 >= 0) {
			for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i++) {
				if (!class317.method5688((Class282_Sub20_Sub29.anInt9913 * -890139849), (((Class282_Sub50_Sub3) this).anIntArray9475[i]), 16711935))
					return false;
			}
		} else {
			for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i++) {
				if (!class317.method5661((((Class282_Sub50_Sub3) this).anIntArray9475[i]), -241755179))
					return false;
			}
		}
		for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9473.length; i++) {
			if (!interface22.method139((((Class282_Sub50_Sub3) this).anIntArray9473[i]), -1088595428))
				return false;
		}
		return true;
	}

	boolean method14722(Index class317, Interface22 interface22) {
		if (-890139849 * Class282_Sub20_Sub29.anInt9913 >= 0) {
			for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i++) {
				if (!class317.method5688((Class282_Sub20_Sub29.anInt9913 * -890139849), (((Class282_Sub50_Sub3) this).anIntArray9475[i]), 16711935))
					return false;
			}
		} else {
			for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9475.length; i++) {
				if (!class317.method5661((((Class282_Sub50_Sub3) this).anIntArray9475[i]), -479880063))
					return false;
			}
		}
		for (int i = 0; i < ((Class282_Sub50_Sub3) this).anIntArray9473.length; i++) {
			if (!interface22.method139((((Class282_Sub50_Sub3) this).anIntArray9473[i]), -64669560))
				return false;
		}
		return true;
	}

	float[] method14723(Index class317, Interface22 interface22, int i, int i_50_, boolean bool, int i_51_) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_52_ = 0; (i_52_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_52_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_52_].method12315(i, i_50_, (byte) 59);
		Class316.method5593(i, i_50_, -315322197);
		float[] fs = new float[i_50_ * i * 4];
		int i_53_ = 0;
		for (int i_54_ = 0; i_54_ < i_50_; i_54_++) {
			int[] is;
			int[] is_55_;
			int[] is_56_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_57_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12319(i_54_, 752457538);
				is = is_57_;
				is_55_ = is_57_;
				is_56_ = is_57_;
			} else {
				int[][] is_58_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12320(i_54_, 1271694305);
				is = is_58_[0];
				is_55_ = is_58_[1];
				is_56_ = is_58_[2];
			}
			int[] is_59_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.aBool7669)
				is_59_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12319(i_54_, 752457538);
			else
				is_59_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12320(i_54_, -1071831227)[0];
			int[] is_60_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9480.aBool7669)
				is_60_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9480.method12319(i_54_, 752457538);
			else
				is_60_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9480.method12320(i_54_, -1302016809)[0];
			if (bool)
				i_53_ = i_54_ << 2;
			for (int i_61_ = i - 1; i_61_ >= 0; i_61_--) {
				float f = (float) is_59_[i_61_] / 4096.0F;
				float f_62_ = ((1.0F + (float) is_60_[i_61_] * 31.0F / 4096.0F) / 4096.0F);
				if (f < 0.0F)
					f = 0.0F;
				else if (f > 1.0F)
					f = 1.0F;
				fs[i_53_++] = (float) is[i_61_] * f_62_;
				fs[i_53_++] = f_62_ * (float) is_55_[i_61_];
				fs[i_53_++] = (float) is_56_[i_61_] * f_62_;
				fs[i_53_++] = f;
				if (bool)
					i_53_ += (i << 2) - 4;
			}
		}
		for (int i_63_ = 0; (i_63_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_63_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_63_].method12326(984017845);
		return fs;
	}

	int[] method14724(Index class317, Interface22 interface22, double d, int i, int i_64_, boolean bool) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_65_ = 0; (i_65_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_65_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_65_].method12315(i, i_64_, (byte) 80);
		Class229.method3895(d);
		Class316.method5593(i, i_64_, 1816824554);
		int[] is = new int[i * i_64_];
		int i_66_ = 0;
		for (int i_67_ = 0; i_67_ < i_64_; i_67_++) {
			int[] is_68_;
			int[] is_69_;
			int[] is_70_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_71_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12319(i_67_, 752457538);
				is_68_ = is_71_;
				is_69_ = is_71_;
				is_70_ = is_71_;
			} else {
				int[][] is_72_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12320(i_67_, 366117304);
				is_68_ = is_72_[0];
				is_69_ = is_72_[1];
				is_70_ = is_72_[2];
			}
			int[] is_73_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.aBool7669)
				is_73_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12319(i_67_, 752457538);
			else
				is_73_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12320(i_67_, 1355389802)[0];
			if (bool)
				i_66_ = i_67_;
			for (int i_74_ = i - 1; i_74_ >= 0; i_74_--) {
				int i_75_ = is_68_[i_74_] >> 4;
				if (i_75_ > 255)
					i_75_ = 255;
				if (i_75_ < 0)
					i_75_ = 0;
				int i_76_ = is_69_[i_74_] >> 4;
				if (i_76_ > 255)
					i_76_ = 255;
				if (i_76_ < 0)
					i_76_ = 0;
				int i_77_ = is_70_[i_74_] >> 4;
				if (i_77_ > 255)
					i_77_ = 255;
				if (i_77_ < 0)
					i_77_ = 0;
				i_75_ = anIntArray9474[i_75_];
				i_76_ = anIntArray9474[i_76_];
				i_77_ = anIntArray9474[i_77_];
				int i_78_;
				if (i_75_ != 0 || 0 != i_76_ || i_77_ != 0) {
					i_78_ = is_73_[i_74_] >> 4;
					if (i_78_ > 255)
						i_78_ = 255;
					if (i_78_ < 0)
						i_78_ = 0;
				} else
					i_78_ = 0;
				is[i_66_++] = (i_76_ << 8) + ((i_75_ << 16) + (i_78_ << 24)) + i_77_;
				if (bool)
					i_66_ += i - 1;
			}
		}
		for (int i_79_ = 0; (i_79_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_79_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_79_].method12326(984017845);
		return is;
	}

	int[] method14725(Index class317, Interface22 interface22, double d, int i, int i_80_, boolean bool) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_81_ = 0; (i_81_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_81_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_81_].method12315(i, i_80_, (byte) 41);
		Class229.method3895(d);
		Class316.method5593(i, i_80_, 706850973);
		int[] is = new int[i * i_80_];
		int i_82_ = 0;
		for (int i_83_ = 0; i_83_ < i_80_; i_83_++) {
			int[] is_84_;
			int[] is_85_;
			int[] is_86_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_87_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12319(i_83_, 752457538);
				is_84_ = is_87_;
				is_85_ = is_87_;
				is_86_ = is_87_;
			} else {
				int[][] is_88_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12320(i_83_, -25616912);
				is_84_ = is_88_[0];
				is_85_ = is_88_[1];
				is_86_ = is_88_[2];
			}
			int[] is_89_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.aBool7669)
				is_89_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12319(i_83_, 752457538);
			else
				is_89_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12320(i_83_, 1516338179)[0];
			if (bool)
				i_82_ = i_83_;
			for (int i_90_ = i - 1; i_90_ >= 0; i_90_--) {
				int i_91_ = is_84_[i_90_] >> 4;
				if (i_91_ > 255)
					i_91_ = 255;
				if (i_91_ < 0)
					i_91_ = 0;
				int i_92_ = is_85_[i_90_] >> 4;
				if (i_92_ > 255)
					i_92_ = 255;
				if (i_92_ < 0)
					i_92_ = 0;
				int i_93_ = is_86_[i_90_] >> 4;
				if (i_93_ > 255)
					i_93_ = 255;
				if (i_93_ < 0)
					i_93_ = 0;
				i_91_ = anIntArray9474[i_91_];
				i_92_ = anIntArray9474[i_92_];
				i_93_ = anIntArray9474[i_93_];
				int i_94_;
				if (i_91_ != 0 || 0 != i_92_ || i_93_ != 0) {
					i_94_ = is_89_[i_90_] >> 4;
					if (i_94_ > 255)
						i_94_ = 255;
					if (i_94_ < 0)
						i_94_ = 0;
				} else
					i_94_ = 0;
				is[i_82_++] = (i_92_ << 8) + ((i_91_ << 16) + (i_94_ << 24)) + i_93_;
				if (bool)
					i_82_ += i - 1;
			}
		}
		for (int i_95_ = 0; (i_95_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_95_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_95_].method12326(984017845);
		return is;
	}

	float[] method14726(Index class317, Interface22 interface22, int i, int i_96_, boolean bool) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_97_ = 0; (i_97_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_97_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_97_].method12315(i, i_96_, (byte) 44);
		Class316.method5593(i, i_96_, 457325318);
		float[] fs = new float[i_96_ * i * 4];
		int i_98_ = 0;
		for (int i_99_ = 0; i_99_ < i_96_; i_99_++) {
			int[] is;
			int[] is_100_;
			int[] is_101_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_102_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12319(i_99_, 752457538);
				is = is_102_;
				is_100_ = is_102_;
				is_101_ = is_102_;
			} else {
				int[][] is_103_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12320(i_99_, -878528496);
				is = is_103_[0];
				is_100_ = is_103_[1];
				is_101_ = is_103_[2];
			}
			int[] is_104_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.aBool7669)
				is_104_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12319(i_99_, 752457538);
			else
				is_104_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12320(i_99_, 1723981212)[0];
			int[] is_105_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9480.aBool7669)
				is_105_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9480.method12319(i_99_, 752457538);
			else
				is_105_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9480.method12320(i_99_, -1521114194)[0];
			if (bool)
				i_98_ = i_99_ << 2;
			for (int i_106_ = i - 1; i_106_ >= 0; i_106_--) {
				float f = (float) is_104_[i_106_] / 4096.0F;
				float f_107_ = ((1.0F + (float) is_105_[i_106_] * 31.0F / 4096.0F) / 4096.0F);
				if (f < 0.0F)
					f = 0.0F;
				else if (f > 1.0F)
					f = 1.0F;
				fs[i_98_++] = (float) is[i_106_] * f_107_;
				fs[i_98_++] = f_107_ * (float) is_100_[i_106_];
				fs[i_98_++] = (float) is_101_[i_106_] * f_107_;
				fs[i_98_++] = f;
				if (bool)
					i_98_ += (i << 2) - 4;
			}
		}
		for (int i_108_ = 0; (i_108_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_108_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_108_].method12326(984017845);
		return fs;
	}

	float[] method14727(Index class317, Interface22 interface22, int i, int i_109_, boolean bool) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_110_ = 0; (i_110_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_110_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_110_].method12315(i, i_109_, (byte) 12);
		Class316.method5593(i, i_109_, 364013161);
		float[] fs = new float[i_109_ * i * 4];
		int i_111_ = 0;
		for (int i_112_ = 0; i_112_ < i_109_; i_112_++) {
			int[] is;
			int[] is_113_;
			int[] is_114_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_115_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12319(i_112_, 752457538);
				is = is_115_;
				is_113_ = is_115_;
				is_114_ = is_115_;
			} else {
				int[][] is_116_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9476.method12320(i_112_, 1922894291);
				is = is_116_[0];
				is_113_ = is_116_[1];
				is_114_ = is_116_[2];
			}
			int[] is_117_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.aBool7669)
				is_117_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12319(i_112_, 752457538);
			else
				is_117_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9477.method12320(i_112_, 2102930031)[0];
			int[] is_118_;
			if (((Class282_Sub50_Sub3) this).aClass282_Sub20_9480.aBool7669)
				is_118_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9480.method12319(i_112_, 752457538);
			else
				is_118_ = ((Class282_Sub50_Sub3) this).aClass282_Sub20_9480.method12320(i_112_, 1365085683)[0];
			if (bool)
				i_111_ = i_112_ << 2;
			for (int i_119_ = i - 1; i_119_ >= 0; i_119_--) {
				float f = (float) is_117_[i_119_] / 4096.0F;
				float f_120_ = ((1.0F + (float) is_118_[i_119_] * 31.0F / 4096.0F) / 4096.0F);
				if (f < 0.0F)
					f = 0.0F;
				else if (f > 1.0F)
					f = 1.0F;
				fs[i_111_++] = (float) is[i_119_] * f_120_;
				fs[i_111_++] = f_120_ * (float) is_113_[i_119_];
				fs[i_111_++] = (float) is_114_[i_119_] * f_120_;
				fs[i_111_++] = f;
				if (bool)
					i_111_ += (i << 2) - 4;
			}
		}
		for (int i_121_ = 0; (i_121_ < ((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478.length); i_121_++)
			((Class282_Sub50_Sub3) this).aClass282_Sub20Array9478[i_121_].method12326(984017845);
		return fs;
	}

	static void method14728(double d) {
		if (d != aDouble9479) {
			for (int i = 0; i < 256; i++) {
				int i_122_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
				anIntArray9474[i] = i_122_ > 255 ? 255 : i_122_;
			}
			aDouble9479 = d;
		}
	}
}
