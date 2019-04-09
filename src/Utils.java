
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

}
