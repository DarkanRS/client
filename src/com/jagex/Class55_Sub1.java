package com.jagex;

public class Class55_Sub1 extends Class55 {

    public static float aFloat9189 = 0.25F;
    public static float aFloat9184 = 1.0F;
    public static float aFloat9188 = 1.0F;
    public static float aFloat9186 = 1.0F;
    Shader aClass101_9187;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9194;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9197;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9195;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9196;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9183;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9198;
    Class115 aClass115_9182;
    Class115 aClass115_9185;
    Class115 aClass115_9190;
    Class115 aClass115_9191;
    Class115 aClass115_9192;
    boolean aBool9199;

    void method1133(int i_1, int i_2) {
    }

    void method1104(int i_1) {
        this.aClass101_9187.method1647();
    }

    boolean method1098() {
        return this.aBool9199;
    }

    void method1102(int i_1, int i_2) {
    }

    void method1110() {
    }

    int method1100() {
        return 4;
    }

    void method1103(int i_1, Class158_Sub1 class158_sub1_2, Interface6 interface6_3, Interface8 interface8_4, Interface6 interface6_5) {
        float f_6 = this.aGraphicalRenderer_Sub2_514.method13905();
        float f_7 = (float) class158_sub1_2.method2714();
        float f_8 = (float) class158_sub1_2.method2716();
        Interface6 interface6_9 = interface6_3;
        float[] floats_10 = new float[]{-1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F};
        int i_11 = (int) f_7;
        int i_12 = (int) f_8;
        int i_13 = i_11;
        int i_14 = i_12;
        if (i_1 == 0) {
            i_11 = 256;
            i_12 = 256;
            this.aClass101_9187.method1655(this.aClass115_9185);
            this.aClass101_9187.method1646();
        } else if (i_1 == 1) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            this.aClass101_9187.method1655(this.aClass115_9190);
            this.aClass101_9187.method1646();
            this.aClass101_9187.method1658(this.aNode_Sub21_Sub1_9196, aFloat9186 / f_7, 0.0F, -1376055691);
        } else if (i_1 == 2) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            this.aClass101_9187.method1655(this.aClass115_9190);
            this.aClass101_9187.method1646();
            this.aClass101_9187.method1658(this.aNode_Sub21_Sub1_9196, 0.0F, aFloat9186 / f_8, -1647399007);
        } else if (i_1 == 3) {
            this.aClass101_9187.method1655(this.aClass115_9191);
            interface6_9 = interface6_5;
            this.aClass101_9187.method1671(this.aNode_Sub21_Sub1_9197, 1, interface6_3);
            this.aClass101_9187.method1646();
        }

        float f_15 = (float) i_11 / f_7;
        float f_16 = (float) i_12 / f_8;
        float f_17 = (float) i_13 / f_7;
        float f_18 = (float) i_14 / f_8;
        floats_10[8] = (floats_10[8] + 1.0F) * f_15 - 1.0F;
        floats_10[5] = (floats_10[5] - 1.0F) * f_16 + 1.0F;
        floats_10[10] *= f_17;
        floats_10[7] *= f_18;
        this.aClass101_9187.method1688(this.aNode_Sub21_Sub1_9198, floats_10, 1193588147);
        this.aClass101_9187.method1671(this.aNode_Sub21_Sub1_9194, 0, interface6_9);
        this.aClass101_9187.method1662(this.aNode_Sub21_Sub1_9195, aFloat9188, aFloat9189, aFloat9184, 0.0F, (byte) -70);
        this.aClass101_9187.method1662(this.aNode_Sub21_Sub1_9183, f_6 / f_7, f_6 / f_8, 256.0F / f_7, 256.0F / f_8, (byte) -98);
        this.aGraphicalRenderer_Sub2_514.method8617(0, 0, i_11, i_12);
        this.aGraphicalRenderer_Sub2_514.r(0, 0, i_11, i_12);
    }

    public Class55_Sub1(GraphicalRenderer_Sub2 class505_sub2_1) {
        super(class505_sub2_1);
    }

    int method1106() {
        return 1;
    }

    boolean method1128() {
        return this.aBool9199;
    }

    boolean method1111() {
        return this.aBool9199;
    }

    boolean method1125() {
        return this.aBool9199;
    }

    boolean method14517() {
        return this.aGraphicalRenderer_Sub2_514.aBool8718 && this.aGraphicalRenderer_Sub2_514.method13888();
    }

    boolean method1101() {
        if (this.method14517()) {
            this.aClass101_9187 = this.aGraphicalRenderer_Sub2_514.loadShader("FilterBloom");
            if (this.aClass101_9187 == null) {
                return false;
            } else {
                try {
                    this.aNode_Sub21_Sub1_9194 = this.aClass101_9187.method1691("sceneTex", (short) 5629);
                    this.aNode_Sub21_Sub1_9197 = this.aClass101_9187.method1691("bloomTex1", (short) 16551);
                    this.aNode_Sub21_Sub1_9195 = this.aClass101_9187.method1691("params", (short) 5315);
                    this.aNode_Sub21_Sub1_9196 = this.aClass101_9187.method1691("sampleSize", (short) 10054);
                    this.aNode_Sub21_Sub1_9183 = this.aClass101_9187.method1691("pixelOffsetAndBloomScale", (short) 23779);
                    this.aNode_Sub21_Sub1_9198 = this.aClass101_9187.method1691("PosAndTexCoords", (short) 12594);
                    this.aClass101_9187.method1651("test", 2057720732);
                    this.aClass115_9182 = this.aClass101_9187.method1651("techFullscreenTri", 23893671);
                    this.aClass115_9185 = this.aClass101_9187.method1651("brightpass", -416906059);
                    this.aClass115_9190 = this.aClass101_9187.method1651("blur", 925585453);
                    this.aClass115_9191 = this.aClass101_9187.method1651("composite", 1412845557);
                    this.aClass115_9192 = this.aClass101_9187.method1651("techDefault", -960899187);
                } catch (Exception_Sub2_Sub2 exception_sub2_sub2_2) {
                    return false;
                } catch (Exception_Sub2_Sub1 exception_sub2_sub1_3) {
                    return false;
                }

                if (!this.aClass115_9182.method1899()) {
                    return false;
                } else if (!this.aClass115_9185.method1899()) {
                    return false;
                } else if (!this.aClass115_9190.method1899()) {
                    return false;
                } else if (!this.aClass115_9191.method1899()) {
                    return false;
                } else if (!this.aClass115_9192.method1899()) {
                    return false;
                } else {
                    this.aBool9199 = true;
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    void method1112() {
    }

    void method1124() {
    }

    void method1109(int i_1, Class158_Sub1 class158_sub1_2, Interface6 interface6_3, Interface8 interface8_4, Interface6 interface6_5) {
        float f_6 = this.aGraphicalRenderer_Sub2_514.method13905();
        float f_7 = (float) class158_sub1_2.method2714();
        float f_8 = (float) class158_sub1_2.method2716();
        Interface6 interface6_9 = interface6_3;
        float[] floats_10 = new float[]{-1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F};
        int i_11 = (int) f_7;
        int i_12 = (int) f_8;
        int i_13 = i_11;
        int i_14 = i_12;
        if (i_1 == 0) {
            i_11 = 256;
            i_12 = 256;
            this.aClass101_9187.method1655(this.aClass115_9185);
            this.aClass101_9187.method1646();
        } else if (i_1 == 1) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            this.aClass101_9187.method1655(this.aClass115_9190);
            this.aClass101_9187.method1646();
            this.aClass101_9187.method1658(this.aNode_Sub21_Sub1_9196, aFloat9186 / f_7, 0.0F, -1986573669);
        } else if (i_1 == 2) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            this.aClass101_9187.method1655(this.aClass115_9190);
            this.aClass101_9187.method1646();
            this.aClass101_9187.method1658(this.aNode_Sub21_Sub1_9196, 0.0F, aFloat9186 / f_8, -1759245436);
        } else if (i_1 == 3) {
            this.aClass101_9187.method1655(this.aClass115_9191);
            interface6_9 = interface6_5;
            this.aClass101_9187.method1671(this.aNode_Sub21_Sub1_9197, 1, interface6_3);
            this.aClass101_9187.method1646();
        }

        float f_15 = (float) i_11 / f_7;
        float f_16 = (float) i_12 / f_8;
        float f_17 = (float) i_13 / f_7;
        float f_18 = (float) i_14 / f_8;
        floats_10[8] = (floats_10[8] + 1.0F) * f_15 - 1.0F;
        floats_10[5] = (floats_10[5] - 1.0F) * f_16 + 1.0F;
        floats_10[10] *= f_17;
        floats_10[7] *= f_18;
        this.aClass101_9187.method1688(this.aNode_Sub21_Sub1_9198, floats_10, 749671414);
        this.aClass101_9187.method1671(this.aNode_Sub21_Sub1_9194, 0, interface6_9);
        this.aClass101_9187.method1662(this.aNode_Sub21_Sub1_9195, aFloat9188, aFloat9189, aFloat9184, 0.0F, (byte) -3);
        this.aClass101_9187.method1662(this.aNode_Sub21_Sub1_9183, f_6 / f_7, f_6 / f_8, 256.0F / f_7, 256.0F / f_8, (byte) -95);
        this.aGraphicalRenderer_Sub2_514.method8617(0, 0, i_11, i_12);
        this.aGraphicalRenderer_Sub2_514.r(0, 0, i_11, i_12);
    }

    void method1119(int i_1, Class158_Sub1 class158_sub1_2, Interface6 interface6_3, Interface8 interface8_4, Interface6 interface6_5) {
        float f_6 = this.aGraphicalRenderer_Sub2_514.method13905();
        float f_7 = (float) class158_sub1_2.method2714();
        float f_8 = (float) class158_sub1_2.method2716();
        Interface6 interface6_9 = interface6_3;
        float[] floats_10 = new float[]{-1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F};
        int i_11 = (int) f_7;
        int i_12 = (int) f_8;
        int i_13 = i_11;
        int i_14 = i_12;
        if (i_1 == 0) {
            i_11 = 256;
            i_12 = 256;
            this.aClass101_9187.method1655(this.aClass115_9185);
            this.aClass101_9187.method1646();
        } else if (i_1 == 1) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            this.aClass101_9187.method1655(this.aClass115_9190);
            this.aClass101_9187.method1646();
            this.aClass101_9187.method1658(this.aNode_Sub21_Sub1_9196, aFloat9186 / f_7, 0.0F, -2043454425);
        } else if (i_1 == 2) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            this.aClass101_9187.method1655(this.aClass115_9190);
            this.aClass101_9187.method1646();
            this.aClass101_9187.method1658(this.aNode_Sub21_Sub1_9196, 0.0F, aFloat9186 / f_8, -1553465871);
        } else if (i_1 == 3) {
            this.aClass101_9187.method1655(this.aClass115_9191);
            interface6_9 = interface6_5;
            this.aClass101_9187.method1671(this.aNode_Sub21_Sub1_9197, 1, interface6_3);
            this.aClass101_9187.method1646();
        }

        float f_15 = (float) i_11 / f_7;
        float f_16 = (float) i_12 / f_8;
        float f_17 = (float) i_13 / f_7;
        float f_18 = (float) i_14 / f_8;
        floats_10[8] = (floats_10[8] + 1.0F) * f_15 - 1.0F;
        floats_10[5] = (floats_10[5] - 1.0F) * f_16 + 1.0F;
        floats_10[10] *= f_17;
        floats_10[7] *= f_18;
        this.aClass101_9187.method1688(this.aNode_Sub21_Sub1_9198, floats_10, 92267019);
        this.aClass101_9187.method1671(this.aNode_Sub21_Sub1_9194, 0, interface6_9);
        this.aClass101_9187.method1662(this.aNode_Sub21_Sub1_9195, aFloat9188, aFloat9189, aFloat9184, 0.0F, (byte) -2);
        this.aClass101_9187.method1662(this.aNode_Sub21_Sub1_9183, f_6 / f_7, f_6 / f_8, 256.0F / f_7, 256.0F / f_8, (byte) -95);
        this.aGraphicalRenderer_Sub2_514.method8617(0, 0, i_11, i_12);
        this.aGraphicalRenderer_Sub2_514.r(0, 0, i_11, i_12);
    }

    void method1120(int i_1) {
        this.aClass101_9187.method1647();
    }

    void method1115() {
    }

    boolean method1113() {
        if (this.method14517()) {
            this.aClass101_9187 = this.aGraphicalRenderer_Sub2_514.loadShader("FilterBloom");
            if (this.aClass101_9187 == null) {
                return false;
            } else {
                try {
                    this.aNode_Sub21_Sub1_9194 = this.aClass101_9187.method1691("sceneTex", (short) 24156);
                    this.aNode_Sub21_Sub1_9197 = this.aClass101_9187.method1691("bloomTex1", (short) 28551);
                    this.aNode_Sub21_Sub1_9195 = this.aClass101_9187.method1691("params", (short) 31009);
                    this.aNode_Sub21_Sub1_9196 = this.aClass101_9187.method1691("sampleSize", (short) 25220);
                    this.aNode_Sub21_Sub1_9183 = this.aClass101_9187.method1691("pixelOffsetAndBloomScale", (short) 17358);
                    this.aNode_Sub21_Sub1_9198 = this.aClass101_9187.method1691("PosAndTexCoords", (short) 31197);
                    this.aClass101_9187.method1651("test", 14547040);
                    this.aClass115_9182 = this.aClass101_9187.method1651("techFullscreenTri", -65124239);
                    this.aClass115_9185 = this.aClass101_9187.method1651("brightpass", -276518163);
                    this.aClass115_9190 = this.aClass101_9187.method1651("blur", -274556349);
                    this.aClass115_9191 = this.aClass101_9187.method1651("composite", 2132478463);
                    this.aClass115_9192 = this.aClass101_9187.method1651("techDefault", 1768065180);
                } catch (Exception_Sub2_Sub2 exception_sub2_sub2_2) {
                    return false;
                } catch (Exception_Sub2_Sub1 exception_sub2_sub1_3) {
                    return false;
                }

                if (!this.aClass115_9182.method1899()) {
                    return false;
                } else if (!this.aClass115_9185.method1899()) {
                    return false;
                } else if (!this.aClass115_9190.method1899()) {
                    return false;
                } else if (!this.aClass115_9191.method1899()) {
                    return false;
                } else if (!this.aClass115_9192.method1899()) {
                    return false;
                } else {
                    this.aBool9199 = true;
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    boolean method1097() {
        if (this.method14517()) {
            this.aClass101_9187 = this.aGraphicalRenderer_Sub2_514.loadShader("FilterBloom");
            if (this.aClass101_9187 == null) {
                return false;
            } else {
                try {
                    this.aNode_Sub21_Sub1_9194 = this.aClass101_9187.method1691("sceneTex", (short) 23052);
                    this.aNode_Sub21_Sub1_9197 = this.aClass101_9187.method1691("bloomTex1", (short) 12055);
                    this.aNode_Sub21_Sub1_9195 = this.aClass101_9187.method1691("params", (short) 26278);
                    this.aNode_Sub21_Sub1_9196 = this.aClass101_9187.method1691("sampleSize", (short) 9862);
                    this.aNode_Sub21_Sub1_9183 = this.aClass101_9187.method1691("pixelOffsetAndBloomScale", (short) 7215);
                    this.aNode_Sub21_Sub1_9198 = this.aClass101_9187.method1691("PosAndTexCoords", (short) 12182);
                    this.aClass101_9187.method1651("test", -206314658);
                    this.aClass115_9182 = this.aClass101_9187.method1651("techFullscreenTri", -575469557);
                    this.aClass115_9185 = this.aClass101_9187.method1651("brightpass", -1905427550);
                    this.aClass115_9190 = this.aClass101_9187.method1651("blur", 988160871);
                    this.aClass115_9191 = this.aClass101_9187.method1651("composite", 1685222905);
                    this.aClass115_9192 = this.aClass101_9187.method1651("techDefault", -410984860);
                } catch (Exception_Sub2_Sub2 exception_sub2_sub2_2) {
                    return false;
                } catch (Exception_Sub2_Sub1 exception_sub2_sub1_3) {
                    return false;
                }

                if (!this.aClass115_9182.method1899()) {
                    return false;
                } else if (!this.aClass115_9185.method1899()) {
                    return false;
                } else if (!this.aClass115_9190.method1899()) {
                    return false;
                } else if (!this.aClass115_9191.method1899()) {
                    return false;
                } else if (!this.aClass115_9192.method1899()) {
                    return false;
                } else {
                    this.aBool9199 = true;
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    boolean method1108() {
        return this.aBool9199;
    }

}
