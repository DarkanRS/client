/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class317 {
	Class243 aClass243_3319;
	Class348 aClass348_3320 = new Class348(16);
	static Class243 aClass243_3321;

	public Class317(Class411 class411, Class429 class429, Class243 class243) {
		((Class317) this).aClass243_3319 = class243;
		((Class317) this).aClass243_3319.method2316((-1006924897 * (Class120.aClass120_1434.anInt1460)), -1713499559);
	}

	public Class277 method3845(int i, int i_0_, int i_1_, int i_2_, Class131 class131, byte i_3_) {
		try {
			Class276[] class276s = null;
			Class325 class325 = method3849(i, 1130929596);
			if (((Class325) class325).anIntArray3451 != null) {
				class276s = (new Class276[((Class325) class325).anIntArray3451.length]);
				for (int i_4_ = 0; i_4_ < class276s.length; i_4_++) {
					Class125 class125 = class131.method1467((((Class325) class325).anIntArray3451[i_4_]), -1248511043);
					class276s[i_4_] = new Class276(-865421291 * class125.anInt1491, class125.anInt1488 * -2045013891, class125.anInt1483 * -415148019, class125.anInt1489 * 1899082811, 257759203 * class125.anInt1481, class125.anInt1490 * 1872498707, 1242301535 * class125.anInt1487, class125.aBoolean1486, -535750953 * class125.anInt1485, 1283923105 * class125.anInt1484, -1054886537 * class125.anInt1482);
				}
			}
			return new Class277(-1474936555 * ((Class325) class325).anInt3450, class276s, -1877970137 * ((Class325) class325).anInt3449, i_0_, i_1_, i_2_, ((Class325) class325).aClass320_3452, ((Class325) class325).anInt3453 * -630450499);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.f(").append(')').toString());
		}
	}

	public void method3846(byte i) {
		try {
			synchronized (((Class317) this).aClass348_3320) {
				((Class317) this).aClass348_3320.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.b(").append(')').toString());
		}
	}

	public void method3847(int i, int i_5_) {
		try {
			synchronized (((Class317) this).aClass348_3320) {
				((Class317) this).aClass348_3320.method4186(i, 21848590);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.p(").append(')').toString());
		}
	}

	public void method3848(int i) {
		try {
			synchronized (((Class317) this).aClass348_3320) {
				((Class317) this).aClass348_3320.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.i(").append(')').toString());
		}
	}

	Class325 method3849(int i, int i_6_) {
		try {
			Class325 class325;
			synchronized (((Class317) this).aClass348_3320) {
				class325 = (Class325) ((Class317) this).aClass348_3320.method4184((long) i);
			}
			if (class325 != null)
				return class325;
			byte[] is;
			synchronized (((Class317) this).aClass243_3319) {
				is = (((Class317) this).aClass243_3319.getFile(Class120.aClass120_1434.anInt1460 * -1006924897, i, (byte) -79));
			}
			class325 = new Class325();
			if (null != is)
				class325.method3962(new RsByteBuffer(is), (byte) -47);
			synchronized (((Class317) this).aClass348_3320) {
				((Class317) this).aClass348_3320.method4194(class325, (long) i);
			}
			return class325;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.a(").append(')').toString());
		}
	}

	static final void method3850(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			class105.anInt1151 = (-1825442367 * (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]));
			class105.anInt1140 = ((((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]) * 908204397);
			if (1 == (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]))
				class105.anInt1184 = -886348599;
			else
				class105.anInt1184 = 643790344;
			if ((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 3]) == 1)
				class105.aBoolean1213 = true;
			else
				class105.aBoolean1213 = false;
			if (-1 == class105.anInt1154 * -1309843523 && !class119.aBoolean1403)
				Class422.method5623(class105.anInt1142 * -440872681, 1592451280);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.iw(").append(')').toString());
		}
	}

	static final void method3851(ClientScript2 class403, int i) {
		try {
			if (client.aString8656 != null)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = client.aString8656;
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.aht(").append(')').toString());
		}
	}

	static final void method3852(ClientScript2 class403, int i) {
		try {
			int i_7_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_7_, (byte) -76);
			Class119 class119 = Class389.aClass119Array4165[i_7_ >>> 16];
			IComponentDefinition class105_8_ = Class523.method6331(class119, class105, -635605619);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (class105_8_ == null ? -1 : -440872681 * class105_8_.anInt1142);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.rt(").append(')').toString());
		}
	}

	public static void method3853(int i) {
		try {
			if (19 == -1233866115 * client.anInt8752 && (!Class315.method3837((byte) 16) && !Class489.method6167(-391880689)))
				Class439.method5851(2, 1642271064);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.a(").append(')').toString());
		}
	}

	static final void method3854(ClientScript2 class403, int i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_9_ >> 28;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nf.ts(").append(')').toString());
		}
	}
}
