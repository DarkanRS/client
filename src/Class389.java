public class Class389 {

	Class389() throws Throwable {
		throw new Error();
	}

	static final void method6696(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 20);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1334;
	}

	static final void method6697(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aBool1356 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.method1858(icomponentdefinitions_0, (byte) 17);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class96_Sub17.method14656(icomponentdefinitions_0.idHash, -768470784);
		}

	}

}
