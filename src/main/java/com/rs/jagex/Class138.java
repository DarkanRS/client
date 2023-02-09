package com.rs.jagex;

import jaggl.OpenGL;

public class Class138 {

	int anInt1655;

	Class138(int i_2) {
		anInt1655 = OpenGL.glGenLists(i_2);
	}

	void method2379(char var_1) {
		OpenGL.glCallList(anInt1655 + var_1);
	}

	void method2380(int i_1) {
		OpenGL.glNewList(anInt1655 + i_1, 4864);
	}

	void method2381() {
		OpenGL.glEndList();
	}

}
