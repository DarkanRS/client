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

    private native void init(VorbisInfo vorbisinfo);

    public native void blockIn(VorbisBlock vorbisblock);

    public native float[][] pcmOut(int i);

    public native void read(int i);

    public native double granuleTime();

    @Override
    protected native void clear();

    @Override
    protected native void q();

    @Override
    protected native void f();

    @Override
    protected native void m();
}
