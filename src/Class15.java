final class Class15 implements Interface35 {

    public Object method216(byte[] bytes_1, FontMetrics fontmetrics_2, boolean bool_3) {
        return Renderers.SOFTWARE_RENDERER.createFont(fontmetrics_2, SpriteDefinitions.decode(bytes_1), bool_3);
    }

    public Object method215(byte[] bytes_1, FontMetrics fontmetrics_2, boolean bool_3) {
        return Renderers.SOFTWARE_RENDERER.createFont(fontmetrics_2, SpriteDefinitions.decode(bytes_1), bool_3);
    }

    public Object method214(byte[] bytes_1, FontMetrics fontmetrics_2, boolean bool_3) {
        return Renderers.SOFTWARE_RENDERER.createFont(fontmetrics_2, SpriteDefinitions.decode(bytes_1), bool_3);
    }

    public static void method540(int i_0, byte b_1) {
        if (i_0 < 0 || i_0 > 2) {
            i_0 = 0;
        }
        Class235.anInt2906 = i_0;
        Queue.aClass539Array5632 = new ParticleSystem[Class89.anIntArray931[Class235.anInt2906] + 1];
        Class235.anInt2899 = 0;
        Class235.anInt2901 = 0;
    }

    static void method544(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, int i_3) {
        Class20.aClass118_183 = icomponentdefinitions_0;
        Class20.anInt195 = i_1;
        Class20.anInt179 = i_2;
    }

    static String method547(int[] ints_0, int i_1) {
        StringBuilder stringbuilder_2 = new StringBuilder();
        int i_3 = Class20.anInt186;
        for (int i_4 = 0; i_4 < ints_0.length; i_4++) {
            QuestDefinitions questdefinitions_5 = IndexLoaders.QUEST_LOADER.getQuest(ints_0[i_4]);
            if (questdefinitions_5.graphicId != -1) {
                NativeSprite nativesprite_6 = (NativeSprite) Class20.aClass229_191.get((long) questdefinitions_5.graphicId);
                if (nativesprite_6 == null) {
                    SpriteDefinitions class91_7 = SpriteDefinitions.getSprite(IndexLoaders.SPRITES_INDEX, questdefinitions_5.graphicId, 0);
                    if (class91_7 != null) {
                        nativesprite_6 = Renderers.SOFTWARE_RENDERER.method8444(class91_7, true);
                        Class20.aClass229_191.put(nativesprite_6, (long) questdefinitions_5.graphicId);
                    }
                }
                if (nativesprite_6 != null) {
                    Class115.aNativeSpriteArray1248[i_3] = nativesprite_6;
                    stringbuilder_2.append(" <img=").append(i_3).append(">");
                    ++i_3;
                }
            }
        }
        return stringbuilder_2.toString();
    }

    public static void method549(CS2HookEventType class397_0, int i_1, SceneObject sceneobject_3) {
        CS2Executor cs2executor_5 = CS2Executor.getNextScriptExecutor();
        cs2executor_5.currentSceneObject = sceneobject_3;
        CS2Executor.method1834(class397_0, i_1, -1, cs2executor_5, (byte) 23);
        cs2executor_5.currentSceneObject = null;
    }
}
