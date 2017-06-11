/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
	long peer;
	private int a;
	private boolean f;

	public NativeHeap(int i) {
		a = 1264911109 * i;
		allocateHeap(-368553523 * a);
		f = true;
	}

	synchronized boolean a() {
		return f;
	}

	public NativeHeapBuffer f(int i, boolean bool) {
		if (!f)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public synchronized void b() {
		if (f)
			deallocateHeap();
		f = false;
	}

	private native void allocateHeap(int i);

	private native void deallocateHeap();

	synchronized native int allocateBuffer(int i, boolean bool);

	synchronized native long getBufferAddress(int i);

	synchronized native void get(int i, byte[] is, int i_0_, int i_1_, int i_2_);

	synchronized native void put(int i, byte[] is, int i_3_, int i_4_, int i_5_);

	synchronized native void deallocateBuffer(int i);

	public synchronized native void copy(long l, long l_6_, int i);

	protected void finalize() throws Throwable {
		super.finalize();
		b();
	}
}
