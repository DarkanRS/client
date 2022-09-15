package com.jagex;

public class Class174 {

	static int anInt2133;
	static int anInt2134;
	static boolean aBool2135;
	static int anInt2136;
	static int anInt2137;
	static Class356 aClass356_2139;
	static Class353 aClass353_2140;
	static SpriteDefinitions aClass91_2141;
	static SpriteDefinitions aClass91_2138;
	static SpriteDefinitions[] aClass91Array2132;

	static void animateObject(int plane, int slot, int x, int y, int objectId, int rotation, int type, int animId) {
		if (x >= 1 && y >= 1 && x <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 2 && y <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 2) {
			int i_9 = plane;
			if (plane < 3 && IndexLoaders.MAP_REGION_DECODER.getRenderFlags().isLowerObjectsToOverrideClipping(x, y))
				i_9 = plane + 1;
			if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
				IndexLoaders.MAP_REGION_DECODER.method4441().method12475(Renderers.CURRENT_RENDERER, plane, slot, x, y, IndexLoaders.MAP_REGION_DECODER.getClipMap(plane));
				if (objectId >= 0) {
					int i_10 = Class393.preferences.groundDecor.method12897();
					Class393.preferences.setValue(Class393.preferences.groundDecor, 1);
					IndexLoaders.MAP_REGION_DECODER.method4441().method12459(Renderers.CURRENT_RENDERER, i_9, plane, x, y, objectId, rotation, type, IndexLoaders.MAP_REGION_DECODER.getClipMap(plane), animId);
					Class393.preferences.setValue(Class393.preferences.groundDecor, i_10);
				}
			}
		}
	}

	static boolean method2954() {
		boolean bool_1 = true;
		if (aClass91_2141 == null)
			if (IndexLoaders.SPRITES_INDEX.loadFile(KeyHoldInputSubscriber.anInt2878))
				aClass91_2141 = SpriteDefinitions.method1515(IndexLoaders.SPRITES_INDEX, KeyHoldInputSubscriber.anInt2878);
			else
				bool_1 = false;
		if (aClass91_2138 == null)
			if (IndexLoaders.SPRITES_INDEX.loadFile(Queue.anInt5630))
				aClass91_2138 = SpriteDefinitions.method1515(IndexLoaders.SPRITES_INDEX, Queue.anInt5630);
			else
				bool_1 = false;
		if (QuestIndexLoader.aClass91_2981 == null)
			if (IndexLoaders.SPRITES_INDEX.loadFile(Class359.anInt4163))
				QuestIndexLoader.aClass91_2981 = SpriteDefinitions.method1515(IndexLoaders.SPRITES_INDEX, Class359.anInt4163);
			else
				bool_1 = false;
		if (Class197.aClass414_2436 == null)
			if (IndexLoaders.FONT_METRICS_INDEX.loadFile(anInt2137))
				Class197.aClass414_2436 = Class163.method2845(IndexLoaders.FONT_METRICS_INDEX, anInt2137);
			else
				bool_1 = false;
		if (aClass91Array2132 == null)
			if (IndexLoaders.SPRITES_INDEX.loadFile(anInt2137))
				aClass91Array2132 = SpriteDefinitions.method1534(IndexLoaders.SPRITES_INDEX, anInt2137);
			else
				bool_1 = false;
		return bool_1;
	}

	Class174() throws Throwable {
		throw new Error();
	}
}
