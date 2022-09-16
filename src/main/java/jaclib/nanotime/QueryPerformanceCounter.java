/* QueryPerformanceCounter - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.nanotime;

public class QueryPerformanceCounter {
	public static native boolean init();

	public static native long nanoTime();

	public static native void quit();

	private QueryPerformanceCounter() throws Throwable {
		throw new Error();
	}
}
