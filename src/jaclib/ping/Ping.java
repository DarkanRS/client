/* Ping - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.ping;

public class Ping {
	private Ping() throws Throwable {
		throw new Error();
	}

	public static native boolean init();

	public static int ping(byte i, byte i_0_, byte i_1_, byte i_2_, long l) throws Throwable {
		int i_3_ = ping0(i, i_0_, i_1_, i_2_, l);
		if (i_3_ < 0)
			throw new Exception(String.valueOf(i_3_));
		return i_3_;
	}

	private static native int ping0(byte i, byte i_4_, byte i_5_, byte i_6_, long l);

	public static native void quit();

	public static int method748(byte i, byte i_7_, byte i_8_, byte i_9_, long l) throws Throwable {
		int i_10_ = ping0(i, i_7_, i_8_, i_9_, l);
		if (i_10_ < 0)
			throw new Exception(String.valueOf(i_10_));
		return i_10_;
	}

	public static int method749(byte i, byte i_11_, byte i_12_, byte i_13_, long l) throws Throwable {
		int i_14_ = ping0(i, i_11_, i_12_, i_13_, l);
		if (i_14_ < 0)
			throw new Exception(String.valueOf(i_14_));
		return i_14_;
	}
}
