public class Class100 {

	static Class253 aClass253_1008;

	byte[] aByteArray1007;

	int anInt1006;

	Class100(byte[] bytes_1) {
		this.aByteArray1007 = bytes_1;
		this.anInt1006 = 0;
	}

	int method1632(byte b_1) {
		short s_2 = 0;
		for (int i_3 = 0; i_3 < 2; i_3++) {
			s_2 = (short) (s_2 | (this.aByteArray1007[++this.anInt1006 - 1] & 0xff) << i_3 * 8);
		}
		return s_2;
	}

	String method1633(int i_1) {
		int i_2 = this.method1632((byte) -122);
		if (i_2 == -1) {
			return null;
		} else if (i_2 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			String string_3 = new String(this.aByteArray1007, this.anInt1006, i_2);
			this.anInt1006 += i_2;
			return string_3;
		}
	}

	static Class221 method1640(int i_0, byte b_1) {
		Class221[] arr_2 = JS5FileWorker.method5815(484597042);
		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			Class221 class221_4 = arr_2[i_3];
			if (i_0 == class221_4.anInt2758) {
				return class221_4;
			}
		}
		return null;
	}

	static final void method1642(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1421907667) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1400 = Class351.method6193(string_4, cs2executor_2, 1475160400);
		icomponentdefinitions_0.aBool1384 = true;
	}

	public static void method1644(String[] arr_0, short[] shorts_1, short s_2) {
		Class88.method1495(arr_0, shorts_1, 0, arr_0.length - 1, -519753439);
	}
}
