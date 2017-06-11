/* RuntimeException_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class RuntimeException_Sub2 extends RuntimeException {
	static long aLong6304;
	public static String aString6305;
	public static Applet anApplet6306;
	public static int anInt6307;
	String aString6308;
	Throwable aThrowable6309;

	RuntimeException_Sub2(Throwable throwable, String string) {
		((RuntimeException_Sub2) this).aString6308 = string;
		((RuntimeException_Sub2) this).aThrowable6309 = throwable;
		initCause(throwable);
	}
}
