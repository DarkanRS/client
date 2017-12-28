/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class208 {
	public Class521_Sub1_Sub1 aClass521_Sub1_Sub1_2659;
	public Class208 aClass208_2660;
	static int anInt2661 = 0;
	static int anInt2662;

	static Class208 method3559(Class521_Sub1_Sub1 class521_sub1_sub1) {
		Class208 class208;
		if (null == Class507.aClass208_5860)
			class208 = new Class208();
		else {
			class208 = Class507.aClass208_5860;
			Class507.aClass208_5860 = Class507.aClass208_5860.aClass208_2660;
			class208.aClass208_2660 = null;
			anInt2661 -= -257363711;
		}
		class208.aClass521_Sub1_Sub1_2659 = class521_sub1_sub1;
		return class208;
	}

	void method3560(int i) {
		if (anInt2661 * 1899499265 < 500) {
			aClass521_Sub1_Sub1_2659 = null;
			aClass208_2660 = Class507.aClass208_5860;
			Class507.aClass208_5860 = this;
			anInt2661 += -257363711;
		}
	}

	Class208() {
		/* empty */
	}

	static final void method3561(Class527 class527, int i) {
		Class513 class513 = (((Class527) class527).aBool7022 ? ((Class527) class527).aClass513_6994 : ((Class527) class527).aClass513_7007);
		Class118 class118 = ((Class513) class513).aClass118_5886;
		Class98 class98 = ((Class513) class513).aClass98_5885;
		Class125.method2170(class118, class98, class527, 809860903);
	}

	static final void method3562(Class527 class527, byte i) {
		((Class527) class527).anInt7012 -= 425673003;
		int i_0_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		int i_1_ = (((Class527) class527).anIntArray6999[1 + ((Class527) class527).anInt7012 * 1942118537]);
		int i_2_ = (((Class527) class527).anIntArray6999[2 + 1942118537 * ((Class527) class527).anInt7012]);
		Class96_Sub10.method14603(3, i_0_ << 16 | i_1_, i_2_, "", (byte) 66);
	}
}
