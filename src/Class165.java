public class Class165 {

	static int anInt2035;
	static int anInt2036;
	static int anInt2037;

	Class165() throws Throwable {
		throw new Error();
	}

	static void method2852(int i_0) {
		if (IndexLoaders.LOADING_STAGE != null) {
			Class328.aClass306_3771 = new Class306();
			Class328.aClass306_3771.method5422(Class302.aLong3562, IndexLoaders.LOADING_STAGE.aClass433_4711.translate(Class223.CURRENT_LANGUAGE), IndexLoaders.LOADING_STAGE.anInt4715, IndexLoaders.LOADING_STAGE, 2034622208);
			VarDefinitionLoader.aThread4520 = new Thread(Class328.aClass306_3771, "");
			VarDefinitionLoader.aThread4520.start();
		}
	}

	static void method2853(boolean bool_0, int i_1) {
		if (Class179.aString2225.length() != 0) {
			Class209.printConsoleMessage("--> " + Class179.aString2225);
			RouteFinder.handleCommand(Class179.aString2225, false, bool_0);
			Class179.anInt2226 = 0;
			if (!bool_0) {
				Class179.anInt2220 = 0;
				Class179.aString2225 = "";
			}
		}
	}
}
