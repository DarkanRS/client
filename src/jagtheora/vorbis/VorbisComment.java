/* VorbisComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {
	public VorbisComment() {
		init();
		if (a())
			throw new IllegalStateException();
	}

	private native void init();

	protected native void clear();

	protected native void k();

	protected native void d();
}
