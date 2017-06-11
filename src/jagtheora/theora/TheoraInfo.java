/* TheoraInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {
	public byte versionMajor;
	public byte versionMinor;
	public byte versionSubMinor;
	public int frameWidth;
	public int frameHeight;
	public int picWidth;
	public int picHeight;
	public int picX;
	public int picY;
	public int fpsNumerator;
	public int fpsDenominator;
	public int aspectNumerator;
	public int aspectDenominator;
	public int colourSpace;
	public int pixelFormat;

	public TheoraInfo() {
		init();
		if (a())
			throw new IllegalStateException();
	}

	private static native void initFields();

	private native void init();

	protected native void clear();

	static {
		initFields();
	}

	protected native void k();

	protected native void d();
}
