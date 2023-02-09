package com.rs.jagex;

import jaggl.OpenGL;

public class Class314 implements Interface28 {

	int anInt3667;
	Class319_Sub3 aClass319_Sub3_3666;

	Class314(Class319_Sub3 class319_sub3_1, int i_2) {
		anInt3667 = i_2;
		aClass319_Sub3_3666 = class319_sub3_1;
	}

	@Override
	public int method1() {
		return aClass319_Sub3_3666.method1();
	}

	@Override
	public void method104(int i_1) {
		OpenGL.glFramebufferTexture2DEXT(36160, i_1, aClass319_Sub3_3666.anInt3707, aClass319_Sub3_3666.anInt3706, anInt3667);
	}

	@Override
	public void method26() {
	}

	@Override
	public void method32() {
	}

	@Override
	public int method39() {
		return aClass319_Sub3_3666.method59();
	}

	@Override
	public int method73() {
		return aClass319_Sub3_3666.method59();
	}

	@Override
	public int method74() {
		return aClass319_Sub3_3666.method59();
	}

	@Override
	public int method75() {
		return aClass319_Sub3_3666.method1();
	}

	@Override
	public int method76() {
		return aClass319_Sub3_3666.method1();
	}

	@Override
	public int method77() {
		return aClass319_Sub3_3666.method59();
	}

	@Override
	public void method99(int i_1) {
		OpenGL.glFramebufferTexture2DEXT(36160, i_1, aClass319_Sub3_3666.anInt3707, aClass319_Sub3_3666.anInt3706, anInt3667);
	}

}
