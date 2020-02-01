package com.jagex;
import jaggl.OpenGL;

public class Class141_Sub5 extends Class141 {

	static float[] aFloatArray9084 = new float[4];
	Class136 aClass136_9080;
	Class138 aClass138_9082;

	void method2409(int i_1, int i_2) {
		float f_3 = -5.0E-4F * (float) ((i_1 & 0x3) + 1);
		float f_4 = 5.0E-4F * (float) ((i_1 >> 3 & 0x3) + 1);
		float f_5 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_6 = (i_1 & 0x80) != 0;
		this.aGraphicalRenderer_Sub1_1664.method13610(1);
		if (bool_6) {
			aFloatArray9084[0] = f_5;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_5;
			aFloatArray9084[3] = 0.0F;
		}

		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_5;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * f_3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!this.aClass136_9080.aBool1631) {
			int i_7 = (int) (f_4 * (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * 16.0F);
			this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9080.aClass137_Sub1Array1634[i_7 % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * f_4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}

		this.aGraphicalRenderer_Sub1_1664.method13610(0);
	}

	boolean method2395() {
		return true;
	}

	void method2408(boolean bool_1) {
	}

	void method2397(boolean bool_1) {
		this.aClass138_9082.method2379('\u0000');
		if (this.aClass136_9080.aBool1631) {
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9080.aClass137_Sub4_1636);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
		}

	}

	boolean method2401() {
		return true;
	}

	Class141_Sub5(OpenGLGraphicalRenderer class505_sub1_1, Class136 class136_2) {
		super(class505_sub1_1);
		this.aClass136_9080 = class136_2;
		this.aClass138_9082 = new Class138(class505_sub1_1, 2);
		this.aClass138_9082.method2380(0);
		this.aGraphicalRenderer_Sub1_1664.method13610(1);
		if (this.aClass136_9080.aBool1631) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}

		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		this.aGraphicalRenderer_Sub1_1664.method13610(0);
		this.aClass138_9082.method2381();
		this.aClass138_9082.method2380(1);
		this.aGraphicalRenderer_Sub1_1664.method13610(1);
		if (this.aClass136_9080.aBool1631) {
			OpenGL.glDisable(3170);
		}

		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aGraphicalRenderer_Sub1_1664.method13610(0);
		this.aClass138_9082.method2381();
	}

	void method2394(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	void method2414(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	void method2402(boolean bool_1) {
		this.aClass138_9082.method2379('\u0000');
		if (this.aClass136_9080.aBool1631) {
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9080.aClass137_Sub4_1636);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
		}

	}

	void method2403(boolean bool_1) {
		this.aClass138_9082.method2379('\u0000');
		if (this.aClass136_9080.aBool1631) {
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9080.aClass137_Sub4_1636);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
		}

	}

	void method2398() {
		this.aClass138_9082.method2379('\u0001');
		this.aGraphicalRenderer_Sub1_1664.method13610(1);
		this.aGraphicalRenderer_Sub1_1664.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_1664.method13610(0);
	}

	void method2405(boolean bool_1) {
	}

	void method2406(boolean bool_1) {
	}

	void method2407(boolean bool_1) {
	}

	void method2411() {
		this.aClass138_9082.method2379('\u0001');
		this.aGraphicalRenderer_Sub1_1664.method13610(1);
		this.aGraphicalRenderer_Sub1_1664.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_1664.method13610(0);
	}

	void method2399(int i_1, int i_2) {
		float f_3 = -5.0E-4F * (float) ((i_1 & 0x3) + 1);
		float f_4 = 5.0E-4F * (float) ((i_1 >> 3 & 0x3) + 1);
		float f_5 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_6 = (i_1 & 0x80) != 0;
		this.aGraphicalRenderer_Sub1_1664.method13610(1);
		if (bool_6) {
			aFloatArray9084[0] = f_5;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_5;
			aFloatArray9084[3] = 0.0F;
		}

		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_5;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * f_3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!this.aClass136_9080.aBool1631) {
			int i_7 = (int) (f_4 * (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * 16.0F);
			this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9080.aClass137_Sub1Array1634[i_7 % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * f_4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}

		this.aGraphicalRenderer_Sub1_1664.method13610(0);
	}

	void method2396(int i_1, int i_2) {
		float f_3 = -5.0E-4F * (float) ((i_1 & 0x3) + 1);
		float f_4 = 5.0E-4F * (float) ((i_1 >> 3 & 0x3) + 1);
		float f_5 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_6 = (i_1 & 0x80) != 0;
		this.aGraphicalRenderer_Sub1_1664.method13610(1);
		if (bool_6) {
			aFloatArray9084[0] = f_5;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_5;
			aFloatArray9084[3] = 0.0F;
		}

		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_5;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * f_3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!this.aClass136_9080.aBool1631) {
			int i_7 = (int) (f_4 * (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * 16.0F);
			this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9080.aClass137_Sub1Array1634[i_7 % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * f_4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}

		this.aGraphicalRenderer_Sub1_1664.method13610(0);
	}

	void method2410(int i_1, int i_2) {
		float f_3 = -5.0E-4F * (float) ((i_1 & 0x3) + 1);
		float f_4 = 5.0E-4F * (float) ((i_1 >> 3 & 0x3) + 1);
		float f_5 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_6 = (i_1 & 0x80) != 0;
		this.aGraphicalRenderer_Sub1_1664.method13610(1);
		if (bool_6) {
			aFloatArray9084[0] = f_5;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_5;
			aFloatArray9084[3] = 0.0F;
		}

		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_5;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * f_3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!this.aClass136_9080.aBool1631) {
			int i_7 = (int) (f_4 * (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * 16.0F);
			this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9080.aClass137_Sub1Array1634[i_7 % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = (float) this.aGraphicalRenderer_Sub1_1664.anInt8368 * f_4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}

		this.aGraphicalRenderer_Sub1_1664.method13610(0);
	}

	void method2404(boolean bool_1) {
	}

	void method2412(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	void method2413(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	void method2400(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

}
