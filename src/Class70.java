/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class70 {
	int anInt682;
	HashTable aClass437_683;

	public void method797(byte i) {
		try {
			if (((Class70) this).aClass437_683 != null)
				((Class70) this).aClass437_683.clear((byte) -68);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.a(").append(')').toString());
		}
	}

	public int method798(int i, int i_0_) {
		try {
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((Class70) this).aClass437_683.get((long) i));
			if (null != class298_sub35)
				return class298_sub35.anInt7394 * -774922497;
			Class207 class207 = Class440.aClass205_5582.method1914(i, 976929284);
			if ('i' != class207.aChar2358)
				return -1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.b(").append(')').toString());
		}
	}

	public int method799(int i, int i_1_) {
		try {
			ConfigDefinitions class327 = Class472.aClass314_5965.getConfigDefinitions(i, -781710328);
			int i_2_ = -50358139 * class327.anInt3469;
			int i_3_ = (31 == class327.anInt3470 * 1394539663 ? -1 : (1 << 1 + class327.anInt3470 * 1394539663) - 1);
			return ((method798(i_2_, 1116679673) & i_3_) >>> -1528472107 * class327.anInt3468);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.p(").append(')').toString());
		}
	}

	Class70(int i) {
		((Class70) this).anInt682 = -1382335519 * i;
	}

	public void method800(int i, int i_4_, byte i_5_) {
		try {
			if (((Class70) this).aClass437_683 == null)
				((Class70) this).aClass437_683 = new HashTable(1793476641 * ((Class70) this).anInt682);
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((Class70) this).aClass437_683.get((long) i));
			if (null != class298_sub35)
				class298_sub35.anInt7394 = i_4_ * -898670337;
			else {
				class298_sub35 = new Class298_Sub35(i_4_);
				((Class70) this).aClass437_683.method5817(class298_sub35, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.f(").append(')').toString());
		}
	}

	public static void method801(int i, int i_6_) {
		try {
			if (617004265 * Class79.anInt734 != 0)
				Class79.anInt739 = i * -2102749749;
			else
				Class79.aClass298_Sub19_Sub1_737.method2961(i, 1891579233);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.k(").append(')').toString());
		}
	}

	static void method802(GraphicsToolkit class_ra, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		try {
			Class331 class331 = client.aClass283_8716.method2675(-1611682495);
			Interface3 interface3 = (Interface3) class331.method4031(i, i_7_, i_8_, 987531084);
			if (null != interface3) {
				ObjectDefinitions class432 = (client.aClass283_8716.method2641(-1178105216).getObjectDefinitions(interface3.method32((byte) 20)));
				int i_14_ = interface3.method30((short) 12592) & 0x3;
				int i_15_ = interface3.method29(726839210);
				if (-1 != -1204256389 * class432.anInt5400)
					Class82.method871(class_ra, class432, i_14_, i_9_, i_10_, (byte) 112);
				else {
					int i_16_ = i_11_;
					if (1532834983 * class432.anInt5382 > 0)
						i_16_ = i_12_;
					if ((i_15_ == -1976050083 * Class424.aClass424_6614.anInt6613) || (-1976050083 * Class424.aClass424_6593.anInt6613 == i_15_)) {
						if (i_14_ == 0)
							class_ra.method5035(i_9_, i_10_, 4, i_16_, (short) 23432);
						else if (1 == i_14_)
							class_ra.method4990(i_9_, i_10_, 4, i_16_, -1904897279);
						else if (2 == i_14_)
							class_ra.method5035(i_9_ + 3, i_10_, 4, i_16_, (short) 29834);
						else if (i_14_ == 3)
							class_ra.method4990(i_9_, 3 + i_10_, 4, i_16_, -1141905509);
					}
					if (i_15_ == -1976050083 * Class424.aClass424_6594.anInt6613) {
						if (0 == i_14_)
							class_ra.method5015(i_9_, i_10_, 1, 1, i_16_, (byte) 7);
						else if (1 == i_14_)
							class_ra.method5015(i_9_ + 3, i_10_, 1, 1, i_16_, (byte) 7);
						else if (i_14_ == 2)
							class_ra.method5015(i_9_ + 3, i_10_ + 3, 1, 1, i_16_, (byte) 7);
						else if (3 == i_14_)
							class_ra.method5015(i_9_, 3 + i_10_, 1, 1, i_16_, (byte) 7);
					}
					if (Class424.aClass424_6593.anInt6613 * -1976050083 == i_15_) {
						if (i_14_ == 0)
							class_ra.method4990(i_9_, i_10_, 4, i_16_, -1677742445);
						else if (i_14_ == 1)
							class_ra.method5035(3 + i_9_, i_10_, 4, i_16_, (short) 29201);
						else if (i_14_ == 2)
							class_ra.method4990(i_9_, i_10_ + 3, 4, i_16_, -1634037143);
						else if (i_14_ == 3)
							class_ra.method5035(i_9_, i_10_, 4, i_16_, (short) 30949);
					}
				}
			}
			interface3 = (Interface3) class331.method4035(i, i_7_, i_8_, client.anInterface17_8960, -1880419927);
			if (null != interface3) {
				ObjectDefinitions class432 = (client.aClass283_8716.method2641(-258471564).getObjectDefinitions(interface3.method32((byte) -26)));
				int i_17_ = interface3.method30((short) 29260) & 0x3;
				int i_18_ = interface3.method29(726839210);
				if (-1204256389 * class432.anInt5400 != -1)
					Class82.method871(class_ra, class432, i_17_, i_9_, i_10_, (byte) 7);
				else if (Class424.aClass424_6595.anInt6613 * -1976050083 == i_18_) {
					int i_19_ = -1118482;
					if (1532834983 * class432.anInt5382 > 0)
						i_19_ = -1179648;
					if (i_17_ == 0 || i_17_ == 2)
						class_ra.method5018(i_9_, 3 + i_10_, i_9_ + 3, i_10_, i_19_, 1835700999);
					else
						class_ra.method5018(i_9_, i_10_, 3 + i_9_, 3 + i_10_, i_19_, 1577612026);
				}
			}
			interface3 = (Interface3) class331.method4058(i, i_7_, i_8_, (byte) 125);
			if (null != interface3) {
				ObjectDefinitions class432 = (client.aClass283_8716.method2641(541526744).getObjectDefinitions(interface3.method32((byte) 49)));
				int i_20_ = interface3.method30((short) 12476) & 0x3;
				if (-1 != -1204256389 * class432.anInt5400)
					Class82.method871(class_ra, class432, i_20_, i_9_, i_10_, (byte) 79);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.u(").append(')').toString());
		}
	}

	public static void method803(int i, String string, int i_21_, int i_22_) {
		try {
			ClientScript class298_sub37_sub17 = Class86.method963(Class502.aClass502_6724, i, -1, -1048089766);
			if (class298_sub37_sub17 != null) {
				ClientScript2 class403 = Class211.method1950(1034965053);
				((ClientScript2) class403).anIntArray5248 = new int[class298_sub37_sub17.anInt9679 * -1516159487];
				((ClientScript2) class403).anObjectArray5234 = new String[class298_sub37_sub17.anInt9680 * 1787035509];
				((ClientScript2) class403).anObjectArray5234[0] = string;
				((ClientScript2) class403).anIntArray5248[0] = i_21_;
				ClientScriptsExecutor.method4690(class298_sub37_sub17, 200000, class403, -1502517885);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.n(").append(')').toString());
		}
	}

	public static int method804(int i, int i_23_, short i_24_) {
		try {
			int i_25_ = 1;
			for (/**/; i_23_ > 1; i_23_ >>= 1) {
				if (0 != (i_23_ & 0x1))
					i_25_ *= i;
				i *= i;
			}
			if (1 == i_23_)
				return i_25_ * i;
			return i_25_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.a(").append(')').toString());
		}
	}

	static void method805(byte i) {
		try {
			Class525.aClass486_6298 = Class486.aClass486_6060;
			Class525.aClass412_6299 = Class412.aClass412_6565;
			Class357.aClass413_3845 = Class413.aClass413_6584;
			Class378.aClass428_4094 = Class428.aClass428_6618;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.f(").append(')').toString());
		}
	}

	public static void method806(Class243 class243, byte i) {
		try {
			Class74.anInt691 = class243.method2311("p11_full", -1951605663) * 1133798363;
			Class74.anInt690 = class243.method2311("p12_full", -2095742316) * 399685195;
			Class74.anInt698 = class243.method2311("b12_full", -1180441399) * 1666679073;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.a(").append(')').toString());
		}
	}

	public static final int method807(int i, int i_26_, int i_27_, int i_28_, int i_29_, byte i_30_) {
		try {
			if (client.aClass283_8716.method2675(-1611682495) == null)
				return 0;
			if (i_29_ < 3) {
				Class244 class244 = client.aClass283_8716.method2654(1767942332);
				int i_31_ = i >> 9;
				int i_32_ = i_26_ >> 9;
				if (i_27_ < 0 || i_28_ < 0 || (i_27_ > client.aClass283_8716.method2629(-1972690353) - 1) || i_28_ > client.aClass283_8716.method2630(-61619148) - 1)
					return 0;
				if (i_31_ < 1 || i_32_ < 1 || (i_31_ > client.aClass283_8716.method2629(-1988640932) - 1) || (i_32_ > client.aClass283_8716.method2630(-694658273) - 1))
					return 0;
				boolean bool = 0 != ((class244.aByteArrayArrayArray2731[1][i >> 9][i_26_ >> 9]) & 0x2);
				if ((i & 0x1ff) == 0) {
					boolean bool_33_ = (((class244.aByteArrayArrayArray2731[1][i_31_ - 1][i_26_ >> 9]) & 0x2) != 0);
					boolean bool_34_ = 0 != ((class244.aByteArrayArrayArray2731[1][i_31_][i_26_ >> 9]) & 0x2);
					if (bool_34_ != bool_33_)
						bool = 0 != ((class244.aByteArrayArrayArray2731[1][i_27_][i_28_]) & 0x2);
				}
				if ((i_26_ & 0x1ff) == 0) {
					boolean bool_35_ = (((class244.aByteArrayArrayArray2731[1][i >> 9][i_32_ - 1]) & 0x2) != 0);
					boolean bool_36_ = ((class244.aByteArrayArrayArray2731[1][i >> 9][i_32_] & 0x2) != 0);
					if (bool_36_ != bool_35_)
						bool = ((class244.aByteArrayArrayArray2731[1][i_27_][i_28_]) & 0x2) != 0;
				}
				if (bool)
					i_29_++;
			}
			return client.aClass283_8716.method2675(-1611682495).aClass_xaArray3517[i_29_].method6340(i, i_26_, -1371980258);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.ja(").append(')').toString());
		}
	}

	public static void method808(int i, int i_37_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(10, (long) i);
			class298_sub37_sub12.method3445(-1412217447);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cv.z(").append(')').toString());
		}
	}
}
