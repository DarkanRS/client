package com.rs.jagex;

import jaggl.OpenGL;

public class Class137_Sub4 extends GLTexture {

	int anInt9116;
	int anInt9117;
	int anInt9118;

	Class137_Sub4(OpenGLRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3) {
		super(class505_sub1_1, 32879, class150_2, class76_3, 262144, false);
		anInt9116 = 128;
		anInt9117 = 128;
		anInt9118 = 16;
		openGLHardwareRenderer.setTexture(this);
		OpenGL.glTexImage3Dub(bindId, 0, OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), anInt9116, anInt9117, anInt9118, 0, OpenGLRenderer.method13629(aClass150_1650), 5121, null, 0);
		method2351(true);
	}

	Class137_Sub4(OpenGLRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3, byte[] bytes_7, Class150 class150_8) {
		super(class505_sub1_1, 32879, class150_2, class76_3, 262144, false);
		anInt9116 = 128;
		anInt9117 = 128;
		anInt9118 = 16;
		openGLHardwareRenderer.setTexture(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(bindId, 0, OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), anInt9116, anInt9117, anInt9118, 0, OpenGLRenderer.method13629(class150_8), 5121, bytes_7, 0);
		OpenGL.glPixelStorei(3317, 4);
		method2351(true);
	}

	void method14465(int i_3, int i_4, int i_5) {
		openGLHardwareRenderer.setTexture(this);
		OpenGL.glCopyTexSubImage3D(bindId, 0, 0, 0, i_3, 0, 0, i_4, i_5);
		OpenGL.glFlush();
	}

}
