import java.awt.Canvas;

public class Class88 {

	Class88() throws Throwable {
		throw new Error();
	}

	static synchronized GraphicalRenderer method1493(int i_0, Canvas canvas_1, Interface22 interface22_2, Index index_3, int i_4, int i_5, int i_6) {
		if (i_0 == 0) {
			return Class109_Sub1.method14652(canvas_1, interface22_2, i_5, i_6);
		} else if (i_0 == 2) {
			return FontRenderer.method404(canvas_1, interface22_2, i_5, i_6);
		} else if (i_0 == 1) {
			return Class171.method2909(canvas_1, interface22_2, i_4);
		} else if (i_0 == 5) {
			return Class315.getOpenGLRenderer(canvas_1, interface22_2, index_3, i_4);
		} else if (i_0 == 3) {
			return Class374.getDirectXRenderer(canvas_1, interface22_2, index_3, i_4);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	static final void method1494(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, byte b_2) {
		int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
		if (icomponentdefinitions_0.anInt1329 != 2) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.anInt1330);
			if (icomponentdefinitions_0.aClass417_1308 == null) {
				icomponentdefinitions_0.aClass417_1308 = new Class417(npcdefinitions_5, false);
			}

			icomponentdefinitions_0.aClass417_1308.aLong4993 = Class86.method1480(1471250768);
			if (i_4 >= 0 && i_4 < npcdefinitions_5.anIntArray4860.length) {
				icomponentdefinitions_0.aClass417_1308.anIntArray4992[i_4] = i_3;
				Class109.redrawComponent(icomponentdefinitions_0, (byte) 54);
			} else {
				throw new RuntimeException("");
			}
		}
	}

	static void method1495(String[] arr_0, short[] shorts_1, int i_2, int i_3, int i_4) {
		if (i_2 < i_3) {
			int i_5 = (i_3 + i_2) / 2;
			int i_6 = i_2;
			String string_7 = arr_0[i_5];
			arr_0[i_5] = arr_0[i_3];
			arr_0[i_3] = string_7;
			short s_8 = shorts_1[i_5];
			shorts_1[i_5] = shorts_1[i_3];
			shorts_1[i_3] = s_8;

			for (int i_9 = i_2; i_9 < i_3; i_9++) {
				if (string_7 == null || arr_0[i_9] != null && arr_0[i_9].compareTo(string_7) < (i_9 & 0x1)) {
					String string_10 = arr_0[i_9];
					arr_0[i_9] = arr_0[i_6];
					arr_0[i_6] = string_10;
					short s_11 = shorts_1[i_9];
					shorts_1[i_9] = shorts_1[i_6];
					shorts_1[i_6++] = s_11;
				}
			}

			arr_0[i_3] = arr_0[i_6];
			arr_0[i_6] = string_7;
			shorts_1[i_3] = shorts_1[i_6];
			shorts_1[i_6] = s_8;
			method1495(arr_0, shorts_1, i_2, i_6 - 1, -109372868);
			method1495(arr_0, shorts_1, i_6 + 1, i_3, -805435373);
		}

	}

}
