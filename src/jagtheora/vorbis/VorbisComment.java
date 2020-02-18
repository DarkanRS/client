/* VorbisComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {
    public VorbisComment() {
        init();
        if (method6698())
            throw new IllegalStateException();
    }

    private native void init();

    @Override
    protected native void clear();

    @Override
    protected native void q();

    @Override
    protected native void f();

    @Override
    protected native void m();
}
