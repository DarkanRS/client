
/* Class282_Sub50_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class282_Sub50_Sub19 extends Class282_Sub50 implements Interface13 {
	int anInt10278;
	Class76 aClass76_10279;
	int anInt10280;
	int anInt10281;
	Class505_Sub1 aClass505_Sub1_10282;
	static int[] anIntArray10283 = new int[1];
	int anInt10284;
	Class150 aClass150_10285;

	public void method104(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class282_Sub50_Sub19) this).anInt10278));
	}

	public int method74() {
		return ((Class282_Sub50_Sub19) this).anInt10281;
	}

	public int method1() {
		return ((Class282_Sub50_Sub19) this).anInt10280;
	}

	public int method73() {
		return ((Class282_Sub50_Sub19) this).anInt10281;
	}

	public void method103(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class282_Sub50_Sub19) this).anInt10278));
	}

	public void method26() {
		if (((Class282_Sub50_Sub19) this).anInt10278 > 0) {
			int[] is = new int[1];
			is[0] = ((Class282_Sub50_Sub19) this).anInt10278;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class282_Sub50_Sub19) this).anInt10278 = 0;
		}
	}

	void method15697() {
		if (((Class282_Sub50_Sub19) this).anInt10278 > 0) {
			((Class282_Sub50_Sub19) this).aClass505_Sub1_10282.method13707(((Class282_Sub50_Sub19) this).anInt10278, ((Class282_Sub50_Sub19) this).anInt10284);
			((Class282_Sub50_Sub19) this).anInt10278 = 0;
		}
	}

	public void finalize() throws Throwable {
		method15697();
		super.finalize();
	}

	void method15698() throws Throwable {
		method15697();
		super.finalize();
	}

	public int method75() {
		return ((Class282_Sub50_Sub19) this).anInt10280;
	}

	public int method76() {
		return ((Class282_Sub50_Sub19) this).anInt10280;
	}

	public int method39() {
		return ((Class282_Sub50_Sub19) this).anInt10281;
	}

	Class282_Sub50_Sub19(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_0_, int i_1_) {
		((Class282_Sub50_Sub19) this).aClass505_Sub1_10282 = class505_sub1;
		((Class282_Sub50_Sub19) this).anInt10280 = i;
		((Class282_Sub50_Sub19) this).anInt10281 = i_0_;
		((Class282_Sub50_Sub19) this).aClass150_10285 = class150;
		((Class282_Sub50_Sub19) this).aClass76_10279 = class76;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10283, 0);
		((Class282_Sub50_Sub19) this).anInt10278 = anIntArray10283[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class282_Sub50_Sub19) this).anInt10278);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_1_, Class505_Sub1.method13630((((Class282_Sub50_Sub19) this).aClass150_10285), (((Class282_Sub50_Sub19) this).aClass76_10279)), ((Class282_Sub50_Sub19) this).anInt10280, ((Class282_Sub50_Sub19) this).anInt10281);
		((Class282_Sub50_Sub19) this).anInt10284 = (((Class282_Sub50_Sub19) this).anInt10280 * ((Class282_Sub50_Sub19) this).anInt10281 * (((Class282_Sub50_Sub19) this).aClass150_10285.anInt1959 * 351642797) * (((Class282_Sub50_Sub19) this).aClass76_10279.anInt748 * 971905895));
	}

	Class282_Sub50_Sub19(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_2_) {
		((Class282_Sub50_Sub19) this).aClass505_Sub1_10282 = class505_sub1;
		((Class282_Sub50_Sub19) this).anInt10280 = i;
		((Class282_Sub50_Sub19) this).anInt10281 = i_2_;
		((Class282_Sub50_Sub19) this).aClass150_10285 = class150;
		((Class282_Sub50_Sub19) this).aClass76_10279 = class76;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10283, 0);
		((Class282_Sub50_Sub19) this).anInt10278 = anIntArray10283[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class282_Sub50_Sub19) this).anInt10278);
		OpenGL.glRenderbufferStorageEXT(36161, Class505_Sub1.method13630((((Class282_Sub50_Sub19) this).aClass150_10285), (((Class282_Sub50_Sub19) this).aClass76_10279)), ((Class282_Sub50_Sub19) this).anInt10280, ((Class282_Sub50_Sub19) this).anInt10281);
		((Class282_Sub50_Sub19) this).anInt10284 = (((Class282_Sub50_Sub19) this).anInt10280 * ((Class282_Sub50_Sub19) this).anInt10281 * (((Class282_Sub50_Sub19) this).aClass150_10285.anInt1959 * 351642797) * (((Class282_Sub50_Sub19) this).aClass76_10279.anInt748 * 971905895));
	}

	public void method32() {
		if (((Class282_Sub50_Sub19) this).anInt10278 > 0) {
			int[] is = new int[1];
			is[0] = ((Class282_Sub50_Sub19) this).anInt10278;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class282_Sub50_Sub19) this).anInt10278 = 0;
		}
	}

	void method15699() throws Throwable {
		method15697();
		super.finalize();
	}

	public void method100(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class282_Sub50_Sub19) this).anInt10278));
	}

	public void method99(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class282_Sub50_Sub19) this).anInt10278));
	}

	public void method101(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class282_Sub50_Sub19) this).anInt10278));
	}

	void method15700() {
		if (((Class282_Sub50_Sub19) this).anInt10278 > 0) {
			((Class282_Sub50_Sub19) this).aClass505_Sub1_10282.method13707(((Class282_Sub50_Sub19) this).anInt10278, ((Class282_Sub50_Sub19) this).anInt10284);
			((Class282_Sub50_Sub19) this).anInt10278 = 0;
		}
	}

	void method15701() {
		if (((Class282_Sub50_Sub19) this).anInt10278 > 0) {
			((Class282_Sub50_Sub19) this).aClass505_Sub1_10282.method13707(((Class282_Sub50_Sub19) this).anInt10278, ((Class282_Sub50_Sub19) this).anInt10284);
			((Class282_Sub50_Sub19) this).anInt10278 = 0;
		}
	}

	public void method102(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class282_Sub50_Sub19) this).anInt10278));
	}

	public void method105(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class282_Sub50_Sub19) this).anInt10278));
	}

	void method15702() {
		if (((Class282_Sub50_Sub19) this).anInt10278 > 0) {
			((Class282_Sub50_Sub19) this).aClass505_Sub1_10282.method13707(((Class282_Sub50_Sub19) this).anInt10278, ((Class282_Sub50_Sub19) this).anInt10284);
			((Class282_Sub50_Sub19) this).anInt10278 = 0;
		}
	}

	public int method77() {
		return ((Class282_Sub50_Sub19) this).anInt10281;
	}

	void method15703() {
		if (((Class282_Sub50_Sub19) this).anInt10278 > 0) {
			((Class282_Sub50_Sub19) this).aClass505_Sub1_10282.method13707(((Class282_Sub50_Sub19) this).anInt10278, ((Class282_Sub50_Sub19) this).anInt10284);
			((Class282_Sub50_Sub19) this).anInt10278 = 0;
		}
	}

	void method15704() {
		if (((Class282_Sub50_Sub19) this).anInt10278 > 0) {
			((Class282_Sub50_Sub19) this).aClass505_Sub1_10282.method13707(((Class282_Sub50_Sub19) this).anInt10278, ((Class282_Sub50_Sub19) this).anInt10284);
			((Class282_Sub50_Sub19) this).anInt10278 = 0;
		}
	}
}
