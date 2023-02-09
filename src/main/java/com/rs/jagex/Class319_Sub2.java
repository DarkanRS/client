package com.rs.jagex;

import jaggl.OpenGL;

public class Class319_Sub2 extends Class319 implements Interface29 {

	int anInt9159;
	int anInt9158;

	Class319_Sub2(JAGGLRenderer class505_sub2_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
		super(class505_sub2_sub1_1, 3553, class150_2, class76_3, i_5 * i_4, false);
		anInt9159 = i_4;
		anInt9158 = i_5;
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexImage2Dub(anInt3707, 0, JAGGLRenderer.method15574(aClass150_3708, aClass76_3710), i_4, i_5, 0, JAGGLRenderer.method15575(aClass150_3708), JAGGLRenderer.method15566(aClass76_3710), null, 0);
	}

	Class319_Sub2(JAGGLRenderer class505_sub2_sub1_1, Class150 class150_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6, int i_7, int i_8) {
		super(class505_sub2_sub1_1, 3553, class150_2, Class76.aClass76_751, i_3 * i_4, bool_5);
		anInt9159 = i_3;
		anInt9158 = i_4;
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool_5 && i_8 == 0 && i_7 == 0)
			method5707(anInt3707, i_3, i_4, bytes_6);
		else {
			OpenGL.glPixelStorei(3314, i_8);
			Class150 class150_9 = aClass150_3708;
			Class150 class150_10000 = aClass150_3708;
			if (class150_9 == Class150.aClass150_1956)
				OpenGL.glCompressedTexImage2Dub(anInt3707, 0, 33777, i_3, i_4, 0, i_3 * i_4 / 2, bytes_6, i_7);
			else {
				Class150 class150_10 = aClass150_3708;
				class150_10000 = aClass150_3708;
				if (class150_10 == Class150.aClass150_1957)
					OpenGL.glCompressedTexImage2Dub(anInt3707, 0, 33779, i_3, i_4, 0, i_3 * i_4, bytes_6, i_7);
				else
					OpenGL.glTexImage2Dub(anInt3707, 0, JAGGLRenderer.method15574(aClass150_3708, aClass76_3710), i_3, i_4, 0, JAGGLRenderer.method15575(aClass150_3708), 5121, bytes_6, i_7);
			}

			OpenGL.glPixelStorei(3314, 0);
		}

