/* OggPacket - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPacket extends SimplePeer {
	@Override
	protected native void clear();

	@Override
	protected native void f();

	public native byte[] getData();

	public native int isHeader();

	public native int isKeyFrame();

	public native boolean isTheora();

	public native boolean isVorbis();

	@Override
	protected native void m();

	@Override
	protected native void q();
}
