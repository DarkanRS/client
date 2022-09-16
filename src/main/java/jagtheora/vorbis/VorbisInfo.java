/* VorbisInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer {
	static {
		initFields();
	}

	private static native void initFields();
	public int channels;

	public int rate;

	public VorbisInfo() {
		init();
		if (method6698())
			throw new IllegalStateException();
	}

	@Override
	protected native void clear();

	@Override
	protected native void f();

	public native int headerIn(VorbisComment vorbiscomment, OggPacket oggpacket);

	private native void init();

	@Override
	protected native void m();

	@Override
	protected native void q();
}
