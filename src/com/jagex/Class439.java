package com.jagex;

public class Class439 {

    Class439() throws Throwable {
        throw new Error();
    }

    public static void method7343() {
        Component.aClass229_1280.method3858(50);
        Component.aClass229_1341.method3858(50);
        Component.aClass229_1303.method3858(50);
        Component.aClass229_1282.method3858(50);
    }

    static void routeToSceneObject(int x, int y, long data) {
        int type = (int) data >> 14 & 0x1f;
        int rotation = (int) data >> 20 & 0x3;
        int objectId = (int) (data >>> 32) & 0x7fffffff;
        ObjectType objType = (ObjectType) Class386.identify(ObjectType.values(), type);
        RouteStrategy strategy;
        switch(objType) {
        case SCENERY_INTERACT:
        case GROUND_INTERACT:
        case GROUND_DECORATION:
        	 ObjectDefinition defs = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(objectId);
             int width;
             int height;
             if (rotation != 0 && rotation != 2) {
                 width = defs.sizeY;
                 height = defs.sizeX;
             } else {
                 width = defs.sizeX;
                 height = defs.sizeY;
             }

             strategy = JS5CacheFile.method3354(x, y, width, height, ObjectType.WALL_STRAIGHT, 0);
        	break;
        default:
        	if (Class308.isWall(objType.type)) {
                strategy = JS5CacheFile.method3354(x, y, 0, 0, objType, rotation);
            } else {
                strategy = Class148.createNormalObjectStrategy(x, y, objType, rotation);
            }
        	break;
        }
        MapRegion.routeTo(x, y, true, strategy);
    }

}
