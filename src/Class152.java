
/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public abstract class Class152 {
	static boolean aBool1962;

	Class152() {
		/* empty */
	}

	static void method2596(byte i) {
		Class442 class442 = null;
		try {
			class442 = Class345.method6137("2", client.aClass486_7450.aString5748, false, (byte) -1);
			byte[] is = new byte[(int) class442.method7388(-273347477)];
			int i_0_;
			for (int i_1_ = 0; i_1_ < is.length; i_1_ += i_0_) {
				i_0_ = class442.method7389(is, i_1_, is.length - i_1_, (byte) -99);
				if (-1 == i_0_)
					throw new IOException();
			}
			Class468_Sub10.method12696(new RsByteBuffer(is), 65280);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (null != class442)
				class442.method7385((short) 14717);
		} catch (Exception exception) {
			/* empty */
		}
	}

	static final void method2597(CS2Executor class527, byte i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Class361.aClass361_4183.method6254(new Object[] { string }, (byte) -80);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	public static Class494 method2598(int i) {
		if (Class237.aClass494_2916 == null)
			return Class494.aClass494_5786;
		return Class237.aClass494_2916;
	}

	static char method2599(char c, Language class495, int i) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if (c == '\u00c7')
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if ('\u00d1' == c && Language.aClass495_5800 != class495)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if ('\u00dd' == c)
				return 'Y';
			if (c == '\u00df')
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if ('\u00e7' == c)
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if ('\u00f1' == c && Language.aClass495_5800 != class495)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if ('\u00fd' == c || '\u00ff' == c)
				return 'y';
		}
		if (c == '\u0152')
			return 'O';
		if (c == '\u0153')
			return 'o';
		if (c == '\u0178')
			return 'Y';
		return c;
	}

	public static NativeSprite method2600(Index class317, int i, int i_2_) {
		NativeSprite class160 = (NativeSprite) Class299.aClass229_3545.method3865((long) i);
		if (class160 == null) {
			if (Class339.aBool3987)
				class160 = Class316.aClass505_3680.method8444(Class91.method1515(class317, i), true);
			else
				class160 = (Class103_Sub1.method14490(class317.method5615(i, -1112597366), (byte) -40));
			Class299.aClass229_3545.put(class160, (long) i);
		}
		return class160;
	}

	static final void method2601(long l) {
		if (client.aClass257_7353.method4430(-1572720493) != null) {
			if (-672443707 * Class262.anInt3240 == 2 || -672443707 * Class262.anInt3240 == 1)
				Class363.method6286(l);
			else if (Class262.anInt3240 * -672443707 == 4)
				Class280.method4974(l);
		}
		Class96_Sub12.method14614(Class316.aClass505_3680, (long) (-1809259861 * client.cycles));
		if (-1 != client.anInt7349 * -1699899559)
			UnderlayDefinition.method8777(-1699899559 * client.anInt7349, (byte) -80);
		for (int i = 0; i < 1858642375 * client.anInt7407; i++) {
			client.aBoolArray7410[i] = client.aBoolArray7443[i];
			client.aBoolArray7443[i] = false;
		}
		client.anInt7408 = client.cycles * -1565957043;
		Class380.method6451(-1, -1, 926012216);
		if (-1699899559 * client.anInt7349 != -1) {
			client.anInt7407 = 0;
			Class421.method7039((byte) 58);
		}
		Class316.aClass505_3680.L();
		Class282_Sub20_Sub33.method15411(Class316.aClass505_3680, (byte) 23);
		int i = Class58.method1141(563483982);
		if (-1 == i)
			i = -1211259595 * client.anInt7427;
		if (i == -1)
			i = -141702765 * client.anInt7340;
		Class479.method8036(i, (byte) 4);
		int i_3_ = (Class84.myPlayer.method15805(828768449) << 8);
		Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
		Class96_Sub21.method14675((Class84.myPlayer.aByte7967), (int) class385.aFloat4671 + i_3_, (int) class385.aFloat4673 + i_3_, -383924731 * client.anInt7261, 323581916);
		client.anInt7261 = 0;
	}

	static final void method2602(CS2Executor class527, int i) {
		int i_4_ = (((CS2Executor) class527).unknown[301123709 * ((CS2Executor) class527).instrPtr]);
		Class405 class405 = Class502.aClass394_5831.method6753(i_4_, -292141252);
		if (class405.aChar4832 != '\001')
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		Integer integer = ((Integer) Class46.anObjectArray437[1135540345 * class405.anInt4833]);
		if (integer == null)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else {
			int i_5_ = (-1524555999 * class405.anInt4835 == 31 ? -1 : (1 << class405.anInt4835 * -1524555999 + 1) - 1);
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = ((integer.intValue() & i_5_) >>> class405.anInt4834 * 1015111697);
		}
	}

	public static final void method2603(String string, int i) {
		if (null != string) {
			if (493536965 * client.anInt7449 >= 200 && !client.aBool7316 || client.anInt7449 * 493536965 >= 200)
				Class387.method6681(4, (Message.aClass433_5309.translate(Class223.aClass495_2772, -1836106303)), (byte) 44);
			else {
				String string_6_ = Class383.method6515(string, 1942118537);
				if (null != string_6_) {
					for (int i_7_ = 0; i_7_ < 493536965 * client.anInt7449; i_7_++) {
						Class6 class6 = client.aClass6Array7452[i_7_];
						String string_8_ = Class383.method6515(class6.aString37, 1942118537);
						if (string_8_ != null && string_8_.equals(string_6_)) {
							Class387.method6681(4, new StringBuilder().append(string).append(Message.aClass433_5300.translate(Class223.aClass495_2772, -429754713)).toString(), (byte) 25);
							return;
						}
						if (class6.aString43 != null) {
							String string_9_ = Class383.method6515(class6.aString43, 1942118537);
							if (string_9_ != null && string_9_.equals(string_6_)) {
								Class387.method6681(4, new StringBuilder().append(string).append(Message.aClass433_5300.translate((Class223.aClass495_2772), -1776218961)).toString(), (byte) 15);
								return;
							}
						}
					}
					for (int i_10_ = 0; i_10_ < client.anInt7373 * -1754449153; i_10_++) {
						Class10 class10 = client.aClass10Array7456[i_10_];
						String string_11_ = Class383.method6515(class10.aString115, 1942118537);
						if (string_11_ != null && string_11_.equals(string_6_)) {
							Class387.method6681(4, new StringBuilder().append(Message.aClass433_5214.translate(Class223.aClass495_2772, -2005183517)).append(string).append(Message.aClass433_5198.translate(Class223.aClass495_2772, -2069902145)).toString(), (byte) 0);
							return;
						}
						if (class10.aString116 != null) {
							String string_12_ = Class383.method6515(class10.aString116, 1942118537);
							if (null != string_12_ && string_12_.equals(string_6_)) {
								Class387.method6681(4, new StringBuilder().append(Message.aClass433_5214.translate(Class223.aClass495_2772, -1810692087)).append(string).append(Message.aClass433_5198.translate(Class223.aClass495_2772, -1486683427)).toString(), (byte) 11);
								return;
							}
						}
					}
					if (Class383.method6515((Class84.myPlayer.displayName), 1942118537).equals(string_6_))
						Class387.method6681(4, (Message.aClass433_5227.translate(Class223.aClass495_2772, -2084734592)), (byte) 58);
					else {
						Class184 class184 = Class468_Sub20.method12807(1188178835);
						Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4553, class184.aClass432_2283, 564733792);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class108.method1846(string, -1741873720));
						class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
						class184.method3049(class282_sub23, -92929013);
					}
				}
			}
		}
	}

	static int method2604(byte i) {
		int i_13_ = Class474.aClass387_5621.anInt4712 * -1763884029;
		if (i_13_ < Class302.aClass387Array3557.length - 1)
			Class474.aClass387_5621 = Class302.aClass387Array3557[1 + i_13_];
		return 100;
	}

	static final void method2605(CS2Executor class527, int i) {
		int i_14_ = (((CS2Executor) class527).unknown[301123709 * ((CS2Executor) class527).instrPtr]);
		Long var_long = (((CS2Executor) class527).aClass61_7010.method1201(client.aClass486_7450.anInt5746 * 1648080491 << 16 | i_14_, 1958434699));
		long l;
		if (null == var_long)
			l = -1L;
		else
			l = var_long.longValue();
		((CS2Executor) class527).aLongArray7003[(((CS2Executor) class527).anInt7001 += -1188480575) * 1820448321 - 1] = l;
	}
}
