/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class361 {
	static int[] anIntArray3913;
	public static int anInt3914;

	Class361() throws Throwable {
		throw new Error();
	}

	static final void method4303(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class231.method2131(class105, class119, class403, -2030984421);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pa.mb(").append(')').toString());
		}
	}

	public static int method4304(CharSequence charsequence, int i, int i_0_, byte[] is, int i_1_, byte i_2_) {
		try {
			int i_3_ = i_0_ - i;
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				char c = charsequence.charAt(i + i_4_);
				if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
					is[i_1_ + i_4_] = (byte) c;
				else if (c == '\u20ac')
					is[i_1_ + i_4_] = (byte) -128;
				else if (c == '\u201a')
					is[i_4_ + i_1_] = (byte) -126;
				else if (c == '\u0192')
					is[i_1_ + i_4_] = (byte) -125;
				else if (c == '\u201e')
					is[i_4_ + i_1_] = (byte) -124;
				else if (c == '\u2026')
					is[i_1_ + i_4_] = (byte) -123;
				else if ('\u2020' == c)
					is[i_1_ + i_4_] = (byte) -122;
				else if ('\u2021' == c)
					is[i_4_ + i_1_] = (byte) -121;
				else if ('\u02c6' == c)
					is[i_1_ + i_4_] = (byte) -120;
				else if (c == '\u2030')
					is[i_1_ + i_4_] = (byte) -119;
				else if (c == '\u0160')
					is[i_1_ + i_4_] = (byte) -118;
				else if ('\u2039' == c)
					is[i_4_ + i_1_] = (byte) -117;
				else if ('\u0152' == c)
					is[i_4_ + i_1_] = (byte) -116;
				else if ('\u017d' == c)
					is[i_1_ + i_4_] = (byte) -114;
				else if ('\u2018' == c)
					is[i_4_ + i_1_] = (byte) -111;
				else if (c == '\u2019')
					is[i_4_ + i_1_] = (byte) -110;
				else if (c == '\u201c')
					is[i_1_ + i_4_] = (byte) -109;
				else if (c == '\u201d')
					is[i_4_ + i_1_] = (byte) -108;
				else if (c == '\u2022')
					is[i_1_ + i_4_] = (byte) -107;
				else if (c == '\u2013')
					is[i_4_ + i_1_] = (byte) -106;
				else if ('\u2014' == c)
					is[i_1_ + i_4_] = (byte) -105;
				else if ('\u02dc' == c)
					is[i_4_ + i_1_] = (byte) -104;
				else if (c == '\u2122')
					is[i_4_ + i_1_] = (byte) -103;
				else if ('\u0161' == c)
					is[i_4_ + i_1_] = (byte) -102;
				else if ('\u203a' == c)
					is[i_4_ + i_1_] = (byte) -101;
				else if ('\u0153' == c)
					is[i_4_ + i_1_] = (byte) -100;
				else if ('\u017e' == c)
					is[i_1_ + i_4_] = (byte) -98;
				else if ('\u0178' == c)
					is[i_4_ + i_1_] = (byte) -97;
				else
					is[i_1_ + i_4_] = (byte) 63;
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pa.k(").append(')').toString());
		}
	}

	static void method4305(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 1]), 245040087).method4562(Class128.aClass148_6331, -1717639697) ? 1 : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pa.j(").append(')').toString());
		}
	}

	static void method4306(String[] strings, int[] is, int i, int i_5_, int i_6_) {
		try {
			if (i < i_5_) {
				int i_7_ = (i_5_ + i) / 2;
				int i_8_ = i;
				String string = strings[i_7_];
				strings[i_7_] = strings[i_5_];
				strings[i_5_] = string;
				int i_9_ = is[i_7_];
				is[i_7_] = is[i_5_];
				is[i_5_] = i_9_;
				for (int i_10_ = i; i_10_ < i_5_; i_10_++) {
					if (null == string || (null != strings[i_10_] && strings[i_10_].compareTo(string) < (i_10_ & 0x1))) {
						String string_11_ = strings[i_10_];
						strings[i_10_] = strings[i_8_];
						strings[i_8_] = string_11_;
						int i_12_ = is[i_10_];
						is[i_10_] = is[i_8_];
						is[i_8_++] = i_12_;
					}
				}
				strings[i_5_] = strings[i_8_];
				strings[i_8_] = string;
				is[i_5_] = is[i_8_];
				is[i_8_] = i_9_;
				method4306(strings, is, i, i_8_ - 1, 31286072);
				method4306(strings, is, 1 + i_8_, i_5_, 31286072);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pa.p(").append(')').toString());
		}
	}
}
