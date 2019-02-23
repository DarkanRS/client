public class Class359 {

	static int anInt4163;

	Class359() throws Throwable {
		throw new Error();
	}

	static void method6241(RsByteBuffer rsbytebuffer_0, int i_1) {
		for (int i_2 = 0; i_2 < Class4.anInt34; i_2++) {
			int i_3 = rsbytebuffer_0.readUnsignedSmart(1888630053);
			int i_4 = rsbytebuffer_0.readUnsignedShort();
			if (i_4 == 65535) {
				i_4 = -1;
			}

			if (Class244.aClass217_Sub1Array3006[i_3] != null) {
				Class244.aClass217_Sub1Array3006[i_3].anInt2701 = i_4;
			}
		}

	}

	static final void method6242(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 5;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		int i_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 3];
		int i_6 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 4];
		if (i_4 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_7 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_4, (byte) 8);
			if (i_3 != enumdefinitions_7.aChar5146) {
				throw new RuntimeException();
			} else if (i_2 != enumdefinitions_7.aChar5140) {
				throw new RuntimeException();
			} else {
				int[] ints_8 = enumdefinitions_7.method7251(Integer.valueOf(i_5), 2099453599);
				if (i_6 >= 0 && ints_8 != null && ints_8.length > i_6) {
					cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = ints_8[i_6];
				} else {
					throw new RuntimeException();
				}
			}
		}
	}

	static final void method6243(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.anInt7000 -= 2;
		String string_2 = (String) cs2executor_0.objectStack[cs2executor_0.anInt7000];
		String string_3 = (String) cs2executor_0.objectStack[cs2executor_0.anInt7000 + 1];
		if (Class84.myPlayer.playerAppearance != null && Class84.myPlayer.playerAppearance.aBool2929) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_3;
		} else {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_2;
		}

	}

	static final void method6244(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1289 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1375 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.method1858(icomponentdefinitions_0, (byte) 14);
		Class44.method913(interface_1, icomponentdefinitions_0, (byte) 1);
		if (icomponentdefinitions_0.anInt1268 == 0) {
			Class12.method483(interface_1, icomponentdefinitions_0, false, -1114649951);
		}

	}

}
