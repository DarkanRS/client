/* Class47_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub6 extends Class47 {
	Class45 aClass45_6789;
	Class28 aClass28_6790;
	static char aChar6791 = '\0';
	static char aChar6792 = '\001';
	static float[] aFloatArray6793 = new float[4];

	void method516(int i, int i_0_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		if (bool) {
			aFloatArray6793[0] = f_2_;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = 0.0F;
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = f_2_;
			aFloatArray6793[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray6793, 0);
		aFloatArray6793[0] = 0.0F;
		aFloatArray6793[1] = f_2_;
		aFloatArray6793[2] = 0.0F;
		aFloatArray6793[3] = (float) (((Class_ra_Sub2) (((Class47_Sub6) this).aClass_ra_Sub2_491)).anInt8062) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray6793, 0);
		if (!((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			int i_3_ = (int) (f_1_ * (float) (((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062) * 16.0F);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub6) this).aClass45_6789).aClass30_Sub2Array483[i_3_ % 16]);
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = ((float) ((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062 * f_1_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6793, 0);
		}
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
	}

	Class47_Sub6(Class_ra_Sub2 class_ra_sub2, Class45 class45) {
		super(class_ra_sub2);
		((Class47_Sub6) this).aClass45_6789 = class45;
		((Class47_Sub6) this).aClass28_6790 = new Class28(class_ra_sub2, 2);
		((Class47_Sub6) this).aClass28_6790.method405(0);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		if (((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
		((Class47_Sub6) this).aClass28_6790.method403();
		((Class47_Sub6) this).aClass28_6790.method405(1);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		if (((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480)
			OpenGL.glDisable(3170);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
		((Class47_Sub6) this).aClass28_6790.method403();
	}

	void method505(boolean bool) {
		((Class47_Sub6) this).aClass28_6790.method404('\0');
		if (((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub6) this).aClass45_6789).aClass30_Sub4_484);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
		}
	}

	void method518(boolean bool) {
		/* empty */
	}

	void method500(Class30 class30, int i) {
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(class30);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5243(i);
	}

	void method503(int i, int i_4_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		if (bool) {
			aFloatArray6793[0] = f_6_;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = 0.0F;
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = f_6_;
			aFloatArray6793[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray6793, 0);
		aFloatArray6793[0] = 0.0F;
		aFloatArray6793[1] = f_6_;
		aFloatArray6793[2] = 0.0F;
		aFloatArray6793[3] = (float) (((Class_ra_Sub2) (((Class47_Sub6) this).aClass_ra_Sub2_491)).anInt8062) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray6793, 0);
		if (!((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			int i_7_ = (int) (f_5_ * (float) (((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062) * 16.0F);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub6) this).aClass45_6789).aClass30_Sub2Array483[i_7_ % 16]);
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = ((float) ((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062 * f_5_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6793, 0);
		}
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
	}

	void method506(boolean bool) {
		((Class47_Sub6) this).aClass28_6790.method404('\0');
		if (((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub6) this).aClass45_6789).aClass30_Sub4_484);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
		}
	}

	void method504() {
		((Class47_Sub6) this).aClass28_6790.method404('\001');
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(null);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
	}

	void method519(Class30 class30, int i) {
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(class30);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5243(i);
	}

	void method507(boolean bool) {
		((Class47_Sub6) this).aClass28_6790.method404('\0');
		if (((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub6) this).aClass45_6789).aClass30_Sub4_484);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
		}
	}

	void method508(boolean bool) {
		/* empty */
	}

	void method509(boolean bool) {
		/* empty */
	}

	void method510(boolean bool) {
		/* empty */
	}

	void method511() {
		((Class47_Sub6) this).aClass28_6790.method404('\001');
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(null);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
	}

	void method512() {
		((Class47_Sub6) this).aClass28_6790.method404('\001');
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(null);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
	}

	void method513(int i, int i_8_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_9_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_10_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		if (bool) {
			aFloatArray6793[0] = f_10_;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = 0.0F;
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = f_10_;
			aFloatArray6793[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray6793, 0);
		aFloatArray6793[0] = 0.0F;
		aFloatArray6793[1] = f_10_;
		aFloatArray6793[2] = 0.0F;
		aFloatArray6793[3] = (float) (((Class_ra_Sub2) (((Class47_Sub6) this).aClass_ra_Sub2_491)).anInt8062) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray6793, 0);
		if (!((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			int i_11_ = (int) (f_9_ * (float) (((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062) * 16.0F);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub6) this).aClass45_6789).aClass30_Sub2Array483[i_11_ % 16]);
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = ((float) ((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062 * f_9_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6793, 0);
		}
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
	}

	void method502(int i, int i_12_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_13_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_14_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		if (bool) {
			aFloatArray6793[0] = f_14_;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = 0.0F;
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = f_14_;
			aFloatArray6793[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray6793, 0);
		aFloatArray6793[0] = 0.0F;
		aFloatArray6793[1] = f_14_;
		aFloatArray6793[2] = 0.0F;
		aFloatArray6793[3] = (float) (((Class_ra_Sub2) (((Class47_Sub6) this).aClass_ra_Sub2_491)).anInt8062) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray6793, 0);
		if (!((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			int i_15_ = (int) (f_13_ * (float) (((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062) * 16.0F);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub6) this).aClass45_6789).aClass30_Sub2Array483[i_15_ % 16]);
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = ((float) ((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062 * f_13_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6793, 0);
		}
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
	}

	void method515(int i, int i_16_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_17_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_18_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		if (bool) {
			aFloatArray6793[0] = f_18_;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = 0.0F;
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = f_18_;
			aFloatArray6793[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray6793, 0);
		aFloatArray6793[0] = 0.0F;
		aFloatArray6793[1] = f_18_;
		aFloatArray6793[2] = 0.0F;
		aFloatArray6793[3] = (float) (((Class_ra_Sub2) (((Class47_Sub6) this).aClass_ra_Sub2_491)).anInt8062) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray6793, 0);
		if (!((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			int i_19_ = (int) (f_17_ * (float) (((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062) * 16.0F);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub6) this).aClass45_6789).aClass30_Sub2Array483[i_19_ % 16]);
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = ((float) ((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062 * f_17_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6793, 0);
		}
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
	}

	boolean method501() {
		return true;
	}

	void method517(int i, int i_20_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_21_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_22_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(1);
		if (bool) {
			aFloatArray6793[0] = f_22_;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = 0.0F;
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = f_22_;
			aFloatArray6793[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray6793, 0);
		aFloatArray6793[0] = 0.0F;
		aFloatArray6793[1] = f_22_;
		aFloatArray6793[2] = 0.0F;
		aFloatArray6793[3] = (float) (((Class_ra_Sub2) (((Class47_Sub6) this).aClass_ra_Sub2_491)).anInt8062) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray6793, 0);
		if (!((Class45) ((Class47_Sub6) this).aClass45_6789).aBoolean480) {
			int i_23_ = (int) (f_21_ * (float) (((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062) * 16.0F);
			((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub6) this).aClass45_6789).aClass30_Sub2Array483[i_23_ % 16]);
		} else {
			aFloatArray6793[0] = 0.0F;
			aFloatArray6793[1] = 0.0F;
			aFloatArray6793[2] = 0.0F;
			aFloatArray6793[3] = ((float) ((Class_ra_Sub2) ((Class47_Sub6) this).aClass_ra_Sub2_491).anInt8062 * f_21_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray6793, 0);
		}
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5255(0);
	}

	void method514(Class30 class30, int i) {
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5256(class30);
		((Class47_Sub6) this).aClass_ra_Sub2_491.method5243(i);
	}

	boolean method520() {
		return true;
	}
}
