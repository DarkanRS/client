package com.jagex;

public abstract class Class41_Sub1 extends Class41 {

    static Matrix44 aClass384_9228 = new Matrix44();
    protected Shader aClass101_9218;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9206;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9212;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9211;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9204;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9202;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9207;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9208;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9216;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9229;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9209;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9214;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9215;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9217;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9213;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9203;
    Node_Sub21_Sub1 aNode_Sub21_Sub1_9205;
    int anInt9226;
    int[] anIntArray9201;
    float[] aFloatArray9230 = new float[3];
    Matrix44[] aClass384Array9227;

    Class41_Sub1(HardwareRenderer class505_sub2_1) {
        super(class505_sub2_1);
        new Matrix44Var();
        aClass384Array9227 = new Matrix44[aGraphicalRenderer_Sub2_413.anInt8825];

        for (int i_2 = 0; i_2 < aGraphicalRenderer_Sub2_413.anInt8825; i_2++) {
            aClass384Array9227[i_2] = new Matrix44();
        }

    }

    @Override
    void method877() {
    }

    boolean method14523(String string_1) throws Exception_Sub2 {
        aClass101_9218 = aGraphicalRenderer_Sub2_413.loadShader(string_1);
        if (aClass101_9218 == null) {
            throw new Exception_Sub2("");
        } else {
            aNode_Sub21_Sub1_9212 = aClass101_9218.method1681("textureMatrix");
            aNode_Sub21_Sub1_9211 = aClass101_9218.method1681("modelMatrix");
            aNode_Sub21_Sub1_9204 = aClass101_9218.method1681("viewMatrix");
            aNode_Sub21_Sub1_9202 = aClass101_9218.method1681("projectionMatrix");
            aNode_Sub21_Sub1_9207 = aClass101_9218.method1681("modelViewMatrix");
            aNode_Sub21_Sub1_9208 = aClass101_9218.method1681("modelViewProjectionMatrix");
            aNode_Sub21_Sub1_9216 = aClass101_9218.method1681("viewProjectionMatrix");
            aNode_Sub21_Sub1_9229 = aClass101_9218.method1681("ambientColour");
            aNode_Sub21_Sub1_9209 = aClass101_9218.method1681("sunDirection");
            aNode_Sub21_Sub1_9214 = aClass101_9218.method1681("sunColour");
            aNode_Sub21_Sub1_9215 = aClass101_9218.method1681("antiSunColour");
            aNode_Sub21_Sub1_9217 = aClass101_9218.method1681("sunExponent");
            aNode_Sub21_Sub1_9213 = aClass101_9218.method1681("eyePosition");
            aNode_Sub21_Sub1_9203 = aClass101_9218.method1681("eyePositionOS");
            aNode_Sub21_Sub1_9205 = aClass101_9218.method1681("sunDirectionOS");
            if (!method14524()) {
                aClass101_9218 = null;
                aNode_Sub21_Sub1_9212 = null;
                aNode_Sub21_Sub1_9211 = null;
                aNode_Sub21_Sub1_9204 = null;
                aNode_Sub21_Sub1_9202 = null;
                aNode_Sub21_Sub1_9207 = null;
                aNode_Sub21_Sub1_9208 = null;
                aNode_Sub21_Sub1_9216 = null;
                aNode_Sub21_Sub1_9229 = null;
                aNode_Sub21_Sub1_9209 = null;
                aNode_Sub21_Sub1_9214 = null;
                aNode_Sub21_Sub1_9215 = null;
                aNode_Sub21_Sub1_9217 = null;
                aNode_Sub21_Sub1_9213 = null;
                aNode_Sub21_Sub1_9203 = null;
                aNode_Sub21_Sub1_9205 = null;
                return false;
            } else {
                if (aClass101_9218.method1656() == null) {
                    Class115 class115_2 = aClass101_9218.method1654();
                    if (class115_2 == null) {
                        throw new Exception_Sub2(aClass101_9218.method1717() + "");
                    }

                    aClass101_9218.method1655(class115_2);
                }

                anInt9226 = aClass101_9218.method1650();
                anIntArray9201 = new int[anInt9226];
                return true;
            }
        }
    }

    abstract boolean method14524() throws Exception_Sub2;

    void method14526() {
        method14530(aGraphicalRenderer_Sub2_413.aBool8684);
        method14527(aGraphicalRenderer_Sub2_413.method13884());
        method14528();
        method877();
    }

    @Override
    void method885() {
        if (aClass101_9218 != null) {
            aClass101_9218.method1647();
        }

    }

