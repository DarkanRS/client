public class Class295 {

	Class295() throws Throwable {
		throw new Error();
	}

	static final void method5291(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] - 1;
		if (i_4 >= 0 && i_4 <= 9) {
			icomponentdefinitions_0.method1994(i_4, (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr]);
		} else {
			--cs2executor_2.stringStackPtr;
		}
	}
}
