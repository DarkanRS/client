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
}
