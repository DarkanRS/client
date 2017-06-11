/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
	private int a = 345719739;
	private long f;

	protected NativeBuffer() {
		/* empty */
	}

	public final int a() {
		return a * 1825765005;
	}

	public final long f() {
		return f * -4061232971384459903L;
	}

	public void b(byte[] is, int i, int i_0_, int i_1_) {
		if (0L == f * -4061232971384459903L | null == is | i < 0 | i + i_1_ > is.length | i_0_ < 0 | i_1_ + i_0_ > 1825765005 * a)
			throw new RuntimeException();
		put(f * -4061232971384459903L, is, i, i_0_, i_1_);
	}

	private final native void get(long l, byte[] is, int i, int i_2_, int i_3_);

	private final native void put(long l, byte[] is, int i, int i_4_, int i_5_);

	public void p(byte[] is, int i, int i_6_, int i_7_) {
		if (0L == f * -4061232971384459903L | null == is | i < 0 | i + i_7_ > is.length | i_6_ < 0 | i_7_ + i_6_ > 1825765005 * a)
			throw new RuntimeException();
		put(f * -4061232971384459903L, is, i, i_6_, i_7_);
	}

	public void i(byte[] is, int i, int i_8_, int i_9_) {
		if (0L == f * -4061232971384459903L | null == is | i < 0 | i + i_9_ > is.length | i_8_ < 0 | i_9_ + i_8_ > 1825765005 * a)
			throw new RuntimeException();
		put(f * -4061232971384459903L, is, i, i_8_, i_9_);
	}

	public void k(byte[] is, int i, int i_10_, int i_11_) {
		if (0L == f * -4061232971384459903L | null == is | i < 0 | i + i_11_ > is.length | i_10_ < 0 | i_11_ + i_10_ > 1825765005 * a)
			throw new RuntimeException();
		put(f * -4061232971384459903L, is, i, i_10_, i_11_);
	}

	public final long d() {
		return f * -4061232971384459903L;
	}

	public final long u() {
		return f * -4061232971384459903L;
	}

	public final int x() {
		return a * 1825765005;
	}

	public final int r() {
		return a * 1825765005;
	}

	public final int q() {
		return a * 1825765005;
	}

	public final int n() {
		return a * 1825765005;
	}
}
