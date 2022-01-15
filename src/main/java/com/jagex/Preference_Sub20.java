package com.jagex;

public class Preference_Sub20 extends Preference {

    static int[] anIntArray7920;

    public Preference_Sub20(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
        Class15.method540(anInt5578);
    }

    public Preference_Sub20(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
        Class15.method540(anInt5578);
    }

    static short[][] method12805(float[][] floats_0, short[][] shorts_1) {
        for (int i_3 = 0; i_3 < floats_0.length; i_3++) {
            for (int i_4 = 0; i_4 < shorts_1[i_3].length; i_4++) {
                shorts_1[i_3][i_4] = (short) ((int) (16383.0F * floats_0[i_3][i_4]));
            }
        }
        return shorts_1;
    }

    public static void method12806(Index index_0) {
        Class165.anInt2035 = index_0.getArchiveId("headicons_pk");
        Class475.anInt5622 = index_0.getArchiveId("headicons_prayer");
        Class16.anInt135 = index_0.getArchiveId("hint_headicons");
        Class16.anInt142 = index_0.getArchiveId("hint_mapmarkers");
        Class16.anInt137 = index_0.getArchiveId("mapflag");
        BloomPreference.anInt7899 = index_0.getArchiveId("cross");
        Class13.anInt130 = index_0.getArchiveId("mapdots");
        Class16.anInt143 = index_0.getArchiveId("name_icons");
        GameTipsLoader.anInt4821 = index_0.getArchiveId("floorshadows");
        Class16.anInt141 = index_0.getArchiveId("compass");
        Class165.anInt2037 = index_0.getArchiveId("otherlevel");
        Class271.anInt3330 = index_0.getArchiveId("hint_mapedge");
    }

    public static void method12808() {
        if (Class302.aClass387Array3557 == null) {
            Class302.aClass387Array3557 = LoadingStage.method6676();
            IndexLoaders.LOADING_STAGE = Class302.aClass387Array3557[0];
            Class302.aLong3562 = Utils.time();
        }
        if (Comparable_Sub1.aClass306_3771 == null) {
            Class165.method2852();
        }
        LoadingStage xloadingstage_1 = IndexLoaders.LOADING_STAGE;
        int i_2 = IndexLoaders.initializeGame();
        if (xloadingstage_1 == IndexLoaders.LOADING_STAGE) {
            Class380.aString4636 = IndexLoaders.LOADING_STAGE.aClass433_4711.translate(Class223.CURRENT_LANGUAGE);
            if (IndexLoaders.LOADING_STAGE.aBool4718) {
                Class302.anInt3563 = i_2 * (IndexLoaders.LOADING_STAGE.anInt4703 - IndexLoaders.LOADING_STAGE.anInt4715) / 100 + IndexLoaders.LOADING_STAGE.anInt4715;
            }
            if (IndexLoaders.LOADING_STAGE.aBool4694) {
                Class380.aString4636 = Class380.aString4636 + Class302.anInt3563 + "%";
            }
        } else if (IndexLoaders.LOADING_STAGE == LoadingStage.aClass387_4701) {
            Comparable_Sub1.aClass306_3771 = null;
            GameState.setGameState(GameState.UNK_5);
        } else {
            Class380.aString4636 = xloadingstage_1.aClass433_4714.translate(Class223.CURRENT_LANGUAGE);
            if (IndexLoaders.LOADING_STAGE.aBool4694) {
                Class380.aString4636 = Class380.aString4636 + xloadingstage_1.anInt4703 + "%";
            }
            Class302.anInt3563 = xloadingstage_1.anInt4703;
            if (IndexLoaders.LOADING_STAGE.aBool4718 || xloadingstage_1.aBool4718) {
                Class302.aLong3562 = Utils.time();
            }
        }
        if (Comparable_Sub1.aClass306_3771 != null) {
            Comparable_Sub1.aClass306_3771.method5422(Class302.aLong3562, Class380.aString4636, Class302.anInt3563, IndexLoaders.LOADING_STAGE);
            if (Class302.anInterface27Array3559 != null) {
                for (int i_3 = Class302.anInt3560 + 1; i_3 < Class302.anInterface27Array3559.length; i_3++) {
                    if (Class302.anInterface27Array3559[i_3].method191() >= 100 && i_3 - 1 == Class302.anInt3560 && client.GAME_STATE != GameState.UNK_4 && Comparable_Sub1.aClass306_3771.method5450()) {
                        try {
                            Class302.anInterface27Array3559[i_3].method161();
                        } catch (Exception exception_5) {
                            Class302.anInterface27Array3559 = null;
                            break;
                        }
                        Comparable_Sub1.aClass306_3771.method5445(Class302.anInterface27Array3559[i_3]);
                        ++Class302.anInt3560;
                        if (Class302.anInt3560 >= Class302.anInterface27Array3559.length - 1 && Class302.anInterface27Array3559.length > 1) {
                            Class302.anInt3560 = EntityNode_Sub7.GAME_TIPS_LOADER.method6790() ? 0 : -1;
                        }
                    }
                }
            }
        }
    }

    int method7787() {
        return manager.getProcessorSpecs().getMaxMemory() < 245 ? 0 : 2;
    }

    public void method12793() {
        if (manager.getProcessorSpecs().getMaxMemory() < 245) {
            anInt5578 = 0;
        }
        if (anInt5578 < 0 || anInt5578 > 2) {
            anInt5578 = getDefaultValue();
        }
    }

    @Override
    int getDefaultValue() {
        return manager.getProcessorSpecs().getMaxMemory() < 245 ? 0 : 2;
    }

    public int method12794() {
        return anInt5578;
    }

    @Override
    public int checkValid(int i_1) {
        return manager.getProcessorSpecs().getMaxMemory() < 245 ? 3 : 1;
    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
        Class15.method540(anInt5578);
    }

    void method7780(int i_1) {
        anInt5578 = -754033619 * i_1 * -859024475;
        Class15.method540(anInt5578 * -754033619 * -859024475);
    }

    int method7786() {
        return manager.getProcessorSpecs().getMaxMemory() < 245 ? 0 : 2;
    }

    public boolean method12797() {
        return manager.getProcessorSpecs().getMaxMemory() >= 245;
    }

    public int method7784() {
        return manager.getProcessorSpecs().getMaxMemory() < 245 ? 3 : 1;
    }
}
