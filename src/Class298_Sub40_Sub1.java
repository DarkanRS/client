/* Class298_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub1 extends Class298_Sub40 {
	long aLong9688;
	String aString9689;

	void method3511(Class162 class162) {
		class162.method1757((31082448682122173L * ((Class298_Sub40_Sub1) this).aLong9688), ((Class298_Sub40_Sub1) this).aString9689, 0, -783761378);
	}

	Class298_Sub40_Sub1(Class160 class160) {
		super();
		((Class298_Sub40_Sub1) this).aLong9688 = 9050845699687573611L;
		((Class298_Sub40_Sub1) this).aString9689 = null;
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1757((31082448682122173L * ((Class298_Sub40_Sub1) this).aLong9688), ((Class298_Sub40_Sub1) this).aString9689, 0, -783761378);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afd.f(").append(')').toString());
		}
	}

	void method3508(RsByteBuffer class298_sub53, int i) {
		try {
			if (class298_sub53.readUnsignedByte() != 255) {
				class298_sub53.index -= 116413311;
				((Class298_Sub40_Sub1) this).aLong9688 = (class298_sub53.readLong((short) 32060) * -9050845699687573611L);
			}
			((Class298_Sub40_Sub1) this).aString9689 = class298_sub53.method3652(-517364695);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afd.a(").append(')').toString());
		}
	}

	void method3512(RsByteBuffer class298_sub53) {
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			((Class298_Sub40_Sub1) this).aLong9688 = (class298_sub53.readLong((short) 4817) * -9050845699687573611L);
		}
		((Class298_Sub40_Sub1) this).aString9689 = class298_sub53.method3652(-517364695);
	}

	void method3509(RsByteBuffer class298_sub53) {
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			((Class298_Sub40_Sub1) this).aLong9688 = (class298_sub53.readLong((short) 2363) * -9050845699687573611L);
		}
		((Class298_Sub40_Sub1) this).aString9689 = class298_sub53.method3652(-517364695);
	}

	static final void method3514(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class282.method2624(-333964684).method242(694163818);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afd.ahc(").append(')').toString());
		}
	}
}
