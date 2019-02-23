public class Class272 {

	static int anInt3331;

	Class272() throws Throwable {
		throw new Error();
	}

	static final void method4838(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 10);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		WorldMapAreaDefs.method3738(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) -2);
	}

	static final void method4839(CS2Executor cs2executor_0, byte b_1) {
		--cs2executor_0.intStackPtr;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		Class282_Sub44 class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.method7754((long) i_2);
		if (class282_sub44_3 != null && class282_sub44_3.anInt8062 == 3) {
			Class351.method6196(class282_sub44_3, true, true, -1932930202);
		}

	}

	public static int method4840(CharSequence charsequence_0, byte b_1) {
		int i_2 = charsequence_0.length();
		int i_3 = 0;

		for (int i_4 = 0; i_4 < i_2; i_4++) {
			i_3 = (i_3 << 5) - i_3 + charsequence_0.charAt(i_4);
		}

		return i_3;
	}

	static boolean method4841(CharSequence charsequence_0, int i_1, boolean bool_2, int i_3) {
		if (i_1 >= 2 && i_1 <= 36) {
			boolean bool_4 = false;
			boolean bool_5 = false;
			int i_6 = 0;
			int i_7 = charsequence_0.length();

			for (int i_8 = 0; i_8 < i_7; i_8++) {
				char var_9 = charsequence_0.charAt(i_8);
				if (i_8 == 0) {
					if (var_9 == 45) {
						bool_4 = true;
						continue;
					}

					if (var_9 == 43) {
						continue;
					}
				}

				int i_11;
				if (var_9 >= 48 && var_9 <= 57) {
					i_11 = var_9 - 48;
				} else if (var_9 >= 65 && var_9 <= 90) {
					i_11 = var_9 - 55;
				} else {
					if (var_9 < 97 || var_9 > 122) {
						return false;
					}

					i_11 = var_9 - 87;
				}

				if (i_11 >= i_1) {
					return false;
				}

				if (bool_4) {
					i_11 = -i_11;
				}

				int i_10 = i_11 + i_6 * i_1;
				if (i_10 / i_1 != i_6) {
					return false;
				}

				i_6 = i_10;
				bool_5 = true;
			}

			return bool_5;
		} else {
			throw new IllegalArgumentException("" + i_1);
		}
	}

}
