/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class122 {
	int anInt1528 = 198675871;
	Class111 aClass111_1529;
	String aString1530;
	public int[] anIntArray1531;
	String aString1532;
	Class111 aClass111_1533;
	public int[] anIntArray1534;
	public static Class536 aClass536_1535;

	void method2105(Class100 class100, byte i) {
		int i_0_ = class100.method1632((byte) -72);
		((Class122) this).aClass111_1529 = Class406.method6852(-1465285148)[i_0_];
		if (((Class122) this).aClass111_1529 == Class111.aClass111_1109) {
			int i_1_ = class100.method1632((byte) 0);
			((Class122) this).aClass111_1533 = Class406.method6852(-2096161358)[i_1_];
			((Class122) this).anInt1528 = class100.method1632((byte) -88) * -198675871;
		}
		((Class122) this).aString1530 = class100.method1633(16711935);
		((Class122) this).aString1532 = class100.method1633(16711935);
		int i_2_ = class100.method1632((byte) -35);
		anIntArray1531 = new int[i_2_];
		anIntArray1534 = new int[i_2_];
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			anIntArray1531[i_3_] = class100.method1632((byte) -74);
			anIntArray1534[i_3_] = class100.method1632((byte) -19);
		}
	}

	void method2106(Class100 class100) {
		int i = class100.method1632((byte) 8);
		((Class122) this).aClass111_1529 = Class406.method6852(-1845731076)[i];
		if (((Class122) this).aClass111_1529 == Class111.aClass111_1109) {
			int i_4_ = class100.method1632((byte) -104);
			((Class122) this).aClass111_1533 = Class406.method6852(-1460140395)[i_4_];
			((Class122) this).anInt1528 = class100.method1632((byte) -27) * -198675871;
		}
		((Class122) this).aString1530 = class100.method1633(16711935);
		((Class122) this).aString1532 = class100.method1633(16711935);
		int i_5_ = class100.method1632((byte) -104);
		anIntArray1531 = new int[i_5_];
		anIntArray1534 = new int[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			anIntArray1531[i_6_] = class100.method1632((byte) -111);
			anIntArray1534[i_6_] = class100.method1632((byte) -19);
		}
	}

	Class122() {
		/* empty */
	}

	static final void method2107(Class527 class527, int i) {
		Class466.method7777(1416493755);
	}

	static final void method2108(Class527 class527, int i) {
		int i_7_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method7785(i_7_, 198119632);
	}

	public static void method2109(Class160[] class160s, byte i) {
		Class20.anInt186 = class160s.length * 1884228835;
		Class115.aClass160Array1248 = new Class160[Class20.anInt186 * 1104058571 + 10];
		Class20.anIntArray177 = new int[1104058571 * Class20.anInt186 + 10];
		System.arraycopy(class160s, 0, Class115.aClass160Array1248, 0, Class20.anInt186 * 1104058571);
		for (int i_8_ = 0; i_8_ < Class20.anInt186 * 1104058571; i_8_++)
			Class20.anIntArray177[i_8_] = Class115.aClass160Array1248[i_8_].method2748();
		for (int i_9_ = Class20.anInt186 * 1104058571; i_9_ < Class115.aClass160Array1248.length; i_9_++)
			Class20.anIntArray177[i_9_] = 12;
	}

	public static String method2110(String string, char c, String string_10_, int i) {
		int i_11_ = string.length();
		int i_12_ = string_10_.length();
		int i_13_ = i_11_;
		int i_14_ = i_12_ - 1;
		if (i_14_ != 0) {
			int i_15_ = 0;
			for (;;) {
				i_15_ = string.indexOf(c, i_15_);
				if (i_15_ < 0)
					break;
				i_15_++;
				i_13_ += i_14_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_13_);
		int i_16_ = 0;
		for (;;) {
			int i_17_ = string.indexOf(c, i_16_);
			if (i_17_ < 0)
				break;
			stringbuilder.append(string.substring(i_16_, i_17_));
			stringbuilder.append(string_10_);
			i_16_ = i_17_ + 1;
		}
		stringbuilder.append(string.substring(i_16_));
		return stringbuilder.toString();
	}

	public static void method2111(boolean bool, int i) {
		if (bool && null != Class291_Sub1.aClass282_Sub50_Sub6_3491)
			Class51.anInt488 = (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9536 * -105285481);
		else
			Class51.anInt488 = 562841881;
		Class291_Sub1.aClass282_Sub50_Sub6_3491 = null;
		Class346.aClass482_4049 = null;
		Class291_Sub1.anInt8015 = 0;
		Class282_Sub20_Sub24.aClass118_9884 = null;
		Class291_Sub1.method5137();
		Class291_Sub1.aClass482_3459.method8118(-1939522587);
		Class291_Sub1.aClass283_3470 = null;
		Class511.aClass160_5883 = null;
		Class291_Sub1.anInt8014 = -1089992553;
		Class291_Sub1.anInt8016 = 638834387;
		Class494.aClass194_5794 = null;
		Class291_Sub1.aClass194_8017 = null;
		Class291_Sub1.aClass194_8023 = null;
		Class446.aClass194_5416 = null;
		Class114.aClass194_1243 = null;
		Class524.aClass194_6967 = null;
		Class251.aClass194_3103 = null;
		Class521_Sub1_Sub5_Sub1.aClass194_10527 = null;
		if (Class291_Sub1.aClass218_3456 != null) {
			Class291_Sub1.aClass218_3456.method3699((byte) 1);
			Class291_Sub1.aClass218_3456.method3697(128, 64, 1766469976);
		}
		if (null != Class291_Sub1.aClass427_3457)
			Class291_Sub1.aClass427_3457.method7175(64, 64, 1145501351);
		if (Class291_Sub1.aClass474_3455 != null)
			Class291_Sub1.aClass474_3455.method7899(256, -2034610586);
		Class16.aClass230_147.method3906(64, (short) 727);
	}

	static final void method2112(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 993237007;
		int i_18_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]);
		int i_19_ = ((((Class527) class527).anIntArray6999[1 + 1942118537 * ((Class527) class527).anInt7012]) << 1);
		int i_20_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012 + 2]);
		int i_21_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012 + 3]);
		int i_22_ = (((Class527) class527).anIntArray6999[4 + ((Class527) class527).anInt7012 * 1942118537]);
		int i_23_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537 + 5]);
		int i_24_ = (((Class527) class527).anIntArray6999[6 + 1942118537 * ((Class527) class527).anInt7012]);
		if (i_18_ >= 0 && i_18_ < 2 && client.anIntArrayArrayArray7302[i_18_] != null && i_19_ >= 0 && i_19_ < client.anIntArrayArrayArray7302[i_18_].length) {
			client.anIntArrayArrayArray7302[i_18_][i_19_] = new int[] { (i_20_ >> 14 & 0x3fff) << 9, i_21_ << 2, (i_20_ & 0x3fff) << 9, i_24_ };
			client.anIntArrayArrayArray7302[i_18_][i_19_ + 1] = new int[] { (i_22_ >> 14 & 0x3fff) << 9, i_23_ << 2, (i_22_ & 0x3fff) << 9 };
		}
	}
}
