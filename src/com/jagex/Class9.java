package com.jagex;

public class Class9 {

    static BufferedConnectionContext CURRENT_CONNECTION_CONTEXT;
    static int lobbyStage;
    static boolean aBool74 = false;
    static boolean socialNetworkLogin = false;
    static int anInt76 = -1;
    static long aLong77 = -1L;
    static int loginStage = 2;
    static long aLong86 = 0L;
    static String aString99 = "";
    static String aString102 = "";
    static int anInt90 = 0;
    static int anInt104 = 0;
    public static int anInt72 = -2;
    public static int anInt106 = -2;
    public static int anInt107 = -2;
    public static int anInt108 = -1;
    public static int anInt109 = -1;
    public static int anInt103 = 0;
    public static int anInt94 = -1;
    public static int anInt112 = -1;
    public static int anInt113 = 0;
    static boolean aBool71 = false;

    Class9() throws Throwable {
        throw new Error();
    }

    public static String method450(CacheableNode_Sub7 class282_sub50_sub7_0) {
        if (!Class20.aBool161 && class282_sub50_sub7_0 != null) {
            int[] ints_2 = Class534_Sub1.method12815(class282_sub50_sub7_0, -1654060513);
            return ints_2 == null ? "" : Class15.method547(ints_2, 1877842979);
        } else {
            return "";
        }
    }

    public static void animateObject(int plane, int x, int y, int slot, int type, int rotation, int animationId) {
        if (x >= 0 && y >= 0 && x < IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1 && y < IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1 && IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
            SceneObject sceneobject_8;
            if (slot == 0) {
                sceneobject_8 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWall(plane, x, y, (byte) -24);
                SceneObject sceneobject_9 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWall2(plane, x, y);
                if (sceneobject_8 != null && type != 2) {
                    if (sceneobject_8 instanceof Wall) {
                        ((Wall) sceneobject_8).aClass123_10532.animate(animationId);
                    } else {
                        Class174.animateObject(plane, slot, x, y, sceneobject_8.getId(622402037), rotation, type, animationId, -724241554);
                    }
                }
                if (sceneobject_9 != null) {
                    if (sceneobject_9 instanceof Wall) {
                        ((Wall) sceneobject_9).aClass123_10532.animate(animationId);
                    } else {
                        Class174.animateObject(plane, slot, x, y, sceneobject_9.getId(-1155370235), rotation, type, animationId, -958170746);
                    }
                }
            } else if (slot == 1) {
                sceneobject_8 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWallDecoration(plane, x, y, (byte) 31);
                if (sceneobject_8 != null) {
                    if (sceneobject_8 instanceof WallDecoration) {
                        ((WallDecoration) sceneobject_8).aClass123_10501.animate(animationId);
                    } else {
                        int i_10 = sceneobject_8.getId(1811097056);
                        if (type != 4 && type != 5) {
                            if (type == 6) {
                                Class174.animateObject(plane, slot, x, y, i_10, rotation + 4, 4, animationId, -398135119);
                            } else if (type == 7) {
                                Class174.animateObject(plane, slot, x, y, i_10, (rotation + 2 & 0x3) + 4, 4, animationId, -578636810);
                            } else if (type == 8) {
                                Class174.animateObject(plane, slot, x, y, i_10, rotation + 4, 4, animationId, -1020779055);
                                Class174.animateObject(plane, slot, x, y, i_10, (rotation + 2 & 0x3) + 4, 4, animationId, -593163941);
                            }
                        } else {
                            Class174.animateObject(plane, slot, x, y, i_10, rotation, 4, animationId, -517311617);
                        }
                    }
                }
            } else if (slot == 2) {
                sceneobject_8 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getInteractableObject(plane, x, y, client.anInterface25_7446);
                if (sceneobject_8 != null) {
                    if (type == 11) {
                        type = 10;
                    }
                    if (sceneobject_8 instanceof InteractableObject) {
                        ((InteractableObject) sceneobject_8).aClass123_10509.animate(animationId);
                    } else {
                        Class174.animateObject(plane, slot, x, y, sceneobject_8.getId(-469540620), rotation, type, animationId, -283267512);
                    }
                }
            } else if (slot == 3) {
                sceneobject_8 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getGroundDecoration(plane, x, y);
                if (sceneobject_8 != null) {
                    if (sceneobject_8 instanceof GroundDecoration) {
                        ((GroundDecoration) sceneobject_8).aClass123_10507.animate(animationId);
                    } else {
                        Class174.animateObject(plane, slot, x, y, sceneobject_8.getId(554771962), rotation, type, animationId, -948532137);
                    }
                }
            }
        }
    }
}
