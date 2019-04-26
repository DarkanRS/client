import jaggl.OpenGL;

public class CacheableNode_Sub19 extends CacheableNode implements Interface13 {

	static int[] anIntArray10283 = new int[1];
	int anInt10278;
	OpenGLGraphicalRenderer aGraphicalRenderer_Sub1_10282;
	int anInt10280;
	int anInt10281;
	Class150 aClass150_10285;
	Class76 aClass76_10279;
	int anInt10284;

	public void method104(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, this.anInt10278);
	}

	public int method74() {
		return this.anInt10281;
	}

	public int method1() {
		return this.anInt10280;
	}

	public int method73() {
		return this.anInt10281;
	}

	public void method103(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, this.anInt10278);
	}

	public void method26() {
		if (this.anInt10278 > 0) {
			int[] ints_1 = new int[] { this.anInt10278 };
			OpenGL.glDeleteRenderbuffersEXT(1, ints_1, 0);
			this.anInt10278 = 0;
		}

	}

	void method15697() {
		if (this.anInt10278 > 0) {
			this.aGraphicalRenderer_Sub1_10282.method13707(this.anInt10278, this.anInt10284);
			this.anInt10278 = 0;
		}

	}

	public void finalize() throws Throwable {
		this.method15697();
		super.finalize();
	}

	public int method75() {
		return this.anInt10280;
	}

	public int method76() {
		return this.anInt10280;
	}

	public int method39() {
		return this.anInt10281;
	}

	CacheableNode_Sub19(OpenGLGraphicalRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5, int i_6) {
		this.aGraphicalRenderer_Sub1_10282 = class505_sub1_1;
		this.anInt10280 = i_4;
		this.anInt10281 = i_5;
		this.aClass150_10285 = class150_2;
		this.aClass76_10279 = class76_3;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10283, 0);
		this.anInt10278 = anIntArray10283[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10278);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_6, OpenGLGraphicalRenderer.method13630(this.aClass150_10285, this.aClass76_10279), this.anInt10280, this.anInt10281);
		this.anInt10284 = this.aClass150_10285.anInt1959 * this.aClass76_10279.anInt748 * this.anInt10280 * this.anInt10281;
	}

	CacheableNode_Sub19(OpenGLGraphicalRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
		this.aGraphicalRenderer_Sub1_10282 = class505_sub1_1;
		this.anInt10280 = i_4;
		this.anInt10281 = i_5;
		this.aClass150_10285 = class150_2;
		this.aClass76_10279 = class76_3;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10283, 0);
		this.anInt10278 = anIntArray10283[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10278);
		OpenGL.glRenderbufferStorageEXT(36161, OpenGLGraphicalRenderer.method13630(this.aClass150_10285, this.aClass76_10279), this.anInt10280, this.anInt10281);
		this.anInt10284 = this.aClass150_10285.anInt1959 * this.aClass76_10279.anInt748 * this.anInt10280 * this.anInt10281;
	}

	public void method32() {
		if (this.anInt10278 > 0) {
			int[] ints_1 = new int[] { this.anInt10278 };
			OpenGL.glDeleteRenderbuffersEXT(1, ints_1, 0);
			this.anInt10278 = 0;
		}

	}

	public void method100(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, this.anInt10278);
	}

	public void method99(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, this.anInt10278);
	}

	public void method101(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, this.anInt10278);
	}

	public void method102(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, this.anInt10278);
	}

	public void method105(int i_1) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, this.anInt10278);
	}

	public int method77() {
		return this.anInt10281;
	}

}
