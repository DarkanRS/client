/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class311 {
	static final int anInt3636 = 2;
	static final int anInt3637 = 1;
	public byte[][][] aByteArrayArrayArray3638;
	public static final int anInt3639 = 4;
	public static final int anInt3640 = 8;
	static final int anInt3641 = 16;
	public static final int anInt3642 = 2;
	public static String aString3643;
	public static int anInt3644;

	public void method5495(int i) {
		for (int i_0_ = 0; i_0_ < aByteArrayArrayArray3638.length; i_0_++) {
			for (int i_1_ = 0; i_1_ < aByteArrayArrayArray3638[0].length; i_1_++) {
				for (int i_2_ = 0; i_2_ < aByteArrayArrayArray3638[0][0].length; i_2_++)
					aByteArrayArrayArray3638[i_0_][i_1_][i_2_] = (byte) 0;
			}
		}
	}

	public void method5496() {
		for (int i = 0; i < aByteArrayArrayArray3638.length; i++) {
			for (int i_3_ = 0; i_3_ < aByteArrayArrayArray3638[0].length; i_3_++) {
				for (int i_4_ = 0; i_4_ < aByteArrayArrayArray3638[0][0].length; i_4_++)
					aByteArrayArrayArray3638[i][i_3_][i_4_] = (byte) 0;
			}
		}
	}

	public boolean method5497(int i, int i_5_, int i_6_) {
		if (i < 0 || i_5_ < 0 || i >= aByteArrayArrayArray3638[1].length || i_5_ >= aByteArrayArrayArray3638[1][i].length)
			return false;
		if ((aByteArrayArrayArray3638[1][i][i_5_] & 0x2) != 0)
			return true;
		return false;
	}

	public boolean method5498(int i, int i_7_, int i_8_, int i_9_, short i_10_) {
		if (0 != (aByteArrayArrayArray3638[0][i_8_][i_9_] & 0x2))
			return true;
		if ((aByteArrayArrayArray3638[i_7_][i_8_][i_9_] & 0x10) != 0)
			return false;
		if (method5499(i_7_, i_8_, i_9_, (short) -9790) == i)
			return true;
		return false;
	}

	int method5499(int i, int i_11_, int i_12_, short i_13_) {
		if ((aByteArrayArrayArray3638[i][i_11_][i_12_] & 0x8) != 0)
			return 0;
		if (i > 0 && (aByteArrayArrayArray3638[1][i_11_][i_12_] & 0x2) != 0)
			return i - 1;
		return i;
	}

	public Class311(int i, int i_14_, int i_15_) {
		aByteArrayArrayArray3638 = new byte[i][i_14_][i_15_];
	}

	public void method5500() {
		for (int i = 0; i < aByteArrayArrayArray3638.length; i++) {
			for (int i_16_ = 0; i_16_ < aByteArrayArrayArray3638[0].length; i_16_++) {
				for (int i_17_ = 0; i_17_ < aByteArrayArrayArray3638[0][0].length; i_17_++)
					aByteArrayArrayArray3638[i][i_16_][i_17_] = (byte) 0;
			}
		}
	}

	public void method5501() {
		for (int i = 0; i < aByteArrayArrayArray3638.length; i++) {
			for (int i_18_ = 0; i_18_ < aByteArrayArrayArray3638[0].length; i_18_++) {
				for (int i_19_ = 0; i_19_ < aByteArrayArrayArray3638[0][0].length; i_19_++)
					aByteArrayArrayArray3638[i][i_18_][i_19_] = (byte) 0;
			}
		}
	}

	int method5502(int i, int i_20_, int i_21_) {
		if ((aByteArrayArrayArray3638[i][i_20_][i_21_] & 0x8) != 0)
			return 0;
		if (i > 0 && (aByteArrayArrayArray3638[1][i_20_][i_21_] & 0x2) != 0)
			return i - 1;
		return i;
	}

	public void method5503() {
		for (int i = 0; i < aByteArrayArrayArray3638.length; i++) {
			for (int i_22_ = 0; i_22_ < aByteArrayArrayArray3638[0].length; i_22_++) {
				for (int i_23_ = 0; i_23_ < aByteArrayArrayArray3638[0][0].length; i_23_++)
					aByteArrayArrayArray3638[i][i_22_][i_23_] = (byte) 0;
			}
		}
	}

	public void method5504() {
		for (int i = 0; i < aByteArrayArrayArray3638.length; i++) {
			for (int i_24_ = 0; i_24_ < aByteArrayArrayArray3638[0].length; i_24_++) {
				for (int i_25_ = 0; i_25_ < aByteArrayArrayArray3638[0][0].length; i_25_++)
					aByteArrayArrayArray3638[i][i_24_][i_25_] = (byte) 0;
			}
		}
	}

	public boolean method5505(int i, int i_26_) {
		if (i < 0 || i_26_ < 0 || i >= aByteArrayArrayArray3638[1].length || i_26_ >= aByteArrayArrayArray3638[1][i].length)
			return false;
		if ((aByteArrayArrayArray3638[1][i][i_26_] & 0x2) != 0)
			return true;
		return false;
	}

	public boolean method5506(int i, int i_27_) {
		if (i < 0 || i_27_ < 0 || i >= aByteArrayArrayArray3638[1].length || i_27_ >= aByteArrayArrayArray3638[1][i].length)
			return false;
		if ((aByteArrayArrayArray3638[1][i][i_27_] & 0x2) != 0)
			return true;
		return false;
	}

	public boolean method5507(int i, int i_28_) {
		if (i < 0 || i_28_ < 0 || i >= aByteArrayArrayArray3638[1].length || i_28_ >= aByteArrayArrayArray3638[1][i].length)
			return false;
		if ((aByteArrayArrayArray3638[1][i][i_28_] & 0x2) != 0)
			return true;
		return false;
	}

	public boolean method5508(int i, int i_29_, int i_30_, int i_31_) {
		if (0 != (aByteArrayArrayArray3638[0][i_30_][i_31_] & 0x2))
			return true;
		if ((aByteArrayArrayArray3638[i_29_][i_30_][i_31_] & 0x10) != 0)
			return false;
		if (method5499(i_29_, i_30_, i_31_, (short) -2330) == i)
			return true;
		return false;
	}

	int method5509(int i, int i_32_, int i_33_) {
		if ((aByteArrayArrayArray3638[i][i_32_][i_33_] & 0x8) != 0)
			return 0;
		if (i > 0 && (aByteArrayArrayArray3638[1][i_32_][i_33_] & 0x2) != 0)
			return i - 1;
		return i;
	}

	public boolean method5510(int i, int i_34_) {
		if (i < 0 || i_34_ < 0 || i >= aByteArrayArrayArray3638[1].length || i_34_ >= aByteArrayArrayArray3638[1][i].length)
			return false;
		if ((aByteArrayArrayArray3638[1][i][i_34_] & 0x2) != 0)
			return true;
		return false;
	}

	static final void method5511(CS2Executor class527, int i) {
		int i_35_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_35_, (byte) 98);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_35_ >> 16];
		Class169.method2874(class118, class98, class527, (byte) 3);
	}

	static final void method5512(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class96_Sub10.method14605(class118, class527, (byte) -77);
	}

	public static void method5513(int i, int i_36_, byte i_37_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(18, (long) i_36_ << 32 | (long) i);
		class282_sub50_sub12.method14965((byte) -18);
	}
}
