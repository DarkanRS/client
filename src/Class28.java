/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class28 {
	int anInt364;

	void method403() {
		OpenGL.glEndList();
	}

	void method404(char c) {
		OpenGL.glCallList(((Class28) this).anInt364 + c);
	}

	void method405(int i) {
		OpenGL.glNewList(((Class28) this).anInt364 + i, 4864);
	}

	Class28(Class_ra_Sub2 class_ra_sub2, int i) {
		((Class28) this).anInt364 = OpenGL.glGenLists(i);
	}
}
