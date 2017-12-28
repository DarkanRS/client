/* SetupInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class SetupInfo extends SimplePeer {
	public native int decodeHeader(TheoraInfo theorainfo, TheoraComment theoracomment, OggPacket oggpacket);

	protected native void clear();

	protected native void q();

	protected native void f();

	protected native void m();
}
