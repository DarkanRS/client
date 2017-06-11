/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class116 {
	Class298_Sub31[] aClass298_Sub31Array1390;
	Interface4 anInterface4_1391;
	HashTable aClass437_1392;

	public Class298_Sub31 method1263(String string, int i) {
		try {
			long l = ((Class116) this).anInterface4_1391.method47(string, (byte) 93);
			for (Class298_Sub31 class298_sub31 = ((Class298_Sub31) ((Class116) this).aClass437_1392.get(l)); null != class298_sub31; class298_sub31 = (Class298_Sub31) ((Class116) this).aClass437_1392.nextInBucket(-1712985598)) {
				if (((Class298_Sub31) class298_sub31).aString7370.equals(string))
					return class298_sub31;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.f(").append(')').toString());
		}
	}

	void method1264(int i, int i_0_) {
		try {
			Class298_Sub31 class298_sub31 = method1266(i, (byte) -123);
			if (class298_sub31 != null) {
				class298_sub31.unlink(-1460969981);
				((Class116) this).aClass298_Sub31Array1390[-1836037967 * ((Class298_Sub31) class298_sub31).anInt7369] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.b(").append(')').toString());
		}
	}

	public void method1265(int i, String string, Class298_Sub31 class298_sub31, int i_1_) {
		try {
			Class298_Sub31 class298_sub31_2_ = method1263(string, -1827449503);
			if (null != class298_sub31_2_ && i != (((Class298_Sub31) class298_sub31_2_).anInt7369 * -1836037967))
				throw new IllegalArgumentException(string);
			method1264(i, -1882252920);
			if (i >= ((Class116) this).aClass298_Sub31Array1390.length) {
				int i_3_;
				for (i_3_ = ((Class116) this).aClass298_Sub31Array1390.length; i >= i_3_; i_3_ += i_3_) {
					/* empty */
				}
				((Class116) this).aClass437_1392 = new HashTable(i_3_);
				for (int i_4_ = 0; i_4_ < ((Class116) this).aClass298_Sub31Array1390.length; i_4_++) {
					Class298_Sub31 class298_sub31_5_ = ((Class116) this).aClass298_Sub31Array1390[i_4_];
					if (class298_sub31_5_ != null)
						((Class116) this).aClass437_1392.method5817(class298_sub31_5_, (class298_sub31_5_.linkedKey * 7051297995265073167L));
				}
				Class298_Sub31[] class298_sub31s = new Class298_Sub31[i_3_];
				for (int i_6_ = 0; i_6_ < ((Class116) this).aClass298_Sub31Array1390.length; i_6_++)
					class298_sub31s[i_6_] = ((Class116) this).aClass298_Sub31Array1390[i_6_];
				((Class116) this).aClass298_Sub31Array1390 = class298_sub31s;
			}
			((Class298_Sub31) class298_sub31).anInt7369 = -1138163631 * i;
			((Class298_Sub31) class298_sub31).aString7370 = string;
			((Class116) this).aClass437_1392.method5817(class298_sub31, ((Class116) this).anInterface4_1391.method47(string, (byte) -48));
			((Class116) this).aClass298_Sub31Array1390[i] = class298_sub31;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.p(").append(')').toString());
		}
	}

	public Class116(int i, Interface4 interface4) {
		int i_7_;
		for (i_7_ = 1; i_7_ < i; i_7_ += i_7_) {
			/* empty */
		}
		((Class116) this).aClass437_1392 = new HashTable(i_7_);
		((Class116) this).aClass298_Sub31Array1390 = new Class298_Sub31[i_7_];
		((Class116) this).anInterface4_1391 = interface4;
	}

	public Class298_Sub31 method1266(int i, byte i_8_) {
		try {
			if (i >= ((Class116) this).aClass298_Sub31Array1390.length)
				return null;
			return ((Class116) this).aClass298_Sub31Array1390[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.a(").append(')').toString());
		}
	}

	public static void method1267(int i) {
		try {
			Class276.method2574();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.f(").append(')').toString());
		}
	}

	public static void method1268(Class95 class95, int i, byte i_9_) {
		try {
			i = i * Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7584.method5726(-2144031703) >> 8;
			if (null == class95)
				Class134.method1489((byte) -122);
			else {
				Class298_Sub32_Sub10.method3200(class95, i, -391880689);
				Class368.method4555((short) -1817);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.e(").append(')').toString());
		}
	}

	static final void method1269(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = class105.aString1212;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.pf(").append(')').toString());
		}
	}

	static final void method1270(Entity class365_sub1_sub1_sub2, int i) {
		try {
			if (null != class365_sub1_sub1_sub2.anIntArray10092 || class365_sub1_sub1_sub2.anIntArray10085 != null) {
				boolean bool = true;
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				for (int i_10_ = 0; i_10_ < class365_sub1_sub1_sub2.anIntArray10092.length; i_10_++) {
					int i_11_ = -1;
					if (null != class365_sub1_sub1_sub2.anIntArray10092)
						i_11_ = class365_sub1_sub1_sub2.anIntArray10092[i_10_];
					if (-1 == i_11_) {
						if (!class365_sub1_sub1_sub2.method4417(i_10_, -1, (byte) 65))
							bool = false;
					} else {
						bool = false;
						boolean bool_12_ = false;
						boolean bool_13_ = false;
						Class217 class217 = (class365_sub1_sub1_sub2.method4337().aClass217_2599);
						int i_14_;
						int i_15_;
						if (-1073741824 == (i_11_ & ~0x3fffffff)) {
							int i_16_ = i_11_ & 0xfffffff;
							int i_17_ = i_16_ >> 14;
							int i_18_ = i_16_ & 0x3fff;
							i_14_ = ((int) class217.aFloat2451 - (256 + 512 * (i_17_ - (class341.gameSceneBaseX * -1760580017))));
							i_15_ = ((int) class217.aFloat2454 - (256 + ((i_18_ - 283514611 * class341.gameSceneBaseY) * 512)));
						} else if ((i_11_ & 0x8000) != 0) {
							int i_19_ = i_11_ & 0x7fff;
							Player class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_19_]);
							if (null != class365_sub1_sub1_sub2_sub2) {
								Class217 class217_20_ = (class365_sub1_sub1_sub2_sub2.method4337().aClass217_2599);
								i_14_ = ((int) class217.aFloat2451 - (int) class217_20_.aFloat2451);
								i_15_ = ((int) class217.aFloat2454 - (int) class217_20_.aFloat2454);
							} else {
								class365_sub1_sub1_sub2.method4417(i_10_, -1, (byte) 16);
								continue;
							}
						} else {
							Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_11_));
							if (null != class298_sub29) {
								NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
								Class217 class217_21_ = (class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599);
								i_14_ = ((int) class217.aFloat2451 - (int) class217_21_.aFloat2451);
								i_15_ = ((int) class217.aFloat2454 - (int) class217_21_.aFloat2454);
							} else {
								class365_sub1_sub1_sub2.method4417(i_10_, -1, (byte) 65);
								continue;
							}
						}
						if (i_14_ != 0 || 0 != i_15_)
							class365_sub1_sub1_sub2.method4417(i_10_, (int) (Math.atan2((double) i_14_, (double) i_15_) * 2607.5945876176133) & 0x3fff, (byte) 21);
					}
				}
				if (bool) {
					class365_sub1_sub1_sub2.anIntArray10092 = null;
					class365_sub1_sub1_sub2.anIntArray10085 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.hw(").append(')').toString());
		}
	}

	static final void method1271(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			class105.anInt1286 = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) * 2145953887;
			class105.anInt1159 = (1215865909 * (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]));
			int i_22_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]);
			if (i_22_ < 0)
				i_22_ = 0;
			else if (i_22_ > 5)
				i_22_ = 5;
			int i_23_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 3]);
			if (i_23_ < 0)
				i_23_ = 0;
			else if (i_23_ > 5)
				i_23_ = 5;
			class105.aByte1146 = (byte) i_22_;
			class105.aByte1147 = (byte) i_23_;
			Tradution.method6054(class105, -1806072234);
			Class438.method5845(class119, class105, -1959938301);
			if (0 == class105.anInt1144 * -1215239439)
				Class65.method761(class119, class105, false, 112223880);
			if (class105.anInt1154 * -1309843523 == -1 && !class119.aBoolean1403)
				Class288.method2729(class105.anInt1142 * -440872681, 1058352947);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.cy(").append(')').toString());
		}
	}

	public static void method1272(int i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub17_7564, 2, 1364189431);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub17_7565, 2, 1428932926);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub2_7547, 1, -398332874);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub28_7573, 1, 401268670);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub25_7569, 1, -225463890);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub9_7555, 1, -1836206886);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub18_7561, 1, 370627212);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557, 1, -408534755);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581, 2, 902985868);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560, 1, -598361107);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub5_7572, 2, -1383392801);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub3_7556, 1, -906948807);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7549, 0, -33681458);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7550, 0, 1421186288);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub4_7563, 2, 540542372);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub11_7558, -160182505 * Class115.aClass115_1383.anInt1387, -1761179616);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub6_7551, 0, -224292435);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub19_7567, 1, -1095753213);
			Class490.method6170(1113089752);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub8_7566, 0, -255450456);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub23_7576, 4, -1503000193);
			Class359.method4294(1109876610);
			client.aClass283_8716.method2640((byte) 54).method4324(286817156);
			client.aBoolean8676 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.d(").append(')').toString());
		}
	}

	static final void method1273(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class356.method4270(class105, class119, class403, 377927410);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("es.lq(").append(')').toString());
		}
	}
}
