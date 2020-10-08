package com.jagex;

public class Class201 {

    static AbstractRenderer aAbstractRenderer_2566;
    public boolean aBool2552 = true;
    int[] anIntArray2560;
    int[] anIntArray2561;
    int[] anIntArray2562;
    int[] anIntArray2568;
    int[] anIntArray2569;
    int anInt2556;
    int anInt2564;
    int anInt2543 = -1;
    int anInt2570 = -1;
    int[] anIntArray2565;
    int anInt2567;
    boolean aBool2542 = true;
    boolean aBool2548;
    float[] aFloatArray2554 = new float[3];
    int[] anIntArray2550 = new int[2];
    boolean aBool2571 = true;
    int anInt2549;
    int anInt2563;
    SceneObjectManager aClass206_2546;
    Class231[] aClass231Array2553;
    Class231[] aClass231Array2555;
    int anInt2545;
    Class231[] aClass231Array2557;
    Class231[] aClass231Array2559;
    int[][][] anIntArrayArrayArray2551;
    Class205 aClass205_2547;

    Class201(SceneObjectManager sceneobjectmanager_1) {
        anInt2549 = sceneobjectmanager_1.anInt2593;
        anInt2563 = sceneobjectmanager_1.anInt2593;
        aClass206_2546 = sceneobjectmanager_1;
        aClass231Array2553 = new Class231[509];
        anInt2567 = 0;
        aClass231Array2555 = new Class231[2034];
        anInt2545 = 0;
        aClass231Array2557 = new Class231[1027];
        anInt2556 = 0;
        aClass231Array2559 = new Class231[1005];
        anInt2564 = 0;
        anIntArrayArrayArray2551 = new int[aClass206_2546.anInt2601][aClass206_2546.sizeX + 1][aClass206_2546.sizeY + 1];
        aBool2548 = false;
        aBool2552 = !(aClass206_2546.aAbstractRenderer_2596 instanceof ja);

        if (aBool2552) {
            aClass205_2547 = new Class205(this);
        }

    }

    public void method3262(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (i_1 != 8 && i_1 != 16) {
            Class293 class293_7 = aClass206_2546.aClass293ArrayArrayArray2604[i_2][i_3][i_4];
            if (class293_7 == null) {
                aClass206_2546.aClass293ArrayArrayArray2604[i_2][i_3][i_4] = class293_7 = new Class293(i_2);
            }

            if (i_1 == 1) {
                class293_7.aShort3508 = (short) i_5;
                class293_7.aShort3501 = (short) i_6;
            } else if (i_1 == 2) {
                class293_7.aShort3510 = (short) i_5;
                class293_7.aShort3511 = (short) i_6;
            }

            if (aBool2548) {
                method3309();
            }
        } else {
            int i_8;
            int i_9;
            int i_10;
            int i_11;
            int i_12;
            int i_13;
            if (i_1 == 8) {
                i_13 = i_3 << aClass206_2546.anInt2592;
                i_8 = aClass206_2546.anInt2593 + i_13;
                i_9 = i_4 << aClass206_2546.anInt2592;
                i_10 = aClass206_2546.anInt2593 + i_9;
                i_11 = aClass206_2546.aGroundArray2607[i_2].getHeight(i_3, i_4);
                i_12 = aClass206_2546.aGroundArray2607[i_2].getHeight(i_3 + 1, i_4 + 1);
                aClass231Array2557[anInt2556++] = new Class231(aClass206_2546, 8, i_2, i_13, i_8, i_8, i_13, i_11, i_12, i_12 - i_5, i_11 - i_5, i_9, i_10, i_10, i_9);
            } else {
                i_13 = aClass206_2546.anInt2593 + (i_3 << aClass206_2546.anInt2592);
                i_8 = i_13 - aClass206_2546.anInt2593;
                i_9 = i_4 << aClass206_2546.anInt2592;
                i_10 = aClass206_2546.anInt2593 + i_9;
                i_11 = aClass206_2546.aGroundArray2607[i_2].getHeight(i_3 + 1, i_4);
                i_12 = aClass206_2546.aGroundArray2607[i_2].getHeight(i_3, i_4 + 1);
                aClass231Array2557[anInt2556++] = new Class231(aClass206_2546, i_1, i_2, i_13, i_8, i_8, i_13, i_11, i_12, i_12 - i_5, i_11 - i_5, i_9, i_10, i_10, i_9);
            }
        }

    }

    public void method3264() {
        method3309();
    }

