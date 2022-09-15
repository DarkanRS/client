/* SetupInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class SetupInfo extends SimplePeer {
	@Override
	protected native void clear();

	public native int decodeHeader(TheoraInfo theorainfo, TheoraComment theoracomment, OggPacket oggpacket);

	@Override
	protected native void f();

	@Override
	protected native void m();

	@Override
	protected native void q();
}
