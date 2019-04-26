import jaggl.OpenGL;

public class Class137_Sub4 extends Class137 {

	int anInt9116;
	int anInt9117;
	int anInt9118;

	Class137_Sub4(OpenGLGraphicalRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3) {
		super(class505_sub1_1, 32879, class150_2, class76_3, 128 * 128 * 16, false);
		this.anInt9116 = 128;
		this.anInt9117 = 128;
		this.anInt9118 = 16;
		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		OpenGL.glTexImage3Dub(this.anInt1648, 0, OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651), this.anInt9116, this.anInt9117, this.anInt9118, 0, OpenGLGraphicalRenderer.method13629(this.aClass150_1650), 5121, (byte[]) null, 0);
		this.method2351(true);
	}

	Class137_Sub4(OpenGLGraphicalRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3, byte[] bytes_7, Class150 class150_8) {
		super(class505_sub1_1, 32879, class150_2, class76_3, 128 * 128 * 16, false);
		this.anInt9116 = 128;
		this.anInt9117 = 128;
		this.anInt9118 = 16;
		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt1648, 0, OpenGLGraphicalRenderer.method13630(this.aClass150_1650, this.aClass76_1651), this.anInt9116, this.anInt9117, this.anInt9118, 0, OpenGLGraphicalRenderer.method13629(class150_8), 5121, bytes_7, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method2351(true);
	}

	void method14465(int i_3, int i_4, int i_5) {
		this.aGraphicalRenderer_Sub1_1646.method13654(this);
		OpenGL.glCopyTexSubImage3D(this.anInt1648, 0, 0, 0, i_3, 0, 0, i_4, i_5);
		OpenGL.glFlush();
	}

}
