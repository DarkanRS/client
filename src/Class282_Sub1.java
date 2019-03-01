public abstract class Class282_Sub1 extends Node {

	static final void method11612(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 3;
		Class117.method1978(cs2executor_0.intStack[cs2executor_0.intStackPtr], cs2executor_0.intStack[cs2executor_0.intStackPtr + 1], cs2executor_0.intStack[cs2executor_0.intStackPtr + 2], (byte) 1);
	}

	static final void method11613(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (client.anInt7349 != -1) {
			if (i_2 == 0) {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7349;
				return;
			}

			--i_2;
		}

		Class282_Sub44 class282_sub44_3;
		for (class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.method7750(-1846591050); i_2-- > 0; class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.method7751((byte) 5)) {
			;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class282_sub44_3.anInt8063;
	}

	public static void method11614(int i_0, int i_1) {
		if (Class388.method6693(2080572135)) {
			if (i_0 != Class9.anInt76) {
				Class9.aLong77 = -1L;
			}

			Class9.anInt76 = i_0;
			Class365.setGameState(19);
		}

	}

	public static void method11615(int i_0, Index index_1, int i_2, int i_3, int i_4, boolean bool_5, Class109 class109_6, int i_7) {
		if (i_0 > 0) {
			Class148.anInt1730 = 1;
			Class75.aClass317_746 = index_1;
			Class6.anInt46 = i_2;
			Class148.anInt1738 = i_3;
			Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
			Class158_Sub2_Sub3.anInt10243 = i_4;
			Class152.aBool1962 = bool_5;
			Class96_Sub22.anInt9440 = Class148.aClass282_Sub15_Sub2_1735.method15123(-1727708848) / i_0;
			if (Class96_Sub22.anInt9440 < 1) {
				Class96_Sub22.anInt9440 = 1;
			}

			Class11.aClass109_121 = class109_6;
		} else {
			if (class109_6 != null) {
				class109_6.method1849((byte) -109);
			}

			Class11.method13400(index_1, i_2, i_3, i_4, bool_5, (byte) -106);
		}

	}

}
