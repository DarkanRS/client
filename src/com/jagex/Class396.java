package com.jagex;
import java.io.File;

public class Class396 {

	public static String OS_NAME;

	public static String OS_ARCHITECTURE;

	static {
		String str_0 = "Unknown";
		try {
			str_0 = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception_7) {
			;
		}
		str_0.toLowerCase();
		str_0 = "Unknown";
		try {
			str_0 = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception_6) {
			;
		}
		str_0.toLowerCase();
		str_0 = "Unknown";
		try {
			str_0 = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception_5) {
			;
		}
		OS_NAME = str_0.toLowerCase();
		str_0 = "Unknown";
		try {
			str_0 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception_4) {
			;
		}
		OS_ARCHITECTURE = str_0.toLowerCase();
		str_0 = "Unknown";
		try {
			str_0 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception_3) {
			;
		}
		str_0.toLowerCase();
		str_0 = "~/";
		try {
			str_0 = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception_2) {
			;
		}
		new File(str_0);
	}

	Class396() throws Throwable {
		throw new Error();
	}

	public static void method6774(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(11, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) 58);
	}
}
