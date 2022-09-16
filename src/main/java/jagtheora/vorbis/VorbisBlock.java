/* VorbisBlock - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer {
	public VorbisBlock(DSPState dspstate) {
		init(dspstate);
		if (method6698())
			throw new IllegalStateException();
	}

	@Override
	protected native void clear();

	@Override
	protected native void f();

	private native void init(DSPState dspstate);

	@Override
	protected native void m();

	@Override
	protected native void q();

	public native int synthesis(OggPacket oggpacket);
}
