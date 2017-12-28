/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class93 {
	int[] anIntArray968;
	static final int anInt969 = 0;
	static final int anInt970 = 2;
	int[] anIntArray971;

	Class93(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedSmart(1738391980);
		((Class93) this).anIntArray971 = new int[i];
		((Class93) this).anIntArray968 = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = class282_sub35.readUnsignedByte();
			((Class93) this).anIntArray971[i_0_] = i_1_;
			int i_2_ = class282_sub35.readUnsignedShort();
			int i_3_ = class282_sub35.readUnsignedShort();
			((Class93) this).anIntArray968[i_0_] = (i_2_ << 16) + i_3_;
		}
	}

	void method1566(Class75 class75, int i, int i_4_) {
		int i_5_ = ((Class93) this).anIntArray968[0];
		class75.method1338(i, i_5_ >>> 16, i_5_ & 0xffff, 307993512);
		Animable class521_sub1_sub1_sub2 = class75.method1342((byte) 51);
		class521_sub1_sub1_sub2.anInt10355 = 0;
		for (int i_6_ = ((Class93) this).anIntArray971.length - 1; i_6_ >= 0; i_6_--) {
			int i_7_ = ((Class93) this).anIntArray971[i_6_];
			int i_8_ = ((Class93) this).anIntArray968[i_6_];
			class521_sub1_sub1_sub2.regionBaseX[1871221471 * class521_sub1_sub1_sub2.anInt10355] = i_8_ >> 16;
			class521_sub1_sub1_sub2.regionBaseY[class521_sub1_sub1_sub2.anInt10355 * 1871221471] = i_8_ & 0xffff;
			byte i_9_ = Class249.aClass249_3084.aByte3085;
			if (0 == i_7_)
				i_9_ = Class249.aClass249_3082.aByte3085;
			else if (i_7_ == 2)
				i_9_ = Class249.aClass249_3086.aByte3085;
			class521_sub1_sub1_sub2.aByteArray10365[1871221471 * class521_sub1_sub1_sub2.anInt10355] = i_9_;
			class521_sub1_sub1_sub2.anInt10355 += -2086688481;
		}
	}

	void method1567(Class75 class75, int i) {
		int i_10_ = ((Class93) this).anIntArray968[0];
		class75.method1338(i, i_10_ >>> 16, i_10_ & 0xffff, 1153422582);
		Animable class521_sub1_sub1_sub2 = class75.method1342((byte) 23);
		class521_sub1_sub1_sub2.anInt10355 = 0;
		for (int i_11_ = ((Class93) this).anIntArray971.length - 1; i_11_ >= 0; i_11_--) {
			int i_12_ = ((Class93) this).anIntArray971[i_11_];
			int i_13_ = ((Class93) this).anIntArray968[i_11_];
			class521_sub1_sub1_sub2.regionBaseX[1871221471 * class521_sub1_sub1_sub2.anInt10355] = i_13_ >> 16;
			class521_sub1_sub1_sub2.regionBaseY[class521_sub1_sub1_sub2.anInt10355 * 1871221471] = i_13_ & 0xffff;
			byte i_14_ = Class249.aClass249_3084.aByte3085;
			if (0 == i_12_)
				i_14_ = Class249.aClass249_3082.aByte3085;
			else if (i_12_ == 2)
				i_14_ = Class249.aClass249_3086.aByte3085;
			class521_sub1_sub1_sub2.aByteArray10365[1871221471 * class521_sub1_sub1_sub2.anInt10355] = i_14_;
			class521_sub1_sub1_sub2.anInt10355 += -2086688481;
		}
	}

	public static void method1568(int i) {
		synchronized (Class238.aClass229_2920) {
			Class238.aClass229_2920.method3863(1281693706);
		}
		synchronized (Class238.aClass229_2930) {
			Class238.aClass229_2930.method3863(1087742173);
		}
	}

	static final void method1569(Class527 class527, byte i) {
		Class513 class513 = (((Class527) class527).aBool7022 ? ((Class527) class527).aClass513_6994 : ((Class527) class527).aClass513_7007);
		Class118 class118 = ((Class513) class513).aClass118_5886;
		Class98 class98 = ((Class513) class513).aClass98_5885;
		Class249.method4280(class118, class98, class527, (byte) 60);
	}

	static final void method1570(Class527 class527, byte i) {
		Class513 class513 = (((Class527) class527).aBool7022 ? ((Class527) class527).aClass513_6994 : ((Class527) class527).aClass513_7007);
		Class118 class118 = ((Class513) class513).aClass118_5886;
		Class98 class98 = ((Class513) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 1, class527, (byte) -4);
	}

	static final void method1571(Class527 class527, short i) {
		int i_15_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_15_, (byte) 38);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1336 * 682349813;
	}

	static final void method1572(Class527 class527, byte i) {
		int i_16_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method7785(i_16_, -398594048);
	}

	static final void method1573(Class527 class527, byte i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_17_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		int i_18_ = (((Class527) class527).anIntArray6999[1 + 1942118537 * ((Class527) class527).anInt7012]);
		Class282_Sub44 class282_sub44 = (Class282_Sub44) client.aClass465_7442.method7754((long) i_17_);
		if (null != class282_sub44 && 587626901 * class282_sub44.anInt8063 == i_18_)
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method1574(Class527 class527, byte i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12727(-247262308) ? 1 : 0;
	}

	public static void method1575(int i, int i_19_, boolean bool, int i_20_) {
		if (Class492.aClass465_5774.method7754((long) i) == null) {
			if (!client.aBool7393)
				Class62.method1260(i, bool, 860609292);
			else {
				Class282_Sub37 class282_sub37 = new Class282_Sub37(i, new Class278_Sub1(4096, (Class209.aClass317_2663), i), i_19_, bool);
				((Class282_Sub37) class282_sub37).aClass278_Sub1_8001.method4915(Class223.aClass495_2772.method8276(1496562454), 47217972);
				Class492.aClass465_5774.method7765(class282_sub37, (long) i);
			}
		}
	}

	public static boolean method1576(int i) {
		do {
			boolean bool;
			try {
				if (IcmpService_Sub1.available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (IcmpService_Sub1.anIcmpService_Sub1_7964 != null)
			throw new IllegalStateException("");
		IcmpService_Sub1.anIcmpService_Sub1_7964 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class512());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	static boolean method1577(Interface12 interface12, int i) {
		Class478 class478 = client.aClass257_7353.method4436(-1771032162).method7891(interface12.method84(-1594739949), 65280);
		if (-272332433 * class478.anInt5689 == -1)
			return true;
		Class418 class418 = Class97.aClass427_995.method7172(-272332433 * class478.anInt5689, -1014703371);
		if (-1 == -1053123675 * class418.anInt4995)
			return true;
		return class418.method7015(65280);
	}

	static String method1578(long l, int i, byte i_21_) {
		Class155.method2634(l);
		int i_22_ = Class407.aCalendar4848.get(5);
		int i_23_ = Class407.aCalendar4848.get(2) + 1;
		int i_24_ = Class407.aCalendar4848.get(1);
		return new StringBuilder().append(Integer.toString(i_22_ / 10)).append(i_22_ % 10).append("/").append(i_23_ / 10).append(i_23_ % 10).append("/").append(i_24_ % 100 / 10).append(i_24_ % 10).toString();
	}
}
