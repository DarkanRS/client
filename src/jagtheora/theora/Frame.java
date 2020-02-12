/* Frame - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {
    public int anInt9119;
    public int anInt9120;
    public int[] pixels;

    public Frame(int i, int i_0_) {
        anInt9119 = i * -317525331;
        anInt9120 = -326049555 * i_0_;
        pixels = new int[anInt9119 * 416891173 * (12877029 * anInt9120)];
    }

    private static native void init();

    protected native void clear();

    static {
        init();
    }

    protected native void q();

    protected native void f();

    protected native void m();
}
