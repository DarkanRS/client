public abstract class Node_Sub1 extends Node {

	public static void method11614(int i_0) {
		if (Class388.method6693(2080572135)) {
			if (i_0 != Class9.anInt76) {
				Class9.aLong77 = -1L;
			}
			Class9.anInt76 = i_0;
			Class365.setGameState(19);
		}
	}

	public static void method11615(int i_0, Index index_1, int i_2, int i_4, Class109 class109_6) {
		if (i_0 > 0) {
			Class148.anInt1730 = 1;
			CutsceneEntity.aClass317_746 = index_1;
			Friend.anInt46 = i_2;
			Class148.anInt1738 = 0;
			Node_Sub33.aNode_Sub15_Sub2_7836 = null;
			Class158_Sub2_Sub3.anInt10243 = i_4;
			Class152.aBool1962 = false;
			CutsceneAction_Sub22.anInt9440 = Class148.aNode_Sub15_Sub2_1735.method15123(-1727708848) / i_0;
			if (CutsceneAction_Sub22.anInt9440 < 1) {
				CutsceneAction_Sub22.anInt9440 = 1;
			}
			Class11.aClass109_121 = class109_6;
		} else {
			if (class109_6 != null) {
				class109_6.method1849((byte) -109);
			}
			Class11.method13400(index_1, i_2, i_4, (byte) -106);
		}
	}
}
