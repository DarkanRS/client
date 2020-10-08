package com.jagex;

import java.util.Iterator;

public class SceneObjectManager {

    public static boolean aBool2644 = true;

    public Class293[][][] aClass293ArrayArrayArray2604;

    public Ground[] aGroundArray2591;

    public int anInt2601;
    public int anInt2592;
    public int sizeX;
    public int sizeY;
    public Class201 aClass201_2600;
    public Class293[][][] aClass293ArrayArrayArray2610;
    public Ground[] aGroundArray2607;
    public Class293[][][] waterRelatedClassArray1;
    public Ground[] aGroundArray2614;
    public Login aClass284_2648;
    int anInt2616;
    int anInt2615;
    int anInt2623;
    int anInt2624;
    int anInt2609;
    boolean aBool2599;
    int anInt2628;
    int anInt2629;
    int anInt2630;
    int anInt2650;
    int anInt2632;
    int anInt2637;
    int anInt2602;
    int anInt2621;
    int anInt2636;
    int anInt2638;
    int anInt2640;
    boolean[][] aBoolArrayArray2631;
    boolean[][] aBoolArrayArray2635;
    boolean[][] aBoolArrayArray2651;
    int anInt2618 = 5015;
    int anInt2619 = 5040;
    int anInt2622 = 16;
    int anInt2634 = 10072;
    int anInt2643 = 1;
    float[] aFloatArray2639;
    Node_Sub24[] aNode_Sub24Array2642;
    AbstractRenderer aAbstractRenderer_2596;
    boolean aBool2598;
    int anInt2593;
    int anInt2594;
    int anInt2652;
    Class454 aClass454_2597;
    int[][] colors;
    byte[][] intensities;
    short[][] scales;
    byte[][] waterRelatedArray4;
    byte[][] waterRelatedArray5;
    byte[][] waterRelatedArray6;
    long[][][] aLongArrayArrayArray2645;
    Class287[] aClass287Array2646;
    boolean[] aBoolArray2647;
    GraphNode_Sub1[] aTransform_Sub1Array2605;
    GraphNode_Sub1[] aTransform_Sub1Array2633;
    GraphNode_Sub1[] aTransform_Sub1Array2649;
    GraphNode_Sub1[] aTransform_Sub1Array2626;
    GraphNode_Sub1[] aTransform_Sub1Array2625;
    GraphNode_Sub1_Sub1[] aTransform_Sub1_Sub1Array2627;
    int[] anIntArray2641;

    public SceneObjectManager(AbstractRenderer renderer, int sizeX, int sizeY, int i_6, boolean highDetailWater, boolean bool_8) {
        anInt2634 = 10072;
        anInt2618 = 5015;
        anInt2619 = 5040;
        aFloatArray2639 = new float[3];
        aNode_Sub24Array2642 = new Node_Sub24[8];
        anInt2643 = 1;
        aAbstractRenderer_2596 = renderer;
        aBool2598 = aAbstractRenderer_2596.method8463() > 0;
        anInt2592 = 9;
        anInt2593 = 1 << anInt2592;
        anInt2594 = anInt2593 >> 1;
        anInt2601 = 4;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        anInt2652 = i_6;
        aClass454_2597 = new Class454();
        aClass201_2600 = new Class201(this);
        aClass293ArrayArrayArray2610 = new Class293[4][sizeX][sizeY];
        aGroundArray2607 = new Ground[4];
        if (highDetailWater) {
            colors = new int[sizeX][sizeY];
            intensities = new byte[sizeX][sizeY];
            scales = new short[sizeX][sizeY];
            waterRelatedArray4 = new byte[sizeX][sizeY];
            waterRelatedArray5 = new byte[sizeX][sizeY];
            waterRelatedArray6 = new byte[sizeX][sizeY];
            waterRelatedClassArray1 = new Class293[1][sizeX][sizeY];
            aGroundArray2614 = new Ground[1];
        }
        if (bool_8) {
            aLongArrayArrayArray2645 = new long[4][sizeX][sizeY];
            aClass287Array2646 = new Class287[65361];
            aBoolArray2647 = new boolean[65361];
            anInt2615 = 0;
        }
        method3380(false);
        aTransform_Sub1Array2605 = new GraphNode_Sub1[2];
        aTransform_Sub1Array2633 = new GraphNode_Sub1[2];
        aTransform_Sub1Array2649 = new GraphNode_Sub1[2];
        aTransform_Sub1Array2626 = new GraphNode_Sub1[10072];
        anInt2623 = 0;
        aTransform_Sub1Array2625 = new GraphNode_Sub1[5015];
        anInt2624 = 0;
        aTransform_Sub1_Sub1Array2627 = new GraphNode_Sub1_Sub1[5040];
        anInt2616 = 0;
        aBoolArrayArray2651 = new boolean[anInt2652 + anInt2652 + 1][anInt2652 + anInt2652 + 1];
        aBoolArrayArray2635 = new boolean[anInt2652 + anInt2652 + 2][anInt2652 + anInt2652 + 2];
        anIntArray2641 = new int[anInt2652 + anInt2652 + 2];
        aClass284_2648 = new Login();
    }

    public void method3378() {
    }

    public void method3379() {
    }

    public void method3380(boolean bool_1) {
        if (bool_1) {
            aClass293ArrayArrayArray2604 = waterRelatedClassArray1;
            aGroundArray2591 = aGroundArray2614;
        } else {
            aClass293ArrayArrayArray2604 = aClass293ArrayArrayArray2610;
            aGroundArray2591 = aGroundArray2607;
        }
        anInt2601 = aClass293ArrayArrayArray2604.length;
    }

    public GraphNode_Sub1_Sub5 getWall(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aTransform_Sub1_Sub5_3505;
    }

    public void method3382(int i_1, int i_2) {
        Class293 class293_4 = aClass293ArrayArrayArray2604[0][i_1][i_2];
        for (int i_5 = 0; i_5 < 3; i_5++) {
            Class293 class293_6 = aClass293ArrayArrayArray2604[i_5][i_1][i_2] = aClass293ArrayArrayArray2604[i_5 + 1][i_1][i_2];
            if (class293_6 != null) {
                for (Class208 class208_7 = class293_6.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                    GraphNode_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aTransform_Sub1_Sub1_2659;
                    if (class521_sub1_sub1_8.aShort9458 == i_1 && i_2 == class521_sub1_sub1_8.aShort9456) {
                        class521_sub1_sub1_8.plane -= 1;
                    }
                }
                if (class293_6.aTransform_Sub1_Sub3_3499 != null) {
                    class293_6.aTransform_Sub1_Sub3_3499.plane -= 1;
                }
                if (class293_6.aTransform_Sub1_Sub5_3505 != null) {
                    class293_6.aTransform_Sub1_Sub5_3505.plane -= 1;
                }
                if (class293_6.aTransform_Sub1_Sub5_3502 != null) {
                    class293_6.aTransform_Sub1_Sub5_3502.plane -= 1;
                }
                if (class293_6.aTransform_Sub1_Sub4_3503 != null) {
                    class293_6.aTransform_Sub1_Sub4_3503.plane -= 1;
                }
                if (class293_6.aTransform_Sub1_Sub4_3500 != null) {
                    class293_6.aTransform_Sub1_Sub4_3500.plane -= 1;
                }
            }
        }
        if (aClass293ArrayArrayArray2604[0][i_1][i_2] == null) {
            aClass293ArrayArrayArray2604[0][i_1][i_2] = new Class293(0);
            aClass293ArrayArrayArray2604[0][i_1][i_2].aByte3507 = 1;
        }
        aClass293ArrayArrayArray2604[0][i_1][i_2].aClass293_3509 = class293_4;
        aClass293ArrayArrayArray2604[3][i_1][i_2] = null;
    }

    public void method3384(int i_1, int i_2, int i_3) {
        boolean bool_5 = aClass293ArrayArrayArray2604[0][i_2][i_3] != null && aClass293ArrayArrayArray2604[0][i_2][i_3].aClass293_3509 != null;
        for (int i_6 = i_1; i_6 >= 0; --i_6) {
            if (aClass293ArrayArrayArray2604[i_6][i_2][i_3] == null) {
                Class293 class293_7 = aClass293ArrayArrayArray2604[i_6][i_2][i_3] = new Class293(i_6);
                if (bool_5) {
                    ++class293_7.aByte3507;
                }
            }
        }
    }

    public void method3385(int i_1, Ground class390_2) {
        aGroundArray2591[i_1] = class390_2;
    }

    public int getScale(int i_1, int i_2) {
        return scales != null ? scales[i_1][i_2] & 0xffff : 0;
    }

