public abstract class Class109 {

	abstract void method1849(byte var1);

	abstract void method1850();

	abstract void method1851();

	static final void method1852(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1311 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.anInt1311 > icomponentdefinitions_0.anInt1376 - icomponentdefinitions_0.anInt1301) {
			icomponentdefinitions_0.anInt1311 = icomponentdefinitions_0.anInt1376 - icomponentdefinitions_0.anInt1301;
		}
		if (icomponentdefinitions_0.anInt1311 < 0) {
			icomponentdefinitions_0.anInt1311 = 0;
		}
		icomponentdefinitions_0.anInt1312 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		if (icomponentdefinitions_0.anInt1312 > icomponentdefinitions_0.anInt1314 - icomponentdefinitions_0.anInt1429) {
			icomponentdefinitions_0.anInt1312 = icomponentdefinitions_0.anInt1314 - icomponentdefinitions_0.anInt1429;
		}
		if (icomponentdefinitions_0.anInt1312 < 0) {
			icomponentdefinitions_0.anInt1312 = 0;
		}
		redrawComponent(icomponentdefinitions_0, (byte) 19);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class468_Sub12.method12709(icomponentdefinitions_0.idHash, (byte) 67);
		}
	}

	public static void redrawComponent(IComponentDefinitions icomponentdefinitions_0, byte b_1) {
		if (icomponentdefinitions_0.anInt1450 == client.anInt7408) {
			client.aBoolArray7443[icomponentdefinitions_0.anInt1449] = true;
		}
	}

	static void method1859(Index index_0, int i_1, int i_2, int i_3, boolean bool_4, long long_5, int i_7, int i_8) {
		Class148.anInt1730 = 1;
		Class75.aClass317_746 = index_0;
		Class6.anInt46 = i_1;
		Class148.anInt1738 = i_2;
		Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
		Class158_Sub2_Sub3.anInt10243 = i_3;
		Class152.aBool1962 = bool_4;
		Class96_Sub22.anInt9440 = 10000;
		Class148.aLong1740 = long_5;
		Class383.anInt4664 = i_7;
	}
}
