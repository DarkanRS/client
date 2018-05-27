/* Class357 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class357 implements Interface3 {
	public int anInt4120;
	public Class356 aClass356_4121;
	public Class353 aClass353_4122;
	public int anInt4123;
	public int anInt4124;

	public Class60 method24(int i) {
		return Class60.aClass60_606;
	}

	Class357(int i, Class356 class356, Class353 class353, int i_0_, int i_1_) {
		anInt4124 = i * -206423037;
		aClass356_4121 = class356;
		aClass353_4122 = class353;
		anInt4123 = i_0_ * 1535819339;
		anInt4120 = -818805705 * i_1_;
	}

	public Class60 method25() {
		return Class60.aClass60_606;
	}

	public static Class357 method6228(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readBigSmart();
		Class356 class356 = (Class350_Sub3_Sub1.method15558(968256486)[class282_sub35.readUnsignedByte()]);
		Class353 class353 = (Class483.method8155(152314627)[class282_sub35.readUnsignedByte()]);
		int i_2_ = class282_sub35.readShort(1848566217);
		int i_3_ = class282_sub35.readShort(1828315764);
		return new Class357(i, class356, class353, i_2_, i_3_);
	}

	static final void method6229(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_4_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_5_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (i_4_ == 99)
			Class209.method3598(string, -914132655);
		else if (98 == i_4_)
			Class240.method4140(string, 2053399101);
		else
			Class191.method3167(i_4_, i_5_, "", "", "", string, 30910415);
	}

	static final void method6230(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_6_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_7_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class521_Sub1_Sub1_Sub6.method16125(i_6_, i_7_, true, -1743480204);
	}

	static final void method6231(CS2Executor class527, int i) {
		int i_8_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aClass330Array7428[i_8_].method5909(-41459410);
	}

	static final void method6232(CS2Executor class527, int i) {
		int i_9_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_9_, (byte) 107);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.aBool1306 ? 1 : 0;
	}

	static final void method6233(byte i) {
		int[] is = Class197.PLAYER_INDICES;
		for (int i_10_ = 0; i_10_ < -963499271 * Class197.NUM_PLAYER_INDICES; i_10_++) {
			Player class521_sub1_sub1_sub2_sub1 = client.players[is[i_10_]];
			if (class521_sub1_sub1_sub2_sub1 != null)
				class521_sub1_sub1_sub2_sub1.method15812(-942538273);
		}
		for (int i_11_ = 0; i_11_ < -685729279 * client.anInt7211; i_11_++) {
			long l = (long) client.anIntArray7212[i_11_];
			Class282_Sub47 class282_sub47 = (Class282_Sub47) client.aClass465_7208.method7754(l);
			if (null != class282_sub47)
				((Animable) class282_sub47.anObject8068).method15812(655110500);
		}
		if (4 == -891719545 * client.anInt7341) {
			for (int i_12_ = 0; i_12_ < Class82.aClass75Array804.length; i_12_++) {
				Class75 class75 = Class82.aClass75Array804[i_12_];
				if (class75.aBool742)
					class75.method1342((byte) 50).method15812(298889820);
			}
		}
	}
}
