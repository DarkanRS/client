/* Class47_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub4 extends Class47 {
	Class30_Sub3 aClass30_Sub3_6769;
	static char aChar6770 = '\001';
	static char aChar6771 = '\0';
	Class28 aClass28_6772;
	Class45 aClass45_6773;
	static float[] aFloatArray6774 = { 0.0F, 0.0F, 0.0F, 0.0F };

	void method516(int i, int i_0_) {
		if ((i & 0x1) == 1) {
			if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
				aFloatArray6774[0] = 0.0F;
				aFloatArray6774[1] = 0.0F;
				aFloatArray6774[2] = 0.0F;
				aFloatArray6774[3] = (float) ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8062) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
			} else {
				int i_1_ = (((Class_ra_Sub2) (((Class47_Sub4) this).aClass_ra_Sub2_491)).anInt8062 % 4000 * 16 / 4000);
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[i_1_]);
			}
		} else if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = 0.0F;
			aFloatArray6774[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
		} else
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[0]);
	}

	boolean method501() {
		return true;
	}

	void method518(boolean bool) {
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5258(260, 8448);
	}

	Class47_Sub4(Class_ra_Sub2 class_ra_sub2, Class45 class45) {
		super(class_ra_sub2);
		((Class47_Sub4) this).aClass45_6773 = class45;
		method522();
		((Class47_Sub4) this).aClass30_Sub3_6769 = new Class30_Sub3(((Class47_Sub4) this).aClass_ra_Sub2_491, Class55.aClass55_567, Class77.aClass77_717, 2, new byte[] { 0, -1 }, Class55.aClass55_567);
		((Class47_Sub4) this).aClass30_Sub3_6769.method430(false);
	}

	void method503(int i, int i_2_) {
		if ((i & 0x1) == 1) {
			if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
				aFloatArray6774[0] = 0.0F;
				aFloatArray6774[1] = 0.0F;
				aFloatArray6774[2] = 0.0F;
				aFloatArray6774[3] = (float) ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8062) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
			} else {
				int i_3_ = (((Class_ra_Sub2) (((Class47_Sub4) this).aClass_ra_Sub2_491)).anInt8062 % 4000 * 16 / 4000);
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[i_3_]);
			}
		} else if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = 0.0F;
			aFloatArray6774[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
		} else
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[0]);
	}

	void method500(Class30 class30, int i) {
		/* empty */
	}

	void method508(boolean bool) {
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5258(260, 8448);
	}

	void method506(boolean bool) {
		if ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8007) > 0) {
			float f = -0.5F / (float) (((Class_ra_Sub2) (((Class47_Sub4) this).aClass_ra_Sub2_491)).anInt8007);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(1);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = f;
			aFloatArray6774[3] = (((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).aFloat8142) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray6774, 0);
			OpenGL.glPopMatrix();
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5238(0.5F, (float) ((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8007);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class47_Sub4) this).aClass30_Sub3_6769);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(0);
		}
		((Class47_Sub4) this).aClass28_6772.method404('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method507(boolean bool) {
		if ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8007) > 0) {
			float f = -0.5F / (float) (((Class_ra_Sub2) (((Class47_Sub4) this).aClass_ra_Sub2_491)).anInt8007);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(1);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = f;
			aFloatArray6774[3] = (((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).aFloat8142) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray6774, 0);
			OpenGL.glPopMatrix();
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5238(0.5F, (float) ((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8007);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class47_Sub4) this).aClass30_Sub3_6769);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(0);
		}
		((Class47_Sub4) this).aClass28_6772.method404('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method511() {
		((Class47_Sub4) this).aClass28_6772.method404('\001');
		if ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8007) > 0) {
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5238(1.0F, 0.0F);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(0);
		}
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5258(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method509(boolean bool) {
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5258(260, 8448);
	}

	void method510(boolean bool) {
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5258(260, 8448);
	}

	void method522() {
		((Class47_Sub4) this).aClass28_6772 = new Class28(((Class47_Sub4) this).aClass_ra_Sub2_491, 2);
		((Class47_Sub4) this).aClass28_6772.method405(0);
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(1);
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5258(7681, 260);
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5259(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		((Class47_Sub4) this).aClass28_6772.method403();
		((Class47_Sub4) this).aClass28_6772.method405(1);
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(1);
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5258(8448, 8448);
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5259(0, 5890, 768);
		OpenGL.glDisable(3168);
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		((Class47_Sub4) this).aClass28_6772.method403();
	}

	void method504() {
		((Class47_Sub4) this).aClass28_6772.method404('\001');
		if ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8007) > 0) {
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5238(1.0F, 0.0F);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(0);
		}
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5258(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method513(int i, int i_4_) {
		if ((i & 0x1) == 1) {
			if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
				aFloatArray6774[0] = 0.0F;
				aFloatArray6774[1] = 0.0F;
				aFloatArray6774[2] = 0.0F;
				aFloatArray6774[3] = (float) ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8062) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
			} else {
				int i_5_ = (((Class_ra_Sub2) (((Class47_Sub4) this).aClass_ra_Sub2_491)).anInt8062 % 4000 * 16 / 4000);
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[i_5_]);
			}
		} else if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = 0.0F;
			aFloatArray6774[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
		} else
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[0]);
	}

	void method502(int i, int i_6_) {
		if ((i & 0x1) == 1) {
			if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
				aFloatArray6774[0] = 0.0F;
				aFloatArray6774[1] = 0.0F;
				aFloatArray6774[2] = 0.0F;
				aFloatArray6774[3] = (float) ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8062) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
			} else {
				int i_7_ = (((Class_ra_Sub2) (((Class47_Sub4) this).aClass_ra_Sub2_491)).anInt8062 % 4000 * 16 / 4000);
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[i_7_]);
			}
		} else if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = 0.0F;
			aFloatArray6774[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
		} else
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[0]);
	}

	void method512() {
		((Class47_Sub4) this).aClass28_6772.method404('\001');
		if ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8007) > 0) {
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5238(1.0F, 0.0F);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(0);
		}
		((Class47_Sub4) this).aClass_ra_Sub2_491.method5258(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method505(boolean bool) {
		if ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8007) > 0) {
			float f = -0.5F / (float) (((Class_ra_Sub2) (((Class47_Sub4) this).aClass_ra_Sub2_491)).anInt8007);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(1);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = f;
			aFloatArray6774[3] = (((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).aFloat8142) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray6774, 0);
			OpenGL.glPopMatrix();
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5238(0.5F, (float) ((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8007);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class47_Sub4) this).aClass30_Sub3_6769);
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5255(0);
		}
		((Class47_Sub4) this).aClass28_6772.method404('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method517(int i, int i_8_) {
		if ((i & 0x1) == 1) {
			if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
				aFloatArray6774[0] = 0.0F;
				aFloatArray6774[1] = 0.0F;
				aFloatArray6774[2] = 0.0F;
				aFloatArray6774[3] = (float) ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8062) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
			} else {
				int i_9_ = (((Class_ra_Sub2) (((Class47_Sub4) this).aClass_ra_Sub2_491)).anInt8062 % 4000 * 16 / 4000);
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[i_9_]);
			}
		} else if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = 0.0F;
			aFloatArray6774[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
		} else
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[0]);
	}

	void method514(Class30 class30, int i) {
		/* empty */
	}

	void method515(int i, int i_10_) {
		if ((i & 0x1) == 1) {
			if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
				aFloatArray6774[0] = 0.0F;
				aFloatArray6774[1] = 0.0F;
				aFloatArray6774[2] = 0.0F;
				aFloatArray6774[3] = (float) ((((Class_ra_Sub2) ((Class47_Sub4) this).aClass_ra_Sub2_491).anInt8062) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
			} else {
				int i_11_ = (((Class_ra_Sub2) (((Class47_Sub4) this).aClass_ra_Sub2_491)).anInt8062 % 4000 * 16 / 4000);
				((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[i_11_]);
			}
		} else if (((Class45) ((Class47_Sub4) this).aClass45_6773).aBoolean480) {
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub4_482);
			aFloatArray6774[0] = 0.0F;
			aFloatArray6774[1] = 0.0F;
			aFloatArray6774[2] = 0.0F;
			aFloatArray6774[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6774, 0);
		} else
			((Class47_Sub4) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub4) this).aClass45_6773).aClass30_Sub2Array487[0]);
	}

	boolean method520() {
		return true;
	}

	void method519(Class30 class30, int i) {
		/* empty */
	}
}
