public class Class165 {

	static int anInt2035;
	static int anInt2036;
	static int anInt2037;

	Class165() throws Throwable {
		throw new Error();
	}

	static void method2852(int i_0) {
		if (IndexLoaders.LOADING_STAGE != null) {
			Class328.aClass306_3771 = new Class306();
			Class328.aClass306_3771.method5422(Class302.aLong3562, IndexLoaders.LOADING_STAGE.aClass433_4711.translate(Class223.CURRENT_LANGUAGE, -1960746007), IndexLoaders.LOADING_STAGE.anInt4715, IndexLoaders.LOADING_STAGE, 2034622208);
			Class377.aThread4520 = new Thread(Class328.aClass306_3771, "");
			Class377.aThread4520.start();
		}

	}

	static void method2853(boolean bool_0, int i_1) {
		if (Class179.aString2225.length() != 0) {
			Class209.method3598("--> " + Class179.aString2225, -1362570363);
			Class251.handleCommand(Class179.aString2225, false, bool_0, -354697449);
			Class179.anInt2226 = 0;
			if (!bool_0) {
				Class179.anInt2220 = 0;
				Class179.aString2225 = "";
			}
		}

	}

	static final void method2854(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.anInt7001 -= 2;
		if (cs2executor_0.aLongArray7003[cs2executor_0.anInt7001] != cs2executor_0.aLongArray7003[cs2executor_0.anInt7001 + 1]) {
			cs2executor_0.instrPtr += cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		}

	}

	static final void method2855(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 59);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Login.method5017(icomponentdefinitions_3, interface_4, cs2executor_0, -974856399);
	}

	static final void method2856(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		Queue class477_4 = Class291.method5127(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
		boolean bool_5 = false;

		for (Class282_Sub50_Sub6 class282_sub50_sub6_6 = (Class282_Sub50_Sub6) class477_4.method7941((byte) 4); class282_sub50_sub6_6 != null; class282_sub50_sub6_6 = (Class282_Sub50_Sub6) class477_4.method7955(-1429079098)) {
			if (i_3 == class282_sub50_sub6_6.anInt9536) {
				bool_5 = true;
				break;
			}
		}

		if (bool_5) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

}
