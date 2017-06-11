/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer {
	private long peer;

	protected SimplePeer() {
		/* empty */
	}

	private static native void init();

	public final boolean a() {
		return peer == 0L;
	}

	private final void setPeer(long l) {
		peer = l;
	}

	public final void f() {
		if (!a())
			clear();
	}

	protected abstract void clear();

	protected void finalize() throws Throwable {
		if (!a())
			f();
		super.finalize();
	}

	static {
		init();
	}

	protected abstract void k();

	protected abstract void d();
}
