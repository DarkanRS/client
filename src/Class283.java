/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class283 {
	public int[] anIntArray3381;
	public int anInt3382;
	public int[] anIntArray3383;
	public static int anInt3384;

	public static Class283 method5005(Index class317, String string, boolean bool) {
		int i = class317.getArchiveId(string, 1601632799);
		if (-1 == i)
			return new Class283(0);
		int[] is = class317.method5616(i, -1665281400);
		Class283 class283 = new Class283(is.length);
		int i_0_ = 0;
		int i_1_ = 0;
		while (i_0_ < -361490119 * class283.anInt3382) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(class317.getFile(i, is[i_1_++], -1862037821));
			int i_2_ = class282_sub35.readInt();
			int i_3_ = class282_sub35.readUnsignedShort();
			int i_4_ = class282_sub35.readUnsignedByte();
			if (bool || 1 != i_4_) {
				class283.anIntArray3381[i_0_] = i_2_;
				class283.anIntArray3383[i_0_] = i_3_;
				i_0_++;
			} else
				class283.anInt3382 -= -1982528247;
		}
		return class283;
	}

	public static Class283 method5006(Index class317, String string, boolean bool) {
		int i = class317.getArchiveId(string, -1721859945);
		if (-1 == i)
			return new Class283(0);
		int[] is = class317.method5616(i, -1814676381);
		Class283 class283 = new Class283(is.length);
		int i_5_ = 0;
		int i_6_ = 0;
		while (i_5_ < -361490119 * class283.anInt3382) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(class317.getFile(i, is[i_6_++], -1511396395));
			int i_7_ = class282_sub35.readInt();
			int i_8_ = class282_sub35.readUnsignedShort();
			int i_9_ = class282_sub35.readUnsignedByte();
			if (bool || 1 != i_9_) {
				class283.anIntArray3381[i_5_] = i_7_;
				class283.anIntArray3383[i_5_] = i_8_;
				i_5_++;
			} else
				class283.anInt3382 -= -1982528247;
		}
		return class283;
	}

	public Class283(int i) {
		anInt3382 = -1982528247 * i;
		anIntArray3381 = new int[anInt3382 * -361490119];
		anIntArray3383 = new int[-361490119 * anInt3382];
	}

	public static Class283 method5007(Index class317, String string, boolean bool) {
		int i = class317.getArchiveId(string, 1416579061);
		if (-1 == i)
			return new Class283(0);
		int[] is = class317.method5616(i, -731838186);
		Class283 class283 = new Class283(is.length);
		int i_10_ = 0;
		int i_11_ = 0;
		while (i_10_ < -361490119 * class283.anInt3382) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(class317.getFile(i, is[i_11_++], -2095255905));
			int i_12_ = class282_sub35.readInt();
			int i_13_ = class282_sub35.readUnsignedShort();
			int i_14_ = class282_sub35.readUnsignedByte();
			if (bool || 1 != i_14_) {
				class283.anIntArray3381[i_10_] = i_12_;
				class283.anIntArray3383[i_10_] = i_13_;
				i_10_++;
			} else
				class283.anInt3382 -= -1982528247;
		}
		return class283;
	}

	static final void method5008(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		DefaultsFile.method11223(class118, class98, class527, 4317906);
	}

	static final void method5009(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1962956605) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1413 = Class351.method6193(string, class527, 1097556379);
		class118.aBool1384 = true;
	}

	static final void method5010(CS2Executor class527, int i) {
		int i_15_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.anInt7166 * -1741204137 != 0 || JS5CacheFile.method3360((byte) 17))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = Class62.method1262(i_15_, string, (byte) 55) ? 1 : 0;
	}
}
