package com.jagex;

public class IFSubObjectPosition {

    public static boolean appletHasFocus;

    CoordGrid aClass219_7048;

    int anInt7047;

    int anInt7049;

    public IFSubObjectPosition(CoordGrid coordgrid_1, int i_2, int i_4) {
        aClass219_7048 = coordgrid_1;
        anInt7047 = i_2;
        anInt7049 = i_4;
    }

    static MapSize[] method11352() {
        return new MapSize[]{MapSize.aClass106_1072, MapSize.aClass106_1073, MapSize.aClass106_1070, MapSize.aClass106_1074, MapSize.aClass106_1075};
    }

    static Class204[] method11353() {
        return new Class204[]{Class204.aClass204_2578, Class204.aClass204_2579};
    }

    public static Class357 method11354(ByteBuf rsbytebuffer_0) {
        Class357 class357_2 = Class258.method4570(rsbytebuffer_0);
        int i_3 = rsbytebuffer_0.read24BitInteger();
        return new Class357_Sub1(class357_2.anInt4124, class357_2.aClass356_4121, class357_2.aClass353_4122, class357_2.anInt4123, class357_2.anInt4120, i_3);
    }

    int method11343() {
        return client.OBJECT_TYPE_SLOTS[anInt7047];
    }

    public Location method11344() {
        Location sceneobject_2 = method11348();
        return sceneobject_2 == null ? null : (sceneobject_2.getId() != anInt7049 ? null : sceneobject_2);
    }

    Location method11348() {
        int i_2 = aClass219_7048.plane;
        CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getBase();
        int i_4 = aClass219_7048.x - coordgrid_3.x;
        int i_5 = aClass219_7048.y - coordgrid_3.y;
        if (i_4 >= 0 && i_5 >= 0 && i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
            switch (method11343()) {
                case 0:
                    return (Location) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWall(i_2, i_4, i_5);
                case 1:
                    return (Location) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWallDecoration(i_2, i_4, i_5);
                case 2:
                    return (Location) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getInteractableObject(i_2, i_4, i_5, client.anInterface25_7446);
                case 3:
                    return (Location) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getGroundDecoration(i_2, i_4, i_5);
                default:
                    return null;
            }
        } else {
            return null;
        }
    }
}
