public final class Class484 {

	Class484() throws Throwable {
		throw new Error();
	}

	static final void method8199(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class158.method2730((short) -26831);
	}

	static void method8200(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, boolean bool_3, int i_4) {
		int i_5 = icomponentdefinitions_0.anInt1301;
		int i_6 = icomponentdefinitions_0.anInt1429;
		if (icomponentdefinitions_0.aByte1368 == 0) {
			icomponentdefinitions_0.anInt1301 = icomponentdefinitions_0.anInt1297;
		} else if (icomponentdefinitions_0.aByte1368 == 1) {
			icomponentdefinitions_0.anInt1301 = i_1 - icomponentdefinitions_0.anInt1297;
		} else if (icomponentdefinitions_0.aByte1368 == 2) {
			icomponentdefinitions_0.anInt1301 = icomponentdefinitions_0.anInt1297 * i_1 >> 14;
		}

		if (icomponentdefinitions_0.aByte1294 == 0) {
			icomponentdefinitions_0.anInt1429 = icomponentdefinitions_0.anInt1298;
		} else if (icomponentdefinitions_0.aByte1294 == 1) {
			icomponentdefinitions_0.anInt1429 = i_2 - icomponentdefinitions_0.anInt1298;
		} else if (icomponentdefinitions_0.aByte1294 == 2) {
			icomponentdefinitions_0.anInt1429 = i_2 * icomponentdefinitions_0.anInt1298 >> 14;
		}

		if (icomponentdefinitions_0.aByte1368 == 4) {
			icomponentdefinitions_0.anInt1301 = icomponentdefinitions_0.anInt1289 * icomponentdefinitions_0.anInt1429 / icomponentdefinitions_0.anInt1375;
		}

		if (icomponentdefinitions_0.aByte1294 == 4) {
			icomponentdefinitions_0.anInt1429 = icomponentdefinitions_0.anInt1301 * icomponentdefinitions_0.anInt1375 / icomponentdefinitions_0.anInt1289;
		}

		if (client.aBool7168 && (client.method11633(icomponentdefinitions_0).anInt7547 != 0 || icomponentdefinitions_0.anInt1268 == 0)) {
			if (icomponentdefinitions_0.anInt1429 < 5 && icomponentdefinitions_0.anInt1301 < 5) {
				icomponentdefinitions_0.anInt1429 = 5;
				icomponentdefinitions_0.anInt1301 = 5;
			} else {
				if (icomponentdefinitions_0.anInt1429 <= 0) {
					icomponentdefinitions_0.anInt1429 = 5;
				}

				if (icomponentdefinitions_0.anInt1301 <= 0) {
					icomponentdefinitions_0.anInt1301 = 5;
				}
			}
		}

		if (icomponentdefinitions_0.anInt1290 == IComponentDefinitions.anInt1372) {
			client.aClass118_7183 = icomponentdefinitions_0;
		}

		if (bool_3 && icomponentdefinitions_0.anObjectArray1271 != null && (i_5 != icomponentdefinitions_0.anInt1301 || i_6 != icomponentdefinitions_0.anInt1429)) {
			HookRequest hookrequest_7 = new HookRequest();
			hookrequest_7.iComponentDefs = icomponentdefinitions_0;
			hookrequest_7.params = icomponentdefinitions_0.anObjectArray1271;
			client.aClass482_7402.append(hookrequest_7, -1019002091);
		}

	}

}
