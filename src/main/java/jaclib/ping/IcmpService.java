/* IcmpService - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.ping;

public abstract class IcmpService implements Runnable {
	public static native boolean available();

	protected IcmpService() {
		/* empty */
	}

	public native void h();

	public native void m();

	protected abstract void method11597();

	protected abstract void method11598();

	protected abstract void method11599(int i, int i_2_, int i_3_);

	protected abstract void method11600(int i, int i_4_, int i_5_);

	protected abstract void notify(int i);

	public native void quit();

	@Override
	public native void run();
}
