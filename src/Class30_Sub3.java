/* Class30_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class30_Sub3 extends Class30 {
	int anInt6748;

	void method430(boolean bool) {
		((Class30_Sub3) this).aClass_ra_Sub2_381.method5256(this);
		OpenGL.glTexParameteri(((Class30_Sub3) this).anInt372, 10242, bool ? 10497 : 33071);
	}

	Class30_Sub3(Class_ra_Sub2 class_ra_sub2, Class55 class55, Class77 class77, int i, byte[] is, Class55 class55_0_) {
		super(class_ra_sub2, 3552, class55, class77, i, false);
		((Class30_Sub3) this).anInt6748 = i;
		((Class30_Sub3) this).aClass_ra_Sub2_381.method5256(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(((Class30_Sub3) this).anInt372, 0, Class_ra_Sub2.method5274((((Class30_Sub3) this).aClass55_377), (((Class30_Sub3) this).aClass77_378)), ((Class30_Sub3) this).anInt6748, 0, Class_ra_Sub2.method5228(class55_0_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method410(true);
	}
}
