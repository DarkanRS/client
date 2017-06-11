/* Class298_Sub37_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub10 extends Class298_Sub37 {
	public int[] anIntArray9601;
	static Class95 aClass95_9602;
	public int[] anIntArray9603;
	public int anInt9604;
	public int anInt9605 = 0;

	void method3443(RsByteBuffer class298_sub53, int i, byte i_0_) {
		try {
			if (2 == i)
				anInt9604 = class298_sub53.readUnsignedShort() * -1816799395;
			else if (4 == i) {
				anInt9605 = class298_sub53.readUnsignedByte() * 2106966585;
				anIntArray9601 = new int[-408056823 * anInt9605];
				anIntArray9603 = new int[-408056823 * anInt9605];
				for (int i_1_ = 0; i_1_ < anInt9605 * -408056823; i_1_++) {
					anIntArray9601[i_1_] = class298_sub53.readUnsignedShort();
					anIntArray9603[i_1_] = class298_sub53.readUnsignedShort();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiq.f(").append(')').toString());
		}
	}

	void method3444(RsByteBuffer class298_sub53, byte i) {
		try {
			for (;;) {
				int i_2_ = class298_sub53.readUnsignedByte();
				if (0 == i_2_) {
					if (i >= 1) {
						/* empty */
					}
					break;
				}
				method3443(class298_sub53, i_2_, (byte) -87);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiq.a(").append(')').toString());
		}
	}

	Class298_Sub37_Sub10() {
		anInt9604 = 0;
	}
}
