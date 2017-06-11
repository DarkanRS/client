/* Class263_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class263_Sub2 extends Class263 implements Interface9_Impl3 {
	int anInt8633;
	int anInt8634;
	int anInt8635;

	Class263_Sub2(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Class55 class55, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class_ra_sub3_sub1, 32879, class55, Class77.aClass77_717, i * i_0_ * i_1_, bool);
		((Class263_Sub2) this).anInt8634 = i;
		((Class263_Sub2) this).anInt8635 = i_0_;
		((Class263_Sub2) this).anInt8633 = i_1_;
		((Class263_Sub2) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(((Class263_Sub2) this).anInt6415, 0, (Class_ra_Sub3_Sub1.method5533(((Class263_Sub2) this).aClass55_6419, ((Class263_Sub2) this).aClass77_6420)), ((Class263_Sub2) this).anInt8634, ((Class263_Sub2) this).anInt8635, ((Class263_Sub2) this).anInt8633, 0, Class_ra_Sub3_Sub1.method5532(((Class263_Sub2) this).aClass55_6419), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (bool)
			method103();
	}

	public void method128() {
		super.method128();
	}

	public void u() {
		super.b();
	}

	public void b() {
		super.b();
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}

	public void d() {
		super.b();
	}

	public void x() {
		super.b();
	}

	public void method125() {
		super.method128();
	}

	public void method126() {
		super.method128();
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public void method123() {
		super.method128();
	}
}
