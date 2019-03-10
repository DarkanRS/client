public class Class106 {

	static String[] aStringArray1077;
	public static Class106 aClass106_1075 = new Class106(0, 104);
	static Class106 aClass106_1074 = new Class106(1, 120);
	static Class106 aClass106_1072 = new Class106(2, 136);
	static Class106 aClass106_1073 = new Class106(3, 168);
	static Class106 aClass106_1070 = new Class106(4, 72);
	public int anInt1071;
	public int anInt1076;

	Class106(int i_1, int i_2) {
		this.anInt1071 = i_1;
		this.anInt1076 = i_2;
	}

	static final void method1813(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 126);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		DefaultsFile.method11221(icomponentdefinitions_3, interface_4, cs2executor_0, -2007218506);
	}

	static final void method1814(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2, (byte) -1);
		int i_4 = 0;
		if (chatline_3 != null) {
			i_4 = chatline_3.anInt1086;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_4;
	}

	static final void method1815(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		client.aShort7394 = (short) cs2executor_0.intStack[cs2executor_0.intStackPtr];
		if (client.aShort7394 <= 0) {
			client.aShort7394 = 256;
		}

		client.aShort7324 = (short) cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		if (client.aShort7324 <= 0) {
			client.aShort7324 = 320;
		}

	}

	static final void method1816(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class354.anInt4112;
	}

	static final void method1817(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = ParticleProducerDefinition.method1163(i_2, 619010179);
	}

	public static void method1818(int i_0, int i_1) {
		Class282_Sub50_Sub12 class282_sub50_sub12_2 = Engine.getIComponentVar(8, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) 5);
	}

}
