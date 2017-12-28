
/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class314 implements Interface28 {
	Class319_Sub3 aClass319_Sub3_3666;
	int anInt3667;

	public void method32() {
		/* empty */
	}

	public int method1() {
		return ((Class314) this).aClass319_Sub3_3666.method1();
	}

	public int method74() {
		return ((Class314) this).aClass319_Sub3_3666.method59();
	}

	public int method73() {
		return ((Class314) this).aClass319_Sub3_3666.method59();
	}

	public void method26() {
		/* empty */
	}

	public int method75() {
		return ((Class314) this).aClass319_Sub3_3666.method1();
	}

	public int method39() {
		return ((Class314) this).aClass319_Sub3_3666.method59();
	}

	public int method76() {
		return ((Class314) this).aClass319_Sub3_3666.method1();
	}

	Class314(Class319_Sub3 class319_sub3, int i) {
		((Class314) this).anInt3667 = i;
		((Class314) this).aClass319_Sub3_3666 = class319_sub3;
	}

	public int method77() {
		return ((Class314) this).aClass319_Sub3_3666.method59();
	}

	public void method99(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class319_Sub3) ((Class314) this).aClass319_Sub3_3666).anInt3707, ((Class319_Sub3) ((Class314) this).aClass319_Sub3_3666).anInt3706, ((Class314) this).anInt3667);
	}

	public void method104(int i) {
		OpenGL.glFramebufferTexture2DEXT(36160, i, ((Class319_Sub3) ((Class314) this).aClass319_Sub3_3666).anInt3707, ((Class319_Sub3) ((Class314) this).aClass319_Sub3_3666).anInt3706, ((Class314) this).anInt3667);
	}
}
