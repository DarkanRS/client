/* Class484 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class484 {
	static int method8157(CharSequence charsequence, char c) {
		int i = 0;
		int i_0_ = charsequence.length();
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			if (charsequence.charAt(i_1_) == c)
				i++;
		}
		return i;
	}

	static String method8158(int i, int i_2_, boolean bool) {
		if (i_2_ < 2 || i_2_ > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i_2_).toString());
		if (!bool || i < 0)
			return Integer.toString(i, i_2_);
		int i_3_ = 2;
		int i_4_ = i / i_2_;
		while (i_4_ != 0) {
			i_4_ /= i_2_;
			i_3_++;
		}
		char[] cs = new char[i_3_];
		cs[0] = '+';
		for (int i_5_ = i_3_ - 1; i_5_ > 0; i_5_--) {
			int i_6_ = i;
			i /= i_2_;
			int i_7_ = i_6_ - i_2_ * i;
			if (i_7_ >= 10)
				cs[i_5_] = (char) (i_7_ + 87);
			else
				cs[i_5_] = (char) (48 + i_7_);
		}
		return new String(cs);
	}

	public static boolean method8159(char c) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || c == '\u0152' || c == '\u2014' || '\u0153' == c || c == '\u0178')
			return true;
		return false;
	}

	static int method8160(CharSequence charsequence, char c) {
		int i = 0;
		int i_8_ = charsequence.length();
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			if (charsequence.charAt(i_9_) == c)
				i++;
		}
		return i;
	}

	static int method8161(CharSequence charsequence, char c) {
		int i = 0;
		int i_10_ = charsequence.length();
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			if (charsequence.charAt(i_11_) == c)
				i++;
		}
		return i;
	}

	public static String method8162(Object[] objects, int i, int i_12_) {
		if (0 == i_12_)
			return "";
		if (i_12_ == 1) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (charsequence == null)
				return "null";
			return charsequence.toString();
		}
		int i_13_ = i_12_ + i;
		int i_14_ = 0;
		for (int i_15_ = i; i_15_ < i_13_; i_15_++) {
			CharSequence charsequence = (CharSequence) objects[i_15_];
			if (null == charsequence)
				i_14_ += 4;
			else
				i_14_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_14_);
		for (int i_16_ = i; i_16_ < i_13_; i_16_++) {
			CharSequence charsequence = (CharSequence) objects[i_16_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}

	public static String method8163(Object[] objects, int i, int i_17_) {
		if (0 == i_17_)
			return "";
		if (i_17_ == 1) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (charsequence == null)
				return "null";
			return charsequence.toString();
		}
		int i_18_ = i_17_ + i;
		int i_19_ = 0;
		for (int i_20_ = i; i_20_ < i_18_; i_20_++) {
			CharSequence charsequence = (CharSequence) objects[i_20_];
			if (null == charsequence)
				i_19_ += 4;
			else
				i_19_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_19_);
		for (int i_21_ = i; i_21_ < i_18_; i_21_++) {
			CharSequence charsequence = (CharSequence) objects[i_21_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}

	public static boolean method8164(CharSequence charsequence) {
		return Class272.method4841(charsequence, 10, true, 1745015290);
	}

	public static boolean method8165(CharSequence charsequence) {
		return Class272.method4841(charsequence, 10, true, 502326513);
	}

	static boolean method8166(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_22_ = false;
		boolean bool_23_ = false;
		int i_24_ = 0;
		int i_25_ = charsequence.length();
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			int i_27_ = charsequence.charAt(i_26_);
			if (0 == i_26_) {
				if (45 == i_27_) {
					bool_22_ = true;
					continue;
				}
				if (i_27_ == 43 && bool)
					continue;
			}
			if (i_27_ >= 48 && i_27_ <= 57)
				i_27_ -= 48;
			else if (i_27_ >= 65 && i_27_ <= 90)
				i_27_ -= 55;
			else if (i_27_ >= 97 && i_27_ <= 122)
				i_27_ -= 87;
			else
				return false;
			if (i_27_ >= i)
				return false;
			if (bool_22_)
				i_27_ = -i_27_;
			int i_28_ = i_27_ + i_24_ * i;
			if (i_24_ != i_28_ / i)
				return false;
			i_24_ = i_28_;
			bool_23_ = true;
		}
		return bool_23_;
	}

	static boolean method8167(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_29_ = false;
		boolean bool_30_ = false;
		int i_31_ = 0;
		int i_32_ = charsequence.length();
		for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
			int i_34_ = charsequence.charAt(i_33_);
			if (0 == i_33_) {
				if (45 == i_34_) {
					bool_29_ = true;
					continue;
				}
				if (i_34_ == 43 && bool)
					continue;
			}
			if (i_34_ >= 48 && i_34_ <= 57)
				i_34_ -= 48;
			else if (i_34_ >= 65 && i_34_ <= 90)
				i_34_ -= 55;
			else if (i_34_ >= 97 && i_34_ <= 122)
				i_34_ -= 87;
			else
				return false;
			if (i_34_ >= i)
				return false;
			if (bool_29_)
				i_34_ = -i_34_;
			int i_35_ = i_34_ + i_31_ * i;
			if (i_31_ != i_35_ / i)
				return false;
			i_31_ = i_35_;
			bool_30_ = true;
		}
		return bool_30_;
	}

	public static long method8168(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_36_ = 0; i_36_ < i; i_36_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_36_);
		return l;
	}

	public static int method8169(CharSequence charsequence) {
		return Class356.method6225(charsequence, 10, true, 2038427942);
	}

	public static int method8170(CharSequence charsequence) {
		return Class356.method6225(charsequence, 10, true, 2038427942);
	}

	public static int method8171(CharSequence charsequence) {
		return Class356.method6225(charsequence, 10, true, 2038427942);
	}

	public static int method8172(CharSequence charsequence) {
		return Class356.method6225(charsequence, 10, true, 2038427942);
	}

	public static int method8173(CharSequence charsequence, int i) {
		return Class356.method6225(charsequence, i, true, 2038427942);
	}

	static int method8174(CharSequence charsequence, char c) {
		int i = 0;
		int i_37_ = charsequence.length();
		for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
			if (charsequence.charAt(i_38_) == c)
				i++;
		}
		return i;
	}

	static int method8175(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_39_ = false;
		boolean bool_40_ = false;
		int i_41_ = 0;
		int i_42_ = charsequence.length();
		for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
			int i_44_ = charsequence.charAt(i_43_);
			if (i_43_ == 0) {
				if (i_44_ == 45) {
					bool_39_ = true;
					continue;
				}
				if (43 == i_44_ && bool)
					continue;
			}
			if (i_44_ >= 48 && i_44_ <= 57)
				i_44_ -= 48;
			else if (i_44_ >= 65 && i_44_ <= 90)
				i_44_ -= 55;
			else if (i_44_ >= 97 && i_44_ <= 122)
				i_44_ -= 87;
			else
				throw new NumberFormatException();
			if (i_44_ >= i)
				throw new NumberFormatException();
			if (bool_39_)
				i_44_ = -i_44_;
			int i_45_ = i * i_41_ + i_44_;
			if (i_45_ / i != i_41_)
				throw new NumberFormatException();
			i_41_ = i_45_;
			bool_40_ = true;
		}
		if (!bool_40_)
			throw new NumberFormatException();
		return i_41_;
	}

	static int method8176(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_46_ = false;
		boolean bool_47_ = false;
		int i_48_ = 0;
		int i_49_ = charsequence.length();
		for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
			int i_51_ = charsequence.charAt(i_50_);
			if (i_50_ == 0) {
				if (i_51_ == 45) {
					bool_46_ = true;
					continue;
				}
				if (43 == i_51_ && bool)
					continue;
			}
			if (i_51_ >= 48 && i_51_ <= 57)
				i_51_ -= 48;
			else if (i_51_ >= 65 && i_51_ <= 90)
				i_51_ -= 55;
			else if (i_51_ >= 97 && i_51_ <= 122)
				i_51_ -= 87;
			else
				throw new NumberFormatException();
			if (i_51_ >= i)
				throw new NumberFormatException();
			if (bool_46_)
				i_51_ = -i_51_;
			int i_52_ = i * i_48_ + i_51_;
			if (i_52_ / i != i_48_)
				throw new NumberFormatException();
			i_48_ = i_52_;
			bool_47_ = true;
		}
		if (!bool_47_)
			throw new NumberFormatException();
		return i_48_;
	}

	public static int method8177(CharSequence charsequence) {
		int i = charsequence.length();
		int i_53_ = 0;
		for (int i_54_ = 0; i_54_ < i; i_54_++)
			i_53_ = ((i_53_ << 5) - i_53_ + Class242.method4163(charsequence.charAt(i_54_), (byte) 36));
		return i_53_;
	}

	public static int method8178(CharSequence charsequence) {
		int i = charsequence.length();
		int i_55_ = 0;
		for (int i_56_ = 0; i_56_ < i; i_56_++)
			i_55_ = (i_55_ << 5) - i_55_ + charsequence.charAt(i_56_);
		return i_55_;
	}

	public static String method8179(int i, boolean bool) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class149_Sub4.method14662(i, 10, bool, 16711680);
	}

	static String method8180(int i, int i_57_, boolean bool) {
		if (i_57_ < 2 || i_57_ > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i_57_).toString());
		if (!bool || i < 0)
			return Integer.toString(i, i_57_);
		int i_58_ = 2;
		int i_59_ = i / i_57_;
		while (i_59_ != 0) {
			i_59_ /= i_57_;
			i_58_++;
		}
		char[] cs = new char[i_58_];
		cs[0] = '+';
		for (int i_60_ = i_58_ - 1; i_60_ > 0; i_60_--) {
			int i_61_ = i;
			i /= i_57_;
			int i_62_ = i_61_ - i_57_ * i;
			if (i_62_ >= 10)
				cs[i_60_] = (char) (i_62_ + 87);
			else
				cs[i_60_] = (char) (48 + i_62_);
		}
		return new String(cs);
	}

	public static String method8181(String string, char c, String string_63_) {
		int i = string.length();
		int i_64_ = string_63_.length();
		int i_65_ = i;
		int i_66_ = i_64_ - 1;
		if (i_66_ != 0) {
			int i_67_ = 0;
			for (;;) {
				i_67_ = string.indexOf(c, i_67_);
				if (i_67_ < 0)
					break;
				i_67_++;
				i_65_ += i_66_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_65_);
		int i_68_ = 0;
		for (;;) {
			int i_69_ = string.indexOf(c, i_68_);
			if (i_69_ < 0)
				break;
			stringbuilder.append(string.substring(i_68_, i_69_));
			stringbuilder.append(string_63_);
			i_68_ = i_69_ + 1;
		}
		stringbuilder.append(string.substring(i_68_));
		return stringbuilder.toString();
	}

	static String method8182(int i, int i_70_, boolean bool) {
		if (i_70_ < 2 || i_70_ > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i_70_).toString());
		if (!bool || i < 0)
			return Integer.toString(i, i_70_);
		int i_71_ = 2;
		int i_72_ = i / i_70_;
		while (i_72_ != 0) {
			i_72_ /= i_70_;
			i_71_++;
		}
		char[] cs = new char[i_71_];
		cs[0] = '+';
		for (int i_73_ = i_71_ - 1; i_73_ > 0; i_73_--) {
			int i_74_ = i;
			i /= i_70_;
			int i_75_ = i_74_ - i_70_ * i;
			if (i_75_ >= 10)
				cs[i_73_] = (char) (i_75_ + 87);
			else
				cs[i_73_] = (char) (48 + i_75_);
		}
		return new String(cs);
	}

	public static String method8183(int i, boolean bool) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class149_Sub4.method14662(i, 10, bool, 16711680);
	}

	public static long method8184(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_76_ = 0; i_76_ < i; i_76_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_76_);
		return l;
	}

	public static long method8185(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_77_ = 0; i_77_ < i; i_77_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_77_);
		return l;
	}

	static boolean method8186(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_78_ = false;
		boolean bool_79_ = false;
		int i_80_ = 0;
		int i_81_ = charsequence.length();
		for (int i_82_ = 0; i_82_ < i_81_; i_82_++) {
			int i_83_ = charsequence.charAt(i_82_);
			if (0 == i_82_) {
				if (45 == i_83_) {
					bool_78_ = true;
					continue;
				}
				if (i_83_ == 43 && bool)
					continue;
			}
			if (i_83_ >= 48 && i_83_ <= 57)
				i_83_ -= 48;
			else if (i_83_ >= 65 && i_83_ <= 90)
				i_83_ -= 55;
			else if (i_83_ >= 97 && i_83_ <= 122)
				i_83_ -= 87;
			else
				return false;
			if (i_83_ >= i)
				return false;
			if (bool_78_)
				i_83_ = -i_83_;
			int i_84_ = i_83_ + i_80_ * i;
			if (i_80_ != i_84_ / i)
				return false;
			i_80_ = i_84_;
			bool_79_ = true;
		}
		return bool_79_;
	}

	static int method8187(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_85_ = false;
		boolean bool_86_ = false;
		int i_87_ = 0;
		int i_88_ = charsequence.length();
		for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
			int i_90_ = charsequence.charAt(i_89_);
			if (i_89_ == 0) {
				if (i_90_ == 45) {
					bool_85_ = true;
					continue;
				}
				if (43 == i_90_ && bool)
					continue;
			}
			if (i_90_ >= 48 && i_90_ <= 57)
				i_90_ -= 48;
			else if (i_90_ >= 65 && i_90_ <= 90)
				i_90_ -= 55;
			else if (i_90_ >= 97 && i_90_ <= 122)
				i_90_ -= 87;
			else
				throw new NumberFormatException();
			if (i_90_ >= i)
				throw new NumberFormatException();
			if (bool_85_)
				i_90_ = -i_90_;
			int i_91_ = i * i_87_ + i_90_;
			if (i_91_ / i != i_87_)
				throw new NumberFormatException();
			i_87_ = i_91_;
			bool_86_ = true;
		}
		if (!bool_86_)
			throw new NumberFormatException();
		return i_87_;
	}

	Class484() throws Throwable {
		throw new Error();
	}

	public static boolean method8188(char c) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	public static boolean method8189(char c) {
		return c >= '0' && c <= '9';
	}

	public static String method8190(String string, char c, String string_92_) {
		int i = string.length();
		int i_93_ = string_92_.length();
		int i_94_ = i;
		int i_95_ = i_93_ - 1;
		if (i_95_ != 0) {
			int i_96_ = 0;
			for (;;) {
				i_96_ = string.indexOf(c, i_96_);
				if (i_96_ < 0)
					break;
				i_96_++;
				i_94_ += i_95_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_94_);
		int i_97_ = 0;
		for (;;) {
			int i_98_ = string.indexOf(c, i_97_);
			if (i_98_ < 0)
				break;
			stringbuilder.append(string.substring(i_97_, i_98_));
			stringbuilder.append(string_92_);
			i_97_ = i_98_ + 1;
		}
		stringbuilder.append(string.substring(i_97_));
		return stringbuilder.toString();
	}

	public static boolean method8191(char c) {
		return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
	}

	public static boolean method8192(char c) {
		return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
	}

	static int method8193(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_99_ = false;
		boolean bool_100_ = false;
		int i_101_ = 0;
		int i_102_ = charsequence.length();
		for (int i_103_ = 0; i_103_ < i_102_; i_103_++) {
			int i_104_ = charsequence.charAt(i_103_);
			if (i_103_ == 0) {
				if (i_104_ == 45) {
					bool_99_ = true;
					continue;
				}
				if (43 == i_104_ && bool)
					continue;
			}
			if (i_104_ >= 48 && i_104_ <= 57)
				i_104_ -= 48;
			else if (i_104_ >= 65 && i_104_ <= 90)
				i_104_ -= 55;
			else if (i_104_ >= 97 && i_104_ <= 122)
				i_104_ -= 87;
			else
				throw new NumberFormatException();
			if (i_104_ >= i)
				throw new NumberFormatException();
			if (bool_99_)
				i_104_ = -i_104_;
			int i_105_ = i * i_101_ + i_104_;
			if (i_105_ / i != i_101_)
				throw new NumberFormatException();
			i_101_ = i_105_;
			bool_100_ = true;
		}
		if (!bool_100_)
			throw new NumberFormatException();
		return i_101_;
	}

	public static boolean method8194(char c) {
		return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
	}

	public static String method8195(String string, char c, String string_106_) {
		int i = string.length();
		int i_107_ = string_106_.length();
		int i_108_ = i;
		int i_109_ = i_107_ - 1;
		if (i_109_ != 0) {
			int i_110_ = 0;
			for (;;) {
				i_110_ = string.indexOf(c, i_110_);
				if (i_110_ < 0)
					break;
				i_110_++;
				i_108_ += i_109_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_108_);
		int i_111_ = 0;
		for (;;) {
			int i_112_ = string.indexOf(c, i_111_);
			if (i_112_ < 0)
				break;
			stringbuilder.append(string.substring(i_111_, i_112_));
			stringbuilder.append(string_106_);
			i_111_ = i_112_ + 1;
		}
		stringbuilder.append(string.substring(i_111_));
		return stringbuilder.toString();
	}

	public static String[] method8196(String string, char c) {
		int i = Class149.method2565(string, c, -2083160421);
		String[] strings = new String[i + 1];
		int i_113_ = 0;
		int i_114_ = 0;
		for (int i_115_ = 0; i_115_ < i; i_115_++) {
			int i_116_;
			for (i_116_ = i_114_; string.charAt(i_116_) != c; i_116_++) {
				/* empty */
			}
			strings[i_113_++] = string.substring(i_114_, i_116_);
			i_114_ = i_116_ + 1;
		}
		strings[i] = string.substring(i_114_);
		return strings;
	}

	public static boolean method8197(char c) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || c == '\u0152' || c == '\u2014' || '\u0153' == c || c == '\u0178')
			return true;
		return false;
	}

	public static long method8198(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_117_ = 0; i_117_ < i; i_117_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_117_);
		return l;
	}

	static final void method8199(Class527 class527, byte i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class158.method2730((short) -26831);
	}

	static void method8200(Class118 class118, int i, int i_118_, boolean bool, int i_119_) {
		int i_120_ = 1506818197 * class118.anInt1301;
		int i_121_ = -492594917 * class118.anInt1429;
		if (0 == class118.aByte1368)
			class118.anInt1301 = class118.anInt1297 * 1421984045;
		else if (1 == class118.aByte1368)
			class118.anInt1301 = -194194755 * (i - 1352091441 * class118.anInt1297);
		else if (class118.aByte1368 == 2)
			class118.anInt1301 = (i * (1352091441 * class118.anInt1297) >> 14) * -194194755;
		if (class118.aByte1294 == 0)
			class118.anInt1429 = class118.anInt1298 * 149258915;
		else if (1 == class118.aByte1294)
			class118.anInt1429 = (i_118_ - class118.anInt1298 * 789656113) * -2110252781;
		else if (2 == class118.aByte1294)
			class118.anInt1429 = (i_118_ * (789656113 * class118.anInt1298) >> 14) * -2110252781;
		if (class118.aByte1368 == 4)
			class118.anInt1301 = (-2073526765 * class118.anInt1289 * (class118.anInt1429 * -492594917) / (class118.anInt1375 * 1977983759) * -194194755);
		if (class118.aByte1294 == 4)
			class118.anInt1429 = (class118.anInt1301 * 1506818197 * (1977983759 * class118.anInt1375) / (-2073526765 * class118.anInt1289) * -2110252781);
		if (client.aBool7168 && (client.method11633(class118).anInt7547 * 488242129 != 0 || 0 == class118.anInt1268 * -2131393857)) {
			if (class118.anInt1429 * -492594917 < 5 && class118.anInt1301 * 1506818197 < 5) {
				class118.anInt1429 = -1961329313;
				class118.anInt1301 = -970973775;
			} else {
				if (class118.anInt1429 * -492594917 <= 0)
					class118.anInt1429 = -1961329313;
				if (1506818197 * class118.anInt1301 <= 0)
					class118.anInt1301 = -970973775;
			}
		}
		if (Class118.anInt1372 * -741477579 == 1449989045 * class118.anInt1290)
			client.aClass118_7183 = class118;
		if (bool && class118.anObjectArray1271 != null && (i_120_ != 1506818197 * class118.anInt1301 || -492594917 * class118.anInt1429 != i_121_)) {
			Class282_Sub43 class282_sub43 = new Class282_Sub43();
			class282_sub43.aClass118_8053 = class118;
			class282_sub43.anObjectArray8054 = class118.anObjectArray1271;
			client.aClass482_7402.method8059(class282_sub43, -1019002091);
		}
	}
}