    void method3265(AbstractRenderer graphicalrenderer_1, int i_2) {
        aAbstractRenderer_2566 = graphicalrenderer_1;
        if (aBool2552 && aBool2542) {
            if (aBool2571) {
                aClass206_2546.aClass454_2597.method7548();
            }

            aAbstractRenderer_2566.method8408(anIntArray2550);
            if (anInt2543 != (int) (anIntArray2550[0] / 3.0F) || (int) (anIntArray2550[1] / 3.0F) != anInt2570) {
                anInt2543 = (int) (anIntArray2550[0] / 3.0F);
                anInt2570 = (int) (anIntArray2550[1] / 3.0F);
                anIntArray2565 = new int[anInt2543 * anInt2570];
            }

            anInt2564 = 0;

            int i_3;
            for (i_3 = 0; i_3 < anInt2567; i_3++) {
                method3281(aAbstractRenderer_2566, aClass231Array2553[i_3], i_2);
            }

            for (i_3 = 0; i_3 < anInt2545; i_3++) {
                method3281(aAbstractRenderer_2566, aClass231Array2555[i_3], i_2);
            }

            for (i_3 = 0; i_3 < anInt2556; i_3++) {
                method3281(aAbstractRenderer_2566, aClass231Array2557[i_3], i_2);
            }

            aClass205_2547.anInt2588 = 0;
            if (anInt2564 > 0) {
                i_3 = anIntArray2565.length;
                int i_4 = 0 & 0x7;

                int i_5;
                for (i_5 = 0; i_5 < i_4; anIntArray2565[i_5++] = Integer.MAX_VALUE) {
                    anIntArray2565[i_5++] = Integer.MAX_VALUE;
                    anIntArray2565[i_5++] = Integer.MAX_VALUE;
                    anIntArray2565[i_5++] = Integer.MAX_VALUE;
                    anIntArray2565[i_5++] = Integer.MAX_VALUE;
                    anIntArray2565[i_5++] = Integer.MAX_VALUE;
                    anIntArray2565[i_5++] = Integer.MAX_VALUE;
                    anIntArray2565[i_5++] = Integer.MAX_VALUE;
                }

                while (i_5 < i_3) {
                    anIntArray2565[i_5++] = Integer.MAX_VALUE;
                }

                aClass205_2547.anInt2587 = 1;

                for (int i_6 = 0; i_6 < anInt2564; i_6++) {
                    Class231 class231_7 = aClass231Array2559[i_6];
                    aClass205_2547.method3371(class231_7.aShortArray2862[0], class231_7.aShortArray2862[1], class231_7.aShortArray2862[3], class231_7.aShortArray2873[0], class231_7.aShortArray2873[1], class231_7.aShortArray2873[3], class231_7.aShortArray2875[0], class231_7.aShortArray2875[1], class231_7.aShortArray2875[3]);
                    aClass205_2547.method3371(class231_7.aShortArray2862[1], class231_7.aShortArray2862[2], class231_7.aShortArray2862[3], class231_7.aShortArray2873[1], class231_7.aShortArray2873[2], class231_7.aShortArray2873[3], class231_7.aShortArray2875[1], class231_7.aShortArray2875[2], class231_7.aShortArray2875[3]);
                }

                aClass205_2547.anInt2587 = 2;
            }

            if (aBool2571) {
                aClass206_2546.aClass454_2597.method7548();
            }
        } else {
            anInt2564 = 0;
        }

    }

    public void method3266(int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        aClass231Array2553[anInt2567++] = new Class231(aClass206_2546, 4, i_2, i_3, i_4, i_4, i_3, i_7, i_8, i_8, i_7, i_5, i_5, i_6, i_6);
    }

    boolean method3269(Class231 class231_1, int i_2) {
        if (!method3270(class231_1.anIntArray2859[i_2], class231_1.anIntArray2871[i_2], class231_1.anIntArray2864[i_2])) {
            return false;
        } else {
            class231_1.aShortArray2873[i_2] = (short) ((int) aFloatArray2554[0]);
            class231_1.aShortArray2862[i_2] = (short) ((int) aFloatArray2554[1]);
            class231_1.aShortArray2875[i_2] = (short) ((int) aFloatArray2554[2]);
            return true;
        }
    }

    boolean method3270(int i_1, int i_2, int i_3) {
        aAbstractRenderer_2566.method8479(i_1, i_2, i_3, aFloatArray2554);
        if (aFloatArray2554[2] < 50.0F) {
            return false;
        } else {
            aFloatArray2554[0] /= 3.0F;
            aFloatArray2554[1] /= 3.0F;
            return true;
        }
    }

