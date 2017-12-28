/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
	private int anInt613;
	public NativeHeap aNativeHeap614;
	private int anInt615;
	private boolean aBool616 = true;

	NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
		aNativeHeap614 = nativeheap;
		anInt615 = 1346921541 * i;
		anInt613 = -621632105 * i_0_;
	}

	private final synchronized boolean method1175() {
		return aNativeHeap614.method758() && aBool616;
	}

	public final long method2() {
		return aNativeHeap614.getBufferAddress(anInt615 * 182521485);
	}

	public final int method1() {
		return anInt613 * 13773351;
	}

	public final synchronized void method116(byte[] is, int i, int i_1_, int i_2_) {
		if (!method1175() | is == null | i < 0 | i + i_2_ > is.length | i_1_ < 0 | i_2_ + i_1_ > anInt613 * 13773351)
			throw new RuntimeException();
		aNativeHeap614.put(anInt615 * 182521485, is, i, i_1_, i_2_);
	}

	public final void method1176(Source source) {
		method1177(source, 0L, 0L, source.method1());
	}

	private final synchronized void method1177(Source source, long l, long l_3_, int i) {
		if (source.method2() == 0L || method2() == 0L)
			throw new NullPointerException();
		aNativeHeap614.copy(method2() + l_3_, source.method2() + l, i);
	}

	public final synchronized void method1178() {
		if (method1175())
			aNativeHeap614.deallocateBuffer(182521485 * anInt615);
		aBool616 = false;
	}

	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		method1178();
	}

	public final synchronized void method117(byte[] is, int i, int i_4_, int i_5_) {
		if (!method1175() | is == null | i < 0 | i + i_5_ > is.length | i_4_ < 0 | i_5_ + i_4_ > anInt613 * 13773351)
			throw new RuntimeException();
		aNativeHeap614.put(anInt615 * 182521485, is, i, i_4_, i_5_);
	}

	protected final synchronized void method1179() throws Throwable {
		super.finalize();
		method1178();
	}

	protected final synchronized void method1180() throws Throwable {
		super.finalize();
		method1178();
	}

	public final int method3() {
		return anInt613 * 13773351;
	}

	public final int method4() {
		return anInt613 * 13773351;
	}

	public final long method5() {
		return aNativeHeap614.getBufferAddress(anInt615 * 182521485);
	}

	public final long method6() {
		return aNativeHeap614.getBufferAddress(anInt615 * 182521485);
	}

	public final long method7() {
		return aNativeHeap614.getBufferAddress(anInt615 * 182521485);
	}

	public final long method8() {
		return aNativeHeap614.getBufferAddress(anInt615 * 182521485);
	}

	private final synchronized boolean method1181() {
		return aNativeHeap614.method758() && aBool616;
	}

	public final void method1182(Source source) {
		method1177(source, 0L, 0L, source.method1());
	}

	public final void method1183(Source source) {
		method1177(source, 0L, 0L, source.method1());
	}

	public final void method1184(Source source) {
		method1177(source, 0L, 0L, source.method1());
	}

	public final void method1185(Source source) {
		method1177(source, 0L, 0L, source.method1());
	}

	private final synchronized void method1186(Source source, long l, long l_6_, int i) {
		if (source.method2() == 0L || method2() == 0L)
			throw new NullPointerException();
		aNativeHeap614.copy(method2() + l_6_, source.method2() + l, i);
	}

	private final synchronized void method1187(Source source, long l, long l_7_, int i) {
		if (source.method2() == 0L || method2() == 0L)
			throw new NullPointerException();
		aNativeHeap614.copy(method2() + l_7_, source.method2() + l, i);
	}

	public final synchronized void method1188() {
		if (method1175())
			aNativeHeap614.deallocateBuffer(182521485 * anInt615);
		aBool616 = false;
	}

	public final synchronized void method1189() {
		if (method1175())
			aNativeHeap614.deallocateBuffer(182521485 * anInt615);
		aBool616 = false;
	}

	public final synchronized void method1190() {
		if (method1175())
			aNativeHeap614.deallocateBuffer(182521485 * anInt615);
		aBool616 = false;
	}

	public final synchronized void method1191() {
		if (method1175())
			aNativeHeap614.deallocateBuffer(182521485 * anInt615);
		aBool616 = false;
	}

	public final synchronized void method1192() {
		if (method1175())
			aNativeHeap614.deallocateBuffer(182521485 * anInt615);
		aBool616 = false;
	}

	public final synchronized void method1193() {
		if (method1175())
			aNativeHeap614.deallocateBuffer(182521485 * anInt615);
		aBool616 = false;
	}
}
