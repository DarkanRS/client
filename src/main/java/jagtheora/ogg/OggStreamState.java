/* OggStreamState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggStreamState extends SimplePeer {
	public OggStreamState(int i) {
		if (!init(i))
			throw new IllegalStateException();
	}

	@Override
	protected native void clear();

	@Override
	protected native void f();

	private native boolean init(int i);

	public native boolean isEOS();

	@Override
	protected native void m();

	public native int packetOut();

	public native int packetOut(OggPacket oggpacket);

	public native int packetPeek();

	public native int packetPeek(OggPacket oggpacket);

	public native boolean pageIn(OggPage oggpage);

	@Override
	protected native void q();

	public native boolean reset();

	public native boolean resetSerialNo(int i);
}
