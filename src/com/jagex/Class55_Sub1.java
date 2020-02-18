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

    public Class55_Sub1(AbstractRenderer_Sub2 class505_sub2_1) {
        super(class505_sub2_1);
    }

    @Override
    void method1133() {
    }

    @Override
    void method1104() {
        aClass101_9187.method1647();
    }

    @Override
    boolean method1098() {
        return aBool9199;
    }

    @Override
    void method1102() {
    }

    @Override
    void method1110() {
    }

    @Override
    int method1100() {
        return 4;
    }

    @Override
    void method1103(int i_1, Class158_Sub1 class158_sub1_2, Interface6 interface6_3, Interface6 interface6_5) {
        float f_6 = aGraphicalRenderer_Sub2_514.method13905();
        float f_7 = class158_sub1_2.method2714();
        float f_8 = class158_sub1_2.method2716();
        Interface6 interface6_9 = interface6_3;
        float[] floats_10 = {-1.0f, 1.0F, 0.0F, 0.0F, -1.0f, -3.0f, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F};
        int i_11 = (int) f_7;
        int i_12 = (int) f_8;
        int i_13 = i_11;
        int i_14 = i_12;
        if (i_1 == 0) {
            i_11 = 256;
            i_12 = 256;
            aClass101_9187.method1655(aClass115_9185);
            aClass101_9187.method1646();
        } else if (i_1 == 1) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            aClass101_9187.method1655(aClass115_9190);
            aClass101_9187.method1646();
            aClass101_9187.method1658(aNode_Sub21_Sub1_9196, aFloat9186 / f_7, 0.0F);
        } else if (i_1 == 2) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            aClass101_9187.method1655(aClass115_9190);
            aClass101_9187.method1646();
            aClass101_9187.method1658(aNode_Sub21_Sub1_9196, 0.0F, aFloat9186 / f_8);
        } else if (i_1 == 3) {
            aClass101_9187.method1655(aClass115_9191);
            interface6_9 = interface6_5;
            aClass101_9187.method1671(aNode_Sub21_Sub1_9197, 1, interface6_3);
            aClass101_9187.method1646();
        }

        float f_15 = i_11 / f_7;
        float f_16 = i_12 / f_8;
        float f_17 = i_13 / f_7;
        float f_18 = i_14 / f_8;
        floats_10[8] = (floats_10[8] + 1.0F) * f_15 - 1.0F;
        floats_10[5] = (floats_10[5] - 1.0F) * f_16 + 1.0F;
        floats_10[10] *= f_17;
        floats_10[7] *= f_18;
        aClass101_9187.method1688(aNode_Sub21_Sub1_9198, floats_10);
        aClass101_9187.method1671(aNode_Sub21_Sub1_9194, 0, interface6_9);
        aClass101_9187.method1662(aNode_Sub21_Sub1_9195, aFloat9188, aFloat9189, aFloat9184, 0.0F);
        aClass101_9187.method1662(aNode_Sub21_Sub1_9183, f_6 / f_7, f_6 / f_8, 256.0F / f_7, 256.0F / f_8);
        aGraphicalRenderer_Sub2_514.method8617(0, 0, i_11, i_12);
        aGraphicalRenderer_Sub2_514.r(0, 0, i_11, i_12);
    }

    @Override
    int method1106() {
        return 1;
    }

    @Override
    boolean method1128() {
        return aBool9199;
    }

    @Override
    boolean method1111() {
        return aBool9199;
    }

    @Override
    boolean method1125() {
        return aBool9199;
    }

    boolean method14517() {
        return aGraphicalRenderer_Sub2_514.aBool8718 && aGraphicalRenderer_Sub2_514.method13888();
    }

    @Override
    boolean method1101() {
        if (method14517()) {
            aClass101_9187 = aGraphicalRenderer_Sub2_514.loadShader("FilterBloom");
            if (aClass101_9187 == null) {
                return false;
            } else {
                try {
                    aNode_Sub21_Sub1_9194 = aClass101_9187.method1691("sceneTex");
                    aNode_Sub21_Sub1_9197 = aClass101_9187.method1691("bloomTex1");
                    aNode_Sub21_Sub1_9195 = aClass101_9187.method1691("params");
                    aNode_Sub21_Sub1_9196 = aClass101_9187.method1691("sampleSize");
                    aNode_Sub21_Sub1_9183 = aClass101_9187.method1691("pixelOffsetAndBloomScale");
                    aNode_Sub21_Sub1_9198 = aClass101_9187.method1691("PosAndTexCoords");
                    aClass101_9187.method1651("test");
                    aClass115_9182 = aClass101_9187.method1651("techFullscreenTri");
                    aClass115_9185 = aClass101_9187.method1651("brightpass");
                    aClass115_9190 = aClass101_9187.method1651("blur");
                    aClass115_9191 = aClass101_9187.method1651("composite");
                    aClass115_9192 = aClass101_9187.method1651("techDefault");
                } catch (Exception_Sub2_Sub2 exception_sub2_sub2_2) {
                    return false;
                } catch (Exception_Sub2_Sub1 exception_sub2_sub1_3) {
                    return false;
                }

                if (!aClass115_9182.method1899()) {
                    return false;
                } else if (!aClass115_9185.method1899()) {
                    return false;
                } else if (!aClass115_9190.method1899()) {
                    return false;
                } else if (!aClass115_9191.method1899()) {
                    return false;
                } else if (!aClass115_9192.method1899()) {
                    return false;
                } else {
                    aBool9199 = true;
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    @Override
    void method1112() {
    }

    @Override
    void method1124() {
    }

    @Override
    void method1109(int i_1, Class158_Sub1 class158_sub1_2, Interface6 interface6_3, Interface6 interface6_5) {
        float f_6 = aGraphicalRenderer_Sub2_514.method13905();
        float f_7 = class158_sub1_2.method2714();
        float f_8 = class158_sub1_2.method2716();
        Interface6 interface6_9 = interface6_3;
        float[] floats_10 = {-1.0f, 1.0F, 0.0F, 0.0F, -1.0f, -3.0f, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F};
        int i_11 = (int) f_7;
        int i_12 = (int) f_8;
        int i_13 = i_11;
        int i_14 = i_12;
        if (i_1 == 0) {
            i_11 = 256;
            i_12 = 256;
            aClass101_9187.method1655(aClass115_9185);
            aClass101_9187.method1646();
        } else if (i_1 == 1) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            aClass101_9187.method1655(aClass115_9190);
            aClass101_9187.method1646();
            aClass101_9187.method1658(aNode_Sub21_Sub1_9196, aFloat9186 / f_7, 0.0F);
        } else if (i_1 == 2) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            aClass101_9187.method1655(aClass115_9190);
            aClass101_9187.method1646();
            aClass101_9187.method1658(aNode_Sub21_Sub1_9196, 0.0F, aFloat9186 / f_8);
        } else if (i_1 == 3) {
            aClass101_9187.method1655(aClass115_9191);
            interface6_9 = interface6_5;
            aClass101_9187.method1671(aNode_Sub21_Sub1_9197, 1, interface6_3);
            aClass101_9187.method1646();
        }

        float f_15 = i_11 / f_7;
        float f_16 = i_12 / f_8;
        float f_17 = i_13 / f_7;
        float f_18 = i_14 / f_8;
        floats_10[8] = (floats_10[8] + 1.0F) * f_15 - 1.0F;
        floats_10[5] = (floats_10[5] - 1.0F) * f_16 + 1.0F;
        floats_10[10] *= f_17;
        floats_10[7] *= f_18;
        aClass101_9187.method1688(aNode_Sub21_Sub1_9198, floats_10);
        aClass101_9187.method1671(aNode_Sub21_Sub1_9194, 0, interface6_9);
        aClass101_9187.method1662(aNode_Sub21_Sub1_9195, aFloat9188, aFloat9189, aFloat9184, 0.0F);
        aClass101_9187.method1662(aNode_Sub21_Sub1_9183, f_6 / f_7, f_6 / f_8, 256.0F / f_7, 256.0F / f_8);
        aGraphicalRenderer_Sub2_514.method8617(0, 0, i_11, i_12);
        aGraphicalRenderer_Sub2_514.r(0, 0, i_11, i_12);
    }

    @Override
    void method1119(int i_1, Class158_Sub1 class158_sub1_2, Interface6 interface6_3, Interface6 interface6_5) {
        float f_6 = aGraphicalRenderer_Sub2_514.method13905();
        float f_7 = class158_sub1_2.method2714();
        float f_8 = class158_sub1_2.method2716();
        Interface6 interface6_9 = interface6_3;
        float[] floats_10 = {-1.0f, 1.0F, 0.0F, 0.0F, -1.0f, -3.0f, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F};
        int i_11 = (int) f_7;
        int i_12 = (int) f_8;
        int i_13 = i_11;
        int i_14 = i_12;
        if (i_1 == 0) {
            i_11 = 256;
            i_12 = 256;
            aClass101_9187.method1655(aClass115_9185);
            aClass101_9187.method1646();
        } else if (i_1 == 1) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            aClass101_9187.method1655(aClass115_9190);
            aClass101_9187.method1646();
            aClass101_9187.method1658(aNode_Sub21_Sub1_9196, aFloat9186 / f_7, 0.0F);
        } else if (i_1 == 2) {
            i_11 = 256;
            i_12 = 256;
            i_13 = i_11;
            i_14 = i_12;
            aClass101_9187.method1655(aClass115_9190);
            aClass101_9187.method1646();
            aClass101_9187.method1658(aNode_Sub21_Sub1_9196, 0.0F, aFloat9186 / f_8);
        } else if (i_1 == 3) {
            aClass101_9187.method1655(aClass115_9191);
            interface6_9 = interface6_5;
            aClass101_9187.method1671(aNode_Sub21_Sub1_9197, 1, interface6_3);
            aClass101_9187.method1646();
        }

        float f_15 = i_11 / f_7;
        float f_16 = i_12 / f_8;
        float f_17 = i_13 / f_7;
        float f_18 = i_14 / f_8;
        floats_10[8] = (floats_10[8] + 1.0F) * f_15 - 1.0F;
        floats_10[5] = (floats_10[5] - 1.0F) * f_16 + 1.0F;
        floats_10[10] *= f_17;
        floats_10[7] *= f_18;
        aClass101_9187.method1688(aNode_Sub21_Sub1_9198, floats_10);
        aClass101_9187.method1671(aNode_Sub21_Sub1_9194, 0, interface6_9);
        aClass101_9187.method1662(aNode_Sub21_Sub1_9195, aFloat9188, aFloat9189, aFloat9184, 0.0F);
        aClass101_9187.method1662(aNode_Sub21_Sub1_9183, f_6 / f_7, f_6 / f_8, 256.0F / f_7, 256.0F / f_8);
        aGraphicalRenderer_Sub2_514.method8617(0, 0, i_11, i_12);
        aGraphicalRenderer_Sub2_514.r(0, 0, i_11, i_12);
    }

    @Override
    void method1120() {
        aClass101_9187.method1647();
    }

    @Override
    void method1115() {
    }

    @Override
    boolean method1113() {
        if (method14517()) {
            aClass101_9187 = aGraphicalRenderer_Sub2_514.loadShader("FilterBloom");
            if (aClass101_9187 == null) {
                return false;
            } else {
                try {
                    aNode_Sub21_Sub1_9194 = aClass101_9187.method1691("sceneTex");
                    aNode_Sub21_Sub1_9197 = aClass101_9187.method1691("bloomTex1");
                    aNode_Sub21_Sub1_9195 = aClass101_9187.method1691("params");
                    aNode_Sub21_Sub1_9196 = aClass101_9187.method1691("sampleSize");
                    aNode_Sub21_Sub1_9183 = aClass101_9187.method1691("pixelOffsetAndBloomScale");
                    aNode_Sub21_Sub1_9198 = aClass101_9187.method1691("PosAndTexCoords");
                    aClass101_9187.method1651("test");
                    aClass115_9182 = aClass101_9187.method1651("techFullscreenTri");
                    aClass115_9185 = aClass101_9187.method1651("brightpass");
                    aClass115_9190 = aClass101_9187.method1651("blur");
                    aClass115_9191 = aClass101_9187.method1651("composite");
                    aClass115_9192 = aClass101_9187.method1651("techDefault");
                } catch (Exception_Sub2_Sub2 exception_sub2_sub2_2) {
                    return false;
                } catch (Exception_Sub2_Sub1 exception_sub2_sub1_3) {
                    return false;
                }

                if (!aClass115_9182.method1899()) {
                    return false;
                } else if (!aClass115_9185.method1899()) {
                    return false;
                } else if (!aClass115_9190.method1899()) {
                    return false;
                } else if (!aClass115_9191.method1899()) {
                    return false;
                } else if (!aClass115_9192.method1899()) {
                    return false;
                } else {
                    aBool9199 = true;
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    @Override
    boolean method1097() {
        if (method14517()) {
            aClass101_9187 = aGraphicalRenderer_Sub2_514.loadShader("FilterBloom");
            if (aClass101_9187 == null) {
                return false;
            } else {
                try {
                    aNode_Sub21_Sub1_9194 = aClass101_9187.method1691("sceneTex");
                    aNode_Sub21_Sub1_9197 = aClass101_9187.method1691("bloomTex1");
                    aNode_Sub21_Sub1_9195 = aClass101_9187.method1691("params");
                    aNode_Sub21_Sub1_9196 = aClass101_9187.method1691("sampleSize");
                    aNode_Sub21_Sub1_9183 = aClass101_9187.method1691("pixelOffsetAndBloomScale");
                    aNode_Sub21_Sub1_9198 = aClass101_9187.method1691("PosAndTexCoords");
                    aClass101_9187.method1651("test");
                    aClass115_9182 = aClass101_9187.method1651("techFullscreenTri");
                    aClass115_9185 = aClass101_9187.method1651("brightpass");
                    aClass115_9190 = aClass101_9187.method1651("blur");
                    aClass115_9191 = aClass101_9187.method1651("composite");
                    aClass115_9192 = aClass101_9187.method1651("techDefault");
                } catch (Exception_Sub2_Sub2 exception_sub2_sub2_2) {
                    return false;
                } catch (Exception_Sub2_Sub1 exception_sub2_sub1_3) {
                    return false;
                }

                if (!aClass115_9182.method1899()) {
                    return false;
                } else if (!aClass115_9185.method1899()) {
                    return false;
                } else if (!aClass115_9190.method1899()) {
                    return false;
                } else if (!aClass115_9191.method1899()) {
                    return false;
                } else if (!aClass115_9192.method1899()) {
                    return false;
                } else {
                    aBool9199 = true;
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    @Override
    boolean method1108() {
        return aBool9199;
    }

}
