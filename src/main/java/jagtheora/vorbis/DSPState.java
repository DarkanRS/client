/* DSPState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class DSPState extends SimplePeer {
	public DSPState(VorbisInfo vorbisinfo) {
		init(vorbisinfo);
		if (method6698())
			throw new IllegalStateException();
	}

	public native void blockIn(VorbisBlock vorbisblock);

	@Override
	protected native void clear();

	@Override
	protected native void f();

	public native double granuleTime();

	private native void init(VorbisInfo vorbisinfo);

	@Override
	protected native void m();

	public native float[][] pcmOut(int i);

	@Override
	protected native void q();

	public native void read(int i);
}
