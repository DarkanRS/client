/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public class NativeHeap {
    private final int anInt347;
    long peer;
    private boolean aBool348;

    public NativeHeap(int i) {
        anInt347 = i * -1278684715;
        allocateHeap(anInt347 * -217718915);
        aBool348 = true;
    }

    synchronized boolean method758() {
        return aBool348;
    }

    public NativeHeapBuffer method759(int i, boolean bool) {
        if (!aBool348)
            throw new IllegalStateException();
        return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }

    public synchronized void method760() {
        if (aBool348)
            deallocateHeap();
        aBool348 = false;
    }

    private native void allocateHeap(int i);

    private native void deallocateHeap();

    synchronized native int allocateBuffer(int i, boolean bool);

    synchronized native long getBufferAddress(int i);

    synchronized native void get(int i, byte[] is, int i_0_, int i_1_, int i_2_);

    synchronized native void put(int i, byte[] is, int i_3_, int i_4_, int i_5_);

    synchronized native void deallocateBuffer(int i);

    public synchronized native void copy(long l, long l_6_, int i);

    @Override
    protected synchronized void finalize() throws Throwable {
        super.finalize();
        method760();
    }

    protected synchronized void method761() throws Throwable {
        super.finalize();
        method760();
    }

    protected synchronized void method762() throws Throwable {
        super.finalize();
        method760();
    }

    synchronized boolean method763() {
        return aBool348;
    }

    synchronized boolean method764() {
        return aBool348;
    }

    synchronized boolean method765() {
        return aBool348;
    }

    public NativeHeapBuffer method766(int i, boolean bool) {
        if (!aBool348)
            throw new IllegalStateException();
        return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }

    public NativeHeapBuffer method767(int i, boolean bool) {
        if (!aBool348)
            throw new IllegalStateException();
        return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }

    public synchronized void method768() {
        if (aBool348)
            deallocateHeap();
        aBool348 = false;
    }

    public synchronized void method769() {
        if (aBool348)
            deallocateHeap();
        aBool348 = false;
    }
}
