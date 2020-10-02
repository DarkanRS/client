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

    private native boolean init(int i);

    public native boolean isEOS();

    public native boolean pageIn(OggPage oggpage);

    public native int packetOut(OggPacket oggpacket);

    public native int packetOut();

    public native int packetPeek(OggPacket oggpacket);

    public native int packetPeek();

    public native boolean resetSerialNo(int i);

    public native boolean reset();

    @Override
    protected native void clear();

    @Override
    protected native void q();

    @Override
    protected native void f();

    @Override
    protected native void m();
}
