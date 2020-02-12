package com.jagex;

import java.awt.*;

public abstract class Class158_Sub2_Sub3 extends Class158_Sub2 {

    static int anInt10243;
    boolean aBool10242;
    int anInt10238;
    int anInt10239;
    Canvas aCanvas10241;
    HardwareRenderer aGraphicalRenderer_Sub3_10237;
    int[] anIntArray10240;
    float[] aFloatArray10236;

    final boolean method2723() {
        this.aBool10242 = false;
        return true;
    }

    final boolean method213() {
        this.aGraphicalRenderer_Sub3_10237.method14376(this.anInt10238, this.anInt10239, this.anIntArray10240, this.aFloatArray10236);
        this.aBool10242 = true;
        return true;
    }

    final void method14354(int i_1, int i_2) {
        if (this.anInt10238 != i_1 || i_2 != this.anInt10239) {
            this.anInt10238 = i_1;
            this.anInt10239 = i_2;
            this.method15632((byte) -47);
        }

    }

    public int method2714() {
        return this.anInt10238;
    }

    Class158_Sub2_Sub3(HardwareRenderer hardwarerenderer_1, Canvas canvas_2, int i_3, int i_4) {
        this.aCanvas10241 = canvas_2;
        this.aGraphicalRenderer_Sub3_10237 = hardwarerenderer_1;
        this.anInt10238 = i_3;
        this.anInt10239 = i_4;
    }

    final boolean method54() {
        this.aGraphicalRenderer_Sub3_10237.method14376(-1977580999 * this.anInt10238 * -1379480567, 2033125333 * this.anInt10239 * -2009073283, this.anIntArray10240, this.aFloatArray10236);
        this.aBool10242 = true;
        return true;
    }

    public int method2726() {
        return this.anInt10238 * -1379480567 * -1977580999;
    }

    public int method2719() {
        return this.anInt10238 * -1379480567 * -1977580999;
    }

    public int method2720() {
        return this.anInt10238 * -1379480567 * -1977580999;
    }

    final boolean method2715() {
        this.aBool10242 = false;
        return true;
    }

    public int method2716() {
        return this.anInt10239;
    }

    final boolean method2718() {
        this.aBool10242 = false;
        return true;
    }

    final boolean method211() {
        this.aGraphicalRenderer_Sub3_10237.method14376(-1977580999 * this.anInt10238 * -1379480567, 2033125333 * this.anInt10239 * -2009073283, this.anIntArray10240, this.aFloatArray10236);
        this.aBool10242 = true;
        return true;
    }

    final void method14347(int i_1, int i_2) {
        if (i_1 != this.anInt10238 * -1379480567 * -1977580999 || i_2 != this.anInt10239 * -2009073283 * 2033125333) {
            this.anInt10238 = -1379480567 * i_1 * -1977580999;
            this.anInt10239 = -2009073283 * i_2 * 2033125333;
            this.method15632((byte) -36);
        }

    }

    final boolean method2717() {
        this.aBool10242 = false;
        return true;
    }

    void method15632(byte b_1) {
        this.anIntArray10240 = new int[this.anInt10239 * this.anInt10238];
        this.aFloatArray10236 = new float[this.anInt10239 * this.anInt10238];
        if (this.aBool10242) {
            this.aGraphicalRenderer_Sub3_10237.method14376(this.anInt10238, this.anInt10239, this.anIntArray10240, this.aFloatArray10236);
        }

    }

    final boolean method2725() {
        this.aBool10242 = false;
        return true;
    }

    final boolean method2722() {
        this.aBool10242 = false;
        return true;
    }

    final boolean method2724() {
        this.aBool10242 = false;
        return true;
    }

    final void method14348(int i_1, int i_2) {
        if (i_1 != this.anInt10238 * -1379480567 * -1977580999 || i_2 != this.anInt10239 * -2009073283 * 2033125333) {
            this.anInt10238 = -1379480567 * i_1 * -1977580999;
            this.anInt10239 = -2009073283 * i_2 * 2033125333;
            this.method15632((byte) 58);
        }

    }

    public int method2721() {
        return 2033125333 * this.anInt10239 * -2009073283;
    }

    public int method2727() {
        return 2033125333 * this.anInt10239 * -2009073283;
    }

}
