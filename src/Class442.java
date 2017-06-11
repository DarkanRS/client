/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class442 {
	Class302 aClass302_5591 = new Class302();
	Class302 aClass302_5592;

	public Class302 method5868(int i) {
		try {
			Class302 class302 = ((Class442) this).aClass302_5591.aClass302_3258;
			if (((Class442) this).aClass302_5591 == class302) {
				((Class442) this).aClass302_5592 = null;
				return null;
			}
			((Class442) this).aClass302_5592 = class302.aClass302_3258;
			return class302;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.p(").append(')').toString());
		}
	}

	public void method5869(int i) {
		try {
			for (;;) {
				Class302 class302 = ((Class442) this).aClass302_5591.aClass302_3258;
				if (class302 == ((Class442) this).aClass302_5591) {
					if (i == -827035610) {
						/* empty */
					}
					break;
				}
				class302.method3714(1227012661);
			}
			((Class442) this).aClass302_5592 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.a(").append(')').toString());
		}
	}

	public void method5870(Class302 class302, int i) {
		try {
			if (class302.aClass302_3259 != null)
				class302.method3714(-846419979);
			class302.aClass302_3259 = ((Class442) this).aClass302_5591.aClass302_3259;
			class302.aClass302_3258 = ((Class442) this).aClass302_5591;
			class302.aClass302_3259.aClass302_3258 = class302;
			class302.aClass302_3258.aClass302_3259 = class302;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.f(").append(')').toString());
		}
	}

	public Class302 method5871(byte i) {
		try {
			Class302 class302 = ((Class442) this).aClass302_5591.aClass302_3258;
			if (class302 == ((Class442) this).aClass302_5591)
				return null;
			class302.method3714(1715845089);
			return class302;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.b(").append(')').toString());
		}
	}

	public Class442() {
		((Class442) this).aClass302_5591.aClass302_3258 = ((Class442) this).aClass302_5591;
		((Class442) this).aClass302_5591.aClass302_3259 = ((Class442) this).aClass302_5591;
	}

	public Class302 method5872(int i) {
		try {
			Class302 class302 = ((Class442) this).aClass302_5592;
			if (class302 == ((Class442) this).aClass302_5591) {
				((Class442) this).aClass302_5592 = null;
				return null;
			}
			((Class442) this).aClass302_5592 = class302.aClass302_3258;
			return class302;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.i(").append(')').toString());
		}
	}

	static final void method5873(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_0_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			boolean bool = 1 == (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			if (null != Class301_Sub1.aClass437_7637) {
				Linkable class298 = Class301_Sub1.aClass437_7637.get((long) i_0_);
				if (class298 != null && !bool)
					class298.unlink(-1460969981);
				else if (null == class298 && bool) {
					class298 = new Linkable();
					Class301_Sub1.aClass437_7637.method5817(class298, (long) i_0_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.aes(").append(')').toString());
		}
	}

	static final void method5874(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((Class365_Sub1) ((ClientScript2) class403).anInterface3_5233).method4363((byte) 23);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.apc(").append(')').toString());
		}
	}

	static final void method5875(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aBoolean8646 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.ako(").append(')').toString());
		}
	}

	static final void method5876(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class352 class352 = Class363.aClass339_3931.method4116(i_1_, -2066562424);
			if (null == class352.aString3792)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class352.aString3792;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.ame(").append(')').toString());
		}
	}

	static final void method5877(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class497 class497 = Class92.aClass504_905.method6251(i_2_, -2087973893);
			if (class497.method6206(1883696427))
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class105.method1109(i_2_, class497.aString6101, 2117840940);
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class105.method1117(i_2_, -388931549 * class497.anInt6100, -659898667);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.pi(").append(')').toString());
		}
	}

	static final void method5878(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class190.method1859((byte) -52);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.aex(").append(')').toString());
		}
	}

	static final void method5879(int i) {
		try {
			Class504.aClass375_6196.method4647(5, (byte) 50);
			Class151.aClass451_6358.method5930(5, 203948089);
			Class212.aClass144_2433.method1582(5, -754640866);
			client.aClass283_8716.method2641(1725751477).method5794(5, (byte) 49);
			Class15.aClass507_224.method6275(5, 1533104330);
			Class298_Sub32_Sub14.aClass477_9400.method6090(5, (byte) 35);
			Class501.aClass395_6122.method4904(5, (byte) 1);
			Class158_Sub1.aClass389_8568.method4859(5, 2135509320);
			Class472.aClass314_5965.method3826(5, (byte) -13);
			Class440.aClass205_5582.method1916(5, (byte) 0);
			Class422_Sub7.aClass445_8384.method5894(5, (byte) 79);
			Class82_Sub16.aClass427_6886.method5746(5, 1584837468);
			Class99.aClass517_951.method6304(5, 977511908);
			Class299.aClass370_3199.method4573(5, 181310577);
			Class94.aClass349_913.method4200(5, (byte) -101);
			Class363.aClass339_3931.method4117(5, (byte) 14);
			Class120.aClass487_1463.method6163(5, -718074838);
			Class92.aClass504_905.method6249(5, (byte) 46);
			ConfigDefinitions.aClass317_3472.method3847(5, -2144491274);
			Class138_Sub1.aClass131_7010.method1469(5, (short) -24291);
			Class237.aClass499_6668.method6215(5, -1366340541);
			Class_na.aClass491_9686.method6174(5, (byte) 1);
			Class500.aClass347_6117.method4178(5, 954763498);
			Class284.method2692(5, -2130793500);
			Class237.method2197(50, (byte) -75);
			Class497.aClass197_6105.method1881(50, -1029006216);
			Class484.method6141(5, (byte) 24);
			Class264.method2496(5, 368704432);
			client.aClass348_8780.method4186(5, -1305461493);
			client.aClass348_8898.method4186(5, -659243138);
			client.aClass348_8697.method4186(5, -2138729636);
			Class436.aClass348_5500.method4186(5, -1070209353);
			Class388.aClass348_4153.method4186(5, 424638982);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sg.gf(").append(')').toString());
		}
	}
}
