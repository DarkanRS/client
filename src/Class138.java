import jaggl.OpenGL;

public class Class138 {

	int anInt1655;

	void method2379(char var_1) {
		OpenGL.glCallList(this.anInt1655 + var_1);
	}

	void method2380(int i_1) {
		OpenGL.glNewList(this.anInt1655 + i_1, 4864);
	}

	void method2381() {
		OpenGL.glEndList();
	}

	Class138(OpenGLGraphicalRenderer class505_sub1_1, int i_2) {
		this.anInt1655 = OpenGL.glGenLists(i_2);
	}

}
