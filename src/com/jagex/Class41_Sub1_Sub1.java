package com.jagex;

public class Class41_Sub1_Sub1 extends Class41_Sub1 {

    public int anInt10094;

    public int anInt10095;

    public int anInt10110;

    public int anInt10111;

    public int anInt10112;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10087;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10088;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10105;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10101;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10093;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10096;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10098;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10100;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10102;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10104;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10106;

    Node_Sub21_Sub1 aNode_Sub21_Sub1_10108;

    float aFloat10114 = 0.0F;

    public Matrix44Arr aClass384_10090 = new Matrix44Arr();

    public Matrix44Arr aClass384_10091 = new Matrix44Arr();

    public Vector3 aClass385_10089 = new Vector3();

    Vector4 aClass303_10113 = new Vector4();

    Vector4 aClass303_10099 = new Vector4();

    Vector4 aClass303_10115 = new Vector4();

    public Vector4 aClass303_10103 = new Vector4();

    public Vector3 aClass385_10086 = new Vector3();

    public Vector4 aClass303_10107 = new Vector4();

    public Vector3 aClass385_10109 = new Vector3();

    Class49 aClass49_10092;

    boolean aBool10097;

    boolean method14524() throws Exception_Sub2 {
        if (!this.aClass49_10092.method969()) {
            return false;
        } else {
            this.aNode_Sub21_Sub1_10087 = this.aClass101_9218.method1691("NormalSampler", (short) 9050);
            this.aNode_Sub21_Sub1_10088 = this.aClass101_9218.method1691("EnvMapSampler", (short) 29576);
            this.aNode_Sub21_Sub1_10105 = this.aClass101_9218.method1691("WVPMatrix", (short) 19852);
            this.aNode_Sub21_Sub1_10101 = this.aClass101_9218.method1691("TexCoordMatrix", (short) 30264);
            this.aNode_Sub21_Sub1_10093 = this.aClass101_9218.method1691("EyePosAndTime", (short) 12670);
            this.aNode_Sub21_Sub1_10096 = this.aClass101_9218.method1691("SunDirectionAndExponent", (short) 30161);
            this.aNode_Sub21_Sub1_10098 = this.aClass101_9218.method1691("SunColourAndWaveExponent", (short) 14845);
            this.aNode_Sub21_Sub1_10100 = this.aClass101_9218.method1691("WaveIntensityAndBreakWaterDepthAndOffset", (short) 15063);
            this.aNode_Sub21_Sub1_10102 = this.aClass101_9218.method1691("HeightFogPlane", (short) 15139);
            this.aNode_Sub21_Sub1_10104 = this.aClass101_9218.method1691("HeightFogColour", (short) 7836);
            this.aNode_Sub21_Sub1_10106 = this.aClass101_9218.method1691("DistanceFogPlane", (short) 13766);
            this.aNode_Sub21_Sub1_10108 = this.aClass101_9218.method1691("DistanceFogColour", (short) 4861);
            Class115 class115_1 = this.aClass101_9218.method1651(this.aBool10097 ? "EnvMappedSea" : "EnvMappedWater", -780122128);
            this.aClass101_9218.method1655(class115_1);
            return true;
        }
    }

    void method14527(Matrix44Arr matrix44arr_1) {
        Matrix44Arr matrix44arr_2 = new Matrix44Arr();
        matrix44arr_2.method6525(this.aFloat10114, this.aFloat10114, 1.0F, 1.0F);
        matrix44arr_2.method6568(matrix44arr_1, matrix44arr_2);
        super.method14527(matrix44arr_2);
    }

    void method14530(boolean bool_1) {
        float f_2 = 1.0F + (1.0F - Math.abs(this.aGraphicalRenderer_Sub2_413.aFloatArray8747[1])) * 2.0F;
        float f_3 = this.aGraphicalRenderer_Sub2_413.aFloat8770;
        this.aGraphicalRenderer_Sub2_413.aFloat8770 *= f_2;
        super.method14530(bool_1);
        this.aGraphicalRenderer_Sub2_413.aFloat8770 = f_3;
    }

