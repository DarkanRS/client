
public class Utils {

	public static char cp1252ToChar(byte b) {
		int val = b & 0xff;
		if (val == 0) {
			throw new IllegalArgumentException("" + Integer.toString(val, 16));
		} else {
			if (val >= 128 && val < 160) {
				char charValue = Class490.aCharArray5766[val - 128];
				if (charValue == 0) {
					charValue = 63;
				}
				val = charValue;
			}
			return (char) val;
		}
	}

	public static String readString(byte[] bytes_0, int i_1, int i_2) {
	    char[] arr_4 = new char[i_2];
	    int i_5 = 0;
	    for (int i_6 = 0; i_6 < i_2; i_6++) {
	        int i_7 = bytes_0[i_6 + i_1] & 0xff;
	        if (i_7 != 0) {
	            if (i_7 >= 128 && i_7 < 160) {
	                char var_8 = Class490.aCharArray5766[i_7 - 128];
	                if (var_8 == 0) {
	                    var_8 = 63;
	                }
	                i_7 = var_8;
	            }
	            arr_4[i_5++] = (char) i_7;
	        }
	    }
	    return new String(arr_4, 0, i_5);
	}

	public static int stringLengthPlus2(String string_0) {
		return string_0.length() + 2;
	}

	static int calculateKerning(byte[][] bytes_0, byte[][] bytes_1, int[] ints_2, byte[] bytes_3, int[] ints_4, int i_5, int i_6) {
		int i_8 = ints_2[i_5];
		int i_9 = i_8 + ints_4[i_5];
		int i_10 = ints_2[i_6];
		int i_11 = i_10 + ints_4[i_6];
		int i_12 = i_8;
		if (i_10 > i_8) {
			i_12 = i_10;
		}
		int i_13 = i_9;
		if (i_11 < i_9) {
			i_13 = i_11;
		}
		int i_14 = bytes_3[i_5] & 0xff;
		if ((bytes_3[i_6] & 0xff) < i_14) {
			i_14 = bytes_3[i_6] & 0xff;
		}
		byte[] bytes_15 = bytes_1[i_5];
		byte[] bytes_16 = bytes_0[i_6];
		int i_17 = i_12 - i_8;
		int i_18 = i_12 - i_10;
		for (int i_19 = i_12; i_19 < i_13; i_19++) {
			int i_20 = bytes_15[i_17++] + bytes_16[i_18++];
			if (i_20 < i_14) {
				i_14 = i_20;
			}
		}
		return -i_14;
	}

	public static int nextPowerOfTwo(int i_0) {
		--i_0;
		i_0 |= i_0 >>> 1;
		i_0 |= i_0 >>> 2;
		i_0 |= i_0 >>> 4;
		i_0 |= i_0 >>> 8;
		i_0 |= i_0 >>> 16;
		return i_0 + 1;
	}

	public static String rgbToColHexShortcut(int i_0) {
		return "<col=" + Integer.toHexString(i_0) + ">";
	}

	public static final synchronized long time() {
	    long long_1 = System.currentTimeMillis();
	    if (long_1 < Class97.aLong993) {
	        Class97.aLong994 += Class97.aLong993 - long_1;
	    }
	    Class97.aLong993 = long_1;
	    return long_1 + Class97.aLong994;
	}

	public static int parseInt(CharSequence charsequence_0) {
		return parseInt(charsequence_0, 10);
	}

	static int parseInt(CharSequence charsequence_0, int i_1) {
		if (i_1 >= 2 && i_1 <= 36) {
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
					if (var_9 == 43) {
						continue;
					}
				}
				int i_11;
				if (var_9 >= 48 && var_9 <= 57) {
					i_11 = var_9 - 48;
				} else if (var_9 >= 65 && var_9 <= 90) {
					i_11 = var_9 - 55;
				} else {
					if (var_9 < 97 || var_9 > 122) {
						throw new NumberFormatException();
					}
					i_11 = var_9 - 87;
				}
				if (i_11 >= i_1) {
					throw new NumberFormatException();
				}
				if (bool_4) {
					i_11 = -i_11;
				}
				int i_10 = i_11 + i_6 * i_1;
				if (i_10 / i_1 != i_6) {
					throw new NumberFormatException();
				}
				i_6 = i_10;
				bool_5 = true;
			}
			if (!bool_5) {
				throw new NumberFormatException();
			} else {
				return i_6;
			}
		} else {
			throw new IllegalArgumentException("" + i_1);
		}
	}

	public static String getStringFromLong(long long_0) {
	    if (long_0 > 0L && long_0 < 6582952005840035281L) {
	        if (long_0 % 37L == 0L) {
	            return null;
	        } else {
	            int i_2 = 0;
	            for (long long_3 = long_0; long_3 != 0L; long_3 /= 37L) {
	                ++i_2;
	            }
	            StringBuilder stringbuilder_6 = new StringBuilder(i_2);
	            while (long_0 != 0L) {
	                long long_4 = long_0;
	                long_0 /= 37L;
	                stringbuilder_6.append(Class500.aCharArray5825[(int) (long_4 - 37L * long_0)]);
	            }
	            return stringbuilder_6.reverse().toString();
	        }
	    } else {
	        return null;
	    }
	}

}
