public class NamedFileReference {

	static AnimationIndexLoader aClass523_411;
	int[] anIntArray410;

	public int method865(int i_1, int i_2) {
		int i_3 = (this.anIntArray410.length >> 1) - 1;
		int i_4 = i_1 & i_3;

		while (true) {
			int i_5 = this.anIntArray410[i_4 + i_4 + 1];
			if (i_5 == -1) {
				return -1;
			}

			if (this.anIntArray410[i_4 + i_4] == i_1) {
				return i_5;
			}

			i_4 = i_4 + 1 & i_3;
		}
	}

	public NamedFileReference(int[] ints_1) {
		int i_2;
		for (i_2 = 1; i_2 <= (ints_1.length >> 1) + ints_1.length; i_2 <<= 1) {
			;
		}

		this.anIntArray410 = new int[i_2 + i_2];

		int i_3;
		for (i_3 = 0; i_3 < i_2 + i_2; i_3++) {
			this.anIntArray410[i_3] = -1;
		}

		int i_4;
		for (i_3 = 0; i_3 < ints_1.length; this.anIntArray410[i_4 + i_4 + 1] = i_3++) {
			for (i_4 = ints_1[i_3] & i_2 - 1; this.anIntArray410[i_4 + i_4 + 1] != -1; i_4 = i_4 + 1 & i_2 - 1) {
				;
			}

			this.anIntArray410[i_4 + i_4] = ints_1[i_3];
		}

	}

	public static Class279 method867(int i_0) {
		return Engine.aClass279_3267;
	}

	static void method868(CS2Executor cs2executor_0, byte b_1) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[--cs2executor_0.intStackPtr], -1396181317);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = questdefinitions_2.anIntArray2961 == null ? 0 : questdefinitions_2.anIntArray2961.length;
	}

	static final void method869(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 == IComponentDefinitions.anInt1283 || i_4 == IComponentDefinitions.anInt1373 || i_4 == IComponentDefinitions.anInt1265) {
			icomponentdefinitions_0.anInt1382 = i_4;
		}

	}

	static final void method870(CS2Executor cs2executor_0) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		IComponentDefinitions icomponentdefinitions_5 = Class117.method1981(i_4, (byte) 9);
		Class282_Sub14.method12221(icomponentdefinitions_5, i_2, i_3, 1698123949);
	}

	static final void method871(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2 + i_3;
	}

}
