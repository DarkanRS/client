package com.rs.jagex;

import jaggl.OpenGL;

public class CacheableNode_Sub19 extends CacheableNode implements Interface13 {

	static int[] anIntArray10283 = new int[1];
	int anInt10278;
	OpenGLRenderer aGraphicalRenderer_Sub1_10282;
	int anInt10280;
	int anInt10281;
	Class150 aClass150_10285;
	Class76 aClass76_10279;
	int anInt10284;

	CacheableNode_Sub19(OpenGLRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
		aGraphicalRenderer_Sub1_10282 = class505_sub1_1;
		anInt10280 = i_4;
		anInt10281 = i_5;
		aClass150_10285 = class150_2;
		aClass76_10279 = class76_3;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10283, 0);
		anInt10278 = anIntArray10283[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt10278);
		OpenGL.glRenderbufferStorageEXT(36161, OpenGLRenderer.method13630(aClass150_10285, aClass76_10279), anInt10280, anInt10281);
		anInt10284 = aClass150_10285.anInt1959 * aClass76_10279.anInt748 * anInt10280 * anInt10281;
	}

	CacheableNode_Sub19(OpenGLRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5, int i_6) {
		aGraphicalRenderer_Sub1_10282 = class505_sub1_1;
		anInt10280 = i_4;
		anInt10281 = i_5;
		aClass150_10285 = class150_2;
		aClass76_10279 = class76_3;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10283, 0);
		anInt10278 = anIntArray10283[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt10278);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_6, OpenGLRenderer.method13630(aClass150_10285, aClass76_10279), anInt10280, anInt10281);
		anInt10284 = aClass150_10285.anInt1959 * aClass76_10279.anInt748 * anInt10280 * anInt10281;
	}

	@Override
	protected void finalize() throws Throwable {
		method15697();
		super.finalize();
	}

	@Override
	public int method1() {
		return anInt10280;
	}

	@Override
	public void method100(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, anInt10278);
	}

	@Override
	public void method101(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, anInt10278);
	}

	@Override
	public void method102(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, anInt10278);
	}

	@Override
	public void method103(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, anInt10278);
	}

	@Override
	public void method104(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, anInt10278);
	}

	@Override
	public void method105(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, anInt10278);
	}

	void method15697() {
		if (anInt10278 > 0) {
			aGraphicalRenderer_Sub1_10282.method13707(anInt10278, anInt10284);
			anInt10278 = 0;
		}

	}

	@Override
	public void method26() {
		if (anInt10278 > 0) {
			int[] ints_1 = {anInt10278};
			OpenGL.glDeleteRenderbuffersEXT(1, ints_1, 0);
			anInt10278 = 0;
		}

	}

	@Override
	public void method32() {
		if (anInt10278 > 0) {
			int[] ints_1 = {anInt10278};
			OpenGL.glDeleteRenderbuffersEXT(1, ints_1, 0);
			anInt10278 = 0;
		}

	}

	@Override
	public int method39() {
		return anInt10281;
	}

	@Override
	public int method73() {
		return anInt10281;
	}

	@Override
	public int method74() {
		return anInt10281;
	}

	@Override
	public int method75() {
		return anInt10280;
	}

	@Override
	public int method76() {
		return anInt10280;
	}

	@Override
	public int method77() {
		return anInt10281;
	}

	@Override
	public void method99(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, anInt10278);
	}

}
