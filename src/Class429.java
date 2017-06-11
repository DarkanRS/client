/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Locale;

public class Class429 implements Interface21 {
	public static Class429 aClass429_6624 = new Class429("EN", "en", "English", Class401.aClass401_6557, 0, "GB");
	public static Class429 aClass429_6625 = new Class429("DE", "de", "German", Class401.aClass401_6557, 1, "DE");
	public static Class429 aClass429_6626 = new Class429("FR", "fr", "French", Class401.aClass401_6557, 2, "FR");
	public static Class429 aClass429_6627 = new Class429("PT", "pt", "Portuguese", Class401.aClass401_6557, 3, "BR");
	static Class429 aClass429_6628 = new Class429("NL", "nl", "Dutch", Class401.aClass401_6560, 4, "NL");
	String aString6629;
	int anInt6630;
	public static int anInt6631 = 6;
	public static Class429 aClass429_6632 = new Class429("ES", "es", "Spanish", Class401.aClass401_6560, 5, "ES");
	String aString6633;
	Locale aLocale6634;
	static Class429[] aClass429Array6635;

	static {
		Class429[] class429s = method5756(13792257);
		aClass429Array6635 = new Class429[class429s.length];
		Class429[] class429s_0_ = class429s;
		for (int i = 0; i < class429s_0_.length; i++) {
			Class429 class429 = class429s_0_[i];
			if ((aClass429Array6635[-1719637847 * ((Class429) class429).anInt6630]) != null)
				throw new IllegalStateException();
			aClass429Array6635[-1719637847 * ((Class429) class429).anInt6630] = class429;
		}
	}

