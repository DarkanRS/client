package com.rs.jagex;

public class Class487 {

	public static Class378 aClass378_5752;

	static void method8209(AbstractRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		if ((Class354.aNativeSprite_4110 == null || ParamDefinitions.aNativeSprite_5339 == null || Class125.aNativeSprite_1571 == null) && IndexLoaders.SPRITES_INDEX.loadFile(Class254.anInt3145) && IndexLoaders.SPRITES_INDEX.loadFile(Class446.anInt5396) && IndexLoaders.SPRITES_INDEX.loadFile(Class17.anInt148)) {
			SpriteDefinitions class91_10 = SpriteDefinitions.getSprite(IndexLoaders.SPRITES_INDEX, Class446.anInt5396, 0);
			ParamDefinitions.aNativeSprite_5339 = graphicalrenderer_0.method8444(class91_10, true);
			class91_10.method1525();
			HeadbarIndexLoader.aNativeSprite_3452 = graphicalrenderer_0.method8444(class91_10, true);
			Class354.aNativeSprite_4110 = graphicalrenderer_0.method8444(SpriteDefinitions.getSprite(IndexLoaders.SPRITES_INDEX, Class254.anInt3145, 0), true);
			SpriteDefinitions class91_11 = SpriteDefinitions.getSprite(IndexLoaders.SPRITES_INDEX, Class17.anInt148, 0);
			Class125.aNativeSprite_1571 = graphicalrenderer_0.method8444(class91_11, true);
			class91_11.method1525();
			Class149_Sub2.aNativeSprite_9315 = graphicalrenderer_0.method8444(class91_11, true);
		}
		if (Class354.aNativeSprite_4110 != null && ParamDefinitions.aNativeSprite_5339 != null && Class125.aNativeSprite_1571 != null) {
			int i_7 = (i_3 - Class125.aNativeSprite_1571.method2747() * 2) / Class354.aNativeSprite_4110.method2747();
			int i_8;
			for (i_8 = 0; i_8 < i_7; i_8++)
				Class354.aNativeSprite_4110.method2752(i_1 + Class125.aNativeSprite_1571.method2747() + i_8 * Class354.aNativeSprite_4110.method2747(), i_2 + i_4 - Class354.aNativeSprite_4110.method2793());
			i_8 = (i_4 - i_5 - Class125.aNativeSprite_1571.method2793()) / ParamDefinitions.aNativeSprite_5339.method2793();
			for (int i_9 = 0; i_9 < i_8; i_9++) {
				ParamDefinitions.aNativeSprite_5339.method2752(i_1, i_5 + i_2 + i_9 * ParamDefinitions.aNativeSprite_5339.method2793());
				HeadbarIndexLoader.aNativeSprite_3452.method2752(i_3 + i_1 - HeadbarIndexLoader.aNativeSprite_3452.method2747(), i_5 + i_2 + i_9 * ParamDefinitions.aNativeSprite_5339.method2793());
			}
			Class125.aNativeSprite_1571.method2752(i_1, i_2 + i_4 - Class125.aNativeSprite_1571.method2793());
			Class149_Sub2.aNativeSprite_9315.method2752(i_3 + i_1 - Class125.aNativeSprite_1571.method2747(), i_2 + i_4 - Class125.aNativeSprite_1571.method2793());
		}
	}

	Class487() throws Throwable {
		throw new Error();
	}
}
