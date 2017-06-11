/* Class485 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class485 {
	public char aChar6058;
	public static int anInt6059;

	void method6143(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i != 65280)
						break;
					break;
				}
				method6144(class298_sub53, i_0_, 212722615);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tz.a(").append(')').toString());
		}
	}

	void method6144(RsByteBuffer class298_sub53, int i, int i_1_) {
		try {
			if (i == 1)
				aChar6058 = Class493.method6190(class298_sub53.readByte(-12558881), 1844674077);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tz.f(").append(')').toString());
		}
	}

	Class485() {
		/* empty */
	}

	static final void method6145(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class284.method2696(class105, class119, class403, (short) 909);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tz.ge(").append(')').toString());
		}
	}

	static final void method6146(ClientScript2 class403, byte i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) 23);
			Class119 class119 = Class389.aClass119Array4165[i_2_ >> 16];
			Class436.method5805(class105, class119, class403, -1670344500);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tz.mt(").append(')').toString());
		}
	}
}
