
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

}
