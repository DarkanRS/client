package com.rs.jagex;

public class Class272 {

	static int UPDATE_ZONE_PLANE;

	static boolean method4841(CharSequence charsequence_0) {
		if (false)
			throw new IllegalArgumentException("10");
		boolean bool_4 = false;
		boolean bool_5 = false;
		int i_6 = 0;
		int i_7 = charsequence_0.length();
		for (int i_8 = 0; i_8 < i_7; i_8++) {
			char var_9 = charsequence_0.charAt(i_8);
			if (i_8 == 0) {
				if (var_9 == 45) {
					bool_4 = true;
					continue;
				}
				if (var_9 == 43)
					continue;
			}
			int i_11;
			if (var_9 >= 48 && var_9 <= 57)
				i_11 = var_9 - 48;
			else if (var_9 >= 65 && var_9 <= 90)
				i_11 = var_9 - 55;
			else {
				if (var_9 < 97 || var_9 > 122)
					return false;
				i_11 = var_9 - 87;
			}
			if (i_11 >= 10)
				return false;
			if (bool_4)
				i_11 = -i_11;
			int i_10 = i_11 + i_6 * 10;
			if (i_10 / 10 != i_6)
				return false;
			i_6 = i_10;
			bool_5 = true;
		}
		return bool_5;
	}

	public static int stringToInt(CharSequence charsequence_0) {
		int i_2 = charsequence_0.length();
		int i_3 = 0;
		for (int i_4 = 0; i_4 < i_2; i_4++)
			i_3 = (i_3 << 5) - i_3 + charsequence_0.charAt(i_4);
		return i_3;
	}

	Class272() throws Throwable {
		throw new Error();
	}
}
