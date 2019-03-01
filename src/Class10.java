public class Class10 {

	public String aString115;
	public String aString116;
	public boolean aBool117;
	static int anInt118;

	static final void method456(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.cycles;
	}

	static final void method457(CS2Executor cs2executor_0, int i_1) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub23_8202, cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1 ? 1 : 0, 2089937040);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -3);
		Class190.savePreferences((byte) 89);
		client.aBool7175 = false;
	}

	public static void method458(int i_0, int i_1) {
		Class291_Sub1.anInt8018 = i_0;
		Class291_Sub1.anInt8026 = -1;
		Class361.anInt4185 = 3;
		Class96_Sub9.anInt9282 = 100;
	}

	static final void method459(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class109.method1852(icomponentdefinitions_3, interface_4, cs2executor_0, 1050548242);
	}

	static final void method460(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 25);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class496.method8310(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) -108);
	}

}
