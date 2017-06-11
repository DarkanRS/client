/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class402 {
	int anInt5226 = 377229199;
	static int anInt5227;
	int[] anIntArray5228;
	ClientScript aClass298_Sub37_Sub17_5229;
	long[] aLongArray5230;
	Object[] anObjectArray5231;
	static int anInt5232;

	Class402() {
		/* empty */
	}

	public static int method4941(int i, int i_0_, int i_1_, int i_2_) {
		try {
			i_1_ &= 0x3;
			if (i_1_ == 0)
				return i;
			if (i_1_ == 1)
				return i_0_;
			if (2 == i_1_)
				return 7 - i;
			return 7 - i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qr.a(").append(')').toString());
		}
	}
}
