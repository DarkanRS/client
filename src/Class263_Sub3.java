/* Class263_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class263_Sub3 extends Class263 implements Interface9_Impl1 {
	static int anInt8636 = 34069;

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public void method128() {
		super.method128();
	}

	public void x() {
		super.b();
	}

	public void b() {
		super.b();
	}

	public void d() {
		super.b();
	}

	Class263_Sub3(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, int i, boolean bool, int[][] is) {
		super(class_ra_sub3_sub1, 34067, Class55.aClass55_557, Class77.aClass77_717, i * i * 6, bool);
		((Class263_Sub3) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		if (bool) {
			for (int i_0_ = 0; i_0_ < 6; i_0_++)
				method2468(34069 + i_0_, i, i, is[i_0_]);
		} else {
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				OpenGL.glTexImage2Di(34069 + i_1_, 0, Class_ra_Sub3_Sub1.method5533((((Class263_Sub3) this).aClass55_6419), (((Class263_Sub3) this).aClass77_6420)), i, i, 0, Class_ra_Sub3_Sub1.method5532(((Class263_Sub3) this).aClass55_6419), (((Class_ra_Sub3_Sub1) ((Class263_Sub3) this).aClass_ra_Sub3_Sub1_6422).anInt9841), is[i_1_], 0);
		}
	}

	public void u() {
		super.b();
	}

	public void method125() {
		super.method128();
	}

	public void method126() {
		super.method128();
	}

	public void method123() {
		super.method128();
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}
}
