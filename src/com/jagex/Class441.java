package com.jagex;
import java.applet.Applet;
import netscape.javascript.JSObject;

public class Class441 {

	public static Object method7375(Applet applet_0, String string_1, Object[] arr_2, int i_3) throws Throwable {
		return JSObject.getWindow(applet_0).call(string_1, arr_2);
	}

	public static void method7376(Applet applet_0, String string_1, byte b_2) throws Throwable {
		JSObject.getWindow(applet_0).eval(string_1);
	}

	public static Object method7377(Applet applet_0, String string_1, int i_2) throws Throwable {
		return JSObject.getWindow(applet_0).call(string_1, (Object[]) null);
	}

	Class441() throws Throwable {
		throw new Error();
	}

}
