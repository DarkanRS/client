package com.jagex;

import java.io.File;

public class Class396 {

    public static String OS_NAME;

    public static String OS_ARCHITECTURE;

    static {
        String str_0 = "Unknown";
        try {
            str_0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception ignored) {
        }
        str_0.toLowerCase();
        str_0 = "Unknown";
        try {
            str_0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception ignored) {
        }
        str_0.toLowerCase();
        str_0 = "Unknown";
        try {
            str_0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception ignored) {
        }
        OS_NAME = str_0.toLowerCase();
        str_0 = "Unknown";
        try {
            str_0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception ignored) {
        }
        OS_ARCHITECTURE = str_0.toLowerCase();
        str_0 = "Unknown";
        try {
            str_0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception ignored) {
        }
        str_0.toLowerCase();
        str_0 = "~/";
        try {
            str_0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception ignored) {
        }
        new File(str_0);
    }

    Class396() throws Throwable {
        throw new Error();
    }
}
