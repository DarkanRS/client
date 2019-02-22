/* Class531 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OverlayDef {
	public int anInt7051;
	public int anInt7052;
	int anInt7053;
	public int primaryRGB = 0;
	public int anInt7055;
	public boolean aBool7056;
	public int anInt7057;
	public int secondaryRGB;
	public boolean aBool7059;
	public boolean aBool7061;
	Class536 aClass536_7062;
	public int anInt7063;
	public int anInt7064;
	public int anInt7065;
	public int texture = 1613793573;
	public int anInt7067;

	void method11356(byte i) {
		anInt7052 = 1063532053 * (1070524733 * anInt7052 << 8 | ((OverlayDef) this).anInt7053 * 2111894473);
	}

	void method11357(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method11364(class282_sub35, i_0_, (byte) 14);
		}
	}

	void method11364(RsByteBuffer class282_sub35, int i, byte i_1_) {
		if (i == 1)
			primaryRGB = Class44.method912(class282_sub35.read24BitUnsignedInteger(), 2117926535) * 695388511;
		else if (i == 2)
			texture = class282_sub35.readUnsignedByte() * -1613793573;
		else if (3 == i) {
			texture = class282_sub35.readUnsignedShort() * -1613793573;
			if (texture * 1717409107 == 65535)
				texture = 1613793573;
		} else if (i == 5)
			aBool7056 = false;
		else if (i == 7)
			secondaryRGB = Class44.method912(class282_sub35.read24BitUnsignedInteger(), 2117926535) * 217561855;
		else if (8 == i)
			((OverlayDef) this).aClass536_7062.anInt7093 = ((OverlayDef) this).anInt7053 * 1866199091;
		else if (9 == i)
			anInt7057 = (class282_sub35.readUnsignedShort() << 2) * 1955150803;
		else if (10 == i)
			aBool7059 = false;
		else if (i == 11)
			anInt7052 = class282_sub35.readUnsignedByte() * 1063532053;
		else if (i == 12)
			aBool7061 = true;
		else if (i == 13)
			anInt7051 = class282_sub35.read24BitUnsignedInteger() * 837652943;
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

	OverlayDef() {
		aBool7056 = true;
		secondaryRGB = -217561855;
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

	static final void method11370(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (1609086245 * client.anInt7434 == 2 && i_2_ < client.anInt7449 * 493536965)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = client.aClass6Array7452[i_2_].anInt44 * 624169341;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method11371(CS2Executor class527, int i) {
		class527.intStackPtr -= 425673003;
		client.anInt7416 = (class527.intStack[1942118537 * class527.intStackPtr]) * 1429316783;
		Class149_Sub2.aClass461_9316 = Class246.method4203((class527.intStack[(class527.intStackPtr * 1942118537) + 1]), (byte) 2);
		if (Class149_Sub2.aClass461_9316 == null)
			Class149_Sub2.aClass461_9316 = Class461.aClass461_5539;
		client.anInt7422 = ((class527.intStack[2 + class527.intStackPtr * 1942118537]) * 1267760345);
		Class184 class184 = Class468_Sub20.method12807(-405485002);
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4547, class184.isaac, 984159932);
		class282_sub23.buffer.writeByte(-574868913 * client.anInt7416);
		class282_sub23.buffer.writeByte(-1977256787 * Class149_Sub2.aClass461_9316.anInt5541);
		class282_sub23.buffer.writeByte(client.anInt7422 * 1334854505);
		class184.method3049(class282_sub23, 1462868199);
	}

	static final void method11372(CS2Executor class527, int i) {
		int i_3_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_3_, (byte) 14);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_3_ >> 16];
		XLinkedNodeList.method7889(class118, class98, class527, 1072784051);
	}

	static final void method11373(CS2Executor class527, int i) {
		int i_4_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_4_, (byte) 42);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_4_ >> 16];
		Class339.method6045(class118, class98, class527, (byte) -2);
	}
}
