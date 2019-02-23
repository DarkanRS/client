import java.util.LinkedList;

public class Class337 {

	static LinkedList aLinkedList3969 = new LinkedList();

	Class337() throws Throwable {
		throw new Error();
	}

	static final void method6016(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 101);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class521_Sub1_Sub4.method14892(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 79);
	}

	public static void unloadInterface(int i_0, int i_1) {
		WorldMapIndexLoader.aBoolArray2709[i_0] = false;
		Class12.clearComponents(i_0, -1495607995);
	}

	static final void method6018(Class521_Sub1 class521_sub1_0, CS2Executor cs2executor_1, int i_2) {
		boolean bool_3 = false;
		int i_4 = 0;
		int i_5 = 0;
		int i_6 = 0;
		int i_7 = 0;
		if (class521_sub1_0.aClass275_Sub5Array7965 != null) {
			for (int i_8 = 0; i_8 < class521_sub1_0.aClass275_Sub5Array7965.length; i_8++) {
				Class275_Sub5 class275_sub5_9 = class521_sub1_0.aClass275_Sub5Array7965[i_8];
				if (class275_sub5_9.aBool7849) {
					int i_10;
					int i_11;
					if (class275_sub5_9.anInt7850 < class275_sub5_9.anInt7847) {
						i_10 = class275_sub5_9.anInt7850 - class275_sub5_9.anInt7851;
						i_11 = class275_sub5_9.anInt7851 + class275_sub5_9.anInt7847;
					} else {
						i_10 = class275_sub5_9.anInt7847 - class275_sub5_9.anInt7851;
						i_11 = class275_sub5_9.anInt7850 + class275_sub5_9.anInt7851;
					}

					int i_12;
					int i_13;
					if (class275_sub5_9.anInt7846 < class275_sub5_9.anInt7848) {
						i_12 = class275_sub5_9.anInt7846 - class275_sub5_9.anInt7851;
						i_13 = class275_sub5_9.anInt7851 + class275_sub5_9.anInt7848;
					} else {
						i_12 = class275_sub5_9.anInt7848 - class275_sub5_9.anInt7851;
						i_13 = class275_sub5_9.anInt7846 + class275_sub5_9.anInt7851;
					}

					if (!bool_3 || i_10 < i_4) {
						i_4 = i_10;
					}

					if (!bool_3 || i_12 < i_5) {
						i_5 = i_12;
					}

					if (!bool_3 || i_11 > i_6) {
						i_6 = i_11;
					}

					if (!bool_3 || i_13 > i_7) {
						i_7 = i_13;
					}

					bool_3 = true;
				}
			}
		}

		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = bool_3 ? 1 : 0;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_4;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_5;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_6;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_7;
	}

}
