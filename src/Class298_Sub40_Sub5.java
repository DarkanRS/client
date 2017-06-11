/* Class298_Sub40_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub5 extends Class298_Sub40 {
	long aLong9699;
	int anInt9700;
	String aString9701;
	Class160 aClass160_9702;

	Class298_Sub40_Sub5(Class160 class160) {
		super();
		((Class298_Sub40_Sub5) this).aClass160_9702 = class160;
		((Class298_Sub40_Sub5) this).aLong9699 = 2714659426994184815L;
		((Class298_Sub40_Sub5) this).aString9701 = null;
		((Class298_Sub40_Sub5) this).anInt9700 = 0;
	}

	void method3508(RsByteBuffer class298_sub53, int i) {
		try {
			if (class298_sub53.readUnsignedByte() != 255) {
				class298_sub53.index -= 116413311;
				((Class298_Sub40_Sub5) this).aLong9699 = (class298_sub53.readLong((short) 27016) * -2714659426994184815L);
			}
			((Class298_Sub40_Sub5) this).aString9701 = class298_sub53.method3652(-517364695);
			((Class298_Sub40_Sub5) this).anInt9700 = class298_sub53.readUnsignedShort() * 70895925;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agf.a(").append(')').toString());
		}
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1757((((Class298_Sub40_Sub5) this).aLong9699 * -1747233514558995599L), ((Class298_Sub40_Sub5) this).aString9701, (((Class298_Sub40_Sub5) this).anInt9700 * 1029636381), -783761378);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agf.f(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.method1757((((Class298_Sub40_Sub5) this).aLong9699 * -1747233514558995599L), ((Class298_Sub40_Sub5) this).aString9701, (((Class298_Sub40_Sub5) this).anInt9700 * 1029636381), -783761378);
	}

	void method3512(RsByteBuffer class298_sub53) {
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			((Class298_Sub40_Sub5) this).aLong9699 = (class298_sub53.readLong((short) 12554) * -2714659426994184815L);
		}
		((Class298_Sub40_Sub5) this).aString9701 = class298_sub53.method3652(-517364695);
		((Class298_Sub40_Sub5) this).anInt9700 = class298_sub53.readUnsignedShort() * 70895925;
	}

	void method3509(RsByteBuffer class298_sub53) {
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			((Class298_Sub40_Sub5) this).aLong9699 = (class298_sub53.readLong((short) 5054) * -2714659426994184815L);
		}
		((Class298_Sub40_Sub5) this).aString9701 = class298_sub53.method3652(-517364695);
		((Class298_Sub40_Sub5) this).anInt9700 = class298_sub53.readUnsignedShort() * 70895925;
	}
}
