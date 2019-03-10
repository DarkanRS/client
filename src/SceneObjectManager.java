import java.util.Iterator;

public class SceneObjectManager {

    public static boolean aBool2644 = true;

    public Class293[][][] aClass293ArrayArrayArray2604;

    public Ground[] aClass390Array2591;

    public int anInt2601;

    int anInt2616 = 0;

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

    Class282_Sub24[] aClass282_Sub24Array2642;

    GraphicalRenderer aClass505_2596;

    boolean aBool2598;

    public int anInt2592;

    int anInt2593;

    int anInt2594;

    public int anInt2617;

    public int anInt2603;

    int anInt2652;

    Class454 aClass454_2597;

    public Class201 aClass201_2600;

    public Class293[][][] aClass293ArrayArrayArray2610;

    public Ground[] aClass390Array2607;

    int[][] colors;

    byte[][] intensities;

    short[][] scales;

    byte[][] waterRelatedArray4;

    byte[][] waterRelatedArray5;

    byte[][] waterRelatedArray6;

    public Class293[][][] waterRelatedClassArray1;

    public Ground[] aClass390Array2614;

    long[][][] aLongArrayArrayArray2645;

    Class287[] aClass287Array2646;

    boolean[] aBoolArray2647;

    Class521_Sub1[] aClass521_Sub1Array2605;

    Class521_Sub1[] aClass521_Sub1Array2633;

    Class521_Sub1[] aClass521_Sub1Array2649;

    Class521_Sub1[] aClass521_Sub1Array2626;

    Class521_Sub1[] aClass521_Sub1Array2625;

    Class521_Sub1_Sub1[] aClass521_Sub1_Sub1Array2627;

    int[] anIntArray2641;

    public Login aClass284_2648;

    public void method3378(int i_1, int i_2) {
    }

    public void method3379(FontRenderer fontrenderer_1, byte b_2) {
    }

    public void method3380(boolean bool_1, int i_2) {
        if (bool_1) {
            this.aClass293ArrayArrayArray2604 = this.waterRelatedClassArray1;
            this.aClass390Array2591 = this.aClass390Array2614;
        } else {
            this.aClass293ArrayArrayArray2604 = this.aClass293ArrayArrayArray2610;
            this.aClass390Array2591 = this.aClass390Array2607;
        }
        this.anInt2601 = this.aClass293ArrayArrayArray2604.length;
    }

    public Class521_Sub1_Sub5 getWall(int i_1, int i_2, int i_3, byte b_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aClass521_Sub1_Sub5_3505;
    }

    public void method3382(int i_1, int i_2, int i_3) {
        Class293 class293_4 = this.aClass293ArrayArrayArray2604[0][i_1][i_2];
        for (int i_5 = 0; i_5 < 3; i_5++) {
            Class293 class293_6 = this.aClass293ArrayArrayArray2604[i_5][i_1][i_2] = this.aClass293ArrayArrayArray2604[i_5 + 1][i_1][i_2];
            if (class293_6 != null) {
                for (Class208 class208_7 = class293_6.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                    Class521_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aClass521_Sub1_Sub1_2659;
                    if (class521_sub1_sub1_8.aShort9458 == i_1 && i_2 == class521_sub1_sub1_8.aShort9456) {
                        class521_sub1_sub1_8.plane = (byte) (class521_sub1_sub1_8.plane - 1);
                    }
                }
                if (class293_6.aClass521_Sub1_Sub3_3499 != null) {
                    class293_6.aClass521_Sub1_Sub3_3499.plane = (byte) (class293_6.aClass521_Sub1_Sub3_3499.plane - 1);
                }
                if (class293_6.aClass521_Sub1_Sub5_3505 != null) {
                    class293_6.aClass521_Sub1_Sub5_3505.plane = (byte) (class293_6.aClass521_Sub1_Sub5_3505.plane - 1);
                }
                if (class293_6.aClass521_Sub1_Sub5_3502 != null) {
                    class293_6.aClass521_Sub1_Sub5_3502.plane = (byte) (class293_6.aClass521_Sub1_Sub5_3502.plane - 1);
                }
                if (class293_6.aClass521_Sub1_Sub4_3503 != null) {
                    class293_6.aClass521_Sub1_Sub4_3503.plane = (byte) (class293_6.aClass521_Sub1_Sub4_3503.plane - 1);
                }
                if (class293_6.aClass521_Sub1_Sub4_3500 != null) {
                    class293_6.aClass521_Sub1_Sub4_3500.plane = (byte) (class293_6.aClass521_Sub1_Sub4_3500.plane - 1);
                }
            }
        }
        if (this.aClass293ArrayArrayArray2604[0][i_1][i_2] == null) {
            this.aClass293ArrayArrayArray2604[0][i_1][i_2] = new Class293(0);
            this.aClass293ArrayArrayArray2604[0][i_1][i_2].aByte3507 = 1;
        }
        this.aClass293ArrayArrayArray2604[0][i_1][i_2].aClass293_3509 = class293_4;
        this.aClass293ArrayArrayArray2604[3][i_1][i_2] = null;
    }

    public void method3384(int i_1, int i_2, int i_3, byte b_4) {
        boolean bool_5 = this.aClass293ArrayArrayArray2604[0][i_2][i_3] != null && this.aClass293ArrayArrayArray2604[0][i_2][i_3].aClass293_3509 != null;
        for (int i_6 = i_1; i_6 >= 0; --i_6) {
            if (this.aClass293ArrayArrayArray2604[i_6][i_2][i_3] == null) {
                Class293 class293_7 = this.aClass293ArrayArrayArray2604[i_6][i_2][i_3] = new Class293(i_6);
                if (bool_5) {
                    ++class293_7.aByte3507;
                }
            }
        }
    }

    public void method3385(int i_1, Ground class390_2, int i_3) {
        this.aClass390Array2591[i_1] = class390_2;
    }

    public int getScale(int i_1, int i_2, int i_3) {
        return this.scales != null ? this.scales[i_1][i_2] & 0xffff : 0;
    }

    public int getColor(int i_1, int i_2, byte b_3) {
        return this.colors != null ? this.colors[i_1][i_2] & 0xffffff : 0;
    }

    public int method3391(int i_1, int i_2, int i_3) {
        return this.waterRelatedArray6 != null ? this.waterRelatedArray6[i_1][i_2] & 0xff : 0;
    }

    public void method3392(int x, int y, int waterColor, int waterScale, int waterIntensity, int i_6, int i_7, int i_8, short s_9) {
        if (this.colors != null) {
            this.colors[x][y] = ~0xffffff | waterColor;
        }
        if (this.scales != null) {
            this.scales[x][y] = (short) waterScale;
        }
        if (this.intensities != null) {
            this.intensities[x][y] = (byte) waterIntensity;
        }
        if (this.waterRelatedArray4 != null) {
            this.waterRelatedArray4[x][y] = (byte) i_6;
        }
        if (this.waterRelatedArray5 != null) {
            this.waterRelatedArray5[x][y] = (byte) i_7;
        }
        if (this.waterRelatedArray6 != null) {
            this.waterRelatedArray6[x][y] = (byte) i_8;
        }
    }

    public void method3393(int i_1, int i_2, int i_3, SceneObjectNode sceneobjectnode_4, int i_5) {
        Class293 class293_6 = this.method3459(i_1, i_2, i_3, -204527757);
        if (class293_6 != null) {
            class293_6.aClass521_Sub1_Sub3_3499 = sceneobjectnode_4;
            int i_7 = this.aClass390Array2591 == this.aClass390Array2614 ? 1 : 0;
            if (sceneobjectnode_4.method12986(-152076894)) {
                if (sceneobjectnode_4.method12987(1864171775)) {
                    sceneobjectnode_4.aClass521_Sub1_7966 = this.aClass521_Sub1Array2633[i_7];
                    this.aClass521_Sub1Array2633[i_7] = sceneobjectnode_4;
                } else {
                    sceneobjectnode_4.aClass521_Sub1_7966 = this.aClass521_Sub1Array2605[i_7];
                    this.aClass521_Sub1Array2605[i_7] = sceneobjectnode_4;
                }
            } else {
                sceneobjectnode_4.aClass521_Sub1_7966 = this.aClass521_Sub1Array2649[i_7];
                this.aClass521_Sub1Array2649[i_7] = sceneobjectnode_4;
            }
        }
    }

