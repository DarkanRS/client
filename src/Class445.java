public class Class445 {

	static String aString5384;
	public static Class445 aClass445_5381 = new Class445();
	public static Class445 aClass445_5380 = new Class445();
	public static Class445 aClass445_5382 = new Class445();
	public static Class445 aClass445_5383 = new Class445();

	static final void method7428(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = ((Player) cs2executor_0.animable).aClass155_10561.method2626(i_2, (byte) 56);
	}

	static final void method7429(IComponentDefinitions icomponentdefinitions_0, int i_1, byte[] bytes_2, byte[] bytes_3, CS2Executor cs2executor_4, int i_5) {
		if (icomponentdefinitions_0.aByteArrayArray1366 == null) {
			if (bytes_2 == null) {
				return;
			}

			icomponentdefinitions_0.aByteArrayArray1366 = new byte[11][];
			icomponentdefinitions_0.aByteArrayArray1367 = new byte[11][];
			icomponentdefinitions_0.anIntArray1395 = new int[11];
			icomponentdefinitions_0.anIntArray1267 = new int[11];
		}

		icomponentdefinitions_0.aByteArrayArray1366[i_1] = bytes_2;
		if (bytes_2 != null) {
			icomponentdefinitions_0.aBool1424 = true;
		} else {
			icomponentdefinitions_0.aBool1424 = false;

			for (int i_6 = 0; i_6 < icomponentdefinitions_0.aByteArrayArray1366.length; i_6++) {
				if (icomponentdefinitions_0.aByteArrayArray1366[i_6] != null || icomponentdefinitions_0.anIntArray1267[i_6] > 0) {
					icomponentdefinitions_0.aBool1424 = true;
					break;
				}
			}
		}

		icomponentdefinitions_0.aByteArrayArray1367[i_1] = bytes_3;
	}

}
