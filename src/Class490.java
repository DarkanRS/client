/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class490 {
	static char[] aCharArray5766 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };

	public static boolean method8221(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray5766;
			for (int i = 0; i < cs.length; i++) {
				char c_0_ = cs[i];
				if (c == c_0_)
					return true;
			}
		}
		return false;
	}

	public static byte method8222(char c) {
		byte i;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			i = (byte) c;
		else if (c == '\u20ac')
			i = (byte) -128;
		else if ('\u201a' == c)
			i = (byte) -126;
		else if ('\u0192' == c)
			i = (byte) -125;
		else if (c == '\u201e')
			i = (byte) -124;
		else if ('\u2026' == c)
			i = (byte) -123;
		else if (c == '\u2020')
			i = (byte) -122;
		else if (c == '\u2021')
			i = (byte) -121;
		else if (c == '\u02c6')
			i = (byte) -120;
		else if ('\u2030' == c)
			i = (byte) -119;
		else if ('\u0160' == c)
			i = (byte) -118;
		else if (c == '\u2039')
			i = (byte) -117;
		else if ('\u0152' == c)
			i = (byte) -116;
		else if ('\u017d' == c)
			i = (byte) -114;
		else if ('\u2018' == c)
			i = (byte) -111;
		else if (c == '\u2019')
			i = (byte) -110;
		else if (c == '\u201c')
			i = (byte) -109;
		else if (c == '\u201d')
			i = (byte) -108;
		else if (c == '\u2022')
			i = (byte) -107;
		else if (c == '\u2013')
			i = (byte) -106;
		else if ('\u2014' == c)
			i = (byte) -105;
		else if ('\u02dc' == c)
			i = (byte) -104;
		else if (c == '\u2122')
			i = (byte) -103;
		else if ('\u0161' == c)
			i = (byte) -102;
		else if (c == '\u203a')
			i = (byte) -101;
		else if (c == '\u0153')
			i = (byte) -100;
		else if (c == '\u017e')
			i = (byte) -98;
		else if (c == '\u0178')
			i = (byte) -97;
		else
			i = (byte) 63;
		return i;
	}

	public static boolean method8223(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray5766;
			for (int i = 0; i < cs.length; i++) {
				char c_1_ = cs[i];
				if (c == c_1_)
					return true;
			}
		}
		return false;
	}

	public static boolean method8224(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray5766;
			for (int i = 0; i < cs.length; i++) {
				char c_2_ = cs[i];
				if (c == c_2_)
					return true;
			}
		}
		return false;
	}

	public static String method8225(byte[] is) {
		return Class344.method6118(is, 0, is.length, (byte) -114);
	}

	public static boolean method8226(byte i) {
		int i_3_ = i & 0xff;
		if (i_3_ == 0)
			return false;
		if (i_3_ >= 128 && i_3_ < 160 && '\0' == aCharArray5766[i_3_ - 128])
			return false;
		return true;
	}

	public static byte[] method8227(CharSequence charsequence) {
		int i = charsequence.length();
		byte[] is = new byte[i];
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			char c = charsequence.charAt(i_4_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_4_] = (byte) c;
			else if (c == '\u20ac')
				is[i_4_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_4_] = (byte) -126;
			else if (c == '\u0192')
				is[i_4_] = (byte) -125;
			else if (c == '\u201e')
				is[i_4_] = (byte) -124;
			else if (c == '\u2026')
				is[i_4_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_4_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_4_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_4_] = (byte) -120;
			else if (c == '\u2030')
				is[i_4_] = (byte) -119;
			else if (c == '\u0160')
				is[i_4_] = (byte) -118;
			else if (c == '\u2039')
				is[i_4_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_4_] = (byte) -116;
			else if (c == '\u017d')
				is[i_4_] = (byte) -114;
			else if (c == '\u2018')
				is[i_4_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_4_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_4_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_4_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_4_] = (byte) -107;
			else if (c == '\u2013')
				is[i_4_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_4_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_4_] = (byte) -104;
			else if (c == '\u2122')
				is[i_4_] = (byte) -103;
			else if (c == '\u0161')
				is[i_4_] = (byte) -102;
			else if (c == '\u203a')
				is[i_4_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_4_] = (byte) -100;
			else if (c == '\u017e')
				is[i_4_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_4_] = (byte) -97;
			else
				is[i_4_] = (byte) 63;
		}
		return is;
	}

	public static char method8228(byte i) {
		int i_5_ = i & 0xff;
		if (0 == i_5_)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_5_, 16)).toString());
		if (i_5_ >= 128 && i_5_ < 160) {
			int i_6_ = aCharArray5766[i_5_ - 128];
			if (0 == i_6_)
				i_6_ = 63;
			i_5_ = i_6_;
		}
		return (char) i_5_;
	}

	public static String method8229(byte[] is, int i, int i_7_) {
		char[] cs = new char[i_7_];
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
			int i_10_ = is[i_9_ + i] & 0xff;
			if (i_10_ != 0) {
				if (i_10_ >= 128 && i_10_ < 160) {
					int i_11_ = aCharArray5766[i_10_ - 128];
					if (i_11_ == 0)
						i_11_ = 63;
					i_10_ = i_11_;
				}
				cs[i_8_++] = (char) i_10_;
			}
		}
		return new String(cs, 0, i_8_);
	}

	public static byte[] method8230(CharSequence charsequence) {
		int i = charsequence.length();
		byte[] is = new byte[i];
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			char c = charsequence.charAt(i_12_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_12_] = (byte) c;
			else if (c == '\u20ac')
				is[i_12_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_12_] = (byte) -126;
			else if (c == '\u0192')
				is[i_12_] = (byte) -125;
			else if (c == '\u201e')
				is[i_12_] = (byte) -124;
			else if (c == '\u2026')
				is[i_12_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_12_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_12_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_12_] = (byte) -120;
			else if (c == '\u2030')
				is[i_12_] = (byte) -119;
			else if (c == '\u0160')
				is[i_12_] = (byte) -118;
			else if (c == '\u2039')
				is[i_12_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_12_] = (byte) -116;
			else if (c == '\u017d')
				is[i_12_] = (byte) -114;
			else if (c == '\u2018')
				is[i_12_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_12_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_12_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_12_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_12_] = (byte) -107;
			else if (c == '\u2013')
				is[i_12_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_12_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_12_] = (byte) -104;
			else if (c == '\u2122')
				is[i_12_] = (byte) -103;
			else if (c == '\u0161')
				is[i_12_] = (byte) -102;
			else if (c == '\u203a')
				is[i_12_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_12_] = (byte) -100;
			else if (c == '\u017e')
				is[i_12_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_12_] = (byte) -97;
			else
				is[i_12_] = (byte) 63;
		}
		return is;
	}

	public static byte[] method8231(CharSequence charsequence) {
		int i = charsequence.length();
		byte[] is = new byte[i];
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			char c = charsequence.charAt(i_13_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_13_] = (byte) c;
			else if (c == '\u20ac')
				is[i_13_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_13_] = (byte) -126;
			else if (c == '\u0192')
				is[i_13_] = (byte) -125;
			else if (c == '\u201e')
				is[i_13_] = (byte) -124;
			else if (c == '\u2026')
				is[i_13_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_13_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_13_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_13_] = (byte) -120;
			else if (c == '\u2030')
				is[i_13_] = (byte) -119;
			else if (c == '\u0160')
				is[i_13_] = (byte) -118;
			else if (c == '\u2039')
				is[i_13_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_13_] = (byte) -116;
			else if (c == '\u017d')
				is[i_13_] = (byte) -114;
			else if (c == '\u2018')
				is[i_13_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_13_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_13_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_13_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_13_] = (byte) -107;
			else if (c == '\u2013')
				is[i_13_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_13_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_13_] = (byte) -104;
			else if (c == '\u2122')
				is[i_13_] = (byte) -103;
			else if (c == '\u0161')
				is[i_13_] = (byte) -102;
			else if (c == '\u203a')
				is[i_13_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_13_] = (byte) -100;
			else if (c == '\u017e')
				is[i_13_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_13_] = (byte) -97;
			else
				is[i_13_] = (byte) 63;
		}
		return is;
	}

	public static byte[] method8232(CharSequence charsequence) {
		int i = charsequence.length();
		byte[] is = new byte[i];
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
			char c = charsequence.charAt(i_14_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_14_] = (byte) c;
			else if (c == '\u20ac')
				is[i_14_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_14_] = (byte) -126;
			else if (c == '\u0192')
				is[i_14_] = (byte) -125;
			else if (c == '\u201e')
				is[i_14_] = (byte) -124;
			else if (c == '\u2026')
				is[i_14_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_14_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_14_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_14_] = (byte) -120;
			else if (c == '\u2030')
				is[i_14_] = (byte) -119;
			else if (c == '\u0160')
				is[i_14_] = (byte) -118;
			else if (c == '\u2039')
				is[i_14_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_14_] = (byte) -116;
			else if (c == '\u017d')
				is[i_14_] = (byte) -114;
			else if (c == '\u2018')
				is[i_14_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_14_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_14_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_14_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_14_] = (byte) -107;
			else if (c == '\u2013')
				is[i_14_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_14_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_14_] = (byte) -104;
			else if (c == '\u2122')
				is[i_14_] = (byte) -103;
			else if (c == '\u0161')
				is[i_14_] = (byte) -102;
			else if (c == '\u203a')
				is[i_14_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_14_] = (byte) -100;
			else if (c == '\u017e')
				is[i_14_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_14_] = (byte) -97;
			else
				is[i_14_] = (byte) 63;
		}
		return is;
	}

	public static char method8233(byte i) {
		int i_15_ = i & 0xff;
		if (0 == i_15_)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_15_, 16)).toString());
		if (i_15_ >= 128 && i_15_ < 160) {
			int i_16_ = aCharArray5766[i_15_ - 128];
			if (0 == i_16_)
				i_16_ = 63;
			i_15_ = i_16_;
		}
		return (char) i_15_;
	}

	public static int method8234(CharSequence charsequence, int i, int i_17_, byte[] is, int i_18_) {
		int i_19_ = i_17_ - i;
		for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
			char c = charsequence.charAt(i + i_20_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_20_ + i_18_] = (byte) c;
			else if ('\u20ac' == c)
				is[i_20_ + i_18_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_18_ + i_20_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_18_ + i_20_] = (byte) -125;
			else if ('\u201e' == c)
				is[i_20_ + i_18_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_18_ + i_20_] = (byte) -123;
			else if (c == '\u2020')
				is[i_18_ + i_20_] = (byte) -122;
			else if (c == '\u2021')
				is[i_20_ + i_18_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_18_ + i_20_] = (byte) -120;
			else if (c == '\u2030')
				is[i_20_ + i_18_] = (byte) -119;
			else if ('\u0160' == c)
				is[i_20_ + i_18_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_20_ + i_18_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_20_ + i_18_] = (byte) -116;
			else if (c == '\u017d')
				is[i_18_ + i_20_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_20_ + i_18_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_20_ + i_18_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_20_ + i_18_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_18_ + i_20_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_20_ + i_18_] = (byte) -107;
			else if (c == '\u2013')
				is[i_20_ + i_18_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_20_ + i_18_] = (byte) -105;
			else if (c == '\u02dc')
				is[i_18_ + i_20_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_20_ + i_18_] = (byte) -103;
			else if ('\u0161' == c)
				is[i_18_ + i_20_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_18_ + i_20_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_18_ + i_20_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_18_ + i_20_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_18_ + i_20_] = (byte) -97;
			else
				is[i_18_ + i_20_] = (byte) 63;
		}
		return i_19_;
	}

	public static String method8235(byte[] is) {
		return Class344.method6118(is, 0, is.length, (byte) -111);
	}

	Class490() throws Throwable {
		throw new Error();
	}

	public static byte[] method8236(CharSequence charsequence) {
		int i = charsequence.length();
		byte[] is = new byte[i];
		for (int i_21_ = 0; i_21_ < i; i_21_++) {
			char c = charsequence.charAt(i_21_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_21_] = (byte) c;
			else if (c == '\u20ac')
				is[i_21_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_21_] = (byte) -126;
			else if (c == '\u0192')
				is[i_21_] = (byte) -125;
			else if (c == '\u201e')
				is[i_21_] = (byte) -124;
			else if (c == '\u2026')
				is[i_21_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_21_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_21_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_21_] = (byte) -120;
			else if (c == '\u2030')
				is[i_21_] = (byte) -119;
			else if (c == '\u0160')
				is[i_21_] = (byte) -118;
			else if (c == '\u2039')
				is[i_21_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_21_] = (byte) -116;
			else if (c == '\u017d')
				is[i_21_] = (byte) -114;
			else if (c == '\u2018')
				is[i_21_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_21_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_21_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_21_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_21_] = (byte) -107;
			else if (c == '\u2013')
				is[i_21_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_21_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_21_] = (byte) -104;
			else if (c == '\u2122')
				is[i_21_] = (byte) -103;
			else if (c == '\u0161')
				is[i_21_] = (byte) -102;
			else if (c == '\u203a')
				is[i_21_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_21_] = (byte) -100;
			else if (c == '\u017e')
				is[i_21_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_21_] = (byte) -97;
			else
				is[i_21_] = (byte) 63;
		}
		return is;
	}
}