    public void method3394(int i_1, int i_2, int i_3, int i_4, Class521_Sub1_Sub2 class521_sub1_sub2_5, byte b_6) {
        Class293 class293_7 = this.method3459(i_1, i_2, i_3, 546259933);
        if (class293_7 != null) {
            class521_sub1_sub2_5.method11171(new Vector3((float) ((i_2 << this.anInt2592) + this.anInt2594), (float) i_4, (float) ((i_3 << this.anInt2592) + this.anInt2594)));
            class293_7.aClass521_Sub1_Sub2_3506 = class521_sub1_sub2_5;
            int i_8 = this.aClass390Array2614 == this.aClass390Array2591 ? 1 : 0;
            if (class521_sub1_sub2_5.method12986(-1465902560)) {
                if (class521_sub1_sub2_5.method12987(-1746699245)) {
                    class521_sub1_sub2_5.aClass521_Sub1_7966 = this.aClass521_Sub1Array2633[i_8];
                    this.aClass521_Sub1Array2633[i_8] = class521_sub1_sub2_5;
                } else {
                    class521_sub1_sub2_5.aClass521_Sub1_7966 = this.aClass521_Sub1Array2605[i_8];
                    this.aClass521_Sub1Array2605[i_8] = class521_sub1_sub2_5;
                }
            } else {
                class521_sub1_sub2_5.aClass521_Sub1_7966 = this.aClass521_Sub1Array2649[i_8];
                this.aClass521_Sub1Array2649[i_8] = class521_sub1_sub2_5;
            }
        }
    }

    public void method3395(int i_1, int i_2, int i_3, Class521_Sub1_Sub5 class521_sub1_sub5_4, Class521_Sub1_Sub5 class521_sub1_sub5_5, int i_6) {
        Class293 class293_7 = this.method3459(i_1, i_2, i_3, -322644171);
        if (class293_7 != null) {
            class293_7.aClass521_Sub1_Sub5_3505 = class521_sub1_sub5_4;
            class293_7.aClass521_Sub1_Sub5_3502 = class521_sub1_sub5_5;
            int i_8 = this.aClass390Array2614 == this.aClass390Array2591 ? 1 : 0;
            if (class521_sub1_sub5_4.method12986(-422075919)) {
                if (class521_sub1_sub5_4.method12987(-1845208495)) {
                    class521_sub1_sub5_4.aClass521_Sub1_7966 = this.aClass521_Sub1Array2633[i_8];
                    this.aClass521_Sub1Array2633[i_8] = class521_sub1_sub5_4;
                } else {
                    class521_sub1_sub5_4.aClass521_Sub1_7966 = this.aClass521_Sub1Array2605[i_8];
                    this.aClass521_Sub1Array2605[i_8] = class521_sub1_sub5_4;
                }
            } else {
                class521_sub1_sub5_4.aClass521_Sub1_7966 = this.aClass521_Sub1Array2649[i_8];
                this.aClass521_Sub1Array2649[i_8] = class521_sub1_sub5_4;
            }
            if (class521_sub1_sub5_5 != null) {
                if (class521_sub1_sub5_5.method12986(-1805444814)) {
                    if (class521_sub1_sub5_5.method12987(-1456067745)) {
                        class521_sub1_sub5_5.aClass521_Sub1_7966 = this.aClass521_Sub1Array2633[i_8];
                        this.aClass521_Sub1Array2633[i_8] = class521_sub1_sub5_5;
                    } else {
                        class521_sub1_sub5_5.aClass521_Sub1_7966 = this.aClass521_Sub1Array2605[i_8];
                        this.aClass521_Sub1Array2605[i_8] = class521_sub1_sub5_5;
                    }
                } else {
                    class521_sub1_sub5_5.aClass521_Sub1_7966 = this.aClass521_Sub1Array2649[i_8];
                    this.aClass521_Sub1Array2649[i_8] = class521_sub1_sub5_5;
                }
            }
        }
    }

    public void method3396(int i_1, int i_2, int i_3, Class521_Sub1_Sub4 class521_sub1_sub4_4, Class521_Sub1_Sub4 class521_sub1_sub4_5, byte b_6) {
        Class293 class293_7 = this.method3459(i_1, i_2, i_3, -144176397);
        if (class293_7 != null) {
            class293_7.aClass521_Sub1_Sub4_3503 = class521_sub1_sub4_4;
            class293_7.aClass521_Sub1_Sub4_3500 = class521_sub1_sub4_5;
            int i_8 = this.aClass390Array2614 == this.aClass390Array2591 ? 1 : 0;
            if (class521_sub1_sub4_4.method12986(-287475150)) {
                if (class521_sub1_sub4_4.method12987(-1554775076)) {
                    class521_sub1_sub4_4.aClass521_Sub1_7966 = this.aClass521_Sub1Array2633[i_8];
                    this.aClass521_Sub1Array2633[i_8] = class521_sub1_sub4_4;
                } else {
                    class521_sub1_sub4_4.aClass521_Sub1_7966 = this.aClass521_Sub1Array2605[i_8];
                    this.aClass521_Sub1Array2605[i_8] = class521_sub1_sub4_4;
                }
            } else {
                class521_sub1_sub4_4.aClass521_Sub1_7966 = this.aClass521_Sub1Array2649[i_8];
                this.aClass521_Sub1Array2649[i_8] = class521_sub1_sub4_4;
            }
            if (class521_sub1_sub4_5 != null) {
                if (class521_sub1_sub4_5.method12986(-1380725108)) {
                    if (class521_sub1_sub4_5.method12987(-1946462410)) {
                        class521_sub1_sub4_5.aClass521_Sub1_7966 = this.aClass521_Sub1Array2633[i_8];
                        this.aClass521_Sub1Array2633[i_8] = class521_sub1_sub4_5;
                    } else {
                        class521_sub1_sub4_5.aClass521_Sub1_7966 = this.aClass521_Sub1Array2605[i_8];
                        this.aClass521_Sub1Array2605[i_8] = class521_sub1_sub4_5;
                    }
                } else {
                    class521_sub1_sub4_5.aClass521_Sub1_7966 = this.aClass521_Sub1Array2649[i_8];
                    this.aClass521_Sub1Array2649[i_8] = class521_sub1_sub4_5;
                }
            }
        }
    }

    public boolean method3397(Class521_Sub1_Sub1 class521_sub1_sub1_1, boolean bool_2, int i_3) {
        boolean bool_4 = this.aClass390Array2591 == this.aClass390Array2614;
        int i_5 = 0;
        short s_6 = 0;
        byte b_7 = 0;
        class521_sub1_sub1_1.method14697((byte) 115);
        if (class521_sub1_sub1_1.aShort9458 >= 0 && class521_sub1_sub1_1.aShort9456 >= 0 && class521_sub1_sub1_1.localX < this.anInt2617 && class521_sub1_sub1_1.localY < this.anInt2603) {
            short s_8 = 0;
            int i_9;
            int i_10;
            for (i_9 = class521_sub1_sub1_1.aShort9458; i_9 <= class521_sub1_sub1_1.localX; i_9++) {
                for (i_10 = class521_sub1_sub1_1.aShort9456; i_10 <= class521_sub1_sub1_1.localY; i_10++) {
                    Class293 class293_11 = this.method3459(class521_sub1_sub1_1.plane, i_9, i_10, 123590531);
                    if (class293_11 != null) {
                        Class208 class208_12 = Class153.method2622(class521_sub1_sub1_1, -2120940003);
                        Class208 class208_13 = class293_11.aClass208_3504;
                        if (class208_13 == null) {
                            class293_11.aClass208_3504 = class208_12;
                        } else {
                            while (class208_13.aClass208_2660 != null) {
                                class208_13 = class208_13.aClass208_2660;
                            }
                            class208_13.aClass208_2660 = class208_12;
                        }
                        if (bool_4 && (this.colors[i_9][i_10] & ~0xffffff) != 0) {
                            i_5 = this.colors[i_9][i_10];
                            s_6 = this.scales[i_9][i_10];
                            b_7 = this.intensities[i_9][i_10];
                        }
                        if (!bool_2 && class293_11.aClass521_Sub1_Sub3_3499 != null && class293_11.aClass521_Sub1_Sub3_3499.aShort9561 > s_8) {
                            s_8 = class293_11.aClass521_Sub1_Sub3_3499.aShort9561;
                        }
                    }
                }
            }
            if (bool_4 && (i_5 & ~0xffffff) != 0) {
                for (i_9 = class521_sub1_sub1_1.aShort9458; i_9 <= class521_sub1_sub1_1.localX; i_9++) {
                    for (i_10 = class521_sub1_sub1_1.aShort9456; i_10 <= class521_sub1_sub1_1.localY; i_10++) {
                        if ((this.colors[i_9][i_10] & ~0xffffff) == 0) {
                            this.colors[i_9][i_10] = i_5;
                            this.scales[i_9][i_10] = s_6;
                            this.intensities[i_9][i_10] = b_7;
                        }
                    }
                }
            }
            if (bool_2) {
                this.aClass521_Sub1_Sub1Array2627[++this.anInt2616 - 1] = class521_sub1_sub1_1;
                class521_sub1_sub1_1.aClass206_7970 = this;
            } else {
                i_9 = this.aClass390Array2614 == this.aClass390Array2591 ? 1 : 0;
                if (class521_sub1_sub1_1.method12986(-874752575)) {
                    if (class521_sub1_sub1_1.method12987(331122687)) {
                        class521_sub1_sub1_1.aClass521_Sub1_7966 = this.aClass521_Sub1Array2633[i_9];
                        this.aClass521_Sub1Array2633[i_9] = class521_sub1_sub1_1;
                    } else {
                        class521_sub1_sub1_1.aClass521_Sub1_7966 = this.aClass521_Sub1Array2605[i_9];
                        this.aClass521_Sub1Array2605[i_9] = class521_sub1_sub1_1;
                    }
                } else {
                    class521_sub1_sub1_1.aClass521_Sub1_7966 = this.aClass521_Sub1Array2649[i_9];
                    this.aClass521_Sub1Array2649[i_9] = class521_sub1_sub1_1;
                }
            }
            if (bool_2) {
                Vector3 vector3_14 = Vector3.popVectorStackTo(class521_sub1_sub1_1.method11166().aClass385_3595);
                vector3_14.y -= (float) s_8;
                class521_sub1_sub1_1.method11171(vector3_14);
                vector3_14.pushVectorStack();
            }
            return true;
        } else {
            return false;
        }
    }

