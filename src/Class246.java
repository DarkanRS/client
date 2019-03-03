public class Class246 {

	static String[] aStringArray3028;
	public static int anInt3029;

	Class246() throws Throwable {
		throw new Error();
	}

	static final void method4200(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStackPtr -= 10;
		byte[] bytes_4 = null;
		byte[] bytes_5 = null;

		int i_6;
		for (i_6 = 0; i_6 < 10 && cs2executor_0.intStack[i_6 + cs2executor_0.intStackPtr] >= 0; i_6 += 2) {
			;
		}

		if (i_6 > 0) {
			bytes_4 = new byte[i_6 / 2];
			bytes_5 = new byte[i_6 / 2];

			for (i_6 -= 2; i_6 >= 0; i_6 -= 2) {
				bytes_4[i_6 / 2] = (byte) cs2executor_0.intStack[i_6 + cs2executor_0.intStackPtr];
				bytes_5[i_6 / 2] = (byte) cs2executor_0.intStack[i_6 + cs2executor_0.intStackPtr + 1];
			}
		}

		Class107.method1838(icomponentdefinitions_3, bytes_4, bytes_5, cs2executor_0, 1844755981);
	}

	static final void method4201(CS2Executor cs2executor_0, int i_1) {
		IComponentDefinitions icomponentdefinitions_2 = Class117.method1981(cs2executor_0.intStack[--cs2executor_0.intStackPtr], (byte) 117);
		if (icomponentdefinitions_2.anInt1426 != -1) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_2.anInt1427;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static final void method4202(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		ItemDefinitions itemdefinitions_4 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 173872175);
		if (i_3 >= 1 && i_3 <= 5 && itemdefinitions_4.inventoryOptions[i_3 - 1] != null) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = itemdefinitions_4.inventoryOptions[i_3 - 1];
		} else {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
		}

	}

	public static Class461 method4203(int i_0, byte b_1) {
		Class461[] arr_2 = Class202.method3343(-757707497);

		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			Class461 class461_4 = arr_2[i_3];
			if (i_0 == class461_4.anInt5541) {
				return class461_4;
			}
		}

		return null;
	}

	static void method4204(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, int i_3) {
		if (icomponentdefinitions_0.aByte1333 == 0) {
			icomponentdefinitions_0.anInt1299 = icomponentdefinitions_0.anInt1295;
		} else if (icomponentdefinitions_0.aByte1333 == 1) {
			icomponentdefinitions_0.anInt1299 = icomponentdefinitions_0.anInt1295 + (i_1 - icomponentdefinitions_0.anInt1301) / 2;
		} else if (icomponentdefinitions_0.aByte1333 == 2) {
			icomponentdefinitions_0.anInt1299 = i_1 - icomponentdefinitions_0.anInt1301 - icomponentdefinitions_0.anInt1295;
		} else if (icomponentdefinitions_0.aByte1333 == 3) {
			icomponentdefinitions_0.anInt1299 = icomponentdefinitions_0.anInt1295 * i_1 >> 14;
		} else if (icomponentdefinitions_0.aByte1333 == 4) {
			icomponentdefinitions_0.anInt1299 = (i_1 - icomponentdefinitions_0.anInt1301) / 2 + (icomponentdefinitions_0.anInt1295 * i_1 >> 14);
		} else {
			icomponentdefinitions_0.anInt1299 = i_1 - icomponentdefinitions_0.anInt1301 - (icomponentdefinitions_0.anInt1295 * i_1 >> 14);
		}

		if (icomponentdefinitions_0.aByte1355 == 0) {
			icomponentdefinitions_0.anInt1428 = icomponentdefinitions_0.anInt1296;
		} else if (icomponentdefinitions_0.aByte1355 == 1) {
			icomponentdefinitions_0.anInt1428 = (i_2 - icomponentdefinitions_0.anInt1429) / 2 + icomponentdefinitions_0.anInt1296;
		} else if (icomponentdefinitions_0.aByte1355 == 2) {
			icomponentdefinitions_0.anInt1428 = i_2 - icomponentdefinitions_0.anInt1429 - icomponentdefinitions_0.anInt1296;
		} else if (icomponentdefinitions_0.aByte1355 == 3) {
			icomponentdefinitions_0.anInt1428 = i_2 * icomponentdefinitions_0.anInt1296 >> 14;
		} else if (icomponentdefinitions_0.aByte1355 == 4) {
			icomponentdefinitions_0.anInt1428 = (i_2 - icomponentdefinitions_0.anInt1429) / 2 + (i_2 * icomponentdefinitions_0.anInt1296 >> 14);
		} else {
			icomponentdefinitions_0.anInt1428 = i_2 - icomponentdefinitions_0.anInt1429 - (i_2 * icomponentdefinitions_0.anInt1296 >> 14);
		}

		if (client.aBool7168 && (client.method11633(icomponentdefinitions_0).settings != 0 || icomponentdefinitions_0.anInt1268 == 0)) {
			if (icomponentdefinitions_0.anInt1299 < 0) {
				icomponentdefinitions_0.anInt1299 = 0;
			} else if (icomponentdefinitions_0.anInt1299 + icomponentdefinitions_0.anInt1301 > i_1) {
				icomponentdefinitions_0.anInt1299 = i_1 - icomponentdefinitions_0.anInt1301;
			}

			if (icomponentdefinitions_0.anInt1428 < 0) {
				icomponentdefinitions_0.anInt1428 = 0;
			} else if (icomponentdefinitions_0.anInt1429 + icomponentdefinitions_0.anInt1428 > i_2) {
				icomponentdefinitions_0.anInt1428 = i_2 - icomponentdefinitions_0.anInt1429;
			}
		}

	}

	static final void method4205(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 63);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class125.method2168(icomponentdefinitions_3, interface_4, cs2executor_0, -1301648510);
	}

}
