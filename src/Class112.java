/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class112 {
	static final String aString1233 = "#";

	public static final boolean method1867(String string, String string_0_, String string_1_, String string_2_) {
		if (string == null || string_1_ == null)
			return false;
		if (string.startsWith("#") || string_1_.startsWith("#"))
			return string.equals(string_1_);
		return string_0_.equals(string_2_);
	}

	public static final boolean method1868(String string, String string_3_, String string_4_, String string_5_) {
		if (string == null || string_4_ == null)
			return false;
		if (string.startsWith("#") || string_4_.startsWith("#"))
			return string.equals(string_4_);
		return string_3_.equals(string_5_);
	}

	Class112() throws Throwable {
		throw new Error();
	}

	public static final boolean method1869(String string, String string_6_, String string_7_, String string_8_) {
		if (string == null || string_7_ == null)
			return false;
		if (string.startsWith("#") || string_7_.startsWith("#"))
			return string.equals(string_7_);
		return string_6_.equals(string_8_);
	}

	public static Class60[] method1870(int i) {
		return new Class60[] { Class60.aClass60_609, Class60.aClass60_602, Class60.aClass60_603, Class60.aClass60_608, Class60.aClass60_605, Class60.aClass60_606, Class60.aClass60_607, Class60.aClass60_604, Class60.aClass60_601, Class60.aClass60_610 };
	}

	public static int method1871(int i, int i_9_, int i_10_, int i_11_) {
		i_10_ &= 0x3;
		if (i_10_ == 0)
			return i;
		if (i_10_ == 1)
			return i_9_;
		if (2 == i_10_)
			return 7 - i;
		return 7 - i_9_;
	}

	static final void method1872(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_12_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_13_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class252.method4327(i_12_, i_13_, true, false, (byte) 32);
	}

	public static int method1873(int i, int i_14_, int i_15_, Class225 class225, Class336 class336, boolean bool, int[] is, int[] is_16_, int i_17_) {
		for (int i_18_ = 0; i_18_ < 128; i_18_++) {
			for (int i_19_ = 0; i_19_ < 128; i_19_++) {
				Class251.anIntArrayArray3096[i_18_][i_19_] = 0;
				Class251.anIntArrayArray3102[i_18_][i_19_] = 99999999;
			}
		}
		boolean bool_20_;
		if (i_15_ == 1)
			bool_20_ = Class96_Sub17.method14654(i, i_14_, class225, class336, -1231399529);
		else if (i_15_ == 2)
			bool_20_ = Class46.method929(i, i_14_, class225, class336, -46560095);
		else
			bool_20_ = Class46.method930(i, i_14_, i_15_, class225, class336, (byte) 21);
		int i_21_ = i - 64;
		int i_22_ = i_14_ - 64;
		int i_23_ = Class251.anInt3098 * -1659935235;
		int i_24_ = Class251.anInt3095 * 1434452541;
		if (!bool_20_) {
			if (bool) {
				int i_25_ = 2147483647;
				int i_26_ = 2147483647;
				int i_27_ = 10;
				int i_28_ = -1440558477 * class225.anInt2779;
				int i_29_ = class225.anInt2780 * 1732585867;
				int i_30_ = -1384164183 * class225.anInt2781;
				int i_31_ = class225.anInt2782 * 361960939;
				for (int i_32_ = i_28_ - i_27_; i_32_ <= i_28_ + i_27_; i_32_++) {
					for (int i_33_ = i_29_ - i_27_; i_33_ <= i_29_ + i_27_; i_33_++) {
						int i_34_ = i_32_ - i_21_;
						int i_35_ = i_33_ - i_22_;
						if (i_34_ >= 0 && i_35_ >= 0 && i_34_ < 128 && i_35_ < 128 && (Class251.anIntArrayArray3102[i_34_][i_35_] < 100)) {
							int i_36_ = 0;
							if (i_32_ < i_28_)
								i_36_ = i_28_ - i_32_;
							else if (i_32_ > i_30_ + i_28_ - 1)
								i_36_ = i_32_ - (i_28_ + i_30_ - 1);
							int i_37_ = 0;
							if (i_33_ < i_29_)
								i_37_ = i_29_ - i_33_;
							else if (i_33_ > i_31_ + i_29_ - 1)
								i_37_ = i_33_ - (i_29_ + i_31_ - 1);
							int i_38_ = i_36_ * i_36_ + i_37_ * i_37_;
							if (i_38_ < i_25_ || (i_38_ == i_25_ && (Class251.anIntArrayArray3102[i_34_][i_35_]) < i_26_)) {
								i_25_ = i_38_;
								i_26_ = (Class251.anIntArrayArray3102[i_34_][i_35_]);
								i_23_ = i_32_;
								i_24_ = i_33_;
							}
						}
					}
				}
				if (i_25_ == 2147483647)
					return -1;
			} else
				return -1;
		}
		if (i == i_23_ && i_14_ == i_24_)
			return 0;
		int i_39_ = 0;
		Class251.anIntArray3101[i_39_] = i_23_;
		Class251.anIntArray3099[i_39_++] = i_24_;
		int i_41_;
		int i_40_ = (i_41_ = Class251.anIntArrayArray3096[i_23_ - i_21_][i_24_ - i_22_]);
		while (i != i_23_ || i_24_ != i_14_) {
			if (i_41_ != i_40_) {
				i_41_ = i_40_;
				Class251.anIntArray3101[i_39_] = i_23_;
				Class251.anIntArray3099[i_39_++] = i_24_;
			}
			if ((i_40_ & 0x2) != 0)
				i_23_++;
			else if ((i_40_ & 0x8) != 0)
				i_23_--;
			if ((i_40_ & 0x1) != 0)
				i_24_++;
			else if ((i_40_ & 0x4) != 0)
				i_24_--;
			i_40_ = Class251.anIntArrayArray3096[i_23_ - i_21_][i_24_ - i_22_];
		}
		int i_42_ = 0;
		do {
			if (i_39_-- <= 0)
				break;
			is[i_42_] = Class251.anIntArray3101[i_39_];
			is_16_[i_42_++] = Class251.anIntArray3099[i_39_];
		} while (i_42_ < is.length);
		return i_42_;
	}

	static final void method1874(CS2Executor class527, int i) {
		String string = (Class462.aStringArray5548[(class527.unknown[class527.instrPtr * 301123709])]);
		if (null == string)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}
}
