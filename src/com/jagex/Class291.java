package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;

public class Class291 {

    public static float aFloat3462;
    public static float aFloat3468;
    public static int anInt3472;
    public static int anInt3473;
    public static CacheableNode_Sub6 aCacheableNode_Sub6_3491;
    protected static byte[][][] aByteArrayArrayArray3464;
    protected static int anInt3469;
    protected static Class283 aClass283_3470;
    protected static int xLength;
    protected static int yLength;
    protected static int anInt3454 = (int) (Math.random() * 11.0D) - 5;
    protected static int anInt3463 = (int) (Math.random() * 17.0D) - 8;
    protected static NodeCollection aClass482_3459 = new NodeCollection();
    protected static Index MAP_AREA_INDEX;
    protected static LocationIndexLoader OBJECT_LOADER;
    protected static MapAreaIndexLoader MAP_AREA_LOADER;
    protected static MapSpriteIndexLoader MAP_SPRITE_LOADER;
    protected static VarProvider PLAYER_VAR_PROVIDER;
    protected static int anInt3485;
    protected static int anInt3486;
    protected static int anInt3480;
    protected static int anInt3465;
    protected static int anInt3489;
    protected static int anInt3490;
    protected static int anInt3476;
    protected static int anInt3492;
    static IterableNodeMap aClass465_3461 = new IterableNodeMap(16);
    static int[] anIntArray3466 = new int[1];
    static byte[] aByteArray3467 = new byte[1];
    static OverlayIndexLoader OVERLAY_LOADER;
    static UnderlayIndexLoader UNDERLAY_LOADER;
    static byte[] underlayData;
    static byte[] aByteArray3453;
    static byte[] aByteArray3487;
    static Object[] anObjectArray3488;
    static byte[] aByteArray3475;
    static ArrayList[][][] anArrayListArrayArrayArray3484;
    static int[] anIntArray3481;
    static byte[] rgbColors;
    static short[] aShortArray3479;

    Class291() throws Throwable {
        throw new Error();
    }

    public static void method5125(Index index_0, OverlayIndexLoader class536_1, UnderlayIndexLoader underlayindexloader_2, LocationIndexLoader objectindexloader_3, MapAreaIndexLoader worldmapindexloader_4, MapSpriteIndexLoader class427_5, VarProvider interface42_6) {
        MAP_AREA_INDEX = index_0;
        OVERLAY_LOADER = class536_1;
        UNDERLAY_LOADER = underlayindexloader_2;
        OBJECT_LOADER = objectindexloader_3;
        MAP_AREA_LOADER = worldmapindexloader_4;
        MAP_SPRITE_LOADER = class427_5;
        PLAYER_VAR_PROVIDER = interface42_6;
        aClass465_3461.method7749();
        int i_7 = MAP_AREA_INDEX.getArchiveId("details");
        int[] ints_8 = MAP_AREA_INDEX.getValidFileIds(i_7);
        if (ints_8 != null) {
            for (int i_9 = 0; i_9 < ints_8.length; i_9++) {
                CacheableNode_Sub6 class282_sub50_sub6_10 = Class52.method1087(MAP_AREA_INDEX, i_7, ints_8[i_9]);
                aClass465_3461.put(class282_sub50_sub6_10, class282_sub50_sub6_10.anInt9536);
            }
        }

        SunDefinitions.method854(true, false);
    }

    static void method5126() {
        underlayData = new byte[xLength * yLength];
        aByteArray3453 = new byte[xLength * yLength];
        aByteArray3487 = new byte[xLength * yLength];
        anObjectArray3488 = new Object[xLength * yLength];
        aByteArray3475 = new byte[xLength * yLength];
        anArrayListArrayArrayArray3484 = new ArrayList[3][xLength >> 6][yLength >> 6];
        anIntArray3481 = new int[OVERLAY_LOADER.anInt7094 + 1];
    }

    public static Queue method5127(int i_0, int i_1) {
        Queue class477_2 = new Queue();

        for (CacheableNode_Sub6 class282_sub50_sub6_3 = (CacheableNode_Sub6) aClass465_3461.method7750(); class282_sub50_sub6_3 != null; class282_sub50_sub6_3 = (CacheableNode_Sub6) aClass465_3461.method7751()) {
            if (class282_sub50_sub6_3.aBool9543 && class282_sub50_sub6_3.method14784(i_0, i_1)) {
                class477_2.method7936(class282_sub50_sub6_3);
            }
        }

        return class477_2;
    }

    static void method5128(int i_0) {
        aCacheableNode_Sub6_3491 = (CacheableNode_Sub6) aClass465_3461.get(i_0);
    }

    public static CacheableNode_Sub6 method5130(int i_0) {
        return (CacheableNode_Sub6) aClass465_3461.get(i_0);
    }

