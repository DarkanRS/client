/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class232 implements Interface17 {
	int[] anIntArray2877;
	static int anInt2878;
	public static int anInt2879;

	public boolean method126(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199) {
		int[] is = ((Class232) this).anIntArray2877;
		for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
			int i_1_ = is[i_0_];
			if (!class199.method3236(i_1_, -1320094050))
				return false;
		}
		return true;
	}

	public boolean method127(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199, byte i_2_) {
		int[] is = ((Class232) this).anIntArray2877;
		for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
			int i_4_ = is[i_3_];
			if (!class199.method3236(i_4_, -2034817305))
				return false;
		}
		return true;
	}

	public boolean method128(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199) {
		int[] is = ((Class232) this).anIntArray2877;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			int i_6_ = is[i_5_];
			if (!class199.method3236(i_6_, -1373982439))
				return false;
		}
		return true;
	}

	public boolean method129(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199) {
		int[] is = ((Class232) this).anIntArray2877;
		for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
			int i_8_ = is[i_7_];
			if (!class199.method3236(i_8_, -1634337253))
				return false;
		}
		return true;
	}

	public static Class232 method3915(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedByte();
		int[] is = new int[i];
		for (int i_9_ = 0; i_9_ < i; i_9_++)
			is[i_9_] = class282_sub35.readUnsignedByte();
		return new Class232(is);
	}

	public static Class232 method3916(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedByte();
		int[] is = new int[i];
		for (int i_10_ = 0; i_10_ < i; i_10_++)
			is[i_10_] = class282_sub35.readUnsignedByte();
		return new Class232(is);
	}

	Class232(int[] is) {
		((Class232) this).anIntArray2877 = is;
	}

	public static Class232 method3917(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedByte();
		int[] is = new int[i];
		for (int i_11_ = 0; i_11_ < i; i_11_++)
			is[i_11_] = class282_sub35.readUnsignedByte();
		return new Class232(is);
	}

	static final void method3918(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Defaults7Loader.method8754(class118, class98, class527, 1449946769);
	}

	static final void method3919(CS2Executor class527, int i) {
		Class291_Sub1.aBool8027 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
	}

	static final void method3920(int i, int i_12_) {
		int i_13_ = -1809259861 * client.cycles - 2055609769 * client.anInt7429;
		if (i_13_ >= 100) {
			Class262.anInt3240 = 770488346;
			Class86.anInt833 = -1509271845;
			Class508.anInt5864 = 987778595;
		} else {
			int i_14_ = (int) client.aFloat7146;
			if (1661251369 * client.anInt7273 >> 8 > i_14_)
				i_14_ = 1661251369 * client.anInt7273 >> 8;
			if (client.aBoolArray7431[4] && 128 + client.anIntArray7433[4] > i_14_)
				i_14_ = 128 + client.anIntArray7433[4];
			int i_15_ = ((int) client.aFloat7365 + -297983899 * client.anInt7343 & 0x3fff);
			Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
			LoadingStage.method6683(Class11.anInt122 * 1762352089, Class504.method8389((int) class385.aFloat4671, (int) class385.aFloat4673, Class4.anInt35 * 675588453, (byte) 51) - 200, Class266.anInt3289 * 518160421, i_14_, i_15_, (i_14_ >> 3) * 3 + 600 << 2, i, 1500551332);
			float f = 1.0F - ((float) ((100 - i_13_) * ((100 - i_13_) * (100 - i_13_))) / 1000000.0F);
			Class31.anInt361 = ((int) ((float) (Class186.anInt2349 * 494445359) + f * (float) (-360258135 * Class31.anInt361 - 494445359 * Class186.anInt2349)) * -2043310439);
			Class109_Sub1.anInt9384 = (-126779709 * (int) ((float) (1322062263 * Class521_Sub1_Sub2.anInt9461) + f * (float) (1929945579 * Class109_Sub1.anInt9384 - (Class521_Sub1_Sub2.anInt9461 * 1322062263))));
			Class246.anInt3029 = ((int) ((float) (413271601 * Class246.anInt3029 - (Class282_Sub15_Sub1.anInt9575 * 2036551173)) * f + (float) (2036551173 * Class282_Sub15_Sub1.anInt9575)) * 1442943697);
			Class293.anInt3512 = (-647467135 * (int) ((float) (Class336.anInt3968 * -721404905) + f * (float) (726126721 * Class293.anInt3512 - (-721404905 * Class336.anInt3968))));
			int i_16_ = (1236051449 * AnimationDefinitions.anInt5930 - -109692897 * ItemDefaultsLoader.anInt5029);
			if (i_16_ > 8192)
				i_16_ -= 16384;
			else if (i_16_ < -8192)
				i_16_ += 16384;
			AnimationDefinitions.anInt5930 = (int) ((float) (-109692897 * ItemDefaultsLoader.anInt5029) + f * (float) i_16_) * 1898253385;
			AnimationDefinitions.anInt5930 = 1898253385 * (AnimationDefinitions.anInt5930 * 1236051449 & 0x3fff);
		}
	}

	static final void method3921(CS2Executor class527, int i) {
		Class184 class184 = Class468_Sub20.method12807(-1070075874);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.aClass432_2283, 1590511706);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		int i_17_ = -1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class527.aClass346_7009.anInt4048 * -624100047, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.aClass282_Sub35_Sub2_7682, class527.aClass346_7009.anIntArray4046, -245952501);
		class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291 - i_17_), 1096626300);
		class184.method3049(class282_sub23, 363864337);
	}

	static final void method3922(int[] is, int i, int i_18_, int i_19_, byte i_20_) {
		i--;
		int i_21_ = --i_18_ - 7;
		while (i < i_21_) {
			is[++i] = i_19_;
			is[++i] = i_19_;
			is[++i] = i_19_;
			is[++i] = i_19_;
			is[++i] = i_19_;
			is[++i] = i_19_;
			is[++i] = i_19_;
			is[++i] = i_19_;
		}
		while (i <= i_18_)
			is[++i] = i_19_;
	}
}
