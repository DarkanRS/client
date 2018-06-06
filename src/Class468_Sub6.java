/* Class468_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class468_Sub6 extends Class468 {
	public static final int anInt7878 = 1;
	public static final int anInt7879 = 3;
	public static final int anInt7880 = 0;
	public static final int anInt7881 = 2;
	public static final int anInt7882 = 4;

	public int method12652() {
		return anInt5578 * -859024475;
	}

	public void method12653(int i) {
		if (-859024475 * anInt5578 < 0 || -859024475 * anInt5578 > 4)
			anInt5578 = method7781(1866918213) * -754033619;
	}

	void method7783(int i, int i_0_) {
		anInt5578 = -754033619 * i;
	}

	int method7781(int i) {
		return 0;
	}

	int method7785(int i, int i_1_) {
		return 1;
	}

	int method7784(int i) {
		return 1;
	}

	public int method12654(int i) {
		return anInt5578 * -859024475;
	}

	public Class468_Sub6(Class282_Sub54 class282_sub54) {
		super(class282_sub54);
	}

	void method7780(int i) {
		anInt5578 = -754033619 * i;
	}

	int method7786() {
		return 0;
	}

	int method7787() {
		return 0;
	}

	public void method12655() {
		if (-859024475 * anInt5578 < 0 || -859024475 * anInt5578 > 4)
			anInt5578 = method7781(2068149488) * -754033619;
	}

	public Class468_Sub6(int i, Class282_Sub54 class282_sub54) {
		super(i, class282_sub54);
	}

	public int method12656() {
		return anInt5578 * -859024475;
	}

	public void method12657() {
		if (-859024475 * anInt5578 < 0 || -859024475 * anInt5578 > 4)
			anInt5578 = method7781(2045750871) * -754033619;
	}

	public static void method12658(int i) {
		Class150.method2580(-1, 255, (byte) 34);
	}

	static final void method12659(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i == 2)
				return;
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_2_ = class513;
		IComponentDefinitions class118 = ((UnderlayDefinition) class513_2_).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513_2_).aClass98_5885;
		ItemDefinitions.method7142(class118, class98, class527, -1755364676);
	}

	static final void method12660(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_3_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_4_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_5_ = i_4_ >> 14 & 0x3fff;
		int i_6_ = i_4_ & 0x3fff;
		int i_7_ = Class468_Sub11.method12702(i_3_, i_5_, i_6_, -1885188952);
		if (i_7_ < 0)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i_7_;
	}

	static boolean method12661(String string, int i, byte i_8_) {
		return Class186.method3082(string, i, "openjs", 145298920);
	}
}
