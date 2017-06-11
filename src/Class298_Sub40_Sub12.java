/* Class298_Sub40_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub12 extends Class298_Sub40 {
	int anInt9725;
	int anInt9726;
	Class160 aClass160_9727;
	int anInt9728;
	int anInt9729;

	void method3511(Class162 class162) {
		class162.method1762(-1639581401 * ((Class298_Sub40_Sub12) this).anInt9729, -668866515 * ((Class298_Sub40_Sub12) this).anInt9728, -730458547 * ((Class298_Sub40_Sub12) this).anInt9726, -1837171777 * ((Class298_Sub40_Sub12) this).anInt9725, 183101291);
	}

	void method3508(RsByteBuffer class298_sub53, int i) {
		try {
			((Class298_Sub40_Sub12) this).anInt9729 = class298_sub53.readInt((byte) -10) * 1958209175;
			((Class298_Sub40_Sub12) this).anInt9728 = class298_sub53.readInt((byte) -38) * 7382949;
			((Class298_Sub40_Sub12) this).anInt9726 = class298_sub53.readUnsignedByte() * -1712778619;
			((Class298_Sub40_Sub12) this).anInt9725 = class298_sub53.readUnsignedByte() * 548598847;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agv.a(").append(')').toString());
		}
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1762(-1639581401 * ((Class298_Sub40_Sub12) this).anInt9729, -668866515 * ((Class298_Sub40_Sub12) this).anInt9728, -730458547 * ((Class298_Sub40_Sub12) this).anInt9726, -1837171777 * ((Class298_Sub40_Sub12) this).anInt9725, 183101291);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agv.f(").append(')').toString());
		}
	}

	Class298_Sub40_Sub12(Class160 class160) {
		super();
		((Class298_Sub40_Sub12) this).aClass160_9727 = class160;
	}

	void method3512(RsByteBuffer class298_sub53) {
		((Class298_Sub40_Sub12) this).anInt9729 = class298_sub53.readInt((byte) 51) * 1958209175;
		((Class298_Sub40_Sub12) this).anInt9728 = class298_sub53.readInt((byte) 12) * 7382949;
		((Class298_Sub40_Sub12) this).anInt9726 = class298_sub53.readUnsignedByte() * -1712778619;
		((Class298_Sub40_Sub12) this).anInt9725 = class298_sub53.readUnsignedByte() * 548598847;
	}

	void method3509(RsByteBuffer class298_sub53) {
		((Class298_Sub40_Sub12) this).anInt9729 = class298_sub53.readInt((byte) 68) * 1958209175;
		((Class298_Sub40_Sub12) this).anInt9728 = class298_sub53.readInt((byte) -25) * 7382949;
		((Class298_Sub40_Sub12) this).anInt9726 = class298_sub53.readUnsignedByte() * -1712778619;
		((Class298_Sub40_Sub12) this).anInt9725 = class298_sub53.readUnsignedByte() * 548598847;
	}

	static final int method3516(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			int i_4_ = 65536 - Class220.anIntArray2474[8192 * i_1_ / i_2_] >> 1;
			return (i_4_ * i_0_ >> 16) + ((65536 - i_4_) * i >> 16);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agv.j(").append(')').toString());
		}
	}
}
