/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class144 {
	Class243 aClass243_1559;
	Class243 aClass243_1560;
	Class348 aClass348_1561 = new Class348(64);
	static Class57 aClass57_1562;
	public static Class381 aClass381_1563;

	public Class132 method1579(int i, int i_0_) {
		try {
			Class132 class132;
			synchronized (((Class144) this).aClass348_1561) {
				class132 = (Class132) ((Class144) this).aClass348_1561.method4184((long) i);
			}
			if (class132 != null)
				return class132;
			byte[] is;
			synchronized (((Class144) this).aClass243_1559) {
				is = (((Class144) this).aClass243_1559.getFile(Class120.aClass120_1425.anInt1460 * -1006924897, i, (byte) -128));
			}
			class132 = new Class132();
			((Class132) class132).aClass144_1500 = this;
			if (is != null)
				class132.method1472(new RsByteBuffer(is), 1546025245);
			synchronized (((Class144) this).aClass348_1561) {
				((Class144) this).aClass348_1561.method4194(class132, (long) i);
			}
			return class132;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.a(").append(')').toString());
		}
	}

	public void method1580(byte i) {
		try {
			synchronized (((Class144) this).aClass348_1561) {
				((Class144) this).aClass348_1561.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.f(").append(')').toString());
		}
	}

	public void method1581(int i) {
		try {
			synchronized (((Class144) this).aClass348_1561) {
				((Class144) this).aClass348_1561.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.p(").append(')').toString());
		}
	}

	public void method1582(int i, int i_1_) {
		try {
			synchronized (((Class144) this).aClass348_1561) {
				((Class144) this).aClass348_1561.method4186(i, -1045157545);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.b(").append(')').toString());
		}
	}

	public Class144(Class411 class411, Class429 class429, Class243 class243, Class243 class243_2_) {
		((Class144) this).aClass243_1559 = class243;
		((Class144) this).aClass243_1560 = class243_2_;
		((Class144) this).aClass243_1559.method2316((-1006924897 * (Class120.aClass120_1425.anInt1460)), -2109974583);
	}

	static final void method1583(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class377.method4665(class105, class119, class403, (short) 14954);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.fz(").append(')').toString());
		}
	}

	static final void method1584(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass162_5252.anInt1670 * 873199607;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.xc(").append(')').toString());
		}
	}

	static final void method1585(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub10_7548.method5612(i_3_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.aog(").append(')').toString());
		}
	}

	static final void method1586(ClientScript2 class403, int i) {
		try {
			NPC class365_sub1_sub1_sub2_sub1 = ((NPC) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242);
			SomethingDefinitions class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
			if (class503.anIntArray6188 != null)
				class503 = class503.method6240(Class128.aClass148_6331, 1999627505);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class503 != null ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.apl(").append(')').toString());
		}
	}

	public static void method1587(byte i) {
		try {
			if (client.aBoolean8835) {
				IComponentDefinition class105 = Class140.method1558(Class379.anInt4099 * 1262526353, 392084321 * client.anInt8836, -156511736);
				if (null != class105 && class105.anObjectArray1120 != null) {
					Script class298_sub46 = new Script();
					class298_sub46.aClass105_7525 = class105;
					class298_sub46.params = class105.anObjectArray1120;
					Class444.method5889(class298_sub46, (byte) 77);
				}
				client.anInt8937 = 280458557;
				client.anInt8906 = -398138063;
				client.aBoolean8835 = false;
				if (class105 != null)
					Tradution.method6054(class105, -1858273017);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.kb(").append(')').toString());
		}
	}

	static final void method1588(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_4_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			if (Class287.myPlayer.aClass366_10209 != null)
				Class287.myPlayer.aClass366_10209.method4541(i_4_, i_5_, Class298_Sub32_Sub14.aClass477_9400, (byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fv.cv(").append(')').toString());
		}
	}
}
