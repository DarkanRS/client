public class Class276 {

	static String[] aStringArray3345;
	public static RsByteBuffer aClass282_Sub35_3346;

	Class276() throws Throwable {
		throw new Error();
	}

	static final void method4898(CS2Executor cs2executor_0, int i_1) {
		IComponentDefinitions icomponentdefinitions_2 = Class117.method1981(cs2executor_0.intStack[--cs2executor_0.intStackPtr], (byte) 97);
		if (icomponentdefinitions_2.aClass118Array1438 == null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		} else {
			int i_3 = icomponentdefinitions_2.aClass118Array1438.length;

			for (int i_4 = 0; i_4 < icomponentdefinitions_2.aClass118Array1438.length; i_4++) {
				if (icomponentdefinitions_2.aClass118Array1438[i_4] == null) {
					i_3 = i_4;
					break;
				}
			}

			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_3;
		}

	}

	static final void method4899(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		int i_3 = Class393.preferences.aClass468_Sub13_8229.method12714(2130279532);
		if (i_3 != i_2 && Class260.anInt3228 == Class260.anInt3223) {
			if (!Class169.method2875(client.gameState, -2119377821)) {
				if (i_3 == 0) {
					Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, 0, i_2, false, (byte) -58);
					Class468_Sub6.method12658(173344706);
					Class260.aBool3220 = false;
				} else if (i_2 == 0) {
					Class226.method3805(-1719520107);
					Class260.aBool3220 = false;
				} else {
					Class87.method1491(i_2, (byte) -14);
				}
			}

			Class393.preferences.setValue(Class393.preferences.aClass468_Sub13_8229, i_2, 1044638020);
			Class190.savePreferences((byte) 93);
			client.aBool7175 = false;
		}

	}

	static final void method4900(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub22_8213.method12873(-825847336) == 1 ? 1 : 0;
	}

	static final void method4901(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1376;
	}

	static final void method4902(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		Class202.method3345(string_2, 1291002521);
	}

	public static void method4903(int i_0, int i_1, int i_2) {
		Class282_Sub50_Sub12 class282_sub50_sub12_3 = Engine.getIComponentVar(19, (long) i_1 << 32 | (long) i_0);
		class282_sub50_sub12_3.method14965((byte) -68);
	}

}
