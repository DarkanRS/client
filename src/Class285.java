
/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public class Class285 {
	static Stack aStack3390 = new Stack();
	public Class521_Sub1 aClass521_Sub1_3391;
	boolean aBool3392;
	Login aClass284_3393;
	public static Class8 aClass8_3394;

	public boolean method5019(Class505 class505, int i, int i_0_, int i_1_) {
		int i_2_ = aClass521_Sub1_3391.method12996(712320257);
		if (aClass521_Sub1_3391.aClass275_Sub5Array7965 != null) {
			for (int i_3_ = 0; i_3_ < aClass521_Sub1_3391.aClass275_Sub5Array7965.length; i_3_++) {
				aClass521_Sub1_3391.aClass275_Sub5Array7965[i_3_].anInt7851 <<= i_2_;
				if ((aClass521_Sub1_3391.aClass275_Sub5Array7965[i_3_].method12594((((Login) ((Class285) this).aClass284_3393).anInt3387 * -478180631) + i, i_0_ + (((Login) ((Class285) this).aClass284_3393).anInt3385) * 1607801345)) && aClass521_Sub1_3391.method12983(class505, i, i_0_, -1469833306)) {
					aClass521_Sub1_3391.aClass275_Sub5Array7965[i_3_].anInt7851 >>= i_2_;
					return true;
				}
				aClass521_Sub1_3391.aClass275_Sub5Array7965[i_3_].anInt7851 >>= i_2_;
			}
		}
		return false;
	}

	static void method5020(Class285 class285) {
		class285.aClass521_Sub1_3391 = null;
		synchronized (aStack3390) {
			if (aStack3390.size() < 200)
				aStack3390.push(class285);
		}
	}

	static void method5021(Class285 class285) {
		class285.aClass521_Sub1_3391 = null;
		synchronized (aStack3390) {
			if (aStack3390.size() < 200)
				aStack3390.push(class285);
		}
	}

	Class285() {
		/* empty */
	}

	static void method5022(Class285 class285) {
		class285.aClass521_Sub1_3391 = null;
		synchronized (aStack3390) {
			if (aStack3390.size() < 200)
				aStack3390.push(class285);
		}
	}

	public static void method5023() {
		synchronized (aStack3390) {
			aStack3390 = new Stack();
		}
	}

	static final void method5024(Class527 class527, int i) {
		int i_4_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_4_, (byte) 82);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_4_ >> 16];
		Class96_Sub18.method14664(class118, class98, false, 2, class527, (byte) 56);
	}

	public static String method5025(CharSequence charsequence, int i) {
		String string = Class179.method3018(Class366.method6302(charsequence, (byte) 18));
		if (string == null)
			string = "";
		return string;
	}

	public static int method5026(CharSequence charsequence, int i, byte i_5_) {
		return Class356.method6225(charsequence, i, true, 2038427942);
	}

	static final void method5027(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		Class117.method1978((((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]), (((Class527) class527).anIntArray6999[1 + (1942118537 * ((Class527) class527).anInt7012)]), 255, (byte) 1);
	}

	public static int method5028(byte[] is, int i, short i_6_) {
		return Class455.method7559(is, 0, i, -788702725);
	}

	static final void method5029(Class527 class527, short i) {
		Class513 class513 = (((Class527) class527).aBool7022 ? ((Class527) class527).aClass513_6994 : ((Class527) class527).aClass513_7007);
		Class118 class118 = ((Class513) class513).aClass118_5886;
		Class282_Sub20_Sub4.method15207(class118, class527, -304097122);
	}
}
