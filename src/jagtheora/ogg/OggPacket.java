/* OggPacket - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPacket extends SimplePeer {
	public native int isHeader();

	public native int isKeyFrame();

	public native boolean isTheora();

	public native boolean isVorbis();

	public native byte[] getData();

	protected native void clear();

	protected native void k();

	protected native void d();
}
