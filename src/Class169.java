/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class169 {
	public static final int anInt2055 = 2;
	public boolean aBool2056;
	public static final int anInt2057 = 2;
	public static final int anInt2058 = 3;
	public boolean aBool2059;
	public static final int anInt2060 = 1;
	public static final int anInt2061 = 6;
	public static final int anInt2062 = 7;
	public static final int anInt2063 = 8;
	public byte aByte2064;
	public boolean aBool2065;
	public static final int anInt2066 = 11;
	public static final int anInt2067 = 12;
	public static final int anInt2068 = 13;
	public static final int anInt2069 = 16;
	public static final int anInt2070 = 4;
	public static final int anInt2071 = 1;
	public boolean aBool2072;
	public short aShort2073;
	public int anInt2074;
	public static final int anInt2075 = 10;
	public byte aByte2076;
	public int anInt2077;
	public static final int anInt2078 = 9;
	public byte aByte2079;
	public byte aByte2080;
	public byte aByte2081;
	public boolean aBool2082;
	public static final int anInt2083 = 0;
	public static final int anInt2084 = 5;
	public static final int anInt2085 = 0;
	public boolean aBool2086;
	public boolean aBool2087;
	public byte aByte2088;
	public boolean aBool2089;
	public byte aByte2090;
	public int anInt2091;

	public static final synchronized long method2869(int i) {
		long l = System.currentTimeMillis();
		if (l < 6289562171134420055L * Class97.aLong993)
			Class97.aLong994 += (-8305020634878961101L * (6289562171134420055L * Class97.aLong993 - l));
		Class97.aLong993 = l * -3280623870577899673L;
		return l + -3197815037203812101L * Class97.aLong994;
	}

	static final void method2870(Class527 class527, int i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4596, client.aClass184_7475.aClass432_2283, 1814841723);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		client.aClass184_7475.method3049(class282_sub23, 426449473);
	}

	static final void method2871(Class527 class527, int i) {
		int i_0_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		if (client.anInt7434 * 1609086245 == 2 && i_0_ < 493536965 * client.anInt7449)
			((Class527) class527).anObjectArray7019[((((Class527) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = client.aClass6Array7452[i_0_].aString40;
		else
			((Class527) class527).anObjectArray7019[((((Class527) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method2872(Class527 class527, int i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = -574868913 * client.anInt7416;
	}

	static final void method2873(Class527 class527, int i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644);
	}

	static final void method2874(Class118 class118, Class98 class98, Class527 class527, byte i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 69608151) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1319 = Class351.method6193(string, class527, 1275110471);
		class118.aBool1384 = true;
	}

	public static boolean method2875(int i, int i_1_) {
		return i == 13 || 18 == i || i == 12;
	}

	public static void method2876(NPC class521_sub1_sub1_sub2_sub2, int i) {
		for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass482_8074.method8097((byte) 123)); class282_sub48 != null; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass482_8074.method8067(1114732326)) {
			if ((((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085) == class521_sub1_sub1_sub2_sub2) {
				if (null != (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099)) {
					Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
				}
				class282_sub48.method4991(-371378792);
				break;
			}
		}
	}

	public static void method2877(Interface45 interface45, byte i) {
		if (IcmpService_Sub1.anIcmpService_Sub1_7964 == null) {
			if (i >= 127)
				return;
			throw new IllegalStateException("");
		}
		((IcmpService_Sub1) IcmpService_Sub1.anIcmpService_Sub1_7964).aList7962.add(interface45);
	}
}
