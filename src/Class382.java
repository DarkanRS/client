/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class382 {
	public static final int anInt4644 = 1024;
	public static final int anInt4645 = 14;
	public static final int anInt4646 = 12288;
	public static final double aDouble4647 = 2607.5945876176133;
	public static final int anInt4648 = 16384;
	public static final int anInt4649 = 16383;
	public static final int anInt4650 = 14;
	public static final int anInt4651 = 16384;
	public static final int anInt4652 = 2048;
	public static final int anInt4653 = 4096;
	public static final int anInt4654 = 6144;
	public static final int anInt4655 = 8192;
	public static final int anInt4656 = 10240;
	public static int[] anIntArray4657 = new int[16384];
	public static final int anInt4658 = 14336;
	public static final int anInt4659 = 16384;
	public static final int anInt4660 = 16383;
	public static int[] anIntArray4661 = new int[16384];

	public static float method6506(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			anIntArray4657[i] = (int) (16384.0 * Math.sin((double) i * d));
			anIntArray4661[i] = (int) (16384.0 * Math.cos((double) i * d));
		}
	}

	Class382() throws Throwable {
		throw new Error();
	}

	public static float method6507(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	public static float method6508(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}
}
