/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class434 {
	public int anInt5457;
	public int anInt5458;
	public int anInt5459;

	void method5800(RsByteBuffer class298_sub53, int i, int i_0_) {
		try {
			if (i == 1) {
				anInt5458 = class298_sub53.readUnsignedShort() * -361098111;
				anInt5459 = class298_sub53.readUnsignedByte() * 709302387;
				anInt5457 = class298_sub53.readUnsignedByte() * 1322614137;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ry.f(").append(')').toString());
		}
	}

	void method5801(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUnsignedByte();
				if (0 == i_1_) {
					if (i > 1941304655)
						break;
					break;
				}
				method5800(class298_sub53, i_1_, 33985);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ry.a(").append(')').toString());
		}
	}

	Class434() {
		/* empty */
	}

	static boolean method5802(int i) {
		try {
			return Class492.method6184(Class144.aClass381_1563.aClass355_4115, 1089632340);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ry.b(").append(')').toString());
		}
	}

	static final void method5803(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class390 class390;
			if (((ClientScript2) class403).aBoolean5261)
				class390 = ((ClientScript2) class403).aClass390_5247;
			else
				class390 = ((ClientScript2) class403).aClass390_5246;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class390.method4867(i_2_, -1, -574024132) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ry.bz(").append(')').toString());
		}
	}
}
