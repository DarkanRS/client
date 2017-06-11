/* Class298_Sub40_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub4 extends Class298_Sub40 {
	Class160 aClass160_9697;
	String aString9698;

	void method3508(RsByteBuffer class298_sub53, int i) {
		try {
			((Class298_Sub40_Sub4) this).aString9698 = class298_sub53.readString(1228886023);
			class298_sub53.readInt((byte) -44);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agc.a(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.aString1654 = ((Class298_Sub40_Sub4) this).aString9698;
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.aString1654 = ((Class298_Sub40_Sub4) this).aString9698;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agc.f(").append(')').toString());
		}
	}

	Class298_Sub40_Sub4(Class160 class160) {
		super();
		((Class298_Sub40_Sub4) this).aClass160_9697 = class160;
	}

	void method3512(RsByteBuffer class298_sub53) {
		((Class298_Sub40_Sub4) this).aString9698 = class298_sub53.readString(553015411);
		class298_sub53.readInt((byte) 5);
	}

	void method3509(RsByteBuffer class298_sub53) {
		((Class298_Sub40_Sub4) this).aString9698 = class298_sub53.readString(-313501431);
		class298_sub53.readInt((byte) -1);
	}
}
