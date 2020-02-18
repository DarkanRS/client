/* VorbisBlock - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer {
    public VorbisBlock(DSPState dspstate) {
        init(dspstate);
        if (method6698())
            throw new IllegalStateException();
    }

    private native void init(DSPState dspstate);

    public native int synthesis(OggPacket oggpacket);

    @Override
    protected native void clear();

    @Override
    protected native void q();

    @Override
    protected native void f();

    @Override
    protected native void m();
}
