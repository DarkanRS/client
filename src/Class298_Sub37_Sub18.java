/* Class298_Sub37_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class298_Sub37_Sub18 extends Class298_Sub37 implements Interface8_Impl1_Impl1_Impl2 {
	int anInt10024;
	int anInt10025;
	int anInt10026;
	static int[] anIntArray10027 = new int[1];
	Class77 aClass77_10028;
	Class55 aClass55_10029;
	int anInt10030;
	Class_ra_Sub2 aClass_ra_Sub2_10031;

	public int f() {
		return ((Class298_Sub37_Sub18) this).anInt10025;
	}

	public void method1(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class298_Sub37_Sub18) this).anInt10024));
	}

	public int a() {
		return ((Class298_Sub37_Sub18) this).anInt10026;
	}

	public void method3(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class298_Sub37_Sub18) this).anInt10024));
	}

	public void b() {
		if (((Class298_Sub37_Sub18) this).anInt10024 > 0) {
			int[] is = new int[1];
			is[0] = ((Class298_Sub37_Sub18) this).anInt10024;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class298_Sub37_Sub18) this).anInt10024 = 0;
		}
	}

	void method3491() {
		if (((Class298_Sub37_Sub18) this).anInt10024 > 0) {
			((Class298_Sub37_Sub18) this).aClass_ra_Sub2_10031.method5268(((Class298_Sub37_Sub18) this).anInt10024, ((Class298_Sub37_Sub18) this).anInt10030);
			((Class298_Sub37_Sub18) this).anInt10024 = 0;
		}
	}

	public int p() {
		return ((Class298_Sub37_Sub18) this).anInt10026;
	}

	public int i() {
		return ((Class298_Sub37_Sub18) this).anInt10026;
	}

	Class298_Sub37_Sub18(Class_ra_Sub2 class_ra_sub2, Class55 class55, Class77 class77, int i, int i_0_, int i_1_) {
		((Class298_Sub37_Sub18) this).aClass_ra_Sub2_10031 = class_ra_sub2;
		((Class298_Sub37_Sub18) this).anInt10026 = i;
		((Class298_Sub37_Sub18) this).anInt10025 = i_0_;
		((Class298_Sub37_Sub18) this).aClass55_10029 = class55;
		((Class298_Sub37_Sub18) this).aClass77_10028 = class77;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10027, 0);
		((Class298_Sub37_Sub18) this).anInt10024 = anIntArray10027[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class298_Sub37_Sub18) this).anInt10024);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_1_, Class_ra_Sub2.method5274((((Class298_Sub37_Sub18) this).aClass55_10029), (((Class298_Sub37_Sub18) this).aClass77_10028)), ((Class298_Sub37_Sub18) this).anInt10026, ((Class298_Sub37_Sub18) this).anInt10025);
		((Class298_Sub37_Sub18) this).anInt10030 = (((Class298_Sub37_Sub18) this).anInt10026 * ((Class298_Sub37_Sub18) this).anInt10025 * (((Class298_Sub37_Sub18) this).aClass55_10029.anInt556 * 845115459) * (((Class298_Sub37_Sub18) this).aClass77_10028.anInt724 * 685647847));
	}

	public void d() {
		if (((Class298_Sub37_Sub18) this).anInt10024 > 0) {
			int[] is = new int[1];
			is[0] = ((Class298_Sub37_Sub18) this).anInt10024;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class298_Sub37_Sub18) this).anInt10024 = 0;
		}
	}

	public void u() {
		if (((Class298_Sub37_Sub18) this).anInt10024 > 0) {
			int[] is = new int[1];
			is[0] = ((Class298_Sub37_Sub18) this).anInt10024;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class298_Sub37_Sub18) this).anInt10024 = 0;
		}
	}

	public void x() {
		if (((Class298_Sub37_Sub18) this).anInt10024 > 0) {
			int[] is = new int[1];
			is[0] = ((Class298_Sub37_Sub18) this).anInt10024;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class298_Sub37_Sub18) this).anInt10024 = 0;
		}
	}

	public void method2(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class298_Sub37_Sub18) this).anInt10024));
	}

	public int k() {
		return ((Class298_Sub37_Sub18) this).anInt10025;
	}

	public void method4(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class298_Sub37_Sub18) this).anInt10024));
	}

	Class298_Sub37_Sub18(Class_ra_Sub2 class_ra_sub2, Class55 class55, Class77 class77, int i, int i_2_) {
		((Class298_Sub37_Sub18) this).aClass_ra_Sub2_10031 = class_ra_sub2;
		((Class298_Sub37_Sub18) this).anInt10026 = i;
		((Class298_Sub37_Sub18) this).anInt10025 = i_2_;
		((Class298_Sub37_Sub18) this).aClass55_10029 = class55;
		((Class298_Sub37_Sub18) this).aClass77_10028 = class77;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10027, 0);
		((Class298_Sub37_Sub18) this).anInt10024 = anIntArray10027[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class298_Sub37_Sub18) this).anInt10024);
		OpenGL.glRenderbufferStorageEXT(36161, Class_ra_Sub2.method5274((((Class298_Sub37_Sub18) this).aClass55_10029), (((Class298_Sub37_Sub18) this).aClass77_10028)), ((Class298_Sub37_Sub18) this).anInt10026, ((Class298_Sub37_Sub18) this).anInt10025);
		((Class298_Sub37_Sub18) this).anInt10030 = (((Class298_Sub37_Sub18) this).anInt10026 * ((Class298_Sub37_Sub18) this).anInt10025 * (((Class298_Sub37_Sub18) this).aClass55_10029.anInt556 * 845115459) * (((Class298_Sub37_Sub18) this).aClass77_10028.anInt724 * 685647847));
	}
}
