public class Class282_Sub13 extends Node {

	int anInt7567;
	int anInt7569;
	int anInt7570;
	int anInt7571;
	int anInt7572;
	int anInt7573;
	int anInt7574;
	int anInt7575;
	int anInt7576;
	int anInt7577;
	int anInt7578;
	int anInt7579;
	int anInt7580;
	int anInt7581;
	int anInt7582;
	int anInt7583;
	int anInt7584;
	public static Class61 aClass61_7587;
	public static Defaults8Loader DEFAULTS_LOADER_8;
	Class282_Sub14 aClass282_Sub14_7566;
	Class282_Sub26_Sub1 aClass282_Sub26_Sub1_7565;
	Class110 aClass110_7586;
	Class282_Sub15_Sub5 aClass282_Sub15_Sub5_7568;

	void method12213(int i_1) {
		this.aClass282_Sub14_7566 = null;
		this.aClass282_Sub26_Sub1_7565 = null;
		this.aClass110_7586 = null;
		this.aClass282_Sub15_Sub5_7568 = null;
	}

	static final void method12215(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 207092406);
		if (itemdefinitions_3.certTemplateId == -1 && itemdefinitions_3.certId >= 0) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = itemdefinitions_3.certId;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2;
		}

	}

}
