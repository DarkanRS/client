package com.rs.jagex;

import jaggl.OpenGL;

public class OpenGLShader extends Shader {

	JAGGLRenderer aGraphicalRenderer_Sub2_Sub1_9264;
	Class115_Sub2 aClass115_Sub2_9265;
	int handle;

	OpenGLShader(JAGGLRenderer class505_sub2_sub1_1, ShaderLoader class114_2) {
		super(class505_sub2_sub1_1, class114_2);
		aGraphicalRenderer_Sub2_Sub1_9264 = class505_sub2_sub1_1;
	}

	@Override
	protected void finalize() throws Throwable {
		method1684();
		super.finalize();
	}

	@Override
	public void method1646() {
		if (aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 != aClass115_Sub2_9265) {
			if (aClass115_Sub2_9265 == null)
				throw new RuntimeException_Sub2();

			OpenGL.glUseProgram(handle);
			aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = aClass115_Sub2_9265;
		}

	}

	@Override
	public void method1647() {
	}

	@Override
	public boolean method1648() {
		return aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == aClass115_Sub2_9265;
	}

	@Override
	public boolean method1655(Class115 class115_1) {
		if (class115_1 == aClass115_Sub2_9265)
			return true;
		if (!class115_1.method1899())
			return false;
		else {
			boolean bool_2 = method1648();
			aClass115_Sub2_9265 = (Class115_Sub2) class115_1;
			anInt1015 = method1653(class115_1);
			if (anInt1015 == -1)
				throw new IllegalArgumentException();
			else {
				handle = aClass115_Sub2_9265.anInt9423;
				if (bool_2) {
					OpenGL.glUseProgram(handle);
					aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = aClass115_Sub2_9265;
				}

				return true;
			}
		}
	}

	@Override
	public boolean method1664() {
		return aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == aClass115_Sub2_9265;
	}

	@Override
	Class115 method1665(HardwareRenderer class505_sub2_1, Class99 class99_2) {
		return new Class115_Sub2((JAGGLRenderer) class505_sub2_1, this, class99_2);
	}

	@Override
	public void method1678() {
	}

	@Override
	Class115 method1683(HardwareRenderer class505_sub2_1, Class99 class99_2) {
		return new Class115_Sub2((JAGGLRenderer) class505_sub2_1, this, class99_2);
	}

	@Override
	void method1684() {
		for (int i_1 = 0; i_1 < method1650(); i_1++)
			method1652(i_1).method26();

		super.method1684();
	}

	@Override
	public void method1685() {
		if (aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 != aClass115_Sub2_9265) {
			if (aClass115_Sub2_9265 == null)
				throw new RuntimeException_Sub2();

			OpenGL.glUseProgram(handle);
			aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = aClass115_Sub2_9265;
		}

	}

	@Override
	public void method1686() {
		if (aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 != aClass115_Sub2_9265) {
			if (aClass115_Sub2_9265 == null)
				throw new RuntimeException_Sub2();

			OpenGL.glUseProgram(handle);
			aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = aClass115_Sub2_9265;
		}

	}

	@Override
	public void method1687() {
		if (aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 != aClass115_Sub2_9265) {
			if (aClass115_Sub2_9265 == null)
				throw new RuntimeException_Sub2();

			OpenGL.glUseProgram(handle);
			aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = aClass115_Sub2_9265;
		}

	}

	@Override
	public void method1690() {
	}

	@Override
	public boolean method1692() {
		return aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == aClass115_Sub2_9265;
	}

	@Override
	public boolean method1693() {
		return aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == aClass115_Sub2_9265;
	}

	@Override
	Node_Sub21_Sub1 method1694(Class122 class122_1) {
		return new Node_Sub21_Sub1_Sub2(this, class122_1);
	}

	@Override
	Class115 method1697(HardwareRenderer class505_sub2_1, Class99 class99_2) {
		return new Class115_Sub2((JAGGLRenderer) class505_sub2_1, this, class99_2);
	}

	@Override
	public boolean method1706(Class115 class115_1) {
		if (aClass115_Sub2_9265 == class115_1)
			return true;
		if (!class115_1.method1899())
			return false;
		else {
			boolean bool_2 = method1648();
			aClass115_Sub2_9265 = (Class115_Sub2) class115_1;
			anInt1015 = method1653(class115_1) * -1224879653 * -401096109;
			if (anInt1015 * -1224879653 * -401096109 == -1)
				throw new IllegalArgumentException();
			else {
				handle = aClass115_Sub2_9265.anInt9423;
				if (bool_2) {
					OpenGL.glUseProgram(handle);
					aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = aClass115_Sub2_9265;
				}

				return true;
			}
		}
	}

	@Override
	public boolean method1707(Class115 class115_1) {
		if (aClass115_Sub2_9265 == class115_1)
			return true;
		if (!class115_1.method1899())
			return false;
		else {
			boolean bool_2 = method1648();
			aClass115_Sub2_9265 = (Class115_Sub2) class115_1;
			anInt1015 = method1653(class115_1) * -1224879653 * -401096109;
			if (anInt1015 * -1224879653 * -401096109 == -1)
				throw new IllegalArgumentException();
			else {
				handle = aClass115_Sub2_9265.anInt9423;
				if (bool_2) {
					OpenGL.glUseProgram(handle);
					aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = aClass115_Sub2_9265;
				}

				return true;
			}
		}
	}

	@Override
	Node_Sub21_Sub1 method1712(Class122 class122_1) {
		return new Node_Sub21_Sub1_Sub2(this, class122_1);
	}

	@Override
	public void method1713() {
	}

	@Override
	public boolean method1734() {
		return aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == aClass115_Sub2_9265;
	}

	@Override
	Class115 method1743(HardwareRenderer class505_sub2_1, Class99 class99_2) {
		return new Class115_Sub2((JAGGLRenderer) class505_sub2_1, this, class99_2);
	}

	@Override
	Node_Sub21_Sub1 method1765(Class122 class122_1) {
		return new Node_Sub21_Sub1_Sub2(this, class122_1);
	}

}
