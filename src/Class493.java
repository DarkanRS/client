/* Class493 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class493 {
	public static Class479 aClass479_5778;

	public static int method8267(CharSequence charsequence, CharSequence charsequence_0_, Language class495) {
		int i = charsequence.length();
		int i_1_ = charsequence_0_.length();
		int i_2_ = 0;
		int i_3_ = 0;
		char c = '\0';
		char c_4_ = '\0';
		while (i_2_ - c < i || i_3_ - c_4_ < i_1_) {
			if (i_2_ - c >= i)
				return -1;
			if (i_3_ - c_4_ >= i_1_)
				return 1;
			char c_5_;
			if (c != 0) {
				c_5_ = c;
				boolean bool = false;
			} else
				c_5_ = charsequence.charAt(i_2_++);
			char c_6_;
			if (c_4_ != 0) {
				c_6_ = c_4_;
				boolean bool = false;
			} else
				c_6_ = charsequence_0_.charAt(i_3_++);
			c = Class466.method7778(c_5_, 944852350);
			c_4_ = Class466.method7778(c_6_, -2072737339);
			c_5_ = Class152.method2599(c_5_, class495, 32768);
			c_6_ = Class152.method2599(c_6_, class495, 32768);
			if (c_5_ != c_6_ && (Character.toUpperCase(c_5_) != Character.toUpperCase(c_6_))) {
				c_5_ = Character.toLowerCase(c_5_);
				c_6_ = Character.toLowerCase(c_6_);
				if (c_6_ != c_5_)
					return (Class468_Sub30.method13422(c_5_, class495, -556732263) - Class468_Sub30.method13422(c_6_, class495, -556732263));
			}
		}
		int i_7_ = Math.min(i, i_1_);
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			if (class495 == Language.aClass495_5801) {
				i_2_ = i - 1 - i_8_;
				i_3_ = i_1_ - 1 - i_8_;
			} else
				i_2_ = i_3_ = i_8_;
			char c_9_ = charsequence.charAt(i_2_);
			char c_10_ = charsequence_0_.charAt(i_3_);
			if (c_10_ != c_9_ && (Character.toUpperCase(c_9_) != Character.toUpperCase(c_10_))) {
				c_9_ = Character.toLowerCase(c_9_);
				c_10_ = Character.toLowerCase(c_10_);
				if (c_9_ != c_10_)
					return (Class468_Sub30.method13422(c_9_, class495, -556732263) - Class468_Sub30.method13422(c_10_, class495, -556732263));
			}
		}
		int i_11_ = i - i_1_;
		if (0 != i_11_)
			return i_11_;
		for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
			char c_13_ = charsequence.charAt(i_12_);
			char c_14_ = charsequence_0_.charAt(i_12_);
			if (c_13_ != c_14_)
				return (Class468_Sub30.method13422(c_13_, class495, -556732263) - Class468_Sub30.method13422(c_14_, class495, -556732263));
		}
		return 0;
	}

	public static String method8268(long l, int i, boolean bool, Language class495) {
		char c = ',';
		char c_15_ = '.';
		if (Language.aClass495_5795 == class495) {
			c = '.';
			c_15_ = ',';
		}
		if (class495 == Language.aClass495_5801)
			c_15_ = '\u00a0';
		boolean bool_16_ = false;
		if (l < 0L) {
			bool_16_ = true;
			l = -l;
		}
		StringBuilder stringbuilder = new StringBuilder(26);
		if (i > 0) {
			for (int i_17_ = 0; i_17_ < i; i_17_++) {
				int i_18_ = (int) l;
				l /= 10L;
				stringbuilder.append((char) (i_18_ + 48 - (int) l * 10));
			}
			stringbuilder.append(c);
		}
		int i_19_ = 0;
		for (;;) {
			int i_20_ = (int) l;
			l /= 10L;
			stringbuilder.append((char) (48 + i_20_ - 10 * (int) l));
			if (0L == l)
				break;
			if (bool && ++i_19_ % 3 == 0)
				stringbuilder.append(c_15_);
		}
		if (bool_16_)
			stringbuilder.append('-');
		return stringbuilder.reverse().toString();
	}

	static char method8269(char c, Language class495) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if (c == '\u00c7')
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if ('\u00d1' == c && Language.aClass495_5800 != class495)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if ('\u00dd' == c)
				return 'Y';
			if (c == '\u00df')
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if ('\u00e7' == c)
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if ('\u00f1' == c && Language.aClass495_5800 != class495)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if ('\u00fd' == c || '\u00ff' == c)
				return 'y';
		}
		if (c == '\u0152')
			return 'O';
		if (c == '\u0153')
			return 'o';
		if (c == '\u0178')
			return 'Y';
		return c;
	}

	static char method8270(char c, Language class495) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if (c == '\u00c7')
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if ('\u00d1' == c && Language.aClass495_5800 != class495)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if ('\u00dd' == c)
				return 'Y';
			if (c == '\u00df')
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if ('\u00e7' == c)
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if ('\u00f1' == c && Language.aClass495_5800 != class495)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if ('\u00fd' == c || '\u00ff' == c)
				return 'y';
		}
		if (c == '\u0152')
			return 'O';
		if (c == '\u0153')
			return 'o';
		if (c == '\u0178')
			return 'Y';
		return c;
	}

	static char method8271(char c) {
		if (c == '\u00c6')
			return 'E';
		if ('\u00e6' == c)
			return 'e';
		if (c == '\u00df')
			return 's';
		if (c == '\u0152')
			return 'E';
		if (c == '\u0153')
			return 'e';
		return '\0';
	}

	Class493() throws Throwable {
		throw new Error();
	}

	static char method8272(char c) {
		if (c == '\u00c6')
			return 'E';
		if ('\u00e6' == c)
			return 'e';
		if (c == '\u00df')
			return 's';
		if (c == '\u0152')
			return 'E';
		if (c == '\u0153')
			return 'e';
		return '\0';
	}

	public static void method8273(String string, byte i) {
		if (-1741204137 * client.anInt7166 != 3) {
			if (i == 1) {
				/* empty */
			}
		} else {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4570, client.aClass184_7218.aClass432_2283, 302264892);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(0, 1417031095);
			int i_21_ = (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.index += 781596523;
			class282_sub23.aClass282_Sub35_Sub2_7682.method13101(Class14.anIntArray131, i_21_, (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index), 1836980481);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13281(-1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index) - i_21_, 1201423895);
			client.aClass184_7218.method3049(class282_sub23, -349048671);
			Class404.aClass466_4831 = Class466.aClass466_5564;
		}
	}
}