    static void renderMap(AbstractRenderer graphicalrenderer_0, int i_1, int i_2) {
        int i_5 = anInt3480 - anInt3485;
        int i_6 = anInt3486 - anInt3465;
        if (anInt3480 < xLength) {
            ++i_5;
        }

        if (anInt3486 < yLength) {
            ++i_6;
        }

        int i_7;
        int i_8;
        int i_9;
        int i_10;
        int i_11;
        int i_12;
        int i_13;
        int i_14;
        int i_15;
        int i_16;
        int i_19;
        for (i_7 = 0; i_7 < i_5; i_7++) {
            i_8 = (i_7 * i_1 >> 16) + anInt3489;
            i_9 = ((i_7 + 1) * i_1 >> 16) + anInt3489;
            i_10 = i_9 - i_8;
            if (i_10 > 0) {
                i_11 = i_7 + anInt3485;
                if (i_11 >= 0 && i_11 < xLength) {
                    for (i_12 = 0; i_12 < i_6; i_12++) {
                        i_13 = anInt3492 - (i_2 * (i_12 + 1) >> 16);
                        i_14 = anInt3492 - (i_12 * i_2 >> 16);
                        i_15 = i_14 - i_13;
                        if (i_15 > 0) {
                            i_16 = i_12 + anInt3465;
                            int i_17 = i_11 + i_16 * xLength;
                            int i_18 = 0;
                            i_19 = 0;
                            Object object_20 = null;
                            if (i_16 >= 0 && i_16 < yLength) {
                                i_18 = (rgbColors[i_17] & 0xff) << 16 | aShortArray3479[i_17] & 0xffff;
                                if (i_18 != 0) {
                                    i_18 |= -16777216;
                                }

                                i_19 = aByteArray3453[i_17] & 0xff;
                                object_20 = anObjectArray3488[i_17];
                            }

                            if (i_18 == 0 && i_19 == 0 && object_20 == null) {
                                if (aCacheableNode_Sub6_3491.anInt9538 != -1) {
                                    i_18 = -16777216 | aCacheableNode_Sub6_3491.anInt9538;
                                } else if ((i_7 + anInt3485 & 0x4) != (i_12 + anInt3486 & 0x4)) {
                                    i_18 = -11840664;
                                } else {
                                    i_18 = anIntArray3481[OVERLAY_LOADER.anInt7093 + 1];
                                }

                                if (i_18 == 0) {
                                    i_18 = -16777216;
                                }

                                graphicalrenderer_0.B(i_8, i_13, i_10, i_15, i_18, 0);
                            } else if (object_20 != null) {
                                if (object_20 instanceof Node_Sub49) {
                                    Node_Sub49 class282_sub49_29 = (Node_Sub49) object_20;
                                    if (class282_sub49_29 != null) {
                                        renderUnderlay(graphicalrenderer_0, i_8, i_13, i_10, i_15, i_18, i_19, aByteArray3487[i_17], class282_sub49_29.anIntArray8109, class282_sub49_29.aByteArray8108, true);
                                    }
                                } else {
                                    Integer integer_33 = (Integer) object_20;
                                    anIntArray3466[0] = integer_33.intValue();
                                    aByteArray3467[0] = aByteArray3475[i_17];
                                    renderUnderlay(graphicalrenderer_0, i_8, i_13, i_10, i_15, i_18, i_19, aByteArray3487[i_17], anIntArray3466, aByteArray3467, true);
                                }
                            } else {
                                renderUnderlay(graphicalrenderer_0, i_8, i_13, i_10, i_15, i_18, i_19, aByteArray3487[i_17], null, null, true);
                            }
                        }
                    }
                } else {
                    for (i_12 = 0; i_12 < i_6; i_12++) {
                        i_13 = anInt3492 - (i_2 * (i_12 + 1) >> 16);
                        i_14 = anInt3492 - (i_12 * i_2 >> 16);
                        i_15 = i_14 - i_13;
                        if (aCacheableNode_Sub6_3491.anInt9538 != -1) {
                            i_16 = -16777216 | aCacheableNode_Sub6_3491.anInt9538;
                        } else if ((i_7 + anInt3485 & 0x4) != (i_12 + anInt3486 & 0x4)) {
                            i_16 = -11840664;
                        } else {
                            i_16 = anIntArray3481[OVERLAY_LOADER.anInt7093 + 1];
                        }

                        if (i_16 == 0) {
                            i_16 = -16777216;
                        }

                        graphicalrenderer_0.B(i_8, i_13, i_10, i_15, i_16, 0);
                    }
                }
            }
        }

        for (i_7 = -16; i_7 < i_5 + 16; i_7++) {
            i_8 = (i_7 * i_1 >> 16) + anInt3489;
            i_9 = ((i_7 + 1) * i_1 >> 16) + anInt3489;
            i_10 = i_9 - i_8;
            if (i_10 > 0) {
                i_11 = i_7 + anInt3485;
                if (i_11 >= 0 && i_11 < xLength) {
                    for (i_12 = -16; i_12 < i_6 + 16; i_12++) {
                        i_13 = anInt3492 - (i_2 * (i_12 + 1) >> 16);
                        i_14 = anInt3492 - (i_12 * i_2 >> 16);
                        i_15 = i_14 - i_13;
                        if (i_15 > 0) {
                            i_16 = i_12 + anInt3465;
                            if (i_16 >= 0 && i_16 < yLength) {
                                Object object_26 = anObjectArray3488[i_11 + i_16 * xLength];
                                if (object_26 != null) {
                                    if (object_26 instanceof Node_Sub49) {
                                        Node_Sub49 class282_sub49_27 = (Node_Sub49) object_26;
                                        if (class282_sub49_27 != null) {
                                            renderObjectSprites(graphicalrenderer_0, i_8, i_13, i_10, i_15, class282_sub49_27.anIntArray8109, class282_sub49_27.aByteArray8108);
                                        }
                                    } else {
                                        Integer integer_31 = (Integer) object_26;
                                        anIntArray3466[0] = integer_31.intValue();
                                        aByteArray3467[0] = aByteArray3475[i_11 + i_16 * xLength];
                                        renderObjectSprites(graphicalrenderer_0, i_8, i_13, i_10, i_15, anIntArray3466, aByteArray3467);
                                    }
                                } else {
                                    renderObjectSprites(graphicalrenderer_0, i_8, i_13, i_10, i_15, null, null);
                                }
                            }
                        }
                    }
                }
            }
        }

        i_7 = anInt3485 >> 6;
        i_8 = anInt3465 >> 6;
        if (i_7 < 0) {
            i_7 = 0;
        }

        if (i_8 < 0) {
            i_8 = 0;
        }

        i_9 = anInt3480 >> 6;
        i_10 = anInt3486 >> 6;
        if (i_9 >= anArrayListArrayArrayArray3484[0].length) {
            i_9 = anArrayListArrayArrayArray3484[0].length - 1;
        }

        if (i_10 >= anArrayListArrayArrayArray3484[0][0].length) {
            i_10 = anArrayListArrayArrayArray3484[0][0].length - 1;
        }

        for (i_11 = 0; i_11 < 3; i_11++) {
            int i_21;
            int i_22;
            int i_23;
            int i_24;
            ArrayList arraylist_25;
            int i_28;
            Iterator iterator_30;
            Class269 class269_32;
            for (i_12 = i_7; i_12 <= i_9; i_12++) {
                for (i_13 = i_8; i_13 <= i_10; i_13++) {
                    arraylist_25 = anArrayListArrayArrayArray3484[i_11][i_12][i_13];
                    if (arraylist_25 != null) {
                        i_15 = ((anInt3472 >> 6) + i_12) * 64;
                        i_16 = ((anInt3473 >> 6) + i_13) * 64;
                        iterator_30 = arraylist_25.iterator();

                        while (iterator_30.hasNext()) {
                            class269_32 = (Class269) iterator_30.next();
                            i_19 = i_15 + class269_32.aByte3311 - anInt3472 - anInt3485;
                            i_28 = i_16 + class269_32.aByte3309 - anInt3473 - anInt3465;
                            i_21 = (i_19 * i_1 >> 16) + anInt3489;
                            i_22 = ((i_19 + 1) * i_1 >> 16) + anInt3489;
                            i_23 = anInt3492 - (i_2 * (i_28 + 1) >> 16);
                            i_24 = anInt3492 - (i_28 * i_2 >> 16);
                            renderUnderlay(graphicalrenderer_0, i_21, i_23, i_22 - i_21, i_24 - i_23, class269_32.anInt3310, class269_32.aByte3308 & 0xff, class269_32.aByte3312, class269_32.anIntArray3313, class269_32.aByteArray3314, false);
                        }
                    }
                }
            }

            for (i_12 = i_7; i_12 <= i_9; i_12++) {
                for (i_13 = i_8; i_13 <= i_10; i_13++) {
                    arraylist_25 = anArrayListArrayArrayArray3484[i_11][i_12][i_13];
                    if (arraylist_25 != null) {
                        i_15 = ((anInt3472 >> 6) + i_12) * 64;
                        i_16 = ((anInt3473 >> 6) + i_13) * 64;
                        iterator_30 = arraylist_25.iterator();

                        while (iterator_30.hasNext()) {
                            class269_32 = (Class269) iterator_30.next();
                            i_19 = i_15 + class269_32.aByte3311 - anInt3472 - anInt3485;
                            i_28 = i_16 + class269_32.aByte3309 - anInt3473 - anInt3465;
                            i_21 = (i_19 * i_1 >> 16) + anInt3489;
                            i_22 = ((i_19 + 1) * i_1 >> 16) + anInt3489;
                            i_23 = anInt3492 - (i_2 * (i_28 + 1) >> 16);
                            i_24 = anInt3492 - (i_28 * i_2 >> 16);
                            renderObjectSprites(graphicalrenderer_0, i_21, i_23, i_22 - i_21, i_24 - i_23, class269_32.anIntArray3313, class269_32.aByteArray3314);
                        }
                    }
                }
            }
        }

    }

