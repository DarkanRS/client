/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class462 {
	static Class348 aClass348_5682 = new Class348(32);
	public static int anInt5683;

	Class462() throws Throwable {
		throw new Error();
	}

	static String method5990(String string, int i) {
		try {
			if (Class495.aString6094.startsWith("win"))
				return new StringBuilder().append(string).append(".dll").toString();
			if (Class495.aString6094.startsWith("linux"))
				return new StringBuilder().append("lib").append(string).append(".so").toString();
			if (Class495.aString6094.startsWith("mac"))
				return new StringBuilder().append("lib").append(string).append(".dylib").toString();
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("t.a(").append(')').toString());
		}
	}

	static final void method5991(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -48);
			Class119 class119 = Class389.aClass119Array4165[i_0_ >> 16];
			Class409.method4973(class105, class119, class403, (byte) 106);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("t.ce(").append(')').toString());
		}
	}

	static final void method5992(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class360.anInt3894 * 235445649;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 508782749 * Class360.anInt3888;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1800450029 * Class360.anInt3906;
			Class360.anInt3894 = -1908115170;
			Class360.anInt3888 = 599892555;
			Class360.anInt3906 = 930150939;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("t.ahz(").append(')').toString());
		}
	}

	static final void method5993(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 0 != (i_1_ & 1 << i_2_) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("t.zh(").append(')').toString());
		}
	}
}
