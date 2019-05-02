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

    Class174() throws Throwable {
        throw new Error();
    }

    static boolean method2954(int i_0) {
        boolean bool_1 = true;
        if (aClass91_2141 == null) {
            if (IndexLoaders.SPRITES_INDEX.loadFile(KeyHoldInputSubscriber.anInt2878)) {
                aClass91_2141 = SpriteDefinitions.method1515(IndexLoaders.SPRITES_INDEX, KeyHoldInputSubscriber.anInt2878);
            } else {
                bool_1 = false;
            }
        }
        if (aClass91_2138 == null) {
            if (IndexLoaders.SPRITES_INDEX.loadFile(Queue.anInt5630)) {
                aClass91_2138 = SpriteDefinitions.method1515(IndexLoaders.SPRITES_INDEX, Queue.anInt5630);
            } else {
                bool_1 = false;
            }
        }
        if (QuestIndexLoader.aClass91_2981 == null) {
            if (IndexLoaders.SPRITES_INDEX.loadFile(Class359.anInt4163)) {
                QuestIndexLoader.aClass91_2981 = SpriteDefinitions.method1515(IndexLoaders.SPRITES_INDEX, Class359.anInt4163);
            } else {
                bool_1 = false;
            }
        }
        if (Class197.aClass414_2436 == null) {
            if (IndexLoaders.FONT_METRICS_INDEX.loadFile(anInt2137)) {
                Class197.aClass414_2436 = Class163.method2845(IndexLoaders.FONT_METRICS_INDEX, anInt2137, (byte) 18);
            } else {
                bool_1 = false;
            }
        }
        if (aClass91Array2132 == null) {
            if (IndexLoaders.SPRITES_INDEX.loadFile(anInt2137)) {
                aClass91Array2132 = SpriteDefinitions.method1534(IndexLoaders.SPRITES_INDEX, anInt2137);
            } else {
                bool_1 = false;
            }
        }
        return bool_1;
    }

    static final void animateObject(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (i_2 >= 1 && i_3 >= 1 && i_2 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 2 && i_3 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 2) {
            int i_9 = i_0;
            if (i_0 < 3 && IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(i_2, i_3, 2056160372)) {
                i_9 = i_0 + 1;
            }
            if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
                IndexLoaders.MAP_REGION_DECODER.method4441().method12475(Renderers.SOFTWARE_RENDERER, i_0, i_1, i_2, i_3, IndexLoaders.MAP_REGION_DECODER.getClipMap(i_0));
                if (i_4 >= 0) {
                    int i_10 = Class393.preferences.aPreference_Sub23_8202.method12897((byte) 28);
                    Class393.preferences.setValue(Class393.preferences.aPreference_Sub23_8202, 1, -1662895154);
                    IndexLoaders.MAP_REGION_DECODER.method4441().method12459(Renderers.SOFTWARE_RENDERER, i_9, i_0, i_2, i_3, i_4, i_5, i_6, IndexLoaders.MAP_REGION_DECODER.getClipMap(i_0), i_7, -1045787010);
                    Class393.preferences.setValue(Class393.preferences.aPreference_Sub23_8202, i_10, -1533283163);
                }
            }
        }
    }
}
