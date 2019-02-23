import java.applet.Applet;

public class RuntimeException_Sub3 extends RuntimeException {

	public static int anInt10457;
	public static String aString10458;
	static long aLong10459;
	public static Applet anApplet10460;
	String aString10461;
	Throwable aThrowable10462;

	RuntimeException_Sub3(Throwable throwable_1, String string_2) {
		this.aString10461 = string_2;
		this.aThrowable10462 = throwable_1;
		this.initCause(throwable_1);
	}

}
