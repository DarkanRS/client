/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class195 {
	public static int anInt1985 = 718;
	public static int anInt1986 = 1;

	Class195() throws Throwable {
		throw new Error();
	}

	static final void method1871(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			if ((((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]) != (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]))
				((ClientScript2) class403).anInt5259 += (286750741 * (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ig.o(").append(')').toString());
		}
	}

	static final void method1872(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class249.method2393(class105, class119, class403, -159729779);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ig.ix(").append(')').toString());
		}
	}

	public static int method1873(int i, int i_0_, int i_1_) {
		try {
			i_0_ = i_0_ * (i & 0x7f) >> 7;
			if (i_0_ < 2)
				i_0_ = 2;
			else if (i_0_ > 126)
				i_0_ = 126;
			return (i & 0xff80) + i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ig.k(").append(')').toString());
		}
	}
}
