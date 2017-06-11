/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class33 implements Interface8_Impl1_Impl1_Impl2 {
	int anInt10161;
	int anInt10162;
	Class30_Sub1 aClass30_Sub1_10163;

	Class33(Class30_Sub1 class30_sub1, int i, int i_0_) {
		((Class33) this).anInt10162 = i_0_;
		((Class33) this).aClass30_Sub1_10163 = class30_sub1;
		((Class33) this).anInt10161 = i;
	}

	public void method1(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class33) this).anInt10161, ((Class30_Sub1) (((Class33) this).aClass30_Sub1_10163)).anInt376, ((Class33) this).anInt10162);
	}

	public int i() {
		return ((Class30_Sub1) ((Class33) this).aClass30_Sub1_10163).anInt6745;
	}

	public void method3(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class33) this).anInt10161, ((Class30_Sub1) (((Class33) this).aClass30_Sub1_10163)).anInt376, ((Class33) this).anInt10162);
	}

	public void b() {
		/* empty */
	}

	public int p() {
		return ((Class30_Sub1) ((Class33) this).aClass30_Sub1_10163).anInt6745;
	}

	public int f() {
		return ((Class30_Sub1) ((Class33) this).aClass30_Sub1_10163).anInt6745;
	}

	public int k() {
		return ((Class30_Sub1) ((Class33) this).aClass30_Sub1_10163).anInt6745;
	}

	public void d() {
		/* empty */
	}

	public void u() {
		/* empty */
	}

	public void x() {
		/* empty */
	}

	public void method2(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class33) this).anInt10161, ((Class30_Sub1) (((Class33) this).aClass30_Sub1_10163)).anInt376, ((Class33) this).anInt10162);
	}

	public int a() {
		return ((Class30_Sub1) ((Class33) this).aClass30_Sub1_10163).anInt6745;
	}

	public void method4(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class33) this).anInt10161, ((Class30_Sub1) (((Class33) this).aClass30_Sub1_10163)).anInt376, ((Class33) this).anInt10162);
	}
}
