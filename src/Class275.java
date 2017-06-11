/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class275 {
	Class275() throws Throwable {
		throw new Error();
	}

	static final void method2570(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) (client.aLong8645 * -5648129435911399733L >> 32);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) (client.aLong8645 * -5648129435911399733L & 0xffffffffffffffffL);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lk.ahf(").append(')').toString());
		}
	}

	public static Class459 method2571(int i, int i_0_) {
		try {
			Class459[] class459s = Class298_Sub44.method3531((byte) 89);
			for (int i_1_ = 0; i_1_ < class459s.length; i_1_++) {
				Class459 class459 = class459s[i_1_];
				if (i == class459.anInt5673 * 1790024195)
					return class459;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lk.f(").append(')').toString());
		}
	}

	static final void method2572(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class447.aClass469_5618.method6045(i_2_, (short) -17718).method3461((short) -22372);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lk.adi(").append(')').toString());
		}
	}

	public static void method2573(int i) {
		try {
			if (null == Class230.aClass227Array2561) {
				Class230.aClass227Array2561 = Class227.method2109(-664645155);
				Class82_Sub6.aClass227_6843 = Class230.aClass227Array2561[0];
				Class230.aLong2560 = Class122.method1319((byte) 1) * 3538585047679075717L;
			}
			if (null == Class288_Sub1.aClass219_7147)
				GraphicsToolkit.method5191(-418466538);
			Class227 class227 = Class82_Sub6.aClass227_6843;
			int i_3_ = Class125.method1401((byte) -86);
			if (Class82_Sub6.aClass227_6843 == class227) {
				Class107.aString1314 = ((Class227) Class82_Sub6.aClass227_6843).aClass470_2549.method6049(Class321.aClass429_3357, -875414210);
				if (((Class227) Class82_Sub6.aClass227_6843).aBoolean2550)
					Class230.anInt2566 = (360399239 * ((Class227) Class82_Sub6.aClass227_6843).anInt2551 + ((-1620354451 * (((Class227) Class82_Sub6.aClass227_6843).anInt2552)) - (360399239 * (((Class227) Class82_Sub6.aClass227_6843).anInt2551))) * i_3_ / 100) * -1030314565;
				if (((Class227) Class82_Sub6.aClass227_6843).aBoolean2553)
					Class107.aString1314 = new StringBuilder().append(Class107.aString1314).append(Class230.anInt2566 * 1131632499).append("%").toString();
			} else if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2547) {
				Class288_Sub1.aClass219_7147 = null;
				Class439.method5851(19, 732690062);
			} else {
				Class107.aString1314 = ((Class227) class227).aClass470_2543.method6049(Class321.aClass429_3357, -875414210);
				if (((Class227) Class82_Sub6.aClass227_6843).aBoolean2553)
					Class107.aString1314 = new StringBuilder().append(Class107.aString1314).append(((Class227) class227).anInt2552 * -1620354451).append("%").toString();
				Class230.anInt2566 = 982601375 * ((Class227) class227).anInt2552;
				if (((Class227) Class82_Sub6.aClass227_6843).aBoolean2550 || ((Class227) class227).aBoolean2550)
					Class230.aLong2560 = Class122.method1319((byte) 1) * 3538585047679075717L;
			}
			if (Class288_Sub1.aClass219_7147 != null) {
				Class288_Sub1.aClass219_7147.method2043(-4360787748556788915L * Class230.aLong2560, Class107.aString1314, 1131632499 * Class230.anInt2566, Class82_Sub6.aClass227_6843, -130919578);
				if (null != Class230.anInterface12Array2562) {
					for (int i_4_ = 1 + -1936794913 * Class230.anInt2563; i_4_ < Class230.anInterface12Array2562.length; i_4_++) {
						if (Class230.anInterface12Array2562[i_4_].method159((byte) 31) >= 100 && -1936794913 * Class230.anInt2563 == i_4_ - 1 && 12 != -1233866115 * client.anInt8752 && Class288_Sub1.aClass219_7147.method2035(-1321940215)) {
							try {
								Class230.anInterface12Array2562[i_4_].method150(-1481032979);
							} catch (Exception exception) {
								Class230.anInterface12Array2562 = null;
								break;
							}
							Class288_Sub1.aClass219_7147.method2036(Class230.anInterface12Array2562[i_4_], -847859584);
							Class230.anInt2563 += 64708895;
							if ((Class230.anInt2563 * -1936794913 >= Class230.anInterface12Array2562.length - 1) && Class230.anInterface12Array2562.length > 1)
								Class230.anInt2563 = (Class420.aClass515_5344.method6296((byte) 7) ? 0 : -1) * 64708895;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lk.a(").append(')').toString());
		}
	}
}
