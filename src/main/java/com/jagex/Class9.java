package com.jagex;

public class Class9 {

    public static int anInt72 = -2;
    public static int anInt106 = -2;
    public static int anInt107 = -2;
    public static int anInt108 = -1;
    public static int anInt109 = -1;
    public static int anInt103;
    public static int anInt94 = -1;
    public static int anInt112 = -1;
    public static int anInt113;
    static BufferedConnectionContext CURRENT_CONNECTION_CONTEXT;
    static int lobbyStage;
    static boolean aBool74;
    static boolean socialNetworkLogin;
    static int anInt76 = -1;
    static long aLong77 = -1L;
    static int loginStage = 2;
    static long aLong86;
    static String aString99 = "";
    static String aString102 = "";
    static int anInt90;
    static int anInt104;
    static boolean aBool71;

    Class9() throws Throwable {
        throw new Error();
    }

    public static String method450(CacheableNode_Sub7 class282_sub50_sub7_0) {
        if (!Class20.aBool161 && class282_sub50_sub7_0 != null) {
            int[] ints_2 = Class534_Sub1.method12815(class282_sub50_sub7_0);
            return ints_2 == null ? "" : Class15.method547(ints_2);
        } else {
            return "";
        }
    }

    public static void animateObject(int plane, int x, int y, int slot, int type, int rotation, int animationId) {
        int type1 = type;
        if (x >= 0 && y >= 0 && x < IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1 && y < IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1 && IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
            WorldObject sceneobject_8;
            if (slot == 0) {
                sceneobject_8 = (WorldObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWall(plane, x, y);
                WorldObject sceneobject_9 = (WorldObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWall2(plane, x, y);
                if (sceneobject_8 != null && type1 != 2) {
                    if (sceneobject_8 instanceof Wall) {
                        ((Wall) sceneobject_8).aClass123_10532.animate(animationId);
                    } else {
                        Class174.animateObject(plane, 0, x, y, sceneobject_8.getId(), rotation, type1, animationId);
                    }
                }
                if (sceneobject_9 != null) {
                    if (sceneobject_9 instanceof Wall) {
                        ((Wall) sceneobject_9).aClass123_10532.animate(animationId);
                    } else {
                        Class174.animateObject(plane, slot, x, y, sceneobject_9.getId(), rotation, type1, animationId);
                    }
                }
            } else if (slot == 1) {
                sceneobject_8 = (WorldObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWallDecoration(plane, x, y);
                if (sceneobject_8 != null) {
                    if (sceneobject_8 instanceof WallDecoration) {
                        ((WallDecoration) sceneobject_8).aClass123_10501.animate(animationId);
                    } else {
                        int i_10 = sceneobject_8.getId();
                        if (type1 != 4 && type1 != 5) {
                            if (type1 == 6) {
                                Class174.animateObject(plane, 1, x, y, i_10, rotation + 4, 4, animationId);
                            } else if (type1 == 7) {
                                Class174.animateObject(plane, slot, x, y, i_10, (rotation + 2 & 0x3) + 4, 4, animationId);
                            } else if (type1 == 8) {
                                Class174.animateObject(plane, slot, x, y, i_10, rotation + 4, 4, animationId);
                                Class174.animateObject(plane, slot, x, y, i_10, (rotation + 2 & 0x3) + 4, 4, animationId);
                            }
                        } else {
                            Class174.animateObject(plane, slot, x, y, i_10, rotation, 4, animationId);
                        }
                    }
                }
            } else if (slot == 2) {
                sceneobject_8 = (WorldObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getInteractableObject(plane, x, y, client.anInterface25_7446);
                if (sceneobject_8 != null) {
                    if (type1 == 11) {
                        type1 = 10;
                    }
                    if (sceneobject_8 instanceof InteractableObject) {
                        ((InteractableObject) sceneobject_8).aClass123_10509.animate(animationId);
                    } else {
                        Class174.animateObject(plane, 2, x, y, sceneobject_8.getId(), rotation, type1, animationId);
                    }
                }
            } else if (slot == 3) {
                sceneobject_8 = (WorldObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getGroundDecoration(plane, x, y);
                if (sceneobject_8 != null) {
                    if (sceneobject_8 instanceof GroundDecoration) {
                        ((GroundDecoration) sceneobject_8).aClass123_10507.animate(animationId);
                    } else {
                        Class174.animateObject(plane, 3, x, y, sceneobject_8.getId(), rotation, type1, animationId);
                    }
                }
            }
        }
    }
}
