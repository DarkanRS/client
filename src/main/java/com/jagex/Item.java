package com.jagex;

public class Item extends Node {

    int id;
    int amount;
    int outlineSize;
    int shadowColor;
    int anInt7819;
    boolean hasPlayerAppearance;

    Item(int i_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        id = i_1;
        amount = i_2;
        outlineSize = i_3;
        shadowColor = i_4;
        anInt7819 = i_5;
        hasPlayerAppearance = bool_6;
    }

    static void method12574(AbstractRenderer graphicalrenderer_0, IComponentDefinitions icomponentdefinitions_1, int i_2, int i_3) {
        Class119 class119_5 = icomponentdefinitions_1.method2046(graphicalrenderer_0);
        if (class119_5 != null) {
            Class455 class455_6 = class119_5.aClass455_1456;
            graphicalrenderer_0.r(i_2, i_3, i_2 + icomponentdefinitions_1.width, i_3 + icomponentdefinitions_1.height);
            if (class119_5.anInt1458 != icomponentdefinitions_1.width || class119_5.anInt1454 != icomponentdefinitions_1.height) {
                throw new IllegalStateException("");
            }

            if (Class187.anInt2363 != 2 && Class187.anInt2363 != 5 && CursorDefintions.aNativeSprite_5004 != null) {
                CoordGrid coordgrid_7 = IndexLoaders.MAP_REGION_DECODER.getBase();
                int i_8;
                int i_9;
                int i_10;
                int i_11;
                if (NativeLibraryLoader.anInt3240 == 4) {
                    i_8 = client.anInt7262;
                    i_9 = client.anInt7376;
                    i_10 = (int) (-client.camAngleY) & 0x3fff;
                    i_11 = 4096;
                } else {
                    Vector3 vector3_22 = VertexNormal.MY_PLAYER.method11166().coords;
                    i_8 = (int) vector3_22.x;
                    i_9 = (int) vector3_22.z;
                    i_10 = (int) (-client.camAngleY) + client.anInt7255 & 0x3fff;
                    i_11 = 4096 - client.anInt7203 * 16;
                }

                int i_12 = i_8 / 128 + 48;
                int i_13 = 48 + IndexLoaders.MAP_REGION_DECODER.getSizeY() * 4 - i_9 / 128;
                CursorDefintions.aNativeSprite_5004.method2762(i_2 + icomponentdefinitions_1.width / 2.0F, i_3 + icomponentdefinitions_1.height / 2.0F, i_12, i_13, i_11, i_10 << 2, class455_6, i_2, i_3);
                StaticElements class283_14 = IndexLoaders.MAP_REGION_DECODER.method4528();

                int i_16;
                int i_17;
                int i_18;
                int i_19;
                int i_20;
                for (IntNode class282_sub38_15 = (IntNode) Class187.aClass482_2350.head(); class282_sub38_15 != null; class282_sub38_15 = (IntNode) Class187.aClass482_2350.next()) {
                    i_16 = class282_sub38_15.value;
                    i_17 = (class283_14.regionHashes[i_16] >> 14 & 0x3fff) - coordgrid_7.x;
                    i_18 = (class283_14.regionHashes[i_16] & 0x3fff) - coordgrid_7.y;
                    i_19 = i_17 * 4 + 2 - i_8 / 128;
                    i_20 = i_18 * 4 + 2 - i_9 / 128;
                    Class158.method2731(graphicalrenderer_0, class455_6, icomponentdefinitions_1, i_2, i_3, i_19, i_20, class283_14.areaIds[i_16]);
                }

                int i_21;
                for (i_21 = 0; i_21 < Class187.anInt2353; i_21++) {
                    i_16 = Class187.anIntArray2354[i_21] * 4 + 2 - i_8 / 128;
                    i_17 = Class187.anIntArray2355[i_21] * 4 + 2 - i_9 / 128;
                    ObjectDefinition objectdefinitions_23 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(Class187.anIntArray2357[i_21]);
                    if (objectdefinitions_23.transformTo != null) {
                        objectdefinitions_23 = objectdefinitions_23.getMultiLoc(Class158_Sub1.PLAYER_VAR_PROVIDER);
                        if (objectdefinitions_23 == null || objectdefinitions_23.mapIcon == -1) {
                            continue;
                        }
                    }

                    Class158.method2731(graphicalrenderer_0, class455_6, icomponentdefinitions_1, i_2, i_3, i_16, i_17, objectdefinitions_23.mapIcon);
                }

                for (Node_Sub29 class282_sub29_24 = (Node_Sub29) client.aClass465_7414.method7750(); class282_sub29_24 != null; class282_sub29_24 = (Node_Sub29) client.aClass465_7414.method7751()) {
                    i_16 = (int) (class282_sub29_24.pointer >> 28 & 0x3L);
                    if (i_16 == Class187.anInt2351) {
                        i_17 = (int) (class282_sub29_24.pointer & 0x3fffL) - coordgrid_7.x;
                        i_18 = (int) (class282_sub29_24.pointer >> 14 & 0x3fffL) - coordgrid_7.y;
                        i_19 = i_17 * 4 + 2 - i_8 / 128;
                        i_20 = i_18 * 4 + 2 - i_9 / 128;
                        Class190.method3149(icomponentdefinitions_1, class455_6, i_2, i_3, i_19, i_20, Class250.aNativeSpriteArray3092[0]);
                    }
                }

                Class469.method7805(graphicalrenderer_0, i_8, i_9, icomponentdefinitions_1, class455_6, i_2, i_3);
                Class82.method1457(i_8, i_9, icomponentdefinitions_1, class455_6, i_2, i_3);
                Class190.method3151(i_8, i_9, icomponentdefinitions_1, class119_5, i_2, i_3);
                if (NativeLibraryLoader.anInt3240 != 4) {
                    if (Class187.anInt2361 != 0) {
                        i_21 = Class187.anInt2361 * 4 + 2 - i_8 / 128 + (VertexNormal.MY_PLAYER.getSize() - 1) * 2;
                        i_16 = 2 + Class187.anInt2359 * 4 - i_9 / 128 + (VertexNormal.MY_PLAYER.getSize() - 1) * 2;
                        Class190.method3149(icomponentdefinitions_1, class455_6, i_2, i_3, i_21, i_16, Class16.aNativeSpriteArray145[Class187.aBool2360 ? 1 : 0]);
                    }

                    if (!VertexNormal.MY_PLAYER.hidden) {
                        graphicalrenderer_0.method8425(i_2 + icomponentdefinitions_1.width / 2 - 1, i_3 + icomponentdefinitions_1.height / 2 - 1, 3, 3, -1);
                    }
                }
            } else {
                graphicalrenderer_0.DA(class455_6, i_2, i_3);
            }
        }

    }

    public static void method12575(int i_0) {
        PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(10, i_0);
        class282_sub50_sub12_2.method14965();
    }

}
