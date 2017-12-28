
/* Class137_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class137_Sub3 extends Class137 {
	int anInt9105;

	void method14459(boolean bool) {
		((Class137_Sub3) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glTexParameteri(((Class137_Sub3) this).anInt1648, 10242, bool ? 10497 : 33071);
	}

	void method14460(boolean bool) {
		((Class137_Sub3) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glTexParameteri(((Class137_Sub3) this).anInt1648, 10242, bool ? 10497 : 33071);
	}

	void method14461(boolean bool) {
		((Class137_Sub3) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glTexParameteri(((Class137_Sub3) this).anInt1648, 10242, bool ? 10497 : 33071);
	}

	void method14462(boolean bool) {
		((Class137_Sub3) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glTexParameteri(((Class137_Sub3) this).anInt1648, 10242, bool ? 10497 : 33071);
	}

	Class137_Sub3(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, byte[] is, Class150 class150_0_) {
		super(class505_sub1, 3552, class150, class76, i, false);
		((Class137_Sub3) this).anInt9105 = i;
		((Class137_Sub3) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(((Class137_Sub3) this).anInt1648, 0, Class505_Sub1.method13630((((Class137_Sub3) this).aClass150_1650), (((Class137_Sub3) this).aClass76_1651)), ((Class137_Sub3) this).anInt9105, 0, Class505_Sub1.method13629(class150_0_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method2351(true);
	}
}
