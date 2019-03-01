public class Class296 {

	static Class446[] aClass446Array3531;
	public static int anInt3534;
	static int anInt3532 = 0;
	static int anInt3533 = 0;

	Class296() throws Throwable {
		throw new Error();
	}

	static final void method5296(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		Class204.method3366(icomponentdefinitions_4, interface_5, cs2executor_0, (byte) -128);
	}

	static final void method5297(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		int i_3 = client.aClass330Array7428[i_2].method5908(-1252250172);
		int[] ints_4 = cs2executor_0.intStack;
		int i_5 = ++cs2executor_0.intStackPtr - 1;
		byte b_6;
		if (i_3 == 1) {
			b_6 = 1;
		} else {
			b_6 = 0;
		}

		ints_4[i_5] = b_6;
	}

	static final void method5298(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.anInt7000 -= 2;
		String string_3 = (String) cs2executor_0.objectStack[cs2executor_0.anInt7000];
		String string_4 = (String) cs2executor_0.objectStack[cs2executor_0.anInt7000 + 1];
		if (string_3.length() <= 500 && string_4.length() <= 500) {
			Class105.method1804(i_2, string_3, string_4, (byte) -22);
		}

	}

	static final void method5299(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class282_Sub45.method13405(Class169.time());
	}

}
