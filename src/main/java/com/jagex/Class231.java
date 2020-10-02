package com.jagex;

public class Class231 {

    public static String aString2876;

    byte aByte2863;

    byte aByte2865;

    int[] anIntArray2859;

    int[] anIntArray2871;

    int[] anIntArray2864;

    short aShort2866;

    short aShort2867;

    short aShort2868;

    short aShort2869;

    short[] aShortArray2873;

    short[] aShortArray2862;

    short[] aShortArray2875;

    Class231(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15) {
        aByte2863 = (byte) i_2;
        aByte2865 = (byte) i_3;
        anIntArray2859 = new int[4];
        anIntArray2871 = new int[4];
        anIntArray2864 = new int[4];
        anIntArray2859[0] = i_4;
        anIntArray2859[1] = i_5;
        anIntArray2859[2] = i_6;
        anIntArray2859[3] = i_7;
        anIntArray2871[0] = i_8;
        anIntArray2871[1] = i_9;
        anIntArray2871[2] = i_10;
        anIntArray2871[3] = i_11;
        anIntArray2864[0] = i_12;
        anIntArray2864[1] = i_13;
        anIntArray2864[2] = i_14;
        anIntArray2864[3] = i_15;
        aShort2866 = (short) (i_4 >> sceneobjectmanager_1.anInt2592);
        aShort2867 = (short) (i_6 >> sceneobjectmanager_1.anInt2592);
        aShort2868 = (short) (i_12 >> sceneobjectmanager_1.anInt2592);
        aShort2869 = (short) (i_14 >> sceneobjectmanager_1.anInt2592);
        aShortArray2873 = new short[4];
        aShortArray2862 = new short[4];
        aShortArray2875 = new short[4];
    }

    static void method3914(int i_0, String string_1, boolean bool_2) {
        Class28.method772();
        ParamDefinitions.method7323();
        Class250.method4297();
        Node_Sub17_Sub1.method15402(i_0, string_1, bool_2);
        Class487.aClass378_5752.method6433();
        Class487.aClass378_5752.method6403(client.anInterface35_7206);
        Node_Sub11_Sub3.method15476();
        Class188.method3139(Renderers.CURRENT_RENDERER, IndexLoaders.SPRITES_INDEX);
        Class76.method1361();
        Class122.method2109(Class182.aNativeSpriteArray2261);
        Static.method6378();
        Class94.method1589();
        if (client.GAME_STATE == 5) {
            GameState.setGameState(11);
        } else if (client.GAME_STATE == 0) {
            GameState.setGameState(2);
        } else if (client.GAME_STATE == 7) {
            GameState.setGameState(6);
        } else if (client.GAME_STATE == 13) {
            GameState.setGameState(18);
        } else if (client.GAME_STATE != 15 && client.GAME_STATE != 1) {
            if (client.GAME_STATE == 3) {
                GameState.setGameState(9);
            }
        } else {
            Class386.method6673();
        }
    }
}
