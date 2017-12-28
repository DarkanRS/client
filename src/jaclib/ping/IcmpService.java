/* IcmpService - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.ping;

public abstract class IcmpService implements Runnable {
	protected IcmpService() {
		/* empty */
	}

	protected abstract void notify(int i);

	protected abstract void notify(int i, int i_0_, int i_1_);

	@Override
	public native void run();

	public native void quit();

	public static native boolean available();

	public native void m();

	public native void h();

	protected abstract void method11597(int i);

	protected abstract void method11598(int i);

	protected abstract void method11599(int i, int i_2_, int i_3_);

	protected abstract void method11600(int i, int i_4_, int i_5_);
}