    static void method5132(Interface22 interface22_0, int i_1, int i_2) {
        for (int i_3 = 0; i_3 < OVERLAY_LOADER.anInt7094; i_3++) {
            anIntArray3481[i_3 + 1] = method5164(interface22_0, i_3, i_1, i_2);
        }

    }

    static NodeCollection method5135() {
        int i_1 = anInt3480 - anInt3485;
        int i_2 = anInt3486 - anInt3465;
        int i_3 = (anInt3476 - anInt3489 << 16) / i_1;
        int i_4 = (anInt3492 - anInt3490 << 16) / i_2;
        return method5179(i_3, i_4);
    }

    static void method5136() {
        int i_0;
        int i_1;
        int i_13;
        for (i_0 = 0; i_0 < xLength; i_0++) {
            for (i_1 = 0; i_1 < yLength; i_1++) {
                Object object_2 = anObjectArray3488[i_0 + i_1 * xLength];
                if (object_2 != null) {
                    if (object_2 instanceof Node_Sub49) {
                        Node_Sub49 class282_sub49_14 = (Node_Sub49) object_2;
                        if (class282_sub49_14 != null) {
                            for (int i_4 = 0; i_4 < class282_sub49_14.anIntArray8109.length; i_4++) {
                                LocType objectdefinitions_12 = OBJECT_LOADER.getLocType(class282_sub49_14.anIntArray8109[i_4]);
                                i_13 = objectdefinitions_12.mapIcon;
                                if (objectdefinitions_12.transformTo != null) {
                                    objectdefinitions_12 = objectdefinitions_12.getMultiLoc(PLAYER_VAR_PROVIDER);
                                    if (objectdefinitions_12 != null) {
                                        i_13 = objectdefinitions_12.mapIcon;
                                    }
                                }

                                if (i_13 != -1) {
                                    Node_Sub36 class282_sub36_7 = new Node_Sub36(i_13);
                                    class282_sub36_7.anInt7987 = i_0;
                                    class282_sub36_7.anInt7993 = i_1;
                                    aClass482_3459.append(class282_sub36_7);
                                }
                            }
                        }
                    } else {
                        Integer integer_3 = (Integer) object_2;
                        LocType objectdefinitions_10 = OBJECT_LOADER.getLocType(integer_3.intValue());
                        int i_5 = objectdefinitions_10.mapIcon;
                        if (objectdefinitions_10.transformTo != null) {
                            objectdefinitions_10 = objectdefinitions_10.getMultiLoc(PLAYER_VAR_PROVIDER);
                            if (objectdefinitions_10 != null) {
                                i_5 = objectdefinitions_10.mapIcon;
                            }
                        }

                        if (i_5 != -1) {
                            Node_Sub36 class282_sub36_6 = new Node_Sub36(i_5);
                            class282_sub36_6.anInt7987 = i_0;
                            class282_sub36_6.anInt7993 = i_1;
                            aClass482_3459.append(class282_sub36_6);
                        }
                    }
                }
            }
        }

        for (i_0 = 0; i_0 < 3; i_0++) {
            for (i_1 = 0; i_1 < anArrayListArrayArrayArray3484[0].length; i_1++) {
                label90:
                for (int i_11 = 0; i_11 < anArrayListArrayArrayArray3484[0][0].length; i_11++) {
                    ArrayList arraylist_15 = anArrayListArrayArrayArray3484[i_0][i_1][i_11];
                    if (arraylist_15 != null) {
                        Iterator iterator_17 = arraylist_15.iterator();

                        while (true) {
                            Class269 class269_18;
                            do {
                                if (!iterator_17.hasNext()) {
                                    continue label90;
                                }

                                class269_18 = (Class269) iterator_17.next();
                            } while (class269_18.anIntArray3313 == null);

                            for (i_13 = 0; i_13 < class269_18.anIntArray3313.length; i_13++) {
                                LocType objectdefinitions_16 = OBJECT_LOADER.getLocType(class269_18.anIntArray3313[i_13]);
                                int i_8 = objectdefinitions_16.mapIcon;
                                if (objectdefinitions_16.transformTo != null) {
                                    objectdefinitions_16 = objectdefinitions_16.getMultiLoc(PLAYER_VAR_PROVIDER);
                                    if (objectdefinitions_16 != null) {
                                        i_8 = objectdefinitions_16.mapIcon;
                                    }
                                }

                                if (i_8 != -1) {
                                    Node_Sub36 class282_sub36_9 = new Node_Sub36(i_8);
                                    class282_sub36_9.anInt7987 = ((anInt3472 >> 6) + i_1) * 64 + class269_18.aByte3311 - anInt3472;
                                    class282_sub36_9.anInt7993 = ((anInt3473 >> 6) + i_11) * 64 + class269_18.aByte3309 - anInt3473;
                                    aClass482_3459.append(class282_sub36_9);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    static void method5137() {
        underlayData = null;
        rgbColors = null;
        aShortArray3479 = null;
        aByteArray3453 = null;
        aByteArray3487 = null;
        anObjectArray3488 = null;
        aByteArray3475 = null;
        anArrayListArrayArrayArray3484 = null;
        anIntArray3481 = null;
    }

    static void method5139(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        anInt3485 = i_0 - anInt3472;
        anInt3486 = i_1 - anInt3473;
        anInt3480 = i_2 - anInt3472;
        anInt3465 = i_3 - anInt3473;
        anInt3489 = i_4;
        anInt3490 = i_5;
        anInt3476 = i_6;
        anInt3492 = i_7;
    }

    static void renderUnderlay(AbstractRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int[] ints_8, byte[] bytes_9, boolean bool_10) {
        int i_11;
        int i_12;
        if (bool_10 || i_5 != 0 || i_6 > 0) {
            if (i_6 == 0) {
                graphicalrenderer_0.B(i_1, i_2, i_3, i_4, i_5, 0);
            } else {
                i_11 = i_7 & 0x3f;
                if (i_11 != 0 && i_3 > 1 && i_4 > 1) {
                    i_12 = bool_10 ? 0 : 1;
                    LoadingStage.method6686(graphicalrenderer_0, aByteArrayArrayArray3464, anInt3469, i_1, i_2, i_5, anIntArray3481[i_6], i_3, i_4, i_11, i_7 >> 6 & 0x3, i_12);
                } else {
                    i_12 = anIntArray3481[i_6];
                    if (bool_10 || i_12 != 0) {
                        graphicalrenderer_0.B(i_1, i_2, i_3, i_4, i_12, 0);
                    }
                }
            }
        }

        if (ints_8 != null) {
            if (i_3 == 1) {
                i_11 = i_1;
            } else {
                i_11 = i_3 + i_1 - 1;
            }

            if (i_4 == 1) {
                i_12 = i_2;
            } else {
                i_12 = i_2 + i_4 - 1;
            }

            for (int i_13 = 0; i_13 < ints_8.length; i_13++) {
                int i_14 = bytes_9[i_13] & 0x3f;
                if (i_14 == LocShapes.WALL_STRAIGHT.type || i_14 == LocShapes.WALL_WHOLE_CORNER.type || i_14 == LocShapes.WALL_STRAIGHT_CORNER.type || i_14 == LocShapes.WALL_INTERACT.type) {
                    LocType objectdefinitions_15 = OBJECT_LOADER.getLocType(ints_8[i_13]);
                    if (objectdefinitions_15.mapSpriteId == -1) {
                        int i_16 = -3355444;
                        if (objectdefinitions_15.interactable == 1) {
                            i_16 = -3407872;
                        }

                        int i_17 = bytes_9[i_13] >> 6 & 0x3;
                        if (i_14 == LocShapes.WALL_STRAIGHT.type) {
                            if (i_17 == 0) {
                                graphicalrenderer_0.G(i_1, i_2, i_4, i_16, 0);
                            } else if (i_17 == 1) {
                                graphicalrenderer_0.XA(i_1, i_2, i_3, i_16, 0);
                            } else if (i_17 == 2) {
                                graphicalrenderer_0.G(i_11, i_2, i_4, i_16, 0);
                            } else {
                                graphicalrenderer_0.XA(i_1, i_12, i_3, i_16, 0);
                            }
                        } else if (i_14 == LocShapes.WALL_WHOLE_CORNER.type) {
                            if (i_17 == 0) {
                                graphicalrenderer_0.G(i_1, i_2, i_4, -1, 0);
                                graphicalrenderer_0.XA(i_1, i_2, i_3, i_16, 0);
                            } else if (i_17 == 1) {
                                graphicalrenderer_0.G(i_11, i_2, i_4, -1, 0);
                                graphicalrenderer_0.XA(i_1, i_2, i_3, i_16, 0);
                            } else if (i_17 == 2) {
                                graphicalrenderer_0.G(i_11, i_2, i_4, -1, 0);
                                graphicalrenderer_0.XA(i_1, i_12, i_3, i_16, 0);
                            } else {
                                graphicalrenderer_0.G(i_1, i_2, i_4, -1, 0);
                                graphicalrenderer_0.XA(i_1, i_12, i_3, i_16, 0);
                            }
                        } else if (i_14 == LocShapes.WALL_STRAIGHT_CORNER.type) {
                            if (i_17 == 0) {
                                graphicalrenderer_0.XA(i_1, i_2, 1, i_16, 0);
                            } else if (i_17 == 1) {
                                graphicalrenderer_0.XA(i_11, i_2, 1, i_16, 0);
                            } else if (i_17 == 2) {
                                graphicalrenderer_0.XA(i_11, i_12, 1, i_16, 0);
                            } else {
                                graphicalrenderer_0.XA(i_1, i_12, 1, i_16, 0);
                            }
                        } else if (i_14 == LocShapes.WALL_INTERACT.type) {
                            int i_18;
                            if (i_17 != 0 && i_17 != 2) {
                                for (i_18 = 0; i_18 < i_4; i_18++) {
                                    graphicalrenderer_0.XA(i_18 + i_1, i_18 + i_2, 1, i_16, 0);
                                }
                            } else {
                                for (i_18 = 0; i_18 < i_4; i_18++) {
                                    graphicalrenderer_0.XA(i_18 + i_1, i_12 - i_18, 1, i_16, 0);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    static void method5145() {
        int[] ints_0 = new int[3];

        for (int i_1 = 0; i_1 < aClass283_3470.anInt3382; i_1++) {
            boolean bool_2 = aCacheableNode_Sub6_3491.method14778(aClass283_3470.anIntArray3381[i_1] >> 28 & 0x3, aClass283_3470.anIntArray3381[i_1] >> 14 & 0x3fff, aClass283_3470.anIntArray3381[i_1] & 0x3fff, ints_0);
            if (bool_2) {
                Node_Sub36 class282_sub36_3 = new Node_Sub36(aClass283_3470.anIntArray3383[i_1]);
                class282_sub36_3.anInt7987 = ints_0[1] - anInt3472;
                class282_sub36_3.anInt7993 = ints_0[2] - anInt3473;
                aClass482_3459.append(class282_sub36_3);
            }
        }

    }

    static void method5146(Node_Sub36 class282_sub36_1, int i_2, int i_3) {
        class282_sub36_1.anInt7990 = (i_2 * (class282_sub36_1.anInt7987 - anInt3485) >> 16) + anInt3489;
        class282_sub36_1.anInt7992 = anInt3492 - (i_3 * (class282_sub36_1.anInt7993 - anInt3465) >> 16);
    }

    static void method5147(AbstractRenderer graphicalrenderer_0, Node_Sub36 class282_sub36_1, MapAreaDefinitions worldmapareadefs_2) {
        if (worldmapareadefs_2.anIntArray2717 != null) {
            int[] ints_3 = new int[worldmapareadefs_2.anIntArray2717.length];

            int i_4;
            int i_5;
            int i_6;
            for (i_4 = 0; i_4 < ints_3.length / 2; i_4++) {
                i_5 = worldmapareadefs_2.anIntArray2717[i_4 * 2] + class282_sub36_1.anInt7987;
                i_6 = class282_sub36_1.anInt7993 + worldmapareadefs_2.anIntArray2717[i_4 * 2 + 1];
                ints_3[i_4 * 2] = anInt3489 + (anInt3476 - anInt3489) * (i_5 - anInt3485) / (anInt3480 - anInt3485);
                ints_3[i_4 * 2 + 1] = anInt3492 - (anInt3492 - anInt3490) * (i_6 - anInt3465) / (anInt3486 - anInt3465);
            }

            Class147.method2471(graphicalrenderer_0, ints_3, worldmapareadefs_2.anInt2715);
            if (worldmapareadefs_2.anInt2748 > 0) {
                int i_7;
                int i_8;
                int i_9;
                for (i_4 = 0; i_4 < ints_3.length / 2 - 1; i_4++) {
                    i_5 = ints_3[i_4 * 2];
                    i_6 = ints_3[i_4 * 2 + 1];
                    i_7 = ints_3[(i_4 + 1) * 2];
                    i_8 = ints_3[(i_4 + 1) * 2 + 1];
                    if (i_7 < i_5) {
                        i_9 = i_5;
                        int i_10 = i_6;
                        i_5 = i_7;
                        i_6 = i_8;
                        i_7 = i_9;
                        i_8 = i_10;
                    } else if (i_7 == i_5 && i_8 < i_6) {
                        i_9 = i_6;
                        i_6 = i_8;
                        i_8 = i_9;
                    }

                    graphicalrenderer_0.method8435(i_5, i_6, i_7, i_8, worldmapareadefs_2.anIntArray2738[worldmapareadefs_2.aByteArray2754[i_4] & 0xff], worldmapareadefs_2.anInt2748, worldmapareadefs_2.anInt2749, worldmapareadefs_2.anInt2756);
                }

                i_4 = ints_3[ints_3.length - 2];
                i_5 = ints_3[ints_3.length - 1];
                i_6 = ints_3[0];
                i_7 = ints_3[1];
                if (i_6 < i_4) {
                    i_8 = i_4;
                    i_9 = i_5;
                    i_4 = i_6;
                    i_5 = i_7;
                    i_6 = i_8;
                    i_7 = i_9;
                } else if (i_6 == i_4 && i_7 < i_5) {
                    i_8 = i_5;
                    i_5 = i_7;
                    i_7 = i_8;
                }

                graphicalrenderer_0.method8435(i_4, i_5, i_6, i_7, worldmapareadefs_2.anIntArray2738[worldmapareadefs_2.aByteArray2754[worldmapareadefs_2.aByteArray2754.length - 1] & 0xff], worldmapareadefs_2.anInt2748, worldmapareadefs_2.anInt2749, worldmapareadefs_2.anInt2756);
            } else {
                for (i_4 = 0; i_4 < ints_3.length / 2 - 1; i_4++) {
                    graphicalrenderer_0.method8429(ints_3[i_4 * 2], ints_3[i_4 * 2 + 1], ints_3[(i_4 + 1) * 2], ints_3[(i_4 + 1) * 2 + 1], worldmapareadefs_2.anIntArray2738[worldmapareadefs_2.aByteArray2754[i_4] & 0xff]);
                }

                graphicalrenderer_0.method8429(ints_3[ints_3.length - 2], ints_3[ints_3.length - 1], ints_3[0], ints_3[1], worldmapareadefs_2.anIntArray2738[worldmapareadefs_2.aByteArray2754[worldmapareadefs_2.aByteArray2754.length - 1] & 0xff]);
            }
        }

    }

    static void method5162(Packet rsbytebuffer_1, int i_2, int i_3, int i_4, int i_5, int[] ints_6, int[] ints_7) {
        int i_8 = rsbytebuffer_1.readUnsignedByte();
        if ((i_8 & 0x1) == 0) {
            boolean bool_9 = (i_8 & 0x2) == 0;
            int i_10 = i_8 >> 2 & 0x3f;
            if (i_10 != 62) {
                if (i_10 == 63) {
                    i_10 = rsbytebuffer_1.readUnsignedByte();
                } else if (bool_9) {
                    i_10 = ints_6[i_10];
                } else {
                    i_10 = ints_7[i_10];
                }

                if (bool_9) {
                    underlayData[i_5 * xLength + i_4] = (byte) i_10;
                    aByteArray3453[i_5 * xLength + i_4] = 0;
                } else {
                    aByteArray3453[i_5 * xLength + i_4] = (byte) i_10;
                    aByteArray3487[i_5 * xLength + i_4] = 0;
                    underlayData[i_5 * xLength + i_4] = rsbytebuffer_1.readByte();
                }
            }
        } else {
            int i_21 = (i_8 >> 1 & 0x3) + 1;
            boolean bool_22 = (i_8 & 0x8) != 0;
            boolean bool_11 = (i_8 & 0x10) != 0;

            for (int i_12 = 0; i_12 < i_21; i_12++) {
                int i_13 = rsbytebuffer_1.readUnsignedByte();
                int i_14 = 0;
                int i_15 = 0;
                if (bool_22) {
                    i_14 = rsbytebuffer_1.readUnsignedByte();
                    i_15 = rsbytebuffer_1.readUnsignedByte();
                }

                int i_16 = 0;
                if (bool_11) {
                    i_16 = rsbytebuffer_1.readUnsignedByte();
                }

                int[] ints_17;
                byte[] bytes_18;
                int i_19;
                if (i_12 == 0) {
                    underlayData[i_5 * xLength + i_4] = (byte) i_13;
                    aByteArray3453[i_5 * xLength + i_4] = (byte) i_14;
                    aByteArray3487[i_5 * xLength + i_4] = (byte) i_15;
                    if (i_16 == 1) {
                        anObjectArray3488[i_5 * xLength + i_4] = new Integer(rsbytebuffer_1.readBigSmart());
                        aByteArray3475[i_5 * xLength + i_4] = rsbytebuffer_1.readByte();
                    } else if (i_16 > 1) {
                        ints_17 = new int[i_16];
                        bytes_18 = new byte[i_16];

                        for (i_19 = 0; i_19 < i_16; i_19++) {
                            ints_17[i_19] = rsbytebuffer_1.readBigSmart();
                            bytes_18[i_19] = rsbytebuffer_1.readByte();
                        }

                        anObjectArray3488[i_5 * xLength + i_4] = new Node_Sub49(ints_17, bytes_18);
                    }
                } else {
                    ints_17 = null;
                    bytes_18 = null;
                    if (i_16 > 0) {
                        ints_17 = new int[i_16];
                        bytes_18 = new byte[i_16];

                        for (i_19 = 0; i_19 < i_16; i_19++) {
                            ints_17[i_19] = rsbytebuffer_1.readBigSmart();
                            bytes_18[i_19] = rsbytebuffer_1.readByte();
                        }
                    }

                    if (anArrayListArrayArrayArray3484[i_12 - 1][i_2 - (anInt3472 >> 6)][i_3 - (anInt3473 >> 6)] == null) {
                        anArrayListArrayArrayArray3484[i_12 - 1][i_2 - (anInt3472 >> 6)][i_3 - (anInt3473 >> 6)] = new ArrayList();
                    }

                    Class269 class269_20 = new Class269(i_4 & 0x3f, i_5 & 0x3f, i_13, i_14, i_15, ints_17, bytes_18);
                    anArrayListArrayArrayArray3484[i_12 - 1][i_2 - (anInt3472 >> 6)][i_3 - (anInt3473 >> 6)].add(class269_20);
                }
            }
        }

    }

    static int method5164(Interface22 interface22_0, int i_1, int i_2, int i_3) {
        OverlayDef overlaydef_4 = OVERLAY_LOADER.getOverlayDef(i_1);
        if (overlaydef_4 == null) {
            return 0;
        } else {
            int i_5 = overlaydef_4.texture;
            if (i_5 >= 0 && interface22_0.method144(i_5).isGroundMesh) {
                i_5 = -1;
            }

            int i_6;
            int i_7;
            int i_8;
            int i_9;
            if (overlaydef_4.secondaryRGB >= 0) {
                i_7 = overlaydef_4.secondaryRGB;
                i_8 = i_3 + (i_7 & 0x7f);
                if (i_8 < 0) {
                    i_8 = 0;
                } else if (i_8 > 127) {
                    i_8 = 127;
                }

                i_9 = i_8 + (i_7 + i_2 & 0xfc00) + (i_7 & 0x380);
                i_6 = -16777216 | Class335.anIntArray3916[Class372.method6362(QuestIndexLoader.method4162(i_9, 96)) & 0xffff];
            } else if (i_5 >= 0) {
                i_6 = -16777216 | Class335.anIntArray3916[Class372.method6362(QuestIndexLoader.method4162(interface22_0.method144(i_5).color, 96)) & 0xffff];
            } else if (overlaydef_4.primaryRGB == -1) {
                i_6 = 0;
            } else {
                i_7 = overlaydef_4.primaryRGB;
                i_8 = i_3 + (i_7 & 0x7f);
                if (i_8 < 0) {
                    i_8 = 0;
                } else if (i_8 > 127) {
                    i_8 = 127;
                }

                i_9 = i_8 + (i_7 + i_2 & 0xfc00) + (i_7 & 0x380);
                i_6 = -16777216 | Class335.anIntArray3916[Class372.method6362(QuestIndexLoader.method4162(i_9, 96)) & 0xffff];
            }

            return i_6;
        }
    }

    static void renderObjectSprites(AbstractRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int[] ints_5, byte[] bytes_6) {
        if (ints_5 != null) {
            for (int i_7 = 0; i_7 < ints_5.length; i_7++) {
                LocType objectdefinitions_8 = OBJECT_LOADER.getLocType(ints_5[i_7]);
                int i_9 = objectdefinitions_8.mapSpriteId;
                if (i_9 != -1) {
                    MapSpriteDefinitions class418_10 = MAP_SPRITE_LOADER.method7172(i_9);
                    NativeSprite nativesprite_11 = class418_10.method7010(graphicalrenderer_0, objectdefinitions_8.adjustMapSceneRotation ? bytes_6[i_7] >> 6 & 0x3 : 0, objectdefinitions_8.flipMapSprite && objectdefinitions_8.inverted);
                    if (nativesprite_11 != null) {
                        int i_12 = i_3 * nativesprite_11.scaleWidth() >> 2;
                        int i_13 = i_4 * nativesprite_11.method2748() >> 2;
                        if (class418_10.aBool4996) {
                            int i_14 = objectdefinitions_8.sizeX;
                            int i_15 = objectdefinitions_8.sizeY;
                            if ((bytes_6[i_7] >> 6 & 0x1) == 1) {
                                int i_16 = i_14;
                                i_14 = i_15;
                                i_15 = i_16;
                            }

                            i_12 = i_3 * i_14;
                            i_13 = i_15 * i_4;
                        }

                        if (i_12 != 0 && i_13 != 0) {
                            if (class418_10.anInt4997 != 0) {
                                nativesprite_11.method2754(i_1, i_4 + (i_2 - i_13), i_12, i_13, 0, -16777216 | class418_10.anInt4997, 1);
                            } else {
                                nativesprite_11.method2789(i_1, i_4 + (i_2 - i_13), i_12, i_13);
                            }
                        }
                    }
                }
            }
        }

    }

    public static CacheableNode_Sub6 method5175(int i_0, int i_1) {
        for (CacheableNode_Sub6 class282_sub50_sub6_2 = (CacheableNode_Sub6) aClass465_3461.method7750(); class282_sub50_sub6_2 != null; class282_sub50_sub6_2 = (CacheableNode_Sub6) aClass465_3461.method7751()) {
            if (class282_sub50_sub6_2.aBool9543 && class282_sub50_sub6_2.method14784(i_0, i_1)) {
                return class282_sub50_sub6_2;
            }
        }

        return null;
    }

    static NodeCollection method5179(int i_1, int i_2) {
        for (Node_Sub36 class282_sub36_5 = (Node_Sub36) aClass482_3459.head(); class282_sub36_5 != null; class282_sub36_5 = (Node_Sub36) aClass482_3459.next()) {
            method5146(class282_sub36_5, i_1, i_2);
        }

        return aClass482_3459;
    }

    static void renderMap(AbstractRenderer graphicalrenderer_0) {
        int i_1 = anInt3480 - anInt3485;
        int i_2 = anInt3486 - anInt3465;
        int i_3 = (anInt3476 - anInt3489 << 16) / i_1;
        int i_4 = (anInt3492 - anInt3490 << 16) / i_2;
        renderMap(graphicalrenderer_0, i_3, i_4);
    }

    static void method5183(int i_1, int i_2) {
        Packet rsbytebuffer_3 = new Packet(MAP_AREA_INDEX.getFileByName(aCacheableNode_Sub6_3491.aString9533, "area"));
        int i_4 = rsbytebuffer_3.readUnsignedByte();
        int[] ints_5 = new int[i_4];

        int i_6;
        for (i_6 = 0; i_6 < i_4; i_6++) {
            ints_5[i_6] = rsbytebuffer_3.readUnsignedByte();
        }

        i_6 = rsbytebuffer_3.readUnsignedByte();
        int[] ints_7 = new int[i_6];

        int i_8;
        for (i_8 = 0; i_8 < i_6; i_8++) {
            ints_7[i_8] = rsbytebuffer_3.readUnsignedByte();
        }

        while (true) {
            int i_9;
            int i_11;
            int i_12;
            while (rsbytebuffer_3.index < rsbytebuffer_3.buffer.length) {
                int i_13;
                int i_18;
                if (rsbytebuffer_3.readUnsignedByte() == 0) {
                    i_8 = rsbytebuffer_3.readUnsignedByte();
                    i_9 = rsbytebuffer_3.readUnsignedByte();

                    for (i_18 = 0; i_18 < 64; i_18++) {
                        for (i_11 = 0; i_11 < 64; i_11++) {
                            i_12 = i_8 * 64 + i_18 - anInt3472;
                            i_13 = i_9 * 64 + i_11 - anInt3473;
                            method5162(rsbytebuffer_3, i_8, i_9, i_12, i_13, ints_5, ints_7);
                        }
                    }
                } else {
                    i_8 = rsbytebuffer_3.readUnsignedByte();
                    i_9 = rsbytebuffer_3.readUnsignedByte();
                    i_18 = rsbytebuffer_3.readUnsignedByte();
                    i_11 = rsbytebuffer_3.readUnsignedByte();

                    for (i_12 = 0; i_12 < 8; i_12++) {
                        for (i_13 = 0; i_13 < 8; i_13++) {
                            int i_20 = i_8 * 64 + i_12 + i_18 * 8 - anInt3472;
                            int i_15 = i_9 * 64 + i_13 + i_11 * 8 - anInt3473;
                            method5162(rsbytebuffer_3, i_8, i_9, i_20, i_15, ints_5, ints_7);
                        }
                    }
                }
            }

            Object obj_17 = null;
            rgbColors = new byte[xLength * yLength];
            aShortArray3479 = new short[xLength * yLength];

            for (i_9 = 0; i_9 < 3; i_9++) {
                byte[] bytes_10 = new byte[xLength * yLength];

                Iterator iterator_14;
                ArrayList arraylist_19;
                Class269 class269_21;
                for (i_11 = 0; i_11 < anArrayListArrayArrayArray3484[i_9].length; i_11++) {
                    for (i_12 = 0; i_12 < anArrayListArrayArrayArray3484[i_9][0].length; i_12++) {
                        arraylist_19 = anArrayListArrayArrayArray3484[i_9][i_11][i_12];
                        if (arraylist_19 != null) {
                            for (iterator_14 = arraylist_19.iterator(); iterator_14.hasNext(); bytes_10[i_11 * 64 + class269_21.aByte3311 + (i_12 * 64 + class269_21.aByte3309) * xLength] = (byte) class269_21.anInt3310) {
                                class269_21 = (Class269) iterator_14.next();
                            }
                        }
                    }
                }

                decodeUnderlayColors(bytes_10, rgbColors, aShortArray3479, i_1, i_2);

                for (i_11 = 0; i_11 < anArrayListArrayArrayArray3484[i_9].length; i_11++) {
                    for (i_12 = 0; i_12 < anArrayListArrayArrayArray3484[i_9][0].length; i_12++) {
                        arraylist_19 = anArrayListArrayArrayArray3484[i_9][i_11][i_12];
                        if (arraylist_19 != null) {
                            iterator_14 = arraylist_19.iterator();

                            while (iterator_14.hasNext()) {
                                class269_21 = (Class269) iterator_14.next();
                                int i_16 = i_11 * 64 + class269_21.aByte3311 + (i_12 * 64 + class269_21.aByte3309) * xLength;
                                class269_21.anInt3310 = (rgbColors[i_16] & 0xff) << 16 | aShortArray3479[i_16] & 0xffff;
                                if (class269_21.anInt3310 != 0) {
                                    class269_21.anInt3310 |= -16777216;
                                }
                            }
                        }
                    }
                }
            }

            decodeUnderlayColors(underlayData, rgbColors, aShortArray3479, i_1, i_2);
            underlayData = null;
            method5136();
            return;
        }
    }

    static void decodeUnderlayColors(byte[] bytes_0, byte[] bytes_1, short[] shorts_2, int i_3, int i_4) {
        int[] ints_5 = new int[yLength];
        int[] ints_6 = new int[yLength];
        int[] ints_7 = new int[yLength];
        int[] ints_8 = new int[yLength];
        int[] ints_9 = new int[yLength];

        for (int i_10 = -5; i_10 < xLength; i_10++) {
            int i_11 = i_10 + 5;
            int i_12 = i_10 - 5;

            int i_13;
            int i_14;
            for (i_13 = 0; i_13 < yLength; i_13++) {
                UnderlayDef underlaydef_26;
                if (i_11 < xLength) {
                    i_14 = bytes_0[i_11 + i_13 * xLength] & 0xff;
                    if (i_14 > 0) {
                        underlaydef_26 = UNDERLAY_LOADER.getUnderlayDef(i_14 - 1);
                        ints_5[i_13] += underlaydef_26.r;
                        ints_6[i_13] += underlaydef_26.g;
                        ints_7[i_13] += underlaydef_26.b;
                        ints_8[i_13] += underlaydef_26.a;
                        ++ints_9[i_13];
                    }
                }

                if (i_12 >= 0) {
                    i_14 = bytes_0[i_12 + i_13 * xLength] & 0xff;
                    if (i_14 > 0) {
                        underlaydef_26 = UNDERLAY_LOADER.getUnderlayDef(i_14 - 1);
                        ints_5[i_13] -= underlaydef_26.r;
                        ints_6[i_13] -= underlaydef_26.g;
                        ints_7[i_13] -= underlaydef_26.b;
                        ints_8[i_13] -= underlaydef_26.a;
                        --ints_9[i_13];
                    }
                }
            }

            if (i_10 >= 0) {
                i_13 = 0;
                i_14 = 0;
                int i_15 = 0;
                int i_16 = 0;
                int i_17 = 0;

                for (int i_18 = -5; i_18 < yLength; i_18++) {
                    int i_19 = i_18 + 5;
                    if (i_19 < yLength) {
                        i_13 += ints_5[i_19];
                        i_14 += ints_6[i_19];
                        i_15 += ints_7[i_19];
                        i_16 += ints_8[i_19];
                        i_17 += ints_9[i_19];
                    }

                    int i_20 = i_18 - 5;
                    if (i_20 >= 0) {
                        i_13 -= ints_5[i_20];
                        i_14 -= ints_6[i_20];
                        i_15 -= ints_7[i_20];
                        i_16 -= ints_8[i_20];
                        i_17 -= ints_9[i_20];
                    }

                    if (i_18 >= 0 && i_17 > 0) {
                        int i_21;
                        if ((bytes_0[i_10 + i_18 * xLength] & 0xff) == 0) {
                            i_21 = i_10 + i_18 * xLength;
                            bytes_1[i_21] = 0;
                            shorts_2[i_21] = 0;
                        } else {
                            i_21 = i_16 == 0 ? 0 : Class371.method6348(i_13 * 256 / i_16, i_14 / i_17, i_15 / i_17);
                            int i_22 = (i_21 & 0x7f) + i_4;
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 127) {
                                i_22 = 127;
                            }

                            int i_23 = i_22 + (i_3 + i_21 & 0xfc00) + (i_21 & 0x380);
                            int i_24 = i_10 + i_18 * xLength;
                            int i_25 = Class335.anIntArray3916[Class372.method6362(PlaySoundJingleCutsceneAction.method14677(i_23, 96)) & 0xffff];
                            bytes_1[i_24] = (byte) (i_25 >> 16 & 0xff);
                            shorts_2[i_24] = (short) (i_25 & 0xffff);
                        }
                    }
                }
            }
        }

    }

}
