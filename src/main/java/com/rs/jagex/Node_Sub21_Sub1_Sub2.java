package com.rs.jagex;

import jaggl.OpenGL;

public class Node_Sub21_Sub1_Sub2 extends Node_Sub21_Sub1 {

	int[] anIntArray10308;
	OpenGLShader aClass101_Sub1_10309;

	Node_Sub21_Sub1_Sub2(OpenGLShader class101_sub1_1, Class122 class122_2) {
		super(class122_2);
		aClass101_Sub1_10309 = class101_sub1_1;
	}

	@Override
	public int method15453(int i_1) {
		return anIntArray10308[i_1];
	}

	@Override
	public int method15455(int i_1) {
		return anIntArray10308[i_1];
	}

	@Override
	public int method15460(int i_1) {
		return anIntArray10308[i_1];
	}

	@Override
	public boolean method15461(int i_1) {
		if (anIntArray10308 == null)
			anIntArray10308 = new int[aClass101_Sub1_10309.method1650()];

		Class115_Sub2 class115_sub2_2 = (Class115_Sub2) aClass101_Sub1_10309.method1652(i_1);
		anIntArray10308[i_1] = OpenGL.glGetUniformLocation(class115_sub2_2.anInt9423, method15454());
		return anIntArray10308[i_1] != -1;
	}

	@Override
	public boolean method15462(int i_1) {
		if (anIntArray10308 == null)
			anIntArray10308 = new int[aClass101_Sub1_10309.method1650()];

		Class115_Sub2 class115_sub2_2 = (Class115_Sub2) aClass101_Sub1_10309.method1652(i_1);
		anIntArray10308[i_1] = OpenGL.glGetUniformLocation(class115_sub2_2.anInt9423, method15454());
		return anIntArray10308[i_1] != -1;
	}

	@Override
	public boolean method15463(int i_1) {
		if (anIntArray10308 == null)
			anIntArray10308 = new int[aClass101_Sub1_10309.method1650()];

		Class115_Sub2 class115_sub2_2 = (Class115_Sub2) aClass101_Sub1_10309.method1652(i_1);
		anIntArray10308[i_1] = OpenGL.glGetUniformLocation(class115_sub2_2.anInt9423, method15454());
		return anIntArray10308[i_1] != -1;
	}

	@Override
	public boolean method15470(int i_1) {
		if (anIntArray10308 == null)
			anIntArray10308 = new int[aClass101_Sub1_10309.method1650()];

		Class115_Sub2 class115_sub2_2 = (Class115_Sub2) aClass101_Sub1_10309.method1652(i_1);
		anIntArray10308[i_1] = OpenGL.glGetUniformLocation(class115_sub2_2.anInt9423, method15454());
		return anIntArray10308[i_1] != -1;
	}

	@Override
	public boolean method15471(int i_1) {
		if (anIntArray10308 == null)
			anIntArray10308 = new int[aClass101_Sub1_10309.method1650()];

		Class115_Sub2 class115_sub2_2 = (Class115_Sub2) aClass101_Sub1_10309.method1652(i_1);
		anIntArray10308[i_1] = OpenGL.glGetUniformLocation(class115_sub2_2.anInt9423, method15454());
		return anIntArray10308[i_1] != -1;
	}

	@Override
	public int method15472(int i_1) {
		return anIntArray10308[i_1];
	}

	@Override
	public int method15473(int i_1) {
		return anIntArray10308[i_1];
	}

	int method15788() {
		return anIntArray10308[aClass101_Sub1_10309.method1714()];
	}

}
