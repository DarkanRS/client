
/* Class141_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141_Sub3 extends Class141 {
	static final char aChar9043 = '\001';
	Class136 aClass136_9044;
	static final char aChar9045 = '\0';
	Class138 aClass138_9046;
	Class137_Sub3 aClass137_Sub3_9047;
	static float[] aFloatArray9048 = { 0.0F, 0.0F, 0.0F, 0.0F };

	void method2411() {
		((Class141_Sub3) this).aClass138_9046.method2379('\001');
		if ((((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).anInt8358) > 0) {
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13591(1.0F, 0.0F);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(0);
		}
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	boolean method2395() {
		return true;
	}

	void method2396(int i, int i_0_) {
		if ((i & 0x1) == 1) {
			if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
				((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub4_1633);
				aFloatArray9048[0] = 0.0F;
				aFloatArray9048[1] = 0.0F;
				aFloatArray9048[2] = 0.0F;
				aFloatArray9048[3] = (float) ((((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).anInt8368) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
			} else {
				int i_1_ = (((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8368 % 4000 * 16 / 4000);
				((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub1Array1632[i_1_]);
			}
		} else if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub4_1633);
			aFloatArray9048[0] = 0.0F;
			aFloatArray9048[1] = 0.0F;
			aFloatArray9048[2] = 0.0F;
			aFloatArray9048[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
		} else
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub1Array1632[0]);
	}

	void method2408(boolean bool) {
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(260, 8448);
	}

	void method2398() {
		((Class141_Sub3) this).aClass138_9046.method2379('\001');
		if ((((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).anInt8358) > 0) {
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13591(1.0F, 0.0F);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(0);
		}
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method2397(boolean bool) {
		if ((((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).anInt8358) > 0) {
			float f = -0.5F / (float) (((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8358);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(1);
			aFloatArray9048[0] = 0.0F;
			aFloatArray9048[1] = 0.0F;
			aFloatArray9048[2] = f;
			aFloatArray9048[3] = (((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).aFloat8406) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray9048, 0);
			OpenGL.glPopMatrix();
			((Class141_Sub3) this).aClass505_Sub1_1664.method13591(0.5F, (float) ((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8358);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class141_Sub3) this).aClass137_Sub3_9047);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(0);
		}
		((Class141_Sub3) this).aClass138_9046.method2379('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2400(Class137 class137, int i) {
		/* empty */
	}

	void method14423() {
		((Class141_Sub3) this).aClass138_9046 = new Class138(((Class141_Sub3) this).aClass505_Sub1_1664, 2);
		((Class141_Sub3) this).aClass138_9046.method2380(0);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(7681, 260);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13610(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		((Class141_Sub3) this).aClass138_9046.method2381();
		((Class141_Sub3) this).aClass138_9046.method2380(1);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(8448, 8448);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
		OpenGL.glDisable(3168);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13610(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		((Class141_Sub3) this).aClass138_9046.method2381();
	}

	void method2407(boolean bool) {
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(260, 8448);
	}

	boolean method2401() {
		return true;
	}

	Class141_Sub3(Class505_Sub1 class505_sub1, Class136 class136) {
		super(class505_sub1);
		((Class141_Sub3) this).aClass136_9044 = class136;
		method14423();
		((Class141_Sub3) this).aClass137_Sub3_9047 = new Class137_Sub3(((Class141_Sub3) this).aClass505_Sub1_1664, Class150.aClass150_1951, Class76.aClass76_751, 2, new byte[] { 0, -1 }, Class150.aClass150_1951);
		((Class141_Sub3) this).aClass137_Sub3_9047.method14460(false);
	}

	void method2414(Class137 class137, int i) {
		/* empty */
	}

	void method2404(boolean bool) {
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(260, 8448);
	}

	void method2405(boolean bool) {
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(260, 8448);
	}

	void method2406(boolean bool) {
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(260, 8448);
	}

	void method14424() {
		((Class141_Sub3) this).aClass138_9046 = new Class138(((Class141_Sub3) this).aClass505_Sub1_1664, 2);
		((Class141_Sub3) this).aClass138_9046.method2380(0);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(7681, 260);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13610(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		((Class141_Sub3) this).aClass138_9046.method2381();
		((Class141_Sub3) this).aClass138_9046.method2380(1);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13717(8448, 8448);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
		OpenGL.glDisable(3168);
		((Class141_Sub3) this).aClass505_Sub1_1664.method13610(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		((Class141_Sub3) this).aClass138_9046.method2381();
	}

	void method2413(Class137 class137, int i) {
		/* empty */
	}

	void method2409(int i, int i_2_) {
		if ((i & 0x1) == 1) {
			if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
				((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub4_1633);
				aFloatArray9048[0] = 0.0F;
				aFloatArray9048[1] = 0.0F;
				aFloatArray9048[2] = 0.0F;
				aFloatArray9048[3] = (float) ((((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).anInt8368) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
			} else {
				int i_3_ = (((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8368 % 4000 * 16 / 4000);
				((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub1Array1632[i_3_]);
			}
		} else if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub4_1633);
			aFloatArray9048[0] = 0.0F;
			aFloatArray9048[1] = 0.0F;
			aFloatArray9048[2] = 0.0F;
			aFloatArray9048[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
		} else
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub1Array1632[0]);
	}

	void method2410(int i, int i_4_) {
		if ((i & 0x1) == 1) {
			if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
				((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub4_1633);
				aFloatArray9048[0] = 0.0F;
				aFloatArray9048[1] = 0.0F;
				aFloatArray9048[2] = 0.0F;
				aFloatArray9048[3] = (float) ((((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).anInt8368) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
			} else {
				int i_5_ = (((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8368 % 4000 * 16 / 4000);
				((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub1Array1632[i_5_]);
			}
		} else if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub4_1633);
			aFloatArray9048[0] = 0.0F;
			aFloatArray9048[1] = 0.0F;
			aFloatArray9048[2] = 0.0F;
			aFloatArray9048[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
		} else
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub1Array1632[0]);
	}

	void method2394(Class137 class137, int i) {
		/* empty */
	}

	void method2412(Class137 class137, int i) {
		/* empty */
	}

	void method2399(int i, int i_6_) {
		if ((i & 0x1) == 1) {
			if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
				((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub4_1633);
				aFloatArray9048[0] = 0.0F;
				aFloatArray9048[1] = 0.0F;
				aFloatArray9048[2] = 0.0F;
				aFloatArray9048[3] = (float) ((((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).anInt8368) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
			} else {
				int i_7_ = (((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8368 % 4000 * 16 / 4000);
				((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub1Array1632[i_7_]);
			}
		} else if (((Class136) ((Class141_Sub3) this).aClass136_9044).aBool1631) {
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub4_1633);
			aFloatArray9048[0] = 0.0F;
			aFloatArray9048[1] = 0.0F;
			aFloatArray9048[2] = 0.0F;
			aFloatArray9048[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
		} else
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub3) this).aClass136_9044).aClass137_Sub1Array1632[0]);
	}

	void method2402(boolean bool) {
		if ((((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).anInt8358) > 0) {
			float f = -0.5F / (float) (((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8358);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(1);
			aFloatArray9048[0] = 0.0F;
			aFloatArray9048[1] = 0.0F;
			aFloatArray9048[2] = f;
			aFloatArray9048[3] = (((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).aFloat8406) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray9048, 0);
			OpenGL.glPopMatrix();
			((Class141_Sub3) this).aClass505_Sub1_1664.method13591(0.5F, (float) ((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8358);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class141_Sub3) this).aClass137_Sub3_9047);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(0);
		}
		((Class141_Sub3) this).aClass138_9046.method2379('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2403(boolean bool) {
		if ((((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).anInt8358) > 0) {
			float f = -0.5F / (float) (((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8358);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(1);
			aFloatArray9048[0] = 0.0F;
			aFloatArray9048[1] = 0.0F;
			aFloatArray9048[2] = f;
			aFloatArray9048[3] = (((Class505_Sub1) ((Class141_Sub3) this).aClass505_Sub1_1664).aFloat8406) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray9048, 0);
			OpenGL.glPopMatrix();
			((Class141_Sub3) this).aClass505_Sub1_1664.method13591(0.5F, (float) ((Class505_Sub1) (((Class141_Sub3) this).aClass505_Sub1_1664)).anInt8358);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13654(((Class141_Sub3) this).aClass137_Sub3_9047);
			((Class141_Sub3) this).aClass505_Sub1_1664.method13610(0);
		}
		((Class141_Sub3) this).aClass138_9046.method2379('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}
}