    public int getColor(int i_1, int i_2) {
        return colors != null ? colors[i_1][i_2] & 0xffffff : 0;
    }

    public int method3391(int i_1, int i_2) {
        return waterRelatedArray6 != null ? waterRelatedArray6[i_1][i_2] & 0xff : 0;
    }

    public void setTileData(int x, int y, int waterColor, int waterScale, int waterIntensity, int i_6, int i_7, int i_8) {
        if (colors != null) {
            colors[x][y] = -16777216 | waterColor;
        }
        if (scales != null) {
            scales[x][y] = (short) waterScale;
        }
        if (intensities != null) {
            intensities[x][y] = (byte) waterIntensity;
        }
        if (waterRelatedArray4 != null) {
            waterRelatedArray4[x][y] = (byte) i_6;
        }
        if (waterRelatedArray5 != null) {
            waterRelatedArray5[x][y] = (byte) i_7;
        }
        if (waterRelatedArray6 != null) {
            waterRelatedArray6[x][y] = (byte) i_8;
        }
    }

    public void method3393(int i_1, int i_2, int i_3, SceneObjectNode sceneobjectnode_4) {
        Class293 class293_6 = method3459(i_1, i_2, i_3);
        if (class293_6 != null) {
            class293_6.aTransform_Sub1_Sub3_3499 = sceneobjectnode_4;
            int i_7 = aGroundArray2591 == aGroundArray2614 ? 1 : 0;
            if (sceneobjectnode_4.method12986()) {
                if (sceneobjectnode_4.method12987()) {
                    sceneobjectnode_4.aTransform_Sub1_7966 = aTransform_Sub1Array2633[i_7];
                    aTransform_Sub1Array2633[i_7] = sceneobjectnode_4;
                } else {
                    sceneobjectnode_4.aTransform_Sub1_7966 = aTransform_Sub1Array2605[i_7];
                    aTransform_Sub1Array2605[i_7] = sceneobjectnode_4;
                }
            } else {
                sceneobjectnode_4.aTransform_Sub1_7966 = aTransform_Sub1Array2649[i_7];
                aTransform_Sub1Array2649[i_7] = sceneobjectnode_4;
            }
        }
    }

    public void method3394(int i_1, int i_2, int i_3, int i_4, GraphNode_Sub1_Sub2 class521_sub1_sub2_5) {
        Class293 class293_7 = method3459(i_1, i_2, i_3);
        if (class293_7 != null) {
            class521_sub1_sub2_5.method11171(new Vector3(((i_2 << anInt2592) + anInt2594), i_4, ((i_3 << anInt2592) + anInt2594)));
            class293_7.aTransform_Sub1_Sub2_3506 = class521_sub1_sub2_5;
            int i_8 = aGroundArray2614 == aGroundArray2591 ? 1 : 0;
            if (class521_sub1_sub2_5.method12986()) {
                if (class521_sub1_sub2_5.method12987()) {
                    class521_sub1_sub2_5.aTransform_Sub1_7966 = aTransform_Sub1Array2633[i_8];
                    aTransform_Sub1Array2633[i_8] = class521_sub1_sub2_5;
                } else {
                    class521_sub1_sub2_5.aTransform_Sub1_7966 = aTransform_Sub1Array2605[i_8];
                    aTransform_Sub1Array2605[i_8] = class521_sub1_sub2_5;
                }
            } else {
                class521_sub1_sub2_5.aTransform_Sub1_7966 = aTransform_Sub1Array2649[i_8];
                aTransform_Sub1Array2649[i_8] = class521_sub1_sub2_5;
            }
        }
    }

    public void method3395(int i_1, int i_2, int i_3, GraphNode_Sub1_Sub5 class521_sub1_sub5_4, GraphNode_Sub1_Sub5 class521_sub1_sub5_5) {
        Class293 class293_7 = method3459(i_1, i_2, i_3);
        if (class293_7 != null) {
            class293_7.aTransform_Sub1_Sub5_3505 = class521_sub1_sub5_4;
            class293_7.aTransform_Sub1_Sub5_3502 = class521_sub1_sub5_5;
            int i_8 = aGroundArray2614 == aGroundArray2591 ? 1 : 0;
            if (class521_sub1_sub5_4.method12986()) {
                if (class521_sub1_sub5_4.method12987()) {
                    class521_sub1_sub5_4.aTransform_Sub1_7966 = aTransform_Sub1Array2633[i_8];
                    aTransform_Sub1Array2633[i_8] = class521_sub1_sub5_4;
                } else {
                    class521_sub1_sub5_4.aTransform_Sub1_7966 = aTransform_Sub1Array2605[i_8];
                    aTransform_Sub1Array2605[i_8] = class521_sub1_sub5_4;
                }
            } else {
                class521_sub1_sub5_4.aTransform_Sub1_7966 = aTransform_Sub1Array2649[i_8];
                aTransform_Sub1Array2649[i_8] = class521_sub1_sub5_4;
            }
            if (class521_sub1_sub5_5 != null) {
                if (class521_sub1_sub5_5.method12986()) {
                    if (class521_sub1_sub5_5.method12987()) {
                        class521_sub1_sub5_5.aTransform_Sub1_7966 = aTransform_Sub1Array2633[i_8];
                        aTransform_Sub1Array2633[i_8] = class521_sub1_sub5_5;
                    } else {
                        class521_sub1_sub5_5.aTransform_Sub1_7966 = aTransform_Sub1Array2605[i_8];
                        aTransform_Sub1Array2605[i_8] = class521_sub1_sub5_5;
                    }
                } else {
                    class521_sub1_sub5_5.aTransform_Sub1_7966 = aTransform_Sub1Array2649[i_8];
                    aTransform_Sub1Array2649[i_8] = class521_sub1_sub5_5;
                }
            }
        }
    }

    public void method3396(int i_1, int i_2, int i_3, GraphNode_Sub1_Sub4 class521_sub1_sub4_4, GraphNode_Sub1_Sub4 class521_sub1_sub4_5) {
        Class293 class293_7 = method3459(i_1, i_2, i_3);
        if (class293_7 != null) {
            class293_7.aTransform_Sub1_Sub4_3503 = class521_sub1_sub4_4;
            class293_7.aTransform_Sub1_Sub4_3500 = class521_sub1_sub4_5;
            int i_8 = aGroundArray2614 == aGroundArray2591 ? 1 : 0;
            if (class521_sub1_sub4_4.method12986()) {
                if (class521_sub1_sub4_4.method12987()) {
                    class521_sub1_sub4_4.aTransform_Sub1_7966 = aTransform_Sub1Array2633[i_8];
                    aTransform_Sub1Array2633[i_8] = class521_sub1_sub4_4;
                } else {
                    class521_sub1_sub4_4.aTransform_Sub1_7966 = aTransform_Sub1Array2605[i_8];
                    aTransform_Sub1Array2605[i_8] = class521_sub1_sub4_4;
                }
            } else {
                class521_sub1_sub4_4.aTransform_Sub1_7966 = aTransform_Sub1Array2649[i_8];
                aTransform_Sub1Array2649[i_8] = class521_sub1_sub4_4;
            }
            if (class521_sub1_sub4_5 != null) {
                if (class521_sub1_sub4_5.method12986()) {
                    if (class521_sub1_sub4_5.method12987()) {
                        class521_sub1_sub4_5.aTransform_Sub1_7966 = aTransform_Sub1Array2633[i_8];
                        aTransform_Sub1Array2633[i_8] = class521_sub1_sub4_5;
                    } else {
                        class521_sub1_sub4_5.aTransform_Sub1_7966 = aTransform_Sub1Array2605[i_8];
                        aTransform_Sub1Array2605[i_8] = class521_sub1_sub4_5;
                    }
                } else {
                    class521_sub1_sub4_5.aTransform_Sub1_7966 = aTransform_Sub1Array2649[i_8];
                    aTransform_Sub1Array2649[i_8] = class521_sub1_sub4_5;
                }
            }
        }
    }

