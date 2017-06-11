/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
	private Buffer a;
	private int f;
	private int b;
	private int p;
	private byte[] i;
	private static boolean k = getLSB(-65536) == -1;

	public Stream() {
		this(4096);
	}

	private Stream(int i) {
		this.i = new byte[i];
	}

	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.a());
	}

	public Stream(Buffer buffer, int i, int i_0_) {
		this(buffer.a() < 4096 ? buffer.a() : 4096);
		a(buffer, i, i_0_);
	}

	private void a(Buffer buffer, int i, int i_1_) {
		x();
		a = buffer;
		b = i * -1137521459;
		f = 193942853 * (i_1_ + i);
		if (-1084754547 * f > buffer.a())
			throw new RuntimeException();
	}

	public int f() {
		return -846880739 * p + -1626734587 * b;
	}

	public void b(int i) {
		x();
		b = -1137521459 * i;
	}

	public void p(int i) {
		if (p * -846880739 >= this.i.length)
			x();
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) i;
	}

	public void i(int i) {
		if (3 + -846880739 * p >= this.i.length)
			x();
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) i;
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 8);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 16);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 24);
	}

	public void k(int i) {
		if (3 + p * -846880739 >= this.i.length)
			x();
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 16);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 8);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) i;
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 24);
	}

	public void d(float f) {
		if (-846880739 * p + 3 >= this.i.length)
			x();
		int i = floatToRawIntBits(f);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 24);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 16);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 8);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) i;
	}

	public void u(float f) {
		if (3 + p * -846880739 >= this.i.length)
			x();
		int i = floatToRawIntBits(f);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) i;
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 8);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 16);
		this.i[(p += -1413864907) * -846880739 - 1] = (byte) (i >> 24);
	}

	public void x() {
		if (p * -846880739 > 0) {
			if (p * -846880739 + -1626734587 * b > -1084754547 * f)
				throw new RuntimeException();
			a.b(i, 0, -1626734587 * b, -846880739 * p);
			b += p * -1589488839;
			p = 0;
		}
	}

	public static final boolean r() {
		return k;
	}

	public static native int floatToRawIntBits(float f);

	private static final native byte getLSB(int i);
}