    void method14527(Matrix44 matrix44_1) {
        if (aClass101_9218 != null && aClass101_9218.method1648() && aGraphicalRenderer_Sub2_413.method13963() == 0) {
            int i_2 = aClass101_9218.method1714();
            if ((anIntArray9201[i_2] & 0x80) != 0 && aNode_Sub21_Sub1_9212 != null) {
                aClass101_9218.method1667(aNode_Sub21_Sub1_9212, matrix44_1);
                anIntArray9201[i_2] &= -129;
            }
        }

    }

    void method14528() {
        if (aClass101_9218 != null && aClass101_9218.method1648()) {
            int i_1 = aClass101_9218.method1714();
            int i_2 = anIntArray9201[i_1];
            if ((i_2 & 0x1) != 0 && aNode_Sub21_Sub1_9211 != null) {
                aClass101_9218.method1668(aNode_Sub21_Sub1_9211, aGraphicalRenderer_Sub2_413.method14036());
            }

            if ((i_2 & 0x2) != 0) {
                if (aNode_Sub21_Sub1_9204 != null) {
                    aClass101_9218.method1668(aNode_Sub21_Sub1_9204, aGraphicalRenderer_Sub2_413.method14126());
                }

                if (aNode_Sub21_Sub1_9213 != null) {
                    aFloatArray9230[0] = 0.0F;
                    aFloatArray9230[1] = 0.0F;
                    aFloatArray9230[2] = 0.0F;
                    aGraphicalRenderer_Sub2_413.method8458().method5228(aFloatArray9230[0], aFloatArray9230[1], aFloatArray9230[2], aFloatArray9230);
                    aClass101_9218.method1661(aNode_Sub21_Sub1_9213, aFloatArray9230[0], aFloatArray9230[1], aFloatArray9230[2]);
                }
            }

            if ((i_2 & 0x10) != 0 && aNode_Sub21_Sub1_9207 != null) {
                aClass101_9218.method1668(aNode_Sub21_Sub1_9207, aGraphicalRenderer_Sub2_413.method13930());
            }

            if ((i_2 & 0x8) != 0 && aNode_Sub21_Sub1_9206 != null) {
                aClass101_9218.method1668(aNode_Sub21_Sub1_9206, aGraphicalRenderer_Sub2_413.method13998());
            }

            if ((i_2 & 0x4) != 0 && aNode_Sub21_Sub1_9202 != null) {
                aClass101_9218.method1668(aNode_Sub21_Sub1_9202, aGraphicalRenderer_Sub2_413.method13912());
            }

            if ((i_2 & 0x20) != 0 && aNode_Sub21_Sub1_9208 != null) {
                aClass384_9228.method6568(aGraphicalRenderer_Sub2_413.method13930(), aGraphicalRenderer_Sub2_413.method13912());
                aClass101_9218.method1668(aNode_Sub21_Sub1_9208, aClass384_9228);
            }

            if ((i_2 & 0x40) != 0 && aNode_Sub21_Sub1_9216 != null) {
                aClass384_9228.method6568(aGraphicalRenderer_Sub2_413.method14126(), aGraphicalRenderer_Sub2_413.method13912());
                aClass101_9218.method1668(aNode_Sub21_Sub1_9216, aClass384_9228);
            }

            if (aGraphicalRenderer_Sub2_413.method13963() == 0 && (anIntArray9201[i_1] & 0x80) != 0 && aNode_Sub21_Sub1_9212 != null) {
                aClass101_9218.method1667(aNode_Sub21_Sub1_9212, aGraphicalRenderer_Sub2_413.method13884());
                anIntArray9201[i_1] &= -129;
            }

            anIntArray9201[i_1] = 0;
        }

    }

    void method14529(Matrix44Var matrix44var_2) {
        if (aNode_Sub21_Sub1_9203 != null) {
            Matrix44 matrix44_3 = aGraphicalRenderer_Sub2_413.method13998();
            float[] floats_4 = {matrix44_3.buf[12], matrix44_3.buf[13], matrix44_3.buf[14]};
            float[] floats_5 = {0.0F, 0.0F, 0.0F};
            matrix44_3.method6528(floats_5);
            float[] floats_6 = {0.0F, 0.0F, 0.0F};
            aGraphicalRenderer_Sub2_413.method8458().method5226(0.0F, 0.0F, 0.0F, floats_6);
            matrix44var_2.method5243(floats_4);
            aClass101_9218.method1661(aNode_Sub21_Sub1_9203, floats_4[0], floats_4[1], floats_4[2]);
        }

    }

    @Override
    void method886() {
        method14532(Matrix44Var.aClass294_3518);
    }

