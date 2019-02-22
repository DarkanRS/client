
/* Class495 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Locale;

public class XLanguage implements Interface43 {
	public static XLanguage aClass495_5795 = new XLanguage("EN", "en", "English", Class496.aClass496_5813, 0, "GB");
	static XLanguage[] aClass495Array5796;
	public static XLanguage aClass495_5797;
	public static final int anInt5798 = 6;
	static XLanguage aClass495_5799;
	public static XLanguage aClass495_5800;
	public static XLanguage aClass495_5801;
	public static XLanguage aClass495_5802 = new XLanguage("DE", "de", "German", Class496.aClass496_5813, 1, "DE");
	String aString5803;
	int anInt5804;
	Locale aLocale5805;
	String aString5806;

	public int method75() {
		return -1324357023 * ((XLanguage) this).anInt5804;
	}

	XLanguage(String string, String string_0_, String string_1_, Class496 class496, int i, String string_2_) {
		((XLanguage) this).aString5806 = string;
		((XLanguage) this).aString5803 = string_0_;
		((XLanguage) this).anInt5804 = 411974049 * i;
		Locale locale = null;
		if (string_2_ != null)
			locale = new Locale(method8276(1011487553), string_2_);
		if (locale != null)
			((XLanguage) this).aLocale5805 = locale;
		else
			((XLanguage) this).aLocale5805 = new Locale(method8276(1390953905));
	}

	public String method8276(int i) {
		return ((XLanguage) this).aString5803;
	}

	static final void method8277(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1293603558) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1278 = Class351.method6193(string, class527, -34782350);
		class118.aBool1384 = true;
	}

	public int method243(byte i) {
		return -1324357023 * ((XLanguage) this).anInt5804;
	}

	public static XLanguage method8278(int i, int i_3_) {
		if (i < 0 || i >= aClass495Array5796.length)
			return null;
		return aClass495Array5796[i];
	}

	public String toString() {
		return method8276(1589376579).toLowerCase(Locale.ENGLISH);
	}

	static {
		aClass495_5801 = new XLanguage("FR", "fr", "French", Class496.aClass496_5813, 2, "FR");
		aClass495_5797 = new XLanguage("PT", "pt", "Portuguese", Class496.aClass496_5813, 3, "BR");
		aClass495_5799 = new XLanguage("NL", "nl", "Dutch", Class496.aClass496_5807, 4, "NL");
		aClass495_5800 = new XLanguage("ES", "es", "Spanish", Class496.aClass496_5807, 5, "ES");
		XLanguage[] class495s = method8294(135762264);
		aClass495Array5796 = new XLanguage[class495s.length];
		XLanguage[] class495s_4_ = class495s;
		for (int i = 0; i < class495s_4_.length; i++) {
			XLanguage class495 = class495s_4_[i];
			if ((aClass495Array5796[-1324357023 * ((XLanguage) class495).anInt5804]) != null)
				throw new IllegalStateException();
			aClass495Array5796[-1324357023 * ((XLanguage) class495).anInt5804] = class495;
		}
	}

	public String method8279() {
		return method8276(1871363869).toLowerCase(Locale.ENGLISH);
	}

	public String method8280() {
		return method8276(1083381343).toLowerCase(Locale.ENGLISH);
	}

	public String method8281() {
		return ((XLanguage) this).aString5803;
	}

	public int method76() {
		return -1324357023 * ((XLanguage) this).anInt5804;
	}

	public static XLanguage[] method8282() {
		return (new XLanguage[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 });
	}

	public static XLanguage[] method8283() {
		return (new XLanguage[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 });
	}

	public String method8284() {
		return ((XLanguage) this).aString5803;
	}

	static final void method8285(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		TilestreamPacket.method6289(class118, class98, class527, (byte) 30);
	}

	public String method8286() {
		return ((XLanguage) this).aString5803;
	}

	public String method8287() {
		return ((XLanguage) this).aString5803;
	}

	public static XLanguage[] method8288() {
		return (new XLanguage[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 });
	}

	public Locale method8289() {
		return ((XLanguage) this).aLocale5805;
	}

	public Locale method8290() {
		return ((XLanguage) this).aLocale5805;
	}

	public Locale method8291() {
		return ((XLanguage) this).aLocale5805;
	}

	public static XLanguage method8292(int i) {
		if (i < 0 || i >= aClass495Array5796.length)
			return null;
		return aClass495Array5796[i];
	}

	public Locale method8293(int i) {
		return ((XLanguage) this).aLocale5805;
	}

	public static XLanguage[] method8294(int i) {
		return (new XLanguage[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 });
	}

	static final void method8295(CS2Executor class527, int i) {
		int i_5_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_5_, (byte) 65);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_5_ >> 16];
		Class96_Sub18.method14664(class118, class98, true, 0, class527, (byte) -3);
	}

	static final void method8296(CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class184 class184 = Class468_Sub20.method12807(-625511967);
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4541, class184.isaac, 103463045);
		class282_sub23.buffer.writeByte(0);
		int i_6_ = -1990677291 * class282_sub23.buffer.index;
		class282_sub23.buffer.writeString(string);
		class282_sub23.buffer.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.buffer, class527.aClass346_7009.anIntArray4046, -1485943767);
		class282_sub23.buffer.method13061((class282_sub23.buffer.index * -1990677291 - i_6_), 460016164);
		class184.method3049(class282_sub23, 1428748072);
	}

	static final void method8297(CS2Executor class527, byte i) {
		if (Class96_Sub21.aClass199_9438.method3236(81, -2091776550))
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 1;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method8298(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i != -1) {
				for (;;) {
					/* empty */
				}
			}
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_7_ = class513;
		IComponentDefinitions class118 = ((UnderlayDefinition) class513_7_).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513_7_).aClass98_5885;
		Class282_Sub21_Sub1.method15474(class118, class98, class527, (byte) 66);
	}
}
