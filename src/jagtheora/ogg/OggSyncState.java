/* OggSyncState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer {
	public OggSyncState() {
		init();
		if (a())
			throw new IllegalStateException();
	}

	private native void init();

	public native boolean write(byte[] is, int i);

	public native long pageSeek(OggPage oggpage);

	public native int pageOut(OggPage oggpage);

	public native boolean reset();

	protected native void clear();

	protected native void k();

	protected native void d();
}