    public boolean method3397(GraphNode_Sub1_Sub1 class521_sub1_sub1_1, boolean bool_2) {
        boolean bool_4 = aGroundArray2591 == aGroundArray2614;
        int i_5 = 0;
        short s_6 = 0;
        byte b_7 = 0;
        class521_sub1_sub1_1.method14697();
        if (class521_sub1_sub1_1.aShort9458 >= 0 && class521_sub1_sub1_1.aShort9456 >= 0 && class521_sub1_sub1_1.localX < sizeX && class521_sub1_sub1_1.localY < sizeY) {
            short s_8 = 0;
            int i_9;
            int i_10;
            for (i_9 = class521_sub1_sub1_1.aShort9458; i_9 <= class521_sub1_sub1_1.localX; i_9++) {
                for (i_10 = class521_sub1_sub1_1.aShort9456; i_10 <= class521_sub1_sub1_1.localY; i_10++) {
                    Class293 class293_11 = method3459(class521_sub1_sub1_1.plane, i_9, i_10);
                    if (class293_11 != null) {
                        Class208 class208_12 = VarNPCMap.method2622(class521_sub1_sub1_1);
                        Class208 class208_13 = class293_11.aClass208_3504;
                        if (class208_13 == null) {
                            class293_11.aClass208_3504 = class208_12;
                        } else {
                            while (class208_13.aClass208_2660 != null) {
                                class208_13 = class208_13.aClass208_2660;
                            }
                            class208_13.aClass208_2660 = class208_12;
                        }
                        if (bool_4 && (colors[i_9][i_10] & -16777216) != 0) {
                            i_5 = colors[i_9][i_10];
                            s_6 = scales[i_9][i_10];
                            b_7 = intensities[i_9][i_10];
                        }
                        if (!bool_2 && class293_11.aTransform_Sub1_Sub3_3499 != null && class293_11.aTransform_Sub1_Sub3_3499.aShort9561 > s_8) {
                            s_8 = class293_11.aTransform_Sub1_Sub3_3499.aShort9561;
                        }
                    }
                }
            }
            if (bool_4 && (i_5 & -16777216) != 0) {
                for (i_9 = class521_sub1_sub1_1.aShort9458; i_9 <= class521_sub1_sub1_1.localX; i_9++) {
                    for (i_10 = class521_sub1_sub1_1.aShort9456; i_10 <= class521_sub1_sub1_1.localY; i_10++) {
                        if ((colors[i_9][i_10] & -16777216) == 0) {
                            colors[i_9][i_10] = i_5;
                            scales[i_9][i_10] = s_6;
                            intensities[i_9][i_10] = b_7;
                        }
                    }
                }
            }
            if (bool_2) {
                aTransform_Sub1_Sub1Array2627[++anInt2616 - 1] = class521_sub1_sub1_1;
                class521_sub1_sub1_1.aClass206_7970 = this;
            } else {
                i_9 = aGroundArray2614 == aGroundArray2591 ? 1 : 0;
                if (class521_sub1_sub1_1.method12986()) {
                    if (class521_sub1_sub1_1.method12987()) {
                        class521_sub1_sub1_1.aTransform_Sub1_7966 = aTransform_Sub1Array2633[i_9];
                        aTransform_Sub1Array2633[i_9] = class521_sub1_sub1_1;
                    } else {
                        class521_sub1_sub1_1.aTransform_Sub1_7966 = aTransform_Sub1Array2605[i_9];
                        aTransform_Sub1Array2605[i_9] = class521_sub1_sub1_1;
                    }
                } else {
                    class521_sub1_sub1_1.aTransform_Sub1_7966 = aTransform_Sub1Array2649[i_9];
                    aTransform_Sub1Array2649[i_9] = class521_sub1_sub1_1;
                }
            }
            if (bool_2) {
                Vector3 vector3_14 = Vector3.popVectorStackTo(class521_sub1_sub1_1.method11166().coords);
                vector3_14.y -= s_8;
                class521_sub1_sub1_1.method11171(vector3_14);
                vector3_14.pushVectorStack();
            }
            return true;
        } else {
            return false;
        }
    }

