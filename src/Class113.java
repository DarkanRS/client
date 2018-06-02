/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class113 {
	static Class117 aClass117_1234;
	public static Class282_Sub4 aClass282_Sub4_1235;

	public static void method1875(Class117 class117) {
		aClass117_1234 = class117;
	}

	public static String method1876(RsByteBuffer class282_sub35) {
		return Class282_Sub33.method12582(class282_sub35, 32767, -2080210989);
	}

	public static void method1877(Class117 class117) {
		aClass117_1234 = class117;
	}

	static String method1878(RsByteBuffer class282_sub35, int i) {
		String string;
		try {
			int i_0_ = class282_sub35.readUnsignedSmart(2029103891);
			if (i_0_ > i)
				i_0_ = i;
			byte[] is = new byte[i_0_];
			class282_sub35.index += (aClass117_1234.method1973(class282_sub35.buffer, (class282_sub35.index * -1990677291), is, 0, i_0_, (byte) 78) * -1115476867);
			String string_1_ = Class344.method6118(is, 0, i_0_, (byte) -73);
			string = string_1_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}

	public static int method1879(RsByteBuffer class282_sub35, String string) {
		int i = -1990677291 * class282_sub35.index;
		byte[] is = Class473.method7885(string, (byte) -109);
		class282_sub35.method13076(is.length, 1870267049);
		class282_sub35.index += aClass117_1234.method1971(is, 0, is.length, class282_sub35.buffer, (class282_sub35.index * -1990677291), -130174544) * -1115476867;
		return class282_sub35.index * -1990677291 - i;
	}

	Class113() throws Throwable {
		throw new Error();
	}

	static String method1880(RsByteBuffer class282_sub35, int i) {
		String string;
		try {
			int i_2_ = class282_sub35.readUnsignedSmart(2079259575);
			if (i_2_ > i)
				i_2_ = i;
			byte[] is = new byte[i_2_];
			class282_sub35.index += (aClass117_1234.method1973(class282_sub35.buffer, (class282_sub35.index * -1990677291), is, 0, i_2_, (byte) 81) * -1115476867);
			String string_3_ = Class344.method6118(is, 0, i_2_, (byte) -104);
			string = string_3_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}

	public static int method1881(RsByteBuffer class282_sub35, String string) {
		int i = -1990677291 * class282_sub35.index;
		byte[] is = Class473.method7885(string, (byte) -85);
		class282_sub35.method13076(is.length, -216579307);
		class282_sub35.index += aClass117_1234.method1971(is, 0, is.length, class282_sub35.buffer, (class282_sub35.index * -1990677291), -130174544) * -1115476867;
		return class282_sub35.index * -1990677291 - i;
	}

	static final void method1882(CS2Executor class527, short i) {
		class527.anInt7012 -= 283782002;
		int i_4_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_5_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_4_ & -1 - (1 << i_5_);
	}

	static final void method1883(int i) {
		for (Class282_Sub50_Sub16 class282_sub50_sub16 = ((Class282_Sub50_Sub16) client.aClass482_7333.head((byte) 68)); null != class282_sub50_sub16; class282_sub50_sub16 = ((Class282_Sub50_Sub16) client.aClass482_7333.next(380890791))) {
			Class521_Sub1_Sub1_Sub3 class521_sub1_sub1_sub3 = (((Class282_Sub50_Sub16) class282_sub50_sub16).aClass521_Sub1_Sub1_Sub3_9839);
			if (-1809259861 * client.cycles > class521_sub1_sub1_sub3.anInt10392 * -780553027) {
				class282_sub50_sub16.unlink(-371378792);
				class521_sub1_sub1_sub3.method15906(220489197);
			} else if (-1809259861 * client.cycles >= -362500645 * class521_sub1_sub1_sub3.anInt10393) {
				class521_sub1_sub1_sub3.method15903(2024171399);
				if (1198158801 * class521_sub1_sub1_sub3.anInt10382 > 0) {
					if (4 == -891719545 * client.anInt7341) {
						Animable class521_sub1_sub1_sub2 = Class82.aClass75Array804[(class521_sub1_sub1_sub3.anInt10382 * 1198158801) - 1].method1342((byte) 22);
						if (null != class521_sub1_sub1_sub2) {
							Class385 class385 = (class521_sub1_sub1_sub2.method11166().aClass385_3595);
							if ((int) class385.aFloat4671 >= 0 && ((int) class385.aFloat4671 < IndexLoaders.MAP_REGION_DECODER.method4424(1637325924) * 512) && (int) class385.aFloat4673 >= 0 && ((int) class385.aFloat4673 < IndexLoaders.MAP_REGION_DECODER.method4451(-601813258) * 512))
								class521_sub1_sub1_sub3.method15904((int) class385.aFloat4671, (int) class385.aFloat4673, ((Class504.method8389((int) class385.aFloat4671, (int) class385.aFloat4673, class521_sub1_sub1_sub2.aByte7967, (byte) 107)) - (class521_sub1_sub1_sub3.anInt10384 * -1502066599)), client.cycles * -1809259861, -209443166);
						}
					} else {
						Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) ((1198158801 * class521_sub1_sub1_sub3.anInt10382) - 1))));
						if (class282_sub47 != null) {
							NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
							Class385 class385 = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
							if ((int) class385.aFloat4671 >= 0 && ((int) class385.aFloat4671 < IndexLoaders.MAP_REGION_DECODER.method4424(-574006566) * 512) && (int) class385.aFloat4673 >= 0 && ((int) class385.aFloat4673 < IndexLoaders.MAP_REGION_DECODER.method4451(-1609941818) * 512))
								class521_sub1_sub1_sub3.method15904((int) class385.aFloat4671, (int) class385.aFloat4673, ((Class504.method8389((int) class385.aFloat4671, (int) class385.aFloat4673, class521_sub1_sub1_sub3.aByte7967, (byte) 124)) - -1502066599 * (class521_sub1_sub1_sub3.anInt10384)), client.cycles * -1809259861, -209443166);
						}
					}
				}
				if (1198158801 * class521_sub1_sub1_sub3.anInt10382 < 0) {
					int i_6_ = (-(1198158801 * class521_sub1_sub1_sub3.anInt10382) - 1);
					Player class521_sub1_sub1_sub2_sub1;
					if (client.anInt7315 * 1595512269 == i_6_)
						class521_sub1_sub1_sub2_sub1 = Class84.myPlayer;
					else
						class521_sub1_sub1_sub2_sub1 = (client.players[i_6_]);
					if (null != class521_sub1_sub1_sub2_sub1) {
						Class385 class385 = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
						if ((int) class385.aFloat4671 >= 0 && ((int) class385.aFloat4671 < (IndexLoaders.MAP_REGION_DECODER.method4424(1706889017) * 512)) && (int) class385.aFloat4673 >= 0 && ((int) class385.aFloat4673 < IndexLoaders.MAP_REGION_DECODER.method4451(-1329029745) * 512))
							class521_sub1_sub1_sub3.method15904((int) class385.aFloat4671, (int) class385.aFloat4673, (Class504.method8389((int) (class385.aFloat4671), (int) (class385.aFloat4673), (class521_sub1_sub1_sub3.aByte7967), (byte) 88) - (class521_sub1_sub1_sub3.anInt10384 * -1502066599)), client.cycles * -1809259861, -209443166);
					}
				}
				class521_sub1_sub1_sub3.method15910(-383924731 * client.anInt7261, (short) 256);
				IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1120760883).method3397(class521_sub1_sub1_sub3, true, -1495291324);
			}
		}
	}
}
