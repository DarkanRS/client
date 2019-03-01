import java.util.Locale;

public class Language implements Interface43 {

	public static Language aClass495_5795;
	public static Language aClass495_5802;
	public static Language aClass495_5801;
	public static Language aClass495_5797;
	static Language aClass495_5799;
	public static Language aClass495_5800;
	static Language[] aClass495Array5796;
	String aString5806;
	String aString5803;
	int anInt5804;
	Locale aLocale5805;

	static {
		aClass495_5795 = new Language("EN", "en", "English", Class496.aClass496_5813, 0, "GB");
		aClass495_5802 = new Language("DE", "de", "German", Class496.aClass496_5813, 1, "DE");
		aClass495_5801 = new Language("FR", "fr", "French", Class496.aClass496_5813, 2, "FR");
		aClass495_5797 = new Language("PT", "pt", "Portuguese", Class496.aClass496_5813, 3, "BR");
		aClass495_5799 = new Language("NL", "nl", "Dutch", Class496.aClass496_5807, 4, "NL");
		aClass495_5800 = new Language("ES", "es", "Spanish", Class496.aClass496_5807, 5, "ES");
		Language[] arr_0 = method8294(135762264);
		aClass495Array5796 = new Language[arr_0.length];
		Language[] arr_1 = arr_0;

		for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
			Language xlanguage_3 = arr_1[i_2];
			if (aClass495Array5796[xlanguage_3.anInt5804] != null) {
				throw new IllegalStateException();
			}

			aClass495Array5796[xlanguage_3.anInt5804] = xlanguage_3;
		}

	}

	public int method75() {
		return -1324357023 * this.anInt5804 * 411974049;
	}

	Language(String string_1, String string_2, String string_3, Class496 class496_4, int i_5, String string_6) {
		this.aString5806 = string_1;
		this.aString5803 = string_2;
		this.anInt5804 = i_5;
		Locale locale_7 = null;
		if (string_6 != null) {
			locale_7 = new Locale(this.method8276(1011487553), string_6);
		}

		if (locale_7 != null) {
			this.aLocale5805 = locale_7;
		} else {
			this.aLocale5805 = new Locale(this.method8276(1390953905));
		}

	}

	public String method8276(int i_1) {
		return this.aString5803;
	}

	static final void method8277(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1293603558) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1278 = Class351.method6193(string_4, cs2executor_2, -34782350);
		icomponentdefinitions_0.aBool1384 = true;
	}

	public int method243(byte b_1) {
		return this.anInt5804;
	}

	public static Language method8278(int i_0, int i_1) {
		return i_0 >= 0 && i_0 < aClass495Array5796.length ? aClass495Array5796[i_0] : null;
	}

	public String toString() {
		return this.method8276(1589376579).toLowerCase(Locale.ENGLISH);
	}

	public int method76() {
		return -1324357023 * this.anInt5804 * 411974049;
	}

	static final void method8285(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		TilestreamPacket.method6289(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 30);
	}

	public Locale method8293(int i_1) {
		return this.aLocale5805;
	}

	public static Language[] method8294(int i_0) {
		return new Language[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 };
	}

	static final void method8295(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 65);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class96_Sub18.method14664(icomponentdefinitions_3, interface_4, true, 0, cs2executor_0, (byte) -3);
	}

	static final void method8296(CS2Executor cs2executor_0, byte b_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		Class184 class184_3 = Class468_Sub20.method12807(-625511967);
		TCPMessage tcpmessage_4 = Class271.method4828(OutgoingPacket.aClass379_4541, class184_3.isaac, 103463045);
		tcpmessage_4.buffer.writeByte(0);
		int i_5 = tcpmessage_4.buffer.index;
		tcpmessage_4.buffer.writeString(string_2);
		tcpmessage_4.buffer.writeShort(cs2executor_0.aClass346_7009.anInt4048, 1417031095);
		cs2executor_0.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_4.buffer, cs2executor_0.aClass346_7009.anIntArray4046, -1485943767);
		tcpmessage_4.buffer.method13061(tcpmessage_4.buffer.index - i_5, 460016164);
		class184_3.method3049(tcpmessage_4, 1428748072);
	}

	static final void method8297(CS2Executor cs2executor_0, byte b_1) {
		if (Class96_Sub21.keyRecorder.method3236(81, -2091776550)) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static final void method8298(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		Class282_Sub21_Sub1.method15474(icomponentdefinitions_4, interface_5, cs2executor_0, (byte) 66);
	}

}
