package com.jagex;

import jaggl.OpenGL;

public class Class319_Sub4 extends Class319 implements Interface31 {

	Class319_Sub4(JAGGLRenderer class505_sub2_sub1_1, int i_2, boolean bool_3, int[][] ints_4) {
		super(class505_sub2_sub1_1, 34067, Class150.aClass150_1949, Class76.aClass76_751, i_2 * i_2 * 6, bool_3);
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		int i_5;
		if (bool_3)
			for (i_5 = 0; i_5 < 6; i_5++)
				method5714(i_5 + 34069, i_2, i_2, ints_4[i_5]);
		else
			for (i_5 = 0; i_5 < 6; i_5++)
				OpenGL.glTexImage2Di(i_5 + 34069, 0, JAGGLRenderer.method15574(aClass150_3708, aClass76_3710), i_2, i_2, 0, JAGGLRenderer.method15575(aClass150_3708), aGraphicalRenderer_Sub2_Sub1_3700.anInt10198, ints_4[i_5], 0);

	}

	@Override
	public void method201(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method202(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method203() {
		super.method207();
	}

	@Override
	public void method204(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method205(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method206(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method207() {
		super.method207();
	}

	@Override
	public void method26() {
		super.method26();
	}

	@Override
	public void method32() {
		super.method26();
	}

}
