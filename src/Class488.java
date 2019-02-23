public class Class488 {

	public static int anInt5760;
	static Index MESH_INDEX;

	Class488() throws Throwable {
		throw new Error();
	}

	static final String method8210(int i_0, int i_1) {
		String string_2 = Integer.toString(i_0);

		for (int i_3 = string_2.length() - 3; i_3 > 0; i_3 -= 3) {
			string_2 = string_2.substring(0, i_3) + "," + string_2.substring(i_3);
		}

		return string_2.length() > 9 ? " " + Class59.method1163(65408, 619010179) + string_2.substring(0, string_2.length() - 8) + Message.aClass433_5294.translate(Class223.CURRENT_LANGUAGE, -669112098) + " (" + string_2 + ")" + "</col>" : (string_2.length() > 6 ? " " + Class59.method1163(16777215, 619010179) + string_2.substring(0, string_2.length() - 4) + Message.aClass433_5296.translate(Class223.CURRENT_LANGUAGE, -327274264) + " (" + string_2 + ")" + "</col>" : " " + Class59.method1163(16776960, 619010179) + string_2 + "</col>");
	}

	static final void method8211(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1337;
	}

	static final void method8212(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class529.method11337(icomponentdefinitions_3, interface_4, cs2executor_0, -2109817364);
	}

}
