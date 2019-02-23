public class Class159 {

	public static Class450 aClass450_2010;

	Class159() throws Throwable {
		throw new Error();
	}

	public static final boolean method2734(String string_0, String string_1, String string_2, String string_3, byte b_4) {
		if (string_0 != null) {
			if (string_2 != null) {
				if (!string_0.startsWith("#")) {
					if (b_4 >= -1) {
						throw new IllegalStateException();
					}

					if (!string_2.startsWith("#")) {
						return string_1.equals(string_3);
					}

					if (b_4 < -1) {
						;
					}
				}

				return string_0.equals(string_2);
			}

			if (b_4 >= -1) {
				throw new IllegalStateException();
			}
		}

		return false;
	}

	static final int method2735(int i_0, int i_1, int i_2, int i_3) {
		int i_4 = i_0 / i_2;
		int i_5 = i_0 & i_2 - 1;
		int i_6 = i_1 / i_2;
		int i_7 = i_1 & i_2 - 1;
		int i_8 = Class241.method4151(i_4, i_6, 1156456439);
		int i_9 = Class241.method4151(i_4 + 1, i_6, 1156456439);
		int i_10 = Class241.method4151(i_4, i_6 + 1, 1156456439);
		int i_11 = Class241.method4151(i_4 + 1, i_6 + 1, 1156456439);
		int i_12 = Class430.method7220(i_8, i_9, i_5, i_2, -1918782622);
		int i_13 = Class430.method7220(i_10, i_11, i_5, i_2, -1190208643);
		return Class430.method7220(i_12, i_13, i_7, i_2, -1754820522);
	}

	public static void method2736(long[] longs_0, int[] ints_1, byte b_2) {
		Class497.method8316(longs_0, ints_1, 0, longs_0.length - 1, -1763921861);
	}

	static final void method2737(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class291_Sub1.anInt8015 == 100 ? 1 : 0;
	}

	static void method2738(Interface interface_0, int i_1, int i_2, int i_3, boolean bool_4, CS2Executor cs2executor_5, int i_6) {
		if (i_2 == 0) {
			throw new RuntimeException();
		} else {
			IComponentDefinitions icomponentdefinitions_7 = interface_0.components[i_1];
			if (icomponentdefinitions_7.aClass118Array1438 == null) {
				icomponentdefinitions_7.aClass118Array1438 = new IComponentDefinitions[i_3 + 1];
				icomponentdefinitions_7.aClass118Array1439 = icomponentdefinitions_7.aClass118Array1438;
			}

			if (icomponentdefinitions_7.aClass118Array1438.length <= i_3) {
				IComponentDefinitions[] arr_8;
				if (icomponentdefinitions_7.aClass118Array1438 == icomponentdefinitions_7.aClass118Array1439) {
					arr_8 = new IComponentDefinitions[i_3 + 1];

					for (int i_9 = 0; i_9 < icomponentdefinitions_7.aClass118Array1438.length; i_9++) {
						arr_8[i_9] = icomponentdefinitions_7.aClass118Array1438[i_9];
					}

					icomponentdefinitions_7.aClass118Array1438 = icomponentdefinitions_7.aClass118Array1439 = arr_8;
				} else {
					arr_8 = new IComponentDefinitions[i_3 + 1];
					IComponentDefinitions[] arr_11 = new IComponentDefinitions[i_3 + 1];

					for (int i_10 = 0; i_10 < icomponentdefinitions_7.aClass118Array1438.length; i_10++) {
						arr_8[i_10] = icomponentdefinitions_7.aClass118Array1438[i_10];
						arr_11[i_10] = icomponentdefinitions_7.aClass118Array1439[i_10];
					}

					icomponentdefinitions_7.aClass118Array1438 = arr_8;
					icomponentdefinitions_7.aClass118Array1439 = arr_11;
				}
			}

			if (i_3 > 0 && icomponentdefinitions_7.aClass118Array1438[i_3 - 1] == null) {
				throw new RuntimeException("" + (i_3 - 1));
			} else {
				IComponentDefinitions icomponentdefinitions_12 = new IComponentDefinitions();
				icomponentdefinitions_12.anInt1268 = i_2;
				icomponentdefinitions_12.anInt1305 = icomponentdefinitions_12.idHash = icomponentdefinitions_7.idHash;
				icomponentdefinitions_12.anInt1288 = i_3;
				icomponentdefinitions_7.aClass118Array1438[i_3] = icomponentdefinitions_12;
				if (icomponentdefinitions_7.aClass118Array1438 != icomponentdefinitions_7.aClass118Array1439) {
					icomponentdefinitions_7.aClass118Array1439[i_3] = icomponentdefinitions_12;
				}

				UnderlayDefinition underlaydefinition_13;
				if (bool_4) {
					underlaydefinition_13 = cs2executor_5.aClass513_6994;
				} else {
					underlaydefinition_13 = cs2executor_5.aClass513_7007;
				}

				underlaydefinition_13.aClass98_5885 = interface_0;
				underlaydefinition_13.aClass118_5886 = icomponentdefinitions_12;
				Class109.method1858(icomponentdefinitions_7, (byte) -95);
			}
		}
	}

	public static int method2739(int i_0, int i_1) {
		int i_2 = 0;
		if (i_0 < 0 || i_0 >= 65536) {
			i_0 >>>= 16;
			i_2 += 16;
		}

		if (i_0 >= 256) {
			i_0 >>>= 8;
			i_2 += 8;
		}

		if (i_0 >= 16) {
			i_0 >>>= 4;
			i_2 += 4;
		}

		if (i_0 >= 4) {
			i_0 >>>= 2;
			i_2 += 2;
		}

		if (i_0 >= 1) {
			i_0 >>>= 1;
			++i_2;
		}

		return i_0 + i_2;
	}

	public static void setNativeLibraryLoader(Interface36 interface36_0, int i_1) {
		if (Class404.LIBRARY_LOADER != null) {
			throw new IllegalStateException("");
		} else {
			Class404.LIBRARY_LOADER = interface36_0;
		}
	}

	static final void method2741(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		boolean bool_5;
		if (cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1) {
			bool_5 = true;
		} else {
			bool_5 = false;
		}

		icomponentdefinitions_0.aBool1327 = bool_5;
		Class109.method1858(icomponentdefinitions_0, (byte) 1);
	}

}
