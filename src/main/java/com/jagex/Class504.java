package com.jagex;

public abstract class Class504 {

    public static int PLAYER_DOB;

    Class504() throws Throwable {
        throw new Error();
    }

    public static int getTerrainHeightAtPos(int i_0, int i_1, int i_2) {
        if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() == null) {
            return 0;
        } else {
            int i_4 = i_0 >> 9;
            int i_5 = i_1 >> 9;
            if (i_4 >= 0 && i_5 >= 0 && i_4 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1 && i_5 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1) {
                int i_6 = i_2;
                if (i_2 < 3 && (IndexLoaders.MAP_REGION_DECODER.getRenderFlags().tileMasks[1][i_4][i_5] & 0x2) != 0) {
                    i_6 = i_2 + 1;
                }
                return IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aGroundArray2591[i_6].averageHeight(i_0, i_1);
            } else {
                return 0;
            }
        }
    }
}
