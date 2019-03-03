import jaggl.OpenGL;

public class Class133 {

	static int[] anIntArray1599 = new int[1];
	OpenGLGraphicalRenderer aClass505_Sub1_1597;
	int anInt1596;

	Class133(OpenGLGraphicalRenderer class505_sub1_1, int i_2, int i_3) {
		this.aClass505_Sub1_1597 = class505_sub1_1;
		this.anInt1596 = i_3;
	}

	public void finalize() throws Throwable {
		this.aClass505_Sub1_1597.method13628(this.anInt1596);
		super.finalize();
	}

	static Class133 method2321(OpenGLGraphicalRenderer class505_sub1_0, int i_1, String string_2) {
		int i_3 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i_1, i_3);
		OpenGL.glProgramStringARB(i_1, 34933, string_2);
		OpenGL.glGetIntegerv(34379, anIntArray1599, 0);
		if (anIntArray1599[0] != -1) {
			OpenGL.glBindProgramARB(i_1, 0);
			return null;
		} else {
			OpenGL.glBindProgramARB(i_1, 0);
			return new Class133(class505_sub1_0, i_1, i_3);
		}
	}

}
