/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class262 implements Interface8_Impl1_Impl1, Interface8_Impl1_Impl2, Interface8_Impl1_Impl1_Impl3 {
	int anInt10155;
	Class55 aClass55_10156;
	Class77 aClass77_10157;
	int anInt10158;
	Class_ra_Sub3_Sub1 aClass_ra_Sub3_Sub1_10159;
	int anInt10160;

	public int a() {
		return ((Class262) this).anInt10158;
	}

	public void method168(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class262) this).anInt10155);
	}

	public void method167(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class262) this).anInt10155);
	}

	public void b() {
		if (((Class262) this).anInt10155 > 0) {
			int[] is = new int[1];
			is[0] = ((Class262) this).anInt10155;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class262) this).anInt10155 = 0;
		}
	}

	void method2466() {
		if (((Class262) this).anInt10155 > 0) {
			((Class262) this).aClass_ra_Sub3_Sub1_10159.method5530(((Class262) this).anInt10155, (((Class262) this).anInt10158 * ((Class262) this).anInt10160 * (((Class262) this).aClass77_10157.anInt724 * 685647847) * (((Class262) this).aClass55_10156.anInt556 * 845115459)));
			((Class262) this).anInt10155 = 0;
		}
	}

	public void method165(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class262) this).anInt10155);
	}

	public int p() {
		return ((Class262) this).anInt10158;
	}

	public int i() {
		return ((Class262) this).anInt10158;
	}

	public int k() {
		return ((Class262) this).anInt10160;
	}

	public void u() {
		if (((Class262) this).anInt10155 > 0) {
			int[] is = new int[1];
			is[0] = ((Class262) this).anInt10155;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class262) this).anInt10155 = 0;
		}
	}

	public void x() {
		if (((Class262) this).anInt10155 > 0) {
			int[] is = new int[1];
			is[0] = ((Class262) this).anInt10155;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class262) this).anInt10155 = 0;
		}
	}

	public void d() {
		if (((Class262) this).anInt10155 > 0) {
			int[] is = new int[1];
			is[0] = ((Class262) this).anInt10155;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class262) this).anInt10155 = 0;
		}
	}

	public int f() {
		return ((Class262) this).anInt10160;
	}

	public void method166(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class262) this).anInt10155);
	}

	public void method164(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class262) this).anInt10155);
	}

	Class262(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Class55 class55, Class77 class77, int i, int i_0_) {
		((Class262) this).aClass55_10156 = class55;
		((Class262) this).aClass77_10157 = class77;
		((Class262) this).anInt10158 = i;
		((Class262) this).anInt10160 = i_0_;
		((Class262) this).aClass_ra_Sub3_Sub1_10159 = class_ra_sub3_sub1;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		((Class262) this).anInt10155 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class262) this).anInt10155);
		OpenGL.glRenderbufferStorageEXT(36161, Class_ra_Sub3_Sub1.method5533(((Class262) this).aClass55_10156, ((Class262) this).aClass77_10157), i, i_0_);
	}
}
