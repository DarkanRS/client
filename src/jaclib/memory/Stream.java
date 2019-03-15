/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
	private Buffer aBuffer2120;
	private int anInt2121;
	private int anInt2122;
	private int anInt2123;
	private byte[] aByteArray2124;
	private static boolean aBool2125 = getLSB(-65536) == -1;

	public Stream() {
		this(4096);
	}

	private Stream(int i) {
		aByteArray2124 = new byte[i];
	}

	public Stream(Buffer buffer) {
		this(buffer, buffer.method1());
	}

	public Stream(Buffer buffer, int i_0_) {
		this(buffer.method1() < 4096 ? buffer.method1() : 4096);
		method2917(buffer, i_0_);
	}

	private void method2917(Buffer buffer, int i_1_) {
		method2925();
		aBuffer2120 = buffer;
		anInt2122 = -1706667277 * 0;
		anInt2121 = (i_1_ + 0) * -946986007;
		if (-863312807 * anInt2121 > buffer.method1())
			throw new RuntimeException();
	}

	public int written() {
		return anInt2123 * -781132199 + anInt2122 * 1160648251;
	}

	public void method2919(int i) {
		method2925();
		anInt2122 = -1706667277 * i;
	}

	public void method2920(int i) {
		if (anInt2123 * -781132199 >= aByteArray2124.length)
			method2925();
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
	}

	public void method2921(int i) {
		if (3 + -781132199 * anInt2123 >= aByteArray2124.length)
			method2925();
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
	}

	public void method2922(int i) {
		if (anInt2123 * -781132199 + 3 >= aByteArray2124.length)
			method2925();
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
	}

	public void method2923(float f) {
		if (3 + -781132199 * anInt2123 >= aByteArray2124.length)
			method2925();
		int i = floatToRawIntBits(f);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
	}

	public void method2924(float f) {
		if (3 + anInt2123 * -781132199 >= aByteArray2124.length)
			method2925();
		int i = floatToRawIntBits(f);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
	}

	public void method2925() {
		if (anInt2123 * -781132199 > 0) {
			if (anInt2122 * 1160648251 + -781132199 * anInt2123 > -863312807 * anInt2121)
				throw new RuntimeException();
			aBuffer2120.method116(aByteArray2124, 0, anInt2122 * 1160648251, -781132199 * anInt2123);
			anInt2122 += anInt2123 * 1269928059;
			anInt2123 = 0;
		}
	}

	public static final boolean method2926() {
		return aBool2125;
	}

	public static native int floatToRawIntBits(float f);

	private static final native byte getLSB(int i);

	private void method2927(Buffer buffer, int i, int i_2_) {
		method2925();
		aBuffer2120 = buffer;
		anInt2122 = -1706667277 * i;
		anInt2121 = (i_2_ + i) * -946986007;
		if (-863312807 * anInt2121 > buffer.method1())
			throw new RuntimeException();
	}

	private void method2928(Buffer buffer, int i, int i_3_) {
		method2925();
		aBuffer2120 = buffer;
		anInt2122 = -1706667277 * i;
		anInt2121 = (i_3_ + i) * -946986007;
		if (-863312807 * anInt2121 > buffer.method1())
			throw new RuntimeException();
	}

	public int method2929() {
		return anInt2123 * -781132199 + anInt2122 * 1160648251;
	}

	public int method2930() {
		return anInt2123 * -781132199 + anInt2122 * 1160648251;
	}

	public void method2931(int i) {
		method2925();
		anInt2122 = -1706667277 * i;
	}

	public void method2932(int i) {
		method2925();
		anInt2122 = -1706667277 * i;
	}

	public void method2933(int i) {
		method2925();
		anInt2122 = -1706667277 * i;
	}

	public void method2934(int i) {
		if (3 + -781132199 * anInt2123 >= aByteArray2124.length)
			method2925();
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
	}

	public void method2935(int i) {
		if (3 + -781132199 * anInt2123 >= aByteArray2124.length)
			method2925();
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
	}

	public void method2936(int i) {
		if (anInt2123 * -781132199 + 3 >= aByteArray2124.length)
			method2925();
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
	}

	public void method2937(int i) {
		if (anInt2123 * -781132199 + 3 >= aByteArray2124.length)
			method2925();
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
	}

	public void method2938(float f) {
		if (3 + -781132199 * anInt2123 >= aByteArray2124.length)
			method2925();
		int i = floatToRawIntBits(f);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
	}

	public void method2939(float f) {
		if (3 + anInt2123 * -781132199 >= aByteArray2124.length)
			method2925();
		int i = floatToRawIntBits(f);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) i;
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 8);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 16);
		aByteArray2124[(anInt2123 += 1787333097) * -781132199 - 1] = (byte) (i >> 24);
	}

	public void method2940() {
		if (anInt2123 * -781132199 > 0) {
			if (anInt2122 * 1160648251 + -781132199 * anInt2123 > -863312807 * anInt2121)
				throw new RuntimeException();
			aBuffer2120.method116(aByteArray2124, 0, anInt2122 * 1160648251, -781132199 * anInt2123);
			anInt2122 += anInt2123 * 1269928059;
			anInt2123 = 0;
		}
	}

	public void method2941() {
		if (anInt2123 * -781132199 > 0) {
			if (anInt2122 * 1160648251 + -781132199 * anInt2123 > -863312807 * anInt2121)
				throw new RuntimeException();
			aBuffer2120.method116(aByteArray2124, 0, anInt2122 * 1160648251, -781132199 * anInt2123);
			anInt2122 += anInt2123 * 1269928059;
			anInt2123 = 0;
		}
	}

	public static final boolean method2942() {
		return aBool2125;
	}
}
