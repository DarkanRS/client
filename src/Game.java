public class Game {

	public static Game darkan = new Game("darkan", "Darkan", 0);
	public static Game stellarDawn = new Game("stellardawn", "Stellar Dawn", 1);
	static Game aClass486_5745 = new Game("game3", "Game 3", 2);
	static Game aClass486_5743 = new Game("game4", "Game 4", 3);
	static Game aClass486_5747 = new Game("game5", "Game 5", 4);
	public String aString5748;
	public String aString5749;
	public int anInt5746;

	Game(String string_1, String string_2, int i_3) {
		this.aString5748 = string_1;
		this.aString5749 = string_2;
		this.anInt5746 = i_3;
	}

	public static void method8204(int i_0, int i_1) {
		Class281.anInt3376 = i_0;
	}

	static final void method8205(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7271 - client.anInt7270;
	}

	static final void method8206(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 12;
		Class316.method5594(-559600711);
		Class96.method1607((byte) 35);
		Class282_Sub20_Sub9.anInt9792 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		Class301.anInt3556 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		Class20.anInt188 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		Class182.anInt2262 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 3];
		Class450.anInt5438 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 4];
		Class373.anInt4350 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 5];
		Class254.anInt3145 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 6];
		Class446.anInt5396 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 7];
		Class17.anInt148 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 8];
		Class388.anInt4722 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 9];
		Class99.anInt1005 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 10];
		Class242.anInt2982 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 11];
		IndexLoaders.SPRITES_INDEX.method5661(Class450.anInt5438, 1020606537);
		IndexLoaders.SPRITES_INDEX.method5661(Class373.anInt4350, -2132853844);
		IndexLoaders.SPRITES_INDEX.method5661(Class254.anInt3145, 849271104);
		IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396, 1880113432);
		IndexLoaders.SPRITES_INDEX.method5661(Class17.anInt148, 1880542430);
		IndexLoaders.SPRITES_INDEX.method5661(Class242.anInt2982, 522426974);
		IndexLoaders.FONT_METRICS_INDEX.method5661(Class242.anInt2982, 1908708810);
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

	public static void method8207(int i_0, int i_1) {
		Class282_Sub50_Sub12 class282_sub50_sub12_2 = Engine.getIComponentVar(16, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) -1);
	}

}