    boolean method3271(int i_1, int i_2, int i_3) {
        if (aBool2552 && aBool2542) {
            if (aClass205_2547.anInt2588 < 102) {
                return false;
            } else {
                int i_4 = anIntArrayArrayArray2551[i_1][i_2][i_3];
                if (i_4 == -aClass206_2546.anInt2609) {
                    return false;
                } else if (aClass206_2546.anInt2609 == i_4) {
                    return true;
                } else if (aClass206_2546.aGroundArray2591 == aClass206_2546.aGroundArray2614) {
                    return false;
                } else {
                    int i_5 = i_2 << aClass206_2546.anInt2592;
                    int i_6 = i_3 << aClass206_2546.anInt2592;
                    if (method3277(i_5 + 1, aClass206_2546.aGroundArray2591[i_1].getHeight(i_2, i_3), i_6 + 1, aClass206_2546.anInt2593 + i_5 - 1, aClass206_2546.aGroundArray2591[i_1].getHeight(i_2 + 1, i_3 + 1), aClass206_2546.anInt2593 + i_6 - 1, i_5 + 1, aClass206_2546.aGroundArray2591[i_1].getHeight(i_2, i_3 + 1), aClass206_2546.anInt2593 + i_6 - 1) && method3277(i_5 + 1, aClass206_2546.aGroundArray2591[i_1].getHeight(i_2, i_3), i_6 + 1, aClass206_2546.anInt2593 + i_5 - 1, aClass206_2546.aGroundArray2591[i_1].getHeight(i_2 + 1, i_3), i_6 + 1, aClass206_2546.anInt2593 + i_5 - 1, aClass206_2546.aGroundArray2591[i_1].getHeight(i_2 + 1, i_3 + 1), aClass206_2546.anInt2593 + i_6 - 1)) {
                        anIntArrayArrayArray2551[i_1][i_2][i_3] = aClass206_2546.anInt2609;
                        return true;
                    } else {
                        anIntArrayArrayArray2551[i_1][i_2][i_3] = -aClass206_2546.anInt2609;
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
    }

    boolean method3273(int i_1, int i_2, int i_3, int i_4) {
        if (aBool2552 && aBool2542) {
            if (aClass205_2547.anInt2588 < 102) {
                return false;
            } else if (!method3271(i_1, i_2, i_3)) {
                return false;
            } else {
                int i_5 = i_2 << aClass206_2546.anInt2592;
                int i_6 = i_3 << aClass206_2546.anInt2592;
                return method3276(i_5, aClass206_2546.aGroundArray2591[i_1].getHeight(i_2, i_3), i_6, aClass206_2546.anInt2593, i_4, aClass206_2546.anInt2593);
            }
        } else {
            return false;
        }
    }

    boolean method3274(int i_1, int i_2, int i_3, int i_4, int i_5, Class200 class200_6) {
        if (aBool2552 && aBool2542) {
            if (aClass205_2547.anInt2588 < 102) {
                return false;
            } else if (i_3 == i_2 && i_5 == i_4) {
                return method3271(i_1, i_2, i_4) && method3299(class200_6);
            } else {
                for (int i_7 = i_2; i_7 <= i_3; i_7++) {
                    for (int i_8 = i_4; i_8 <= i_5; i_8++) {
                        if (anIntArrayArrayArray2551[i_1][i_7][i_8] == -aClass206_2546.anInt2609) {
                            return false;
                        }
                    }
                }

                return method3299(class200_6);
            }
        } else {
            return false;
        }
    }

    boolean method3275(GraphNode_Sub1_Sub5 class521_sub1_sub5_1, int i_2, int i_3, int i_4) {
        if (aBool2552 && aBool2542) {
            if (aClass205_2547.anInt2588 < 102) {
                return false;
            } else if (!method3271(i_2, i_3, i_4)) {
                return false;
            } else {
                int i_5 = i_3 << aClass206_2546.anInt2592;
                int i_6 = i_4 << aClass206_2546.anInt2592;
                int i_7 = aClass206_2546.aGroundArray2591[i_2].getHeight(i_3, i_4) - 1;
                int i_8 = i_7 + class521_sub1_sub5_1.method12995();
                return class521_sub1_sub5_1.aShort9615 == 1 ? (method3277(i_5, i_7, i_6, i_5, i_8, i_6, i_5, i_8, aClass206_2546.anInt2593 + i_6) && method3277(i_5, i_7, i_6, i_5, i_8, aClass206_2546.anInt2593 + i_6, i_5, i_7, aClass206_2546.anInt2593 + i_6)) : (class521_sub1_sub5_1.aShort9615 == 2 ? (method3277(i_5, i_7, aClass206_2546.anInt2593 + i_6, aClass206_2546.anInt2593 + i_5, i_8, aClass206_2546.anInt2593 + i_6, i_5, i_8, aClass206_2546.anInt2593 + i_6) && method3277(i_5, i_7, aClass206_2546.anInt2593 + i_6, aClass206_2546.anInt2593 + i_5, i_7, aClass206_2546.anInt2593 + i_6, aClass206_2546.anInt2593 + i_5, i_8, aClass206_2546.anInt2593 + i_6)) : (class521_sub1_sub5_1.aShort9615 == 4 ? (method3277(aClass206_2546.anInt2593 + i_5, i_7, i_6, aClass206_2546.anInt2593 + i_5, i_8, i_6, aClass206_2546.anInt2593 + i_5, i_8, aClass206_2546.anInt2593 + i_6) && method3277(aClass206_2546.anInt2593 + i_5, i_7, i_6, aClass206_2546.anInt2593 + i_5, i_8, aClass206_2546.anInt2593 + i_6, aClass206_2546.anInt2593 + i_5, i_7, aClass206_2546.anInt2593 + i_6)) : (class521_sub1_sub5_1.aShort9615 == 8 ? (method3277(i_5, i_7, i_6, aClass206_2546.anInt2593 + i_5, i_8, i_6, i_5, i_8, i_6) && method3277(i_5, i_7, i_6, aClass206_2546.anInt2593 + i_5, i_7, i_6, aClass206_2546.anInt2593 + i_5, i_8, i_6)) : (class521_sub1_sub5_1.aShort9615 == 16 ? method3276(i_5, i_7, aClass206_2546.anInt2594 + i_6, aClass206_2546.anInt2594, i_8, aClass206_2546.anInt2594) : (class521_sub1_sub5_1.aShort9615 == 32 ? method3276(aClass206_2546.anInt2594 + i_5, i_7, aClass206_2546.anInt2594 + i_6, aClass206_2546.anInt2594, i_8, aClass206_2546.anInt2594) : (class521_sub1_sub5_1.aShort9615 == 64 ? method3276(aClass206_2546.anInt2594 + i_5, i_7, i_6, aClass206_2546.anInt2594, i_8, aClass206_2546.anInt2594) : (class521_sub1_sub5_1.aShort9615 != 128 || method3276(i_5, i_7, i_6, aClass206_2546.anInt2594, i_8, aClass206_2546.anInt2594))))))));
            }
        } else {
            return false;
        }
    }

    boolean method3276(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = i_4 + i_1;
        int i_8 = i_5 + i_2;
        int i_9 = i_3 + i_6;
        if (!method3277(i_1, i_8, i_3, i_7, i_8, i_9, i_1, i_8, i_9)) {
            return false;
        } else if (!method3277(i_1, i_8, i_3, i_7, i_8, i_3, i_7, i_8, i_9)) {
            return false;
        } else {
            if (i_1 < aClass206_2546.anInt2630) {
                if (!method3277(i_1, i_2, i_9, i_1, i_8, i_3, i_1, i_8, i_9)) {
                    return false;
                }

                if (!method3277(i_1, i_2, i_9, i_1, i_2, i_3, i_1, i_8, i_3)) {
                    return false;
                }
            } else {
                if (!method3277(i_7, i_2, i_9, i_7, i_8, i_3, i_7, i_8, i_9)) {
                    return false;
                }

                if (!method3277(i_7, i_2, i_9, i_7, i_2, i_3, i_7, i_8, i_3)) {
                    return false;
                }
            }

            if (i_3 < aClass206_2546.anInt2650) {
                if (!method3277(i_1, i_2, i_3, i_7, i_8, i_3, i_1, i_8, i_3)) {
                    return false;
                }

                return method3277(i_1, i_2, i_3, i_7, i_2, i_3, i_7, i_8, i_3);
            } else {
                if (!method3277(i_1, i_2, i_9, i_7, i_8, i_9, i_1, i_8, i_9)) {
                    return false;
                }

                return method3277(i_1, i_2, i_9, i_7, i_2, i_9, i_7, i_8, i_9);
            }
        }
    }

    boolean method3277(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        int i_11 = i_1;
        int i_21 = i_2;
        int i_31 = i_3;
        int i_41 = i_4;
        int i_51 = i_5;
        int i_61 = i_6;
        int i_71 = i_7;
        int i_81 = i_8;
        int i_91 = i_9;
        if (!method3270(i_11, i_21, i_31)) {
            return false;
        } else {
            i_11 = (int) aFloatArray2554[0];
            i_21 = (int) aFloatArray2554[1];
            i_31 = (int) aFloatArray2554[2];
            if (!method3270(i_41, i_51, i_61)) {
                return false;
            } else {
                i_41 = (int) aFloatArray2554[0];
                i_51 = (int) aFloatArray2554[1];
                i_61 = (int) aFloatArray2554[2];
                if (!method3270(i_71, i_81, i_91)) {
                    return false;
                } else {
                    i_71 = (int) aFloatArray2554[0];
                    i_81 = (int) aFloatArray2554[1];
                    i_91 = (int) aFloatArray2554[2];
                    return aClass205_2547.method3371(i_21, i_51, i_81, i_11, i_41, i_71, i_31, i_61, i_91);
                }
            }
        }
    }

    void method3281(AbstractRenderer graphicalrenderer_1, Class231 class231_2, int i_3) {
        aAbstractRenderer_2566 = graphicalrenderer_1;
        int i_4;
        if (anIntArray2569 != null && class231_2.aByte2865 >= i_3) {
            for (i_4 = 0; i_4 < anIntArray2569.length; i_4++) {
                if (anIntArray2569[i_4] != -1000000 && (class231_2.anIntArray2871[0] <= anIntArray2569[i_4] || class231_2.anIntArray2871[1] <= anIntArray2569[i_4] || class231_2.anIntArray2871[2] <= anIntArray2569[i_4] || class231_2.anIntArray2871[3] <= anIntArray2569[i_4]) && (class231_2.anIntArray2859[0] <= anIntArray2562[i_4] || class231_2.anIntArray2859[1] <= anIntArray2562[i_4] || class231_2.anIntArray2859[2] <= anIntArray2562[i_4] || class231_2.anIntArray2859[3] <= anIntArray2562[i_4]) && (class231_2.anIntArray2859[0] >= anIntArray2561[i_4] || class231_2.anIntArray2859[1] >= anIntArray2561[i_4] || class231_2.anIntArray2859[2] >= anIntArray2561[i_4] || class231_2.anIntArray2859[3] >= anIntArray2561[i_4]) && (class231_2.anIntArray2864[0] <= anIntArray2568[i_4] || class231_2.anIntArray2864[1] <= anIntArray2568[i_4] || class231_2.anIntArray2864[2] <= anIntArray2568[i_4] || class231_2.anIntArray2864[3] <= anIntArray2568[i_4]) && (class231_2.anIntArray2864[0] >= anIntArray2560[i_4] || class231_2.anIntArray2864[1] >= anIntArray2560[i_4] || class231_2.anIntArray2864[2] >= anIntArray2560[i_4] || class231_2.anIntArray2864[3] >= anIntArray2560[i_4])) {
                    return;
                }
            }
        }

        int i_5;
        int i_6;
        boolean bool_7;
        float f_8;
        if (class231_2.aByte2863 == 1) {
            i_4 = aClass206_2546.anInt2652 + (class231_2.aShort2866 - aClass206_2546.anInt2628);
            if (i_4 >= 0 && i_4 <= aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                i_5 = aClass206_2546.anInt2652 + (class231_2.aShort2868 - aClass206_2546.anInt2629);
                if (i_5 < 0) {
                    i_5 = 0;
                } else if (i_5 > aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                    return;
                }

                i_6 = aClass206_2546.anInt2652 + (class231_2.aShort2869 - aClass206_2546.anInt2629);
                if (i_6 > aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                    i_6 = aClass206_2546.anInt2652 + aClass206_2546.anInt2652;
                } else if (i_6 < 0) {
                    return;
                }

                bool_7 = false;

                while (i_5 <= i_6) {
                    if (aClass206_2546.aBoolArrayArray2651[i_4][i_5++]) {
                        bool_7 = true;
                        break;
                    }
                }

                if (bool_7) {
                    f_8 = (aClass206_2546.anInt2630 - class231_2.anIntArray2859[0]);
                    if (f_8 < 0.0F) {
                        f_8 *= -1.0f;
                    }

                    if (f_8 >= anInt2549 && method3269(class231_2, 0) && method3269(class231_2, 1) && method3269(class231_2, 2) && method3269(class231_2, 3)) {
                        aClass231Array2559[anInt2564++] = class231_2;
                    }
                }
            }
        } else if (class231_2.aByte2863 == 2) {
            i_4 = aClass206_2546.anInt2652 + (class231_2.aShort2868 - aClass206_2546.anInt2629);
            if (i_4 >= 0 && i_4 <= aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                i_5 = aClass206_2546.anInt2652 + (class231_2.aShort2866 - aClass206_2546.anInt2628);
                if (i_5 < 0) {
                    i_5 = 0;
                } else if (i_5 > aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                    return;
                }

                i_6 = aClass206_2546.anInt2652 + (class231_2.aShort2867 - aClass206_2546.anInt2628);
                if (i_6 > aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                    i_6 = aClass206_2546.anInt2652 + aClass206_2546.anInt2652;
                } else if (i_6 < 0) {
                    return;
                }

                bool_7 = false;

                while (i_5 <= i_6) {
                    if (aClass206_2546.aBoolArrayArray2651[i_5++][i_4]) {
                        bool_7 = true;
                        break;
                    }
                }

                if (bool_7) {
                    f_8 = (aClass206_2546.anInt2650 - class231_2.anIntArray2864[0]);
                    if (f_8 < 0.0F) {
                        f_8 *= -1.0f;
                    }

                    if (f_8 >= anInt2549 && method3269(class231_2, 0) && method3269(class231_2, 1) && method3269(class231_2, 2) && method3269(class231_2, 3)) {
                        aClass231Array2559[anInt2564++] = class231_2;
                    }
                }
            }
        } else if (class231_2.aByte2863 != 16 && class231_2.aByte2863 != 8) {
            if (class231_2.aByte2863 == 4) {
                float f_12 = (class231_2.anIntArray2871[0] - aClass206_2546.anInt2632);
                if (f_12 > anInt2563) {
                    i_5 = aClass206_2546.anInt2652 + (class231_2.aShort2868 - aClass206_2546.anInt2629);
                    if (i_5 < 0) {
                        i_5 = 0;
                    } else if (i_5 > aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                        return;
                    }

                    i_6 = aClass206_2546.anInt2652 + (class231_2.aShort2869 - aClass206_2546.anInt2629);
                    if (i_6 > aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                        i_6 = aClass206_2546.anInt2652 + aClass206_2546.anInt2652;
                    } else if (i_6 < 0) {
                        return;
                    }

                    int i_15 = aClass206_2546.anInt2652 + (class231_2.aShort2866 - aClass206_2546.anInt2628);
                    if (i_15 < 0) {
                        i_15 = 0;
                    } else if (i_15 > aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                        return;
                    }

                    int i_16 = aClass206_2546.anInt2652 + (class231_2.aShort2867 - aClass206_2546.anInt2628);
                    if (i_16 > aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                        i_16 = aClass206_2546.anInt2652 + aClass206_2546.anInt2652;
                    } else if (i_16 < 0) {
                        return;
                    }

                    boolean bool_9 = false;

                    label215:
                    for (int i_10 = i_15; i_10 <= i_16; i_10++) {
                        for (int i_11 = i_5; i_11 <= i_6; i_11++) {
                            if (aClass206_2546.aBoolArrayArray2651[i_10][i_11]) {
                                bool_9 = true;
                                break label215;
                            }
                        }
                    }

                    if (bool_9 && method3269(class231_2, 0) && method3269(class231_2, 1) && method3269(class231_2, 2) && method3269(class231_2, 3)) {
                        aClass231Array2559[anInt2564++] = class231_2;
                    }
                }
            }
        } else {
            i_4 = aClass206_2546.anInt2652 + (class231_2.aShort2866 - aClass206_2546.anInt2628);
            if (i_4 >= 0 && i_4 <= aClass206_2546.anInt2652 + aClass206_2546.anInt2652) {
                i_5 = aClass206_2546.anInt2652 + (class231_2.aShort2868 - aClass206_2546.anInt2629);
                if (i_5 >= 0 && i_5 <= aClass206_2546.anInt2652 + aClass206_2546.anInt2652 && aClass206_2546.aBoolArrayArray2651[i_4][i_5]) {
                    float f_13 = (aClass206_2546.anInt2630 - class231_2.anIntArray2859[0]);
                    if (f_13 < 0.0F) {
                        f_13 *= -1.0f;
                    }

                    float f_14 = (aClass206_2546.anInt2650 - class231_2.anIntArray2864[0]);
                    if (f_14 < 0.0F) {
                        f_14 *= -1.0f;
                    }

                    if ((f_13 >= anInt2549 || f_14 >= anInt2549) && method3269(class231_2, 0) && method3269(class231_2, 1) && method3269(class231_2, 2) && method3269(class231_2, 3)) {
                        aClass231Array2559[anInt2564++] = class231_2;
                    }
                }
            }
        }

    }

    public void method3297(int i_1, int i_2, int i_3, int i_4) {
        if (i_1 != 8 && i_1 != 16) {
            Class293 class293_5 = aClass206_2546.aClass293ArrayArrayArray2604[i_2][i_3][i_4];
            if (class293_5 != null) {
                if (i_1 == 1) {
                    class293_5.aShort3508 = 0;
                } else if (i_1 == 2) {
                    class293_5.aShort3510 = 0;
                }
            }

            method3309();
        } else {
            for (int i_7 = 0; i_7 < anInt2556; i_7++) {
                Class231 class231_6 = aClass231Array2557[i_7];
                if (class231_6.aByte2863 == i_1 && i_2 == class231_6.aByte2865 && (i_3 == class231_6.aShort2866 && i_4 == class231_6.aShort2868 || i_3 == class231_6.aShort2867 && i_4 == class231_6.aShort2869)) {
                    if (i_7 != anInt2556) {
                        System.arraycopy(aClass231Array2557, i_7 + 1, aClass231Array2557, i_7, aClass231Array2557.length - (i_7 + 1));
                    }

                    --anInt2556;
                    break;
                }
            }
        }

    }

    boolean method3299(Class200 class200_1) {
        return class200_1 != null && method3276(class200_1.anInt2535, class200_1.anInt2537, class200_1.anInt2539, class200_1.anInt2536 - class200_1.anInt2535, class200_1.anInt2538 - class200_1.anInt2537, class200_1.anInt2531 - class200_1.anInt2539);
    }

    void method3309() {
        int i_1;
        for (i_1 = 0; i_1 < anInt2545; i_1++) {
            aClass231Array2555[i_1] = null;
        }

        anInt2545 = 0;

        int i_2;
        int i_3;
        Class293 class293_4;
        for (i_1 = 0; i_1 < aClass206_2546.anInt2601; i_1++) {
            for (i_2 = 0; i_2 < aClass206_2546.sizeX; i_2++) {
                for (i_3 = 0; i_3 < aClass206_2546.sizeY; i_3++) {
                    class293_4 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_2];
                    if (class293_4 != null) {
                        if (class293_4.aShort3508 > 0) {
                            class293_4.aShort3508 *= -1;
                        }

                        if (class293_4.aShort3510 > 0) {
                            class293_4.aShort3510 *= -1;
                        }
                    }
                }
            }
        }

        for (i_1 = 0; i_1 < aClass206_2546.anInt2601; i_1++) {
            for (i_2 = 0; i_2 < aClass206_2546.sizeX; i_2++) {
                for (i_3 = 0; i_3 < aClass206_2546.sizeY; i_3++) {
                    class293_4 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_2];
                    if (class293_4 != null) {
                        boolean bool_5 = aClass206_2546.aClass293ArrayArrayArray2604[0][i_3][i_2] != null && aClass206_2546.aClass293ArrayArrayArray2604[0][i_3][i_2].aClass293_3509 != null;
                        int i_6;
                        int i_7;
                        int i_9;
                        Class293 class293_10;
                        int i_11;
                        int i_12;
                        int i_13;
                        int i_14;
                        int i_15;
                        int i_16;
                        int i_17;
                        int i_18;
                        int i_19;
                        int i_20;
                        int i_21;
                        if (class293_4.aShort3508 < 0) {
                            i_6 = i_2;
                            i_7 = i_2;
                            i_9 = i_1;
                            class293_10 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_2 - 1];

                            for (i_11 = aClass206_2546.aGroundArray2607[i_1].getHeight(i_3, i_2); i_6 > 0 && class293_10 != null && class293_10.aShort3508 < 0 && class293_10.aShort3508 == class293_4.aShort3508 && class293_10.aShort3501 == class293_4.aShort3501 && i_11 == aClass206_2546.aGroundArray2607[i_1].getHeight(i_3, i_6 - 1) && (i_6 - 1 <= 0 || i_11 == aClass206_2546.aGroundArray2607[i_1].getHeight(i_3, i_6 - 2)) && i_7 - i_6 <= 10; class293_10 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_6 - 1]) {
                                --i_6;
                            }

                            for (class293_10 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_7 + 1]; i_7 < aClass206_2546.sizeY && class293_10 != null && class293_10.aShort3508 < 0 && class293_10.aShort3508 == class293_4.aShort3508 && class293_10.aShort3501 == class293_4.aShort3501 && i_11 == aClass206_2546.aGroundArray2607[i_1].getHeight(i_3, i_7 + 1) && (i_7 + 1 >= aClass206_2546.sizeY || i_11 == aClass206_2546.aGroundArray2607[i_1].getHeight(i_3, i_7 + 2)) && i_7 - i_6 <= 10; class293_10 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_7 + 1]) {
                                ++i_7;
                            }

                            i_12 = 0 + 1;
                            i_13 = aClass206_2546.aGroundArray2607[bool_5 ? i_1 + 1 : i_1].getHeight(i_3, i_6);
                            i_14 = i_13 + i_12 * class293_4.aShort3508;
                            i_15 = aClass206_2546.aGroundArray2607[bool_5 ? i_1 + 1 : i_1].getHeight(i_3, i_7 + 1);
                            i_16 = i_15 + i_12 * class293_4.aShort3508;
                            i_17 = i_3 << aClass206_2546.anInt2592;
                            i_18 = i_6 << aClass206_2546.anInt2592;
                            i_19 = (i_7 << aClass206_2546.anInt2592) + aClass206_2546.anInt2593;
                            aClass231Array2555[anInt2545++] = new Class231(aClass206_2546, 1, i_1, i_17 + class293_4.aShort3501, i_17 + class293_4.aShort3501, i_17 + class293_4.aShort3501, i_17 + class293_4.aShort3501, i_13, i_15, i_16, i_14, i_18, i_19, i_19, i_18);

                            for (i_20 = i_1; i_20 <= i_9; i_20++) {
                                for (i_21 = i_6; i_21 <= i_7; i_21++) {
                                    aClass206_2546.aClass293ArrayArrayArray2604[i_20][i_3][i_21].aShort3508 *= -1;
                                }
                            }
                        }

                        if (class293_4.aShort3510 < 0) {
                            i_6 = i_3;
                            i_7 = i_3;
                            i_9 = i_1;
                            class293_10 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3 - 1][i_2];

                            for (i_11 = aClass206_2546.aGroundArray2607[i_1].getHeight(i_3, i_2); i_6 > 0 && class293_10 != null && class293_10.aShort3510 < 0 && class293_10.aShort3510 == class293_4.aShort3510 && class293_10.aShort3511 == class293_4.aShort3511 && i_11 == aClass206_2546.aGroundArray2607[i_1].getHeight(i_6 - 1, i_2) && (i_6 - 1 <= 0 || i_11 == aClass206_2546.aGroundArray2607[i_1].getHeight(i_6 - 2, i_2)) && i_7 - i_6 <= 10; class293_10 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_6 - 1][i_2]) {
                                --i_6;
                            }

                            for (class293_10 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_7 + 1][i_2]; i_7 < aClass206_2546.sizeX && class293_10 != null && class293_10.aShort3510 < 0 && class293_10.aShort3510 == class293_4.aShort3510 && class293_10.aShort3511 == class293_4.aShort3511 && i_11 == aClass206_2546.aGroundArray2607[i_1].getHeight(i_7 + 1, i_2) && (i_7 + 1 >= aClass206_2546.sizeX || i_11 == aClass206_2546.aGroundArray2607[i_1].getHeight(i_7 + 2, i_2)) && i_7 - i_6 <= 10; class293_10 = aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_7 + 1][i_2]) {
                                ++i_7;
                            }

