public class Class295 {

	Class295() throws Throwable {
		throw new Error();
	}

	static void method5290(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[cs2executor_0.intStackPtr - 1] = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[cs2executor_0.intStackPtr - 1], -1396181317).method4099(Class158_Sub1.PLAYER_VAR_PROVIDER, 54222589) ? 1 : 0;
	}

	static final void method5291(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] - 1;
		if (i_4 >= 0 && i_4 <= 9) {
			icomponentdefinitions_0.method1994(i_4, (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr], (byte) -12);
		} else {
			--cs2executor_2.stringStackPtr;
		}

	}

	static final void method5292(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class335.anIntArray3916[Class372.method6362(i_2, 1349115277) & 0xffff];
	}

}
