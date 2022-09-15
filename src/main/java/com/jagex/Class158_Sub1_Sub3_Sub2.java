package com.jagex;

import jaggl.OpenGL;

public class Class158_Sub1_Sub3_Sub2 extends Class158_Sub1_Sub3 {

	Interface28[] anInterface28Array10449 = new Interface28[4];
	JAGGLRenderer aGraphicalRenderer_Sub2_Sub1_10446;
	int anInt10443;
	int anInt10444;
	Interface28 anInterface28_10448;
	int anInt10445;
	int anInt10441;
	int anInt10447;

	Class158_Sub1_Sub3_Sub2(JAGGLRenderer class505_sub2_sub1_1) {
		super(class505_sub2_sub1_1);
		aGraphicalRenderer_Sub2_Sub1_10446 = class505_sub2_sub1_1;
		int[] ints_2 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, ints_2, 0);
		anInt10443 = ints_2[0];
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		method212();
	}

	@Override
	public void method13759(int i_1, Interface9 interface9_2) {
		int i_3 = 1 << i_1;
		Interface28 interface28_4 = (Interface28) interface9_2;
		if (interface9_2 == null) {
			anInt10444 &= ~i_3;
			anInterface28Array10449[i_1] = null;
			if (anInt10444 == 0) {
				anInt10445 = 0;
				anInt10441 = 0;
			}
		} else {
			if (anInt10444 != 0) {
				if (anInt10441 != interface28_4.method1() || anInt10445 != interface28_4.method74())
					throw new RuntimeException();
			} else {
				anInt10445 = interface28_4.method74();
				anInt10441 = interface28_4.method1();
				method15562();
			}

			anInt10444 |= i_3;
			anInterface28Array10449[i_1] = interface28_4;
		}

		if (this == aGraphicalRenderer_Sub2_Sub1_10446.method8523())
			method15981(i_1);
		else
			anInt10447 |= i_3;

	}

	@Override
	public boolean method13764() {
		int i_1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return i_1 == 36053;
	}

	@Override
	public void method13765(Interface8 interface8_1) {
		Interface28 interface28_2 = (Interface28) interface8_1;
		if (interface8_1 == null) {
			anInt10444 &= -17;
			anInterface28_10448 = null;
			if (anInt10444 == 0) {
				anInt10445 = 0;
				anInt10441 = 0;
			}
		} else {
			if (anInt10444 != 0) {
				if (anInt10441 != interface28_2.method1() || anInt10445 != interface28_2.method74())
					throw new RuntimeException();
			} else {
				anInt10445 = interface28_2.method74();
				anInt10441 = interface28_2.method1();
				method15562();
			}

			anInt10444 |= 0x10;
			anInterface28_10448 = interface28_2;
		}

		if (this == aGraphicalRenderer_Sub2_Sub1_10446.method8523())
			method15982();
		else
			anInt10447 |= 0x10;

	}

	void method15981(int i_1) {
		Interface28 interface28_2 = anInterface28Array10449[i_1];
		if (interface28_2 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, i_1 + 36064, 36161, 0);
		else
			interface28_2.method99(i_1 + 36064);

	}

	void method15982() {
		if (anInterface28_10448 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			anInterface28_10448.method99(36096);

	}

	@Override
	public void method186() {
		if (anInt10443 != 0) {
			aGraphicalRenderer_Sub2_Sub1_10446.method15571(anInt10443);
			anInt10443 = 0;
		}

	}

	@Override
	boolean method211() {
		OpenGL.glBindFramebufferEXT(36160, anInt10443);

		for (int i_1 = 0; i_1 < 4; i_1++)
			if ((anInt10447 & 1 << i_1) != 0)
				method15981(i_1);

		if ((anInt10447 & 0x10) != 0)
			method15982();

		anInt10447 = 0;
		return super.method213();
	}

	@Override
	public void method212() {
		if (anInt10443 != 0) {
			aGraphicalRenderer_Sub2_Sub1_10446.method15571(anInt10443);
			anInt10443 = 0;
		}

	}

	@Override
	boolean method213() {
		OpenGL.glBindFramebufferEXT(36160, anInt10443);

		for (int i_1 = 0; i_1 < 4; i_1++)
			if ((anInt10447 & 1 << i_1) != 0)
				method15981(i_1);

		if ((anInt10447 & 0x10) != 0)
			method15982();

		anInt10447 = 0;
		return super.method213();
	}

	@Override
	public int method2714() {
		return anInt10441;
	}

	@Override
	boolean method2715() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@Override
	public int method2716() {
		return anInt10445;
	}

	@Override
	boolean method2717() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@Override
	boolean method2718() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@Override
	public int method2719() {
		return anInt10441;
	}

	@Override
	public int method2720() {
		return anInt10441;
	}

	@Override
	public int method2721() {
		return anInt10445;
	}

	@Override
	boolean method2722() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@Override
	boolean method2723() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@Override
	boolean method2724() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@Override
	boolean method2725() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@Override
	public int method2726() {
		return anInt10441;
	}

	@Override
	public int method2727() {
		return anInt10445;
	}

	@Override
	boolean method54() {
		OpenGL.glBindFramebufferEXT(36160, anInt10443);

		for (int i_1 = 0; i_1 < 4; i_1++)
			if ((anInt10447 & 1 << i_1) != 0)
				method15981(i_1);

		if ((anInt10447 & 0x10) != 0)
			method15982();

		anInt10447 = 0;
		return super.method213();
	}

}
