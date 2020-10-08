package com.jagex;

import netscape.javascript.JSObject;

import java.applet.Applet;

public class Class441 {

    Class441() throws Throwable {
        throw new Error();
    }

    public static Object method7375(Applet applet_0, String string_1, Object[] arr_2) throws Throwable {
        return JSObject.getWindow(applet_0).call(string_1, arr_2);
    }

    public static void method7376(Applet applet_0, String string_1) throws Throwable {
        JSObject.getWindow(applet_0).eval(string_1);
    }

    public static Object method7377(Applet applet_0, String string_1) throws Throwable {
        return JSObject.getWindow(applet_0).call(string_1, null);
    }

}
