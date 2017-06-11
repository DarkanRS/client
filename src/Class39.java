/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class39 {
	static int[] anIntArray428 = new int[1];
	Class_ra_Sub2 aClass_ra_Sub2_429;
	int anInt430;
	static int anInt431 = 34336;

	static Class39 method477(Class_ra_Sub2 class_ra_sub2, int i, String string) {
		int i_0_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_0_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray428, 0);
		if (anIntArray428[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class39(class_ra_sub2, i, i_0_);
	}

	Class39(Class_ra_Sub2 class_ra_sub2, int i, int i_1_) {
		((Class39) this).aClass_ra_Sub2_429 = class_ra_sub2;
		((Class39) this).anInt430 = i_1_;
	}
}
