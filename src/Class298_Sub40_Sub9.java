/* Class298_Sub40_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub9 extends Class298_Sub40 {
	byte aByte9714;
	Class160 aClass160_9715;
	public static int anInt9716;
	int anInt9717;

	void method3509(RsByteBuffer class298_sub53) {
		((Class298_Sub40_Sub9) this).anInt9717 = class298_sub53.readUnsignedShort() * 203579807;
		((Class298_Sub40_Sub9) this).aByte9714 = class298_sub53.readByte(-12558881);
	}

	void method3508(RsByteBuffer class298_sub53, int i) {
		try {
			((Class298_Sub40_Sub9) this).anInt9717 = class298_sub53.readUnsignedShort() * 203579807;
			((Class298_Sub40_Sub9) this).aByte9714 = class298_sub53.readByte(-12558881);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ago.a(").append(')').toString());
		}
	}

	Class298_Sub40_Sub9(Class160 class160) {
		super();
		((Class298_Sub40_Sub9) this).aClass160_9715 = class160;
		((Class298_Sub40_Sub9) this).anInt9717 = -203579807;
	}

	void method3511(Class162 class162) {
		class162.method1769((1481144927 * ((Class298_Sub40_Sub9) this).anInt9717), ((Class298_Sub40_Sub9) this).aByte9714, (byte) -65);
	}

	void method3512(RsByteBuffer class298_sub53) {
		((Class298_Sub40_Sub9) this).anInt9717 = class298_sub53.readUnsignedShort() * 203579807;
		((Class298_Sub40_Sub9) this).aByte9714 = class298_sub53.readByte(-12558881);
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1769((1481144927 * ((Class298_Sub40_Sub9) this).anInt9717), ((Class298_Sub40_Sub9) this).aByte9714, (byte) -101);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ago.f(").append(')').toString());
		}
	}
}
