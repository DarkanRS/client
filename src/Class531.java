/* Class531 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class531 {
	public int anInt7051;
	public int anInt7052;
	int anInt7053;
	public int anInt7054 = 0;
	public int anInt7055;
	public boolean aBool7056;
	public int anInt7057;
	public int anInt7058;
	public boolean aBool7059;
	static final int anInt7060 = 1190717;
	public boolean aBool7061;
	Class536 aClass536_7062;
	public int anInt7063;
	public int anInt7064;
	public int anInt7065;
	public int anInt7066 = 1613793573;
	public int anInt7067;

	void method11356(byte i) {
		anInt7052 = 1063532053 * (1070524733 * anInt7052 << 8 | ((Class531) this).anInt7053 * 2111894473);
	}

	void method11357(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method11364(class282_sub35, i_0_, (byte) 14);
		}
	}

	void method11358(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			anInt7054 = Class44.method912(class282_sub35.read24BitUnsignedInteger((short) 7613), 2117926535) * 695388511;
		else if (i == 2)
			anInt7066 = class282_sub35.readUnsignedByte() * -1613793573;
		else if (3 == i) {
			anInt7066 = class282_sub35.readUnsignedShort() * -1613793573;
			if (anInt7066 * 1717409107 == 65535)
				anInt7066 = 1613793573;
		} else if (i == 5)
			aBool7056 = false;
		else if (i == 7)
			anInt7058 = Class44.method912(class282_sub35.read24BitUnsignedInteger((short) 23860), 2117926535) * 217561855;
		else if (8 == i)
			((Class531) this).aClass536_7062.anInt7093 = ((Class531) this).anInt7053 * 1866199091;
		else if (9 == i)
			anInt7057 = (class282_sub35.readUnsignedShort() << 2) * 1955150803;
		else if (10 == i)
			aBool7059 = false;
		else if (i == 11)
			anInt7052 = class282_sub35.readUnsignedByte() * 1063532053;
		else if (i == 12)
			aBool7061 = true;
		else if (i == 13)
			anInt7051 = class282_sub35.read24BitUnsignedInteger((short) 2073) * 837652943;
		else if (i == 14)
			anInt7063 = (class282_sub35.readUnsignedByte() << 2) * 2048044799;
		else if (i == 16)
			anInt7064 = class282_sub35.readUnsignedByte() * -262974177;
		else if (i == 20)
			anInt7065 = class282_sub35.readUnsignedShort() * -2046028701;
		else if (21 == i)
			anInt7055 = class282_sub35.readUnsignedByte() * -2130672169;
		else if (22 == i)
			anInt7067 = class282_sub35.readUnsignedShort() * 757907389;
	}

	static int method11359(int i) {
		if (16711935 == i)
			return -1;
		return Class5.method294(i, (byte) 114);
	}

	static int method11360(int i) {
		if (16711935 == i)
			return -1;
		return Class5.method294(i, (byte) -40);
	}

	void method11361(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method11364(class282_sub35, i, (byte) 97);
		}
	}

	void method11362(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method11364(class282_sub35, i, (byte) 65);
		}
	}

	void method11363(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			anInt7054 = Class44.method912(class282_sub35.read24BitUnsignedInteger((short) 17607), 2117926535) * 695388511;
		else if (i == 2)
			anInt7066 = class282_sub35.readUnsignedByte() * -1613793573;
		else if (3 == i) {
			anInt7066 = class282_sub35.readUnsignedShort() * -1613793573;
			if (anInt7066 * 1717409107 == 65535)
				anInt7066 = 1613793573;
		} else if (i == 5)
			aBool7056 = false;
		else if (i == 7)
			anInt7058 = Class44.method912(class282_sub35.read24BitUnsignedInteger((short) 5792), 2117926535) * 217561855;
		else if (8 == i)
			((Class531) this).aClass536_7062.anInt7093 = ((Class531) this).anInt7053 * 1866199091;
		else if (9 == i)
			anInt7057 = (class282_sub35.readUnsignedShort() << 2) * 1955150803;
		else if (10 == i)
			aBool7059 = false;
		else if (i == 11)
			anInt7052 = class282_sub35.readUnsignedByte() * 1063532053;
		else if (i == 12)
			aBool7061 = true;
		else if (i == 13)
			anInt7051 = class282_sub35.read24BitUnsignedInteger((short) 1114) * 837652943;
		else if (i == 14)
			anInt7063 = (class282_sub35.readUnsignedByte() << 2) * 2048044799;
		else if (i == 16)
			anInt7064 = class282_sub35.readUnsignedByte() * -262974177;
		else if (i == 20)
			anInt7065 = class282_sub35.readUnsignedShort() * -2046028701;
		else if (21 == i)
			anInt7055 = class282_sub35.readUnsignedByte() * -2130672169;
		else if (22 == i)
			anInt7067 = class282_sub35.readUnsignedShort() * 757907389;
	}

	void method11364(RsByteBuffer class282_sub35, int i, byte i_1_) {
		if (i == 1)
			anInt7054 = Class44.method912(class282_sub35.read24BitUnsignedInteger((short) 18296), 2117926535) * 695388511;
		else if (i == 2)
			anInt7066 = class282_sub35.readUnsignedByte() * -1613793573;
		else if (3 == i) {
			anInt7066 = class282_sub35.readUnsignedShort() * -1613793573;
			if (anInt7066 * 1717409107 == 65535)
				anInt7066 = 1613793573;
		} else if (i == 5)
			aBool7056 = false;
		else if (i == 7)
			anInt7058 = Class44.method912(class282_sub35.read24BitUnsignedInteger((short) 10548), 2117926535) * 217561855;
		else if (8 == i)
			((Class531) this).aClass536_7062.anInt7093 = ((Class531) this).anInt7053 * 1866199091;
		else if (9 == i)
			anInt7057 = (class282_sub35.readUnsignedShort() << 2) * 1955150803;
		else if (10 == i)
			aBool7059 = false;
		else if (i == 11)
			anInt7052 = class282_sub35.readUnsignedByte() * 1063532053;
		else if (i == 12)
			aBool7061 = true;
		else if (i == 13)
			anInt7051 = class282_sub35.read24BitUnsignedInteger((short) 2210) * 837652943;
		else if (i == 14)
			anInt7063 = (class282_sub35.readUnsignedByte() << 2) * 2048044799;
		else if (i == 16)
			anInt7064 = class282_sub35.readUnsignedByte() * -262974177;
		else if (i == 20)
			anInt7065 = class282_sub35.readUnsignedShort() * -2046028701;
		else if (21 == i)
			anInt7055 = class282_sub35.readUnsignedByte() * -2130672169;
		else if (22 == i)
			anInt7067 = class282_sub35.readUnsignedShort() * 757907389;
	}

	void method11365() {
		anInt7052 = 1063532053 * (1070524733 * anInt7052 << 8 | ((Class531) this).anInt7053 * 2111894473);
	}

	void method11366() {
		anInt7052 = 1063532053 * (1070524733 * anInt7052 << 8 | ((Class531) this).anInt7053 * 2111894473);
	}

	Class531() {
		aBool7056 = true;
		anInt7058 = -217561855;
		anInt7057 = 309831168;
		aBool7059 = true;
		anInt7052 = -81678168;
		aBool7061 = false;
		anInt7051 = 229081939;
		anInt7063 = -2069119040;
		anInt7064 = 1661061601;
		anInt7065 = -50789283;
		anInt7055 = 0;
		anInt7067 = 1261432640;
	}

	static int method11367(int i) {
		if (16711935 == i)
			return -1;
		return Class5.method294(i, (byte) -30);
	}

	void method11368(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method11364(class282_sub35, i, (byte) 83);
		}
	}

	static int method11369(int i) {
		if (16711935 == i)
			return -1;
		return Class5.method294(i, (byte) 17);
	}

	static final void method11370(CS2Executor class527, int i) {
		int i_2_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (1609086245 * client.anInt7434 == 2 && i_2_ < client.anInt7449 * 493536965)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = client.aClass6Array7452[i_2_].anInt44 * 624169341;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method11371(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 425673003;
		client.anInt7416 = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]) * 1429316783;
		Class149_Sub2.aClass461_9316 = Class246.method4203((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 * 1942118537) + 1]), (byte) 2);
		if (Class149_Sub2.aClass461_9316 == null)
			Class149_Sub2.aClass461_9316 = Class461.aClass461_5539;
		client.anInt7422 = ((((CS2Executor) class527).intStack[2 + ((CS2Executor) class527).anInt7012 * 1942118537]) * 1267760345);
		Class184 class184 = Class468_Sub20.method12807(-405485002);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4547, class184.aClass432_2283, 984159932);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-574868913 * client.anInt7416);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1977256787 * Class149_Sub2.aClass461_9316.anInt5541);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(client.anInt7422 * 1334854505);
		class184.method3049(class282_sub23, 1462868199);
	}

	static final void method11372(CS2Executor class527, int i) {
		int i_3_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_3_, (byte) 14);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_3_ >> 16];
		Class473.method7889(class118, class98, class527, 1072784051);
	}

	static final void method11373(CS2Executor class527, int i) {
		int i_4_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_4_, (byte) 42);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_4_ >> 16];
		Class339.method6045(class118, class98, class527, (byte) -2);
	}
}
