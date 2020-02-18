/* TheoraInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {
    static {
        initFields();
    }

    public byte versionMajor;
    public byte versionMinor;
    public byte versionSubMinor;
    public int frameWidth;
    public int frameHeight;
    public int picWidth;
    public int picHeight;
    public int picX;
    public int picY;
    public int fpsNumerator;
    public int fpsDenominator;
    public int aspectNumerator;
    public int aspectDenominator;
    public int colourSpace;
    public int pixelFormat;

    public TheoraInfo() {
        init();
        if (method6698())
            throw new IllegalStateException();
    }

    private static native void initFields();

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
