package com.jagex;

import java.util.Calendar;

public class NormalObjectStrategy extends RouteStrategy {

    int anInt7971;
    LocShapes aClass458_7972;

    static void method13042(AbstractRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        SceneObjectManager sceneobjectmanager_9 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
        Location sceneobject_10 = (Location) sceneobjectmanager_9.getWall(i_1, i_2, i_3);
        LocType objectdefinitions_11;
        int i_12;
        int i_13;
        int i_14;
        if (sceneobject_10 != null) {
            objectdefinitions_11 = IndexLoaders.MAP_REGION_DECODER.method4436().getLocType(sceneobject_10.getId());
            i_12 = sceneobject_10.method92() & 0x3;
            i_13 = sceneobject_10.method89();
            if (objectdefinitions_11.mapSpriteId != -1) {
                VarcDefinitions.method6997(graphicalrenderer_0, objectdefinitions_11, i_12, i_4, i_5);
            } else {
                i_14 = i_6;
                if (objectdefinitions_11.interactable > 0) {
                    i_14 = i_7;
                }
                if (i_13 == LocShapes.WALL_STRAIGHT.type || i_13 == LocShapes.WALL_WHOLE_CORNER.type) {
                    if (i_12 == 0) {
                        graphicalrenderer_0.method8428(i_4, i_5, 4, i_14);
                    } else if (i_12 == 1) {
                        graphicalrenderer_0.method8659(i_4, i_5, 4, i_14);
                    } else if (i_12 == 2) {
                        graphicalrenderer_0.method8428(i_4 + 3, i_5, 4, i_14);
                    } else if (i_12 == 3) {
                        graphicalrenderer_0.method8659(i_4, i_5 + 3, 4, i_14);
                    }
                }
                if (i_13 == LocShapes.WALL_STRAIGHT_CORNER.type) {
                    if (i_12 == 0) {
                        graphicalrenderer_0.method8425(i_4, i_5, 1, 1, i_14);
                    } else if (i_12 == 1) {
                        graphicalrenderer_0.method8425(i_4 + 3, i_5, 1, 1, i_14);
                    } else if (i_12 == 2) {
                        graphicalrenderer_0.method8425(i_4 + 3, i_5 + 3, 1, 1, i_14);
                    } else if (i_12 == 3) {
                        graphicalrenderer_0.method8425(i_4, i_5 + 3, 1, 1, i_14);
                    }
                }
                if (i_13 == LocShapes.WALL_WHOLE_CORNER.type) {
                    if (i_12 == 0) {
                        graphicalrenderer_0.method8659(i_4, i_5, 4, i_14);
                    } else if (i_12 == 1) {
                        graphicalrenderer_0.method8428(i_4 + 3, i_5, 4, i_14);
                    } else if (i_12 == 2) {
                        graphicalrenderer_0.method8659(i_4, i_5 + 3, 4, i_14);
                    } else if (i_12 == 3) {
                        graphicalrenderer_0.method8428(i_4, i_5, 4, i_14);
                    }
                }
            }
        }
        sceneobject_10 = (Location) sceneobjectmanager_9.getInteractableObject(i_1, i_2, i_3, client.anInterface25_7446);
        if (sceneobject_10 != null) {
            objectdefinitions_11 = IndexLoaders.MAP_REGION_DECODER.method4436().getLocType(sceneobject_10.getId());
            i_12 = sceneobject_10.method92() & 0x3;
            i_13 = sceneobject_10.method89();
            if (objectdefinitions_11.mapSpriteId != -1) {
                VarcDefinitions.method6997(graphicalrenderer_0, objectdefinitions_11, i_12, i_4, i_5);
            } else if (i_13 == LocShapes.WALL_INTERACT.type) {
                i_14 = -1118482;
                if (objectdefinitions_11.interactable > 0) {
                    i_14 = -1179648;
                }
                if (i_12 != 0 && i_12 != 2) {
                    graphicalrenderer_0.method8429(i_4, i_5, i_4 + 3, i_5 + 3, i_14);
                } else {
                    graphicalrenderer_0.method8429(i_4, i_5 + 3, i_4 + 3, i_5, i_14);
                }
            }
        }
        sceneobject_10 = (Location) sceneobjectmanager_9.getGroundDecoration(i_1, i_2, i_3);
        if (sceneobject_10 != null) {
            objectdefinitions_11 = IndexLoaders.MAP_REGION_DECODER.method4436().getLocType(sceneobject_10.getId());
            i_12 = sceneobject_10.method92() & 0x3;
            if (objectdefinitions_11.mapSpriteId != -1) {
                VarcDefinitions.method6997(graphicalrenderer_0, objectdefinitions_11, i_12, i_4, i_5);
            }
        }
    }

    static void resetContainer(int key, boolean negativeKey) {
        ItemContainer container = ItemContainer.getContainer(key, negativeKey);
        if (container != null) {
            for (int i_4 = 0; i_4 < container.itemIds.length; i_4++) {
                container.itemIds[i_4] = -1;
                container.amounts[i_4] = 0;
            }
        }
    }

    public static String method13045(long long_0, int i_2) {
        Class155.method2634(long_0);
        int i_4 = Class407.aCalendar4848.get(Calendar.DATE);
        int i_5 = Class407.aCalendar4848.get(Calendar.MONTH);
        int i_6 = Class407.aCalendar4848.get(Calendar.YEAR);
        return i_2 == 3 ? CutsceneEntityMovement.method1578(long_0) : Integer.toString(i_4 / 10) + i_4 % 10 + "-" + Class407.aStringArrayArray4849[i_2][i_5] + "-" + i_6;
    }

    public static void method13047(int[] ints_0, int[] ints_1, int i_2, int i_3) {
        if (i_2 < i_3) {
            int i_5 = (i_3 + i_2) / 2;
            int i_6 = i_2;
            int i_7 = ints_0[i_5];
            ints_0[i_5] = ints_0[i_3];
            ints_0[i_3] = i_7;
            int i_8 = ints_1[i_5];
            ints_1[i_5] = ints_1[i_3];
            ints_1[i_3] = i_8;
            int i_9 = i_7 == Integer.MAX_VALUE ? 0 : 1;
            for (int i_10 = i_2; i_10 < i_3; i_10++) {
                if (ints_0[i_10] < (i_10 & i_9) + i_7) {
                    int i_11 = ints_0[i_10];
                    ints_0[i_10] = ints_0[i_6];
                    ints_0[i_6] = i_11;
                    int i_12 = ints_1[i_10];
                    ints_1[i_10] = ints_1[i_6];
                    ints_1[i_6++] = i_12;
                }
            }
            ints_0[i_3] = ints_0[i_6];
            ints_0[i_6] = i_7;
            ints_1[i_3] = ints_1[i_6];
            ints_1[i_6] = i_8;
            method13047(ints_0, ints_1, i_2, i_6 - 1);
            method13047(ints_0, ints_1, i_6 + 1, i_3);
        }
    }

    @Override
    public boolean canExit(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
        return clipmap_4.method5986(i_2, i_3, i_1, approxDestinationX, approxDestinationY, aClass458_7972.getValue(), anInt7971);
    }
}
