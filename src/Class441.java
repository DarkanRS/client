
/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class441 {
	public static Object method7375(Applet applet, String string, Object[] objects, int i) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	public static void method7376(Applet applet, String string, byte i) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}

	public static Object method7377(Applet applet, String string, int i) throws Throwable {
		return JSObject.getWindow(applet).call(string, null);
	}

	public static Object method7378(Applet applet, String string, Object[] objects) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	Class441() throws Throwable {
		throw new Error();
	}

	public static void method7379(Applet applet, String string) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}

	public static void method7380(Applet applet, String string) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}

	public static Object method7381(Applet applet, String string, Object[] objects) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	public static void method7382(Applet applet, String string) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}

	public static Object method7383(Applet applet, String string, Object[] objects) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}
}
