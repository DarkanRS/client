public class Class99 {

	public static int anInt1005;

	public String aString1003;

	public String aString1001;

	public String aString1002;

	public Class121[] aClass121Array1000;

	public Class121[] aClass121Array1004;

	void method1628(Class100 class100_1) {
		this.aString1003 = class100_1.method1633();
		this.aString1001 = class100_1.method1633();
		this.aString1002 = class100_1.method1633();
		int i_3 = class100_1.method1632((byte) -36);
		int i_4 = class100_1.method1632((byte) -58);
		this.aClass121Array1000 = i_3 == 0 ? null : new Class121[i_3];
		this.aClass121Array1004 = i_4 == 0 ? null : new Class121[i_4];
		int i_5;
		for (i_5 = 0; i_5 < i_3; i_5++) {
			this.aClass121Array1000[i_5] = new Class121();
			this.aClass121Array1000[i_5].method2097(class100_1, (byte) 31);
		}
		for (i_5 = 0; i_5 < i_4; i_5++) {
			this.aClass121Array1004[i_5] = new Class121();
			this.aClass121Array1004[i_5].method2097(class100_1, (byte) 26);
		}
	}

	static void method1630(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, CacheableNode_Sub15 class282_sub50_sub15_7, FontRenderer fontrenderer_8, FontMetrics fontmetrics_9, int i_10, int i_11, int i_12) {
		if (i_0 > i_2 && i_0 < i_2 + i_4 && i_1 > i_6 - fontmetrics_9.anInt4978 - 1 && i_1 < fontmetrics_9.anInt4979 + i_6) {
			i_10 = i_11;
		}
		String string_13 = CutsceneEntity.method1354(class282_sub50_sub15_7);
		fontrenderer_8.method386(string_13, i_2 + 3, i_6, i_10, client.aRandom7260, PacketsDecoder.anInt9079, Class115.aNativeSpriteArray1248, Class20.anIntArray177, 701039409);
	}
}
