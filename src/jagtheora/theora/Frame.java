/* Frame - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {
	public int a;
	public int f;
	public int[] pixels;

	public Frame(int i, int i_0_) {
		a = i * -1504155185;
		f = -156270913 * i_0_;
		pixels = new int[1264450863 * a * (-1459424961 * f)];
	}

	private static native void init();

	protected native void clear();

	static {
		init();
	}

	protected native void k();

	protected native void d();
}