    public void method3398(int i_1, int i_2, int i_3, int i_4, byte b_5) {
        Class293 class293_6 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_6 != null) {
            Class521_Sub1_Sub4 class521_sub1_sub4_7 = class293_6.aClass521_Sub1_Sub4_3503;
            Class521_Sub1_Sub4 class521_sub1_sub4_8 = class293_6.aClass521_Sub1_Sub4_3500;
            if (class521_sub1_sub4_7 != null) {
                class521_sub1_sub4_7.aShort9611 = (short) (i_4 * class521_sub1_sub4_7.aShort9611 / (16 << this.anInt2592 - 7));
                class521_sub1_sub4_7.aShort9612 = (short) (i_4 * class521_sub1_sub4_7.aShort9612 / (16 << this.anInt2592 - 7));
            }
            if (class521_sub1_sub4_8 != null) {
                class521_sub1_sub4_8.aShort9611 = (short) (i_4 * class521_sub1_sub4_8.aShort9611 / (16 << this.anInt2592 - 7));
                class521_sub1_sub4_8.aShort9612 = (short) (i_4 * class521_sub1_sub4_8.aShort9612 / (16 << this.anInt2592 - 7));
            }
        }
    }

    public void method3399(byte b_1) {
        for (int i_2 = 0; i_2 < this.anInt2616; i_2++) {
            Class521_Sub1_Sub1 class521_sub1_sub1_3 = this.aClass521_Sub1_Sub1Array2627[i_2];
            this.method3407(class521_sub1_sub1_3, true, -1696604087);
            this.aClass521_Sub1_Sub1Array2627[i_2] = null;
        }
        this.anInt2616 = 0;
    }

    public void method3400() {
        for (int i_1 = 0; i_1 < this.anInt2601; i_1++) {
            for (int i_2 = 0; i_2 < this.anInt2617; i_2++) {
                for (int i_3 = 0; i_3 < this.anInt2603; i_3++) {
                    Class293 class293_4 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
                    if (class293_4 != null) {
                        Class521_Sub1_Sub5 class521_sub1_sub5_5 = class293_4.aClass521_Sub1_Sub5_3505;
                        Class521_Sub1_Sub5 class521_sub1_sub5_6 = class293_4.aClass521_Sub1_Sub5_3502;
                        if (class521_sub1_sub5_5 != null && class521_sub1_sub5_5.method12985(-1950778651)) {
                            this.method3452(class521_sub1_sub5_5, i_1, i_2, i_3, 1, 1);
                            if (class521_sub1_sub5_6 != null && class521_sub1_sub5_6.method12985(-770467208)) {
                                this.method3452(class521_sub1_sub5_6, i_1, i_2, i_3, 1, 1);
                                class521_sub1_sub5_6.method13013(this.aClass505_2596, class521_sub1_sub5_5, 0, 0, 0, false, -1985350019);
                                class521_sub1_sub5_6.method12984(150172527);
                            }
                            class521_sub1_sub5_5.method12984(-727923375);
                        }
                        for (Class208 class208_7 = class293_4.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                            Class521_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aClass521_Sub1_Sub1_2659;
                            if (class521_sub1_sub1_8 != null && class521_sub1_sub1_8.method12985(-776427124)) {
                                this.method3452(class521_sub1_sub1_8, i_1, i_2, i_3, class521_sub1_sub1_8.localX - class521_sub1_sub1_8.aShort9458 + 1, class521_sub1_sub1_8.localY - class521_sub1_sub1_8.aShort9456 + 1);
                                class521_sub1_sub1_8.method12984(1378070205);
                            }
                        }
                        SceneObjectNode sceneobjectnode_9 = class293_4.aClass521_Sub1_Sub3_3499;
                        if (sceneobjectnode_9 != null && sceneobjectnode_9.method12985(-1912639539)) {
                            this.method3417(sceneobjectnode_9, i_1, i_2, i_3, 1236537030);
                            sceneobjectnode_9.method12984(107766505);
                        }
                    }
                }
            }
        }
    }

    public Class521_Sub1_Sub4 method3402(int i_1, int i_2, int i_3, byte b_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 != null) {
            this.method3408(class293_5.aClass521_Sub1_Sub4_3503, 1327771301);
            if (class293_5.aClass521_Sub1_Sub4_3503 != null) {
                Class521_Sub1_Sub4 class521_sub1_sub4_6 = class293_5.aClass521_Sub1_Sub4_3503;
                class293_5.aClass521_Sub1_Sub4_3503 = null;
                return class521_sub1_sub4_6;
            }
        }
        return null;
    }

    public SceneObjectNode method3404(int i_1, int i_2, int i_3, int i_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 == null) {
            return null;
        } else {
            this.method3408(class293_5.aClass521_Sub1_Sub3_3499, 2096802032);
            if (class293_5.aClass521_Sub1_Sub3_3499 != null) {
                SceneObjectNode sceneobjectnode_6 = class293_5.aClass521_Sub1_Sub3_3499;
                class293_5.aClass521_Sub1_Sub3_3499 = null;
                return sceneobjectnode_6;
            } else {
                return null;
            }
        }
    }

    public Class521_Sub1_Sub2 method3405(int i_1, int i_2, int i_3, int i_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 == null) {
            return null;
        } else {
            Class521_Sub1_Sub2 class521_sub1_sub2_6 = class293_5.aClass521_Sub1_Sub2_3506;
            class293_5.aClass521_Sub1_Sub2_3506 = null;
            this.method3408(class521_sub1_sub2_6, 1563744432);
            return class521_sub1_sub2_6;
        }
    }

    void method3407(Class521_Sub1_Sub1 class521_sub1_sub1_1, boolean bool_2, int i_3) {
        for (int i_4 = class521_sub1_sub1_1.aShort9458; i_4 <= class521_sub1_sub1_1.localX; i_4++) {
            for (int i_5 = class521_sub1_sub1_1.aShort9456; i_5 <= class521_sub1_sub1_1.localY; i_5++) {
                Class293 class293_6 = this.aClass293ArrayArrayArray2604[class521_sub1_sub1_1.plane][i_4][i_5];
                if (class293_6 != null) {
                    Class208 class208_7 = class293_6.aClass208_3504;
                    for (Class208 class208_8 = null; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                        if (class521_sub1_sub1_1 == class208_7.aClass521_Sub1_Sub1_2659) {
                            if (class208_8 != null) {
                                class208_8.aClass208_2660 = class208_7.aClass208_2660;
                            } else {
                                class293_6.aClass208_3504 = class208_7.aClass208_2660;
                            }
                            class208_7.method3560(508246192);
                            break;
                        }
                        class208_8 = class208_7;
                    }
                }
            }
        }
        if (!bool_2) {
            this.method3408(class521_sub1_sub1_1, 1970492302);
        }
    }

    void method3408(Class521_Sub1 class521_sub1_1, int i_2) {
        if (class521_sub1_1 != null) {
            class521_sub1_1.method11176();
            for (int i_3 = 0; i_3 < 2; i_3++) {
                Class521_Sub1 class521_sub1_4 = null;
                Class521_Sub1 class521_sub1_5;
                for (class521_sub1_5 = this.aClass521_Sub1Array2605[i_3]; class521_sub1_5 != null; class521_sub1_5 = class521_sub1_5.aClass521_Sub1_7966) {
                    if (class521_sub1_5 == class521_sub1_1) {
                        if (class521_sub1_4 != null) {
                            class521_sub1_4.aClass521_Sub1_7966 = class521_sub1_5.aClass521_Sub1_7966;
                        } else {
                            this.aClass521_Sub1Array2605[i_3] = class521_sub1_5.aClass521_Sub1_7966;
                        }
                        return;
                    }
                    class521_sub1_4 = class521_sub1_5;
                }
                class521_sub1_4 = null;
                for (class521_sub1_5 = this.aClass521_Sub1Array2633[i_3]; class521_sub1_5 != null; class521_sub1_5 = class521_sub1_5.aClass521_Sub1_7966) {
                    if (class521_sub1_5 == class521_sub1_1) {
                        if (class521_sub1_4 != null) {
                            class521_sub1_4.aClass521_Sub1_7966 = class521_sub1_5.aClass521_Sub1_7966;
                        } else {
                            this.aClass521_Sub1Array2633[i_3] = class521_sub1_5.aClass521_Sub1_7966;
                        }
                        return;
                    }
                    class521_sub1_4 = class521_sub1_5;
                }
                class521_sub1_4 = null;
                for (class521_sub1_5 = this.aClass521_Sub1Array2649[i_3]; class521_sub1_5 != null; class521_sub1_5 = class521_sub1_5.aClass521_Sub1_7966) {
                    if (class521_sub1_5 == class521_sub1_1) {
                        if (class521_sub1_4 != null) {
                            class521_sub1_4.aClass521_Sub1_7966 = class521_sub1_5.aClass521_Sub1_7966;
                        } else {
                            this.aClass521_Sub1Array2649[i_3] = class521_sub1_5.aClass521_Sub1_7966;
                        }
                        return;
                    }
                    class521_sub1_4 = class521_sub1_5;
                }
            }
        }
    }

    public Class521_Sub1_Sub5 getWall2(int i_1, int i_2, int i_3, int i_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aClass521_Sub1_Sub5_3502;
    }

    public Class521_Sub1_Sub1 getInteractableObject(int i_1, int i_2, int i_3, Interface25 interface25_4, int i_5) {
        Class293 class293_6 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_6 == null) {
            return null;
        } else {
            for (Class208 class208_7 = class293_6.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                Class521_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aClass521_Sub1_Sub1_2659;
                if ((interface25_4 == null || interface25_4.method183(class521_sub1_sub1_8, 1956908464)) && i_2 == class521_sub1_sub1_8.aShort9458 && i_3 == class521_sub1_sub1_8.aShort9456) {
                    return class521_sub1_sub1_8;
                }
            }
            return null;
        }
    }

    public SceneObjectNode getGroundDecoration(int i_1, int i_2, int i_3, int i_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 != null && class293_5.aClass521_Sub1_Sub3_3499 != null ? class293_5.aClass521_Sub1_Sub3_3499 : null;
    }

    void method3417(Class521_Sub1 class521_sub1_1, int i_2, int i_3, int i_4, int i_5) {
        Class293 class293_6;
        if (i_3 < this.anInt2617) {
            class293_6 = this.aClass293ArrayArrayArray2604[i_2][i_3 + 1][i_4];
            if (class293_6 != null && class293_6.aClass521_Sub1_Sub3_3499 != null && class293_6.aClass521_Sub1_Sub3_3499.method12985(-1157326636)) {
                class521_sub1_1.method13013(this.aClass505_2596, class293_6.aClass521_Sub1_Sub3_3499, this.anInt2593, 0, 0, true, -2061518556);
            }
        }
        if (i_4 < this.anInt2617) {
            class293_6 = this.aClass293ArrayArrayArray2604[i_2][i_3][i_4 + 1];
            if (class293_6 != null && class293_6.aClass521_Sub1_Sub3_3499 != null && class293_6.aClass521_Sub1_Sub3_3499.method12985(-1529728389)) {
                class521_sub1_1.method13013(this.aClass505_2596, class293_6.aClass521_Sub1_Sub3_3499, 0, 0, this.anInt2593, true, -1951339273);
            }
        }
        if (i_3 < this.anInt2617 && i_4 < this.anInt2603) {
            class293_6 = this.aClass293ArrayArrayArray2604[i_2][i_3 + 1][i_4 + 1];
            if (class293_6 != null && class293_6.aClass521_Sub1_Sub3_3499 != null && class293_6.aClass521_Sub1_Sub3_3499.method12985(-1925311637)) {
                class521_sub1_1.method13013(this.aClass505_2596, class293_6.aClass521_Sub1_Sub3_3499, this.anInt2593, 0, this.anInt2593, true, -1913658819);
            }
        }
        if (i_3 < this.anInt2617 && i_4 > 0) {
            class293_6 = this.aClass293ArrayArrayArray2604[i_2][i_3 + 1][i_4 - 1];
            if (class293_6 != null && class293_6.aClass521_Sub1_Sub3_3499 != null && class293_6.aClass521_Sub1_Sub3_3499.method12985(-883899381)) {
                class521_sub1_1.method13013(this.aClass505_2596, class293_6.aClass521_Sub1_Sub3_3499, this.anInt2593, 0, -this.anInt2593, true, -1779065543);
            }
        }
    }

    void method3421(Class521_Sub1 class521_sub1_1, byte b_2) {
        Vector3 vector3_3 = class521_sub1_1.method11166().aClass385_3595;
        this.aClass505_2596.method8479((float) ((int) vector3_3.x), (float) ((int) vector3_3.y + (class521_sub1_1.method12995(-353593796) >> 1)), (float) ((int) vector3_3.z), this.aFloatArray2639);
        class521_sub1_1.anInt7969 = (int) this.aFloatArray2639[2];
    }

    public Class521_Sub1_Sub5 method3422(int i_1, int i_2, int i_3, short s_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 != null) {
            this.method3408(class293_5.aClass521_Sub1_Sub5_3505, 1587735516);
            if (class293_5.aClass521_Sub1_Sub5_3505 != null) {
                Class521_Sub1_Sub5 class521_sub1_sub5_6 = class293_5.aClass521_Sub1_Sub5_3505;
                class293_5.aClass521_Sub1_Sub5_3505 = null;
                return class521_sub1_sub5_6;
            }
        }
        return null;
    }

    boolean method3424(Class521_Sub1 class521_sub1_1, boolean bool_2, byte[][][] bytes_3, int i_4, byte b_5) {
        if (!this.aBool2599) {
            return false;
        } else if (class521_sub1_1 instanceof Class521_Sub1_Sub1) {
            short s_6 = ((Class521_Sub1_Sub1) class521_sub1_1).localX;
            short s_13 = ((Class521_Sub1_Sub1) class521_sub1_1).localY;
            short s_14 = ((Class521_Sub1_Sub1) class521_sub1_1).aShort9458;
            short s_9 = ((Class521_Sub1_Sub1) class521_sub1_1).aShort9456;
            for (int i_10 = s_14; i_10 <= s_6; i_10++) {
                for (int i_11 = s_9; i_11 <= s_13; i_11++) {
                    if (class521_sub1_1.aByte7968 < this.anInt2601 && i_10 >= this.anInt2637 && i_10 < this.anInt2638 && i_11 >= this.anInt2621 && i_11 < this.anInt2640) {
                        if ((bytes_3 == null || class521_sub1_1.plane < i_4 || b_5 != bytes_3[class521_sub1_1.plane][i_10][i_11]) && class521_sub1_1.method13029((byte) 1) && !class521_sub1_1.method13037(this.aClass505_2596, 1922998214)) {
                            return false;
                        }
                        if (!bool_2 && i_10 >= this.anInt2628 - 16 && i_10 <= this.anInt2628 + 16 && i_11 >= this.anInt2629 - 16 && i_11 <= this.anInt2629 + 16) {
                            class521_sub1_1.method12991(this.aClass505_2596, -1308770774);
                        }
                        return true;
                    }
                }
            }
            return true;
        } else {
            Vector3 vector3_12 = class521_sub1_1.method11166().aClass385_3595;
            int i_7 = (int) vector3_12.x >> this.anInt2592;
            int i_8 = (int) vector3_12.z >> this.anInt2592;
            if (class521_sub1_1.aByte7968 < this.anInt2601 && i_7 >= this.anInt2637 && i_7 < this.anInt2638 && i_8 >= this.anInt2621 && i_8 < this.anInt2640) {
                if ((bytes_3 == null || class521_sub1_1.plane < i_4 || b_5 != bytes_3[class521_sub1_1.plane][i_7][i_8]) && class521_sub1_1.method13029((byte) -39) && !class521_sub1_1.method13037(this.aClass505_2596, -53758878)) {
                    return false;
                } else {
                    if (!bool_2 && i_7 >= this.anInt2628 - 16 && i_7 <= this.anInt2628 + 16 && i_8 >= this.anInt2629 - 16 && i_8 <= this.anInt2629 + 16) {
                        class521_sub1_1.method12991(this.aClass505_2596, -1131763435);
                    }
                    return true;
                }
            } else {
                return true;
            }
        }
    }

    public boolean method3426(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, boolean[] bools_5, byte b_6) {
        boolean bool_7 = false;
        if (this.aClass390Array2591 != this.aClass390Array2614) {
            int i_8 = this.aClass390Array2607[i_2].averageHeight(i_3, i_4, 1177871260);
            for (int i_9 = 0; i_9 <= i_2; i_9++) {
                Ground class390_10 = this.aClass390Array2607[i_9];
                if (class390_10 != null) {
                    int i_11 = i_8 - class390_10.averageHeight(i_3, i_4, 1885983541);
                    if (bools_5 != null) {
                        bools_5[i_9] = class390_10.method6712(class282_sub50_sub17_1, i_3, i_11, i_4, 0, false);
                        if (!bools_5[i_9]) {
                            continue;
                        }
                    }
                    class390_10.UA(class282_sub50_sub17_1, i_3, i_11, i_4, 0, false);
                    bool_7 = true;
                }
            }
        }
        return bool_7;
    }

    public void method3427(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, boolean[] bools_5, byte b_6) {
        if (this.aClass390Array2614 != this.aClass390Array2591) {
            int i_7 = this.aClass390Array2607[i_2].averageHeight(i_3, i_4, 2131709892);
            for (int i_8 = 0; i_8 <= i_2; i_8++) {
                if (bools_5 == null || bools_5[i_8]) {
                    Ground class390_9 = this.aClass390Array2607[i_8];
                    if (class390_9 != null) {
                        class390_9.NA(class282_sub50_sub17_1, i_3, i_7 - class390_9.averageHeight(i_3, i_4, 159261886), i_4, 0, false);
                    }
                }
            }
        }
    }

    public void method3428(int i_1) {
        for (int i_2 = 0; i_2 < this.anInt2617; i_2++) {
            for (int i_3 = 0; i_3 < this.anInt2603; i_3++) {
                if (this.aClass293ArrayArrayArray2604[0][i_2][i_3] == null) {
                    this.aClass293ArrayArrayArray2604[0][i_2][i_3] = new Class293(0);
                }
            }
        }
    }

    public void method3429(int i_1) {
        this.method3486(1, this.anInt2601, 1563160205);
    }

    public void method3430(Class287 class287_1, byte b_2) {
        if (this.anInt2615 < 65361) {
            Class282_Sub24 class282_sub24_3 = class287_1.aClass282_Sub24_3425;
            this.aClass287Array2646[this.anInt2615] = class287_1;
            this.aBoolArray2647[this.anInt2615] = false;
            ++this.anInt2615;
            int i_4 = class287_1.anInt3419;
            if (class287_1.aBool3427) {
                i_4 = 0;
            }
            int i_5 = class287_1.anInt3419;
            if (class287_1.aBool3426) {
                i_5 = this.anInt2601 - 1;
            }
            for (int i_6 = i_4; i_6 <= i_5; i_6++) {
                int i_7 = 0;
                int i_8 = class282_sub24_3.method12394(997046092) - class282_sub24_3.method12370(-789603523) + this.anInt2594 >> this.anInt2592;
                if (i_8 < 0) {
                    i_7 -= i_8;
                    i_8 = 0;
                }
                int i_9 = class282_sub24_3.method12394(1086113153) + class282_sub24_3.method12370(-789603523) - this.anInt2594 >> this.anInt2592;
                if (i_9 >= this.anInt2603) {
                    i_9 = this.anInt2603 - 1;
                }
                for (int i_10 = i_8; i_10 <= i_9; i_10++) {
                    short s_11 = class287_1.aShortArray3429[i_7++];
                    int i_12 = (class282_sub24_3.method12368((byte) 47) - class282_sub24_3.method12370(-789603523) + this.anInt2594 >> this.anInt2592) + (s_11 >>> 8);
                    int i_13 = (s_11 & 0xff) + i_12 - 1;
                    if (i_12 < 0) {
                        i_12 = 0;
                    }
                    if (i_13 >= this.anInt2617) {
                        i_13 = this.anInt2617 - 1;
                    }
                    for (int i_14 = i_12; i_14 <= i_13; i_14++) {
                        long long_15 = this.aLongArrayArrayArray2645[i_6][i_14][i_10];
                        if ((long_15 & 0xffffL) == 0L) {
                            this.aLongArrayArrayArray2645[i_6][i_14][i_10] = long_15 | (long) this.anInt2615;
                        } else if ((long_15 & 0xffff0000L) == 0L) {
                            this.aLongArrayArrayArray2645[i_6][i_14][i_10] = long_15 | (long) this.anInt2615 << 16;
                        } else if ((long_15 & 0xffff00000000L) == 0L) {
                            this.aLongArrayArrayArray2645[i_6][i_14][i_10] = long_15 | (long) this.anInt2615 << 32;
                        } else if ((long_15 & ~0xffffffffffffL) == 0L) {
                            this.aLongArrayArrayArray2645[i_6][i_14][i_10] = long_15 | (long) this.anInt2615 << 48;
                        }
                    }
                }
            }
        }
    }

    public void method3431(int i_1) {
        for (int i_2 = 0; i_2 < this.anInt2615; i_2++) {
            if (!this.aBoolArray2647[i_2]) {
                Class287 class287_3 = this.aClass287Array2646[i_2];
                Class282_Sub24 class282_sub24_4 = class287_3.aClass282_Sub24_3425;
                int i_5 = class287_3.anInt3419;
                int i_6 = class282_sub24_4.method12370(-789603523) - this.anInt2594;
                int i_7 = (i_6 * 2 >> this.anInt2592) + 1;
                int i_8 = 0;
                int[] ints_9 = new int[i_7 * i_7];
                int i_10 = class282_sub24_4.method12368((byte) 18) - i_6 >> this.anInt2592;
                int i_11 = class282_sub24_4.method12394(1388951862) - i_6 >> this.anInt2592;
                int i_12 = class282_sub24_4.method12394(1380469261) + i_6 >> this.anInt2592;
                if (i_11 < 0) {
                    i_8 -= i_11;
                    i_11 = 0;
                }
                if (i_12 >= this.anInt2603) {
                    i_12 = this.anInt2603 - 1;
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
                    if (i_18 >= this.anInt2617) {
                        i_18 = this.anInt2617 - 1;
                    }
                    for (int i_19 = i_17; i_19 <= i_18; i_19++) {
                        byte b_20 = 1;
                        Class521_Sub1_Sub1 class521_sub1_sub1_21 = this.getInteractableObject(i_5, i_19, i_13, (Interface25) null, -233664382);
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
                this.aBoolArray2647[i_2] = true;
                if (aBool2644) {
                    this.aClass390Array2591[i_5].method6713(class282_sub24_4, ints_9);
                }
            }
        }
    }

    public int method3432(int i_1, int i_2, byte b_3) {
        return this.waterRelatedArray4 != null ? this.waterRelatedArray4[i_1][i_2] & 0xff : 0;
    }

    public Class521_Sub1_Sub2 method3437(int i_1, int i_2, int i_3, short s_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aClass521_Sub1_Sub2_3506;
    }

    public Class521_Sub1_Sub4 method3439(int i_1, int i_2, int i_3, int i_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 != null) {
            this.method3408(class293_5.aClass521_Sub1_Sub4_3500, 1336618461);
            if (class293_5.aClass521_Sub1_Sub4_3500 != null) {
                Class521_Sub1_Sub4 class521_sub1_sub4_6 = class293_5.aClass521_Sub1_Sub4_3500;
                class293_5.aClass521_Sub1_Sub4_3500 = null;
                return class521_sub1_sub4_6;
            }
        }
        return null;
    }

    void method3441(boolean bool_1, byte[][][] bytes_2, int i_3, byte b_4, int i_5) {
        int i_6 = bool_1 ? 1 : 0;
        this.anInt2623 = 0;
        this.anInt2624 = 0;
        ++this.anInt2609;
        Class521_Sub1 class521_sub1_7;
        if ((i_5 & 0x2) == 0) {
            for (class521_sub1_7 = this.aClass521_Sub1Array2605[i_6]; class521_sub1_7 != null; class521_sub1_7 = class521_sub1_7.aClass521_Sub1_7966) {
                this.method3421(class521_sub1_7, (byte) -60);
                if (class521_sub1_7.anInt7969 != -1 && !this.method3424(class521_sub1_7, bool_1, bytes_2, i_3, b_4)) {
                    this.aClass521_Sub1Array2626[++this.anInt2623 - 1] = class521_sub1_7;
                }
            }
        }
        int i_16;
        if ((i_5 & 0x1) == 0) {
            for (class521_sub1_7 = this.aClass521_Sub1Array2633[i_6]; class521_sub1_7 != null; class521_sub1_7 = class521_sub1_7.aClass521_Sub1_7966) {
                this.method3421(class521_sub1_7, (byte) -30);
                if (class521_sub1_7.anInt7969 != -1 && !this.method3424(class521_sub1_7, bool_1, bytes_2, i_3, b_4)) {
                    this.aClass521_Sub1Array2625[++this.anInt2624 - 1] = class521_sub1_7;
                }
            }
            for (class521_sub1_7 = this.aClass521_Sub1Array2649[i_6]; class521_sub1_7 != null; class521_sub1_7 = class521_sub1_7.aClass521_Sub1_7966) {
                this.method3421(class521_sub1_7, (byte) 18);
                if (class521_sub1_7.anInt7969 != -1 && !this.method3424(class521_sub1_7, bool_1, bytes_2, i_3, b_4)) {
                    if (class521_sub1_7.method12987(1931050089)) {
                        this.aClass521_Sub1Array2625[++this.anInt2624 - 1] = class521_sub1_7;
                    } else {
                        this.aClass521_Sub1Array2626[++this.anInt2623 - 1] = class521_sub1_7;
                    }
                }
            }
            if (!bool_1) {
                for (i_16 = 0; i_16 < this.anInt2616; i_16++) {
                    this.method3421(this.aClass521_Sub1_Sub1Array2627[i_16], (byte) 8);
                    if (this.aClass521_Sub1_Sub1Array2627[i_16].anInt7969 != -1 && !this.method3424(this.aClass521_Sub1_Sub1Array2627[i_16], bool_1, bytes_2, i_3, b_4)) {
                        if (this.aClass521_Sub1_Sub1Array2627[i_16].method12987(1185762690)) {
                            this.aClass521_Sub1Array2625[++this.anInt2624 - 1] = this.aClass521_Sub1_Sub1Array2627[i_16];
                        } else {
                            this.aClass521_Sub1Array2626[++this.anInt2623 - 1] = this.aClass521_Sub1_Sub1Array2627[i_16];
                        }
                    }
                }
            }
        }
        if (this.anInt2623 > 0) {
            this.method3466(this.aClass521_Sub1Array2626, 0, this.anInt2623 - 1);
            for (i_16 = 0; i_16 < this.anInt2623; i_16++) {
                this.method3508(this.aClass521_Sub1Array2626[i_16], this.aClass282_Sub24Array2642);
            }
        }
        if (this.aBool2598) {
            this.aClass505_2596.method8547(0, (Class282_Sub24[]) null);
        }
        if ((i_5 & 0x2) == 0) {
            for (i_16 = 0; i_16 < this.anInt2601; i_16++) {
                int i_8;
                int i_9;
                boolean[][] bools_10;
                int i_11;
                int i_12;
                int i_13;
                if (i_16 >= i_3 && bytes_2 != null) {
                    i_8 = this.aBoolArrayArray2651.length;
                    if (this.aBoolArrayArray2651.length + this.anInt2637 > this.anInt2617) {
                        i_8 -= this.aBoolArrayArray2651.length + this.anInt2637 - this.anInt2617;
                    }
                    i_9 = this.aBoolArrayArray2651[0].length;
                    if (this.aBoolArrayArray2651[0].length + this.anInt2621 > this.anInt2603) {
                        i_9 -= this.aBoolArrayArray2651[0].length + this.anInt2621 - this.anInt2603;
                    }
                    bools_10 = this.aBoolArrayArray2635;
                    if (this.aBool2599) {
                        for (i_11 = this.anInt2602; i_11 < i_8; i_11++) {
                            i_12 = i_11 + this.anInt2637 - this.anInt2602;
                            for (i_13 = this.anInt2636; i_13 < i_9; i_13++) {
                                bools_10[i_11][i_13] = false;
                                if (this.aBoolArrayArray2651[i_11][i_13]) {
                                    int i_14 = i_13 + this.anInt2621 - this.anInt2636;
                                    for (int i_15 = i_16; i_15 >= 0; --i_15) {
                                        if (this.aClass293ArrayArrayArray2604[i_15][i_12][i_14] != null && this.aClass293ArrayArrayArray2604[i_15][i_12][i_14].aByte3507 == i_16) {
                                            if ((i_15 < i_3 || bytes_2[i_15][i_12][i_14] != b_4) && !this.aClass201_2600.method3271(i_16, i_12, i_14)) {
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
                    this.aClass390Array2591[i_16].method6717(this.anInt2628, this.anInt2629, this.anInt2652, this.aBoolArrayArray2635, false, i_5);
                } else {
                    i_8 = this.aBoolArrayArray2651.length;
                    if (this.aBoolArrayArray2651.length + this.anInt2637 > this.anInt2617) {
                        i_8 -= this.aBoolArrayArray2651.length + this.anInt2637 - this.anInt2617;
                    }
                    i_9 = this.aBoolArrayArray2651[0].length;
                    if (this.aBoolArrayArray2651[0].length + this.anInt2621 > this.anInt2603) {
                        i_9 -= this.aBoolArrayArray2651[0].length + this.anInt2621 - this.anInt2603;
                    }
                    bools_10 = this.aBoolArrayArray2635;
                    if (this.aBool2599) {
                        for (i_11 = this.anInt2602; i_11 < i_8; i_11++) {
                            i_12 = i_11 + this.anInt2637 - this.anInt2602;
                            for (i_13 = this.anInt2636; i_13 < i_9; i_13++) {
                                if (this.aBoolArrayArray2651[i_11][i_13] && !this.aClass201_2600.method3271(i_16, i_12, i_13 + this.anInt2621 - this.anInt2636)) {
                                    bools_10[i_11][i_13] = true;
                                } else {
                                    bools_10[i_11][i_13] = false;
                                }
                            }
                        }
                    }
                    this.aClass390Array2591[i_16].method6717(this.anInt2628, this.anInt2629, this.anInt2652, this.aBoolArrayArray2635, true, i_5);
                }
            }
        }
        if (this.anInt2624 > 0) {
            this.method3502(this.aClass521_Sub1Array2625, 0, this.anInt2624 - 1);
            for (i_16 = 0; i_16 < this.anInt2624; i_16++) {
                this.method3508(this.aClass521_Sub1Array2625[i_16], this.aClass282_Sub24Array2642);
            }
        }
    }

    public void method3447(int i_1, int i_2, int i_3, int i_4, byte[][][] bytes_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int i_11, byte b_12, int i_13, int i_14, boolean bool_15, boolean bool_16, int i_17, boolean bool_18) {
        this.aClass201_2600.aBool2542 = true;
        this.aBool2599 = bool_16;
        this.anInt2628 = i_2 >> this.anInt2592;
        this.anInt2629 = i_4 >> this.anInt2592;
        this.anInt2630 = i_2;
        this.anInt2650 = i_4;
        this.anInt2632 = i_3;
        this.anInt2637 = this.anInt2628 - this.anInt2652;
        if (this.anInt2637 < 0) {
            this.anInt2602 = -(this.anInt2637 * 1607871809) * -1275764031;
            this.anInt2637 = 0;
        } else {
            this.anInt2602 = 0;
        }
        this.anInt2621 = this.anInt2629 - this.anInt2652;
        if (this.anInt2621 < 0) {
            this.anInt2636 = -(this.anInt2621 * 1831414049) * -2139776287;
            this.anInt2621 = 0;
        } else {
            this.anInt2636 = 0;
        }
        this.anInt2638 = this.anInt2652 + this.anInt2628;
        if (this.anInt2638 > this.anInt2617) {
            this.anInt2638 = this.anInt2617;
        }
        this.anInt2640 = this.anInt2652 + this.anInt2629;
        if (this.anInt2640 > this.anInt2603) {
            this.anInt2640 = this.anInt2603;
        }
        boolean[][] bools_19 = this.aBoolArrayArray2651;
        boolean[][] bools_20 = this.aBoolArrayArray2635;
        int i_21;
        int i_22;
        if (this.aBool2599) {
            for (i_21 = 0; i_21 < this.anInt2652 + this.anInt2652 + 2; i_21++) {
                i_22 = 0;
                int i_23 = 0;
                for (int i_24 = 0; i_24 < this.anInt2652 + this.anInt2652 + 2; i_24++) {
                    if (i_24 > 1) {
                        this.anIntArray2641[i_24 - 2] = i_22;
                    }
                    i_22 = i_23;
                    int i_25 = i_21 + (this.anInt2628 - this.anInt2652);
                    int i_26 = i_24 + (this.anInt2629 - this.anInt2652);
                    int i_27;
                    if (i_25 >= 0 && i_26 >= 0 && i_25 < this.anInt2617 && i_26 < this.anInt2603) {
                        i_27 = i_25 << this.anInt2592;
                        int i_28 = i_26 << this.anInt2592;
                        int i_29 = this.aClass390Array2607[this.aClass390Array2607.length - 1].method6722(i_25, i_26, 65280) - (1000 << this.anInt2592 - 7);
                        int i_30 = (this.aClass390Array2614 != null ? this.aClass390Array2614[0].method6722(i_25, i_26, 65280) + this.anInt2593 : this.aClass390Array2607[0].method6722(i_25, i_26, 65280) + this.anInt2593) + (1000 << this.anInt2592 - 7);
                        i_23 = this.aClass505_2596.method8437(i_27, i_29, i_28, i_27, i_30, i_28);
                        this.aBoolArrayArray2635[i_21][i_24] = i_23 == 0;
                    } else {
                        i_23 = -1;
                        this.aBoolArrayArray2635[i_21][i_24] = false;
                    }
                    if (i_21 > 0 && i_24 > 0) {
                        i_27 = this.anIntArray2641[i_24 - 1] & this.anIntArray2641[i_24] & i_22 & i_23;
                        this.aBoolArrayArray2651[i_21 - 1][i_24 - 1] = i_27 == 0;
                    }
                }
                this.anIntArray2641[this.anInt2652 + this.anInt2652] = i_22;
                this.anIntArray2641[this.anInt2652 + this.anInt2652 + 1] = i_23;
            }
            this.aClass201_2600.anIntArray2569 = ints_6;
            this.aClass201_2600.anIntArray2561 = ints_7;
            this.aClass201_2600.anIntArray2562 = ints_8;
            this.aClass201_2600.anIntArray2568 = ints_9;
            this.aClass201_2600.anIntArray2560 = ints_10;
            this.aClass201_2600.method3265(this.aClass505_2596, i_11);
        } else {
            if (this.aBoolArrayArray2631 == null) {
                this.aBoolArrayArray2631 = new boolean[this.anInt2652 + this.anInt2652 + 2][this.anInt2652 + this.anInt2652 + 2];
            }
            for (i_21 = 0; i_21 < this.aBoolArrayArray2631.length; i_21++) {
                for (i_22 = 0; i_22 < this.aBoolArrayArray2631[0].length; i_22++) {
                    this.aBoolArrayArray2631[i_21][i_22] = true;
                }
            }
            this.aBoolArrayArray2635 = this.aBoolArrayArray2631;
            this.aBoolArrayArray2651 = this.aBoolArrayArray2631;
            this.anInt2637 = 0;
            this.anInt2621 = 0;
            this.anInt2638 = this.anInt2617;
            this.anInt2640 = this.anInt2603;
            this.aClass201_2600.aBool2542 = false;
        }
        ChatLine.method1848(this, this.aClass505_2596, 437446404);
        if (!this.aClass284_2648.aBool3386) {
            Iterator iterator_31 = this.aClass284_2648.aList3388.iterator();
            while (iterator_31.hasNext()) {
                Class285 class285_32 = (Class285) iterator_31.next();
                iterator_31.remove();
                Class279.method4969(class285_32, 1362412061);
            }
        }
        if (this.aBool2598) {
            for (i_21 = 0; i_21 < this.anInt2615; i_21++) {
                this.aClass287Array2646[i_21].method5053(i_1, bool_15, -1826281531);
            }
        }
        if (this.waterRelatedClassArray1 != null) {
            this.method3380(true, -914334995);
            this.aClass505_2596.method8475(-1, new Class90(1583160, 40, 127, 63, 0, 0, 0));
            this.method3441(true, bytes_5, i_11, b_12, i_17);
            this.aClass505_2596.O();
            this.method3380(false, -914334995);
        }
        this.method3441(false, bytes_5, i_11, b_12, i_17);
        if (!this.aBool2599) {
            this.aBoolArrayArray2651 = bools_19;
            this.aBoolArrayArray2635 = bools_20;
        }
    }

    void method3452(Class521_Sub1 class521_sub1_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        boolean bool_7 = true;
        int i_8 = i_3;
        int i_9 = i_3 + i_5;
        int i_10 = i_4 - 1;
        int i_11 = i_4 + i_6;
        for (int i_12 = i_2; i_12 <= i_2 + 1; i_12++) {
            if (i_12 != this.anInt2601) {
                for (int i_13 = i_8; i_13 <= i_9; i_13++) {
                    if (i_13 >= 0 && i_13 < this.anInt2617) {
                        for (int i_14 = i_10; i_14 <= i_11; i_14++) {
                            if (i_14 >= 0 && i_14 < this.anInt2603 && (!bool_7 || i_13 >= i_9 || i_14 >= i_11 || i_14 < i_4 && i_3 != i_13)) {
                                Class293 class293_15 = this.aClass293ArrayArrayArray2604[i_12][i_13][i_14];
                                if (class293_15 != null) {
                                    int i_16 = (this.aClass390Array2591[i_12].method6722(i_13, i_14, 65280) + this.aClass390Array2591[i_12].method6722(1 + i_13, i_14, 65280) + this.aClass390Array2591[i_12].method6722(i_13, 1 + i_14, 65280) + this.aClass390Array2591[i_12].method6722(1 + i_13, 1 + i_14, 65280)) / 4 - (this.aClass390Array2591[i_2].method6722(i_3, i_4, 65280) + this.aClass390Array2591[i_2].method6722(i_3 + 1, i_4, 65280) + this.aClass390Array2591[i_2].method6722(i_3, i_4 + 1, 65280) + this.aClass390Array2591[i_2].method6722(i_3 + 1, i_4 + 1, 65280)) / 4;
                                    Class521_Sub1_Sub5 class521_sub1_sub5_17 = class293_15.aClass521_Sub1_Sub5_3505;
                                    Class521_Sub1_Sub5 class521_sub1_sub5_18 = class293_15.aClass521_Sub1_Sub5_3502;
                                    if (class521_sub1_sub5_17 != null && class521_sub1_sub5_17.method12985(-2063907301)) {
                                        class521_sub1_1.method13013(this.aClass505_2596, class521_sub1_sub5_17, (i_13 - i_3) * this.anInt2593 + (1 - i_5) * this.anInt2594, i_16, (1 - i_6) * this.anInt2594 + (i_14 - i_4) * this.anInt2593, bool_7, -2001031070);
                                    }
                                    if (class521_sub1_sub5_18 != null && class521_sub1_sub5_18.method12985(-1646817954)) {
                                        class521_sub1_1.method13013(this.aClass505_2596, class521_sub1_sub5_18, (i_13 - i_3) * this.anInt2593 + (1 - i_5) * this.anInt2594, i_16, (1 - i_6) * this.anInt2594 + (i_14 - i_4) * this.anInt2593, bool_7, -1714087738);
                                    }
                                    for (Class208 class208_19 = class293_15.aClass208_3504; class208_19 != null; class208_19 = class208_19.aClass208_2660) {
                                        Class521_Sub1_Sub1 class521_sub1_sub1_20 = class208_19.aClass521_Sub1_Sub1_2659;
                                        if (class521_sub1_sub1_20 != null && class521_sub1_sub1_20.method12985(-1911399746) && (i_13 == class521_sub1_sub1_20.aShort9458 || i_8 == i_13) && (i_14 == class521_sub1_sub1_20.aShort9456 || i_10 == i_14)) {
                                            int i_21 = class521_sub1_sub1_20.localX - class521_sub1_sub1_20.aShort9458 + 1;
                                            int i_22 = class521_sub1_sub1_20.localY - class521_sub1_sub1_20.aShort9456 + 1;
                                            class521_sub1_1.method13013(this.aClass505_2596, class521_sub1_sub1_20, this.anInt2593 * (class521_sub1_sub1_20.aShort9458 - i_3) + this.anInt2594 * (i_21 - i_5), i_16, this.anInt2593 * (class521_sub1_sub1_20.aShort9456 - i_4) + (i_22 - i_6) * this.anInt2594, bool_7, -1732186752);
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

    Class293 method3459(int i_1, int i_2, int i_3, int i_4) {
        if (this.aClass293ArrayArrayArray2604[i_1][i_2][i_3] == null) {
            boolean bool_5 = this.aClass293ArrayArrayArray2604[0][i_2][i_3] != null && this.aClass293ArrayArrayArray2604[0][i_2][i_3].aClass293_3509 != null;
            if (bool_5 && i_1 >= this.anInt2601 - 1) {
                return null;
            }
            this.method3384(i_1, i_2, i_3, (byte) -48);
        }
        return this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
    }

    public Class521_Sub1_Sub5 method3460(int i_1, int i_2, int i_3, byte b_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_5 != null) {
            this.method3408(class293_5.aClass521_Sub1_Sub5_3502, 936233239);
            if (class293_5.aClass521_Sub1_Sub5_3502 != null) {
                Class521_Sub1_Sub5 class521_sub1_sub5_6 = class293_5.aClass521_Sub1_Sub5_3502;
                class293_5.aClass521_Sub1_Sub5_3502 = null;
                return class521_sub1_sub5_6;
            }
        }
        return null;
    }

    public int method3464(int i_1, int i_2, int i_3) {
        return this.waterRelatedArray5 != null ? this.waterRelatedArray5[i_1][i_2] & 0xff : 0;
    }

    void method3466(Class521_Sub1[] arr_1, int i_2, int i_3) {
        if (i_2 < i_3) {
            int i_4 = (i_3 + i_2) / 2;
            int i_5 = i_2;
            Class521_Sub1 class521_sub1_6 = arr_1[i_4];
            arr_1[i_4] = arr_1[i_3];
            arr_1[i_3] = class521_sub1_6;
            int i_7 = class521_sub1_6.anInt7969;
            for (int i_8 = i_2; i_8 < i_3; i_8++) {
                if (arr_1[i_8].anInt7969 < (i_8 & 0x1) + i_7) {
                    Class521_Sub1 class521_sub1_9 = arr_1[i_8];
                    arr_1[i_8] = arr_1[i_5];
                    arr_1[i_5++] = class521_sub1_9;
                }
            }
            arr_1[i_3] = arr_1[i_5];
            arr_1[i_5] = class521_sub1_6;
            this.method3466(arr_1, i_2, i_5 - 1);
            this.method3466(arr_1, i_5 + 1, i_3);
        }
    }

    void method3486(int i_1, int i_2, int i_3) {
        Shadow class282_sub50_sub17_4 = null;
        for (int i_5 = i_1; i_5 < i_2; i_5++) {
            Ground class390_6 = this.aClass390Array2607[i_5];
            if (class390_6 != null) {
                for (int i_7 = 0; i_7 < this.anInt2603; i_7++) {
                    for (int i_8 = 0; i_8 < this.anInt2617; i_8++) {
                        class282_sub50_sub17_4 = class390_6.w(i_8, i_7, class282_sub50_sub17_4);
                        if (class282_sub50_sub17_4 != null) {
                            int i_9 = i_8 << this.anInt2592;
                            int i_10 = i_7 << this.anInt2592;
                            for (int i_11 = i_5 - 1; i_11 >= 0; --i_11) {
                                Ground class390_12 = this.aClass390Array2607[i_11];
                                if (class390_12 != null) {
                                    int i_13 = class390_6.method6722(i_8, i_7, 65280) - class390_12.method6722(i_8, i_7, 65280);
                                    int i_14 = class390_6.method6722(i_8 + 1, i_7, 65280) - class390_12.method6722(i_8 + 1, i_7, 65280);
                                    int i_15 = class390_6.method6722(i_8 + 1, i_7 + 1, 65280) - class390_12.method6722(i_8 + 1, i_7 + 1, 65280);
                                    int i_16 = class390_6.method6722(i_8, i_7 + 1, 65280) - class390_12.method6722(i_8, i_7 + 1, 65280);
                                    class390_12.UA(class282_sub50_sub17_4, i_9, (i_16 + i_15 + i_14 + i_13) / 4, i_10, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void method3502(Class521_Sub1[] arr_1, int i_2, int i_3) {
        if (i_2 < i_3) {
            int i_4 = (i_3 + i_2) / 2;
            int i_5 = i_2;
            Class521_Sub1 class521_sub1_6 = arr_1[i_4];
            arr_1[i_4] = arr_1[i_3];
            arr_1[i_3] = class521_sub1_6;
            int i_7 = class521_sub1_6.anInt7969;
            for (int i_8 = i_2; i_8 < i_3; i_8++) {
                if (arr_1[i_8].anInt7969 > (i_8 & 0x1) + i_7) {
                    Class521_Sub1 class521_sub1_9 = arr_1[i_8];
                    arr_1[i_8] = arr_1[i_5];
                    arr_1[i_5++] = class521_sub1_9;
                }
            }
            arr_1[i_3] = arr_1[i_5];
            arr_1[i_5] = class521_sub1_6;
            this.method3502(arr_1, i_2, i_5 - 1);
            this.method3502(arr_1, i_5 + 1, i_3);
        }
    }

    public Class208 method3507(int i_1, int i_2, int i_3, byte b_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aClass208_3504;
    }

    void method3508(Class521_Sub1 class521_sub1_1, Class282_Sub24[] arr_2) {
        if (this.aBool2598) {
            int i_3 = class521_sub1_1.method13036(arr_2, -827011094);
            this.aClass505_2596.method8547(i_3, arr_2);
        }
        if (this.aClass390Array2614 == this.aClass390Array2591) {
            boolean bool_10 = false;
            boolean bool_4 = false;
            Vector3 vector3_5 = class521_sub1_1.method11166().aClass385_3595;
            int i_6;
            int i_7;
            if (class521_sub1_1 instanceof Class521_Sub1_Sub1) {
                i_6 = ((Class521_Sub1_Sub1) class521_sub1_1).aShort9458;
                i_7 = ((Class521_Sub1_Sub1) class521_sub1_1).aShort9456;
            } else {
                i_6 = (int) vector3_5.x >> this.anInt2592;
                i_7 = (int) vector3_5.z >> this.anInt2592;
            }
            Class90 class90_8 = new Class90();
            class90_8.color = this.getColor(i_6, i_7, (byte) 102);
            class90_8.scale = this.getScale(i_6, i_7, 1481885588);
            class90_8.intensity = this.getIntensities(i_6, i_7, -575094789);
            class90_8.anInt949 = this.method3432(i_6, i_7, (byte) 1);
            class90_8.anInt950 = this.method3464(i_6, i_7, 1819707800);
            class90_8.anInt951 = this.method3391(i_6, i_7, 2124895018);
            this.aClass505_2596.method8476(this.aClass390Array2607[0].averageHeight((int) vector3_5.x, (int) vector3_5.z, -402315089), class90_8);
        }
        Class285 class285_9 = class521_sub1_1.method12990(this.aClass505_2596, 389193782);
        if (class285_9 != null) {
            if (class285_9.aBool3392) {
                class285_9.aClass521_Sub1_3391 = class521_sub1_1;
                this.aClass284_2648.method5013(class285_9, 414101686);
            } else {
                Class279.method4969(class285_9, 1362412061);
            }
        }
    }

    public Class521_Sub1_Sub4 getWallDecoration(int i_1, int i_2, int i_3, byte b_4) {
        Class293 class293_5 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        return class293_5 == null ? null : class293_5.aClass521_Sub1_Sub4_3503;
    }

    public SceneObjectManager(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, boolean highDetailWater, boolean bool_8) {
        this.anInt2634 = 10072;
        this.anInt2618 = 5015;
        this.anInt2619 = 5040;
        this.aFloatArray2639 = new float[3];
        this.aClass282_Sub24Array2642 = new Class282_Sub24[8];
        this.anInt2643 = 1;
        this.aClass505_2596 = graphicalrenderer_1;
        this.aBool2598 = this.aClass505_2596.method8463() > 0;
        this.anInt2592 = i_2;
        this.anInt2593 = 1 << this.anInt2592;
        this.anInt2594 = this.anInt2593 >> 1;
        this.anInt2601 = i_3;
        this.anInt2617 = i_4;
        this.anInt2603 = i_5;
        this.anInt2652 = i_6;
        this.aClass454_2597 = new Class454();
        this.aClass201_2600 = new Class201(this);
        this.aClass293ArrayArrayArray2610 = new Class293[i_3][this.anInt2617][this.anInt2603];
        this.aClass390Array2607 = new Ground[i_3];
        if (highDetailWater) {
            this.colors = new int[this.anInt2617][this.anInt2603];
            this.intensities = new byte[this.anInt2617][this.anInt2603];
            this.scales = new short[this.anInt2617][this.anInt2603];
            this.waterRelatedArray4 = new byte[this.anInt2617][this.anInt2603];
            this.waterRelatedArray5 = new byte[this.anInt2617][this.anInt2603];
            this.waterRelatedArray6 = new byte[this.anInt2617][this.anInt2603];
            this.waterRelatedClassArray1 = new Class293[1][this.anInt2617][this.anInt2603];
            this.aClass390Array2614 = new Ground[1];
        }
        if (bool_8) {
            this.aLongArrayArrayArray2645 = new long[i_3][i_4][i_5];
            this.aClass287Array2646 = new Class287[65361];
            this.aBoolArray2647 = new boolean[65361];
            this.anInt2615 = 0;
        }
        this.method3380(false, -914334995);
        this.aClass521_Sub1Array2605 = new Class521_Sub1[2];
        this.aClass521_Sub1Array2633 = new Class521_Sub1[2];
        this.aClass521_Sub1Array2649 = new Class521_Sub1[2];
        this.aClass521_Sub1Array2626 = new Class521_Sub1[10072];
        this.anInt2623 = 0;
        this.aClass521_Sub1Array2625 = new Class521_Sub1[5015];
        this.anInt2624 = 0;
        this.aClass521_Sub1_Sub1Array2627 = new Class521_Sub1_Sub1[5040];
        this.anInt2616 = 0;
        this.aBoolArrayArray2651 = new boolean[this.anInt2652 + this.anInt2652 + 1][this.anInt2652 + this.anInt2652 + 1];
        this.aBoolArrayArray2635 = new boolean[this.anInt2652 + this.anInt2652 + 2][this.anInt2652 + this.anInt2652 + 2];
        this.anIntArray2641 = new int[this.anInt2652 + this.anInt2652 + 2];
        this.aClass284_2648 = new Login(false);
    }

    public Class521_Sub1_Sub1 method3530(int i_1, int i_2, int i_3, Interface25 interface25_4, int i_5) {
        Class293 class293_6 = this.aClass293ArrayArrayArray2604[i_1][i_2][i_3];
        if (class293_6 == null) {
            return null;
        } else {
            for (Class208 class208_7 = class293_6.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                Class521_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aClass521_Sub1_Sub1_2659;
                if ((interface25_4 == null || interface25_4.method183(class521_sub1_sub1_8, 1956908464)) && i_2 == class521_sub1_sub1_8.aShort9458 && i_3 == class521_sub1_sub1_8.aShort9456) {
                    this.method3407(class521_sub1_sub1_8, false, -1696604087);
                    return class521_sub1_sub1_8;
                }
            }
            return null;
        }
    }

    public int getIntensities(int i_1, int i_2, int i_3) {
        return this.intensities != null ? this.intensities[i_1][i_2] & 0xff : 0;
    }

    static Class215 method3545(RsByteBuffer rsbytebuffer_0, int i_1) {
        int i_2 = rsbytebuffer_0.readUnsignedByte();
        int i_3 = rsbytebuffer_0.readUnsignedByte();
        int i_4 = rsbytebuffer_0.readUnsignedByte();
        int[] ints_5 = new int[i_4];
        for (int i_6 = 0; i_6 < i_4; i_6++) {
            ints_5[i_6] = rsbytebuffer_0.readUnsignedByte();
        }
        return new Class215(i_2, i_3, ints_5);
    }
}
