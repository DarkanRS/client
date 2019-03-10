public class Class222 implements Interface17 {

	int anInt2764;

	int anInt2765;

	public boolean method129(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		for (int i_5 = 0; i_5 < i_3 && i_5 < arr_2.length; i_5++) {
			KeyRecord interface16_6 = arr_2[i_5];
			if (interface16_6 != null && interface16_6.method92(317240429) == -954825461 * this.anInt2764 * -1837752669 && interface16_6.method125(2136691793) == 534615765 * this.anInt2765 * 593031805) {
				return true;
			}
		}
		return false;
	}

	public boolean method127(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4, byte b_5) {
		for (int i_6 = 0; i_6 < i_3 && i_6 < arr_2.length; i_6++) {
			KeyRecord interface16_7 = arr_2[i_6];
			if (interface16_7 != null && interface16_7.method92(317240429) == this.anInt2764 && interface16_7.method125(938641210) == this.anInt2765) {
				return true;
			}
		}
		return false;
	}

	public boolean method128(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		for (int i_5 = 0; i_5 < i_3 && i_5 < arr_2.length; i_5++) {
			KeyRecord interface16_6 = arr_2[i_5];
			if (interface16_6 != null && interface16_6.method92(317240429) == -954825461 * this.anInt2764 * -1837752669 && interface16_6.method125(898626927) == 534615765 * this.anInt2765 * 593031805) {
				return true;
			}
		}
		return false;
	}

	Class222(int i_1, int i_2) {
		this.anInt2764 = i_1;
		this.anInt2765 = i_2;
	}

	public boolean method126(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		for (int i_5 = 0; i_5 < i_3 && i_5 < arr_2.length; i_5++) {
			KeyRecord interface16_6 = arr_2[i_5];
			if (interface16_6 != null && interface16_6.method92(317240429) == -954825461 * this.anInt2764 * -1837752669 && interface16_6.method125(1229951069) == 534615765 * this.anInt2765 * 593031805) {
				return true;
			}
		}
		return false;
	}

	static String method3754(CharSequence charsequence_0, Class413 class413_1, int i_2) {
		if (charsequence_0 == null) {
			return null;
		} else {
			int i_3 = 0;
			int i_4;
			for (i_4 = charsequence_0.length(); i_3 < i_4 && SoftwareItemRender.method7035(charsequence_0.charAt(i_3), 1817858874); i_3++) {
				;
			}
			while (i_4 > i_3 && SoftwareItemRender.method7035(charsequence_0.charAt(i_4 - 1), 1764637813)) {
				--i_4;
			}
			int i_5 = i_4 - i_3;
			if (i_5 >= 1 && i_5 <= Class78.method1386(class413_1, -1795366239)) {
				StringBuilder stringbuilder_6 = new StringBuilder(i_5);
				for (int i_7 = i_3; i_7 < i_4; i_7++) {
					char var_8 = charsequence_0.charAt(i_7);
					if (JS5Manager.method5491(var_8, 1531464997)) {
						char var_9 = ParamDefinitionsLoader.method7080(var_8, -1416509112);
						if (var_9 != 0) {
							stringbuilder_6.append(var_9);
						}
					}
				}
				if (stringbuilder_6.length() == 0) {
					return null;
				} else {
					return stringbuilder_6.toString();
				}
			} else {
				return null;
			}
		}
	}

	public static int method3756(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, byte b_6) {
		if ((i_5 & 0x1) == 1) {
			int i_7 = i_3;
			i_3 = i_4;
			i_4 = i_7;
		}
		i_2 &= 0x3;
		return i_2 == 0 ? i_0 : (i_2 == 1 ? i_1 : (i_2 == 2 ? 7 - i_0 - (i_3 - 1) : 7 - i_1 - (i_4 - 1)));
	}
}
