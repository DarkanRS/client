/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class89 {
	public static final int anInt930 = 1023;
	public static int[] anIntArray931 = { 3, 7, 15 };
	public static final int anInt932 = 16;
	public static final int anInt933 = 32;
	public static int[] anIntArray934 = { 2047, 16383, 65535 };
	public static final int anInt935 = 8;
	public static final int anInt936 = 8191;
	public static final int anInt937 = 32;
	public static final int anInt938 = 8;
	public static final int anInt939 = 1;
	public static final int anInt940 = 0;
	public static final int anInt941 = 2;
	public static final int anInt942 = 0;
	public static final int anInt943 = 2;
	
	Class89() throws Throwable {
		throw new Error();
	}

	static void method1496(byte[] is, int i) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (i_0_ == 0)
				break;
			if (i_0_ == 1) {
				int i_1_ = class282_sub35.readUnsignedShort();
				if (1712678171 * Class260.anInt3228 == -1)
					Class260.anInt3228 = i_1_ * -1880658669;
			}
		}
	}

	static final void method1497(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class172.method2915(class118, class98, class527, (byte) 0);
	}

	static final void method1498(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 539377845 * class118.anInt1334;
	}

	static final void method1499(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) (-6750871795187943813L * Class116.aLong1259 / 60000L);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) ((Class116.aLong1259 * -6750871795187943813L - Class169.method2869(1705160163) - -1002288734586436517L * Class43.aLong420) / 60000L);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class509.aBool5870 ? 1 : 0;
	}

	static final void method1500(CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		Class152.method2603(string, -671341252);
	}

	static final void method1501(CS2Executor class527, byte i) {
		if (null != Class202_Sub1.aClass282_Sub4_8186) {
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			((CS2Executor) class527).aClass282_Sub4_7011 = Class202_Sub1.aClass282_Sub4_8186;
		} else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static void method1502(int i) {
		if (Class427.anInt5123 * -861975801 < 0) {
			Class427.anInt5123 = 0;
			Class291_Sub1.anInt8014 = -1089992553;
			Class291_Sub1.anInt8016 = 638834387;
		}
		if (Class427.anInt5123 * -861975801 > Class291_Sub1.xLength) {
			Class427.anInt5123 = 1714827959 * Class291_Sub1.xLength;
			Class291_Sub1.anInt8014 = -1089992553;
			Class291_Sub1.anInt8016 = 638834387;
		}
		if (483850921 * Class475.anInt5624 < 0) {
			Class475.anInt5624 = 0;
			Class291_Sub1.anInt8014 = -1089992553;
			Class291_Sub1.anInt8016 = 638834387;
		}
		if (Class475.anInt5624 * 483850921 > Class291_Sub1.yLength) {
			Class475.anInt5624 = Class291_Sub1.yLength * 1710901657;
			Class291_Sub1.anInt8014 = -1089992553;
			Class291_Sub1.anInt8016 = 638834387;
		}
	}

	static void method1503(int i, int i_2_) {
		Class427.anInt5123 = 1714827959 * i;
		Class291_Sub1.anInt8014 = -1089992553;
		Class291_Sub1.anInt8016 = 638834387;
		method1502(-1202375965);
	}

	public static final void method1504(long l) {
		if (l > 0L) {
			if (0L == l % 10L) {
				Class350_Sub3_Sub1.method15560(l - 1L);
				Class350_Sub3_Sub1.method15560(1L);
			} else
				Class350_Sub3_Sub1.method15560(l);
		}
	}
}
