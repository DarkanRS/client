package com.jagex;

import java.awt.*;

public abstract class Class158_Sub2_Sub3 extends Class158_Sub2 {

    static int anInt10243;
    boolean aBool10242;
    int anInt10238;
    int anInt10239;
    Canvas aCanvas10241;
    JavaRenderer aGraphicalRenderer_Sub3_10237;
    int[] anIntArray10240;
    float[] aFloatArray10236;

    Class158_Sub2_Sub3(JavaRenderer hardwarerenderer_1, Canvas canvas_2, int i_3, int i_4) {
        aCanvas10241 = canvas_2;
        aGraphicalRenderer_Sub3_10237 = hardwarerenderer_1;
        anInt10238 = i_3;
        anInt10239 = i_4;
    }

    @Override
    boolean method2723() {
        aBool10242 = false;
        return true;
    }

    @Override
    boolean method213() {
        aGraphicalRenderer_Sub3_10237.method14376(anInt10238, anInt10239, anIntArray10240, aFloatArray10236);
        aBool10242 = true;
        return true;
    }

    @Override
    void method14354(int i_1, int i_2) {
        if (anInt10238 != i_1 || i_2 != anInt10239) {
            anInt10238 = i_1;
            anInt10239 = i_2;
            method15632();
        }

    }

    @Override
    public int method2714() {
        return anInt10238;
    }

    @Override
    boolean method54() {
        aGraphicalRenderer_Sub3_10237.method14376(-1977580999 * anInt10238 * -1379480567, 2033125333 * anInt10239 * -2009073283, anIntArray10240, aFloatArray10236);
        aBool10242 = true;
        return true;
    }

    @Override
    public int method2726() {
        return anInt10238 * -1379480567 * -1977580999;
    }

    @Override
    public int method2719() {
        return anInt10238 * -1379480567 * -1977580999;
    }

    @Override
    public int method2720() {
        return anInt10238 * -1379480567 * -1977580999;
    }

    @Override
    boolean method2715() {
        aBool10242 = false;
        return true;
    }

    @Override
    public int method2716() {
        return anInt10239;
    }

    @Override
    boolean method2718() {
        aBool10242 = false;
        return true;
    }

    @Override
    boolean method211() {
        aGraphicalRenderer_Sub3_10237.method14376(-1977580999 * anInt10238 * -1379480567, 2033125333 * anInt10239 * -2009073283, anIntArray10240, aFloatArray10236);
        aBool10242 = true;
        return true;
    }

    @Override
    void method14347(int i_1, int i_2) {
        if (i_1 != anInt10238 * -1379480567 * -1977580999 || i_2 != anInt10239 * -2009073283 * 2033125333) {
            anInt10238 = -1379480567 * i_1 * -1977580999;
            anInt10239 = -2009073283 * i_2 * 2033125333;
            method15632();
        }

    }

    @Override
    boolean method2717() {
        aBool10242 = false;
        return true;
    }

    void method15632() {
        anIntArray10240 = new int[anInt10239 * anInt10238];
        aFloatArray10236 = new float[anInt10239 * anInt10238];
        if (aBool10242) {
            aGraphicalRenderer_Sub3_10237.method14376(anInt10238, anInt10239, anIntArray10240, aFloatArray10236);
        }

    }

    @Override
    boolean method2725() {
        aBool10242 = false;
        return true;
    }

    @Override
    boolean method2722() {
        aBool10242 = false;
        return true;
    }

    @Override
    boolean method2724() {
        aBool10242 = false;
        return true;
    }

    @Override
    void method14348(int i_1, int i_2) {
        if (i_1 != anInt10238 * -1379480567 * -1977580999 || i_2 != anInt10239 * -2009073283 * 2033125333) {
            anInt10238 = -1379480567 * i_1 * -1977580999;
            anInt10239 = -2009073283 * i_2 * 2033125333;
            method15632();
        }

    }

    @Override
    public int method2721() {
        return 2033125333 * anInt10239 * -2009073283;
    }

    @Override
    public int method2727() {
        return 2033125333 * anInt10239 * -2009073283;
    }

}
