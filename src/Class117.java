/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117 {
	public int anInt1393;
	public int anInt1394;
	public int[] anIntArray1395;
	public int[] anIntArray1396;
	public Class_ta aClass_ta1397;
	int anInt1398;
	public static int anInt1399;

	public boolean method1274(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ >= 0 && i_0_ < anIntArray1396.length) {
				int i_2_ = anIntArray1396[i_0_];
				if (i >= i_2_ && i <= anIntArray1395[i_0_] + i_2_)
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.a(").append(')').toString());
		}
	}

	Class117(int i, int i_3_, int[] is, int[] is_4_, Class_ta class_ta, int i_5_) {
		anInt1393 = i * 1311761597;
		anInt1394 = i_3_ * 1702073049;
		anIntArray1395 = is;
		anIntArray1396 = is_4_;
		aClass_ta1397 = class_ta;
		((Class117) this).anInt1398 = -367449257 * i_5_;
	}

	static boolean method1275(byte i) {
		try {
			return Class492.method6184(Class144.aClass381_1563.aClass355_4116, -1677177503);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.f(").append(')').toString());
		}
	}

	static String method1276(String string, byte i) {
		try {
			String string_6_ = null;
			int i_7_ = string.indexOf("--> ");
			if (i_7_ >= 0) {
				string_6_ = string.substring(0, 4 + i_7_);
				string = string.substring(i_7_ + 4);
			}
			if (string.startsWith("directlogin ")) {
				int i_8_ = string.indexOf(" ", "directlogin ".length());
				if (i_8_ >= 0) {
					int i_9_ = string.length();
					string = new StringBuilder().append(string.substring(0, i_8_)).append(" ").toString();
					for (int i_10_ = i_8_ + 1; i_10_ < i_9_; i_10_++)
						string = new StringBuilder().append(string).append("*").toString();
				}
			}
			if (null != string_6_)
				return new StringBuilder().append(string_6_).append(string).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.z(").append(')').toString());
		}
	}

	static final void method1277(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class435.method5804(-1233866115 * client.anInt8752, (byte) -20) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.afp(").append(')').toString());
		}
	}

	public static void method1278(byte i) {
		try {
			for (Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5816(2005270396)); null != class298_sub49; class298_sub49 = (Class298_Sub49) Class423.aClass437_5354.method5815((byte) 63))
				Class285.method2710(1566028323 * ((Class298_Sub49) class298_sub49).anInt7589, (byte) 69);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.x(").append(')').toString());
		}
	}

	public static final void method1279(int i) {
		try {
			String string = (null != Class486.aString6063 ? Class486.aString6063 : ClientScriptMap.method6131((byte) -3));
			Class346.method4172(string, false, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-2014540467) == 5, client.aBoolean8867, client.aBoolean8651, (byte) 37);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.fb(").append(')').toString());
		}
	}

	public static void method1280(int i, int i_11_, int i_12_) {
		try {
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.DIALOGUE_CONTINUE_PACKET, client.gameConnection.aClass449_330, (byte) 84);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(i, -1769259974);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(i_11_);
			client.gameConnection.method390(class298_sub36, (byte) -5);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.ks(").append(')').toString());
		}
	}

	static final void method1281(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1484045541 * Class301_Sub1.anInt7625;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class413.anInt6590 * 1464638883;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.adn(").append(')').toString());
		}
	}

	static void method1282(IComponentDefinition[] class105s, IComponentDefinition class105, boolean bool, short i) {
		try {
			int i_13_ = (0 != 1867913305 * class105.anInt1168 ? 1867913305 * class105.anInt1168 : -2093041337 * class105.anInt1156);
			int i_14_ = (0 != 2053897963 * class105.anInt1169 ? class105.anInt1169 * 2053897963 : 457937409 * class105.anInt1162);
			Class372.method4591(class105s, -440872681 * class105.anInt1142, i_13_, i_14_, bool, (short) 17804);
			if (null != class105.aClass105Array1293)
				Class372.method4591(class105.aClass105Array1293, -440872681 * class105.anInt1142, i_13_, i_14_, bool, (short) -9832);
			Interface class298_sub51 = ((Interface) client.aClass437_8841.get((long) (class105.anInt1142 * -440872681)));
			if (class298_sub51 != null)
				Class95.method1033(-1617025021 * class298_sub51.interfaceId, i_13_, i_14_, bool, 1828905535);
			if (class105 == client.aClass105_8819) {
				int i_15_ = Class10.anInt129 * 1168366243;
				int[] is = Class10.anIntArray135;
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
					Player class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_16_]]);
					if (class365_sub1_sub1_sub2_sub2 != null)
						class365_sub1_sub1_sub2_sub2.method4442(i_13_, i_14_, bool, 1554634008);
				}
				for (int i_17_ = 0; i_17_ < client.anInt8703 * -1230451913; i_17_++) {
					int i_18_ = client.anIntArray8699[i_17_];
					Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_18_));
					if (null != class298_sub29)
						((Entity) class298_sub29.anObject7366).method4442(i_13_, i_14_, bool, 1554634008);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.ko(").append(')').toString());
		}
	}

	static final void method1283(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class298_Sub32_Sub34.method3364(class105, class119, class403, -125767294);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.nl(").append(')').toString());
		}
	}

	static final void method1284(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_19_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_20_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			if (null == Class389.aClass119Array4165[i_19_])
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			else {
				String string = (Class389.aClass119Array4165[i_19_].aClass105Array1405[i_20_].aString1259);
				if (string == null)
					((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
				else
					((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = string;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.alv(").append(')').toString());
		}
	}

	static final void method1285(Class298_Sub1 class298_sub1, int i) {
		try {
			Class331 class331 = client.aClass283_8716.method2675(-1611682495);
			if (class331 != null) {
				Interface3 interface3 = null;
				if (0 == ((Class298_Sub1) class298_sub1).anInt7157 * -431456739)
					interface3 = ((Interface3) class331.method4031(2108312995 * (((Class298_Sub1) class298_sub1).anInt7151), (class298_sub1.anInt7150 * 634196087), (-2146829167 * class298_sub1.anInt7155), 1297068206));
				if (((Class298_Sub1) class298_sub1).anInt7157 * -431456739 == 1)
					interface3 = ((Interface3) class331.method4033(2108312995 * (((Class298_Sub1) class298_sub1).anInt7151), (634196087 * class298_sub1.anInt7150), (class298_sub1.anInt7155 * -2146829167), 1080081135));
				if (2 == -431456739 * ((Class298_Sub1) class298_sub1).anInt7157)
					interface3 = ((Interface3) (class331.method4035((2108312995 * ((Class298_Sub1) class298_sub1).anInt7151), class298_sub1.anInt7150 * 634196087, -2146829167 * class298_sub1.anInt7155, client.anInterface17_8960, -2076271452)));
				if (-431456739 * ((Class298_Sub1) class298_sub1).anInt7157 == 3)
					interface3 = ((Interface3) class331.method4058(2108312995 * (((Class298_Sub1) class298_sub1).anInt7151), (634196087 * class298_sub1.anInt7150), (-2146829167 * class298_sub1.anInt7155), (byte) 16));
				if (interface3 != null) {
					((Class298_Sub1) class298_sub1).anInt7148 = interface3.method32((byte) 29) * 1182121109;
					((Class298_Sub1) class298_sub1).anInt7154 = interface3.method29(726839210) * -723189599;
					((Class298_Sub1) class298_sub1).anInt7161 = interface3.method30((short) 24143) * 1338356755;
				} else {
					((Class298_Sub1) class298_sub1).anInt7148 = -1182121109;
					((Class298_Sub1) class298_sub1).anInt7154 = 0;
					((Class298_Sub1) class298_sub1).anInt7161 = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("et.p(").append(')').toString());
		}
	}
}
