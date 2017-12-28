/* Class456_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class456_Sub3 extends Class456 {
	public boolean aBool7891 = false;
	Animable aClass521_Sub1_Sub1_Sub2_7892;

	void method7594(Class518 class518, int i) {
		if (!aBool7891 || !((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7564(1272009199) || ((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7573(1318562485))
			Class213.method3662(class518, i, (((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892), (short) 255);
	}

	void method7586(Class518 class518, int i, int i_0_) {
		if (!aBool7891 || !((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7564(-1618819978) || ((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7573(801437187))
			Class213.method3662(class518, i, (((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892), (short) 255);
	}

	void method7626(Class518 class518, int i) {
		if (!aBool7891 || !((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7564(1000836234) || ((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7573(-549565826))
			Class213.method3662(class518, i, (((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892), (short) 255);
	}

	void method7590(Class518 class518, int i) {
		if (!aBool7891 || !((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7564(1096922104) || ((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7573(-725189738))
			Class213.method3662(class518, i, (((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892), (short) 255);
	}

	Class456_Sub3(Animable class521_sub1_sub1_sub2, boolean bool) {
		super(bool);
		((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892 = class521_sub1_sub1_sub2;
	}

	void method7592(Class518 class518, int i) {
		if (!aBool7891 || !((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7564(2146617063) || ((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7573(-1145488982))
			Class213.method3662(class518, i, (((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892), (short) 255);
	}

	void method7616(Class518 class518, int i) {
		if (!aBool7891 || !((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7564(477929542) || ((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7573(-490019953))
			Class213.method3662(class518, i, (((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892), (short) 255);
	}

	void method7591(Class518 class518, int i) {
		if (!aBool7891 || !((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7564(1197361181) || ((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892.aClass456_10338.method7573(1770445904))
			Class213.method3662(class518, i, (((Class456_Sub3) this).aClass521_Sub1_Sub1_Sub2_7892), (short) 255);
	}

	public static String[] method12681(String string, char c, int i) {
		int i_1_ = Class149.method2565(string, c, -2112641652);
		String[] strings = new String[i_1_ + 1];
		int i_2_ = 0;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
			int i_5_;
			for (i_5_ = i_3_; string.charAt(i_5_) != c; i_5_++) {
				/* empty */
			}
			strings[i_2_++] = string.substring(i_3_, i_5_);
			i_3_ = i_5_ + 1;
		}
		strings[i_1_] = string.substring(i_3_);
		return strings;
	}

	public static boolean method12682(int i, int[] is, int i_6_) {
		if (Class218.aBoolArray2709[i])
			return true;
		Class468_Sub8.aClass98Array7889[i] = Class288.method5084(i, is, Class468_Sub8.aClass98Array7889[i], false, (byte) -15);
		if (null == Class468_Sub8.aClass98Array7889[i])
			return false;
		Class218.aBoolArray2709[i] = true;
		return true;
	}
}
