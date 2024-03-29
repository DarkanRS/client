/* DecoderContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class DecoderContext extends SimplePeer {
	public DecoderContext(TheoraInfo theorainfo, SetupInfo setupinfo) {
		init(theorainfo, setupinfo);
		if (method6698())
			throw new IllegalArgumentException("");
	}

	@Override
	protected native void clear();

	public native int decodeFrame(Frame frame);

	public native int decodePacketIn(OggPacket oggpacket, GranulePos granulepos);

	@Override
	protected native void f();

	public native int getMaxPostProcessingLevel();

	public native long granuleFrame(GranulePos granulepos);

	public native double granuleTime(GranulePos granulepos);

	private native void init(TheoraInfo theorainfo, SetupInfo setupinfo);

	@Override
	protected native void m();

	@Override
	protected native void q();

	public native int setGranulePosition(long l);

	public native int setPostProcessingLevel(int i);
}
