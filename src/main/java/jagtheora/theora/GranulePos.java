/* GranulePos - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class GranulePos extends SimplePeer {
	static {
		init();
	}

	private static native void init();

	public long position;

	@Override
	protected native void clear();

	@Override
	protected native void f();

	@Override
	protected native void m();

	@Override
	protected native void q();
}
