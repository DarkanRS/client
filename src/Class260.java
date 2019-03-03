public class Class260 {

	static Class116 aClass116_3229;
	static Class282_Sub15_Sub2 aClass282_Sub15_Sub2_3231;
	public static int anInt3223 = -1;
	public static boolean aBool3220 = false;
	public static int anInt3228 = -1;
	static int anInt3219 = 0;
	static Class268[] aClass268Array3232 = new Class268[50];
	static Class277 aClass277_3221 = null;
	static Class277 aClass277_3234 = null;

	Class260() throws Throwable {
		throw new Error();
	}

	static final void method4629(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 40);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class306.method5455(icomponentdefinitions_3, interface_4, cs2executor_0, 1919949252);
	}

	static final void method4630(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1] - 1;
		ItemDefinitions itemdefinitions_4 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 1109098301);
		if (i_3 == itemdefinitions_4.unknownInt22) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = itemdefinitions_4.unknownInt23;
		} else if (i_3 == itemdefinitions_4.unknownInt27) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = itemdefinitions_4.unknownInt28;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		}

	}

	static final void method4631(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.aClass346_7009.anIntArray4046[i_2] = i_3;
	}

	static final int method4632(int i_0, int i_1, int i_2) {
		int i_3 = i_1 * 57 + i_0;
		i_3 ^= i_3 << 13;
		int i_4 = i_3 * (i_3 * i_3 * 15731 + 789221) + 1376312589 & 0x7fffffff;
		return i_4 >> 19 & 0xff;
	}

	static final void method4633(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 59);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class204.method3369(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 0);
	}

}
