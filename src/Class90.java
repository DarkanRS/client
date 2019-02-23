public class Class90 {

	public static Class496 aClass496_952;
	public int anInt946;
	public int anInt945;
	public int anInt947;
	int anInt948;
	public int anInt949;
	public int anInt950;
	public int anInt951;

	public Class90(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.anInt946 = i_1;
		this.anInt945 = i_2;
		this.anInt947 = i_3;
		this.anInt948 = i_4;
		this.anInt949 = i_5;
		this.anInt950 = i_6;
		this.anInt951 = i_7;
	}

	public boolean method1506(Class90 class90_1, int i_2) {
		return this.anInt946 == class90_1.anInt946 && this.anInt945 == class90_1.anInt945 && this.anInt947 == class90_1.anInt947 && this.anInt948 == class90_1.anInt948 && this.anInt949 == class90_1.anInt949 && this.anInt950 == class90_1.anInt950 && this.anInt951 == class90_1.anInt951;
	}

	public Class90() {
	}

	static final void method1508(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (i_2 < 0 || i_2 > 1) {
			i_2 = 0;
		}

		Class115.method1952(i_2 == 1, -1838966944);
	}

	static final void method1509(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 110);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class242.method4159(icomponentdefinitions_3, interface_4, cs2executor_0, -710786215);
	}

	static final void method1510(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 104);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class287.method5066(icomponentdefinitions_3, interface_4, cs2executor_0, 711806396);
	}

	static final void method1511(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class204.method3369(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 0);
	}

	static final void method1512(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 83);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1329 == 1 ? icomponentdefinitions_3.anInt1330 : -1;
	}

}