    void method15517() {
        this.aFloat10114 = 2.4414062E-4F;
        short s_2 = 256;
        float f_3 = 0.3F;
        float f_4 = 0.4F;
        float f_5 = 0.1F;
        byte b_6 = 5;
        this.aClass384_10091.method6525(this.aFloat10114, this.aFloat10114, this.aFloat10114, this.aFloat10114);
        this.aClass303_10113.set(-this.aGraphicalRenderer_Sub2_413.aFloatArray8747[0], -this.aGraphicalRenderer_Sub2_413.aFloatArray8747[1], -this.aGraphicalRenderer_Sub2_413.aFloatArray8747[2], 32.0F);
        this.aClass303_10099.set(this.aGraphicalRenderer_Sub2_413.aFloat8766, this.aGraphicalRenderer_Sub2_413.aFloat8767, this.aGraphicalRenderer_Sub2_413.aFloat8768, b_6);
        this.aClass303_10115.set(f_5, f_4, s_2, f_3);
    }

    public void method15520(int i_1) {
        this.method15517();
        this.aClass101_9218.method1655(this.aClass101_9218.method1654(558838248));
        this.aClass101_9218.method1646();
        this.aClass101_9218.method1671(this.aNode_Sub21_Sub1_10087, 0, this.aClass49_10092.anInterface1_480);
        this.aClass101_9218.method1671(this.aNode_Sub21_Sub1_10088, 1, this.aGraphicalRenderer_Sub2_413.method13965());
        this.aClass101_9218.method1668(this.aNode_Sub21_Sub1_10105, this.aClass384_10090, (byte) -102);
        this.aClass101_9218.method1667(this.aNode_Sub21_Sub1_10101, this.aClass384_10091, 1269356236);
        int i_2 = 1 << (this.anInt10095 & 0x3);
        this.aClass101_9218.method1662(this.aNode_Sub21_Sub1_10093, this.aClass385_10089.x, this.aClass385_10089.y, this.aClass385_10089.z, (float) (this.aGraphicalRenderer_Sub2_413.anInt8820 * i_2 % 40000) / 40000.0F, (byte) -89);
        this.aClass101_9218.method1689(this.aNode_Sub21_Sub1_10096, this.aClass303_10113, 1645652807);
        this.aClass101_9218.method1689(this.aNode_Sub21_Sub1_10098, this.aClass303_10099, 1748236316);
        this.aClass101_9218.method1689(this.aNode_Sub21_Sub1_10100, this.aClass303_10115, 1588793245);
        this.aClass101_9218.method1689(this.aNode_Sub21_Sub1_10102, this.aClass303_10103, 2066872642);
        this.aClass101_9218.method1663(this.aNode_Sub21_Sub1_10104, this.aClass385_10086, -1094823842);
        this.aClass101_9218.method1689(this.aNode_Sub21_Sub1_10106, this.aClass303_10107, 1825514726);
        this.aClass101_9218.method1663(this.aNode_Sub21_Sub1_10108, this.aClass385_10109, -1843665663);
        this.aGraphicalRenderer_Sub2_413.method14002(Class352.aClass352_4098, this.anInt10110, this.anInt10111, this.anInt10094, this.anInt10112);
    }

    public Class41_Sub1_Sub1(GraphicalRenderer_Sub2 class505_sub2_1, Class49 class49_2) throws Exception_Sub2 {
        super(class505_sub2_1);
        new Matrix44Arr();
        this.aClass49_10092 = class49_2;
        this.aBool10097 = true;
        if (class505_sub2_1.method13887() && class505_sub2_1.method13888()) {
            this.method14523("EnvMappedWater");
        }
    }

