/* Class496 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class496 implements Interface43 {
	public static Class496 aClass496_5807;
	public static Class496 aClass496_5808;
	public static Class496 aClass496_5809;
	public static Class496 aClass496_5810 = new Class496("LOCAL", "", 4);
	public static Class496 aClass496_5811;
	static Class496 aClass496_5812;
	public static Class496 aClass496_5813;
	int anInt5814;
	String aString5815;
	static Class510 aClass510_5816;

	static {
		aClass496_5807 = new Class496("WTWIP", "", 3);
		aClass496_5809 = new Class496("WTI", "", 5);
		aClass496_5808 = new Class496("WTQA", "", 2);
		aClass496_5811 = new Class496("WTRC", "", 1);
		aClass496_5812 = new Class496("INTBETA", "", 6);
		aClass496_5813 = new Class496("LIVE", "", 0);
		method8299(1459523387);
	}

	Class496(String string, String string_0_, int i) {
		((Class496) this).aString5815 = string;
		((Class496) this).anInt5814 = i * -887327875;
	}

	public static Class496[] method8299(int i) {
		return new Class496[] { aClass496_5807, aClass496_5810, aClass496_5813, aClass496_5812, aClass496_5809, aClass496_5811, aClass496_5808 };
	}

	public static Class496[] method8300() {
		return new Class496[] { aClass496_5807, aClass496_5810, aClass496_5813, aClass496_5812, aClass496_5809, aClass496_5811, aClass496_5808 };
	}

	public int method76() {
		return -2013930027 * ((Class496) this).anInt5814;
	}

	public int method75() {
		return -2013930027 * ((Class496) this).anInt5814;
	}

	public static boolean method8301(Class496 class496) {
		return (class496 == aClass496_5811 || class496 == aClass496_5808 || aClass496_5807 == class496 || class496 == aClass496_5809 || class496 == aClass496_5812);
	}

	public int method243(byte i) {
		return -2013930027 * ((Class496) this).anInt5814;
	}

	public static Class496[] method8302() {
		return new Class496[] { aClass496_5807, aClass496_5810, aClass496_5813, aClass496_5812, aClass496_5809, aClass496_5811, aClass496_5808 };
	}

	static final void method8303(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1378127363 * Class9.anInt106;
	}

	public static Class496[] method8304() {
		return new Class496[] { aClass496_5807, aClass496_5810, aClass496_5813, aClass496_5812, aClass496_5809, aClass496_5811, aClass496_5808 };
	}

	public static boolean method8305(Class496 class496) {
		return (class496 == aClass496_5811 || class496 == aClass496_5808 || aClass496_5807 == class496 || class496 == aClass496_5809 || class496 == aClass496_5812);
	}

	public static boolean method8306(Class496 class496) {
		return (class496 == aClass496_5811 || class496 == aClass496_5808 || aClass496_5807 == class496 || class496 == aClass496_5809 || class496 == aClass496_5812);
	}

	public static boolean method8307(Class496 class496) {
		return (class496 == aClass496_5811 || class496 == aClass496_5808 || aClass496_5807 == class496 || class496 == aClass496_5809 || class496 == aClass496_5812);
	}

	public static boolean method8308(Class496 class496, int i) {
		return (class496 == aClass496_5811 || class496 == aClass496_5808 || aClass496_5807 == class496 || class496 == aClass496_5809 || class496 == aClass496_5812);
	}

	static void method8309(RsByteBuffer class282_sub35, int i, int i_1_) {
		if (Engine.aClass440_3269 != null) {
			try {
				Engine.aClass440_3269.method7347(0L);
				Engine.aClass440_3269.method7352((class282_sub35.buffer), i, 24, 1942118537);
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	static final void method8310(IComponentDefinitions class118, Interface class98, CS2Executor class527, byte i) {
		class118.anInt1423 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * 1700974355);
		Class109.method1858(class118, (byte) -17);
	}

	static final void method8311(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_2_, (byte) 77);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_2_ >> 16];
		Language.method8277(class118, class98, class527, 1396779389);
	}

	public static Class496[] method8312() {
		return new Class496[] { aClass496_5807, aClass496_5810, aClass496_5813, aClass496_5812, aClass496_5809, aClass496_5811, aClass496_5808 };
	}

	static int method8313(byte i) {
		int i_3_;
		if (Engine.MAX_MEMORY * -1346844585 >= 96) {
			int i_4_ = Class241.method4150(1219422368);
			if (i_4_ <= 104) {
				Defaults6Loader.method11248(1422604274);
				i_3_ = 4;
			} else if (i_4_ <= 504) {
				Class282_Sub40.method13300(-273043210);
				i_3_ = 3;
			} else if (i_4_ <= 1002) {
				Class119.method2077(240785770);
				i_3_ = 2;
			} else {
				Class282_Sub20_Sub25.method15393(true, 1945296321);
				i_3_ = 1;
			}
		} else {
			Class282_Sub20_Sub25.method15393(true, 1593170502);
			i_3_ = 1;
		}
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1431790545) != 0) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 0, -1334212843);
			Class538.method11500(0, false, (byte) 24);
		} else
			Class393.aClass282_Sub54_4783.method13505((Class393.aClass282_Sub54_4783.aClass468_Sub18_8230), true, -1824777589);
		Class190.method3148((byte) 44);
		return i_3_;
	}

	public static void method8314(String string, int i, int i_5_) {
		if (Class448.aClass450_5424 == null)
			Class448.aClass450_5424 = new Class450();
		Class448.aClass450_5424.aString5433 = string;
		Class448.aClass450_5424.worldId = (1099 + i) * -1933199413;
		Class448.aClass450_5424.anInt5434 = -58916693 * Class448.aClass450_5424.worldId + 1140744768;
		Class448.aClass450_5424.anInt5437 = 1250363344 + Class448.aClass450_5424.worldId * -1441381029;
	}

	static final void method8315(int i) {
		if (client.anInt7349 * -1699899559 != -1) {
			int i_6_ = Class163.aClass209_2031.method3569(2131144344);
			int i_7_ = Class163.aClass209_2031.method3570(756095591);
			Class282_Sub53 class282_sub53 = (Class282_Sub53) client.aClass482_7267.head((byte) 28);
			if (null != class282_sub53) {
				i_6_ = class282_sub53.method13481(1154972064);
				i_7_ = class282_sub53.method13469(1835497951);
			}
			if (client.aClass118_7257 != null && Class221.aClass118_2763 == client.aClass118_7247) {
				client.aBool7403 = true;
				client.anInt7432 = 0;
				client.anInt7265 = 0;
				client.anInt7367 = 328237009 * Class349.anInt4083;
				client.anInt7476 = client.anInt3243 * 1805307749;
			}
			Class436.method7313(null, -1699899559 * client.anInt7349, 0, 0, -418109423 * Class349.anInt4083, -969250379 * client.anInt3243, 0, 0, i_6_, i_7_, (byte) -112);
			if (null != Class282_Sub20_Sub24.aClass118_9884)
				Class347.method6170(i_6_, i_7_, -2001373224);
		}
	}
}
