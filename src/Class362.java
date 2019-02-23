public class Class362 {

	Class362() throws Throwable {
		throw new Error();
	}

	public static final void method6276(int i_0) {
		OutputStream_Sub1.anImage7953 = null;
		SpotAnimIndexLoader.aFont5893 = null;
	}

	static final String[] method6277(String[] arr_0, short s_1) {
		String[] arr_2 = new String[5];

		for (int i_3 = 0; i_3 < 5; i_3++) {
			arr_2[i_3] = i_3 + " ";
			if (arr_0 != null && arr_0[i_3] != null) {
				arr_2[i_3] = arr_2[i_3] + arr_0[i_3];
			}
		}

		return arr_2;
	}

	public static Interface36 getNativeLibraryLoader(int i_0) {
		if (Class404.LIBRARY_LOADER == null) {
			throw new IllegalStateException("");
		} else {
			return Class404.LIBRARY_LOADER;
		}
	}

	static final void method6279(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub20_8207.method7785(i_2, -915062041);
	}

	static final void method6280(CS2Executor cs2executor_0, int i_1) {
		client.aBool7189 = true;
		Class188.method3142(69417195);
	}

	static final void method6281(CS2Executor cs2executor_0, int i_1) {
		Class163 class163_2 = cs2executor_0.animable.method15811(767923452);
		if (class163_2 == null) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
		} else {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = class163_2.method2829(-766550436);
		}

	}

}
