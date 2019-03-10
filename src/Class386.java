public class Class386 {

	Class386() throws Throwable {
		throw new Error();
	}

	static final void method6668(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		ClassSomet underlaydefinition_4;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_4 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_4 = cs2executor_0.aClass513_7007;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_3 != -1 && underlaydefinition_4.method8764(i_2, i_3, -1290054035) ? 1 : 0;
	}

	static final void method6669(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 19);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class249.method4280(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 114);
	}

	static final void method6670(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 103);
		Class96_Sub22.method14680(icomponentdefinitions_3, cs2executor_0, 434841982);
	}

	public static Class467[] method6671(Class470 class470_0, int i_1) {
		int[] ints_2 = class470_0.method7807((byte) 0);
		Class467[] arr_3 = new Class467[ints_2.length >> 2];

		for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
			Class467 class467_5 = new Class467();
			arr_3[i_4] = class467_5;
			class467_5.anInt5571 = ints_2[i_4 << 2];
			class467_5.anInt5574 = ints_2[(i_4 << 2) + 1];
			class467_5.anInt5573 = ints_2[(i_4 << 2) + 2];
			class467_5.anInt5572 = ints_2[(i_4 << 2) + 3];
		}

		return arr_3;
	}

	public static Interface43 method6672(Interface43[] arr_0, int i_1, int i_2) {
		Interface43[] arr_3 = arr_0;

		for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
			Interface43 interface43_5 = arr_3[i_4];
			if (i_1 == interface43_5.method243((byte) 1)) {
				return interface43_5;
			}
		}

		return null;
	}

	public static void method6673(int i_0) {
		if (Class302.anInterface27Array3559 != null) {
			Interface27[] arr_1 = Class302.anInterface27Array3559;

			for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
				Interface27 interface27_3 = arr_1[i_2];
				interface27_3.method161(-1145558933);
			}
		}

	}

	static final void method6674(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.stringStackPtr -= 2;
		String string_2 = (String) cs2executor_0.stringStack[cs2executor_0.stringStackPtr];
		String string_3 = (String) cs2executor_0.stringStack[cs2executor_0.stringStackPtr + 1];
		Class2.method257(string_2, string_3, 1942118537);
	}

	static final void method6675(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub2_8205.method12624((byte) -45);
	}

}
