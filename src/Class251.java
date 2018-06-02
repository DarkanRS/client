
/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.imageio.ImageIO;

public final class Class251 {
	static final int anInt3094 = 128;
	static int anInt3095;
	static int[][] anIntArrayArray3096 = new int[128][128];
	static final int anInt3097 = 128;
	static int anInt3098;
	static int[] anIntArray3099;
	static final int anInt3100 = 4095;
	static int[] anIntArray3101;
	static int[][] anIntArrayArray3102 = new int[128][128];
	static Class194 aClass194_3103;

	static final boolean method4300(int i, int i_0_, Class225 class225, Class336 class336) {
		int i_1_ = i;
		int i_2_ = i_0_;
		int i_3_ = 64;
		int i_4_ = 64;
		int i_5_ = i - i_3_;
		int i_6_ = i_0_ - i_4_;
		anIntArrayArray3096[i_3_][i_4_] = 99;
		anIntArrayArray3102[i_3_][i_4_] = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		anIntArray3101[i_7_] = i_1_;
		anIntArray3099[i_7_++] = i_2_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_8_ != i_7_) {
			i_1_ = anIntArray3101[i_8_];
			i_2_ = anIntArray3099[i_8_];
			i_8_ = 1 + i_8_ & 0xfff;
			i_3_ = i_1_ - i_5_;
			i_4_ = i_2_ - i_6_;
			int i_9_ = i_1_ - -1969357273 * class336.anInt3931;
			int i_10_ = i_2_ - 1503444365 * class336.anInt3964;
			if (class225.method3787(1, i_1_, i_2_, class336, (byte) -6)) {
				anInt3098 = i_1_ * -1071145131;
				anInt3095 = -1330567915 * i_2_;
				return true;
			}
			int i_11_ = anIntArrayArray3102[i_3_][i_4_] + 1;
			if (i_3_ > 0 && anIntArrayArray3096[i_3_ - 1][i_4_] == 0 && (is[i_9_ - 1][i_10_] & 0x42240000) == 0) {
				anIntArray3101[i_7_] = i_1_ - 1;
				anIntArray3099[i_7_] = i_2_;
				i_7_ = i_7_ + 1 & 0xfff;
				anIntArrayArray3096[i_3_ - 1][i_4_] = 2;
				anIntArrayArray3102[i_3_ - 1][i_4_] = i_11_;
			}
			if (i_3_ < 127 && anIntArrayArray3096[i_3_ + 1][i_4_] == 0 && 0 == (is[1 + i_9_][i_10_] & 0x60240000)) {
				anIntArray3101[i_7_] = 1 + i_1_;
				anIntArray3099[i_7_] = i_2_;
				i_7_ = 1 + i_7_ & 0xfff;
				anIntArrayArray3096[1 + i_3_][i_4_] = 8;
				anIntArrayArray3102[i_3_ + 1][i_4_] = i_11_;
			}
			if (i_4_ > 0 && 0 == anIntArrayArray3096[i_3_][i_4_ - 1] && 0 == (is[i_9_][i_10_ - 1] & 0x40a40000)) {
				anIntArray3101[i_7_] = i_1_;
				anIntArray3099[i_7_] = i_2_ - 1;
				i_7_ = i_7_ + 1 & 0xfff;
				anIntArrayArray3096[i_3_][i_4_ - 1] = 1;
				anIntArrayArray3102[i_3_][i_4_ - 1] = i_11_;
			}
			if (i_4_ < 127 && 0 == anIntArrayArray3096[i_3_][i_4_ + 1] && (is[i_9_][i_10_ + 1] & 0x48240000) == 0) {
				anIntArray3101[i_7_] = i_1_;
				anIntArray3099[i_7_] = i_2_ + 1;
				i_7_ = i_7_ + 1 & 0xfff;
				anIntArrayArray3096[i_3_][1 + i_4_] = 4;
				anIntArrayArray3102[i_3_][1 + i_4_] = i_11_;
			}
			if (i_3_ > 0 && i_4_ > 0 && anIntArrayArray3096[i_3_ - 1][i_4_ - 1] == 0 && 0 == (is[i_9_ - 1][i_10_ - 1] & 0x43a40000) && (is[i_9_ - 1][i_10_] & 0x42240000) == 0 && 0 == (is[i_9_][i_10_ - 1] & 0x40a40000)) {
				anIntArray3101[i_7_] = i_1_ - 1;
				anIntArray3099[i_7_] = i_2_ - 1;
				i_7_ = 1 + i_7_ & 0xfff;
				anIntArrayArray3096[i_3_ - 1][i_4_ - 1] = 3;
				anIntArrayArray3102[i_3_ - 1][i_4_ - 1] = i_11_;
			}
			if (i_3_ < 127 && i_4_ > 0 && 0 == anIntArrayArray3096[i_3_ + 1][i_4_ - 1] && (is[1 + i_9_][i_10_ - 1] & 0x60e40000) == 0 && 0 == (is[1 + i_9_][i_10_] & 0x60240000) && (is[i_9_][i_10_ - 1] & 0x40a40000) == 0) {
				anIntArray3101[i_7_] = i_1_ + 1;
				anIntArray3099[i_7_] = i_2_ - 1;
				i_7_ = i_7_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_3_][i_4_ - 1] = 9;
				anIntArrayArray3102[1 + i_3_][i_4_ - 1] = i_11_;
			}
			if (i_3_ > 0 && i_4_ < 127 && anIntArrayArray3096[i_3_ - 1][1 + i_4_] == 0 && 0 == (is[i_9_ - 1][1 + i_10_] & 0x4e240000) && (is[i_9_ - 1][i_10_] & 0x42240000) == 0 && 0 == (is[i_9_][1 + i_10_] & 0x48240000)) {
				anIntArray3101[i_7_] = i_1_ - 1;
				anIntArray3099[i_7_] = i_2_ + 1;
				i_7_ = i_7_ + 1 & 0xfff;
				anIntArrayArray3096[i_3_ - 1][i_4_ + 1] = 6;
				anIntArrayArray3102[i_3_ - 1][1 + i_4_] = i_11_;
			}
			if (i_3_ < 127 && i_4_ < 127 && 0 == anIntArrayArray3096[1 + i_3_][1 + i_4_] && (is[i_9_ + 1][1 + i_10_] & 0x78240000) == 0 && (is[1 + i_9_][i_10_] & 0x60240000) == 0 && (is[i_9_][1 + i_10_] & 0x48240000) == 0) {
				anIntArray3101[i_7_] = 1 + i_1_;
				anIntArray3099[i_7_] = 1 + i_2_;
				i_7_ = i_7_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_3_][1 + i_4_] = 12;
				anIntArrayArray3102[i_3_ + 1][1 + i_4_] = i_11_;
			}
		}
		anInt3098 = i_1_ * -1071145131;
		anInt3095 = i_2_ * -1330567915;
		return false;
	}

	static {
		anIntArray3101 = new int[4096];
		anIntArray3099 = new int[4096];
	}

	public static int method4301(int i, int i_12_, int i_13_, Class225 class225, Class336 class336, boolean bool, int[] is, int[] is_14_) {
		for (int i_15_ = 0; i_15_ < 128; i_15_++) {
			for (int i_16_ = 0; i_16_ < 128; i_16_++) {
				anIntArrayArray3096[i_15_][i_16_] = 0;
				anIntArrayArray3102[i_15_][i_16_] = 99999999;
			}
		}
		boolean bool_17_;
		if (i_13_ == 1)
			bool_17_ = Class96_Sub17.method14654(i, i_12_, class225, class336, -1267445717);
		else if (i_13_ == 2)
			bool_17_ = Class46.method929(i, i_12_, class225, class336, 1980244334);
		else
			bool_17_ = Class46.method930(i, i_12_, i_13_, class225, class336, (byte) -96);
		int i_18_ = i - 64;
		int i_19_ = i_12_ - 64;
		int i_20_ = anInt3098 * -1659935235;
		int i_21_ = anInt3095 * 1434452541;
		if (!bool_17_) {
			if (bool) {
				int i_22_ = 2147483647;
				int i_23_ = 2147483647;
				int i_24_ = 10;
				int i_25_ = -1440558477 * class225.anInt2779;
				int i_26_ = class225.anInt2780 * 1732585867;
				int i_27_ = -1384164183 * class225.anInt2781;
				int i_28_ = class225.anInt2782 * 361960939;
				for (int i_29_ = i_25_ - i_24_; i_29_ <= i_25_ + i_24_; i_29_++) {
					for (int i_30_ = i_26_ - i_24_; i_30_ <= i_26_ + i_24_; i_30_++) {
						int i_31_ = i_29_ - i_18_;
						int i_32_ = i_30_ - i_19_;
						if (i_31_ >= 0 && i_32_ >= 0 && i_31_ < 128 && i_32_ < 128 && anIntArrayArray3102[i_31_][i_32_] < 100) {
							int i_33_ = 0;
							if (i_29_ < i_25_)
								i_33_ = i_25_ - i_29_;
							else if (i_29_ > i_27_ + i_25_ - 1)
								i_33_ = i_29_ - (i_25_ + i_27_ - 1);
							int i_34_ = 0;
							if (i_30_ < i_26_)
								i_34_ = i_26_ - i_30_;
							else if (i_30_ > i_28_ + i_26_ - 1)
								i_34_ = i_30_ - (i_26_ + i_28_ - 1);
							int i_35_ = i_33_ * i_33_ + i_34_ * i_34_;
							if (i_35_ < i_22_ || (i_35_ == i_22_ && (anIntArrayArray3102[i_31_][i_32_] < i_23_))) {
								i_22_ = i_35_;
								i_23_ = anIntArrayArray3102[i_31_][i_32_];
								i_20_ = i_29_;
								i_21_ = i_30_;
							}
						}
					}
				}
				if (i_22_ == 2147483647)
					return -1;
			} else
				return -1;
		}
		if (i == i_20_ && i_12_ == i_21_)
			return 0;
		int i_36_ = 0;
		anIntArray3101[i_36_] = i_20_;
		anIntArray3099[i_36_++] = i_21_;
		int i_38_;
		int i_37_ = i_38_ = anIntArrayArray3096[i_20_ - i_18_][i_21_ - i_19_];
		while (i != i_20_ || i_21_ != i_12_) {
			if (i_38_ != i_37_) {
				i_38_ = i_37_;
				anIntArray3101[i_36_] = i_20_;
				anIntArray3099[i_36_++] = i_21_;
			}
			if ((i_37_ & 0x2) != 0)
				i_20_++;
			else if ((i_37_ & 0x8) != 0)
				i_20_--;
			if ((i_37_ & 0x1) != 0)
				i_21_++;
			else if ((i_37_ & 0x4) != 0)
				i_21_--;
			i_37_ = anIntArrayArray3096[i_20_ - i_18_][i_21_ - i_19_];
		}
		int i_39_ = 0;
		do {
			if (i_36_-- <= 0)
				break;
			is[i_39_] = anIntArray3101[i_36_];
			is_14_[i_39_++] = anIntArray3099[i_36_];
		} while (i_39_ < is.length);
		return i_39_;
	}

	Class251() throws Throwable {
		throw new Error();
	}

	static final boolean method4302(int i, int i_40_, Class225 class225, Class336 class336) {
		int i_41_ = i;
		int i_42_ = i_40_;
		int i_43_ = 64;
		int i_44_ = 64;
		int i_45_ = i - i_43_;
		int i_46_ = i_40_ - i_44_;
		anIntArrayArray3096[i_43_][i_44_] = 99;
		anIntArrayArray3102[i_43_][i_44_] = 0;
		int i_47_ = 0;
		int i_48_ = 0;
		anIntArray3101[i_47_] = i_41_;
		anIntArray3099[i_47_++] = i_42_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_48_ != i_47_) {
			i_41_ = anIntArray3101[i_48_];
			i_42_ = anIntArray3099[i_48_];
			i_48_ = 1 + i_48_ & 0xfff;
			i_43_ = i_41_ - i_45_;
			i_44_ = i_42_ - i_46_;
			int i_49_ = i_41_ - -1969357273 * class336.anInt3931;
			int i_50_ = i_42_ - 1503444365 * class336.anInt3964;
			if (class225.method3787(1, i_41_, i_42_, class336, (byte) -128)) {
				anInt3098 = i_41_ * -1071145131;
				anInt3095 = -1330567915 * i_42_;
				return true;
			}
			int i_51_ = anIntArrayArray3102[i_43_][i_44_] + 1;
			if (i_43_ > 0 && anIntArrayArray3096[i_43_ - 1][i_44_] == 0 && (is[i_49_ - 1][i_50_] & 0x42240000) == 0) {
				anIntArray3101[i_47_] = i_41_ - 1;
				anIntArray3099[i_47_] = i_42_;
				i_47_ = i_47_ + 1 & 0xfff;
				anIntArrayArray3096[i_43_ - 1][i_44_] = 2;
				anIntArrayArray3102[i_43_ - 1][i_44_] = i_51_;
			}
			if (i_43_ < 127 && anIntArrayArray3096[i_43_ + 1][i_44_] == 0 && 0 == (is[1 + i_49_][i_50_] & 0x60240000)) {
				anIntArray3101[i_47_] = 1 + i_41_;
				anIntArray3099[i_47_] = i_42_;
				i_47_ = 1 + i_47_ & 0xfff;
				anIntArrayArray3096[1 + i_43_][i_44_] = 8;
				anIntArrayArray3102[i_43_ + 1][i_44_] = i_51_;
			}
			if (i_44_ > 0 && 0 == anIntArrayArray3096[i_43_][i_44_ - 1] && 0 == (is[i_49_][i_50_ - 1] & 0x40a40000)) {
				anIntArray3101[i_47_] = i_41_;
				anIntArray3099[i_47_] = i_42_ - 1;
				i_47_ = i_47_ + 1 & 0xfff;
				anIntArrayArray3096[i_43_][i_44_ - 1] = 1;
				anIntArrayArray3102[i_43_][i_44_ - 1] = i_51_;
			}
			if (i_44_ < 127 && 0 == anIntArrayArray3096[i_43_][i_44_ + 1] && (is[i_49_][i_50_ + 1] & 0x48240000) == 0) {
				anIntArray3101[i_47_] = i_41_;
				anIntArray3099[i_47_] = i_42_ + 1;
				i_47_ = i_47_ + 1 & 0xfff;
				anIntArrayArray3096[i_43_][1 + i_44_] = 4;
				anIntArrayArray3102[i_43_][1 + i_44_] = i_51_;
			}
			if (i_43_ > 0 && i_44_ > 0 && anIntArrayArray3096[i_43_ - 1][i_44_ - 1] == 0 && 0 == (is[i_49_ - 1][i_50_ - 1] & 0x43a40000) && (is[i_49_ - 1][i_50_] & 0x42240000) == 0 && 0 == (is[i_49_][i_50_ - 1] & 0x40a40000)) {
				anIntArray3101[i_47_] = i_41_ - 1;
				anIntArray3099[i_47_] = i_42_ - 1;
				i_47_ = 1 + i_47_ & 0xfff;
				anIntArrayArray3096[i_43_ - 1][i_44_ - 1] = 3;
				anIntArrayArray3102[i_43_ - 1][i_44_ - 1] = i_51_;
			}
			if (i_43_ < 127 && i_44_ > 0 && 0 == anIntArrayArray3096[i_43_ + 1][i_44_ - 1] && (is[1 + i_49_][i_50_ - 1] & 0x60e40000) == 0 && 0 == (is[1 + i_49_][i_50_] & 0x60240000) && (is[i_49_][i_50_ - 1] & 0x40a40000) == 0) {
				anIntArray3101[i_47_] = i_41_ + 1;
				anIntArray3099[i_47_] = i_42_ - 1;
				i_47_ = i_47_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_43_][i_44_ - 1] = 9;
				anIntArrayArray3102[1 + i_43_][i_44_ - 1] = i_51_;
			}
			if (i_43_ > 0 && i_44_ < 127 && anIntArrayArray3096[i_43_ - 1][1 + i_44_] == 0 && 0 == (is[i_49_ - 1][1 + i_50_] & 0x4e240000) && (is[i_49_ - 1][i_50_] & 0x42240000) == 0 && 0 == (is[i_49_][1 + i_50_] & 0x48240000)) {
				anIntArray3101[i_47_] = i_41_ - 1;
				anIntArray3099[i_47_] = i_42_ + 1;
				i_47_ = i_47_ + 1 & 0xfff;
				anIntArrayArray3096[i_43_ - 1][i_44_ + 1] = 6;
				anIntArrayArray3102[i_43_ - 1][1 + i_44_] = i_51_;
			}
			if (i_43_ < 127 && i_44_ < 127 && 0 == anIntArrayArray3096[1 + i_43_][1 + i_44_] && (is[i_49_ + 1][1 + i_50_] & 0x78240000) == 0 && (is[1 + i_49_][i_50_] & 0x60240000) == 0 && (is[i_49_][1 + i_50_] & 0x48240000) == 0) {
				anIntArray3101[i_47_] = 1 + i_41_;
				anIntArray3099[i_47_] = 1 + i_42_;
				i_47_ = i_47_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_43_][1 + i_44_] = 12;
				anIntArrayArray3102[i_43_ + 1][1 + i_44_] = i_51_;
			}
		}
		anInt3098 = i_41_ * -1071145131;
		anInt3095 = i_42_ * -1330567915;
		return false;
	}

	static final boolean method4303(int i, int i_52_, int i_53_, Class225 class225, Class336 class336) {
		int i_54_ = i;
		int i_55_ = i_52_;
		int i_56_ = 64;
		int i_57_ = 64;
		int i_58_ = i - i_56_;
		int i_59_ = i_52_ - i_57_;
		anIntArrayArray3096[i_56_][i_57_] = 99;
		anIntArrayArray3102[i_56_][i_57_] = 0;
		int i_60_ = 0;
		int i_61_ = 0;
		anIntArray3101[i_60_] = i_54_;
		anIntArray3099[i_60_++] = i_55_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_60_ != i_61_) {
			i_54_ = anIntArray3101[i_61_];
			i_55_ = anIntArray3099[i_61_];
			i_61_ = 1 + i_61_ & 0xfff;
			i_56_ = i_54_ - i_58_;
			i_57_ = i_55_ - i_59_;
			int i_62_ = i_54_ - -1969357273 * class336.anInt3931;
			int i_63_ = i_55_ - class336.anInt3964 * 1503444365;
			if (class225.method3787(i_53_, i_54_, i_55_, class336, (byte) -39)) {
				anInt3098 = -1071145131 * i_54_;
				anInt3095 = -1330567915 * i_55_;
				return true;
			}
			int i_64_ = 1 + anIntArrayArray3102[i_56_][i_57_];
			while_85_: do {
				if (i_56_ > 0 && anIntArrayArray3096[i_56_ - 1][i_57_] == 0 && (is[i_62_ - 1][i_63_] & 0x43a40000) == 0 && 0 == (is[i_62_ - 1][i_53_ + i_63_ - 1] & 0x4e240000)) {
					for (int i_65_ = 1; i_65_ < i_53_ - 1; i_65_++) {
						if ((is[i_62_ - 1][i_65_ + i_63_] & 0x4fa40000) != 0)
							break while_85_;
					}
					anIntArray3101[i_60_] = i_54_ - 1;
					anIntArray3099[i_60_] = i_55_;
					i_60_ = i_60_ + 1 & 0xfff;
					anIntArrayArray3096[i_56_ - 1][i_57_] = 2;
					anIntArrayArray3102[i_56_ - 1][i_57_] = i_64_;
				}
			} while (false);
			while_86_: do {
				if (i_56_ < 128 - i_53_ && anIntArrayArray3096[1 + i_56_][i_57_] == 0 && (is[i_53_ + i_62_][i_63_] & 0x60e40000) == 0 && 0 == (is[i_53_ + i_62_][i_63_ + i_53_ - 1] & 0x78240000)) {
					for (int i_66_ = 1; i_66_ < i_53_ - 1; i_66_++) {
						if ((is[i_62_ + i_53_][i_66_ + i_63_] & 0x78e40000) != 0)
							break while_86_;
					}
					anIntArray3101[i_60_] = i_54_ + 1;
					anIntArray3099[i_60_] = i_55_;
					i_60_ = i_60_ + 1 & 0xfff;
					anIntArrayArray3096[i_56_ + 1][i_57_] = 8;
					anIntArrayArray3102[i_56_ + 1][i_57_] = i_64_;
				}
			} while (false);
			while_87_: do {
				if (i_57_ > 0 && 0 == anIntArrayArray3096[i_56_][i_57_ - 1] && (is[i_62_][i_63_ - 1] & 0x43a40000) == 0 && (is[i_53_ + i_62_ - 1][i_63_ - 1] & 0x60e40000) == 0) {
					for (int i_67_ = 1; i_67_ < i_53_ - 1; i_67_++) {
						if (0 != (is[i_67_ + i_62_][i_63_ - 1] & 0x63e40000))
							break while_87_;
					}
					anIntArray3101[i_60_] = i_54_;
					anIntArray3099[i_60_] = i_55_ - 1;
					i_60_ = 1 + i_60_ & 0xfff;
					anIntArrayArray3096[i_56_][i_57_ - 1] = 1;
					anIntArrayArray3102[i_56_][i_57_ - 1] = i_64_;
				}
			} while (false);
			while_88_: do {
				if (i_57_ < 128 - i_53_ && 0 == anIntArrayArray3096[i_56_][1 + i_57_] && (is[i_62_][i_53_ + i_63_] & 0x4e240000) == 0 && 0 == (is[i_62_ + i_53_ - 1][i_63_ + i_53_] & 0x78240000)) {
					for (int i_68_ = 1; i_68_ < i_53_ - 1; i_68_++) {
						if (0 != (is[i_62_ + i_68_][i_63_ + i_53_] & 0x7e240000))
							break while_88_;
					}
					anIntArray3101[i_60_] = i_54_;
					anIntArray3099[i_60_] = i_55_ + 1;
					i_60_ = i_60_ + 1 & 0xfff;
					anIntArrayArray3096[i_56_][i_57_ + 1] = 4;
					anIntArrayArray3102[i_56_][i_57_ + 1] = i_64_;
				}
			} while (false);
			while_89_: do {
				if (i_56_ > 0 && i_57_ > 0 && 0 == anIntArrayArray3096[i_56_ - 1][i_57_ - 1] && 0 == (is[i_62_ - 1][i_63_ - 1] & 0x43a40000)) {
					for (int i_69_ = 1; i_69_ < i_53_; i_69_++) {
						if (0 != (is[i_62_ - 1][i_63_ - 1 + i_69_] & 0x4fa40000) || (is[i_69_ + (i_62_ - 1)][i_63_ - 1] & 0x63e40000) != 0)
							break while_89_;
					}
					anIntArray3101[i_60_] = i_54_ - 1;
					anIntArray3099[i_60_] = i_55_ - 1;
					i_60_ = 1 + i_60_ & 0xfff;
					anIntArrayArray3096[i_56_ - 1][i_57_ - 1] = 3;
					anIntArrayArray3102[i_56_ - 1][i_57_ - 1] = i_64_;
				}
			} while (false);
			while_90_: do {
				if (i_56_ < 128 - i_53_ && i_57_ > 0 && anIntArrayArray3096[1 + i_56_][i_57_ - 1] == 0 && 0 == (is[i_53_ + i_62_][i_63_ - 1] & 0x60e40000)) {
					for (int i_70_ = 1; i_70_ < i_53_; i_70_++) {
						if ((is[i_62_ + i_53_][i_63_ - 1 + i_70_] & 0x78e40000) != 0 || 0 != (is[i_70_ + i_62_][i_63_ - 1] & 0x63e40000))
							break while_90_;
					}
					anIntArray3101[i_60_] = 1 + i_54_;
					anIntArray3099[i_60_] = i_55_ - 1;
					i_60_ = 1 + i_60_ & 0xfff;
					anIntArrayArray3096[1 + i_56_][i_57_ - 1] = 9;
					anIntArrayArray3102[1 + i_56_][i_57_ - 1] = i_64_;
				}
			} while (false);
			while_91_: do {
				if (i_56_ > 0 && i_57_ < 128 - i_53_ && anIntArrayArray3096[i_56_ - 1][1 + i_57_] == 0 && (is[i_62_ - 1][i_53_ + i_63_] & 0x4e240000) == 0) {
					for (int i_71_ = 1; i_71_ < i_53_; i_71_++) {
						if (0 != (is[i_62_ - 1][i_71_ + i_63_] & 0x4fa40000) || 0 != (is[i_71_ + (i_62_ - 1)][i_53_ + i_63_] & 0x7e240000))
							break while_91_;
					}
					anIntArray3101[i_60_] = i_54_ - 1;
					anIntArray3099[i_60_] = 1 + i_55_;
					i_60_ = i_60_ + 1 & 0xfff;
					anIntArrayArray3096[i_56_ - 1][1 + i_57_] = 6;
					anIntArrayArray3102[i_56_ - 1][1 + i_57_] = i_64_;
				}
			} while (false);
			while_92_: do {
				if (i_56_ < 128 - i_53_ && i_57_ < 128 - i_53_ && anIntArrayArray3096[i_56_ + 1][1 + i_57_] == 0 && (is[i_62_ + i_53_][i_53_ + i_63_] & 0x78240000) == 0) {
					for (int i_72_ = 1; i_72_ < i_53_; i_72_++) {
						if (((is[i_62_ + i_72_][i_63_ + i_53_] & 0x7e240000) != 0) || 0 != (is[i_53_ + i_62_][i_72_ + i_63_] & 0x78e40000))
							break while_92_;
					}
					anIntArray3101[i_60_] = i_54_ + 1;
					anIntArray3099[i_60_] = i_55_ + 1;
					i_60_ = i_60_ + 1 & 0xfff;
					anIntArrayArray3096[1 + i_56_][i_57_ + 1] = 12;
					anIntArrayArray3102[1 + i_56_][1 + i_57_] = i_64_;
				}
			} while (false);
		}
		anInt3098 = -1071145131 * i_54_;
		anInt3095 = -1330567915 * i_55_;
		return false;
	}

	static final boolean method4304(int i, int i_73_, Class225 class225, Class336 class336) {
		int i_74_ = i;
		int i_75_ = i_73_;
		int i_76_ = 64;
		int i_77_ = 64;
		int i_78_ = i - i_76_;
		int i_79_ = i_73_ - i_77_;
		anIntArrayArray3096[i_76_][i_77_] = 99;
		anIntArrayArray3102[i_76_][i_77_] = 0;
		int i_80_ = 0;
		int i_81_ = 0;
		anIntArray3101[i_80_] = i_74_;
		anIntArray3099[i_80_++] = i_75_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_81_ != i_80_) {
			i_74_ = anIntArray3101[i_81_];
			i_75_ = anIntArray3099[i_81_];
			i_81_ = 1 + i_81_ & 0xfff;
			i_76_ = i_74_ - i_78_;
			i_77_ = i_75_ - i_79_;
			int i_82_ = i_74_ - -1969357273 * class336.anInt3931;
			int i_83_ = i_75_ - class336.anInt3964 * 1503444365;
			if (class225.method3787(2, i_74_, i_75_, class336, (byte) -118)) {
				anInt3098 = i_74_ * -1071145131;
				anInt3095 = -1330567915 * i_75_;
				return true;
			}
			int i_84_ = anIntArrayArray3102[i_76_][i_77_] + 1;
			if (i_76_ > 0 && anIntArrayArray3096[i_76_ - 1][i_77_] == 0 && (is[i_82_ - 1][i_83_] & 0x43a40000) == 0 && 0 == (is[i_82_ - 1][1 + i_83_] & 0x4e240000)) {
				anIntArray3101[i_80_] = i_74_ - 1;
				anIntArray3099[i_80_] = i_75_;
				i_80_ = i_80_ + 1 & 0xfff;
				anIntArrayArray3096[i_76_ - 1][i_77_] = 2;
				anIntArrayArray3102[i_76_ - 1][i_77_] = i_84_;
			}
			if (i_76_ < 126 && 0 == anIntArrayArray3096[1 + i_76_][i_77_] && 0 == (is[2 + i_82_][i_83_] & 0x60e40000) && 0 == (is[i_82_ + 2][1 + i_83_] & 0x78240000)) {
				anIntArray3101[i_80_] = 1 + i_74_;
				anIntArray3099[i_80_] = i_75_;
				i_80_ = 1 + i_80_ & 0xfff;
				anIntArrayArray3096[i_76_ + 1][i_77_] = 8;
				anIntArrayArray3102[i_76_ + 1][i_77_] = i_84_;
			}
			if (i_77_ > 0 && anIntArrayArray3096[i_76_][i_77_ - 1] == 0 && 0 == (is[i_82_][i_83_ - 1] & 0x43a40000) && (is[i_82_ + 1][i_83_ - 1] & 0x60e40000) == 0) {
				anIntArray3101[i_80_] = i_74_;
				anIntArray3099[i_80_] = i_75_ - 1;
				i_80_ = 1 + i_80_ & 0xfff;
				anIntArrayArray3096[i_76_][i_77_ - 1] = 1;
				anIntArrayArray3102[i_76_][i_77_ - 1] = i_84_;
			}
			if (i_77_ < 126 && anIntArrayArray3096[i_76_][i_77_ + 1] == 0 && (is[i_82_][i_83_ + 2] & 0x4e240000) == 0 && 0 == (is[1 + i_82_][i_83_ + 2] & 0x78240000)) {
				anIntArray3101[i_80_] = i_74_;
				anIntArray3099[i_80_] = i_75_ + 1;
				i_80_ = 1 + i_80_ & 0xfff;
				anIntArrayArray3096[i_76_][i_77_ + 1] = 4;
				anIntArrayArray3102[i_76_][i_77_ + 1] = i_84_;
			}
			if (i_76_ > 0 && i_77_ > 0 && anIntArrayArray3096[i_76_ - 1][i_77_ - 1] == 0 && (is[i_82_ - 1][i_83_] & 0x4fa40000) == 0 && 0 == (is[i_82_ - 1][i_83_ - 1] & 0x43a40000) && 0 == (is[i_82_][i_83_ - 1] & 0x63e40000)) {
				anIntArray3101[i_80_] = i_74_ - 1;
				anIntArray3099[i_80_] = i_75_ - 1;
				i_80_ = 1 + i_80_ & 0xfff;
				anIntArrayArray3096[i_76_ - 1][i_77_ - 1] = 3;
				anIntArrayArray3102[i_76_ - 1][i_77_ - 1] = i_84_;
			}
			if (i_76_ < 126 && i_77_ > 0 && 0 == anIntArrayArray3096[i_76_ + 1][i_77_ - 1] && 0 == (is[1 + i_82_][i_83_ - 1] & 0x63e40000) && (is[2 + i_82_][i_83_ - 1] & 0x60e40000) == 0 && 0 == (is[2 + i_82_][i_83_] & 0x78e40000)) {
				anIntArray3101[i_80_] = 1 + i_74_;
				anIntArray3099[i_80_] = i_75_ - 1;
				i_80_ = i_80_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_76_][i_77_ - 1] = 9;
				anIntArrayArray3102[1 + i_76_][i_77_ - 1] = i_84_;
			}
			if (i_76_ > 0 && i_77_ < 126 && anIntArrayArray3096[i_76_ - 1][1 + i_77_] == 0 && 0 == (is[i_82_ - 1][i_83_ + 1] & 0x4fa40000) && 0 == (is[i_82_ - 1][i_83_ + 2] & 0x4e240000) && (is[i_82_][i_83_ + 2] & 0x7e240000) == 0) {
				anIntArray3101[i_80_] = i_74_ - 1;
				anIntArray3099[i_80_] = 1 + i_75_;
				i_80_ = 1 + i_80_ & 0xfff;
				anIntArrayArray3096[i_76_ - 1][1 + i_77_] = 6;
				anIntArrayArray3102[i_76_ - 1][i_77_ + 1] = i_84_;
			}
			if (i_76_ < 126 && i_77_ < 126 && anIntArrayArray3096[i_76_ + 1][1 + i_77_] == 0 && 0 == (is[i_82_ + 1][2 + i_83_] & 0x7e240000) && 0 == (is[i_82_ + 2][2 + i_83_] & 0x78240000) && (is[2 + i_82_][i_83_ + 1] & 0x78e40000) == 0) {
				anIntArray3101[i_80_] = i_74_ + 1;
				anIntArray3099[i_80_] = i_75_ + 1;
				i_80_ = i_80_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_76_][1 + i_77_] = 12;
				anIntArrayArray3102[1 + i_76_][1 + i_77_] = i_84_;
			}
		}
		anInt3098 = -1071145131 * i_74_;
		anInt3095 = i_75_ * -1330567915;
		return false;
	}

	static final boolean method4305(int i, int i_85_, Class225 class225, Class336 class336) {
		int i_86_ = i;
		int i_87_ = i_85_;
		int i_88_ = 64;
		int i_89_ = 64;
		int i_90_ = i - i_88_;
		int i_91_ = i_85_ - i_89_;
		anIntArrayArray3096[i_88_][i_89_] = 99;
		anIntArrayArray3102[i_88_][i_89_] = 0;
		int i_92_ = 0;
		int i_93_ = 0;
		anIntArray3101[i_92_] = i_86_;
		anIntArray3099[i_92_++] = i_87_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_93_ != i_92_) {
			i_86_ = anIntArray3101[i_93_];
			i_87_ = anIntArray3099[i_93_];
			i_93_ = 1 + i_93_ & 0xfff;
			i_88_ = i_86_ - i_90_;
			i_89_ = i_87_ - i_91_;
			int i_94_ = i_86_ - -1969357273 * class336.anInt3931;
			int i_95_ = i_87_ - class336.anInt3964 * 1503444365;
			if (class225.method3787(2, i_86_, i_87_, class336, (byte) -51)) {
				anInt3098 = i_86_ * -1071145131;
				anInt3095 = -1330567915 * i_87_;
				return true;
			}
			int i_96_ = anIntArrayArray3102[i_88_][i_89_] + 1;
			if (i_88_ > 0 && anIntArrayArray3096[i_88_ - 1][i_89_] == 0 && (is[i_94_ - 1][i_95_] & 0x43a40000) == 0 && 0 == (is[i_94_ - 1][1 + i_95_] & 0x4e240000)) {
				anIntArray3101[i_92_] = i_86_ - 1;
				anIntArray3099[i_92_] = i_87_;
				i_92_ = i_92_ + 1 & 0xfff;
				anIntArrayArray3096[i_88_ - 1][i_89_] = 2;
				anIntArrayArray3102[i_88_ - 1][i_89_] = i_96_;
			}
			if (i_88_ < 126 && 0 == anIntArrayArray3096[1 + i_88_][i_89_] && 0 == (is[2 + i_94_][i_95_] & 0x60e40000) && 0 == (is[i_94_ + 2][1 + i_95_] & 0x78240000)) {
				anIntArray3101[i_92_] = 1 + i_86_;
				anIntArray3099[i_92_] = i_87_;
				i_92_ = 1 + i_92_ & 0xfff;
				anIntArrayArray3096[i_88_ + 1][i_89_] = 8;
				anIntArrayArray3102[i_88_ + 1][i_89_] = i_96_;
			}
			if (i_89_ > 0 && anIntArrayArray3096[i_88_][i_89_ - 1] == 0 && 0 == (is[i_94_][i_95_ - 1] & 0x43a40000) && (is[i_94_ + 1][i_95_ - 1] & 0x60e40000) == 0) {
				anIntArray3101[i_92_] = i_86_;
				anIntArray3099[i_92_] = i_87_ - 1;
				i_92_ = 1 + i_92_ & 0xfff;
				anIntArrayArray3096[i_88_][i_89_ - 1] = 1;
				anIntArrayArray3102[i_88_][i_89_ - 1] = i_96_;
			}
			if (i_89_ < 126 && anIntArrayArray3096[i_88_][i_89_ + 1] == 0 && (is[i_94_][i_95_ + 2] & 0x4e240000) == 0 && 0 == (is[1 + i_94_][i_95_ + 2] & 0x78240000)) {
				anIntArray3101[i_92_] = i_86_;
				anIntArray3099[i_92_] = i_87_ + 1;
				i_92_ = 1 + i_92_ & 0xfff;
				anIntArrayArray3096[i_88_][i_89_ + 1] = 4;
				anIntArrayArray3102[i_88_][i_89_ + 1] = i_96_;
			}
			if (i_88_ > 0 && i_89_ > 0 && anIntArrayArray3096[i_88_ - 1][i_89_ - 1] == 0 && (is[i_94_ - 1][i_95_] & 0x4fa40000) == 0 && 0 == (is[i_94_ - 1][i_95_ - 1] & 0x43a40000) && 0 == (is[i_94_][i_95_ - 1] & 0x63e40000)) {
				anIntArray3101[i_92_] = i_86_ - 1;
				anIntArray3099[i_92_] = i_87_ - 1;
				i_92_ = 1 + i_92_ & 0xfff;
				anIntArrayArray3096[i_88_ - 1][i_89_ - 1] = 3;
				anIntArrayArray3102[i_88_ - 1][i_89_ - 1] = i_96_;
			}
			if (i_88_ < 126 && i_89_ > 0 && 0 == anIntArrayArray3096[i_88_ + 1][i_89_ - 1] && 0 == (is[1 + i_94_][i_95_ - 1] & 0x63e40000) && (is[2 + i_94_][i_95_ - 1] & 0x60e40000) == 0 && 0 == (is[2 + i_94_][i_95_] & 0x78e40000)) {
				anIntArray3101[i_92_] = 1 + i_86_;
				anIntArray3099[i_92_] = i_87_ - 1;
				i_92_ = i_92_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_88_][i_89_ - 1] = 9;
				anIntArrayArray3102[1 + i_88_][i_89_ - 1] = i_96_;
			}
			if (i_88_ > 0 && i_89_ < 126 && anIntArrayArray3096[i_88_ - 1][1 + i_89_] == 0 && 0 == (is[i_94_ - 1][i_95_ + 1] & 0x4fa40000) && 0 == (is[i_94_ - 1][i_95_ + 2] & 0x4e240000) && (is[i_94_][i_95_ + 2] & 0x7e240000) == 0) {
				anIntArray3101[i_92_] = i_86_ - 1;
				anIntArray3099[i_92_] = 1 + i_87_;
				i_92_ = 1 + i_92_ & 0xfff;
				anIntArrayArray3096[i_88_ - 1][1 + i_89_] = 6;
				anIntArrayArray3102[i_88_ - 1][i_89_ + 1] = i_96_;
			}
			if (i_88_ < 126 && i_89_ < 126 && anIntArrayArray3096[i_88_ + 1][1 + i_89_] == 0 && 0 == (is[i_94_ + 1][2 + i_95_] & 0x7e240000) && 0 == (is[i_94_ + 2][2 + i_95_] & 0x78240000) && (is[2 + i_94_][i_95_ + 1] & 0x78e40000) == 0) {
				anIntArray3101[i_92_] = i_86_ + 1;
				anIntArray3099[i_92_] = i_87_ + 1;
				i_92_ = i_92_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_88_][1 + i_89_] = 12;
				anIntArrayArray3102[1 + i_88_][1 + i_89_] = i_96_;
			}
		}
		anInt3098 = -1071145131 * i_86_;
		anInt3095 = i_87_ * -1330567915;
		return false;
	}

	static final boolean method4306(int i, int i_97_, Class225 class225, Class336 class336) {
		int i_98_ = i;
		int i_99_ = i_97_;
		int i_100_ = 64;
		int i_101_ = 64;
		int i_102_ = i - i_100_;
		int i_103_ = i_97_ - i_101_;
		anIntArrayArray3096[i_100_][i_101_] = 99;
		anIntArrayArray3102[i_100_][i_101_] = 0;
		int i_104_ = 0;
		int i_105_ = 0;
		anIntArray3101[i_104_] = i_98_;
		anIntArray3099[i_104_++] = i_99_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_105_ != i_104_) {
			i_98_ = anIntArray3101[i_105_];
			i_99_ = anIntArray3099[i_105_];
			i_105_ = 1 + i_105_ & 0xfff;
			i_100_ = i_98_ - i_102_;
			i_101_ = i_99_ - i_103_;
			int i_106_ = i_98_ - -1969357273 * class336.anInt3931;
			int i_107_ = i_99_ - 1503444365 * class336.anInt3964;
			if (class225.method3787(1, i_98_, i_99_, class336, (byte) -40)) {
				anInt3098 = i_98_ * -1071145131;
				anInt3095 = -1330567915 * i_99_;
				return true;
			}
			int i_108_ = anIntArrayArray3102[i_100_][i_101_] + 1;
			if (i_100_ > 0 && anIntArrayArray3096[i_100_ - 1][i_101_] == 0 && (is[i_106_ - 1][i_107_] & 0x42240000) == 0) {
				anIntArray3101[i_104_] = i_98_ - 1;
				anIntArray3099[i_104_] = i_99_;
				i_104_ = i_104_ + 1 & 0xfff;
				anIntArrayArray3096[i_100_ - 1][i_101_] = 2;
				anIntArrayArray3102[i_100_ - 1][i_101_] = i_108_;
			}
			if (i_100_ < 127 && anIntArrayArray3096[i_100_ + 1][i_101_] == 0 && 0 == (is[1 + i_106_][i_107_] & 0x60240000)) {
				anIntArray3101[i_104_] = 1 + i_98_;
				anIntArray3099[i_104_] = i_99_;
				i_104_ = 1 + i_104_ & 0xfff;
				anIntArrayArray3096[1 + i_100_][i_101_] = 8;
				anIntArrayArray3102[i_100_ + 1][i_101_] = i_108_;
			}
			if (i_101_ > 0 && 0 == anIntArrayArray3096[i_100_][i_101_ - 1] && 0 == (is[i_106_][i_107_ - 1] & 0x40a40000)) {
				anIntArray3101[i_104_] = i_98_;
				anIntArray3099[i_104_] = i_99_ - 1;
				i_104_ = i_104_ + 1 & 0xfff;
				anIntArrayArray3096[i_100_][i_101_ - 1] = 1;
				anIntArrayArray3102[i_100_][i_101_ - 1] = i_108_;
			}
			if (i_101_ < 127 && 0 == anIntArrayArray3096[i_100_][i_101_ + 1] && (is[i_106_][i_107_ + 1] & 0x48240000) == 0) {
				anIntArray3101[i_104_] = i_98_;
				anIntArray3099[i_104_] = i_99_ + 1;
				i_104_ = i_104_ + 1 & 0xfff;
				anIntArrayArray3096[i_100_][1 + i_101_] = 4;
				anIntArrayArray3102[i_100_][1 + i_101_] = i_108_;
			}
			if (i_100_ > 0 && i_101_ > 0 && anIntArrayArray3096[i_100_ - 1][i_101_ - 1] == 0 && 0 == (is[i_106_ - 1][i_107_ - 1] & 0x43a40000) && (is[i_106_ - 1][i_107_] & 0x42240000) == 0 && 0 == (is[i_106_][i_107_ - 1] & 0x40a40000)) {
				anIntArray3101[i_104_] = i_98_ - 1;
				anIntArray3099[i_104_] = i_99_ - 1;
				i_104_ = 1 + i_104_ & 0xfff;
				anIntArrayArray3096[i_100_ - 1][i_101_ - 1] = 3;
				anIntArrayArray3102[i_100_ - 1][i_101_ - 1] = i_108_;
			}
			if (i_100_ < 127 && i_101_ > 0 && 0 == anIntArrayArray3096[i_100_ + 1][i_101_ - 1] && (is[1 + i_106_][i_107_ - 1] & 0x60e40000) == 0 && 0 == (is[1 + i_106_][i_107_] & 0x60240000) && (is[i_106_][i_107_ - 1] & 0x40a40000) == 0) {
				anIntArray3101[i_104_] = i_98_ + 1;
				anIntArray3099[i_104_] = i_99_ - 1;
				i_104_ = i_104_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_100_][i_101_ - 1] = 9;
				anIntArrayArray3102[1 + i_100_][i_101_ - 1] = i_108_;
			}
			if (i_100_ > 0 && i_101_ < 127 && anIntArrayArray3096[i_100_ - 1][1 + i_101_] == 0 && 0 == (is[i_106_ - 1][1 + i_107_] & 0x4e240000) && (is[i_106_ - 1][i_107_] & 0x42240000) == 0 && 0 == (is[i_106_][1 + i_107_] & 0x48240000)) {
				anIntArray3101[i_104_] = i_98_ - 1;
				anIntArray3099[i_104_] = i_99_ + 1;
				i_104_ = i_104_ + 1 & 0xfff;
				anIntArrayArray3096[i_100_ - 1][i_101_ + 1] = 6;
				anIntArrayArray3102[i_100_ - 1][1 + i_101_] = i_108_;
			}
			if (i_100_ < 127 && i_101_ < 127 && 0 == anIntArrayArray3096[1 + i_100_][1 + i_101_] && (is[i_106_ + 1][1 + i_107_] & 0x78240000) == 0 && (is[1 + i_106_][i_107_] & 0x60240000) == 0 && (is[i_106_][1 + i_107_] & 0x48240000) == 0) {
				anIntArray3101[i_104_] = 1 + i_98_;
				anIntArray3099[i_104_] = 1 + i_99_;
				i_104_ = i_104_ + 1 & 0xfff;
				anIntArrayArray3096[1 + i_100_][1 + i_101_] = 12;
				anIntArrayArray3102[i_100_ + 1][1 + i_101_] = i_108_;
			}
		}
		anInt3098 = i_98_ * -1071145131;
		anInt3095 = i_99_ * -1330567915;
		return false;
	}

	static final boolean method4307(int i, int i_109_, int i_110_, Class225 class225, Class336 class336) {
		int i_111_ = i;
		int i_112_ = i_109_;
		int i_113_ = 64;
		int i_114_ = 64;
		int i_115_ = i - i_113_;
		int i_116_ = i_109_ - i_114_;
		anIntArrayArray3096[i_113_][i_114_] = 99;
		anIntArrayArray3102[i_113_][i_114_] = 0;
		int i_117_ = 0;
		int i_118_ = 0;
		anIntArray3101[i_117_] = i_111_;
		anIntArray3099[i_117_++] = i_112_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_117_ != i_118_) {
			i_111_ = anIntArray3101[i_118_];
			i_112_ = anIntArray3099[i_118_];
			i_118_ = 1 + i_118_ & 0xfff;
			i_113_ = i_111_ - i_115_;
			i_114_ = i_112_ - i_116_;
			int i_119_ = i_111_ - -1969357273 * class336.anInt3931;
			int i_120_ = i_112_ - class336.anInt3964 * 1503444365;
			if (class225.method3787(i_110_, i_111_, i_112_, class336, (byte) -117)) {
				anInt3098 = -1071145131 * i_111_;
				anInt3095 = -1330567915 * i_112_;
				return true;
			}
			int i_121_ = 1 + anIntArrayArray3102[i_113_][i_114_];
			while_93_: do {
				if (i_113_ > 0 && anIntArrayArray3096[i_113_ - 1][i_114_] == 0 && (is[i_119_ - 1][i_120_] & 0x43a40000) == 0 && 0 == (is[i_119_ - 1][i_110_ + i_120_ - 1] & 0x4e240000)) {
					for (int i_122_ = 1; i_122_ < i_110_ - 1; i_122_++) {
						if ((is[i_119_ - 1][i_122_ + i_120_] & 0x4fa40000) != 0)
							break while_93_;
					}
					anIntArray3101[i_117_] = i_111_ - 1;
					anIntArray3099[i_117_] = i_112_;
					i_117_ = i_117_ + 1 & 0xfff;
					anIntArrayArray3096[i_113_ - 1][i_114_] = 2;
					anIntArrayArray3102[i_113_ - 1][i_114_] = i_121_;
				}
			} while (false);
			while_94_: do {
				if (i_113_ < 128 - i_110_ && anIntArrayArray3096[1 + i_113_][i_114_] == 0 && (is[i_110_ + i_119_][i_120_] & 0x60e40000) == 0 && 0 == (is[i_110_ + i_119_][i_120_ + i_110_ - 1] & 0x78240000)) {
					for (int i_123_ = 1; i_123_ < i_110_ - 1; i_123_++) {
						if ((is[i_119_ + i_110_][i_123_ + i_120_] & 0x78e40000) != 0)
							break while_94_;
					}
					anIntArray3101[i_117_] = i_111_ + 1;
					anIntArray3099[i_117_] = i_112_;
					i_117_ = i_117_ + 1 & 0xfff;
					anIntArrayArray3096[i_113_ + 1][i_114_] = 8;
					anIntArrayArray3102[i_113_ + 1][i_114_] = i_121_;
				}
			} while (false);
			while_95_: do {
				if (i_114_ > 0 && 0 == anIntArrayArray3096[i_113_][i_114_ - 1] && (is[i_119_][i_120_ - 1] & 0x43a40000) == 0 && ((is[i_110_ + i_119_ - 1][i_120_ - 1] & 0x60e40000) == 0)) {
					for (int i_124_ = 1; i_124_ < i_110_ - 1; i_124_++) {
						if (0 != (is[i_124_ + i_119_][i_120_ - 1] & 0x63e40000))
							break while_95_;
					}
					anIntArray3101[i_117_] = i_111_;
					anIntArray3099[i_117_] = i_112_ - 1;
					i_117_ = 1 + i_117_ & 0xfff;
					anIntArrayArray3096[i_113_][i_114_ - 1] = 1;
					anIntArrayArray3102[i_113_][i_114_ - 1] = i_121_;
				}
			} while (false);
			while_96_: do {
				if (i_114_ < 128 - i_110_ && 0 == anIntArrayArray3096[i_113_][1 + i_114_] && (is[i_119_][i_110_ + i_120_] & 0x4e240000) == 0 && 0 == (is[i_119_ + i_110_ - 1][i_120_ + i_110_] & 0x78240000)) {
					for (int i_125_ = 1; i_125_ < i_110_ - 1; i_125_++) {
						if (0 != (is[i_119_ + i_125_][i_120_ + i_110_] & 0x7e240000))
							break while_96_;
					}
					anIntArray3101[i_117_] = i_111_;
					anIntArray3099[i_117_] = i_112_ + 1;
					i_117_ = i_117_ + 1 & 0xfff;
					anIntArrayArray3096[i_113_][i_114_ + 1] = 4;
					anIntArrayArray3102[i_113_][i_114_ + 1] = i_121_;
				}
			} while (false);
			while_97_: do {
				if (i_113_ > 0 && i_114_ > 0 && 0 == anIntArrayArray3096[i_113_ - 1][i_114_ - 1] && 0 == (is[i_119_ - 1][i_120_ - 1] & 0x43a40000)) {
					for (int i_126_ = 1; i_126_ < i_110_; i_126_++) {
						if (0 != (is[i_119_ - 1][i_120_ - 1 + i_126_] & 0x4fa40000) || (is[i_126_ + (i_119_ - 1)][i_120_ - 1] & 0x63e40000) != 0)
							break while_97_;
					}
					anIntArray3101[i_117_] = i_111_ - 1;
					anIntArray3099[i_117_] = i_112_ - 1;
					i_117_ = 1 + i_117_ & 0xfff;
					anIntArrayArray3096[i_113_ - 1][i_114_ - 1] = 3;
					anIntArrayArray3102[i_113_ - 1][i_114_ - 1] = i_121_;
				}
			} while (false);
			while_98_: do {
				if (i_113_ < 128 - i_110_ && i_114_ > 0 && anIntArrayArray3096[1 + i_113_][i_114_ - 1] == 0 && 0 == (is[i_110_ + i_119_][i_120_ - 1] & 0x60e40000)) {
					for (int i_127_ = 1; i_127_ < i_110_; i_127_++) {
						if ((is[i_119_ + i_110_][i_120_ - 1 + i_127_] & 0x78e40000) != 0 || 0 != (is[i_127_ + i_119_][i_120_ - 1] & 0x63e40000))
							break while_98_;
					}
					anIntArray3101[i_117_] = 1 + i_111_;
					anIntArray3099[i_117_] = i_112_ - 1;
					i_117_ = 1 + i_117_ & 0xfff;
					anIntArrayArray3096[1 + i_113_][i_114_ - 1] = 9;
					anIntArrayArray3102[1 + i_113_][i_114_ - 1] = i_121_;
				}
			} while (false);
			while_99_: do {
				if (i_113_ > 0 && i_114_ < 128 - i_110_ && anIntArrayArray3096[i_113_ - 1][1 + i_114_] == 0 && (is[i_119_ - 1][i_110_ + i_120_] & 0x4e240000) == 0) {
					for (int i_128_ = 1; i_128_ < i_110_; i_128_++) {
						if (0 != (is[i_119_ - 1][i_128_ + i_120_] & 0x4fa40000) || 0 != (is[i_128_ + (i_119_ - 1)][i_110_ + i_120_] & 0x7e240000))
							break while_99_;
					}
					anIntArray3101[i_117_] = i_111_ - 1;
					anIntArray3099[i_117_] = 1 + i_112_;
					i_117_ = i_117_ + 1 & 0xfff;
					anIntArrayArray3096[i_113_ - 1][1 + i_114_] = 6;
					anIntArrayArray3102[i_113_ - 1][1 + i_114_] = i_121_;
				}
			} while (false);
			while_100_: do {
				if (i_113_ < 128 - i_110_ && i_114_ < 128 - i_110_ && anIntArrayArray3096[i_113_ + 1][1 + i_114_] == 0 && ((is[i_119_ + i_110_][i_110_ + i_120_] & 0x78240000) == 0)) {
					for (int i_129_ = 1; i_129_ < i_110_; i_129_++) {
						if ((is[i_119_ + i_129_][i_120_ + i_110_] & 0x7e240000) != 0 || 0 != (is[i_110_ + i_119_][i_129_ + i_120_] & 0x78e40000))
							break while_100_;
					}
					anIntArray3101[i_117_] = i_111_ + 1;
					anIntArray3099[i_117_] = i_112_ + 1;
					i_117_ = i_117_ + 1 & 0xfff;
					anIntArrayArray3096[1 + i_113_][i_114_ + 1] = 12;
					anIntArrayArray3102[1 + i_113_][1 + i_114_] = i_121_;
				}
			} while (false);
		}
		anInt3098 = -1071145131 * i_111_;
		anInt3095 = -1330567915 * i_112_;
		return false;
	}

	static final boolean method4308(int i, int i_130_, int i_131_, Class225 class225, Class336 class336) {
		int i_132_ = i;
		int i_133_ = i_130_;
		int i_134_ = 64;
		int i_135_ = 64;
		int i_136_ = i - i_134_;
		int i_137_ = i_130_ - i_135_;
		anIntArrayArray3096[i_134_][i_135_] = 99;
		anIntArrayArray3102[i_134_][i_135_] = 0;
		int i_138_ = 0;
		int i_139_ = 0;
		anIntArray3101[i_138_] = i_132_;
		anIntArray3099[i_138_++] = i_133_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_138_ != i_139_) {
			i_132_ = anIntArray3101[i_139_];
			i_133_ = anIntArray3099[i_139_];
			i_139_ = 1 + i_139_ & 0xfff;
			i_134_ = i_132_ - i_136_;
			i_135_ = i_133_ - i_137_;
			int i_140_ = i_132_ - -1969357273 * class336.anInt3931;
			int i_141_ = i_133_ - class336.anInt3964 * 1503444365;
			if (class225.method3787(i_131_, i_132_, i_133_, class336, (byte) -65)) {
				anInt3098 = -1071145131 * i_132_;
				anInt3095 = -1330567915 * i_133_;
				return true;
			}
			int i_142_ = 1 + anIntArrayArray3102[i_134_][i_135_];
			while_101_: do {
				if (i_134_ > 0 && anIntArrayArray3096[i_134_ - 1][i_135_] == 0 && (is[i_140_ - 1][i_141_] & 0x43a40000) == 0 && 0 == (is[i_140_ - 1][i_131_ + i_141_ - 1] & 0x4e240000)) {
					for (int i_143_ = 1; i_143_ < i_131_ - 1; i_143_++) {
						if ((is[i_140_ - 1][i_143_ + i_141_] & 0x4fa40000) != 0)
							break while_101_;
					}
					anIntArray3101[i_138_] = i_132_ - 1;
					anIntArray3099[i_138_] = i_133_;
					i_138_ = i_138_ + 1 & 0xfff;
					anIntArrayArray3096[i_134_ - 1][i_135_] = 2;
					anIntArrayArray3102[i_134_ - 1][i_135_] = i_142_;
				}
			} while (false);
			while_102_: do {
				if (i_134_ < 128 - i_131_ && anIntArrayArray3096[1 + i_134_][i_135_] == 0 && (is[i_131_ + i_140_][i_141_] & 0x60e40000) == 0 && 0 == (is[i_131_ + i_140_][i_141_ + i_131_ - 1] & 0x78240000)) {
					for (int i_144_ = 1; i_144_ < i_131_ - 1; i_144_++) {
						if ((is[i_140_ + i_131_][i_144_ + i_141_] & 0x78e40000) != 0)
							break while_102_;
					}
					anIntArray3101[i_138_] = i_132_ + 1;
					anIntArray3099[i_138_] = i_133_;
					i_138_ = i_138_ + 1 & 0xfff;
					anIntArrayArray3096[i_134_ + 1][i_135_] = 8;
					anIntArrayArray3102[i_134_ + 1][i_135_] = i_142_;
				}
			} while (false);
			while_103_: do {
				if (i_135_ > 0 && 0 == anIntArrayArray3096[i_134_][i_135_ - 1] && (is[i_140_][i_141_ - 1] & 0x43a40000) == 0 && ((is[i_131_ + i_140_ - 1][i_141_ - 1] & 0x60e40000) == 0)) {
					for (int i_145_ = 1; i_145_ < i_131_ - 1; i_145_++) {
						if (0 != (is[i_145_ + i_140_][i_141_ - 1] & 0x63e40000))
							break while_103_;
					}
					anIntArray3101[i_138_] = i_132_;
					anIntArray3099[i_138_] = i_133_ - 1;
					i_138_ = 1 + i_138_ & 0xfff;
					anIntArrayArray3096[i_134_][i_135_ - 1] = 1;
					anIntArrayArray3102[i_134_][i_135_ - 1] = i_142_;
				}
			} while (false);
			while_104_: do {
				if (i_135_ < 128 - i_131_ && 0 == anIntArrayArray3096[i_134_][1 + i_135_] && (is[i_140_][i_131_ + i_141_] & 0x4e240000) == 0 && 0 == (is[i_140_ + i_131_ - 1][i_141_ + i_131_] & 0x78240000)) {
					for (int i_146_ = 1; i_146_ < i_131_ - 1; i_146_++) {
						if (0 != (is[i_140_ + i_146_][i_141_ + i_131_] & 0x7e240000))
							break while_104_;
					}
					anIntArray3101[i_138_] = i_132_;
					anIntArray3099[i_138_] = i_133_ + 1;
					i_138_ = i_138_ + 1 & 0xfff;
					anIntArrayArray3096[i_134_][i_135_ + 1] = 4;
					anIntArrayArray3102[i_134_][i_135_ + 1] = i_142_;
				}
			} while (false);
			while_105_: do {
				if (i_134_ > 0 && i_135_ > 0 && 0 == anIntArrayArray3096[i_134_ - 1][i_135_ - 1] && 0 == (is[i_140_ - 1][i_141_ - 1] & 0x43a40000)) {
					for (int i_147_ = 1; i_147_ < i_131_; i_147_++) {
						if (0 != (is[i_140_ - 1][i_141_ - 1 + i_147_] & 0x4fa40000) || (is[i_147_ + (i_140_ - 1)][i_141_ - 1] & 0x63e40000) != 0)
							break while_105_;
					}
					anIntArray3101[i_138_] = i_132_ - 1;
					anIntArray3099[i_138_] = i_133_ - 1;
					i_138_ = 1 + i_138_ & 0xfff;
					anIntArrayArray3096[i_134_ - 1][i_135_ - 1] = 3;
					anIntArrayArray3102[i_134_ - 1][i_135_ - 1] = i_142_;
				}
			} while (false);
			while_106_: do {
				if (i_134_ < 128 - i_131_ && i_135_ > 0 && anIntArrayArray3096[1 + i_134_][i_135_ - 1] == 0 && 0 == (is[i_131_ + i_140_][i_141_ - 1] & 0x60e40000)) {
					for (int i_148_ = 1; i_148_ < i_131_; i_148_++) {
						if ((is[i_140_ + i_131_][i_141_ - 1 + i_148_] & 0x78e40000) != 0 || 0 != (is[i_148_ + i_140_][i_141_ - 1] & 0x63e40000))
							break while_106_;
					}
					anIntArray3101[i_138_] = 1 + i_132_;
					anIntArray3099[i_138_] = i_133_ - 1;
					i_138_ = 1 + i_138_ & 0xfff;
					anIntArrayArray3096[1 + i_134_][i_135_ - 1] = 9;
					anIntArrayArray3102[1 + i_134_][i_135_ - 1] = i_142_;
				}
			} while (false);
			while_107_: do {
				if (i_134_ > 0 && i_135_ < 128 - i_131_ && anIntArrayArray3096[i_134_ - 1][1 + i_135_] == 0 && (is[i_140_ - 1][i_131_ + i_141_] & 0x4e240000) == 0) {
					for (int i_149_ = 1; i_149_ < i_131_; i_149_++) {
						if (0 != (is[i_140_ - 1][i_149_ + i_141_] & 0x4fa40000) || 0 != (is[i_149_ + (i_140_ - 1)][i_131_ + i_141_] & 0x7e240000))
							break while_107_;
					}
					anIntArray3101[i_138_] = i_132_ - 1;
					anIntArray3099[i_138_] = 1 + i_133_;
					i_138_ = i_138_ + 1 & 0xfff;
					anIntArrayArray3096[i_134_ - 1][1 + i_135_] = 6;
					anIntArrayArray3102[i_134_ - 1][1 + i_135_] = i_142_;
				}
			} while (false);
			while_108_: do {
				if (i_134_ < 128 - i_131_ && i_135_ < 128 - i_131_ && anIntArrayArray3096[i_134_ + 1][1 + i_135_] == 0 && ((is[i_140_ + i_131_][i_131_ + i_141_] & 0x78240000) == 0)) {
					for (int i_150_ = 1; i_150_ < i_131_; i_150_++) {
						if ((is[i_140_ + i_150_][i_141_ + i_131_] & 0x7e240000) != 0 || 0 != (is[i_131_ + i_140_][i_150_ + i_141_] & 0x78e40000))
							break while_108_;
					}
					anIntArray3101[i_138_] = i_132_ + 1;
					anIntArray3099[i_138_] = i_133_ + 1;
					i_138_ = i_138_ + 1 & 0xfff;
					anIntArrayArray3096[1 + i_134_][i_135_ + 1] = 12;
					anIntArrayArray3102[1 + i_134_][1 + i_135_] = i_142_;
				}
			} while (false);
		}
		anInt3098 = -1071145131 * i_132_;
		anInt3095 = -1330567915 * i_133_;
		return false;
	}

	static final boolean method4309(int i, int i_151_, int i_152_, Class225 class225, Class336 class336) {
		int i_153_ = i;
		int i_154_ = i_151_;
		int i_155_ = 64;
		int i_156_ = 64;
		int i_157_ = i - i_155_;
		int i_158_ = i_151_ - i_156_;
		anIntArrayArray3096[i_155_][i_156_] = 99;
		anIntArrayArray3102[i_155_][i_156_] = 0;
		int i_159_ = 0;
		int i_160_ = 0;
		anIntArray3101[i_159_] = i_153_;
		anIntArray3099[i_159_++] = i_154_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_159_ != i_160_) {
			i_153_ = anIntArray3101[i_160_];
			i_154_ = anIntArray3099[i_160_];
			i_160_ = 1 + i_160_ & 0xfff;
			i_155_ = i_153_ - i_157_;
			i_156_ = i_154_ - i_158_;
			int i_161_ = i_153_ - -1969357273 * class336.anInt3931;
			int i_162_ = i_154_ - class336.anInt3964 * 1503444365;
			if (class225.method3787(i_152_, i_153_, i_154_, class336, (byte) -125)) {
				anInt3098 = -1071145131 * i_153_;
				anInt3095 = -1330567915 * i_154_;
				return true;
			}
			int i_163_ = 1 + anIntArrayArray3102[i_155_][i_156_];
			while_109_: do {
				if (i_155_ > 0 && anIntArrayArray3096[i_155_ - 1][i_156_] == 0 && (is[i_161_ - 1][i_162_] & 0x43a40000) == 0 && 0 == (is[i_161_ - 1][i_152_ + i_162_ - 1] & 0x4e240000)) {
					for (int i_164_ = 1; i_164_ < i_152_ - 1; i_164_++) {
						if ((is[i_161_ - 1][i_164_ + i_162_] & 0x4fa40000) != 0)
							break while_109_;
					}
					anIntArray3101[i_159_] = i_153_ - 1;
					anIntArray3099[i_159_] = i_154_;
					i_159_ = i_159_ + 1 & 0xfff;
					anIntArrayArray3096[i_155_ - 1][i_156_] = 2;
					anIntArrayArray3102[i_155_ - 1][i_156_] = i_163_;
				}
			} while (false);
			while_110_: do {
				if (i_155_ < 128 - i_152_ && anIntArrayArray3096[1 + i_155_][i_156_] == 0 && (is[i_152_ + i_161_][i_162_] & 0x60e40000) == 0 && 0 == (is[i_152_ + i_161_][i_162_ + i_152_ - 1] & 0x78240000)) {
					for (int i_165_ = 1; i_165_ < i_152_ - 1; i_165_++) {
						if ((is[i_161_ + i_152_][i_165_ + i_162_] & 0x78e40000) != 0)
							break while_110_;
					}
					anIntArray3101[i_159_] = i_153_ + 1;
					anIntArray3099[i_159_] = i_154_;
					i_159_ = i_159_ + 1 & 0xfff;
					anIntArrayArray3096[i_155_ + 1][i_156_] = 8;
					anIntArrayArray3102[i_155_ + 1][i_156_] = i_163_;
				}
			} while (false);
			while_111_: do {
				if (i_156_ > 0 && 0 == anIntArrayArray3096[i_155_][i_156_ - 1] && (is[i_161_][i_162_ - 1] & 0x43a40000) == 0 && ((is[i_152_ + i_161_ - 1][i_162_ - 1] & 0x60e40000) == 0)) {
					for (int i_166_ = 1; i_166_ < i_152_ - 1; i_166_++) {
						if (0 != (is[i_166_ + i_161_][i_162_ - 1] & 0x63e40000))
							break while_111_;
					}
					anIntArray3101[i_159_] = i_153_;
					anIntArray3099[i_159_] = i_154_ - 1;
					i_159_ = 1 + i_159_ & 0xfff;
					anIntArrayArray3096[i_155_][i_156_ - 1] = 1;
					anIntArrayArray3102[i_155_][i_156_ - 1] = i_163_;
				}
			} while (false);
			while_112_: do {
				if (i_156_ < 128 - i_152_ && 0 == anIntArrayArray3096[i_155_][1 + i_156_] && (is[i_161_][i_152_ + i_162_] & 0x4e240000) == 0 && 0 == (is[i_161_ + i_152_ - 1][i_162_ + i_152_] & 0x78240000)) {
					for (int i_167_ = 1; i_167_ < i_152_ - 1; i_167_++) {
						if (0 != (is[i_161_ + i_167_][i_162_ + i_152_] & 0x7e240000))
							break while_112_;
					}
					anIntArray3101[i_159_] = i_153_;
					anIntArray3099[i_159_] = i_154_ + 1;
					i_159_ = i_159_ + 1 & 0xfff;
					anIntArrayArray3096[i_155_][i_156_ + 1] = 4;
					anIntArrayArray3102[i_155_][i_156_ + 1] = i_163_;
				}
			} while (false);
			while_113_: do {
				if (i_155_ > 0 && i_156_ > 0 && 0 == anIntArrayArray3096[i_155_ - 1][i_156_ - 1] && 0 == (is[i_161_ - 1][i_162_ - 1] & 0x43a40000)) {
					for (int i_168_ = 1; i_168_ < i_152_; i_168_++) {
						if (0 != (is[i_161_ - 1][i_162_ - 1 + i_168_] & 0x4fa40000) || (is[i_168_ + (i_161_ - 1)][i_162_ - 1] & 0x63e40000) != 0)
							break while_113_;
					}
					anIntArray3101[i_159_] = i_153_ - 1;
					anIntArray3099[i_159_] = i_154_ - 1;
					i_159_ = 1 + i_159_ & 0xfff;
					anIntArrayArray3096[i_155_ - 1][i_156_ - 1] = 3;
					anIntArrayArray3102[i_155_ - 1][i_156_ - 1] = i_163_;
				}
			} while (false);
			while_114_: do {
				if (i_155_ < 128 - i_152_ && i_156_ > 0 && anIntArrayArray3096[1 + i_155_][i_156_ - 1] == 0 && 0 == (is[i_152_ + i_161_][i_162_ - 1] & 0x60e40000)) {
					for (int i_169_ = 1; i_169_ < i_152_; i_169_++) {
						if ((is[i_161_ + i_152_][i_162_ - 1 + i_169_] & 0x78e40000) != 0 || 0 != (is[i_169_ + i_161_][i_162_ - 1] & 0x63e40000))
							break while_114_;
					}
					anIntArray3101[i_159_] = 1 + i_153_;
					anIntArray3099[i_159_] = i_154_ - 1;
					i_159_ = 1 + i_159_ & 0xfff;
					anIntArrayArray3096[1 + i_155_][i_156_ - 1] = 9;
					anIntArrayArray3102[1 + i_155_][i_156_ - 1] = i_163_;
				}
			} while (false);
			while_115_: do {
				if (i_155_ > 0 && i_156_ < 128 - i_152_ && anIntArrayArray3096[i_155_ - 1][1 + i_156_] == 0 && (is[i_161_ - 1][i_152_ + i_162_] & 0x4e240000) == 0) {
					for (int i_170_ = 1; i_170_ < i_152_; i_170_++) {
						if (0 != (is[i_161_ - 1][i_170_ + i_162_] & 0x4fa40000) || 0 != (is[i_170_ + (i_161_ - 1)][i_152_ + i_162_] & 0x7e240000))
							break while_115_;
					}
					anIntArray3101[i_159_] = i_153_ - 1;
					anIntArray3099[i_159_] = 1 + i_154_;
					i_159_ = i_159_ + 1 & 0xfff;
					anIntArrayArray3096[i_155_ - 1][1 + i_156_] = 6;
					anIntArrayArray3102[i_155_ - 1][1 + i_156_] = i_163_;
				}
			} while (false);
			while_116_: do {
				if (i_155_ < 128 - i_152_ && i_156_ < 128 - i_152_ && anIntArrayArray3096[i_155_ + 1][1 + i_156_] == 0 && ((is[i_161_ + i_152_][i_152_ + i_162_] & 0x78240000) == 0)) {
					for (int i_171_ = 1; i_171_ < i_152_; i_171_++) {
						if ((is[i_161_ + i_171_][i_162_ + i_152_] & 0x7e240000) != 0 || 0 != (is[i_152_ + i_161_][i_171_ + i_162_] & 0x78e40000))
							break while_116_;
					}
					anIntArray3101[i_159_] = i_153_ + 1;
					anIntArray3099[i_159_] = i_154_ + 1;
					i_159_ = i_159_ + 1 & 0xfff;
					anIntArrayArray3096[1 + i_155_][i_156_ + 1] = 12;
					anIntArrayArray3102[1 + i_155_][1 + i_156_] = i_163_;
				}
			} while (false);
		}
		anInt3098 = -1071145131 * i_153_;
		anInt3095 = -1330567915 * i_154_;
		return false;
	}

	static final void method4310(CS2Executor class527, int i) {
		boolean bool = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) != 0);
		if (Class84.myPlayer.playerAppearance != null)
			Class84.myPlayer.playerAppearance.method4003(bool, -794449734);
	}

	static final void method4311(CS2Executor class527, int i) {
		int i_172_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_172_, (byte) 118);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_172_ >> 16];
		Class455.method7555(class118, class98, class527, (byte) -54);
	}

	static final void method4312(CS2Executor class527, byte i) {
		if (client.rights * -644057819 >= 2)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -644057819 * client.rights;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	public static void handleCommand(String string, boolean bool, boolean bool_173_, int i) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class209.method3598("commands - This command", -1128292172);
					Class209.method3598("cls - Clear console", -1305824571);
					Class209.method3598("displayfps - Toggle FPS and other information", -1028056987);
					Class209.method3598("renderer - Print graphics renderer information", -895621363);
					Class209.method3598("heap - Print java memory information", -770815394);
					Class209.method3598("getcamerapos - Print location and direction of camera for use in bug reports", -2142075960);
				} else if (string.equalsIgnoreCase("cls")) {
					Class179.anInt2227 = 0;
					Class179.anInt2223 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool7176 = !client.aBool7176;
					if (client.aBool7176)
						Class209.method3598("FPS on", -1478532172);
					else
						Class209.method3598("FPS off", -318501716);
				} else if (string.equals("renderer")) {
					Class168 class168 = Renderers.SOFTWARE_RENDERER.method8392();
					Class209.method3598(new StringBuilder().append("Toolkit ID: ").append(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(174476725)).toString(), -199774023);
					Class209.method3598(new StringBuilder().append("Vendor: ").append(class168.anInt2052 * 1681700525).toString(), -1266717403);
					Class209.method3598(new StringBuilder().append("Name: ").append(class168.aString2051).toString(), -2120239732);
					Class209.method3598(new StringBuilder().append("Version: ").append(292421485 * class168.anInt2045).toString(), -1689852117);
					Class209.method3598(new StringBuilder().append("Device: ").append(class168.aString2053).toString(), -1211113537);
					Class209.method3598(new StringBuilder().append("Driver Version: ").append(-3062896818026551219L * class168.aLong2049).toString(), -598072423);
				} else if (string.equals("heap"))
					Class209.method3598(new StringBuilder().append("Heap: ").append(-1346844585 * Engine.MAX_MEMORY).append("MB").toString(), -845757732);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1275338740);
					Class209.method3598(new StringBuilder().append("Pos: ").append(Class84.myPlayer.aByte7967).append(",").append(((Class31.anInt361 * -360258135 >> 9) + 1948093437 * class219.anInt2711) >> 6).append(",").append((-1002240017 * class219.anInt2712 + (413271601 * Class246.anInt3029 >> 9)) >> 6).append(",").append(((Class31.anInt361 * -360258135 >> 9) + class219.anInt2711 * 1948093437) & 0x3f).append(",")
							.append((class219.anInt2712 * -1002240017 + (Class246.anInt3029 * 413271601 >> 9)) & 0x3f).append(" Height: ").append((Class504.method8389(Class31.anInt361 * -360258135, 413271601 * Class246.anInt3029, (Class84.myPlayer.aByte7967), (byte) 22)) - Class109_Sub1.anInt9384 * 1929945579).toString(), -2096324041);
					Class209.method3598(new StringBuilder().append("Look: ").append(Class84.myPlayer.aByte7967).append(",").append((721567303 * Class96_Sub13.anInt9368 + class219.anInt2711 * 1948093437) >> 6).append(",").append((Class369.anInt4280 * 469662201 + class219.anInt2712 * -1002240017) >> 6).append(",").append((class219.anInt2711 * 1948093437 + Class96_Sub13.anInt9368 * 721567303) & 0x3f).append(",")
							.append((class219.anInt2712 * -1002240017 + 469662201 * Class369.anInt4280) & 0x3f).append(" Height: ").append((Class504.method8389(Class96_Sub13.anInt9368 * 721567303, 469662201 * Class369.anInt4280, (Class84.myPlayer.aByte7967), (byte) 2)) - 654473753 * Class121.anInt1527).toString(), -2049086171);
				}
			} catch (Exception exception) {
				Class209.method3598((Message.ERROR_EXECUTING_COMMAND.translate(Class223.CURRENT_LANGUAGE, -927245115)), -314816204);
			}
			return;
		} while (false);
		if (Class496.aClass496_5813 != Class90.aClass496_952 || -644057819 * client.rights >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class440.method7373(1, -1, -1, false, (byte) 111);
					if (Class158.method2730((short) -2613) == 1)
						Class209.method3598("Success", -1081042103);
					else
						Class209.method3598("Failure", -1679059179);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class440.method7373(2, -1, -1, false, (byte) 71);
					if (Class158.method2730((short) -27549) == 2)
						Class209.method3598("Success", -268796037);
					else
						Class209.method3598("Failure", -693309543);
					return;
				}
				if (Class475.aBool5623 && string.equalsIgnoreCase("wm3")) {
					Class440.method7373(3, 1024, 768, false, (byte) 71);
					if (Class158.method2730((short) -23797) == 3)
						Class209.method3598("Success", -1837857918);
					else
						Class209.method3598("Failure", -223811881);
					return;
				}
				if (string.startsWith("dumpitems")) {
					for (int itemId = 0; itemId < 24806; itemId++) {
						int[] is = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(itemId, 1).renderToSprite(Class182.HARDWARE_RENDERER, Renderers.SOFTWARE_RENDERER, 1, 1, -13623264, false, 0, Renderers.FONT_RENDERER, Class84.myPlayer.playerAppearance, (short) 1);
						try {
							int w = (int) Math.sqrt((int) is.length) - 1;
							BufferedImage bImg = new BufferedImage(36, 32, BufferedImage.TYPE_INT_ARGB);
							bImg.setRGB(0, 0, w, w, is, 0, w);
							for (int by = 0; by < w; by++) {
								for (int bx = 0; bx < w; bx++) {
									bImg.setRGB(bx, by, is[(by * 36) + bx]);
								}
							}
							File outFile = new File("./items/"+itemId+".png");
							ImageIO.write(bImg, "png", outFile);
						} catch (Exception ee) {
							ee.printStackTrace();
						}
					}
					return;
				}
				if (string.startsWith("setlobby ")) {
					int i_174_ = -1;
					Object object = null;
					string = string.substring(9);
					int i_175_ = string.indexOf(' ');
					if (-1 == i_175_)
						Class209.method3598("Failure", -208040475);
					else {
						try {
							i_174_ = Integer.parseInt(string.substring(0, i_175_));
						} catch (NumberFormatException numberformatexception) {
							/* empty */
						}
						if (-1 == i_174_)
							Class209.method3598("Failure", -1955711283);
						else {
							String string_176_ = new StringBuilder().append(string.substring(1 + i_175_).trim()).append(".runescape.com").toString();
							Class496.method8314(string_176_, i_174_, -1852846838);
							Class209.method3598("Success", -226741800);
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class538.method11500(0, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-491393282) == 0) {
						Class209.method3598("Success", -1340836055);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 0, -1122635532);
						Class190.method3148((byte) 68);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -344734779);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class538.method11500(1, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1821997083) == 1) {
						Class209.method3598("Success", -364086081);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 1, -1690467164);
						Class190.method3148((byte) 47);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -716939990);
					return;
				}
				if (string.equalsIgnoreCase("tk2")) {
					Class538.method11500(2, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(2070272351) == 2) {
						Class209.method3598("Success", -1794668716);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 2, -259704912);
						Class190.method3148((byte) 17);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -822814139);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class538.method11500(3, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(389435618) == 3) {
						Class209.method3598("Success", -832737067);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 3, 1626226442);
						Class190.method3148((byte) 28);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -129081346);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class538.method11500(5, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-889180352) == 5) {
						Class209.method3598("Success", -1022184236);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 5, -1654618197);
						Class190.method3148((byte) 119);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -1885199360);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (client.anInt7166 * -1741204137 == 13)
						Class151.method2592((byte) 34);
					else if (18 == -1741204137 * client.anInt7166)
						client.aClass184_7475.aBool2298 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class184[] class184s = client.aClass184Array7220;
					for (int i_177_ = 0; i_177_ < class184s.length; i_177_++) {
						Class184 class184 = class184s[i_177_];
						if (class184.method3053((byte) -116) != null)
							class184.method3053((byte) -71).method3320((byte) 52);
					}
					Class119.JS5_STANDARD_REQUESTER.method5543((byte) 48);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i_178_ = Integer.parseInt(string.substring(17));
					Class209.method3598(new StringBuilder().append("varpbit=").append(Class158_Sub1.aClass3_8507.method241(i_178_, -632025668)).toString(), -1998632005);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i_179_ = Integer.parseInt(string.substring(14));
					Class209.method3598(new StringBuilder().append("varp=").append(Class158_Sub1.aClass3_8507.method240(i_179_, 127032296)).toString(), -2108704386);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class456_Sub3.method12681(string.substring(12), ' ', 229848533);
					if (2 == strings.length)
						Class2.method257(strings[0], strings[1], 1942118537);
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class456_Sub3.method12681(string.substring(8), ' ', 229848533);
					int i_180_ = Integer.parseInt(strings[0]);
					Class282_Sub1.method11614(i_180_, 143389073);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class169.method2869(1635435907)).append(".log").toString());
						if (file.exists()) {
							Class209.method3598("file already exists!", -2041307357);
							return;
						}
					}
					if (Class282_Sub50_Sub3.aFileOutputStream9481 != null) {
						Class282_Sub50_Sub3.aFileOutputStream9481.close();
						Class282_Sub50_Sub3.aFileOutputStream9481 = null;
					}
					try {
						Class282_Sub50_Sub3.aFileOutputStream9481 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class209.method3598(new StringBuilder().append("Could not create ").append(file.getName()).toString(), -1294344572);
					} catch (SecurityException securityexception) {
						Class209.method3598(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), -425204708);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (Class282_Sub50_Sub3.aFileOutputStream9481 != null)
						Class282_Sub50_Sub3.aFileOutputStream9481.close();
					Class282_Sub50_Sub3.aFileOutputStream9481 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class209.method3598("No such file", -445176938);
						return;
					}
					byte[] is = Class153.method2621(file, 1265044571);
					if (null == is) {
						Class209.method3598("Failed to read file", -1589533875);
						return;
					}
					String[] strings = (Class456_Sub3.method12681((Class122.method2110(Class282_Sub17_Sub7.method15439(is, 198480512), '\r', "", -601284203)), '\n', 229848533));
					Class341.method6074(strings, 1579654554);
				}
				if (-1741204137 * client.anInt7166 == 13) {
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4612, (client.aClass184_7475.aClass432_2283), 704086040);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 3);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(bool ? 1 : 0);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(bool_173_ ? 1 : 0);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
					client.aClass184_7475.method3049(class282_sub23, -273447008);
				}
			} catch (Exception exception) {
				Class209.method3598((Message.ERROR_EXECUTING_COMMAND.translate(Class223.CURRENT_LANGUAGE, -1449846660)), -1151783606);
				return;
			}
		}
		if (client.anInt7166 * -1741204137 != 13)
			Class209.method3598(new StringBuilder().append(Message.UNKNOWN_DEV_COMMAND.translate(Class223.CURRENT_LANGUAGE, -1344246012)).append(string).toString(), -1444759652);
	}

	static void method4314(CS2Executor class527, int i) {
		class527.intStack[class527.anInt7012 * 1942118537 - 2] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[1942118537 * class527.anInt7012 - 2]), -1396181317).method4103(Class158_Sub1.aClass3_8507, (class527.intStack[1942118537 * class527.anInt7012 - 1]), -394016301)) ? 1 : 0;
		class527.anInt7012 -= 141891001;
	}

	static final void method4315(CS2Executor class527, int i) {
		Class283.anInt3384 = 0;
	}

	public static final int decodeLandscapeData(ObjectIndexLoader objectDefs, byte[] data, int regionX, int regionY, int i_182_, int i_183_, short i_184_) {
		int i_185_ = 0;
		RsByteBuffer stream = new RsByteBuffer(data);
		int i_186_ = -1;
		for (;;) {
			int i_187_ = stream.readSmart2(-1436314957);
			if (i_187_ == 0)
				break;
			i_186_ += i_187_;
			int i_188_ = 0;
			boolean bool = false;
			for (;;) {
				if (bool) {
					int i_189_ = stream.readUnsignedSmart(1964048281);
					if (0 == i_189_)
						break;
					stream.readUnsignedByte();
				} else {
					int i_190_ = stream.readUnsignedSmart(1841377249);
					if (0 == i_190_)
						break;
					i_188_ += i_190_ - 1;
					int i_191_ = i_188_ & 0x3f;
					int i_192_ = i_188_ >> 6 & 0x3f;
					int i_193_ = stream.readUnsignedByte() >> 2;
					int i_194_ = i_192_ + regionX;
					int i_195_ = regionY + i_191_;
					if (i_194_ > 0 && i_195_ > 0 && i_194_ < i_182_ - 1 && i_195_ < i_183_ - 1) {
						ObjectDefinitions defs = objectDefs.getObjectDefinitions(i_186_, 65280);
						if ((Class458.aClass458_5480.anInt5481 * 1109376893 != i_193_) || Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 59) != 0 || defs.anInt5652 * -348507379 != 0 || 647396503 * defs.anInt5677 == 1 || defs.aBool5685) {
							if (!defs.method7968(-2090294731))
								i_185_++;
							bool = true;
						}
					}
				}
			}
		}
		return i_185_;
	}
}
