package com.jagex;

public class Class439 {

    Class439() throws Throwable {
        throw new Error();
    }

    public static void method7343() {
        IComponentDefinitions.aClass229_1280.method3858(50);
        IComponentDefinitions.aClass229_1341.method3858(50);
        IComponentDefinitions.aClass229_1303.method3858(50);
        IComponentDefinitions.aClass229_1282.method3858(50);
    }

    static void routeToSceneObject(int x, int y, long data) {
        int type = (int) data >> 14 & 0x1f;
        int rotation = (int) data >> 20 & 0x3;
        int objectId = (int) (data >>> 32) & 0x7fffffff;
        ObjectType objType = (ObjectType) Class386.identify(ObjectType.values(), type);
        RouteStrategy strategy;
        switch(objType) {
        case SCENERY_INTERACT: //10
        case GROUND_INTERACT: //11
        case GROUND_DECORATION: //22
        	 ObjectDefinition defs = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(objectId);
             int sizeX;
             int sizeY;
             if (rotation != 0 && rotation != 2) {
                 sizeX = defs.sizeY;
                 sizeY = defs.sizeX;
             } else {
                 sizeX = defs.sizeX;
                 sizeY = defs.sizeY;
             }
             strategy = JS5CacheFile.createWallObjectStrategy(x, y, sizeX, sizeY, ObjectType.WALL_STRAIGHT, 0);
        	break;
        default:
        	if (Class308.isWall(objType.id)) {
                strategy = JS5CacheFile.createWallObjectStrategy(x, y, 0, 0, objType, rotation);
            } else {
                strategy = Class148.createNormalObjectStrategy(x, y, objType, rotation);
            }
        	break;
        }
        MapRegion.routeTo(x, y, true, strategy);
    }

}
