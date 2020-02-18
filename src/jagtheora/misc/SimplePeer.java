/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer {
    static {
        init();
    }

    private long peer;

    protected SimplePeer() {
        /* empty */
    }

    private static native void init();

    public boolean method6698() {
        return peer == 0L;
    }

    private void setPeer(long l) {
        peer = l;
    }

    public void method6699() {
        if (!method6698()) {
            clear();
        }
    }

    protected abstract void clear();

    @Override
    protected void finalize() throws Throwable {
        if (!method6698()) {
            method6699();
        }
        super.finalize();
    }

    protected abstract void q();

    protected abstract void f();

    protected abstract void m();
}
