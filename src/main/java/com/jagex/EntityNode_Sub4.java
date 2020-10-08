package com.jagex;

public class EntityNode_Sub4 extends EntityNode {

    int anInt7838 = (int) (Utils.time() / 1000L);
    String aString7837;
    short aShort7839;

    EntityNode_Sub4(String string_1, int i_2) {
        aString7837 = string_1;
        aShort7839 = (short) i_2;
    }

    static void method12585(Node_Sub31 class282_sub31_0) {
        SceneObjectManager sceneobjectmanager_2 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
        if (sceneobjectmanager_2 != null) {
            WorldObject sceneobject_3 = null;
            if (class282_sub31_0.anInt7766 == 0) {
                sceneobject_3 = (WorldObject) sceneobjectmanager_2.getWall(class282_sub31_0.anInt7764, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763);
            }
            if (class282_sub31_0.anInt7766 == 1) {
                sceneobject_3 = (WorldObject) sceneobjectmanager_2.getWallDecoration(class282_sub31_0.anInt7764, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763);
            }
            if (class282_sub31_0.anInt7766 == 2) {
                sceneobject_3 = (WorldObject) sceneobjectmanager_2.getInteractableObject(class282_sub31_0.anInt7764, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, client.anInterface25_7446);
            }
            if (class282_sub31_0.anInt7766 == 3) {
                sceneobject_3 = (WorldObject) sceneobjectmanager_2.getGroundDecoration(class282_sub31_0.anInt7764, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763);
            }
            if (sceneobject_3 != null) {
                class282_sub31_0.anInt7765 = sceneobject_3.getId();
                class282_sub31_0.anInt7770 = sceneobject_3.method89();
                class282_sub31_0.anInt7767 = sceneobject_3.method92();
            } else {
                class282_sub31_0.anInt7765 = -1;
                class282_sub31_0.anInt7770 = 0;
                class282_sub31_0.anInt7767 = 0;
            }
        }
    }
}