		OpenGL.glPixelStorei(3317, 4);
	}

	Class319_Sub2(JAGGLRenderer class505_sub2_sub1_1, Class150 class150_2, int i_3, int i_4, boolean bool_5, float[] floats_6, int i_7, int i_8) {
		super(class505_sub2_sub1_1, 3553, class150_2, Class76.aClass76_758, i_3 * i_4, bool_5);
		anInt9159 = i_3;
		anInt9158 = i_4;
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		if (bool_5 && i_8 == 0 && i_7 == 0)
			method5702(anInt3707, i_3, i_4, floats_6);
		else {
			OpenGL.glPixelStorei(3314, i_8);
			OpenGL.glTexImage2Df(anInt3707, 0, JAGGLRenderer.method15574(aClass150_3708, aClass76_3710), i_3, i_4, 0, JAGGLRenderer.method15575(aClass150_3708), 5126, floats_6, i_7 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}

	}

	Class319_Sub2(JAGGLRenderer class505_sub2_sub1_1, int i_2, int i_3, boolean bool_4, int[] ints_5, int i_6, int i_7) {
		super(class505_sub2_sub1_1, 3553, Class150.aClass150_1949, Class76.aClass76_751, i_3 * i_2, bool_4);
		anInt9159 = i_2;
		anInt9158 = i_3;
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		if (bool_4 && i_7 == 0 && i_6 == 0)
			method5714(anInt3707, i_2, i_3, ints_5);
		else {
			OpenGL.glPixelStorei(3314, i_7);
			OpenGL.glTexImage2Di(anInt3707, 0, 6408, anInt9159, anInt9158, 0, 32993, aGraphicalRenderer_Sub2_Sub1_3700.anInt10198, ints_5, i_6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}

	}

	@Override
	public int method1() {
		return anInt9159;
	}

	void method14494(int i_3, int i_4, float[] floats_5, Class150 class150_6, int i_7, int i_8) {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_8);
		OpenGL.glTexSubImage2Df(anInt3707, 0, 0, 0, i_3, i_4, JAGGLRenderer.method15575(class150_6), 5121, floats_5, i_7);
		OpenGL.glPixelStorei(3314, 0);
	}

	@Override
	public Interface9 method199(int i_1) {
		return new Class324(this, i_1);
	}

	@Override
	public Interface9 method200() {
		return new Class324(this, 0);
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

	@Override
	public int method36() {
		return anInt9159;
	}

	@Override
	public float method45(float f_1) {
		return f_1 / anInt9159;
	}

	@Override
	public boolean method46() {
		return true;
	}

	@Override
	public float method47(float f_1) {
		return f_1 / anInt9159;
	}

	@Override
	public void method48(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_7);
		OpenGL.glTexSubImage2Di(anInt3707, 0, i_1, i_2, i_3, i_4, 32993, aGraphicalRenderer_Sub2_Sub1_3700.anInt10198, ints_5, i_6);
		OpenGL.glPixelStorei(3314, 0);
	}

	@Override
	public boolean method49() {
		return super.method54();
	}

	@Override
	public void method50(boolean bool_1, boolean bool_2) {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexParameteri(anInt3707, 10242, bool_1 ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt3707, 10243, bool_2 ? 10497 : 33071);
	}

	@Override
	public float method51(float f_1) {
		return f_1 / anInt9158;
	}

	@Override
	public void method52(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_8);
		OpenGL.glTexSubImage2Dub(anInt3707, 0, i_1, i_2, i_3, i_4, JAGGLRenderer.method15575(class150_6), 5121, bytes_5, i_7);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@Override
	public void method53(int i_3, int i_4, int[] ints_5) {
		int[] ints_7 = new int[anInt9159 * anInt9158];
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGetTexImagei(anInt3707, 0, 32993, 5121, ints_7, 0);

		for (int i_8 = 0; i_8 < i_4; i_8++)
			System.arraycopy(ints_7, anInt9159 * ((i_4 - 1) - i_8), ints_5, i_3 * i_8, i_3);

	}

	@Override
	public boolean method54() {
		return super.method54();
	}

	@Override
	public int method55() {
		return anInt9159;
	}

	@Override
	public float method56(float f_1) {
		return f_1 / anInt9159;
	}

	@Override
	public int method57() {
		return anInt9159;
	}

	@Override
	public float method58(float f_1) {
		return f_1 / anInt9158;
	}

	@Override
	public int method59() {
		return anInt9158;
	}

	@Override
	public float method60(float f_1) {
		return f_1 / anInt9158;
	}

	@Override
	public void method61(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_7);
		OpenGL.glTexSubImage2Di(anInt3707, 0, i_1, i_2, i_3, i_4, 32993, aGraphicalRenderer_Sub2_Sub1_3700.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_6);
		OpenGL.glPixelStorei(3314, 0);
	}

	@Override
	public float method62(float f_1) {
		return f_1 / anInt9158;
	}

	@Override
	public boolean method63() {
		return true;
	}

	@Override
	public void method64(boolean bool_1, boolean bool_2) {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexParameteri(anInt3707, 10242, bool_1 ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt3707, 10243, bool_2 ? 10497 : 33071);
	}

	@Override
	public float method65(float f_1) {
		return f_1 / anInt9159;
	}

	@Override
	public void method66(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_7);
		OpenGL.glTexSubImage2Di(anInt3707, 0, i_1, i_2, i_3, i_4, 32993, aGraphicalRenderer_Sub2_Sub1_3700.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_6);
		OpenGL.glPixelStorei(3314, 0);
	}

	@Override
	public void method67(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_7);
		OpenGL.glTexSubImage2Di(anInt3707, 0, i_1, i_2, i_3, i_4, 32993, aGraphicalRenderer_Sub2_Sub1_3700.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_6);
		OpenGL.glPixelStorei(3314, 0);
	}

	@Override
	public void method68(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_8);
		OpenGL.glTexSubImage2Dub(anInt3707, 0, i_1, i_2, i_3, i_4, JAGGLRenderer.method15575(class150_6), 5121, bytes_5, i_7);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@Override
	public void method69(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6) {
		int[] ints_7 = new int[anInt9159 * anInt9158];
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGetTexImagei(anInt3707, 0, 32993, 5121, ints_7, 0);

		for (int i_8 = 0; i_8 < i_4; i_8++)
			System.arraycopy(ints_7, (i_2 + (i_4 - 1) - i_8) * anInt9159, ints_5, i_6 + i_8 * i_3, i_3);

	}

	@Override
	public int method70() {
		return anInt9159;
	}

	@Override
	public int method71() {
		return anInt9158;
	}

	@Override
	public int method72() {
		return anInt9158;
	}

}
