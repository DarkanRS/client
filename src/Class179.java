public class Class179 {

	static int anInt2222;
	static int anInt2230;
	static long aLong2232;
	static int anInt2227 = 0;
	static int anInt2223 = 0;
	static String aString2225 = "";
	static int anInt2226 = 0;
	static int anInt2220 = 0;
	static int anInt2221 = 0;
	static boolean aBool2229 = false;
	static int anInt2231 = -1;

	Class179() throws Throwable {
		throw new Error();
	}

	static final void method3017(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class241.method4150(-536353301);
	}

	public static String method3018(long long_0) {
		if (long_0 > 0L && long_0 < 6582952005840035281L) {
			if (long_0 % 37L == 0L) {
				return null;
			} else {
				int i_2 = 0;

				for (long long_3 = long_0; long_3 != 0L; long_3 /= 37L) {
					++i_2;
				}

				char var_6;
				StringBuilder stringbuilder_8;
				for (stringbuilder_8 = new StringBuilder(i_2); long_0 != 0L; stringbuilder_8.append(var_6)) {
					long long_4 = long_0;
					long_0 /= 37L;
					var_6 = Class500.aCharArray5825[(int) (long_4 - 37L * long_0)];
					if (var_6 == 95) {
						int i_7 = stringbuilder_8.length() - 1;
						stringbuilder_8.setCharAt(i_7, Character.toUpperCase(stringbuilder_8.charAt(i_7)));
						var_6 = 160;
					}
				}

				stringbuilder_8.reverse();
				stringbuilder_8.setCharAt(0, Character.toUpperCase(stringbuilder_8.charAt(0)));
				return stringbuilder_8.toString();
			}
		} else {
			return null;
		}
	}

	public static int method3019(int i_0, short s_1) {
		i_0 = (i_0 & 0x55555555) + (i_0 >>> 1 & 0x55555555);
		i_0 = (i_0 >>> 2 & 0x33333333) + (i_0 & 0x33333333);
		i_0 = i_0 + (i_0 >>> 4) & 0xf0f0f0f;
		i_0 += i_0 >>> 8;
		i_0 += i_0 >>> 16;
		return i_0 & 0xff;
	}

	static final void method3020(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 40);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class249.method4276(icomponentdefinitions_3, interface_4, cs2executor_0, -724687188);
	}

	static final void method3021(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.aClass282_Sub4_7011.aByte7504;
	}

}
