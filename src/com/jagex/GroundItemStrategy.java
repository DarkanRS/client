package com.jagex;
public class GroundItemStrategy extends RouteStrategy {

	public static String aString8069;

	public boolean canExit(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return Class325.method5790(i_2, i_3, i_1, i_1, this.approxDestinationX, this.approxDestinationY, this.approxDestinationSizeX, this.approxDestinationSizeY, -1229597907);
	}

	static final void method13411(int i_0, int i_1, int i_2, int i_3, byte b_4) {
		int i_5;
		if (i_1 > i_2) {
			for (i_5 = i_2; i_5 < i_1; i_5++) {
				Class532_Sub2.anIntArrayArray7072[i_5][i_0] = i_3;
			}
		} else {
			for (i_5 = i_1; i_5 < i_2; i_5++) {
				Class532_Sub2.anIntArrayArray7072[i_5][i_0] = i_3;
			}
		}
	}

	static void method13413() {
		Renderers.FONT_RENDERER = null;
		Class16.aFontRenderer_144 = null;
		Class285.aFontRenderer_3394 = null;
		Node_Sub21.aNativeSpriteArray7673 = null;
		Class16.aNativeSpriteArray138 = null;
		Class391.HINT_ARROW_SPRITES = null;
		Node_Sub20_Sub15.aNativeSpriteArray9838 = null;
		Class16.aNativeSpriteArray145 = null;
		Node_Sub36.aNativeSpriteArray7994 = null;
		Class250.aNativeSpriteArray3092 = null;
		Class182.aNativeSpriteArray2261 = null;
		Class16.aNativeSprite_146 = null;
		Exception_Sub1.aNativeSprite_10075 = null;
		Class245.aNativeSpriteArray3027 = null;
	}
}
