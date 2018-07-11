/* Class486 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Game {
	static Game aClass486_5743;
	public static Game darkan = new Game("darkan", "Darkan", 0);
	static Game aClass486_5745;
	public int anInt5746;
	static Game aClass486_5747;
	public String aString5748;
	public String aString5749;
	public static Game stellarDawn = new Game("stellardawn", "Stellar Dawn", 1);

	Game(String string, String string_0_, int i) {
		aString5748 = string;
		aString5749 = string_0_;
		anInt5746 = i * -151370173;
	}

	static {
		aClass486_5745 = new Game("game3", "Game 3", 2);
		aClass486_5743 = new Game("game4", "Game 4", 3);
		aClass486_5747 = new Game("game5", "Game 5", 4);
	}

	static Game[] method8202() {
		return new Game[] { aClass486_5745, aClass486_5743, stellarDawn, aClass486_5747, darkan };
	}

	public static Game method8203(int i) {
		Game[] class486s = Class282_Sub15_Sub1.method14817(777386057);
		for (int i_1_ = 0; i_1_ < class486s.length; i_1_++) {
			Game class486 = class486s[i_1_];
			if (class486.anInt5746 * 1648080491 == i)
				return class486;
		}
		return null;
	}

	public static void method8204(int i, int i_2_) {
		Class281.anInt3376 = -719788339 * i;
	}

	static final void method8205(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = client.anInt7271 * -871685551 - client.anInt7270 * -240868135;
	}

	static final void method8206(CS2Executor class527, int i) {
		class527.intStackPtr -= 1702692012;
		Class316.method5594(-559600711);
		Class96.method1607((byte) 35);
		Class282_Sub20_Sub9.anInt9792 = (class527.intStack[class527.intStackPtr * 1942118537]) * -2112332643;
		Class301.anInt3556 = -40093315 * (class527.intStack[class527.intStackPtr * 1942118537 + 1]);
		Class20.anInt188 = 50073545 * (class527.intStack[2 + class527.intStackPtr * 1942118537]);
		Class182.anInt2262 = (2139103415 * (class527.intStack[3 + 1942118537 * class527.intStackPtr]));
		Class450.anInt5438 = (1254300539 * (class527.intStack[class527.intStackPtr * 1942118537 + 4]));
		Class373.anInt4350 = ((class527.intStack[class527.intStackPtr * 1942118537 + 5]) * -923361129);
		Class254.anInt3145 = (1497808011 * (class527.intStack[6 + class527.intStackPtr * 1942118537]));
		Class446.anInt5396 = (-1722209539 * (class527.intStack[class527.intStackPtr * 1942118537 + 7]));
		Class17.anInt148 = (class527.intStack[class527.intStackPtr * 1942118537 + 8]) * 254147049;
		Class388.anInt4722 = (-581610323 * (class527.intStack[1942118537 * class527.intStackPtr + 9]));
		Class99.anInt1005 = ((class527.intStack[10 + class527.intStackPtr * 1942118537]) * 286693969);
		Class242.anInt2982 = (-918117939 * (class527.intStack[class527.intStackPtr * 1942118537 + 11]));
		IndexLoaders.SPRITES_INDEX.method5661(947424179 * Class450.anInt5438, 1020606537);
		IndexLoaders.SPRITES_INDEX.method5661(-1626939609 * Class373.anInt4350, -2132853844);
		IndexLoaders.SPRITES_INDEX.method5661(464964387 * Class254.anInt3145, 849271104);
		IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396 * -781860267, 1880113432);
		IndexLoaders.SPRITES_INDEX.method5661(Class17.anInt148 * -1965396391, 1880542430);
		IndexLoaders.SPRITES_INDEX.method5661(Class242.anInt2982 * -1242615035, 522426974);
		IndexLoaders.FONT_METRICS_INDEX.method5661(-1242615035 * Class242.anInt2982, 1908708810);
		Class354.aClass160_4110 = null;
		Class149_Sub2.aClass160_9315 = null;
		Class125.aClass160_1571 = null;
		Class60.aClass160_612 = null;
		Class61.aClass160_647 = null;
		Class467.aClass160_5576 = null;
		Class290.aClass160_3452 = null;
		AttributeDefault.aClass160_5339 = null;
		Class20.aBool187 = true;
	}

	public static void method8207(int i, int i_3_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(16, (long) i);
		class282_sub50_sub12.method14965((byte) -1);
	}
}
