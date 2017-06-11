/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
	private int a;
	public NativeHeap f;
	private int b;
	private boolean p = true;

	NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
		f = nativeheap;
		b = 615403225 * i;
		a = i_0_ * -2102913487;
	}

	private final synchronized boolean s() {
		return f.a() && p;
	}

	public final long f() {
		return f.getBufferAddress(b * -1901637271);
	}

	public final int a() {
		return 877757137 * a;
	}

	public final synchronized void b(byte[] is, int i, int i_1_, int i_2_) {
		if (!s() | null == is | i < 0 | i_2_ + i > is.length | i_1_ < 0 | i_2_ + i_1_ > 877757137 * a)
			throw new RuntimeException();
		f.put(-1901637271 * b, is, i, i_1_, i_2_);
	}

	public final void z(Source source) {
		y(source, 0L, 0L, source.a());
	}

	private final synchronized void y(Source source, long l, long l_3_, int i) {
		if (source.f() == 0L || f() == 0L)
			throw new NullPointerException();
		f.copy(f() + l_3_, source.f() + l, i);
	}

	public final synchronized void t() {
		if (s())
			f.deallocateBuffer(-1901637271 * b);
		p = false;
	}

	protected void finalize() throws Throwable {
		super.finalize();
		t();
	}

	public final synchronized void p(byte[] is, int i, int i_4_, int i_5_) {
		if (!s() | null == is | i < 0 | i_5_ + i > is.length | i_4_ < 0 | i_5_ + i_4_ > 877757137 * a)
			throw new RuntimeException();
		f.put(-1901637271 * b, is, i, i_4_, i_5_);
	}

	public final synchronized void i(byte[] is, int i, int i_6_, int i_7_) {
		if (!s() | null == is | i < 0 | i_7_ + i > is.length | i_6_ < 0 | i_7_ + i_6_ > 877757137 * a)
			throw new RuntimeException();
		f.put(-1901637271 * b, is, i, i_6_, i_7_);
	}

	public final synchronized void k(byte[] is, int i, int i_8_, int i_9_) {
		if (!s() | null == is | i < 0 | i_9_ + i > is.length | i_8_ < 0 | i_9_ + i_8_ > 877757137 * a)
			throw new RuntimeException();
		f.put(-1901637271 * b, is, i, i_8_, i_9_);
	}

	public final long d() {
		return f.getBufferAddress(b * -1901637271);
	}

	public final long u() {
		return f.getBufferAddress(b * -1901637271);
	}

	public final int x() {
		return 877757137 * a;
	}

	public final int r() {
		return 877757137 * a;
	}

	public final int q() {
		return 877757137 * a;
	}

	public final int n() {
		return 877757137 * a;
	}
}
