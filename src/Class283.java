public class Class283 {

	public static int anInt3384;
	public int anInt3382;
	public int[] anIntArray3381;
	public int[] anIntArray3383;

	public Class283(int i_1) {
		this.anInt3382 = i_1;
		this.anIntArray3381 = new int[this.anInt3382];
		this.anIntArray3383 = new int[this.anInt3382];
	}

	static final void method5008(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		DefaultsFile.method11223(icomponentdefinitions_3, interface_4, cs2executor_0, 4317906);
	}

	static final void method5009(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1962956605) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1413 = Class351.method6193(string_4, cs2executor_2, 1097556379);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method5010(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		String string_3 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (client.gameState == 0 && !JS5CacheFile.method3360((byte) 17)) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class62.method1262(i_2, string_3, (byte) 55) ? 1 : 0;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

}
