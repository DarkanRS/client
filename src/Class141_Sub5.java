
/* Class141_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141_Sub5 extends Class141 {
	Class136 aClass136_9080;
	static final char aChar9081 = '\001';
	Class138 aClass138_9082;
	static final char aChar9083 = '\0';
	static float[] aFloatArray9084 = new float[4];

	void method2409(int i, int i_0_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
		if (bool) {
			aFloatArray9084[0] = f_2_;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_2_;
			aFloatArray9084[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_2_;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = (float) (((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!((Class136) ((Class141_Sub5) this).aClass136_9080).aBool1631) {
			int i_3_ = (int) (f_1_ * (float) (((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368) * 16.0F);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub5) this).aClass136_9080).aClass137_Sub1Array1634[i_3_ % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = ((float) ((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368 * f_1_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
	}

	boolean method2395() {
		return true;
	}

	void method2408(boolean bool) {
		/* empty */
	}

	void method2397(boolean bool) {
		((Class141_Sub5) this).aClass138_9082.method2379('\0');
		if (((Class136) ((Class141_Sub5) this).aClass136_9080).aBool1631) {
			((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub5) this).aClass136_9080).aClass137_Sub4_1636);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	boolean method2401() {
		return true;
	}

	Class141_Sub5(Class505_Sub1 class505_sub1, Class136 class136) {
		super(class505_sub1);
		((Class141_Sub5) this).aClass136_9080 = class136;
		((Class141_Sub5) this).aClass138_9082 = new Class138(class505_sub1, 2);
		((Class141_Sub5) this).aClass138_9082.method2380(0);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
		if (((Class136) ((Class141_Sub5) this).aClass136_9080).aBool1631) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
		((Class141_Sub5) this).aClass138_9082.method2381();
		((Class141_Sub5) this).aClass138_9082.method2380(1);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
		if (((Class136) ((Class141_Sub5) this).aClass136_9080).aBool1631)
			OpenGL.glDisable(3170);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
		((Class141_Sub5) this).aClass138_9082.method2381();
	}

	void method2394(Class137 class137, int i) {
		((Class141_Sub5) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2414(Class137 class137, int i) {
		((Class141_Sub5) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2402(boolean bool) {
		((Class141_Sub5) this).aClass138_9082.method2379('\0');
		if (((Class136) ((Class141_Sub5) this).aClass136_9080).aBool1631) {
			((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub5) this).aClass136_9080).aClass137_Sub4_1636);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2403(boolean bool) {
		((Class141_Sub5) this).aClass138_9082.method2379('\0');
		if (((Class136) ((Class141_Sub5) this).aClass136_9080).aBool1631) {
			((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub5) this).aClass136_9080).aClass137_Sub4_1636);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2398() {
		((Class141_Sub5) this).aClass138_9082.method2379('\001');
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13654(null);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
	}

	void method2405(boolean bool) {
		/* empty */
	}

	void method2406(boolean bool) {
		/* empty */
	}

	void method2407(boolean bool) {
		/* empty */
	}

	void method2411() {
		((Class141_Sub5) this).aClass138_9082.method2379('\001');
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13654(null);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
	}

	void method2399(int i, int i_4_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
		if (bool) {
			aFloatArray9084[0] = f_6_;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_6_;
			aFloatArray9084[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_6_;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = (float) (((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!((Class136) ((Class141_Sub5) this).aClass136_9080).aBool1631) {
			int i_7_ = (int) (f_5_ * (float) (((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368) * 16.0F);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub5) this).aClass136_9080).aClass137_Sub1Array1634[i_7_ % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = ((float) ((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368 * f_5_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
	}

	void method2396(int i, int i_8_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_9_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_10_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
		if (bool) {
			aFloatArray9084[0] = f_10_;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_10_;
			aFloatArray9084[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_10_;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = (float) (((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!((Class136) ((Class141_Sub5) this).aClass136_9080).aBool1631) {
			int i_11_ = (int) (f_9_ * (float) (((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368) * 16.0F);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub5) this).aClass136_9080).aClass137_Sub1Array1634[i_11_ % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = ((float) ((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368 * f_9_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
	}

	void method2410(int i, int i_12_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_13_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_14_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(1);
		if (bool) {
			aFloatArray9084[0] = f_14_;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = 0.0F;
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = f_14_;
			aFloatArray9084[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray9084, 0);
		aFloatArray9084[0] = 0.0F;
		aFloatArray9084[1] = f_14_;
		aFloatArray9084[2] = 0.0F;
		aFloatArray9084[3] = (float) (((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray9084, 0);
		if (!((Class136) ((Class141_Sub5) this).aClass136_9080).aBool1631) {
			int i_15_ = (int) (f_13_ * (float) (((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368) * 16.0F);
			((Class141_Sub5) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub5) this).aClass136_9080).aClass137_Sub1Array1634[i_15_ % 16]);
		} else {
			aFloatArray9084[0] = 0.0F;
			aFloatArray9084[1] = 0.0F;
			aFloatArray9084[2] = 0.0F;
			aFloatArray9084[3] = ((float) ((Class505_Sub1) (((Class141_Sub5) this).aClass505_Sub1_1664)).anInt8368 * f_13_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9084, 0);
		}
		((Class141_Sub5) this).aClass505_Sub1_1664.method13610(0);
	}

	void method2404(boolean bool) {
		/* empty */
	}

	void method2412(Class137 class137, int i) {
		((Class141_Sub5) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2413(Class137 class137, int i) {
		((Class141_Sub5) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2400(Class137 class137, int i) {
		((Class141_Sub5) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub5) this).aClass505_Sub1_1664.method13612(i);
	}
}
