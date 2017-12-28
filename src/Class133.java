
/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class133 {
	int anInt1596;
	Class505_Sub1 aClass505_Sub1_1597;
	static final int anInt1598 = 34336;
	static int[] anIntArray1599 = new int[1];

	Class133(Class505_Sub1 class505_sub1, int i, int i_0_) {
		((Class133) this).aClass505_Sub1_1597 = class505_sub1;
		((Class133) this).anInt1596 = i_0_;
	}

	static Class133 method2320(Class505_Sub1 class505_sub1, int i, String string) {
		int i_1_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_1_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1599, 0);
		if (anIntArray1599[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class133(class505_sub1, i, i_1_);
	}

	public void finalize() throws Throwable {
		((Class133) this).aClass505_Sub1_1597.method13628(((Class133) this).anInt1596);
		super.finalize();
	}

	static Class133 method2321(Class505_Sub1 class505_sub1, int i, String string) {
		int i_2_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_2_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1599, 0);
		if (anIntArray1599[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class133(class505_sub1, i, i_2_);
	}

	void method2322() throws Throwable {
		((Class133) this).aClass505_Sub1_1597.method13628(((Class133) this).anInt1596);
		super.finalize();
	}

	void method2323() throws Throwable {
		((Class133) this).aClass505_Sub1_1597.method13628(((Class133) this).anInt1596);
		super.finalize();
	}

	static Class133 method2324(Class505_Sub1 class505_sub1, int i, String string) {
		int i_3_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_3_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1599, 0);
		if (anIntArray1599[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class133(class505_sub1, i, i_3_);
	}

	static Class133 method2325(Class505_Sub1 class505_sub1, int i, String string) {
		int i_4_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_4_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1599, 0);
		if (anIntArray1599[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class133(class505_sub1, i, i_4_);
	}

	static Class133 method2326(Class505_Sub1 class505_sub1, int i, String string) {
		int i_5_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_5_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1599, 0);
		if (anIntArray1599[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class133(class505_sub1, i, i_5_);
	}
}
