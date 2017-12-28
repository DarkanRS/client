
/* Class495 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Locale;

public class Class495 implements Interface43 {
	public static Class495 aClass495_5795 = new Class495("EN", "en", "English", Class496.aClass496_5813, 0, "GB");
	static Class495[] aClass495Array5796;
	public static Class495 aClass495_5797;
	public static final int anInt5798 = 6;
	static Class495 aClass495_5799;
	public static Class495 aClass495_5800;
	public static Class495 aClass495_5801;
	public static Class495 aClass495_5802 = new Class495("DE", "de", "German", Class496.aClass496_5813, 1, "DE");
	String aString5803;
	int anInt5804;
	Locale aLocale5805;
	String aString5806;

	public int method75() {
		return -1324357023 * ((Class495) this).anInt5804;
	}

	Class495(String string, String string_0_, String string_1_, Class496 class496, int i, String string_2_) {
		((Class495) this).aString5806 = string;
		((Class495) this).aString5803 = string_0_;
		((Class495) this).anInt5804 = 411974049 * i;
		Locale locale = null;
		if (string_2_ != null)
			locale = new Locale(method8276(1011487553), string_2_);
		if (locale != null)
			((Class495) this).aLocale5805 = locale;
		else
			((Class495) this).aLocale5805 = new Locale(method8276(1390953905));
	}

	public String method8276(int i) {
		return ((Class495) this).aString5803;
	}

	static final void method8277(Class118 class118, Class98 class98, Class527 class527, int i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1293603558) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1278 = Class351.method6193(string, class527, -34782350);
		class118.aBool1384 = true;
	}

	public int method243(byte i) {
		return -1324357023 * ((Class495) this).anInt5804;
	}

	public static Class495 method8278(int i, int i_3_) {
		if (i < 0 || i >= aClass495Array5796.length)
			return null;
		return aClass495Array5796[i];
	}

	public String toString() {
		return method8276(1589376579).toLowerCase(Locale.ENGLISH);
	}

	static {
		aClass495_5801 = new Class495("FR", "fr", "French", Class496.aClass496_5813, 2, "FR");
		aClass495_5797 = new Class495("PT", "pt", "Portuguese", Class496.aClass496_5813, 3, "BR");
		aClass495_5799 = new Class495("NL", "nl", "Dutch", Class496.aClass496_5807, 4, "NL");
		aClass495_5800 = new Class495("ES", "es", "Spanish", Class496.aClass496_5807, 5, "ES");
		Class495[] class495s = method8294(135762264);
		aClass495Array5796 = new Class495[class495s.length];
		Class495[] class495s_4_ = class495s;
		for (int i = 0; i < class495s_4_.length; i++) {
			Class495 class495 = class495s_4_[i];
			if ((aClass495Array5796[-1324357023 * ((Class495) class495).anInt5804]) != null)
				throw new IllegalStateException();
			aClass495Array5796[-1324357023 * ((Class495) class495).anInt5804] = class495;
		}
	}

	public String method8279() {
		return method8276(1871363869).toLowerCase(Locale.ENGLISH);
	}

	public String method8280() {
		return method8276(1083381343).toLowerCase(Locale.ENGLISH);
	}

	public String method8281() {
		return ((Class495) this).aString5803;
	}

	public int method76() {
		return -1324357023 * ((Class495) this).anInt5804;
	}

	public static Class495[] method8282() {
		return (new Class495[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 });
	}

	public static Class495[] method8283() {
		return (new Class495[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 });
	}

	public String method8284() {
		return ((Class495) this).aString5803;
	}

	static final void method8285(Class527 class527, int i) {
		Class513 class513 = (((Class527) class527).aBool7022 ? ((Class527) class527).aClass513_6994 : ((Class527) class527).aClass513_7007);
		Class118 class118 = ((Class513) class513).aClass118_5886;
		Class98 class98 = ((Class513) class513).aClass98_5885;
		TilestreamPacket.method6289(class118, class98, class527, (byte) 30);
	}

	public String method8286() {
		return ((Class495) this).aString5803;
	}

	public String method8287() {
		return ((Class495) this).aString5803;
	}

	public static Class495[] method8288() {
		return (new Class495[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 });
	}

	public Locale method8289() {
		return ((Class495) this).aLocale5805;
	}

	public Locale method8290() {
		return ((Class495) this).aLocale5805;
	}

	public Locale method8291() {
		return ((Class495) this).aLocale5805;
	}

	public static Class495 method8292(int i) {
		if (i < 0 || i >= aClass495Array5796.length)
			return null;
		return aClass495Array5796[i];
	}

	public Locale method8293(int i) {
		return ((Class495) this).aLocale5805;
	}

	public static Class495[] method8294(int i) {
		return (new Class495[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 });
	}

	static final void method8295(Class527 class527, int i) {
		int i_5_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_5_, (byte) 65);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_5_ >> 16];
		Class96_Sub18.method14664(class118, class98, true, 0, class527, (byte) -3);
	}

	static final void method8296(Class527 class527, byte i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		Class184 class184 = Class468_Sub20.method12807(-625511967);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4541, class184.aClass432_2283, 103463045);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i_6_ = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(((Class527) class527).aClass346_7009.anInt4048 * -624100047, 1417031095);
		((Class527) class527).aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, ((Class527) class527).aClass346_7009.anIntArray4046, -1485943767);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i_6_), 460016164);
		class184.method3049(class282_sub23, 1428748072);
	}

	static final void method8297(Class527 class527, byte i) {
		if (Class96_Sub21.aClass199_9438.method3236(81, -2091776550))
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method8298(Class527 class527, byte i) {
		Class513 class513;
		if (((Class527) class527).aBool7022) {
			if (i != -1) {
				for (;;) {
					/* empty */
				}
			}
			class513 = ((Class527) class527).aClass513_6994;
		} else
			class513 = ((Class527) class527).aClass513_7007;
		Class513 class513_7_ = class513;
		Class118 class118 = ((Class513) class513_7_).aClass118_5886;
		Class98 class98 = ((Class513) class513_7_).aClass98_5885;
		Class282_Sub21_Sub1.method15474(class118, class98, class527, (byte) 66);
	}
}
