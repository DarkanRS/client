public class Class456_Sub3 extends Animation {

	public boolean aBool7891 = false;
	Animable aClass521_Sub1_Sub1_Sub2_7892;

	void method7586(AnimationDefinitions animationdefinitions_1, int i_2, int i_3) {
		if (!this.aBool7891 || !this.aClass521_Sub1_Sub1_Sub2_7892.currentAnimation.hasDefs() || this.aClass521_Sub1_Sub1_Sub2_7892.currentAnimation.hasSpeed(801437187)) {
			Class213.method3662(animationdefinitions_1, i_2, this.aClass521_Sub1_Sub1_Sub2_7892, (short) 255);
		}

	}

	Class456_Sub3(Animable animable_1, boolean bool_2) {
		super(bool_2);
		this.aClass521_Sub1_Sub1_Sub2_7892 = animable_1;
	}

	public static String[] method12681(String string_0, char var_1, int i_2) {
		int i_3 = Class149.method2565(string_0, var_1, -2112641652);
		String[] arr_4 = new String[i_3 + 1];
		int i_5 = 0;
		int i_6 = 0;

		for (int i_7 = 0; i_7 < i_3; i_7++) {
			int i_8;
			for (i_8 = i_6; string_0.charAt(i_8) != var_1; i_8++) {
				;
			}

			arr_4[i_5++] = string_0.substring(i_6, i_8);
			i_6 = i_8 + 1;
		}

		arr_4[i_3] = string_0.substring(i_6);
		return arr_4;
	}

	public static boolean method12682(int i_0, int[] ints_1, int i_2) {
		if (WorldMapIndexLoader.aBoolArray2709[i_0]) {
			return true;
		} else {
			Class468_Sub8.aClass98Array7889[i_0] = Class288.getInterface(i_0, ints_1, Class468_Sub8.aClass98Array7889[i_0], false, (byte) -15);
			if (Class468_Sub8.aClass98Array7889[i_0] == null) {
				return false;
			} else {
				WorldMapIndexLoader.aBoolArray2709[i_0] = true;
				return true;
			}
		}
	}

}