    boolean method14539() throws Exception_Sub2 {
        if (!this.aClass49_10092.method969()) {
            return false;
        } else {
            this.aNode_Sub21_Sub1_10087 = this.aClass101_9218.method1691("NormalSampler", (short) 12505);
            this.aNode_Sub21_Sub1_10088 = this.aClass101_9218.method1691("EnvMapSampler", (short) 15011);
            this.aNode_Sub21_Sub1_10105 = this.aClass101_9218.method1691("WVPMatrix", (short) 25962);
            this.aNode_Sub21_Sub1_10101 = this.aClass101_9218.method1691("TexCoordMatrix", (short) 13855);
            this.aNode_Sub21_Sub1_10093 = this.aClass101_9218.method1691("EyePosAndTime", (short) 7415);
            this.aNode_Sub21_Sub1_10096 = this.aClass101_9218.method1691("SunDirectionAndExponent", (short) 18233);
            this.aNode_Sub21_Sub1_10098 = this.aClass101_9218.method1691("SunColourAndWaveExponent", (short) 7594);
            this.aNode_Sub21_Sub1_10100 = this.aClass101_9218.method1691("WaveIntensityAndBreakWaterDepthAndOffset", (short) 26347);
            this.aNode_Sub21_Sub1_10102 = this.aClass101_9218.method1691("HeightFogPlane", (short) 28725);
            this.aNode_Sub21_Sub1_10104 = this.aClass101_9218.method1691("HeightFogColour", (short) 12979);
            this.aNode_Sub21_Sub1_10106 = this.aClass101_9218.method1691("DistanceFogPlane", (short) 21385);
            this.aNode_Sub21_Sub1_10108 = this.aClass101_9218.method1691("DistanceFogColour", (short) 8591);
            Class115 class115_1 = this.aClass101_9218.method1651(this.aBool10097 ? "EnvMappedSea" : "EnvMappedWater", 1171807076);
            this.aClass101_9218.method1655(class115_1);
            return true;
        }
    }

    boolean method14541() throws Exception_Sub2 {
        if (!this.aClass49_10092.method969()) {
            return false;
        } else {
            this.aNode_Sub21_Sub1_10087 = this.aClass101_9218.method1691("NormalSampler", (short) 4213);
            this.aNode_Sub21_Sub1_10088 = this.aClass101_9218.method1691("EnvMapSampler", (short) 31886);
            this.aNode_Sub21_Sub1_10105 = this.aClass101_9218.method1691("WVPMatrix", (short) 16446);
            this.aNode_Sub21_Sub1_10101 = this.aClass101_9218.method1691("TexCoordMatrix", (short) 11828);
            this.aNode_Sub21_Sub1_10093 = this.aClass101_9218.method1691("EyePosAndTime", (short) 7020);
            this.aNode_Sub21_Sub1_10096 = this.aClass101_9218.method1691("SunDirectionAndExponent", (short) 26895);
            this.aNode_Sub21_Sub1_10098 = this.aClass101_9218.method1691("SunColourAndWaveExponent", (short) 24843);
            this.aNode_Sub21_Sub1_10100 = this.aClass101_9218.method1691("WaveIntensityAndBreakWaterDepthAndOffset", (short) 6702);
            this.aNode_Sub21_Sub1_10102 = this.aClass101_9218.method1691("HeightFogPlane", (short) 10753);
            this.aNode_Sub21_Sub1_10104 = this.aClass101_9218.method1691("HeightFogColour", (short) 28390);
            this.aNode_Sub21_Sub1_10106 = this.aClass101_9218.method1691("DistanceFogPlane", (short) 26837);
            this.aNode_Sub21_Sub1_10108 = this.aClass101_9218.method1691("DistanceFogColour", (short) 15833);
            Class115 class115_1 = this.aClass101_9218.method1651(this.aBool10097 ? "EnvMappedSea" : "EnvMappedWater", -244176703);
            this.aClass101_9218.method1655(class115_1);
            return true;
        }
    }

    public static int method15524() {
        return ChatLine.NUM_CHAT_LINES;
    }
}
