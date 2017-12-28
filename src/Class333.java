
/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class333 implements Interface9, Interface8, Interface28 {
	int anInt3877;
	Class76 aClass76_3878;
	int anInt3879;
	Class150 aClass150_3880;
	Class505_Sub2_Sub1 aClass505_Sub2_Sub1_3881;
	int anInt3882;

	public void finalize() throws Throwable {
		method5931();
		super.finalize();
	}

	public int method1() {
		return ((Class333) this).anInt3877;
	}

	public int method74() {
		return ((Class333) this).anInt3879;
	}

	void method5931() {
		if (((Class333) this).anInt3882 > 0) {
			((Class333) this).aClass505_Sub2_Sub1_3881.method15572(((Class333) this).anInt3882, (((Class333) this).anInt3877 * ((Class333) this).anInt3879 * (((Class333) this).aClass76_3878.anInt748 * 971905895) * (((Class333) this).aClass150_3880.anInt1959 * 351642797)));
			((Class333) this).anInt3882 = 0;
		}
	}

	public void method26() {
		if (((Class333) this).anInt3882 > 0) {
			int[] is = new int[1];
			is[0] = ((Class333) this).anInt3882;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class333) this).anInt3882 = 0;
		}
	}

	public int method73() {
		return ((Class333) this).anInt3879;
	}

	public int method75() {
		return ((Class333) this).anInt3877;
	}

	Class333(Class505_Sub2_Sub1 class505_sub2_sub1, Class150 class150, Class76 class76, int i, int i_0_) {
		((Class333) this).aClass150_3880 = class150;
		((Class333) this).aClass76_3878 = class76;
		((Class333) this).anInt3877 = i;
		((Class333) this).anInt3879 = i_0_;
		((Class333) this).aClass505_Sub2_Sub1_3881 = class505_sub2_sub1;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		((Class333) this).anInt3882 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class333) this).anInt3882);
		OpenGL.glRenderbufferStorageEXT(36161, Class505_Sub2_Sub1.method15574(((Class333) this).aClass150_3880, ((Class333) this).aClass76_3878), i, i_0_);
	}

	public int method76() {
		return ((Class333) this).anInt3877;
	}

	public int method39() {
		return ((Class333) this).anInt3879;
	}

	void method5932() throws Throwable {
		method5931();
		super.finalize();
	}

	public void method99(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class333) this).anInt3882);
	}

	public void method32() {
		if (((Class333) this).anInt3882 > 0) {
			int[] is = new int[1];
			is[0] = ((Class333) this).anInt3882;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class333) this).anInt3882 = 0;
		}
	}

	public int method77() {
		return ((Class333) this).anInt3879;
	}

	void method5933() throws Throwable {
		method5931();
		super.finalize();
	}

	public void method104(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class333) this).anInt3882);
	}

	void method5934() {
		if (((Class333) this).anInt3882 > 0) {
			((Class333) this).aClass505_Sub2_Sub1_3881.method15572(((Class333) this).anInt3882, (((Class333) this).anInt3877 * ((Class333) this).anInt3879 * (((Class333) this).aClass76_3878.anInt748 * 971905895) * (((Class333) this).aClass150_3880.anInt1959 * 351642797)));
			((Class333) this).anInt3882 = 0;
		}
	}

	void method5935() {
		if (((Class333) this).anInt3882 > 0) {
			((Class333) this).aClass505_Sub2_Sub1_3881.method15572(((Class333) this).anInt3882, (((Class333) this).anInt3877 * ((Class333) this).anInt3879 * (((Class333) this).aClass76_3878.anInt748 * 971905895) * (((Class333) this).aClass150_3880.anInt1959 * 351642797)));
			((Class333) this).anInt3882 = 0;
		}
	}

	void method5936() {
		if (((Class333) this).anInt3882 > 0) {
			((Class333) this).aClass505_Sub2_Sub1_3881.method15572(((Class333) this).anInt3882, (((Class333) this).anInt3877 * ((Class333) this).anInt3879 * (((Class333) this).aClass76_3878.anInt748 * 971905895) * (((Class333) this).aClass150_3880.anInt1959 * 351642797)));
			((Class333) this).anInt3882 = 0;
		}
	}
}
