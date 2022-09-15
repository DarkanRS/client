/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer {
	static {
		init();
	}

	private static native void init();

	private long peer;

	protected SimplePeer() {
		/* empty */
	}

	protected abstract void clear();

	protected abstract void f();

	@Override
	protected void finalize() throws Throwable {
		if (!method6698())
			method6699();
		super.finalize();
	}

	protected abstract void m();

	public boolean method6698() {
		return peer == 0L;
	}

	public void method6699() {
		if (!method6698())
			clear();
	}

	protected abstract void q();

	private void setPeer(long l) {
		peer = l;
	}
}
