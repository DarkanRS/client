public class AccountCreationResponseOpcodes implements Interface43 {

	static AccountCreationResponseOpcodes aClass483_5737 = new AccountCreationResponseOpcodes(-1);
	public static AccountCreationResponseOpcodes aClass483_5730 = new AccountCreationResponseOpcodes(-2);
	public static AccountCreationResponseOpcodes aClass483_5729 = new AccountCreationResponseOpcodes(-3);
	static AccountCreationResponseOpcodes aClass483_5732 = new AccountCreationResponseOpcodes(-4);
	public static AccountCreationResponseOpcodes aClass483_5731 = new AccountCreationResponseOpcodes(-5);
	public static AccountCreationResponseOpcodes CONTINUE = new AccountCreationResponseOpcodes(2);
	static AccountCreationResponseOpcodes aClass483_5735 = new AccountCreationResponseOpcodes(3);
	static AccountCreationResponseOpcodes aClass483_5736 = new AccountCreationResponseOpcodes(7);
	static AccountCreationResponseOpcodes aClass483_5733 = new AccountCreationResponseOpcodes(9);
	static AccountCreationResponseOpcodes CLIENT_HAS_BEEN_UPDATED = new AccountCreationResponseOpcodes(37);
	int anInt5739;

	public int method76() {
		return this.anInt5739;
	}

	public int method75() {
		return this.anInt5739;
	}

	AccountCreationResponseOpcodes(int i_1) {
		this.anInt5739 = i_1;
	}

	public int method243(byte b_1) {
		return this.anInt5739;
	}

	static final void method8152(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 107);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class47_Sub1.method14482(icomponentdefinitions_3, interface_4, cs2executor_0, -544899981);
	}

	static final void method8153(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 4;
		Class435.method7300(cs2executor_0.intStack[cs2executor_0.intStackPtr], cs2executor_0.intStack[cs2executor_0.intStackPtr + 1], cs2executor_0.intStack[cs2executor_0.intStackPtr + 2], cs2executor_0.intStack[cs2executor_0.intStackPtr + 3], true, 256, 1449989045);
	}

	static final void method8154(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1277;
	}

	public static Class353[] method8155(int i_0) {
		return new Class353[] { Class353.aClass353_4107, Class353.aClass353_4105, Class353.aClass353_4106 };
	}

	static final void method8156(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub21_8222.method12865(475375870);
	}

}
