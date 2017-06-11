/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class252 {
	public static int anInt2774 = 5;
	public static int anInt2775 = 0;
	public static int anInt2776 = 1;
	public static int anInt2777 = 2;
	public static int anInt2778 = 6;

	Class252() throws Throwable {
		throw new Error();
	}

	static void method2409(GraphicsToolkit class_ra, byte[][][] is, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, byte i_9_) {
		try {
			if (i_6_ != 0 && 0 != i) {
				if (9 == i_6_) {
					i_6_ = 1;
					i_7_ = 1 + i_7_ & 0x3;
				}
				if (10 == i_6_) {
					i_6_ = 1;
					i_7_ = 3 + i_7_ & 0x3;
				}
				if (i_6_ == 11) {
					i_6_ = 8;
					i_7_ = i_7_ + 3 & 0x3;
				}
				class_ra.N(i_0_, i_1_, i_4_, i_5_, i_2_, i_3_, is[i_6_ - 1][i_7_], i, i_8_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kn.a(").append(')').toString());
		}
	}

	static void method2410(Matrix4f class233, int i) {
		try {
			Class436.aClass233_5494.method2142(class233);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kn.ab(").append(')').toString());
		}
	}
}
