package com.rs.jagex;

public class Class165 {

	static int anInt2035;
	static int anInt2036;
	static int anInt2037;

	static void method2852() {
		if (IndexLoaders.LOADING_STAGE != null) {
			Comparable_Sub1.aClass306_3771 = new Class306();
			Comparable_Sub1.aClass306_3771.method5422(Class302.aLong3562, IndexLoaders.LOADING_STAGE.aClass433_4711.translate(Class223.CURRENT_LANGUAGE), IndexLoaders.LOADING_STAGE.anInt4715, IndexLoaders.LOADING_STAGE);
			VarDefinitionLoader.aThread4520 = new Thread(Comparable_Sub1.aClass306_3771, "");
			VarDefinitionLoader.aThread4520.start();
		}
	}

	static void method2853(boolean bool_0) {
		if (!Class179.aString2225.isEmpty()) {
			Class209.printConsoleMessage("--> " + Class179.aString2225);
			RouteFinder.handleCommand(Class179.aString2225, false, bool_0);
			Class179.anInt2226 = 0;
			if (!bool_0) {
				Class179.anInt2220 = 0;
				Class179.aString2225 = "";
			}
		}
	}

	Class165() throws Throwable {
		throw new Error();
	}
}
