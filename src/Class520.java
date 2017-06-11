/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class520 {
	public int anInt6275;
	public int anInt6276;
	public char aChar6277;
	public int anInt6278;

	void method6320(RsByteBuffer class298_sub53, int i, int i_0_) {
		try {
			if (i == 1)
				aChar6277 = Class493.method6190(class298_sub53.readByte(-12558881), 1830993802);
			else if (3 == i) {
				anInt6276 = class298_sub53.readUnsignedShort() * -1544029687;
				anInt6275 = class298_sub53.readUnsignedByte() * -786049945;
				anInt6278 = class298_sub53.readUnsignedByte() * -2127046785;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vy.f(").append(')').toString());
		}
	}

	Class520() {
		/* empty */
	}

	void method6321(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUnsignedByte();
				if (0 == i_1_) {
					if (i == -1099657695)
						break;
					break;
				}
				method6320(class298_sub53, i_1_, 1972113647);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vy.a(").append(')').toString());
		}
	}
}
