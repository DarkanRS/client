/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer {
    private long peer;

    protected SimplePeer() {
        /* empty */
    }

    private static native void init();

    public final boolean method6698() {
        return peer == 0L;
    }

    private final void setPeer(long l) {
        peer = l;
    }

    public final void method6699() {
        if (!method6698())
            clear();
    }

    protected abstract void clear();

    protected void finalize() throws Throwable {
        if (!method6698())
            method6699();
        super.finalize();
    }

    static {
        init();
    }

    protected void method6700() throws Throwable {
        if (!method6698())
            method6699();
        super.finalize();
    }

    protected void method6701() throws Throwable {
        if (!method6698())
            method6699();
        super.finalize();
    }

    public final boolean method6702() {
        return peer == 0L;
    }

    public final boolean method6703() {
        return peer == 0L;
    }

    public final void method6704() {
        if (!method6698())
            clear();
    }

    public final void method6705() {
        if (!method6698())
            clear();
    }

    protected abstract void q();

    protected abstract void f();

    protected abstract void m();
}
