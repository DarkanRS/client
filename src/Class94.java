/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class94 {
	int anInt906;
	int[] anIntArray907;
	static int anInt908 = 25;
	public int anInt909;
	NPC aClass365_Sub1_Sub1_Sub2_Sub1_910;
	Player aClass365_Sub1_Sub1_Sub2_Sub2_911;
	public boolean aBoolean912 = false;
	public static Class349 aClass349_913;

	Class94(RsByteBuffer class298_sub53, int i) {
		((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910 = null;
		((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911 = null;
		((Class94) this).anInt906 = i * 1288449687;
		int i_0_ = class298_sub53.readUnsignedByte();
		switch (i_0_) {
		case 0:
			anInt909 = class298_sub53.readBigSmart(1235052657) * -44295909;
			break;
		default:
			anInt909 = 44295909;
			break;
		case 1:
			anInt909 = 44295909;
		}
		class298_sub53.readString(-494050654);
	}

	public Entity method1015(int i) {
		try {
			if (null != ((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910)
				return ((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910;
			return ((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.p(").append(')').toString());
		}
	}

	void method1016(byte i) {
		try {
			((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910 = null;
			((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911 = null;
			aBoolean912 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.f(").append(')').toString());
		}
	}

	void method1017(int i, int i_1_, int i_2_, int i_3_) {
		try {
			if (((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910 != null)
				((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.method4456(i, i_1_, i_2_, true, ((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.getSize(), (byte) 21);
			else {
				((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.plane = ((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.aByte7724 = (byte) i;
				((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.method4472(i_1_, i_2_, -1945697758);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.b(").append(')').toString());
		}
	}

	void method1018(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if (!aBoolean912) {
				aBoolean912 = true;
				if (1762367763 * anInt909 >= 0) {
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910 = (new NPC(client.aClass283_8716.method2675(-1611682495), 25));
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.anInt10064 = ((Class94) this).anInt906 * 302956801;
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.anInt10075 = client.anInt8884 * -128551287;
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.method4464(Class15.aClass507_224.method6269(anInt909 * 1762367763, 1863267717), 2139515630);
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.setSizeOffset(-2095128707 * (((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.aClass503_10190.anInt6187), -1254496694);
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.anInt10115 = -1186616623 * (((((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.aClass503_10190.anInt6181) * -1927065533) << 3);
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.anInt10071 = (((Class87.anInt803 += 2029434363) * -132903629 - 1) * -689024993);
				} else {
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911 = (new Player(client.aClass283_8716.method2675(-1611682495), 25));
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.sendAppearence(Class128_Sub1.aClass298_Sub53_8555, (byte) 3);
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.anInt10064 = 302956801 * ((Class94) this).anInt906;
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.anInt10075 = -128551287 * client.anInt8884;
					((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.anInt10071 = (((Class87.anInt803 += 2029434363) * -132903629 - 1) * -689024993);
				}
			}
			if (1762367763 * anInt909 >= 0) {
				((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.method4456(i_5_, i, i_4_, true, ((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.getSize(), (byte) 43);
				((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub1_910.method4415(i_6_, true, 43552435);
			} else {
				((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.plane = ((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.aByte7724 = (byte) i_5_;
				((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.method4472(i, i_4_, -2044145189);
				((Class94) this).aClass365_Sub1_Sub1_Sub2_Sub2_911.method4415(i_6_, true, 1586583742);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.a(").append(')').toString());
		}
	}

	boolean method1019(int i) {
		try {
			if (anInt909 * 1762367763 >= 0) {
				SomethingDefinitions class503 = Class15.aClass507_224.method6269(1762367763 * anInt909, 2059716043);
				boolean bool = class503.method6238(-1621243143);
				if (((Class94) this).anIntArray907 == null) {
					Class350 class350 = aClass349_913.method4202((class503.anInt6132 * 525312939), (byte) 47);
					((Class94) this).anIntArray907 = class350.method4210(2115260709);
				}
				int[] is = ((Class94) this).anIntArray907;
				for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
					int i_9_ = is[i_8_];
					bool &= Class501.aClass395_6122.method4903(i_9_, (byte) 66).method4880(1245807797);
				}
				return bool;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.i(").append(')').toString());
		}
	}

	public static Class115 method1020(int mapSize, int i_10_) {
		try {
			Class115[] class115s = Class22.method370(-966564932);
			for (int i_11_ = 0; i_11_ < class115s.length; i_11_++) {
				Class115 class115 = class115s[i_11_];
				if (mapSize == -160182505 * class115.anInt1387)
					return class115;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.f(").append(')').toString());
		}
	}

	static final void method1021(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class127.method1419(class105, class119, class403, 1780401940);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.gb(").append(')').toString());
		}
	}

	static final void method1022(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class21.method365(class105, class119, true, 0, class403, 338177533);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.hn(").append(')').toString());
		}
	}

	static final void method1023(ClientScript2 class403, int i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) == 1 ? 1 : 0, -1851948852);
			Class359.method4294(-1900445314);
			client.aClass283_8716.method2640((byte) -42).method4324(134111872);
			Class3.method300(656179282);
			client.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.aif(").append(')').toString());
		}
	}

	static final void method1024(ClientScript2 class403, int i) {
		try {
			IComponentDefinition.method1135(((Class365_Sub1) ((ClientScript2) class403).anInterface3_5233), class403, -778688640);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.apd(").append(')').toString());
		}
	}

	static final void method1025(ClientScript2 class403, int i) {
		try {
			if (client.playerRights * 1806357379 >= 2)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1806357379 * client.playerRights;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.tb(").append(')').toString());
		}
	}

	static final void method1026(ClientScript2 class403, int i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (-257444687 * client.WINDOW_PANE_ID != -1) {
				if (i_12_ == 0) {
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = client.WINDOW_PANE_ID * -257444687;
					return;
				}
				i_12_--;
			}
			Interface class298_sub51 = ((Interface) client.aClass437_8841.method5816(1645730647));
			while (i_12_-- > 0)
				class298_sub51 = (Interface) client.aClass437_8841.method5815((byte) -33);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1617025021 * class298_sub51.interfaceId;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dv.alc(").append(')').toString());
		}
	}
}
