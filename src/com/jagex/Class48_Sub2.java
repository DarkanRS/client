package com.jagex;

public class Class48_Sub2 extends Class48 {

    public static byte MY_PLAYER_FC_RANK;
    int[] anIntArray9233;
    Matrix44 aClass384_9259 = new Matrix44();
    Class115[] aClass115Array9254 = new Class115[18];
    int[][] anIntArrayArray9258 = new int[18][17];
    Shader aClass101_9257;

    public Class48_Sub2(HardwareRenderer class505_sub2_1) throws Exception_Sub2 {
        super(class505_sub2_1);
        method14567();
    }

    public static void method14571() {
        Node_Sub31 class282_sub31_1;
        for (class282_sub31_1 = (Node_Sub31) Node_Sub31.aClass482_7775.head(); class282_sub31_1 != null; class282_sub31_1 = (Node_Sub31) Node_Sub31.aClass482_7775.next()) {
            if (!class282_sub31_1.aBool7774) {
                class282_sub31_1.aBool7773 = true;
                if (class282_sub31_1.anInt7762 >= 0 && class282_sub31_1.anInt7763 >= 0 && class282_sub31_1.anInt7762 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && class282_sub31_1.anInt7763 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
                    EntityNode_Sub4.method12585(class282_sub31_1);
                }
            } else {
                class282_sub31_1.unlink();
            }
        }

        for (class282_sub31_1 = (Node_Sub31) Node_Sub31.aClass482_7776.head(); class282_sub31_1 != null; class282_sub31_1 = (Node_Sub31) Node_Sub31.aClass482_7776.next()) {
            if (!class282_sub31_1.aBool7774) {
                class282_sub31_1.aBool7773 = true;
            } else {
                class282_sub31_1.unlink();
            }
        }

    }

