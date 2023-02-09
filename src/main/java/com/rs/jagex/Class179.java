package com.rs.jagex;

public class Class179 {

	static int anInt2222;
	static int anInt2230;
	static long aLong2232;
	static int anInt2227;
	static int anInt2223;
	static String aString2225 = "";
	static int anInt2226;
	static int anInt2220;
	static int anInt2221;
	static boolean aBool2229;
	static int anInt2231 = -1;

	public static String method3018(long long_0) {
		if ((long_0 <= 0L) || (long_0 >= 6582952005840035281L))
			return null;
		if (long_0 % 37L == 0L)
			return null;
		else {
			int i_2 = 0;
			for (long long_3 = long_0; long_3 != 0L; long_3 /= 37L)
				++i_2;
			char var_6;
			StringBuilder stringbuilder_8;
			for (stringbuilder_8 = new StringBuilder(i_2); long_0 != 0L; stringbuilder_8.append(var_6)) {
				long long_4 = long_0;
				long_0 /= 37L;
				var_6 = Class500.aCharArray5825[(int) (long_4 - 37L * long_0)];
				if (var_6 == 95) {
					int i_7 = stringbuilder_8.length() - 1;
					stringbuilder_8.setCharAt(i_7, Character.toUpperCase(stringbuilder_8.charAt(i_7)));
					var_6 = 160;
				}
			}
			stringbuilder_8.reverse();
			stringbuilder_8.setCharAt(0, Character.toUpperCase(stringbuilder_8.charAt(0)));
			return stringbuilder_8.toString();
		}
	}

	public static int method3019(int i_0) {
		i_0 = (i_0 & 0x55555555) + (i_0 >>> 1 & 0x55555555);
		i_0 = (i_0 >>> 2 & 0x33333333) + (i_0 & 0x33333333);
		i_0 = i_0 + (i_0 >>> 4) & 0xf0f0f0f;
		i_0 += i_0 >>> 8;
		i_0 += i_0 >>> 16;
		return i_0 & 0xff;
	}

	Class179() throws Throwable {
		throw new Error();
	}
}
