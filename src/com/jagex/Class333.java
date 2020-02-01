package com.jagex;
import jaggl.OpenGL;

public class Class333 implements Interface9, Interface8, Interface28 {

	int anInt3882;
	Class150 aClass150_3880;
	Class76 aClass76_3878;
	int anInt3877;
	int anInt3879;
	GraphicalRenderer_Sub2_Sub1 aGraphicalRenderer_Sub2_Sub1_3881;

	public void finalize() throws Throwable {
		this.method5931();
		super.finalize();
	}

	public int method1() {
		return this.anInt3877;
	}

	public int method74() {
		return this.anInt3879;
	}

	void method5931() {
		if (this.anInt3882 > 0) {
			this.aGraphicalRenderer_Sub2_Sub1_3881.method15572(this.anInt3882, this.aClass76_3878.anInt748 * this.aClass150_3880.anInt1959 * this.anInt3877 * this.anInt3879);
			this.anInt3882 = 0;
		}

	}

	public void method26() {
		if (this.anInt3882 > 0) {
			int[] ints_1 = new int[] { this.anInt3882 };
			OpenGL.glDeleteRenderbuffersEXT(1, ints_1, 0);
			this.anInt3882 = 0;
		}

	}

	public int method73() {
		return this.anInt3879;
	}

	public int method75() {
		return this.anInt3877;
	}

	Class333(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
		this.aClass150_3880 = class150_2;
		this.aClass76_3878 = class76_3;
		this.anInt3877 = i_4;
		this.anInt3879 = i_5;
		this.aGraphicalRenderer_Sub2_Sub1_3881 = class505_sub2_sub1_1;
		int[] ints_6 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, ints_6, 0);
		this.anInt3882 = ints_6[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3882);
		OpenGL.glRenderbufferStorageEXT(36161, GraphicalRenderer_Sub2_Sub1.method15574(this.aClass150_3880, this.aClass76_3878), i_4, i_5);
	}

	public int method76() {
		return this.anInt3877;
	}

	public int method39() {
		return this.anInt3879;
	}

	public void method99(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, this.anInt3882);
	}

	public void method32() {
		if (this.anInt3882 > 0) {
			int[] ints_1 = new int[] { this.anInt3882 };
			OpenGL.glDeleteRenderbuffersEXT(1, ints_1, 0);
			this.anInt3882 = 0;
		}

	}

	public int method77() {
		return this.anInt3879;
	}

	public void method104(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, this.anInt3882);
	}

}
