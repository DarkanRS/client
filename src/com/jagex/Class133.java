package com.jagex;
import jaggl.OpenGL;

public class Class133 {

	static int[] anIntArray1599 = new int[1];
	OpenGLGraphicalRenderer aGraphicalRenderer_Sub1_1597;
	int anInt1596;

	Class133(OpenGLGraphicalRenderer class505_sub1_1, int i_3) {
		this.aGraphicalRenderer_Sub1_1597 = class505_sub1_1;
		this.anInt1596 = i_3;
	}

	public void finalize() throws Throwable {
		this.aGraphicalRenderer_Sub1_1597.method13628(this.anInt1596);
		super.finalize();
	}

	static Class133 method2321(OpenGLGraphicalRenderer class505_sub1_0, String string_2) {
		int i_3 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, i_3);
		OpenGL.glProgramStringARB(34336, 34933, string_2);
		OpenGL.glGetIntegerv(34379, anIntArray1599, 0);
		if (anIntArray1599[0] != -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class133(class505_sub1_0, i_3);
		}
	}

}
