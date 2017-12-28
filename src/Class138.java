
/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138 {
	int anInt1655;

	void method2379(char c) {
		OpenGL.glCallList(((Class138) this).anInt1655 + c);
	}

	void method2380(int i) {
		OpenGL.glNewList(((Class138) this).anInt1655 + i, 4864);
	}

	void method2381() {
		OpenGL.glEndList();
	}

	void method2382(char c) {
		OpenGL.glCallList(((Class138) this).anInt1655 + c);
	}

	void method2383(int i) {
		OpenGL.glNewList(((Class138) this).anInt1655 + i, 4864);
	}

	void method2384(int i) {
		OpenGL.glNewList(((Class138) this).anInt1655 + i, 4864);
	}

	void method2385() {
		OpenGL.glEndList();
	}

	void method2386() {
		OpenGL.glEndList();
	}

	void method2387(char c) {
		OpenGL.glCallList(((Class138) this).anInt1655 + c);
	}

	Class138(Class505_Sub1 class505_sub1, int i) {
		((Class138) this).anInt1655 = OpenGL.glGenLists(i);
	}
}