    public void method3398(int i_1, int i_2, int i_3, int i_4) {
        Class293 class293_6 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_6 != null) {
            GraphNode_Sub1_Sub4 class521_sub1_sub4_7 = class293_6.aTransform_Sub1_Sub4_3503;
            GraphNode_Sub1_Sub4 class521_sub1_sub4_8 = class293_6.aTransform_Sub1_Sub4_3500;
            if (class521_sub1_sub4_7 != null) {
                class521_sub1_sub4_7.aShort9611 = (short) (i_4 * class521_sub1_sub4_7.aShort9611 / (16 << anInt2592 - 7));
                class521_sub1_sub4_7.aShort9612 = (short) (i_4 * class521_sub1_sub4_7.aShort9612 / (16 << anInt2592 - 7));
            }
            if (class521_sub1_sub4_8 != null) {
                class521_sub1_sub4_8.aShort9611 = (short) (i_4 * class521_sub1_sub4_8.aShort9611 / (16 << anInt2592 - 7));
                class521_sub1_sub4_8.aShort9612 = (short) (i_4 * class521_sub1_sub4_8.aShort9612 / (16 << anInt2592 - 7));
            }
        }
    }

    public void method3399() {
        for (int i_2 = 0; i_2 < anInt2616; i_2++) {
            GraphNode_Sub1_Sub1 class521_sub1_sub1_3 = aTransform_Sub1_Sub1Array2627[i_2];
            method3407(class521_sub1_sub1_3, true);
            aTransform_Sub1_Sub1Array2627[i_2] = null;
        }
        anInt2616 = 0;
    }

    public void method3400() {
        for (int i_1 = 0; i_1 < anInt2601; i_1++) {
            for (int i_2 = 0; i_2 < sizeX; i_2++) {
                for (int i_3 = 0; i_3 < sizeY; i_3++) {
                    Class293 class293_4 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
                    if (class293_4 != null) {
                        GraphNode_Sub1_Sub5 class521_sub1_sub5_5 = class293_4.aTransform_Sub1_Sub5_3505;
                        GraphNode_Sub1_Sub5 class521_sub1_sub5_6 = class293_4.aTransform_Sub1_Sub5_3502;
                        if (class521_sub1_sub5_5 != null && class521_sub1_sub5_5.method12985()) {
                            method3452(class521_sub1_sub5_5, i_1, i_2, i_3, 1, 1);
                            if (class521_sub1_sub5_6 != null && class521_sub1_sub5_6.method12985()) {
                                method3452(class521_sub1_sub5_6, i_1, i_2, i_3, 1, 1);
                                class521_sub1_sub5_6.method13013(class521_sub1_sub5_5, 0, 0, 0, false);
                                class521_sub1_sub5_6.method12984();
                            }
                            class521_sub1_sub5_5.method12984();
                        }
                        for (Class208 class208_7 = class293_4.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                            GraphNode_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aTransform_Sub1_Sub1_2659;
                            if (class521_sub1_sub1_8 != null && class521_sub1_sub1_8.method12985()) {
                                method3452(class521_sub1_sub1_8, i_1, i_2, i_3, class521_sub1_sub1_8.localX - class521_sub1_sub1_8.aShort9458 + 1, class521_sub1_sub1_8.localY - class521_sub1_sub1_8.aShort9456 + 1);
                                class521_sub1_sub1_8.method12984();
                            }
                        }
                        SceneObjectNode sceneobjectnode_9 = class293_4.aTransform_Sub1_Sub3_3499;
                        if (sceneobjectnode_9 != null && sceneobjectnode_9.method12985()) {
                            method3417(sceneobjectnode_9, i_1, i_2, i_3);
                            sceneobjectnode_9.method12984();
                        }
                    }
                }
            }
        }
    }

    public GraphNode_Sub1_Sub4 method3402(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 != null) {
            method3408(class293_5.aTransform_Sub1_Sub4_3503);
            if (class293_5.aTransform_Sub1_Sub4_3503 != null) {
                GraphNode_Sub1_Sub4 class521_sub1_sub4_6 = class293_5.aTransform_Sub1_Sub4_3503;
                class293_5.aTransform_Sub1_Sub4_3503 = null;
                return class521_sub1_sub4_6;
            }
        }
        return null;
    }

    public SceneObjectNode method3404(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 == null) {
            return null;
        } else {
            method3408(class293_5.aTransform_Sub1_Sub3_3499);
            if (class293_5.aTransform_Sub1_Sub3_3499 != null) {
                SceneObjectNode sceneobjectnode_6 = class293_5.aTransform_Sub1_Sub3_3499;
                class293_5.aTransform_Sub1_Sub3_3499 = null;
                return sceneobjectnode_6;
            } else {
                return null;
            }
        }
    }

    public GraphNode_Sub1_Sub2 method3405(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 == null) {
            return null;
        } else {
            GraphNode_Sub1_Sub2 class521_sub1_sub2_6 = class293_5.aTransform_Sub1_Sub2_3506;
            class293_5.aTransform_Sub1_Sub2_3506 = null;
            method3408(class521_sub1_sub2_6);
            return class521_sub1_sub2_6;
        }
    }

    void method3407(GraphNode_Sub1_Sub1 class521_sub1_sub1_1, boolean bool_2) {
        for (int i_4 = class521_sub1_sub1_1.aShort9458; i_4 <= class521_sub1_sub1_1.localX; i_4++) {
            for (int i_5 = class521_sub1_sub1_1.aShort9456; i_5 <= class521_sub1_sub1_1.localY; i_5++) {
                Class293 class293_6 = aClass293ArrayArrayArray2604[class521_sub1_sub1_1.plane][i_4][i_5];
                if (class293_6 != null) {
                    Class208 class208_7 = class293_6.aClass208_3504;
                    for (Class208 class208_8 = null; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                        if (class521_sub1_sub1_1 == class208_7.aTransform_Sub1_Sub1_2659) {
                            if (class208_8 != null) {
                                class208_8.aClass208_2660 = class208_7.aClass208_2660;
                            } else {
                                class293_6.aClass208_3504 = class208_7.aClass208_2660;
                            }
                            class208_7.method3560();
                            break;
                        }
                        class208_8 = class208_7;
                    }
                }
            }
        }
        if (!bool_2) {
            method3408(class521_sub1_sub1_1);
        }
    }

    void method3408(GraphNode_Sub1 class521_sub1_1) {
        if (class521_sub1_1 != null) {
            class521_sub1_1.method11176();
            for (int i_3 = 0; i_3 < 2; i_3++) {
                GraphNode_Sub1 class521_sub1_4 = null;
                GraphNode_Sub1 class521_sub1_5;
                for (class521_sub1_5 = aTransform_Sub1Array2605[i_3]; class521_sub1_5 != null; class521_sub1_5 = class521_sub1_5.aTransform_Sub1_7966) {
                    if (class521_sub1_5 == class521_sub1_1) {
                        if (class521_sub1_4 != null) {
                            class521_sub1_4.aTransform_Sub1_7966 = class521_sub1_5.aTransform_Sub1_7966;
                        } else {
                            aTransform_Sub1Array2605[i_3] = class521_sub1_5.aTransform_Sub1_7966;
                        }
                        return;
                    }
                    class521_sub1_4 = class521_sub1_5;
                }
                class521_sub1_4 = null;
                for (class521_sub1_5 = aTransform_Sub1Array2633[i_3]; class521_sub1_5 != null; class521_sub1_5 = class521_sub1_5.aTransform_Sub1_7966) {
                    if (class521_sub1_5 == class521_sub1_1) {
                        if (class521_sub1_4 != null) {
                            class521_sub1_4.aTransform_Sub1_7966 = class521_sub1_5.aTransform_Sub1_7966;
                        } else {
                            aTransform_Sub1Array2633[i_3] = class521_sub1_5.aTransform_Sub1_7966;
                        }
                        return;
                    }
                    class521_sub1_4 = class521_sub1_5;
                }
                class521_sub1_4 = null;
                for (class521_sub1_5 = aTransform_Sub1Array2649[i_3]; class521_sub1_5 != null; class521_sub1_5 = class521_sub1_5.aTransform_Sub1_7966) {
                    if (class521_sub1_5 == class521_sub1_1) {
                        if (class521_sub1_4 != null) {
                            class521_sub1_4.aTransform_Sub1_7966 = class521_sub1_5.aTransform_Sub1_7966;
                        } else {
                            aTransform_Sub1Array2649[i_3] = class521_sub1_5.aTransform_Sub1_7966;
                        }
                        return;
                    }
                    class521_sub1_4 = class521_sub1_5;
                }
            }
        }
    }

    public GraphNode_Sub1_Sub5 getWall2(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aTransform_Sub1_Sub5_3502;
    }

    public GraphNode_Sub1_Sub1 getInteractableObject(int i_1, int i_2, int i_3, Interface25 interface25_4) {
        Class293 class293_6 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_6 != null) {
            for (Class208 class208_7 = class293_6.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                GraphNode_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aTransform_Sub1_Sub1_2659;
                if ((interface25_4 == null || interface25_4.method183(class521_sub1_sub1_8)) && i_2 == class521_sub1_sub1_8.aShort9458 && i_3 == class521_sub1_sub1_8.aShort9456) {
                    return class521_sub1_sub1_8;
                }
            }
        }
        return null;
    }

    public SceneObjectNode getGroundDecoration(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 != null && class293_5.aTransform_Sub1_Sub3_3499 != null ? class293_5.aTransform_Sub1_Sub3_3499 : null;
    }

    void method3417(GraphNode_Sub1 class521_sub1_1, int i_2, int i_3, int i_4) {
        Class293 class293_6;
        if (i_3 < sizeX) {
            class293_6 = aClass293ArrayArrayArray2604[i_2][i_3 + 1][i_4];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null && class293_6.aTransform_Sub1_Sub3_3499.method12985()) {
                class521_sub1_1.method13013(class293_6.aTransform_Sub1_Sub3_3499, anInt2593, 0, 0, true);
            }
        }
        if (i_4 < sizeX) {
            class293_6 = aClass293ArrayArrayArray2604[i_2][i_3][i_4 + 1];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null && class293_6.aTransform_Sub1_Sub3_3499.method12985()) {
                class521_sub1_1.method13013(class293_6.aTransform_Sub1_Sub3_3499, 0, 0, anInt2593, true);
            }
        }
        if (i_3 < sizeX && i_4 < sizeY) {
            class293_6 = aClass293ArrayArrayArray2604[i_2][i_3 + 1][i_4 + 1];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null && class293_6.aTransform_Sub1_Sub3_3499.method12985()) {
                class521_sub1_1.method13013(class293_6.aTransform_Sub1_Sub3_3499, anInt2593, 0, anInt2593, true);
            }
        }
        if (i_3 < sizeX && i_4 > 0) {
            class293_6 = aClass293ArrayArrayArray2604[i_2][i_3 + 1][i_4 - 1];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null && class293_6.aTransform_Sub1_Sub3_3499.method12985()) {
                class521_sub1_1.method13013(class293_6.aTransform_Sub1_Sub3_3499, anInt2593, 0, -anInt2593, true);
            }
        }
    }

    void method3421(GraphNode_Sub1 class521_sub1_1) {
        Vector3 vector3_3 = class521_sub1_1.method11166().coords;
        aAbstractRenderer_2596.method8479(((int) vector3_3.x), ((int) vector3_3.y + (class521_sub1_1.method12995() >> 1)), ((int) vector3_3.z), aFloatArray2639);
        class521_sub1_1.anInt7969 = (int) aFloatArray2639[2];
    }

    public GraphNode_Sub1_Sub5 method3422(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 != null) {
            method3408(class293_5.aTransform_Sub1_Sub5_3505);
            if (class293_5.aTransform_Sub1_Sub5_3505 != null) {
                GraphNode_Sub1_Sub5 class521_sub1_sub5_6 = class293_5.aTransform_Sub1_Sub5_3505;
                class293_5.aTransform_Sub1_Sub5_3505 = null;
                return class521_sub1_sub5_6;
            }
        }
        return null;
    }

    boolean method3424(GraphNode_Sub1 class521_sub1_1, boolean bool_2, byte[][][] bytes_3, int i_4, byte b_5) {
        if (!aBool2599) {
            return false;
        } else if (class521_sub1_1 instanceof GraphNode_Sub1_Sub1) {
            short s_6 = ((GraphNode_Sub1_Sub1) class521_sub1_1).localX;
            short s_13 = ((GraphNode_Sub1_Sub1) class521_sub1_1).localY;
            short s_14 = ((GraphNode_Sub1_Sub1) class521_sub1_1).aShort9458;
            short s_9 = ((GraphNode_Sub1_Sub1) class521_sub1_1).aShort9456;
            for (int i_10 = s_14; i_10 <= s_6; i_10++) {
                for (int i_11 = s_9; i_11 <= s_13; i_11++) {
                    if (class521_sub1_1.collisionPlane < anInt2601 && i_10 >= anInt2637 && i_10 < anInt2638 && i_11 >= anInt2621 && i_11 < anInt2640) {
                        if ((bytes_3 == null || class521_sub1_1.plane < i_4 || b_5 != bytes_3[class521_sub1_1.plane][i_10][i_11]) && class521_sub1_1.method13029() && !class521_sub1_1.method13037(aAbstractRenderer_2596)) {
                            return false;
                        }
                        if (!bool_2 && i_10 >= anInt2628 - 16 && i_10 <= anInt2628 + 16 && i_11 >= anInt2629 - 16 && i_11 <= anInt2629 + 16) {
                            class521_sub1_1.method12991(aAbstractRenderer_2596);
                        }
                        return true;
                    }
                }
            }
            return true;
        } else {
            Vector3 vector3_12 = class521_sub1_1.method11166().coords;
            int i_7 = (int) vector3_12.x >> anInt2592;
            int i_8 = (int) vector3_12.z >> anInt2592;
            if (class521_sub1_1.collisionPlane < anInt2601 && i_7 >= anInt2637 && i_7 < anInt2638 && i_8 >= anInt2621 && i_8 < anInt2640) {
                if ((bytes_3 == null || class521_sub1_1.plane < i_4 || b_5 != bytes_3[class521_sub1_1.plane][i_7][i_8]) && class521_sub1_1.method13029() && !class521_sub1_1.method13037(aAbstractRenderer_2596)) {
                    return false;
                } else {
                    if (!bool_2 && i_7 >= anInt2628 - 16 && i_7 <= anInt2628 + 16 && i_8 >= anInt2629 - 16 && i_8 <= anInt2629 + 16) {
                        class521_sub1_1.method12991(aAbstractRenderer_2596);
                    }
                    return true;
                }
            } else {
                return true;
            }
        }
    }

    public boolean method3426(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, boolean[] bools_5) {
        boolean bool_7 = false;
        if (aGroundArray2591 != aGroundArray2614) {
            int i_8 = aGroundArray2607[i_2].averageHeight(i_3, i_4);
            for (int i_9 = 0; i_9 <= i_2; i_9++) {
                Ground class390_10 = aGroundArray2607[i_9];
                if (class390_10 != null) {
                    int i_11 = i_8 - class390_10.averageHeight(i_3, i_4);
                    if (bools_5 != null) {
                        bools_5[i_9] = class390_10.method6712(class282_sub50_sub17_1, i_3, i_11, i_4);
                        if (!bools_5[i_9]) {
                            continue;
                        }
                    }
                    class390_10.UA(class282_sub50_sub17_1, i_3, i_11, i_4);
                    bool_7 = true;
                }
            }
        }
        return bool_7;
    }

    public void method3427(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, boolean[] bools_5) {
        if (aGroundArray2614 != aGroundArray2591) {
            int i_7 = aGroundArray2607[i_2].averageHeight(i_3, i_4);
            for (int i_8 = 0; i_8 <= i_2; i_8++) {
                if (bools_5 == null || bools_5[i_8]) {
                    Ground class390_9 = aGroundArray2607[i_8];
                    if (class390_9 != null) {
                        class390_9.NA(class282_sub50_sub17_1, i_3, i_7 - class390_9.averageHeight(i_3, i_4), i_4);
                    }
                }
            }
        }
    }

    public void method3428() {
        for (int i_2 = 0; i_2 < sizeX; i_2++) {
            for (int i_3 = 0; i_3 < sizeY; i_3++) {
                if (aClass293ArrayArrayArray2604[0][i_2][i_3] == null) {
                    aClass293ArrayArrayArray2604[0][i_2][i_3] = new Class293(0);
                }
            }
        }
    }

    public void method3429() {
        method3486(anInt2601);
    }

    public void method3430(Class287 class287_1) {
        if (anInt2615 < 65361) {
            Node_Sub24 class282_sub24_3 = class287_1.aNode_Sub24_3425;
            aClass287Array2646[anInt2615] = class287_1;
            aBoolArray2647[anInt2615] = false;
            ++anInt2615;
            int i_4 = class287_1.anInt3419;
            if (class287_1.aBool3427) {
                i_4 = 0;
            }
            int i_5 = class287_1.anInt3419;
            if (class287_1.aBool3426) {
                i_5 = anInt2601 - 1;
            }
            for (int i_6 = i_4; i_6 <= i_5; i_6++) {
                int i_7 = 0;
                int i_8 = class282_sub24_3.method12394() - class282_sub24_3.method12370() + anInt2594 >> anInt2592;
                if (i_8 < 0) {
                    i_7 -= i_8;
                    i_8 = 0;
                }
                int i_9 = class282_sub24_3.method12394() + class282_sub24_3.method12370() - anInt2594 >> anInt2592;
                if (i_9 >= sizeY) {
                    i_9 = sizeY - 1;
                }
                for (int i_10 = i_8; i_10 <= i_9; i_10++) {
                    short s_11 = class287_1.aShortArray3429[i_7++];
                    int i_12 = (class282_sub24_3.method12368() - class282_sub24_3.method12370() + anInt2594 >> anInt2592) + (s_11 >>> 8);
                    int i_13 = (s_11 & 0xff) + i_12 - 1;
                    if (i_12 < 0) {
                        i_12 = 0;
                    }
                    if (i_13 >= sizeX) {
                        i_13 = sizeX - 1;
                    }
                    for (int i_14 = i_12; i_14 <= i_13; i_14++) {
                        long long_15 = aLongArrayArrayArray2645[i_6][i_14][i_10];
                        if ((long_15 & 0xffffL) == 0L) {
                            aLongArrayArrayArray2645[i_6][i_14][i_10] = long_15 | anInt2615;
                        } else if ((long_15 & 0xffff0000L) == 0L) {
                            aLongArrayArrayArray2645[i_6][i_14][i_10] = long_15 | (long) anInt2615 << 16;
                        } else if ((long_15 & 0xffff00000000L) == 0L) {
                            aLongArrayArrayArray2645[i_6][i_14][i_10] = long_15 | (long) anInt2615 << 32;
                        } else if ((long_15 & -281474976710656L) == 0L) {
                            aLongArrayArrayArray2645[i_6][i_14][i_10] = long_15 | (long) anInt2615 << 48;
                        }
                    }
                }
            }
        }
    }

    public void method3431() {
        for (int i_2 = 0; i_2 < anInt2615; i_2++) {
            if (!aBoolArray2647[i_2]) {
                Class287 class287_3 = aClass287Array2646[i_2];
                Node_Sub24 class282_sub24_4 = class287_3.aNode_Sub24_3425;
                int i_5 = class287_3.anInt3419;
                int i_6 = class282_sub24_4.method12370() - anInt2594;
                int i_7 = (i_6 * 2 >> anInt2592) + 1;
                int i_8 = 0;
                int[] ints_9 = new int[i_7 * i_7];
                int i_10 = class282_sub24_4.method12368() - i_6 >> anInt2592;
                int i_11 = class282_sub24_4.method12394() - i_6 >> anInt2592;
                int i_12 = class282_sub24_4.method12394() + i_6 >> anInt2592;
                if (i_11 < 0) {
                    i_8 -= i_11;
                    i_11 = 0;
                }
                if (i_12 >= sizeY) {
                    i_12 = sizeY - 1;
                }
                for (int i_13 = i_11; i_13 <= i_12; i_13++) {
                    short s_14 = class287_3.aShortArray3429[i_8];
                    int i_15 = s_14 >>> 8;
                    int i_16 = i_15 + i_8 * i_7;
                    int i_17 = (s_14 >>> 8) + i_10;
                    int i_18 = (s_14 & 0xff) + i_17 - 1;
                    if (i_17 < 0) {
                        i_16 -= i_17;
                        i_17 = 0;
                    }
                    if (i_18 >= sizeX) {
                        i_18 = sizeX - 1;
                    }
                    for (int i_19 = i_17; i_19 <= i_18; i_19++) {
                        byte b_20 = 1;
                        GraphNode_Sub1_Sub1 class521_sub1_sub1_21 = getInteractableObject(i_5, i_19, i_13, null);
                        if (class521_sub1_sub1_21 != null && class521_sub1_sub1_21.aByte9454 != 0) {
                            boolean bool_22;
                            boolean bool_23;
                            short s_24;
                            int i_25;
                            int i_26;
                            if (class521_sub1_sub1_21.aByte9454 == 1) {
                                bool_22 = i_19 - 1 >= i_17;
                                bool_23 = i_19 + 1 <= i_18;
                                if (!bool_22 && i_13 + 1 <= i_12) {
                                    s_24 = class287_3.aShortArray3429[i_8 + 1];
                                    i_25 = (s_24 >>> 8) + i_10;
                                    i_26 = (s_24 & 0xff) + i_25;
                                    bool_22 = i_19 > i_25 && i_19 < i_26;
                                }
                                if (!bool_23 && i_13 - 1 >= i_11) {
                                    s_24 = class287_3.aShortArray3429[i_8 - 1];
                                    i_25 = (s_24 >>> 8) + i_10;
                                    i_26 = (s_24 & 0xff) + i_25;
                                    bool_23 = i_19 > i_25 && i_19 < i_26;
                                }
                                if (bool_22 && !bool_23) {
                                    b_20 = 4;
                                } else if (bool_23 && !bool_22) {
                                    b_20 = 2;
                                }
                            } else {
                                bool_22 = i_19 - 1 >= i_17;
                                bool_23 = i_19 + 1 <= i_18;
                                if (!bool_22 && i_13 - 1 >= i_11) {
                                    s_24 = class287_3.aShortArray3429[i_8 - 1];
                                    i_25 = (s_24 >>> 8) + i_10;
                                    i_26 = (s_24 & 0xff) + i_25;
                                    bool_22 = i_19 > i_25 && i_19 < i_26;
                                }
                                if (!bool_23 && i_13 + 1 <= i_12) {
                                    s_24 = class287_3.aShortArray3429[i_8 + 1];
                                    i_25 = (s_24 >>> 8) + i_10;
                                    i_26 = (s_24 & 0xff) + i_25;
                                    bool_23 = i_19 > i_25 && i_19 < i_26;
                                }
                                if (bool_22 && !bool_23) {
                                    b_20 = 3;
                                } else if (bool_23 && !bool_22) {
                                    b_20 = 5;
                                }
                            }
                        }
                        ints_9[i_16++] = b_20;
                    }
                    ++i_8;
                }
                aBoolArray2647[i_2] = true;
                if (aBool2644) {
                    aGroundArray2591[i_5].method6713(class282_sub24_4, ints_9);
                }
            }
        }
    }

    public int method3432(int i_1, int i_2) {
        return waterRelatedArray4 != null ? waterRelatedArray4[i_1][i_2] & 0xff : 0;
    }

    public GraphNode_Sub1_Sub2 method3437(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aTransform_Sub1_Sub2_3506;
    }

    public GraphNode_Sub1_Sub4 method3439(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 != null) {
            method3408(class293_5.aTransform_Sub1_Sub4_3500);
            if (class293_5.aTransform_Sub1_Sub4_3500 != null) {
                GraphNode_Sub1_Sub4 class521_sub1_sub4_6 = class293_5.aTransform_Sub1_Sub4_3500;
                class293_5.aTransform_Sub1_Sub4_3500 = null;
                return class521_sub1_sub4_6;
            }
        }
        return null;
    }

    void method3441(boolean bool_1, byte[][][] bytes_2, int i_3, byte b_4) {
        int i_6 = bool_1 ? 1 : 0;
        anInt2623 = 0;
        anInt2624 = 0;
        ++anInt2609;
        GraphNode_Sub1 class521_sub1_7;
        if (true) {
            for (class521_sub1_7 = aTransform_Sub1Array2605[i_6]; class521_sub1_7 != null; class521_sub1_7 = class521_sub1_7.aTransform_Sub1_7966) {
                method3421(class521_sub1_7);
                if (class521_sub1_7.anInt7969 != -1 && !method3424(class521_sub1_7, bool_1, bytes_2, i_3, b_4)) {
                    aTransform_Sub1Array2626[++anInt2623 - 1] = class521_sub1_7;
                }
            }
        }
        int i_16;
        if (true) {
            for (class521_sub1_7 = aTransform_Sub1Array2633[i_6]; class521_sub1_7 != null; class521_sub1_7 = class521_sub1_7.aTransform_Sub1_7966) {
                method3421(class521_sub1_7);
                if (class521_sub1_7.anInt7969 != -1 && !method3424(class521_sub1_7, bool_1, bytes_2, i_3, b_4)) {
                    aTransform_Sub1Array2625[++anInt2624 - 1] = class521_sub1_7;
                }
            }
            for (class521_sub1_7 = aTransform_Sub1Array2649[i_6]; class521_sub1_7 != null; class521_sub1_7 = class521_sub1_7.aTransform_Sub1_7966) {
                method3421(class521_sub1_7);
                if (class521_sub1_7.anInt7969 != -1 && !method3424(class521_sub1_7, bool_1, bytes_2, i_3, b_4)) {
                    if (class521_sub1_7.method12987()) {
                        aTransform_Sub1Array2625[++anInt2624 - 1] = class521_sub1_7;
                    } else {
                        aTransform_Sub1Array2626[++anInt2623 - 1] = class521_sub1_7;
                    }
                }
            }
            if (!bool_1) {
                for (i_16 = 0; i_16 < anInt2616; i_16++) {
                    method3421(aTransform_Sub1_Sub1Array2627[i_16]);
                    if (aTransform_Sub1_Sub1Array2627[i_16].anInt7969 != -1 && !method3424(aTransform_Sub1_Sub1Array2627[i_16], bool_1, bytes_2, i_3, b_4)) {
                        if (aTransform_Sub1_Sub1Array2627[i_16].method12987()) {
                            aTransform_Sub1Array2625[++anInt2624 - 1] = aTransform_Sub1_Sub1Array2627[i_16];
                        } else {
                            aTransform_Sub1Array2626[++anInt2623 - 1] = aTransform_Sub1_Sub1Array2627[i_16];
                        }
                    }
                }
            }
        }
        if (anInt2623 > 0) {
            method3466(aTransform_Sub1Array2626, 0, anInt2623 - 1);
            for (i_16 = 0; i_16 < anInt2623; i_16++) {
                method3508(aTransform_Sub1Array2626[i_16], aNode_Sub24Array2642);
            }
        }
        if (aBool2598) {
            aAbstractRenderer_2596.method8547(0, null);
        }
        if (true) {
            for (i_16 = 0; i_16 < anInt2601; i_16++) {
                int i_8;
                int i_9;
                boolean[][] bools_10;
                int i_11;
                int i_12;
                int i_13;
                if (i_16 >= i_3 && bytes_2 != null) {
                    i_8 = aBoolArrayArray2651.length;
                    if (aBoolArrayArray2651.length + anInt2637 > sizeX) {
                        i_8 -= aBoolArrayArray2651.length + anInt2637 - sizeX;
                    }
                    i_9 = aBoolArrayArray2651[0].length;
                    if (aBoolArrayArray2651[0].length + anInt2621 > sizeY) {
                        i_9 -= aBoolArrayArray2651[0].length + anInt2621 - sizeY;
                    }
                    bools_10 = aBoolArrayArray2635;
                    if (aBool2599) {
                        for (i_11 = anInt2602; i_11 < i_8; i_11++) {
                            i_12 = i_11 + anInt2637 - anInt2602;
                            for (i_13 = anInt2636; i_13 < i_9; i_13++) {
                                bools_10[i_11][i_13] = false;
                                if (aBoolArrayArray2651[i_11][i_13]) {
                                    int i_14 = i_13 + anInt2621 - anInt2636;
                                    for (int i_15 = i_16; i_15 >= 0; --i_15) {
                                        if (aClass293ArrayArrayArray2604[i_15][i_12][i_14] != null && aClass293ArrayArrayArray2604[i_15][i_12][i_14].aByte3507 == i_16) {
                                            if ((i_15 < i_3 || bytes_2[i_15][i_12][i_14] != b_4) && !aClass201_2600.method3271(i_16, i_12, i_14)) {
                                                bools_10[i_11][i_13] = true;
                                                break;
                                            }
                                            bools_10[i_11][i_13] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    aGroundArray2591[i_16].method6717(anInt2628, anInt2629, anInt2652, aBoolArrayArray2635, false);
                } else {
                    i_8 = aBoolArrayArray2651.length;
                    if (aBoolArrayArray2651.length + anInt2637 > sizeX) {
                        i_8 -= aBoolArrayArray2651.length + anInt2637 - sizeX;
                    }
                    i_9 = aBoolArrayArray2651[0].length;
                    if (aBoolArrayArray2651[0].length + anInt2621 > sizeY) {
                        i_9 -= aBoolArrayArray2651[0].length + anInt2621 - sizeY;
                    }
                    bools_10 = aBoolArrayArray2635;
                    if (aBool2599) {
                        for (i_11 = anInt2602; i_11 < i_8; i_11++) {
                            i_12 = i_11 + anInt2637 - anInt2602;
                            for (i_13 = anInt2636; i_13 < i_9; i_13++) {
                                bools_10[i_11][i_13] = aBoolArrayArray2651[i_11][i_13] && !aClass201_2600.method3271(i_16, i_12, i_13 + anInt2621 - anInt2636);
                            }
                        }
                    }
                    aGroundArray2591[i_16].method6717(anInt2628, anInt2629, anInt2652, aBoolArrayArray2635, true);
                }
            }
        }
        if (anInt2624 > 0) {
            method3502(aTransform_Sub1Array2625, 0, anInt2624 - 1);
            for (i_16 = 0; i_16 < anInt2624; i_16++) {
                method3508(aTransform_Sub1Array2625[i_16], aNode_Sub24Array2642);
            }
        }
    }

    public void method3447(int i_1, int i_2, int i_3, int i_4, byte[][][] bytes_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int i_11, byte b_12, boolean bool_15) {
        aClass201_2600.aBool2542 = true;
        aBool2599 = true;
        anInt2628 = i_2 >> anInt2592;
        anInt2629 = i_4 >> anInt2592;
        anInt2630 = i_2;
        anInt2650 = i_4;
        anInt2632 = i_3;
        anInt2637 = anInt2628 - anInt2652;
        if (anInt2637 < 0) {
            anInt2602 = -(anInt2637 * 1607871809) * -1275764031;
            anInt2637 = 0;
        } else {
            anInt2602 = 0;
        }
        anInt2621 = anInt2629 - anInt2652;
        if (anInt2621 < 0) {
            anInt2636 = -(anInt2621 * 1831414049) * -2139776287;
            anInt2621 = 0;
        } else {
            anInt2636 = 0;
        }
        anInt2638 = anInt2652 + anInt2628;
        if (anInt2638 > sizeX) {
            anInt2638 = sizeX;
        }
        anInt2640 = anInt2652 + anInt2629;
        if (anInt2640 > sizeY) {
            anInt2640 = sizeY;
        }
        boolean[][] bools_19 = aBoolArrayArray2651;
        boolean[][] bools_20 = aBoolArrayArray2635;
        int i_21;
        int i_22;
        if (aBool2599) {
            for (i_21 = 0; i_21 < anInt2652 + anInt2652 + 2; i_21++) {
                i_22 = 0;
                int i_23 = 0;
                for (int i_24 = 0; i_24 < anInt2652 + anInt2652 + 2; i_24++) {
                    if (i_24 > 1) {
                        anIntArray2641[i_24 - 2] = i_22;
                    }
                    i_22 = i_23;
                    int i_25 = i_21 + (anInt2628 - anInt2652);
                    int i_26 = i_24 + (anInt2629 - anInt2652);
                    int i_27;
                    if (i_25 >= 0 && i_26 >= 0 && i_25 < sizeX && i_26 < sizeY) {
                        i_27 = i_25 << anInt2592;
                        int i_28 = i_26 << anInt2592;
                        int i_29 = aGroundArray2607[aGroundArray2607.length - 1].getHeight(i_25, i_26) - (1000 << anInt2592 - 7);
                        int i_30 = (aGroundArray2614 != null ? aGroundArray2614[0].getHeight(i_25, i_26) + anInt2593 : aGroundArray2607[0].getHeight(i_25, i_26) + anInt2593) + (1000 << anInt2592 - 7);
                        i_23 = aAbstractRenderer_2596.method8437(i_27, i_29, i_28, i_27, i_30, i_28);
                        aBoolArrayArray2635[i_21][i_24] = i_23 == 0;
                    } else {
                        i_23 = -1;
                        aBoolArrayArray2635[i_21][i_24] = false;
                    }
                    if (i_21 > 0 && i_24 > 0) {
                        i_27 = anIntArray2641[i_24 - 1] & anIntArray2641[i_24] & i_22 & i_23;
                        aBoolArrayArray2651[i_21 - 1][i_24 - 1] = i_27 == 0;
                    }
                }
                anIntArray2641[anInt2652 + anInt2652] = i_22;
                anIntArray2641[anInt2652 + anInt2652 + 1] = i_23;
            }
            aClass201_2600.anIntArray2569 = ints_6;
            aClass201_2600.anIntArray2561 = ints_7;
            aClass201_2600.anIntArray2562 = ints_8;
            aClass201_2600.anIntArray2568 = ints_9;
            aClass201_2600.anIntArray2560 = ints_10;
            aClass201_2600.method3265(aAbstractRenderer_2596, i_11);
        } else {
            if (aBoolArrayArray2631 == null) {
                aBoolArrayArray2631 = new boolean[anInt2652 + anInt2652 + 2][anInt2652 + anInt2652 + 2];
            }
            for (i_21 = 0; i_21 < aBoolArrayArray2631.length; i_21++) {
                for (i_22 = 0; i_22 < aBoolArrayArray2631[0].length; i_22++) {
                    aBoolArrayArray2631[i_21][i_22] = true;
                }
            }
            aBoolArrayArray2635 = aBoolArrayArray2631;
            aBoolArrayArray2651 = aBoolArrayArray2631;
            anInt2637 = 0;
            anInt2621 = 0;
            anInt2638 = sizeX;
            anInt2640 = sizeY;
            aClass201_2600.aBool2542 = false;
        }
        ChatLine.method1848(this, aAbstractRenderer_2596);
        if (!aClass284_2648.aBool3386) {
            Iterator<Class285> iterator_31 = aClass284_2648.aList3388.iterator();
            while (iterator_31.hasNext()) {
                Class285 class285_32 = iterator_31.next();
                iterator_31.remove();
                Class279.method4969(class285_32);
            }
        }
        if (aBool2598) {
            for (i_21 = 0; i_21 < anInt2615; i_21++) {
                aClass287Array2646[i_21].method5053(i_1, bool_15);
            }
        }
        if (waterRelatedClassArray1 != null) {
            method3380(true);
            aAbstractRenderer_2596.method8475(new HDWaterTile());
            method3441(true, bytes_5, i_11, b_12);
            aAbstractRenderer_2596.O();
            method3380(false);
        }
        method3441(false, bytes_5, i_11, b_12);
        if (!aBool2599) {
            aBoolArrayArray2651 = bools_19;
            aBoolArrayArray2635 = bools_20;
        }
    }

    void method3452(GraphNode_Sub1 class521_sub1_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        boolean bool_7 = true;
        int i_8 = i_3;
        int i_9 = i_3 + i_5;
        int i_10 = i_4 - 1;
        int i_11 = i_4 + i_6;
        for (int i_12 = i_2; i_12 <= i_2 + 1; i_12++) {
            if (i_12 != anInt2601) {
                for (int i_13 = i_8; i_13 <= i_9; i_13++) {
                    if (i_13 >= 0 && i_13 < sizeX) {
                        for (int i_14 = i_10; i_14 <= i_11; i_14++) {
                            if (i_14 >= 0 && i_14 < sizeY && (!bool_7 || i_13 >= i_9 || i_14 >= i_11 || i_14 < i_4 && i_3 != i_13)) {
                                Class293 class293_15 = aClass293ArrayArrayArray2604[i_12][i_13][i_14];
                                if (class293_15 != null) {
                                    int i_16 = (aGroundArray2591[i_12].getHeight(i_13, i_14) + aGroundArray2591[i_12].getHeight(1 + i_13, i_14) + aGroundArray2591[i_12].getHeight(i_13, 1 + i_14) + aGroundArray2591[i_12].getHeight(1 + i_13, 1 + i_14)) / 4 - (aGroundArray2591[i_2].getHeight(i_3, i_4) + aGroundArray2591[i_2].getHeight(i_3 + 1, i_4) + aGroundArray2591[i_2].getHeight(i_3, i_4 + 1) + aGroundArray2591[i_2].getHeight(i_3 + 1, i_4 + 1)) / 4;
                                    GraphNode_Sub1_Sub5 class521_sub1_sub5_17 = class293_15.aTransform_Sub1_Sub5_3505;
                                    GraphNode_Sub1_Sub5 class521_sub1_sub5_18 = class293_15.aTransform_Sub1_Sub5_3502;
                                    if (class521_sub1_sub5_17 != null && class521_sub1_sub5_17.method12985()) {
                                        class521_sub1_1.method13013(class521_sub1_sub5_17, (i_13 - i_3) * anInt2593 + (1 - i_5) * anInt2594, i_16, (1 - i_6) * anInt2594 + (i_14 - i_4) * anInt2593, bool_7);
                                    }
                                    if (class521_sub1_sub5_18 != null && class521_sub1_sub5_18.method12985()) {
                                        class521_sub1_1.method13013(class521_sub1_sub5_18, (i_13 - i_3) * anInt2593 + (1 - i_5) * anInt2594, i_16, (1 - i_6) * anInt2594 + (i_14 - i_4) * anInt2593, bool_7);
                                    }
                                    for (Class208 class208_19 = class293_15.aClass208_3504; class208_19 != null; class208_19 = class208_19.aClass208_2660) {
                                        GraphNode_Sub1_Sub1 class521_sub1_sub1_20 = class208_19.aTransform_Sub1_Sub1_2659;
                                        if (class521_sub1_sub1_20 != null && class521_sub1_sub1_20.method12985() && (i_13 == class521_sub1_sub1_20.aShort9458 || i_8 == i_13) && (i_14 == class521_sub1_sub1_20.aShort9456 || i_10 == i_14)) {
                                            int i_21 = class521_sub1_sub1_20.localX - class521_sub1_sub1_20.aShort9458 + 1;
                                            int i_22 = class521_sub1_sub1_20.localY - class521_sub1_sub1_20.aShort9456 + 1;
                                            class521_sub1_1.method13013(class521_sub1_sub1_20, anInt2593 * (class521_sub1_sub1_20.aShort9458 - i_3) + anInt2594 * (i_21 - i_5), i_16, anInt2593 * (class521_sub1_sub1_20.aShort9456 - i_4) + (i_22 - i_6) * anInt2594, bool_7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --i_8;
                bool_7 = false;
            }
        }
    }

    Class293 method3459(int i_1, int i_2, int i_3) {
        if (aClass293ArrayArrayArray2604[i_1][i_2][i_3] == null) {
            boolean bool_5 = aClass293ArrayArrayArray2604[0][i_2][i_3] != null && aClass293ArrayArrayArray2604[0][i_2][i_3].aClass293_3509 != null;
            if (bool_5 && i_1 >= anInt2601 - 1) {
                return null;
            }
            method3384(i_1, i_2, i_3);
        }
        return aClass293ArrayArrayArray2604[i_1][i_2][i_3];
    }

    public GraphNode_Sub1_Sub5 method3460(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 != null) {
            method3408(class293_5.aTransform_Sub1_Sub5_3502);
            if (class293_5.aTransform_Sub1_Sub5_3502 != null) {
                GraphNode_Sub1_Sub5 class521_sub1_sub5_6 = class293_5.aTransform_Sub1_Sub5_3502;
                class293_5.aTransform_Sub1_Sub5_3502 = null;
                return class521_sub1_sub5_6;
            }
        }
        return null;
    }

    public int method3464(int i_1, int i_2) {
        return waterRelatedArray5 != null ? waterRelatedArray5[i_1][i_2] & 0xff : 0;
    }

    void method3466(GraphNode_Sub1[] arr_1, int i_2, int i_3) {
        if (i_2 < i_3) {
            int i_4 = (i_3 + i_2) / 2;
            int i_5 = i_2;
            GraphNode_Sub1 class521_sub1_6 = arr_1[i_4];
            arr_1[i_4] = arr_1[i_3];
            arr_1[i_3] = class521_sub1_6;
            int i_7 = class521_sub1_6.anInt7969;
            for (int i_8 = i_2; i_8 < i_3; i_8++) {
                if (arr_1[i_8].anInt7969 < (i_8 & 0x1) + i_7) {
                    GraphNode_Sub1 class521_sub1_9 = arr_1[i_8];
                    arr_1[i_8] = arr_1[i_5];
                    arr_1[i_5++] = class521_sub1_9;
                }
            }
            arr_1[i_3] = arr_1[i_5];
            arr_1[i_5] = class521_sub1_6;
            method3466(arr_1, i_2, i_5 - 1);
            method3466(arr_1, i_5 + 1, i_3);
        }
    }

    void method3486(int i_2) {
        Shadow class282_sub50_sub17_4 = null;
        for (int i_5 = 1; i_5 < i_2; i_5++) {
            Ground class390_6 = aGroundArray2607[i_5];
            if (class390_6 != null) {
                for (int i_7 = 0; i_7 < sizeY; i_7++) {
                    for (int i_8 = 0; i_8 < sizeX; i_8++) {
                        class282_sub50_sub17_4 = class390_6.w(i_8, i_7, class282_sub50_sub17_4);
                        if (class282_sub50_sub17_4 != null) {
                            int i_9 = i_8 << anInt2592;
                            int i_10 = i_7 << anInt2592;
                            for (int i_11 = i_5 - 1; i_11 >= 0; --i_11) {
                                Ground class390_12 = aGroundArray2607[i_11];
                                if (class390_12 != null) {
                                    int i_13 = class390_6.getHeight(i_8, i_7) - class390_12.getHeight(i_8, i_7);
                                    int i_14 = class390_6.getHeight(i_8 + 1, i_7) - class390_12.getHeight(i_8 + 1, i_7);
                                    int i_15 = class390_6.getHeight(i_8 + 1, i_7 + 1) - class390_12.getHeight(i_8 + 1, i_7 + 1);
                                    int i_16 = class390_6.getHeight(i_8, i_7 + 1) - class390_12.getHeight(i_8, i_7 + 1);
                                    class390_12.UA(class282_sub50_sub17_4, i_9, (i_16 + i_15 + i_14 + i_13) / 4, i_10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void method3502(GraphNode_Sub1[] arr_1, int i_2, int i_3) {
        if (i_2 < i_3) {
            int i_4 = (i_3 + i_2) / 2;
            int i_5 = i_2;
            GraphNode_Sub1 class521_sub1_6 = arr_1[i_4];
            arr_1[i_4] = arr_1[i_3];
            arr_1[i_3] = class521_sub1_6;
            int i_7 = class521_sub1_6.anInt7969;
            for (int i_8 = i_2; i_8 < i_3; i_8++) {
                if (arr_1[i_8].anInt7969 > (i_8 & 0x1) + i_7) {
                    GraphNode_Sub1 class521_sub1_9 = arr_1[i_8];
                    arr_1[i_8] = arr_1[i_5];
                    arr_1[i_5++] = class521_sub1_9;
                }
            }
            arr_1[i_3] = arr_1[i_5];
            arr_1[i_5] = class521_sub1_6;
            method3502(arr_1, i_2, i_5 - 1);
            method3502(arr_1, i_5 + 1, i_3);
        }
    }

    public Class208 method3507(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aClass208_3504;
    }

    void method3508(GraphNode_Sub1 class521_sub1_1, Node_Sub24[] arr_2) {
        if (aBool2598) {
            int i_3 = class521_sub1_1.method13036(arr_2);
            aAbstractRenderer_2596.method8547(i_3, arr_2);
        }
        if (aGroundArray2614 == aGroundArray2591) {
            boolean bool_10 = false;
            boolean bool_4 = false;
            Vector3 vector3_5 = class521_sub1_1.method11166().coords;
            int i_6;
            int i_7;
            if (class521_sub1_1 instanceof GraphNode_Sub1_Sub1) {
                i_6 = ((GraphNode_Sub1_Sub1) class521_sub1_1).aShort9458;
                i_7 = ((GraphNode_Sub1_Sub1) class521_sub1_1).aShort9456;
            } else {
                i_6 = (int) vector3_5.x >> anInt2592;
                i_7 = (int) vector3_5.z >> anInt2592;
            }
            HDWaterTile class90_8 = new HDWaterTile();
            class90_8.color = getColor(i_6, i_7);
            class90_8.scale = getScale(i_6, i_7);
            class90_8.intensity = getIntensities(i_6, i_7);
            class90_8.hdWaterInt1 = method3432(i_6, i_7);
            class90_8.hdWaterInt2 = method3464(i_6, i_7);
            class90_8.hdWaterInt3 = method3391(i_6, i_7);
            aAbstractRenderer_2596.method8476(aGroundArray2607[0].averageHeight((int) vector3_5.x, (int) vector3_5.z), class90_8);
        }
        Class285 class285_9 = class521_sub1_1.method12990(aAbstractRenderer_2596);
        if (class285_9 != null) {
            if (class285_9.aBool3392) {
                class285_9.aTransform_Sub1_3391 = class521_sub1_1;
                aClass284_2648.method5013(class285_9);
            } else {
                Class279.method4969(class285_9);
            }
        }
    }

    public GraphNode_Sub1_Sub4 getWallDecoration(int i_1, int i_2, int i_3) {
        Class293 class293_5 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aTransform_Sub1_Sub4_3503;
    }

    public GraphNode_Sub1_Sub1 method3530(int i_1, int i_2, int i_3, Interface25 interface25_4) {
        Class293 class293_6 = aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_6 != null) {
            for (Class208 class208_7 = class293_6.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                GraphNode_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aTransform_Sub1_Sub1_2659;
                if ((interface25_4 == null || interface25_4.method183(class521_sub1_sub1_8)) && i_2 == class521_sub1_sub1_8.aShort9458 && i_3 == class521_sub1_sub1_8.aShort9456) {
                    method3407(class521_sub1_sub1_8, false);
                    return class521_sub1_sub1_8;
                }
            }
        }
        return null;
    }

    public int getIntensities(int x, int y) {
        return intensities != null ? intensities[x][y] & 0xff : 0;
    }
}
