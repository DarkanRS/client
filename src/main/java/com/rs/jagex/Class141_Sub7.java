package com.rs.jagex;

import jaggl.OpenGL;

public class Class141_Sub7 extends Class141 {

	boolean aBool9090;
	Class138 aClass138_9088;

	Class141_Sub7(OpenGLRenderer class505_sub1_1) {
		super(class505_sub1_1);
		if (class505_sub1_1.supportsCubeMaps) {
			aClass138_9088 = new Class138(2);
			aClass138_9088.method2380(0);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.method13717(34165, 7681);
			aGraphicalRenderer_Sub1_1664.method13595(2, 34168, 770);
			aGraphicalRenderer_Sub1_1664.method13616(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			aClass138_9088.method2381();
			aClass138_9088.method2380(1);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
			aGraphicalRenderer_Sub1_1664.method13595(2, 34166, 770);
			aGraphicalRenderer_Sub1_1664.method13616(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			aClass138_9088.method2381();
		}

	}

	@Override
	void method2394(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	@Override
	boolean method2395() {
		return true;
	}

	@Override
	void method2396(int i_1, int i_2) {
	}

	@Override
	void method2397(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = aGraphicalRenderer_Sub1_1664.method13596();
		if (aClass138_9088 != null && class137_sub2_2 != null && bool_1) {
			aClass138_9088.method2379('\u0000');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(class137_sub2_2);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(aGraphicalRenderer_Sub1_1664.aClass384_8391.method6534(aGraphicalRenderer_Sub1_1664.aFloatArray8477), 0);
			OpenGL.glMatrixMode(5888);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			aBool9090 = true;
		} else
			aGraphicalRenderer_Sub1_1664.method13616(0, 34168);

	}

	@Override
	void method2398() {
		if (aBool9090) {
			aClass138_9088.method2379('\u0001');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(null);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		} else
			aGraphicalRenderer_Sub1_1664.method13616(0, 5890);

		aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
		aBool9090 = false;
	}

	@Override
	void method2399(int i_1, int i_2) {
	}

	@Override
	void method2400(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	@Override
	boolean method2401() {
		return true;
	}

	@Override
	void method2402(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = aGraphicalRenderer_Sub1_1664.method13596();
		if (aClass138_9088 != null && class137_sub2_2 != null && bool_1) {
			aClass138_9088.method2379('\u0000');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(class137_sub2_2);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(aGraphicalRenderer_Sub1_1664.aClass384_8391.method6534(aGraphicalRenderer_Sub1_1664.aFloatArray8477), 0);
			OpenGL.glMatrixMode(5888);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			aBool9090 = true;
		} else
			aGraphicalRenderer_Sub1_1664.method13616(0, 34168);

	}

	@Override
	void method2403(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = aGraphicalRenderer_Sub1_1664.method13596();
		if (aClass138_9088 != null && class137_sub2_2 != null && bool_1) {
			aClass138_9088.method2379('\u0000');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(class137_sub2_2);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(aGraphicalRenderer_Sub1_1664.aClass384_8391.method6534(aGraphicalRenderer_Sub1_1664.aFloatArray8477), 0);
			OpenGL.glMatrixMode(5888);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			aBool9090 = true;
		} else
			aGraphicalRenderer_Sub1_1664.method13616(0, 34168);

	}

	@Override
	void method2404() {
		aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	@Override
	void method2405() {
		aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	@Override
	void method2406() {
		aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	@Override
	void method2407() {
		aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	@Override
	void method2408() {
		aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	@Override
	void method2409(int i_1, int i_2) {
	}

	@Override
	void method2410(int i_1, int i_2) {
	}

	@Override
	void method2411() {
		if (aBool9090) {
			aClass138_9088.method2379('\u0001');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(null);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		} else
			aGraphicalRenderer_Sub1_1664.method13616(0, 5890);

		aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
		aBool9090 = false;
	}

	@Override
	void method2412(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	@Override
	void method2413(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	@Override
	void method2414(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

}