    static void method14572(int i_0, int i_1, int i_2, int i_3, int i_4) {
        KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_2++], i_0, i_1, i_4);
        KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_3--], i_0, i_1, i_4);

        for (int i_6 = i_2; i_6 <= i_3; i_6++) {
            int[] ints_7 = Class532_Sub1.anIntArrayArray7072[i_6];
            ints_7[i_0] = ints_7[i_1] = i_4;
        }

    }

    @Override
    public void method954(boolean bool_1) {
        if (bool_1) {
            aClass101_9257.method1655(aClass115Array9254[1]);
        } else {
            aClass101_9257.method1655(aClass115Array9254[0]);
        }

        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1677(anIntArray9233[2], 0, anInterface6_452);
        aClass101_9257.method1676(anIntArray9233[4], aClass384_9259);
        aClass101_9257.method1675(anIntArray9233[5], aClass384_454);
        aClass101_9257.method1749(anIntArray9233[7], aClass303_458.x, aClass303_458.y, aClass303_458.z, aClass303_458.w);
        aClass101_9257.method1670(anIntArray9233[8], aClass385_459.x, aClass385_459.y, aClass385_459.z);
        aClass101_9257.method1749(anIntArray9233[9], aClass303_460.x, aClass303_460.y, aClass303_460.z, aClass303_460.w);
        aClass101_9257.method1670(anIntArray9233[10], aClass385_457.x, aClass385_457.y, aClass385_457.z);
        aGraphicalRenderer_Sub2_449.method14002(Class352.aClass352_4098, anInt467 * -939296569 * 576571639, anInt468, anInt469 * -1431655765 * 3 * -1431655765 * 3, anInt470);
    }

    @Override
    public void method962(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[i_1 + 7]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1670(anIntArray9233[6], aClass385_455.x, aClass385_455.y, aClass385_455.z);
        aClass101_9257.method1749(anIntArray9233[16], aFloat456, aFloat453, 0.0F, 0.0F);
        method14564(i_1);
    }

    @Override
    public void method967(Matrix44 matrix44_1) {
        aClass384_9259.method6562(matrix44_1);
        aClass384_9259.method6523(aGraphicalRenderer_Sub2_449.aClass384_8729);
    }

    @Override
    public void method946(boolean bool_1) {
        if (bool_1) {
            aClass101_9257.method1655(aClass115Array9254[1]);
        } else {
            aClass101_9257.method1655(aClass115Array9254[0]);
        }

        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1677(anIntArray9233[2], 0, anInterface6_452);
        aClass101_9257.method1676(anIntArray9233[4], aClass384_9259);
        aClass101_9257.method1675(anIntArray9233[5], aClass384_454);
        aClass101_9257.method1749(anIntArray9233[7], aClass303_458.x, aClass303_458.y, aClass303_458.z, aClass303_458.w);
        aClass101_9257.method1670(anIntArray9233[8], aClass385_459.x, aClass385_459.y, aClass385_459.z);
        aClass101_9257.method1749(anIntArray9233[9], aClass303_460.x, aClass303_460.y, aClass303_460.z, aClass303_460.w);
        aClass101_9257.method1670(anIntArray9233[10], aClass385_457.x, aClass385_457.y, aClass385_457.z);
        aGraphicalRenderer_Sub2_449.method14002(Class352.aClass352_4098, anInt467, anInt468, anInt469, anInt470);
    }

    @Override
    public void method950() {
        aClass101_9257.method1655(aClass115Array9254[17]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        method14564(0);
    }

    void method14564(int i_1) {
        aClass101_9257.method1677(anIntArray9233[2], 0, anInterface6_452);
        aClass101_9257.method1676(anIntArray9233[4], aClass384_9259);
        aClass101_9257.method1675(anIntArray9233[5], aClass384_454);
        aClass101_9257.method1749(anIntArray9233[7], aClass303_458.x, aClass303_458.y, aClass303_458.z, aClass303_458.w);
        aClass101_9257.method1670(anIntArray9233[8], aClass385_459.x, aClass385_459.y, aClass385_459.z);
        aClass101_9257.method1749(anIntArray9233[9], aClass303_460.x, aClass303_460.y, aClass303_460.z, aClass303_460.w);
        aClass101_9257.method1670(anIntArray9233[10], aClass385_457.x, aClass385_457.y, aClass385_457.z);
        aClass101_9257.method1672(anIntArray9233[11], aClass385_466);
        aClass101_9257.method1672(anIntArray9233[12], aClass385_448);
        aClass101_9257.method1672(anIntArray9233[13], aClass385_464);
        aClass101_9257.method1672(anIntArray9233[14], aClass385_461);
        if (i_1 > 0) {
            aClass101_9257.method1673(anIntArray9233[1], aFloatArray463, i_1 * 4);
            aClass101_9257.method1673(anIntArray9233[0], aFloatArray450, i_1 * 4);
        }

        aGraphicalRenderer_Sub2_449.method14002(Class352.aClass352_4098, anInt467, anInt468, anInt469, anInt470);
    }

    @Override
    public void method965(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[i_1 + 2]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        method14564(i_1);
    }

    @Override
    public void method948(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[i_1 + 7]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1670(anIntArray9233[6], aClass385_455.x, aClass385_455.y, aClass385_455.z);
        aClass101_9257.method1749(anIntArray9233[16], aFloat456, aFloat453, 0.0F, 0.0F);
        method14564(i_1);
    }

    @Override
    public void method949(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[i_1 + 12]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1674(anIntArray9233[15], aClass384_465);
        aClass101_9257.method1670(anIntArray9233[6], aClass385_455.x, aClass385_455.y, aClass385_455.z);
        aClass101_9257.method1677(anIntArray9233[3], 1, anInterface31_451);
        method14564(i_1);
    }

    @Override
    public void method951(Matrix44 matrix44_1) {
        aClass384_9259.method6562(matrix44_1);
        aClass384_9259.method6523(aGraphicalRenderer_Sub2_449.aClass384_8729);
    }

    @Override
    public void method952(Matrix44 matrix44_1) {
        aClass384_9259.method6562(matrix44_1);
        aClass384_9259.method6523(aGraphicalRenderer_Sub2_449.aClass384_8729);
    }

    @Override
    public void method953(Matrix44 matrix44_1) {
        aClass384_9259.method6562(matrix44_1);
        aClass384_9259.method6523(aGraphicalRenderer_Sub2_449.aClass384_8729);
    }

    @Override
    public void method963(Matrix44 matrix44_1) {
        aClass384_9259.method6562(matrix44_1);
        aClass384_9259.method6523(aGraphicalRenderer_Sub2_449.aClass384_8729);
    }

    @Override
    public void method955(boolean bool_1) {
        if (bool_1) {
            aClass101_9257.method1655(aClass115Array9254[1]);
        } else {
            aClass101_9257.method1655(aClass115Array9254[0]);
        }

        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1677(anIntArray9233[2], 0, anInterface6_452);
        aClass101_9257.method1676(anIntArray9233[4], aClass384_9259);
        aClass101_9257.method1675(anIntArray9233[5], aClass384_454);
        aClass101_9257.method1749(anIntArray9233[7], aClass303_458.x, aClass303_458.y, aClass303_458.z, aClass303_458.w);
        aClass101_9257.method1670(anIntArray9233[8], aClass385_459.x, aClass385_459.y, aClass385_459.z);
        aClass101_9257.method1749(anIntArray9233[9], aClass303_460.x, aClass303_460.y, aClass303_460.z, aClass303_460.w);
        aClass101_9257.method1670(anIntArray9233[10], aClass385_457.x, aClass385_457.y, aClass385_457.z);
        aGraphicalRenderer_Sub2_449.method14002(Class352.aClass352_4098, anInt467 * -939296569 * 576571639, anInt468, anInt469 * -1431655765 * 3 * -1431655765 * 3, anInt470);
    }

    @Override
    public void method956(boolean bool_1) {
        if (bool_1) {
            aClass101_9257.method1655(aClass115Array9254[1]);
        } else {
            aClass101_9257.method1655(aClass115Array9254[0]);
        }

        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1677(anIntArray9233[2], 0, anInterface6_452);
        aClass101_9257.method1676(anIntArray9233[4], aClass384_9259);
        aClass101_9257.method1675(anIntArray9233[5], aClass384_454);
        aClass101_9257.method1749(anIntArray9233[7], aClass303_458.x, aClass303_458.y, aClass303_458.z, aClass303_458.w);
        aClass101_9257.method1670(anIntArray9233[8], aClass385_459.x, aClass385_459.y, aClass385_459.z);
        aClass101_9257.method1749(anIntArray9233[9], aClass303_460.x, aClass303_460.y, aClass303_460.z, aClass303_460.w);
        aClass101_9257.method1670(anIntArray9233[10], aClass385_457.x, aClass385_457.y, aClass385_457.z);
        aGraphicalRenderer_Sub2_449.method14002(Class352.aClass352_4098, anInt467 * -939296569 * 576571639, anInt468, anInt469 * -1431655765 * 3 * -1431655765 * 3, anInt470);
    }

    @Override
    public void method966() {
        aClass101_9257.method1655(aClass115Array9254[17]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        method14564(0);
    }

    @Override
    public void method945(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[2 + i_1]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        method14564(i_1);
    }

    @Override
    public void method959(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[2 + i_1]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        method14564(i_1);
    }

    @Override
    public void method961(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[i_1 + 7]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1670(anIntArray9233[6], aClass385_455.x, aClass385_455.y, aClass385_455.z);
        aClass101_9257.method1749(anIntArray9233[16], aFloat456, aFloat453, 0.0F, 0.0F);
        method14564(i_1);
    }

    @Override
    public void method947(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[i_1 + 7]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1670(anIntArray9233[6], aClass385_455.x, aClass385_455.y, aClass385_455.z);
        aClass101_9257.method1749(anIntArray9233[16], aFloat456, aFloat453, 0.0F, 0.0F);
        method14564(i_1);
    }

    @Override
    public void method964(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[i_1 + 7]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1670(anIntArray9233[6], aClass385_455.x, aClass385_455.y, aClass385_455.z);
        aClass101_9257.method1749(anIntArray9233[16], aFloat456, aFloat453, 0.0F, 0.0F);
        method14564(i_1);
    }

    @Override
    public void method958(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[12 + i_1]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        aClass101_9257.method1674(anIntArray9233[15], aClass384_465);
        aClass101_9257.method1670(anIntArray9233[6], aClass385_455.x, aClass385_455.y, aClass385_455.z);
        aClass101_9257.method1677(anIntArray9233[3], 1, anInterface31_451);
        method14564(i_1);
    }

    boolean method14567() throws Exception_Sub2 {
        aClass101_9257 = aGraphicalRenderer_Sub2_449.loadShader("Model");
        Node_Sub21_Sub1 class282_sub21_sub1_2 = aClass101_9257.method1691("DiffuseSampler");
        Node_Sub21_Sub1 class282_sub21_sub1_3 = aClass101_9257.method1691("EnvironmentSampler");
        Node_Sub21_Sub1 class282_sub21_sub1_4 = aClass101_9257.method1691("PointLightsPosAndRadiusSq");
        Node_Sub21_Sub1 class282_sub21_sub1_5 = aClass101_9257.method1691("PointLightsDiffuseColour");
        Node_Sub21_Sub1 class282_sub21_sub1_6 = aClass101_9257.method1691("WVPMatrix");
        Node_Sub21_Sub1 class282_sub21_sub1_7 = aClass101_9257.method1691("TexCoordMatrix");
        Node_Sub21_Sub1 class282_sub21_sub1_8 = aClass101_9257.method1691("HeightFogPlane");
        Node_Sub21_Sub1 class282_sub21_sub1_9 = aClass101_9257.method1691("HeightFogColour");
        Node_Sub21_Sub1 class282_sub21_sub1_10 = aClass101_9257.method1691("DistanceFogPlane");
        Node_Sub21_Sub1 class282_sub21_sub1_11 = aClass101_9257.method1691("DistanceFogColour");
        Node_Sub21_Sub1 class282_sub21_sub1_12 = aClass101_9257.method1691("SunDir");
        Node_Sub21_Sub1 class282_sub21_sub1_13 = aClass101_9257.method1691("SunColour");
        Node_Sub21_Sub1 class282_sub21_sub1_14 = aClass101_9257.method1691("AntiSunColour");
        Node_Sub21_Sub1 class282_sub21_sub1_15 = aClass101_9257.method1691("AmbientColour");
        Node_Sub21_Sub1 class282_sub21_sub1_16 = aClass101_9257.method1691("EyePos");
        Node_Sub21_Sub1 class282_sub21_sub1_17 = aClass101_9257.method1691("SpecularExponent");
        Node_Sub21_Sub1 class282_sub21_sub1_18 = aClass101_9257.method1691("WorldMatrix");
        aClass115Array9254[0] = aClass101_9257.method1651("Unlit");
        aClass115Array9254[1] = aClass101_9257.method1651("Unlit_IgnoreAlpha");
        aClass115Array9254[17] = aClass101_9257.method1651("UnderwaterGround");

        int i_19;
        for (i_19 = 0; i_19 <= 4; i_19++) {
            aClass115Array9254[i_19 + 2] = aClass101_9257.method1651("Standard_" + i_19 + "PointLights");
            aClass115Array9254[i_19 + 7] = aClass101_9257.method1651("Specular_" + i_19 + "PointLights");
            aClass115Array9254[i_19 + 12] = aClass101_9257.method1651("EnvironmentalMapping_" + i_19 + "PointLights");
        }

        for (i_19 = 0; i_19 < 18; i_19++) {
            int i_20 = aClass101_9257.method1653(aClass115Array9254[i_19]);
            anIntArrayArray9258[i_19][2] = class282_sub21_sub1_2.method15460(i_20);
            anIntArrayArray9258[i_19][3] = class282_sub21_sub1_3.method15460(i_20);
            anIntArrayArray9258[i_19][1] = class282_sub21_sub1_4.method15460(i_20);
            anIntArrayArray9258[i_19][0] = class282_sub21_sub1_5.method15460(i_20);
            anIntArrayArray9258[i_19][4] = class282_sub21_sub1_6.method15460(i_20);
            anIntArrayArray9258[i_19][5] = class282_sub21_sub1_7.method15460(i_20);
            anIntArrayArray9258[i_19][7] = class282_sub21_sub1_8.method15460(i_20);
            anIntArrayArray9258[i_19][8] = class282_sub21_sub1_9.method15460(i_20);
            anIntArrayArray9258[i_19][9] = class282_sub21_sub1_10.method15460(i_20);
            anIntArrayArray9258[i_19][10] = class282_sub21_sub1_11.method15460(i_20);
            anIntArrayArray9258[i_19][11] = class282_sub21_sub1_12.method15460(i_20);
            anIntArrayArray9258[i_19][12] = class282_sub21_sub1_13.method15460(i_20);
            anIntArrayArray9258[i_19][13] = class282_sub21_sub1_14.method15460(i_20);
            anIntArrayArray9258[i_19][14] = class282_sub21_sub1_15.method15460(i_20);
            anIntArrayArray9258[i_19][6] = class282_sub21_sub1_16.method15460(i_20);
            anIntArrayArray9258[i_19][15] = class282_sub21_sub1_18.method15460(i_20);
            anIntArrayArray9258[i_19][16] = class282_sub21_sub1_17.method15460(i_20);
        }

        aClass101_9257.method1655(aClass115Array9254[2]);
        return true;
    }

    @Override
    public void method957(Matrix44 matrix44_1) {
        aClass384_9259.method6562(matrix44_1);
        aClass384_9259.method6523(aGraphicalRenderer_Sub2_449.aClass384_8729);
    }

    @Override
    public void method943() {
        aClass101_9257.method1655(aClass115Array9254[17]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        method14564(0);
    }

    @Override
    public void method960(int i_1) {
        aClass101_9257.method1655(aClass115Array9254[2 + i_1]);
        anIntArray9233 = anIntArrayArray9258[aClass101_9257.method1714()];
        aClass101_9257.method1646();
        method14564(i_1);
    }

}
