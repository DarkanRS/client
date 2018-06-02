/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class244 {
	static final int anInt3002 = 1;
	public static int anInt3003;
	static final int anInt3004 = -1;
	static final int anInt3005 = 2;
	static Class217_Sub1[] aClass217_Sub1Array3006;
	static boolean aBool3007 = false;
	static int anInt3008;

	public static boolean method4182(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i = class282_sub35.readUnsignedByte();
		if (i != 2)
			return false;
		boolean bool = class282_sub35.readUnsignedByte() == 1;
		if (bool)
			Class411.method6912(class282_sub35, 1288904902);
		Class359.method6241(class282_sub35, -1949273298);
		return true;
	}

	public static Class217_Sub1 method4183(int i) {
		if (!aBool3007 || i < Class485.anInt5740 * -377428565 || i > -860748679 * anInt3003)
			return null;
		return aClass217_Sub1Array3006[i - Class485.anInt5740 * -377428565];
	}

	static void method4184(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedSmart(1476810961);
		Class354.aClass213Array4111 = new Class213[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			Class354.aClass213Array4111[i_0_] = new Class213();
			Class354.aClass213Array4111[i_0_].anInt2680 = class282_sub35.readUnsignedSmart(1863088337) * 2012866263;
			Class354.aClass213Array4111[i_0_].aString2679 = class282_sub35.readGJString(256846257);
		}
		Class485.anInt5740 = class282_sub35.readUnsignedSmart(1561847724) * 1385884931;
		anInt3003 = class282_sub35.readUnsignedSmart(1893878764) * -1292032567;
		Class4.anInt34 = class282_sub35.readUnsignedSmart(1736226469) * -275211251;
		aClass217_Sub1Array3006 = (new Class217_Sub1[anInt3003 * -860748679 - -377428565 * Class485.anInt5740 + 1]);
		for (int i_1_ = 0; i_1_ < Class4.anInt34 * -2043473211; i_1_++) {
			int i_2_ = class282_sub35.readUnsignedSmart(1752394934);
			Class217_Sub1 class217_sub1 = aClass217_Sub1Array3006[i_2_] = new Class217_Sub1();
			((Class217_Sub1) class217_sub1).anInt2696 = class282_sub35.readUnsignedByte() * -2047707083;
			class217_sub1.anInt2700 = class282_sub35.readInt() * 285408817;
			class217_sub1.anInt7975 = (i_2_ + -377428565 * Class485.anInt5740) * 726222743;
			class217_sub1.aString7977 = class282_sub35.readGJString(-1952581599);
			class217_sub1.aString7976 = class282_sub35.readGJString(-10325114);
		}
		Class418.anInt4999 = class282_sub35.readInt() * 661556035;
		aBool3007 = true;
	}

	public static Class217_Sub1 method4185(int i) {
		if (!aBool3007 || i < Class485.anInt5740 * -377428565 || i > -860748679 * anInt3003)
			return null;
		return aClass217_Sub1Array3006[i - Class485.anInt5740 * -377428565];
	}

	public static boolean method4186(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i = class282_sub35.readUnsignedByte();
		if (i != 2)
			return false;
		boolean bool = class282_sub35.readUnsignedByte() == 1;
		if (bool)
			Class411.method6912(class282_sub35, 1288904902);
		Class359.method6241(class282_sub35, -1539934849);
		return true;
	}

	static void method4187(RsByteBuffer class282_sub35) {
		for (int i = 0; i < Class4.anInt34 * -2043473211; i++) {
			int i_3_ = class282_sub35.readUnsignedSmart(1784113657);
			int i_4_ = class282_sub35.readUnsignedShort();
			if (65535 == i_4_)
				i_4_ = -1;
			if (aClass217_Sub1Array3006[i_3_] != null)
				aClass217_Sub1Array3006[i_3_].anInt2701 = i_4_ * -316063015;
		}
	}

	public static boolean method4188(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i = class282_sub35.readUnsignedByte();
		if (i != 2)
			return false;
		boolean bool = class282_sub35.readUnsignedByte() == 1;
		if (bool)
			Class411.method6912(class282_sub35, 1288904902);
		Class359.method6241(class282_sub35, -1392365474);
		return true;
	}

	public static boolean method4189(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i = class282_sub35.readUnsignedByte();
		if (i != 2)
			return false;
		boolean bool = class282_sub35.readUnsignedByte() == 1;
		if (bool)
			Class411.method6912(class282_sub35, 1288904902);
		Class359.method6241(class282_sub35, 1850567815);
		return true;
	}

	static void method4190(RsByteBuffer class282_sub35) {
		for (int i = 0; i < Class4.anInt34 * -2043473211; i++) {
			int i_5_ = class282_sub35.readUnsignedSmart(1824558777);
			int i_6_ = class282_sub35.readUnsignedShort();
			if (65535 == i_6_)
				i_6_ = -1;
			if (aClass217_Sub1Array3006[i_5_] != null)
				aClass217_Sub1Array3006[i_5_].anInt2701 = i_6_ * -316063015;
		}
	}

	Class244() throws Throwable {
		throw new Error();
	}

	static void method4191(RsByteBuffer class282_sub35) {
		for (int i = 0; i < Class4.anInt34 * -2043473211; i++) {
			int i_7_ = class282_sub35.readUnsignedSmart(2101257929);
			int i_8_ = class282_sub35.readUnsignedShort();
			if (65535 == i_8_)
				i_8_ = -1;
			if (aClass217_Sub1Array3006[i_7_] != null)
				aClass217_Sub1Array3006[i_7_].anInt2701 = i_8_ * -316063015;
		}
	}

	static void method4192(RsByteBuffer class282_sub35) {
		for (int i = 0; i < Class4.anInt34 * -2043473211; i++) {
			int i_9_ = class282_sub35.readUnsignedSmart(1774914162);
			int i_10_ = class282_sub35.readUnsignedShort();
			if (65535 == i_10_)
				i_10_ = -1;
			if (aClass217_Sub1Array3006[i_9_] != null)
				aClass217_Sub1Array3006[i_9_].anInt2701 = i_10_ * -316063015;
		}
	}

	static final void method4193(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class223.CURRENT_LANGUAGE.method243((byte) 1);
	}

	static final void method4194(CS2Executor class527, int i) {
		int i_11_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) (Class302.method5363(i_11_, 292315472) / 60000L);
	}

	public static final void method4195(int i) {
		if (!client.aBool7269) {
			client.aFloat7266 += (24.0F - client.aFloat7266) / 2.0F;
			client.aBool7371 = true;
			client.aBool7269 = true;
		}
	}

	public static void method4196(int i, byte i_12_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.method4778(22, (long) i);
		class282_sub50_sub12.method14965((byte) -25);
	}
}
