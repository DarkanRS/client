package com.rs.jagex;

import java.awt.*;

public abstract class Class158_Sub2_Sub3 extends Class158_Sub2 {

	static int anInt10243;
	boolean aBool10242;
	int width;
	int height;
	Canvas canvas;
	JavaRenderer javaRenderer;
	int[] anIntArray10240;
	float[] aFloatArray10236;

	Class158_Sub2_Sub3(JavaRenderer hardwarerenderer_1, Canvas canvas_2, int i_3, int i_4) {
		canvas = canvas_2;
		javaRenderer = hardwarerenderer_1;
		width = i_3;
		height = i_4;
	}

	@Override
	void method14347(int i_1, int i_2) {
		if (i_1 != width * -1379480567 * -1977580999 || i_2 != height * -2009073283 * 2033125333) {
			width = -1379480567 * i_1 * -1977580999;
			height = -2009073283 * i_2 * 2033125333;
			method15632();
		}

	}

	@Override
	void method14348(int i_1, int i_2) {
		if (i_1 != width * -1379480567 * -1977580999 || i_2 != height * -2009073283 * 2033125333) {
			width = -1379480567 * i_1 * -1977580999;
			height = -2009073283 * i_2 * 2033125333;
			method15632();
		}

	}

	@Override
	void method14354(int i_1, int i_2) {
		if (width != i_1 || i_2 != height) {
			width = i_1;
			height = i_2;
			method15632();
		}

	}

	void method15632() {
		anIntArray10240 = new int[height * width];
		aFloatArray10236 = new float[height * width];
		if (aBool10242)
			javaRenderer.method14376(width, height, anIntArray10240, aFloatArray10236);

	}

	@Override
	boolean method211() {
		javaRenderer.method14376(-1977580999 * width * -1379480567, 2033125333 * height * -2009073283, anIntArray10240, aFloatArray10236);
		aBool10242 = true;
		return true;
	}

	@Override
	boolean method213() {
		javaRenderer.method14376(width, height, anIntArray10240, aFloatArray10236);
		aBool10242 = true;
		return true;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	boolean method2715() {
		aBool10242 = false;
		return true;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	boolean method2717() {
		aBool10242 = false;
		return true;
	}

	@Override
	boolean method2718() {
		aBool10242 = false;
		return true;
	}

	@Override
	public int method2719() {
		return width * -1379480567 * -1977580999;
	}

	@Override
	public int method2720() {
		return width * -1379480567 * -1977580999;
	}

	@Override
	public int method2721() {
		return 2033125333 * height * -2009073283;
	}

	@Override
	boolean method2722() {
		aBool10242 = false;
		return true;
	}

	@Override
	boolean method2723() {
		aBool10242 = false;
		return true;
	}

	@Override
	boolean method2724() {
		aBool10242 = false;
		return true;
	}

	@Override
	boolean method2725() {
		aBool10242 = false;
		return true;
	}

	@Override
	public int method2726() {
		return width * -1379480567 * -1977580999;
	}

	@Override
	public int method2727() {
		return 2033125333 * height * -2009073283;
	}

	@Override
	boolean method54() {
		javaRenderer.method14376(-1977580999 * width * -1379480567, 2033125333 * height * -2009073283, anIntArray10240, aFloatArray10236);
		aBool10242 = true;
		return true;
	}

}