    void method14530(boolean bool_1) {
        if (aClass101_9218 != null && aClass101_9218.method1648()) {
            if (aNode_Sub21_Sub1_9229 != null) {
                aClass101_9218.method1661(aNode_Sub21_Sub1_9229, aGraphicalRenderer_Sub2_413.aFloat8766 * aGraphicalRenderer_Sub2_413.aFloat8769, aGraphicalRenderer_Sub2_413.aFloat8767 * aGraphicalRenderer_Sub2_413.aFloat8769, aGraphicalRenderer_Sub2_413.aFloat8768 * aGraphicalRenderer_Sub2_413.aFloat8769);
            }

            if (aNode_Sub21_Sub1_9209 != null) {
                aClass101_9218.method1661(aNode_Sub21_Sub1_9209, aGraphicalRenderer_Sub2_413.aFloatArray8747[0], aGraphicalRenderer_Sub2_413.aFloatArray8747[1], aGraphicalRenderer_Sub2_413.aFloatArray8747[2]);
            }

            if (aNode_Sub21_Sub1_9214 != null) {
                aClass101_9218.method1661(aNode_Sub21_Sub1_9214, aGraphicalRenderer_Sub2_413.aFloat8766 * aGraphicalRenderer_Sub2_413.aFloat8770, aGraphicalRenderer_Sub2_413.aFloat8767 * aGraphicalRenderer_Sub2_413.aFloat8770, aGraphicalRenderer_Sub2_413.aFloat8768 * aGraphicalRenderer_Sub2_413.aFloat8770);
            }

            if (aNode_Sub21_Sub1_9215 != null) {
                aClass101_9218.method1661(aNode_Sub21_Sub1_9215, -aGraphicalRenderer_Sub2_413.aFloat8766 * aGraphicalRenderer_Sub2_413.aFloat8826, -aGraphicalRenderer_Sub2_413.aFloat8767 * aGraphicalRenderer_Sub2_413.aFloat8826, -aGraphicalRenderer_Sub2_413.aFloat8768 * aGraphicalRenderer_Sub2_413.aFloat8826);
            }

            if (aNode_Sub21_Sub1_9217 != null) {
                aClass101_9218.method1659(aNode_Sub21_Sub1_9217, 64.0F + Math.abs(aGraphicalRenderer_Sub2_413.aFloatArray8747[1]) * 928.0F);
            }
        }

    }

    @Override
    void method879() {
        method14532(Matrix44Var.aClass294_3518);
    }

    void method14532(Matrix44Var matrix44var_1) {
        Matrix44 matrix44_2 = aGraphicalRenderer_Sub2_413.aClass384_8683;
        matrix44_2.fromVarMatrix44(matrix44var_1);
        int i_3 = aClass101_9218.method1714();
        if (aNode_Sub21_Sub1_9211 != null) {
            aClass101_9218.method1668(aNode_Sub21_Sub1_9211, matrix44_2);
            anIntArray9201[i_3] &= -2;
        }

        if (aNode_Sub21_Sub1_9207 != null) {
            aClass384_9228.method6568(matrix44_2, aGraphicalRenderer_Sub2_413.method14126());
            aClass101_9218.method1668(aNode_Sub21_Sub1_9207, aClass384_9228);
            anIntArray9201[i_3] &= -17;
        }

        if (aNode_Sub21_Sub1_9208 != null) {
            aClass384_9228.method6568(matrix44_2, aGraphicalRenderer_Sub2_413.method13931());
            aClass101_9218.method1668(aNode_Sub21_Sub1_9208, aClass384_9228);
            anIntArray9201[i_3] &= -33;
        }

        method14529(matrix44var_1);
        method14549(matrix44var_1);
    }

    @Override
    void method888() {
        aClass101_9218.method1646();
        anIntArray9201[aClass101_9218.method1714()] = -1;
        method14550();
        method14526();
    }

    @Override
    void method889() {
        method14532(Matrix44Var.aClass294_3518);
    }

    void method14536() {
        for (int i_2 = 0; i_2 < anInt9226; i_2++) {
            anIntArray9201[i_2] |= 128;
        }

    }

    abstract boolean method14539() throws Exception_Sub2;

    abstract boolean method14541() throws Exception_Sub2;

    @Override
    void method873() {
        aClass101_9218.method1646();
        anIntArray9201[aClass101_9218.method1714()] = -1;
        method14550();
        method14526();
    }

    void method14549(Matrix44Var matrix44var_2) {
        if (aNode_Sub21_Sub1_9205 != null) {
            float[] floats_3 = {aGraphicalRenderer_Sub2_413.aFloatArray8747[0], aGraphicalRenderer_Sub2_413.aFloatArray8747[1], aGraphicalRenderer_Sub2_413.aFloatArray8747[2]};
            matrix44var_2.method5230(floats_3);
            aClass101_9218.method1661(aNode_Sub21_Sub1_9205, floats_3[0], floats_3[1], floats_3[2]);
        }

    }

    void method14550() {
        aClass384Array9227[0].identity();
        method14536();
    }

}
