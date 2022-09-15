/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
	private final int anInt4084 = -1991552397;
	private long aLong4085;

	protected NativeBuffer() {
		/* empty */
	}

	private native void get(long l, byte[] is, int i, int i_2_, int i_3_);

	@Override
	public int method1() {
		return anInt4084 * 75849029;
	}

	@Override
	public void method116(byte[] is, int i, int i_0_, int i_1_) {
		if (aLong4085 * -8386277585485031121L == 0L | is == null | i < 0 | i + i_1_ > is.length | i_0_ < 0 | i_1_ + i_0_ > 75849029 * anInt4084)
			throw new RuntimeException();
		put(-8386277585485031121L * aLong4085, is, i, i_0_, i_1_);
	}

	@Override
	public void method117(byte[] is, int i, int i_6_, int i_7_) {
		if (aLong4085 * -8386277585485031121L == 0L | is == null | i < 0 | i + i_7_ > is.length | i_6_ < 0 | i_7_ + i_6_ > 75849029 * anInt4084)
			throw new RuntimeException();
		put(-8386277585485031121L * aLong4085, is, i, i_6_, i_7_);
	}

	@Override
	public long method2() {
		return aLong4085 * -8386277585485031121L;
	}

	@Override
	public int method3() {
		return anInt4084 * 75849029;
	}

	@Override
	public int method4() {
		return anInt4084 * 75849029;
	}

	@Override
	public long method5() {
		return aLong4085 * -8386277585485031121L;
	}

	@Override
	public long method6() {
		return aLong4085 * -8386277585485031121L;
	}

	@Override
	public long method7() {
		return aLong4085 * -8386277585485031121L;
	}

	@Override
	public long method8() {
		return aLong4085 * -8386277585485031121L;
	}

	private native void put(long l, byte[] is, int i, int i_4_, int i_5_);
}
