/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class439 {
	byte[] aByteArray5536;
	int anInt5537 = 16;
	int anInt5538 = 258;
	int anInt5539 = 6;
	int[][] anIntArrayArray5540;
	int anInt5541 = 18002;
	int anInt5542;
	int anInt5543;
	int anInt5544;
	int anInt5545 = 4096;
	int anInt5546;
	int anInt5547;
	int anInt5548;
	byte[][] aByteArrayArray5549;
	byte[] aByteArray5550;
	int anInt5551;
	int anInt5552;
	int anInt5553;
	int anInt5554;
	int anInt5555;
	int anInt5556;
	int[] anIntArray5557;
	int anInt5558 = 50;
	int[] anIntArray5559;
	static int[] anIntArray5560;
	int anInt5561;
	byte[] aByteArray5562;
	boolean[] aBooleanArray5563;
	byte[] aByteArray5564;
	int[][] anIntArrayArray5565;
	int[] anIntArray5566;
	byte[] aByteArray5567;
	byte[] aByteArray5568;
	int[] anIntArray5569;
	byte aByte5570;
	int anInt5571;
	int[][] anIntArrayArray5572;
	boolean[] aBooleanArray5573;
	int anInt5574;
	public static Class243 aClass243_5575;

	Class439() {
		((Class439) this).anInt5537 = 16;
		((Class439) this).anInt5538 = 258;
		((Class439) this).anInt5539 = 6;
		((Class439) this).anInt5558 = 50;
		((Class439) this).anInt5541 = 18002;
		((Class439) this).anInt5543 = 0;
		((Class439) this).anInt5546 = 0;
		((Class439) this).anIntArray5557 = new int[256];
		((Class439) this).anIntArray5559 = new int[257];
		((Class439) this).aBooleanArray5573 = new boolean[256];
		((Class439) this).aBooleanArray5563 = new boolean[16];
		((Class439) this).aByteArray5564 = new byte[256];
		((Class439) this).aByteArray5568 = new byte[4096];
		((Class439) this).anIntArray5569 = new int[16];
		((Class439) this).aByteArray5567 = new byte[18002];
		((Class439) this).aByteArray5562 = new byte[18002];
		((Class439) this).aByteArrayArray5549 = new byte[6][258];
		((Class439) this).anIntArrayArray5565 = new int[6][258];
		((Class439) this).anIntArrayArray5540 = new int[6][258];
		((Class439) this).anIntArrayArray5572 = new int[6][258];
		((Class439) this).anIntArray5566 = new int[6];
	}

	public static final void method5850(String string, int i) {
		try {
			if (null != string) {
				if ((-1054937867 * client.anInt8941 >= 200 && !client.aBoolean8807) || -1054937867 * client.anInt8941 >= 200)
					Class264.method2492(4, (Tradution.aClass470_5831.method6049(Class321.aClass429_3357, -875414210)), (byte) -99);
				else {
					String string_0_ = Class173.method1824(string, 554575211);
					if (null != string_0_) {
						for (int i_1_ = 0; i_1_ < client.anInt8941 * -1054937867; i_1_++) {
							String string_2_ = Class173.method1824((client.aStringArray8704[i_1_]), 460678269);
							if (null != string_2_ && string_2_.equals(string_0_)) {
								Class264.method2492(4, new StringBuilder().append(string).append(Tradution.aClass470_5923.method6049((Class321.aClass429_3357), -875414210)).toString(), (byte) -72);
								return;
							}
							if (client.aStringArray8945[i_1_] != null) {
								String string_3_ = Class173.method1824((client.aStringArray8945[i_1_]), -1697709934);
								if (string_3_ != null && string_3_.equals(string_0_)) {
									Class264.method2492(4, new StringBuilder().append(string).append(Tradution.aClass470_5923.method6049(Class321.aClass429_3357, -875414210)).toString(), (byte) -22);
									return;
								}
							}
						}
						for (int i_4_ = 0; i_4_ < -548972447 * client.anInt8952; i_4_++) {
							String string_5_ = Class173.method1824((client.aStringArray8859[i_4_]), 629913933);
							if (null != string_5_ && string_5_.equals(string_0_)) {
								Class264.method2492(4, new StringBuilder().append(Tradution.aClass470_5929.method6049(Class321.aClass429_3357, -875414210)).append(string).append(Tradution.aClass470_5930.method6049(Class321.aClass429_3357, -875414210)).toString(), (byte) -89);
								return;
							}
							if (null != client.aStringArray8955[i_4_]) {
								String string_6_ = Class173.method1824((client.aStringArray8955[i_4_]), -1007795446);
								if (string_6_ != null && string_6_.equals(string_0_)) {
									Class264.method2492(4, new StringBuilder().append(Tradution.aClass470_5929.method6049(Class321.aClass429_3357, -875414210)).append(string).append(Tradution.aClass470_5930.method6049(Class321.aClass429_3357, -875414210)).toString(), (byte) -109);
									return;
								}
							}
						}
						if (Class173.method1824((Class287.myPlayer.username), -712250197).equals(string_0_))
							Class264.method2492(4, (Tradution.aClass470_5919.method6049(Class321.aClass429_3357, -875414210)), (byte) -34);
						else {
							BufferedConnectionContext class25 = Class429.method5760((short) 512);
							Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.ADD_FRIEND_PACKET, class25.aClass449_330, (byte) 14);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(Class58.method693(string, -92805385));
							class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2126537806);
							class25.method390(class298_sub36, (byte) -112);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sc.mk(").append(')').toString());
		}
	}

	public static void method5851(int i, int i_7_) {
		try {
			if (i != client.anInt8752 * -1233866115) {
				client.anInt8723 = 0;
				if (i == 5 || 13 == i)
					Class473.method6070(760519077);
				if (i != 5 && Class422_Sub21.aClass318_8414 != null) {
					Class422_Sub21.aClass318_8414.method3860(-2130986966);
					Class422_Sub21.aClass318_8414 = null;
				}
				if (19 == i)
					Class501.method6227((8 == -1233866115 * client.anInt8752 || -1233866115 * client.anInt8752 == 2 || (747461259 * (HashTable.aClass371_5520.anInt4042) != (client.WINDOW_PANE_ID * -257444687))), -1608675861);
				if (i == 14)
					IcmpService_Sub1.method6382((client.WINDOW_PANE_ID * -257444687 != (HashTable.aClass371_5520.anInt4031) * 1349088077), -687019075);
				if (i == 4 || 6 == i)
					Class147.method1601((byte) -8);
				else if (3 == i || i == 18 && -1233866115 * client.anInt8752 != 16)
					Class473.method6070(1162411214);
				else if (i == 2)
					Class70.method805((byte) 0);
				if (Class358.method4287(i, -1178041789)) {
					client.aClass283_8716.method2673((byte) 75);
					Class423.method5733(true, 1336561252);
				}
				if (17 == i || i == 19)
					Class141.method1567(-1734216597);
				boolean bool = (7 == i || Class413.method5584(i, 2038230333) || Class299.method3682(i, 1765230881));
				boolean bool_8_ = (7 == -1233866115 * client.anInt8752 || Class413.method5584(client.anInt8752 * -1233866115, 2005988447) || Class299.method3682(-1233866115 * client.anInt8752, 1765230881));
				if (bool != bool_8_) {
					if (bool) {
						Class300.anInt3207 = Class300.anInt3210 * 1701432991;
						if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7587.method5726(-2145576299) != 0) {
							Class431.method5767(2, Class374_Sub1.aClass243_7731, 782166935 * Class300.anInt3210, 0, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7587.method5726(-2142499578), false, 1118626209);
							Class14.method344(-656326093);
						} else
							Class104.method1108(2, 2140319778);
						Class248.aClass247_2752.method2343(false, -1153302935);
					} else {
						Class104.method1108(2, 1226990292);
						Class248.aClass247_2752.method2343(true, -1469822226);
					}
				}
				if (Class358.method4287(i, 299941911) || i == 5 || 13 == i)
					Class373.aClass_ra4071.method5176();
				client.anInt8752 = -705702187 * i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sc.fd(").append(')').toString());
		}
	}
}
