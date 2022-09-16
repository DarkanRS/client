/* OggSyncState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer {
	public OggSyncState() {
		init();
		if (method6698())
			throw new IllegalStateException();
	}

	@Override
	protected native void clear();

	@Override
	protected native void f();

	private native void init();

	@Override
	protected native void m();

	public native int pageOut(OggPage oggpage);

	public native long pageSeek(OggPage oggpage);

	@Override
	protected native void q();

	public native boolean reset();

	public native boolean write(byte[] is, int i);
}
