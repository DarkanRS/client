package com.rs.jagex;

import jaggl.OpenGL;

public class Class141_Sub5 extends Class141 {

	static float[] aFloatArray9084 = new float[4];
	Class136 aClass136_9080;
	Class138 aClass138_9082;

	Class141_Sub5(OpenGLRenderer class505_sub1_1, Class136 class136_2) {
		super(class505_sub1_1);
		aClass136_9080 = class136_2;
		aClass138_9082 = new Class138(2);
		aClass138_9082.method2380(0);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		if (aClass136_9080.aBool1631) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}

		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		aClass138_9082.method2381();
		aClass138_9082.method2380(1);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		if (aClass136_9080.aBool1631)
			OpenGL.glDisable(3170);

		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		aClass138_9082.method2381();
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
		float f_3 = -5.0E-4f * ((i_1 & 0x3) + 1);
		float f_4 = 5.0E-4F * ((i_1 >> 3 & 0x3) + 1);
		float f_5 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_6 = (i_1 & 0x80) != 0;
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		if (bool_6) {
			aFloatArray9084[0] = f_5;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_5;
		}
		aFloatArray9084[3] = 0.0F;

		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_5;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = aGraphicalRenderer_Sub1_1664.anInt8368 * f_3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!aClass136_9080.aBool1631) {
			int i_7 = (int) (f_4 * aGraphicalRenderer_Sub1_1664.anInt8368 * 16.0F);
			aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9080.aClass137_Sub1Array1634[i_7 % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = aGraphicalRenderer_Sub1_1664.anInt8368 * f_4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}

		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
	}

	@Override
	void method2397(boolean bool_1) {
		aClass138_9082.method2379('\u0000');
		if (aClass136_9080.aBool1631) {
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9080.aClass137_Sub4_1636);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		}

	}

	@Override
	void method2398() {
		aClass138_9082.method2379('\u0001');
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		aGraphicalRenderer_Sub1_1664.setTexture(null);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
	}

	@Override
	void method2399(int i_1, int i_2) {
		float f_3 = -5.0E-4f * ((i_1 & 0x3) + 1);
		float f_4 = 5.0E-4F * ((i_1 >> 3 & 0x3) + 1);
		float f_5 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_6 = (i_1 & 0x80) != 0;
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		if (bool_6) {
			aFloatArray9084[0] = f_5;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_5;
		}
		aFloatArray9084[3] = 0.0F;

		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_5;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = aGraphicalRenderer_Sub1_1664.anInt8368 * f_3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!aClass136_9080.aBool1631) {
			int i_7 = (int) (f_4 * aGraphicalRenderer_Sub1_1664.anInt8368 * 16.0F);
			aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9080.aClass137_Sub1Array1634[i_7 % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = aGraphicalRenderer_Sub1_1664.anInt8368 * f_4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}

		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
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
		aClass138_9082.method2379('\u0000');
		if (aClass136_9080.aBool1631) {
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9080.aClass137_Sub4_1636);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		}

	}

	@Override
	void method2403(boolean bool_1) {
		aClass138_9082.method2379('\u0000');
		if (aClass136_9080.aBool1631) {
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9080.aClass137_Sub4_1636);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		}

	}

	@Override
	void method2404() {
	}

	@Override
	void method2405() {
	}

	@Override
	void method2406() {
	}

	@Override
	void method2407() {
	}

	@Override
	void method2408() {
	}

	@Override
	void method2409(int i_1, int i_2) {
		float f_3 = -5.0E-4f * ((i_1 & 0x3) + 1);
		float f_4 = 5.0E-4F * ((i_1 >> 3 & 0x3) + 1);
		float f_5 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_6 = (i_1 & 0x80) != 0;
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		if (bool_6) {
			aFloatArray9084[0] = f_5;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_5;
		}
		aFloatArray9084[3] = 0.0F;

		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_5;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = aGraphicalRenderer_Sub1_1664.anInt8368 * f_3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!aClass136_9080.aBool1631) {
			int i_7 = (int) (f_4 * aGraphicalRenderer_Sub1_1664.anInt8368 * 16.0F);
			aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9080.aClass137_Sub1Array1634[i_7 % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = aGraphicalRenderer_Sub1_1664.anInt8368 * f_4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}

		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
	}

	@Override
	void method2410(int i_1, int i_2) {
		float f_3 = -5.0E-4f * ((i_1 & 0x3) + 1);
		float f_4 = 5.0E-4F * ((i_1 >> 3 & 0x3) + 1);
		float f_5 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_6 = (i_1 & 0x80) != 0;
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		if (bool_6) {
			aFloatArray9084[0] = f_5;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_5;
		}
		aFloatArray9084[3] = 0.0F;

		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_5;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = aGraphicalRenderer_Sub1_1664.anInt8368 * f_3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!aClass136_9080.aBool1631) {
			int i_7 = (int) (f_4 * aGraphicalRenderer_Sub1_1664.anInt8368 * 16.0F);
			aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9080.aClass137_Sub1Array1634[i_7 % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = aGraphicalRenderer_Sub1_1664.anInt8368 * f_4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}

		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
	}

	@Override
	void method2411() {
		aClass138_9082.method2379('\u0001');
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		aGraphicalRenderer_Sub1_1664.setTexture(null);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
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
