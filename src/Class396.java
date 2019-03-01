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

	static final void method6773(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.idleAnimations.getValue(-118386335);
	}

	public static void method6774(int i_0, byte b_1) {
		Class282_Sub50_Sub12 class282_sub50_sub12_2 = Engine.getIComponentVar(11, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) 58);
	}

}