                            i_12 = 0 + 1;
                            i_13 = aClass206_2546.aGroundArray2607[bool_5 ? i_1 + 1 : i_1].getHeight(i_6, i_2);
                            i_14 = i_13 + i_12 * class293_4.aShort3510;
                            i_15 = aClass206_2546.aGroundArray2607[bool_5 ? i_1 + 1 : i_1].getHeight(i_7 + 1, i_2);
                            i_16 = i_15 + i_12 * class293_4.aShort3510;
                            i_17 = i_6 << aClass206_2546.anInt2592;
                            i_18 = (i_7 << aClass206_2546.anInt2592) + aClass206_2546.anInt2593;
                            i_19 = i_2 << aClass206_2546.anInt2592;
                            aClass231Array2555[anInt2545++] = new Class231(aClass206_2546, 2, i_1, i_17, i_18, i_18, i_17, i_13, i_15, i_16, i_14, i_19 + class293_4.aShort3511, i_19 + class293_4.aShort3511, i_19 + class293_4.aShort3511, i_19 + class293_4.aShort3511);

                            for (i_20 = i_1; i_20 <= i_9; i_20++) {
                                for (i_21 = i_6; i_21 <= i_7; i_21++) {
                                    aClass206_2546.aClass293ArrayArrayArray2604[i_20][i_21][i_2].aShort3510 *= -1;
                                }
                            }
                        }
                    }
                }
            }
        }

        aBool2548 = true;
    }

}
