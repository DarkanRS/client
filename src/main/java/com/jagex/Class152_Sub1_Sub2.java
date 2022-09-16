package com.jagex;

import jaggl.OpenGL;

public class Class152_Sub1_Sub2 extends Class152_Sub1 {

	static int[] anIntArray10125 = new int[4];
	OpenGLRenderer aGraphicalRenderer_Sub1_10123;
	Class137_Sub2 aClass137_Sub2_10124;

	Class152_Sub1_Sub2(OpenGLRenderer class505_sub1_1, int i_2) {
		aGraphicalRenderer_Sub1_10123 = class505_sub1_1;
		aClass137_Sub2_10124 = new Class137_Sub2(class505_sub1_1, Class150.aClass150_1949, Class76.aClass76_751, i_2);
	}

	@Override
	Class137_Sub2 method13519() {
		return aClass137_Sub2_10124;
	}

	@Override
	Class137_Sub2 method13520() {
		return aClass137_Sub2_10124;
	}

	@Override
	Class137_Sub2 method13521() {
		return aClass137_Sub2_10124;
	}

	boolean method15531(Class137_Sub2 class137_sub2_1, Class137_Sub2 class137_sub2_2, float f_3) {
		boolean bool_4 = true;
		Class158_Sub1_Sub4 class158_sub1_sub4_5 = aGraphicalRenderer_Sub1_10123.aClass158_Sub1_Sub4_8493;
		aGraphicalRenderer_Sub1_10123.qa(anIntArray10125);
		aGraphicalRenderer_Sub1_10123.L();
		aGraphicalRenderer_Sub1_10123.method13586();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, aClass137_Sub2_10124.anInt9104, aClass137_Sub2_10124.anInt9104);
		aGraphicalRenderer_Sub1_10123.method13642(false);
		aGraphicalRenderer_Sub1_10123.method13620(false);
		aGraphicalRenderer_Sub1_10123.enableDepthTest(false);
		aGraphicalRenderer_Sub1_10123.method13623(false);
		aGraphicalRenderer_Sub1_10123.method13581(-2);
		aGraphicalRenderer_Sub1_10123.setActiveTexture(1);
		aGraphicalRenderer_Sub1_10123.method13635(0.0F, 0.0F, 0.0F, f_3);
		aGraphicalRenderer_Sub1_10123.method13717(34165, 34165);
		aGraphicalRenderer_Sub1_10123.setTexture(class137_sub2_2);
		aGraphicalRenderer_Sub1_10123.setActiveTexture(0);
		aGraphicalRenderer_Sub1_10123.method13612(1);
		aGraphicalRenderer_Sub1_10123.setTexture(class137_sub2_1);
		aGraphicalRenderer_Sub1_10123.method8637(class158_sub1_sub4_5);

		for (int i_6 = 0; i_6 < 6; i_6++) {
			int i_7 = i_6 + 34069;
			class158_sub1_sub4_5.method13759(0, aClass137_Sub2_10124.method14458(i_7));
			class158_sub1_sub4_5.method15628(0);
			if (!class158_sub1_sub4_5.method13764()) {
				bool_4 = false;
				break;
			}

			OpenGL.glBegin(7);
			switch (i_7) {
			case 34069:
				OpenGL.glTexCoord3i(65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
				break;
			case 34070:
				OpenGL.glTexCoord3i(-65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
				break;
			case 34071:
				OpenGL.glTexCoord3i(-65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
				break;
			case 34072:
				OpenGL.glTexCoord3i(-65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
				break;
			case 34073:
				OpenGL.glTexCoord3i(-65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
				break;
			case 34074:
				OpenGL.glTexCoord3i(65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			}

			OpenGL.glEnd();
		}

		class158_sub1_sub4_5.method13759(0, null);
		aGraphicalRenderer_Sub1_10123.method8416(class158_sub1_sub4_5);
		aGraphicalRenderer_Sub1_10123.setActiveTexture(1);
		aGraphicalRenderer_Sub1_10123.setTexture(null);
		aGraphicalRenderer_Sub1_10123.method13717(8448, 8448);
		aGraphicalRenderer_Sub1_10123.setActiveTexture(0);
		aGraphicalRenderer_Sub1_10123.setTexture(null);
		OpenGL.glPopAttrib();
		aGraphicalRenderer_Sub1_10123.r(anIntArray10125[0], anIntArray10125[1], anIntArray10125[2], anIntArray10125[3]);
		if (bool_4 && !aGraphicalRenderer_Sub1_10123.aBool8465)
			aClass137_Sub2_10124.method2353();

		return bool_4;
	}

	int method15532() {
		return aClass137_Sub2_10124.anInt9104;
	}

}
