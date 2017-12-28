/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class172 {
	public int anInt2113;
	public Class172 aClass172_2114;
	public int anInt2115;
	public Class384 aClass384_2116;
	public int anInt2117;
	public int anInt2118;
	public int anInt2119;

	Class172(int i, int i_0_) {
		anInt2115 = i * -1818474199;
		anInt2119 = i_0_ * 702737761;
	}

	public Class345 method2910() {
		return Class423.method7065(anInt2115 * -1105042663, -1229346850);
	}

	Class172 method2911(int i, int i_1_) {
		return new Class172(-1105042663 * anInt2115, i);
	}

	public Class345 method2912() {
		return Class423.method7065(anInt2115 * -1105042663, -1229346850);
	}

	public Class345 method2913(int i) {
		return Class423.method7065(anInt2115 * -1105042663, -1229346850);
	}

	static final void method2914(Class527 class527, byte i) {
		int i_2_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub44 class282_sub44 = (Class282_Sub44) client.aClass465_7442.method7754((long) i_2_);
		if (class282_sub44 != null)
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method2915(Class118 class118, Class98 class98, Class527 class527, byte i) {
		class118.anInt1324 = ((((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]) * 1596298199);
		Class109.method1858(class118, (byte) 15);
	}

	static final void method2916(Class527 class527, int i) {
		int i_3_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(2115091118);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14778(i_3_ >> 28 & 0x3, i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff, Class517.anIntArray5900, -1837274243);
			if (bool) {
				((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537) - 1] = Class517.anIntArray5900[1];
				((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537) - 1] = Class517.anIntArray5900[2];
			} else {
				((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537) - 1] = -1;
				((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}
}
