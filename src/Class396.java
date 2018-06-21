
/* Class396 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class396 {
	public static String OS_ARCHITECTURE;
	public static String OS_NAME;
	
	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		OS_NAME = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		OS_ARCHITECTURE = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
	}

	Class396() throws Throwable {
		throw new Error();
	}

	static final void method6773(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub15_8203.method12739(-118386335);
	}

	public static void method6774(int i, byte i_0_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(11, (long) i);
		class282_sub50_sub12.method14965((byte) 58);
	}
}
