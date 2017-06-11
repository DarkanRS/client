/* VorbisBlock - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer {
	public VorbisBlock(DSPState dspstate) {
		init(dspstate);
		if (a())
			throw new IllegalStateException();
	}

	private native void init(DSPState dspstate);

	public native int synthesis(OggPacket oggpacket);

	protected native void clear();

	protected native void k();

	protected native void d();
}