	public String method5753(int i) {
		try {
			return ((Class429) this).aString6629;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.b(").append(')').toString());
		}
	}

	public static Class429 method5754(int i, int i_1_) {
		try {
			if (i < 0 || i >= aClass429Array6635.length)
				return null;
			return aClass429Array6635[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.d(").append(')').toString());
		}
	}

	Class429(String string, String string_2_, String string_3_, Class401 class401, int i, String string_4_) {
		((Class429) this).aString6633 = string;
		((Class429) this).aString6629 = string_2_;
		((Class429) this).anInt6630 = -501302375 * i;
		Locale locale = null;
		if (null != string_4_)
			locale = new Locale(method5753(287861187), string_4_);
		if (null != locale)
			((Class429) this).aLocale6634 = locale;
		else
			((Class429) this).aLocale6634 = new Locale(method5753(218016567));
	}

	public String toString() {
		try {
			return method5753(-527740170).toLowerCase(Locale.ENGLISH);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.toString(").append(')').toString());
		}
	}

	public Locale method5755(int i) {
		try {
			return ((Class429) this).aLocale6634;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.p(").append(')').toString());
		}
	}

	public int method242(int i) {
		try {
			return ((Class429) this).anInt6630 * -1719637847;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.f(").append(')').toString());
		}
	}

	public int method244() {
		return ((Class429) this).anInt6630 * -1719637847;
	}

	public static Class429[] method5756(int i) {
		try {
			return (new Class429[] { aClass429_6632, aClass429_6626, aClass429_6628, aClass429_6625, aClass429_6624, aClass429_6627 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.a(").append(')').toString());
		}
	}

	static final void method5757(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub2_7547.method5628((byte) 103) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.ans(").append(')').toString());
		}
	}

	static final void method5758(IComponentDefinition class105, ClientScript2 class403, int i) {
		try {
			if (client.method2801(class105).method3492((byte) -12) && null == client.aClass105_8652) {
				Class117.method1280(class105.anInt1142 * -440872681, class105.anInt1154 * -1309843523, 1723723267);
				client.aClass105_8652 = Class140.method1558(-440872681 * class105.anInt1142, class105.anInt1154 * -1309843523, -156511736);
				Tradution.method6054(client.aClass105_8652, 1608408687);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.cl(").append(')').toString());
		}
	}

	public int method243() {
		return ((Class429) this).anInt6630 * -1719637847;
	}

	static final void method5759(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_6_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_5_ - i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.yp(").append(')').toString());
		}
	}

	public static BufferedConnectionContext method5760(short i) {
		try {
			if (Class299.method3682(-1233866115 * client.anInt8752, 1765230881))
				return client.lobbyConnection;
			return client.gameConnection;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.fc(").append(')').toString());
		}
	}

	static final void method5761(GraphicsToolkit class_ra, Interface_ma interface_ma, byte i) {
		try {
			if (null != Class301_Sub1.aClass298_Sub37_Sub13_3218) {
				Class122.method1319((byte) 1);
				Class122.method1319((byte) 1);
				if (Class301_Sub1.anInt7624 * -1289394455 < 10) {
					if (!Class301_Sub1.aClass243_3248.method2312(Class301_Sub1.aClass298_Sub37_Sub13_3218.aString9640, -2140139718)) {
						Class301_Sub1.anInt7624 = (Class_v.aClass243_7622.method2305((Class301_Sub1.aClass298_Sub37_Sub13_3218.aString9640), -1210672889)) / 10 * 1078186329;
						return;
					}
					Class318.method3873(16711935);
					Class301_Sub1.anInt7624 = -2103038598;
				}
				if (10 == Class301_Sub1.anInt7624 * -1289394455) {
					Class301_Sub1.anInt3245 = (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9650 * 1364716801) >> 6 << 6;
					Class301_Sub1.anInt3238 = (1345239131 * (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9649) >> 6 << 6);
					Class301_Sub1.anInt3239 = ((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9647 * -2052483955) >> 6 << 6) - Class301_Sub1.anInt3245 + 64;
					Class301_Sub1.anInt3240 = 64 + (((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9646) * 929385381 >> 6 << 6) - Class301_Sub1.anInt3238);
					int[] is = new int[3];
					int i_7_ = -1;
					int i_8_ = -1;
					Class217 class217 = (Class287.myPlayer.method4337().aClass217_2599);
					Class341 class341 = client.aClass283_8716.method2628(681479919);
					if (Class301_Sub1.aClass298_Sub37_Sub13_3218.method3453(Class287.myPlayer.plane, (((int) class217.aFloat2451 >> 9) + -1760580017 * class341.gameSceneBaseX), (283514611 * class341.gameSceneBaseY + ((int) class217.aFloat2454 >> 9)), is, 46106083)) {
						i_7_ = is[1] - Class301_Sub1.anInt3245;
						i_8_ = is[2] - Class301_Sub1.anInt3238;
					}
					if (!Class301_Sub1.aBoolean7631 && i_7_ >= 0 && i_7_ < Class301_Sub1.anInt3239 && i_8_ >= 0 && i_8_ < Class301_Sub1.anInt3240) {
						i_7_ += (int) (Math.random() * 10.0) - 5;
						i_8_ += (int) (Math.random() * 10.0) - 5;
						Class82_Sub14.anInt6875 = i_7_ * -2076584633;
						Class376.anInt4090 = -435591305 * i_8_;
					} else if (1646852571 * Class301_Sub1.anInt7629 != -1 && -1 != Class301_Sub1.anInt7623 * 679054909) {
						Class301_Sub1.aClass298_Sub37_Sub13_3218.method3452(1646852571 * Class301_Sub1.anInt7629, Class301_Sub1.anInt7623 * 679054909, is, -1594439812);
						if (null != is) {
							Class82_Sub14.anInt6875 = -2076584633 * (is[1] - Class301_Sub1.anInt3245);
							Class376.anInt4090 = ((is[2] - Class301_Sub1.anInt3238) * -435591305);
						}
						Class301_Sub1.anInt7623 = 1505298155;
						Class301_Sub1.anInt7629 = 1801430445;
						Class301_Sub1.aBoolean7631 = false;
					} else {
						Class301_Sub1.aClass298_Sub37_Sub13_3218.method3452((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9644) * -1973484731 >> 14 & 0x3fff, -1973484731 * (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9644) & 0x3fff, is, -1810513482);
						Class82_Sub14.anInt6875 = (is[1] - Class301_Sub1.anInt3245) * -2076584633;
						Class376.anInt4090 = (is[2] - Class301_Sub1.anInt3238) * -435591305;
					}
					if ((1110271707 * Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) == 37) {
						Class301_Sub1.aFloat3233 = 3.0F;
						Class301_Sub1.aFloat3234 = 3.0F;
					} else if ((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) * 1110271707 == 50) {
						Class301_Sub1.aFloat3233 = 4.0F;
						Class301_Sub1.aFloat3234 = 4.0F;
					} else if ((Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) * 1110271707 == 75) {
						Class301_Sub1.aFloat3233 = 6.0F;
						Class301_Sub1.aFloat3234 = 6.0F;
					} else if (1110271707 * (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) == 100) {
						Class301_Sub1.aFloat3233 = 8.0F;
						Class301_Sub1.aFloat3234 = 8.0F;
					} else if (1110271707 * (Class301_Sub1.aClass298_Sub37_Sub13_3218.anInt9645) == 200) {
						Class301_Sub1.aFloat3233 = 16.0F;
						Class301_Sub1.aFloat3234 = 16.0F;
					} else {
						Class301_Sub1.aFloat3233 = 8.0F;
						Class301_Sub1.aFloat3234 = 8.0F;
					}
					Class301_Sub1.anInt3254 = (int) Class301_Sub1.aFloat3233 >> 1;
					Class301_Sub1.aByteArrayArrayArray3229 = IcmpService_Sub1.method6381(Class301_Sub1.anInt3254, 51229796);
					Class225.method2103(65536);
					Class301_Sub1.method3706();
					Class476.aClass453_5986 = new Class453();
					Class301_Sub1.anInt3227 += (int) (Math.random() * 5.0) - 2;
					if (Class301_Sub1.anInt3227 < -8)
						Class301_Sub1.anInt3227 = -8;
					if (Class301_Sub1.anInt3227 > 8)
						Class301_Sub1.anInt3227 = 8;
					Class301_Sub1.anInt3228 += (int) (Math.random() * 5.0) - 2;
					if (Class301_Sub1.anInt3228 < -16)
						Class301_Sub1.anInt3228 = -16;
					if (Class301_Sub1.anInt3228 > 16)
						Class301_Sub1.anInt3228 = 16;
					Class301_Sub1.method3707(interface_ma, (Class301_Sub1.anInt3227 >> 2 << 10), Class301_Sub1.anInt3228 >> 1);
					Class301_Sub1.aClass339_3251.method4119(1024, 256, 303697513);
					Class301_Sub1.aClass487_3225.method6160(256, 256, -1144646938);
					Class301_Sub1.aClass433_3220.method5792(4096, (byte) 82);
					Class472.aClass314_5965.method3825(256, (byte) 85);
					Class301_Sub1.anInt7624 = 88890100;
				} else if (20 == Class301_Sub1.anInt7624 * -1289394455) {
					Class517.method6310(true, 1135939269);
					Class301_Sub1.method3699(class_ra, Class301_Sub1.anInt3227, Class301_Sub1.anInt3228);
					Class301_Sub1.anInt7624 = 266670300;
					Class517.method6310(true, -167716120);
					Class113.method1247(1781088902);
				} else if (60 == -1289394455 * Class301_Sub1.anInt7624) {
					if (Class301_Sub1.aClass243_3248.method2295(new StringBuilder().append(Class301_Sub1.aClass298_Sub37_Sub13_3218.aString9640).append("_staticelements").toString(), -400372089)) {
						if (!Class301_Sub1.aClass243_3248.method2312(new StringBuilder().append(Class301_Sub1.aClass298_Sub37_Sub13_3218.aString9640).append("_staticelements").toString(), -2145213052))
							return;
						Class301_Sub1.aClass296_3235 = (Class237.method2192(Class301_Sub1.aClass243_3248, new StringBuilder().append(Class301_Sub1.aClass298_Sub37_Sub13_3218.aString9640).append("_staticelements").toString(), client.isMemberWorld, 565671699));
					} else
						Class301_Sub1.aClass296_3235 = new Class296(0);
					Class301_Sub1.method3697();
					Class301_Sub1.anInt7624 = -1836368298;
					Class517.method6310(true, -425949519);
					Class113.method1247(1992969478);
				} else if (70 == -1289394455 * Class301_Sub1.anInt7624) {
					Class381.aClass4_4119 = new Class4(class_ra, 11, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 1398190689;
					Class517.method6310(true, 2032737613);
					Class113.method1247(1735117784);
				} else if (Class301_Sub1.anInt7624 * -1289394455 == 73) {
					Class255.aClass4_2795 = new Class4(class_ra, 12, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 337782380;
					Class517.method6310(true, -1803108343);
					Class113.method1247(1554661852);
				} else if (76 == Class301_Sub1.anInt7624 * -1289394455) {
					Class52.aClass4_508 = new Class4(class_ra, 14, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = -722625929;
					Class517.method6310(true, 116445632);
					Class113.method1247(2075393869);
				} else if (79 == -1289394455 * Class301_Sub1.anInt7624) {
					Class414.aClass4_5326 = new Class4(class_ra, 17, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = -1783034238;
					Class517.method6310(true, 325987584);
					Class113.method1247(1544627507);
				} else if (Class301_Sub1.anInt7624 * -1289394455 == 82) {
					Class355.aClass4_6525 = new Class4(class_ra, 19, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 1451524749;
					Class517.method6310(true, -828062204);
					Class113.method1247(1642218574);
				} else if (Class301_Sub1.anInt7624 * -1289394455 == 85) {
					Class400.aClass4_5224 = new Class4(class_ra, 22, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 391116440;
					Class517.method6310(true, -315961699);
					Class113.method1247(1825490798);
				} else if (88 == -1289394455 * Class301_Sub1.anInt7624) {
					Class152.aClass4_1594 = new Class4(class_ra, 26, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = -669291869;
					Class517.method6310(true, 1357229880);
					Class113.method1247(1747834568);
				} else {
					Class241.aClass4_2707 = new Class4(class_ra, 30, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 444450500;
					Class517.method6310(true, 1961372940);
					Class113.method1247(1885514262);
					System.gc();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rt.bq(").append(')').toString());
		}
	}
}
