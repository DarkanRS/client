/* GranulePos - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class GranulePos extends SimplePeer {
    static {
        init();
    }

    public long position;

    private static native void init();

    @Override
    protected native void clear();

    @Override
    protected native void q();

    @Override
    protected native void f();

    @Override
    protected native void m();
}
